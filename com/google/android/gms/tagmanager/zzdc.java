package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;

class zzdc extends zzdb {
    private static final Object zzbIe = new Object();
    private static zzdc zzbIq;
    private boolean connected = true;
    private Context zzbIf;
    private zzaw zzbIg;
    private volatile zzau zzbIh;
    private int zzbIi = 1800000;
    private boolean zzbIj = true;
    private boolean zzbIk = false;
    private boolean zzbIl = true;
    private zzax zzbIm = new C11421(this);
    private zza zzbIn;
    private zzbt zzbIo;
    private boolean zzbIp = false;

    class C07012 implements Runnable {
        final /* synthetic */ zzdc zzbIr;

        C07012(zzdc com_google_android_gms_tagmanager_zzdc) {
            this.zzbIr = com_google_android_gms_tagmanager_zzdc;
        }

        public void run() {
            this.zzbIr.zzbIg.dispatch();
        }
    }

    public interface zza {
        void cancel();

        void zzRC();

        void zzy(long j);
    }

    class C11421 implements zzax {
        final /* synthetic */ zzdc zzbIr;

        C11421(zzdc com_google_android_gms_tagmanager_zzdc) {
            this.zzbIr = com_google_android_gms_tagmanager_zzdc;
        }

        public void zzaS(boolean z) {
            this.zzbIr.zze(z, this.zzbIr.connected);
        }
    }

    private class zzb implements zza {
        private Handler handler;
        final /* synthetic */ zzdc zzbIr;

        class C07021 implements Callback {
            final /* synthetic */ zzb zzbIs;

            C07021(zzb com_google_android_gms_tagmanager_zzdc_zzb) {
                this.zzbIs = com_google_android_gms_tagmanager_zzdc_zzb;
            }

            public boolean handleMessage(Message message) {
                if (1 == message.what && zzdc.zzbIe.equals(message.obj)) {
                    this.zzbIs.zzbIr.dispatch();
                    if (!this.zzbIs.zzbIr.isPowerSaveMode()) {
                        this.zzbIs.zzy((long) this.zzbIs.zzbIr.zzbIi);
                    }
                }
                return true;
            }
        }

        private zzb(zzdc com_google_android_gms_tagmanager_zzdc) {
            this.zzbIr = com_google_android_gms_tagmanager_zzdc;
            this.handler = new Handler(this.zzbIr.zzbIf.getMainLooper(), new C07021(this));
        }

        private Message obtainMessage() {
            return this.handler.obtainMessage(1, zzdc.zzbIe);
        }

        public void cancel() {
            this.handler.removeMessages(1, zzdc.zzbIe);
        }

        public void zzRC() {
            this.handler.removeMessages(1, zzdc.zzbIe);
            this.handler.sendMessage(obtainMessage());
        }

        public void zzy(long j) {
            this.handler.removeMessages(1, zzdc.zzbIe);
            this.handler.sendMessageDelayed(obtainMessage(), j);
        }
    }

    private zzdc() {
    }

    private boolean isPowerSaveMode() {
        return this.zzbIp || !this.connected || this.zzbIi <= 0;
    }

    public static zzdc zzRx() {
        if (zzbIq == null) {
            zzbIq = new zzdc();
        }
        return zzbIq;
    }

    private void zzRy() {
        this.zzbIo = new zzbt(this);
        this.zzbIo.zzcb(this.zzbIf);
    }

    private void zzRz() {
        this.zzbIn = new zzb();
        if (this.zzbIi > 0) {
            this.zzbIn.zzy((long) this.zzbIi);
        }
    }

    private void zzoH() {
        if (isPowerSaveMode()) {
            this.zzbIn.cancel();
            zzbo.m12v("PowerSaveMode initiated.");
            return;
        }
        this.zzbIn.zzy((long) this.zzbIi);
        zzbo.m12v("PowerSaveMode terminated.");
    }

    public synchronized void dispatch() {
        if (this.zzbIk) {
            this.zzbIh.zzp(new C07012(this));
        } else {
            zzbo.m12v("Dispatch call queued. Dispatch will run once initialization is complete.");
            this.zzbIj = true;
        }
    }

    synchronized zzaw zzRA() {
        if (this.zzbIg == null) {
            if (this.zzbIf == null) {
                throw new IllegalStateException("Cant get a store unless we have a context");
            }
            this.zzbIg = new zzcg(this.zzbIm, this.zzbIf);
        }
        if (this.zzbIn == null) {
            zzRz();
        }
        this.zzbIk = true;
        if (this.zzbIj) {
            dispatch();
            this.zzbIj = false;
        }
        if (this.zzbIo == null && this.zzbIl) {
            zzRy();
        }
        return this.zzbIg;
    }

    synchronized void zza(Context context, zzau com_google_android_gms_tagmanager_zzau) {
        if (this.zzbIf == null) {
            this.zzbIf = context.getApplicationContext();
            if (this.zzbIh == null) {
                this.zzbIh = com_google_android_gms_tagmanager_zzau;
            }
        }
    }

    public synchronized void zzaT(boolean z) {
        zze(this.zzbIp, z);
    }

    synchronized void zze(boolean z, boolean z2) {
        boolean isPowerSaveMode = isPowerSaveMode();
        this.zzbIp = z;
        this.connected = z2;
        if (isPowerSaveMode() != isPowerSaveMode) {
            zzoH();
        }
    }

    public synchronized void zznO() {
        if (!isPowerSaveMode()) {
            this.zzbIn.zzRC();
        }
    }
}
