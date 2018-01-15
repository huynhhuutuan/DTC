package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.v4.media.TransportMediator;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.zzme;
import com.google.android.gms.internal.zzqf;

@zzme
class zzx implements SensorEventListener {
    private final SensorManager zzOo;
    private final Object zzOp = new Object();
    private final Display zzOq;
    private final float[] zzOr = new float[9];
    private final float[] zzOs = new float[9];
    private float[] zzOt;
    private Handler zzOu;
    private zza zzOv;

    class C03531 implements Runnable {
        C03531(zzx com_google_android_gms_ads_internal_overlay_zzx) {
        }

        public void run() {
            Looper.myLooper().quit();
        }
    }

    interface zza {
        void zzhJ();
    }

    zzx(Context context) {
        this.zzOo = (SensorManager) context.getSystemService("sensor");
        this.zzOq = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    private void zzi(int i, int i2) {
        float f = this.zzOs[i];
        this.zzOs[i] = this.zzOs[i2];
        this.zzOs[i2] = f;
    }

    int getRotation() {
        return this.zzOq.getRotation();
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        zza(sensorEvent.values);
    }

    void start() {
        if (this.zzOu == null) {
            Sensor defaultSensor = this.zzOo.getDefaultSensor(11);
            if (defaultSensor == null) {
                zzqf.m9e("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            this.zzOu = new Handler(handlerThread.getLooper());
            if (!this.zzOo.registerListener(this, defaultSensor, 0, this.zzOu)) {
                zzqf.m9e("SensorManager.registerListener failed.");
                stop();
            }
        }
    }

    void stop() {
        if (this.zzOu != null) {
            this.zzOo.unregisterListener(this);
            this.zzOu.post(new C03531(this));
            this.zzOu = null;
        }
    }

    void zza(zza com_google_android_gms_ads_internal_overlay_zzx_zza) {
        this.zzOv = com_google_android_gms_ads_internal_overlay_zzx_zza;
    }

    void zza(float[] fArr) {
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.zzOp) {
                if (this.zzOt == null) {
                    this.zzOt = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.zzOr, fArr);
            switch (getRotation()) {
                case 1:
                    SensorManager.remapCoordinateSystem(this.zzOr, 2, 129, this.zzOs);
                    break;
                case 2:
                    SensorManager.remapCoordinateSystem(this.zzOr, 129, TransportMediator.KEYCODE_MEDIA_RECORD, this.zzOs);
                    break;
                case 3:
                    SensorManager.remapCoordinateSystem(this.zzOr, TransportMediator.KEYCODE_MEDIA_RECORD, 1, this.zzOs);
                    break;
                default:
                    System.arraycopy(this.zzOr, 0, this.zzOs, 0, 9);
                    break;
            }
            zzi(1, 3);
            zzi(2, 6);
            zzi(5, 7);
            synchronized (this.zzOp) {
                System.arraycopy(this.zzOs, 0, this.zzOt, 0, 9);
            }
            if (this.zzOv != null) {
                this.zzOv.zzhJ();
            }
        }
    }

    boolean zzb(float[] fArr) {
        boolean z = false;
        synchronized (this.zzOp) {
            if (this.zzOt == null) {
            } else {
                System.arraycopy(this.zzOt, 0, fArr, 0, this.zzOt.length);
                z = true;
            }
        }
        return z;
    }
}
