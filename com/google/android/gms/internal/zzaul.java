package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzf.zzb;
import com.google.android.gms.common.internal.zzf.zzc;
import com.google.android.gms.common.zze;
import com.google.android.gms.measurement.AppMeasurement.zzf;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class zzaul extends zzauh {
    private final zza zzbvE;
    private zzatt zzbvF;
    private Boolean zzbvG;
    private final zzatk zzbvH;
    private final zzauo zzbvI;
    private final List<Runnable> zzbvJ = new ArrayList();
    private final zzatk zzbvK;

    class C04573 implements Runnable {
        final /* synthetic */ zzaul zzbvL;

        C04573(zzaul com_google_android_gms_internal_zzaul) {
            this.zzbvL = com_google_android_gms_internal_zzaul;
        }

        public void run() {
            zzatt zzc = this.zzbvL.zzbvF;
            if (zzc == null) {
                this.zzbvL.zzKk().zzLX().log("Discarding data. Failed to send app launch");
                return;
            }
            try {
                zzc.zza(this.zzbvL.zzKa().zzfD(this.zzbvL.zzKk().zzMe()));
                this.zzbvL.zza(zzc, null);
                this.zzbvL.zzoo();
            } catch (RemoteException e) {
                this.zzbvL.zzKk().zzLX().zzj("Failed to send app launch to the service", e);
            }
        }
    }

    class C04596 implements Runnable {
        final /* synthetic */ zzaul zzbvL;

        C04596(zzaul com_google_android_gms_internal_zzaul) {
            this.zzbvL = com_google_android_gms_internal_zzaul;
        }

        public void run() {
            zzatt zzc = this.zzbvL.zzbvF;
            if (zzc == null) {
                this.zzbvL.zzKk().zzLX().log("Failed to send measurementEnabled to service");
                return;
            }
            try {
                zzc.zzb(this.zzbvL.zzKa().zzfD(this.zzbvL.zzKk().zzMe()));
                this.zzbvL.zzoo();
            } catch (RemoteException e) {
                this.zzbvL.zzKk().zzLX().zzj("Failed to send measurementEnabled to the service", e);
            }
        }
    }

    protected class zza implements ServiceConnection, zzb, zzc {
        final /* synthetic */ zzaul zzbvL;
        private volatile boolean zzbvS;
        private volatile zzatw zzbvT;

        class C04664 implements Runnable {
            final /* synthetic */ zza zzbvV;

            C04664(zza com_google_android_gms_internal_zzaul_zza) {
                this.zzbvV = com_google_android_gms_internal_zzaul_zza;
            }

            public void run() {
                zzaul com_google_android_gms_internal_zzaul = this.zzbvV.zzbvL;
                Context context = this.zzbvV.zzbvL.getContext();
                this.zzbvV.zzbvL.zzKm().zzLf();
                com_google_android_gms_internal_zzaul.onServiceDisconnected(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
            }
        }

        protected zza(zzaul com_google_android_gms_internal_zzaul) {
            this.zzbvL = com_google_android_gms_internal_zzaul;
        }

        @MainThread
        public void onConnected(@Nullable Bundle bundle) {
            zzac.zzdj("MeasurementServiceConnection.onConnected");
            synchronized (this) {
                try {
                    final zzatt com_google_android_gms_internal_zzatt = (zzatt) this.zzbvT.zzxD();
                    this.zzbvT = null;
                    this.zzbvL.zzKj().zzm(new Runnable(this) {
                        final /* synthetic */ zza zzbvV;

                        public void run() {
                            synchronized (this.zzbvV) {
                                this.zzbvV.zzbvS = false;
                                if (!this.zzbvV.zzbvL.isConnected()) {
                                    this.zzbvV.zzbvL.zzKk().zzMc().log("Connected to remote service");
                                    this.zzbvV.zzbvL.zza(com_google_android_gms_internal_zzatt);
                                }
                            }
                        }
                    });
                } catch (DeadObjectException e) {
                    this.zzbvT = null;
                    this.zzbvS = false;
                } catch (IllegalStateException e2) {
                    this.zzbvT = null;
                    this.zzbvS = false;
                }
            }
        }

        @MainThread
        public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
            zzac.zzdj("MeasurementServiceConnection.onConnectionFailed");
            zzatx zzMt = this.zzbvL.zzbqg.zzMt();
            if (zzMt != null) {
                zzMt.zzLZ().zzj("Service connection failed", connectionResult);
            }
            synchronized (this) {
                this.zzbvS = false;
                this.zzbvT = null;
            }
        }

        @MainThread
        public void onConnectionSuspended(int i) {
            zzac.zzdj("MeasurementServiceConnection.onConnectionSuspended");
            this.zzbvL.zzKk().zzMc().log("Service connection suspended");
            this.zzbvL.zzKj().zzm(new C04664(this));
        }

        @MainThread
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            zzac.zzdj("MeasurementServiceConnection.onServiceConnected");
            synchronized (this) {
                if (iBinder == null) {
                    this.zzbvS = false;
                    this.zzbvL.zzKk().zzLX().log("Service connected with null binder");
                    return;
                }
                zzatt com_google_android_gms_internal_zzatt = null;
                try {
                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                    if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                        com_google_android_gms_internal_zzatt = com.google.android.gms.internal.zzatt.zza.zzes(iBinder);
                        this.zzbvL.zzKk().zzMd().log("Bound to IMeasurementService interface");
                    } else {
                        this.zzbvL.zzKk().zzLX().zzj("Got binder with a wrong descriptor", interfaceDescriptor);
                    }
                } catch (RemoteException e) {
                    this.zzbvL.zzKk().zzLX().log("Service connect failed to get IMeasurementService");
                }
                if (com_google_android_gms_internal_zzatt == null) {
                    this.zzbvS = false;
                    try {
                        com.google.android.gms.common.stats.zza.zzyJ().zza(this.zzbvL.getContext(), this.zzbvL.zzbvE);
                    } catch (IllegalArgumentException e2) {
                    }
                } else {
                    this.zzbvL.zzKj().zzm(new Runnable(this) {
                        final /* synthetic */ zza zzbvV;

                        public void run() {
                            synchronized (this.zzbvV) {
                                this.zzbvV.zzbvS = false;
                                if (!this.zzbvV.zzbvL.isConnected()) {
                                    this.zzbvV.zzbvL.zzKk().zzMd().log("Connected to service");
                                    this.zzbvV.zzbvL.zza(com_google_android_gms_internal_zzatt);
                                }
                            }
                        }
                    });
                }
            }
        }

        @MainThread
        public void onServiceDisconnected(final ComponentName componentName) {
            zzac.zzdj("MeasurementServiceConnection.onServiceDisconnected");
            this.zzbvL.zzKk().zzMc().log("Service disconnected");
            this.zzbvL.zzKj().zzm(new Runnable(this) {
                final /* synthetic */ zza zzbvV;

                public void run() {
                    this.zzbvV.zzbvL.onServiceDisconnected(componentName);
                }
            });
        }

        @WorkerThread
        public void zzC(Intent intent) {
            this.zzbvL.zzmR();
            Context context = this.zzbvL.getContext();
            com.google.android.gms.common.stats.zza zzyJ = com.google.android.gms.common.stats.zza.zzyJ();
            synchronized (this) {
                if (this.zzbvS) {
                    this.zzbvL.zzKk().zzMd().log("Connection attempt already in progress");
                    return;
                }
                this.zzbvS = true;
                zzyJ.zza(context, intent, this.zzbvL.zzbvE, 129);
            }
        }

        @WorkerThread
        public void zzNa() {
            this.zzbvL.zzmR();
            Context context = this.zzbvL.getContext();
            synchronized (this) {
                if (this.zzbvS) {
                    this.zzbvL.zzKk().zzMd().log("Connection attempt already in progress");
                } else if (this.zzbvT != null) {
                    this.zzbvL.zzKk().zzMd().log("Already awaiting connection attempt");
                } else {
                    this.zzbvT = new zzatw(context, Looper.getMainLooper(), this, this);
                    this.zzbvL.zzKk().zzMd().log("Connecting to remote service");
                    this.zzbvS = true;
                    this.zzbvT.zzxz();
                }
            }
        }
    }

    protected zzaul(zzaue com_google_android_gms_internal_zzaue) {
        super(com_google_android_gms_internal_zzaue);
        this.zzbvI = new zzauo(com_google_android_gms_internal_zzaue.zznR());
        this.zzbvE = new zza(this);
        this.zzbvH = new zzatk(this, com_google_android_gms_internal_zzaue) {
            final /* synthetic */ zzaul zzbvL;

            public void run() {
                this.zzbvL.zzop();
            }
        };
        this.zzbvK = new zzatk(this, com_google_android_gms_internal_zzaue) {
            final /* synthetic */ zzaul zzbvL;

            public void run() {
                this.zzbvL.zzKk().zzLZ().log("Tasks have been queued for a long time");
            }
        };
    }

    @WorkerThread
    private void onServiceDisconnected(ComponentName componentName) {
        zzmR();
        if (this.zzbvF != null) {
            this.zzbvF = null;
            zzKk().zzMd().zzj("Disconnected from device MeasurementService", componentName);
            zzMY();
        }
    }

    private boolean zzMW() {
        zzKm().zzLf();
        List queryIntentServices = getContext().getPackageManager().queryIntentServices(new Intent().setClassName(getContext(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        return queryIntentServices != null && queryIntentServices.size() > 0;
    }

    @WorkerThread
    private void zzMY() {
        zzmR();
        zzoD();
    }

    @WorkerThread
    private void zzMZ() {
        zzmR();
        zzKk().zzMd().zzj("Processing queued up service tasks", Integer.valueOf(this.zzbvJ.size()));
        for (Runnable zzm : this.zzbvJ) {
            zzKj().zzm(zzm);
        }
        this.zzbvJ.clear();
        this.zzbvK.cancel();
    }

    @WorkerThread
    private void zzo(Runnable runnable) throws IllegalStateException {
        zzmR();
        if (isConnected()) {
            runnable.run();
        } else if (((long) this.zzbvJ.size()) >= zzKm().zzLl()) {
            zzKk().zzLX().log("Discarding data. Max runnable queue size reached");
        } else {
            this.zzbvJ.add(runnable);
            this.zzbvK.zzy(60000);
            zzoD();
        }
    }

    @WorkerThread
    private void zzoo() {
        zzmR();
        this.zzbvI.start();
        this.zzbvH.zzy(zzKm().zzpq());
    }

    @WorkerThread
    private void zzop() {
        zzmR();
        if (isConnected()) {
            zzKk().zzMd().log("Inactivity, disconnecting from the service");
            disconnect();
        }
    }

    @WorkerThread
    public void disconnect() {
        zzmR();
        zzob();
        try {
            com.google.android.gms.common.stats.zza.zzyJ().zza(getContext(), this.zzbvE);
        } catch (IllegalStateException e) {
        } catch (IllegalArgumentException e2) {
        }
        this.zzbvF = null;
    }

    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @WorkerThread
    public boolean isConnected() {
        zzmR();
        zzob();
        return this.zzbvF != null;
    }

    public /* bridge */ /* synthetic */ void zzJU() {
        super.zzJU();
    }

    public /* bridge */ /* synthetic */ void zzJV() {
        super.zzJV();
    }

    public /* bridge */ /* synthetic */ void zzJW() {
        super.zzJW();
    }

    public /* bridge */ /* synthetic */ zzatb zzJX() {
        return super.zzJX();
    }

    public /* bridge */ /* synthetic */ zzatf zzJY() {
        return super.zzJY();
    }

    public /* bridge */ /* synthetic */ zzauj zzJZ() {
        return super.zzJZ();
    }

    public /* bridge */ /* synthetic */ zzatu zzKa() {
        return super.zzKa();
    }

    public /* bridge */ /* synthetic */ zzatl zzKb() {
        return super.zzKb();
    }

    public /* bridge */ /* synthetic */ zzaul zzKc() {
        return super.zzKc();
    }

    public /* bridge */ /* synthetic */ zzauk zzKd() {
        return super.zzKd();
    }

    public /* bridge */ /* synthetic */ zzatv zzKe() {
        return super.zzKe();
    }

    public /* bridge */ /* synthetic */ zzatj zzKf() {
        return super.zzKf();
    }

    public /* bridge */ /* synthetic */ zzaut zzKg() {
        return super.zzKg();
    }

    public /* bridge */ /* synthetic */ zzauc zzKh() {
        return super.zzKh();
    }

    public /* bridge */ /* synthetic */ zzaun zzKi() {
        return super.zzKi();
    }

    public /* bridge */ /* synthetic */ zzaud zzKj() {
        return super.zzKj();
    }

    public /* bridge */ /* synthetic */ zzatx zzKk() {
        return super.zzKk();
    }

    public /* bridge */ /* synthetic */ zzaua zzKl() {
        return super.zzKl();
    }

    public /* bridge */ /* synthetic */ zzati zzKm() {
        return super.zzKm();
    }

    @WorkerThread
    protected void zzMQ() {
        zzmR();
        zzob();
        zzo(new C04573(this));
    }

    @WorkerThread
    protected void zzMV() {
        zzmR();
        zzob();
        zzo(new C04596(this));
    }

    @WorkerThread
    protected boolean zzMX() {
        zzmR();
        zzob();
        zzKm().zzLf();
        zzKk().zzMd().log("Checking service availability");
        switch (zze.zzuY().isGooglePlayServicesAvailable(getContext())) {
            case 0:
                zzKk().zzMd().log("Service available");
                return true;
            case 1:
                zzKk().zzMd().log("Service missing");
                return false;
            case 2:
                zzKk().zzMc().log("Service container out of date");
                return true;
            case 3:
                zzKk().zzLZ().log("Service disabled");
                return false;
            case 9:
                zzKk().zzLZ().log("Service invalid");
                return false;
            case 18:
                zzKk().zzLZ().log("Service updating");
                return true;
            default:
                return false;
        }
    }

    @WorkerThread
    protected void zza(zzatt com_google_android_gms_internal_zzatt) {
        zzmR();
        zzac.zzw(com_google_android_gms_internal_zzatt);
        this.zzbvF = com_google_android_gms_internal_zzatt;
        zzoo();
        zzMZ();
    }

    @WorkerThread
    void zza(zzatt com_google_android_gms_internal_zzatt, com.google.android.gms.common.internal.safeparcel.zza com_google_android_gms_common_internal_safeparcel_zza) {
        zzmR();
        zzJV();
        zzob();
        int i = VERSION.SDK_INT;
        zzKm().zzLf();
        List<com.google.android.gms.common.internal.safeparcel.zza> arrayList = new ArrayList();
        zzKm().zzLo();
        int i2 = 100;
        for (int i3 = 0; i3 < 1001 && r1 == 100; i3++) {
            Object zzlD = zzKe().zzlD(100);
            if (zzlD != null) {
                arrayList.addAll(zzlD);
                i2 = zzlD.size();
            } else {
                i2 = 0;
            }
            if (com_google_android_gms_common_internal_safeparcel_zza != null && r1 < 100) {
                arrayList.add(com_google_android_gms_common_internal_safeparcel_zza);
            }
            for (com.google.android.gms.common.internal.safeparcel.zza com_google_android_gms_common_internal_safeparcel_zza2 : arrayList) {
                if (com_google_android_gms_common_internal_safeparcel_zza2 instanceof zzatq) {
                    try {
                        com_google_android_gms_internal_zzatt.zza((zzatq) com_google_android_gms_common_internal_safeparcel_zza2, zzKa().zzfD(zzKk().zzMe()));
                    } catch (RemoteException e) {
                        zzKk().zzLX().zzj("Failed to send event to the service", e);
                    }
                } else if (com_google_android_gms_common_internal_safeparcel_zza2 instanceof zzauq) {
                    try {
                        com_google_android_gms_internal_zzatt.zza((zzauq) com_google_android_gms_common_internal_safeparcel_zza2, zzKa().zzfD(zzKk().zzMe()));
                    } catch (RemoteException e2) {
                        zzKk().zzLX().zzj("Failed to send attribute to the service", e2);
                    }
                } else if (com_google_android_gms_common_internal_safeparcel_zza2 instanceof zzatg) {
                    try {
                        com_google_android_gms_internal_zzatt.zza((zzatg) com_google_android_gms_common_internal_safeparcel_zza2, zzKa().zzfD(zzKk().zzMe()));
                    } catch (RemoteException e22) {
                        zzKk().zzLX().zzj("Failed to send conditional property to the service", e22);
                    }
                } else {
                    zzKk().zzLX().log("Discarding data. Unrecognized parcel type.");
                }
            }
        }
    }

    @WorkerThread
    protected void zza(final zzf com_google_android_gms_measurement_AppMeasurement_zzf) {
        zzmR();
        zzob();
        zzo(new Runnable(this) {
            final /* synthetic */ zzaul zzbvL;

            public void run() {
                zzatt zzc = this.zzbvL.zzbvF;
                if (zzc == null) {
                    this.zzbvL.zzKk().zzLX().log("Failed to send current screen to service");
                    return;
                }
                try {
                    if (com_google_android_gms_measurement_AppMeasurement_zzf == null) {
                        zzc.zza(0, null, null, this.zzbvL.getContext().getPackageName());
                    } else {
                        zzc.zza(com_google_android_gms_measurement_AppMeasurement_zzf.zzbql, com_google_android_gms_measurement_AppMeasurement_zzf.zzbqj, com_google_android_gms_measurement_AppMeasurement_zzf.zzbqk, this.zzbvL.getContext().getPackageName());
                    }
                    this.zzbvL.zzoo();
                } catch (RemoteException e) {
                    this.zzbvL.zzKk().zzLX().zzj("Failed to send current screen to the service", e);
                }
            }
        });
    }

    @WorkerThread
    public void zza(final AtomicReference<String> atomicReference) {
        zzmR();
        zzob();
        zzo(new Runnable(this) {
            final /* synthetic */ zzaul zzbvL;

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                r5 = this;
                r1 = r2;
                monitor-enter(r1);
                r0 = r5.zzbvL;	 Catch:{ RemoteException -> 0x0044 }
                r0 = r0.zzbvF;	 Catch:{ RemoteException -> 0x0044 }
                if (r0 != 0) goto L_0x0021;
            L_0x000b:
                r0 = r5.zzbvL;	 Catch:{ RemoteException -> 0x0044 }
                r0 = r0.zzKk();	 Catch:{ RemoteException -> 0x0044 }
                r0 = r0.zzLX();	 Catch:{ RemoteException -> 0x0044 }
                r2 = "Failed to get app instance id";
                r0.log(r2);	 Catch:{ RemoteException -> 0x0044 }
                r0 = r2;	 Catch:{ all -> 0x0041 }
                r0.notify();	 Catch:{ all -> 0x0041 }
                monitor-exit(r1);	 Catch:{ all -> 0x0041 }
            L_0x0020:
                return;
            L_0x0021:
                r2 = r2;	 Catch:{ RemoteException -> 0x0044 }
                r3 = r5.zzbvL;	 Catch:{ RemoteException -> 0x0044 }
                r3 = r3.zzKa();	 Catch:{ RemoteException -> 0x0044 }
                r4 = 0;
                r3 = r3.zzfD(r4);	 Catch:{ RemoteException -> 0x0044 }
                r0 = r0.zzc(r3);	 Catch:{ RemoteException -> 0x0044 }
                r2.set(r0);	 Catch:{ RemoteException -> 0x0044 }
                r0 = r5.zzbvL;	 Catch:{ RemoteException -> 0x0044 }
                r0.zzoo();	 Catch:{ RemoteException -> 0x0044 }
                r0 = r2;	 Catch:{ all -> 0x0041 }
                r0.notify();	 Catch:{ all -> 0x0041 }
            L_0x003f:
                monitor-exit(r1);	 Catch:{ all -> 0x0041 }
                goto L_0x0020;
            L_0x0041:
                r0 = move-exception;
                monitor-exit(r1);	 Catch:{ all -> 0x0041 }
                throw r0;
            L_0x0044:
                r0 = move-exception;
                r2 = r5.zzbvL;	 Catch:{ all -> 0x005a }
                r2 = r2.zzKk();	 Catch:{ all -> 0x005a }
                r2 = r2.zzLX();	 Catch:{ all -> 0x005a }
                r3 = "Failed to get app instance id";
                r2.zzj(r3, r0);	 Catch:{ all -> 0x005a }
                r0 = r2;	 Catch:{ all -> 0x0041 }
                r0.notify();	 Catch:{ all -> 0x0041 }
                goto L_0x003f;
            L_0x005a:
                r0 = move-exception;
                r2 = r2;	 Catch:{ all -> 0x0041 }
                r2.notify();	 Catch:{ all -> 0x0041 }
                throw r0;	 Catch:{ all -> 0x0041 }
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaul.2.run():void");
            }
        });
    }

    @WorkerThread
    protected void zza(AtomicReference<List<zzatg>> atomicReference, String str, String str2, String str3) {
        zzmR();
        zzob();
        final AtomicReference<List<zzatg>> atomicReference2 = atomicReference;
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        zzo(new Runnable(this) {
            final /* synthetic */ zzaul zzbvL;

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                r7 = this;
                r1 = r2;
                monitor-enter(r1);
                r0 = r7.zzbvL;	 Catch:{ RemoteException -> 0x007c }
                r0 = r0.zzbvF;	 Catch:{ RemoteException -> 0x007c }
                if (r0 != 0) goto L_0x0034;
            L_0x000b:
                r0 = r7.zzbvL;	 Catch:{ RemoteException -> 0x007c }
                r0 = r0.zzKk();	 Catch:{ RemoteException -> 0x007c }
                r0 = r0.zzLX();	 Catch:{ RemoteException -> 0x007c }
                r2 = "Failed to get conditional properties";
                r3 = r3;	 Catch:{ RemoteException -> 0x007c }
                r3 = com.google.android.gms.internal.zzatx.zzfE(r3);	 Catch:{ RemoteException -> 0x007c }
                r4 = r4;	 Catch:{ RemoteException -> 0x007c }
                r5 = r5;	 Catch:{ RemoteException -> 0x007c }
                r0.zzd(r2, r3, r4, r5);	 Catch:{ RemoteException -> 0x007c }
                r0 = r2;	 Catch:{ RemoteException -> 0x007c }
                r2 = java.util.Collections.emptyList();	 Catch:{ RemoteException -> 0x007c }
                r0.set(r2);	 Catch:{ RemoteException -> 0x007c }
                r0 = r2;	 Catch:{ all -> 0x0069 }
                r0.notify();	 Catch:{ all -> 0x0069 }
                monitor-exit(r1);	 Catch:{ all -> 0x0069 }
            L_0x0033:
                return;
            L_0x0034:
                r2 = r3;	 Catch:{ RemoteException -> 0x007c }
                r2 = android.text.TextUtils.isEmpty(r2);	 Catch:{ RemoteException -> 0x007c }
                if (r2 == 0) goto L_0x006c;
            L_0x003c:
                r2 = r2;	 Catch:{ RemoteException -> 0x007c }
                r3 = r4;	 Catch:{ RemoteException -> 0x007c }
                r4 = r5;	 Catch:{ RemoteException -> 0x007c }
                r5 = r7.zzbvL;	 Catch:{ RemoteException -> 0x007c }
                r5 = r5.zzKa();	 Catch:{ RemoteException -> 0x007c }
                r6 = r7.zzbvL;	 Catch:{ RemoteException -> 0x007c }
                r6 = r6.zzKk();	 Catch:{ RemoteException -> 0x007c }
                r6 = r6.zzMe();	 Catch:{ RemoteException -> 0x007c }
                r5 = r5.zzfD(r6);	 Catch:{ RemoteException -> 0x007c }
                r0 = r0.zza(r3, r4, r5);	 Catch:{ RemoteException -> 0x007c }
                r2.set(r0);	 Catch:{ RemoteException -> 0x007c }
            L_0x005d:
                r0 = r7.zzbvL;	 Catch:{ RemoteException -> 0x007c }
                r0.zzoo();	 Catch:{ RemoteException -> 0x007c }
                r0 = r2;	 Catch:{ all -> 0x0069 }
                r0.notify();	 Catch:{ all -> 0x0069 }
            L_0x0067:
                monitor-exit(r1);	 Catch:{ all -> 0x0069 }
                goto L_0x0033;
            L_0x0069:
                r0 = move-exception;
                monitor-exit(r1);	 Catch:{ all -> 0x0069 }
                throw r0;
            L_0x006c:
                r2 = r2;	 Catch:{ RemoteException -> 0x007c }
                r3 = r3;	 Catch:{ RemoteException -> 0x007c }
                r4 = r4;	 Catch:{ RemoteException -> 0x007c }
                r5 = r5;	 Catch:{ RemoteException -> 0x007c }
                r0 = r0.zzn(r3, r4, r5);	 Catch:{ RemoteException -> 0x007c }
                r2.set(r0);	 Catch:{ RemoteException -> 0x007c }
                goto L_0x005d;
            L_0x007c:
                r0 = move-exception;
                r2 = r7.zzbvL;	 Catch:{ all -> 0x00a3 }
                r2 = r2.zzKk();	 Catch:{ all -> 0x00a3 }
                r2 = r2.zzLX();	 Catch:{ all -> 0x00a3 }
                r3 = "Failed to get conditional properties";
                r4 = r3;	 Catch:{ all -> 0x00a3 }
                r4 = com.google.android.gms.internal.zzatx.zzfE(r4);	 Catch:{ all -> 0x00a3 }
                r5 = r4;	 Catch:{ all -> 0x00a3 }
                r2.zzd(r3, r4, r5, r0);	 Catch:{ all -> 0x00a3 }
                r0 = r2;	 Catch:{ all -> 0x00a3 }
                r2 = java.util.Collections.emptyList();	 Catch:{ all -> 0x00a3 }
                r0.set(r2);	 Catch:{ all -> 0x00a3 }
                r0 = r2;	 Catch:{ all -> 0x0069 }
                r0.notify();	 Catch:{ all -> 0x0069 }
                goto L_0x0067;
            L_0x00a3:
                r0 = move-exception;
                r2 = r2;	 Catch:{ all -> 0x0069 }
                r2.notify();	 Catch:{ all -> 0x0069 }
                throw r0;	 Catch:{ all -> 0x0069 }
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaul.9.run():void");
            }
        });
    }

    @WorkerThread
    protected void zza(AtomicReference<List<zzauq>> atomicReference, String str, String str2, String str3, boolean z) {
        zzmR();
        zzob();
        final AtomicReference<List<zzauq>> atomicReference2 = atomicReference;
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        final boolean z2 = z;
        zzo(new Runnable(this) {
            final /* synthetic */ zzaul zzbvL;

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                r8 = this;
                r1 = r2;
                monitor-enter(r1);
                r0 = r8.zzbvL;	 Catch:{ RemoteException -> 0x0080 }
                r0 = r0.zzbvF;	 Catch:{ RemoteException -> 0x0080 }
                if (r0 != 0) goto L_0x0034;
            L_0x000b:
                r0 = r8.zzbvL;	 Catch:{ RemoteException -> 0x0080 }
                r0 = r0.zzKk();	 Catch:{ RemoteException -> 0x0080 }
                r0 = r0.zzLX();	 Catch:{ RemoteException -> 0x0080 }
                r2 = "Failed to get user properties";
                r3 = r3;	 Catch:{ RemoteException -> 0x0080 }
                r3 = com.google.android.gms.internal.zzatx.zzfE(r3);	 Catch:{ RemoteException -> 0x0080 }
                r4 = r4;	 Catch:{ RemoteException -> 0x0080 }
                r5 = r5;	 Catch:{ RemoteException -> 0x0080 }
                r0.zzd(r2, r3, r4, r5);	 Catch:{ RemoteException -> 0x0080 }
                r0 = r2;	 Catch:{ RemoteException -> 0x0080 }
                r2 = java.util.Collections.emptyList();	 Catch:{ RemoteException -> 0x0080 }
                r0.set(r2);	 Catch:{ RemoteException -> 0x0080 }
                r0 = r2;	 Catch:{ all -> 0x006b }
                r0.notify();	 Catch:{ all -> 0x006b }
                monitor-exit(r1);	 Catch:{ all -> 0x006b }
            L_0x0033:
                return;
            L_0x0034:
                r2 = r3;	 Catch:{ RemoteException -> 0x0080 }
                r2 = android.text.TextUtils.isEmpty(r2);	 Catch:{ RemoteException -> 0x0080 }
                if (r2 == 0) goto L_0x006e;
            L_0x003c:
                r2 = r2;	 Catch:{ RemoteException -> 0x0080 }
                r3 = r4;	 Catch:{ RemoteException -> 0x0080 }
                r4 = r5;	 Catch:{ RemoteException -> 0x0080 }
                r5 = r6;	 Catch:{ RemoteException -> 0x0080 }
                r6 = r8.zzbvL;	 Catch:{ RemoteException -> 0x0080 }
                r6 = r6.zzKa();	 Catch:{ RemoteException -> 0x0080 }
                r7 = r8.zzbvL;	 Catch:{ RemoteException -> 0x0080 }
                r7 = r7.zzKk();	 Catch:{ RemoteException -> 0x0080 }
                r7 = r7.zzMe();	 Catch:{ RemoteException -> 0x0080 }
                r6 = r6.zzfD(r7);	 Catch:{ RemoteException -> 0x0080 }
                r0 = r0.zza(r3, r4, r5, r6);	 Catch:{ RemoteException -> 0x0080 }
                r2.set(r0);	 Catch:{ RemoteException -> 0x0080 }
            L_0x005f:
                r0 = r8.zzbvL;	 Catch:{ RemoteException -> 0x0080 }
                r0.zzoo();	 Catch:{ RemoteException -> 0x0080 }
                r0 = r2;	 Catch:{ all -> 0x006b }
                r0.notify();	 Catch:{ all -> 0x006b }
            L_0x0069:
                monitor-exit(r1);	 Catch:{ all -> 0x006b }
                goto L_0x0033;
            L_0x006b:
                r0 = move-exception;
                monitor-exit(r1);	 Catch:{ all -> 0x006b }
                throw r0;
            L_0x006e:
                r2 = r2;	 Catch:{ RemoteException -> 0x0080 }
                r3 = r3;	 Catch:{ RemoteException -> 0x0080 }
                r4 = r4;	 Catch:{ RemoteException -> 0x0080 }
                r5 = r5;	 Catch:{ RemoteException -> 0x0080 }
                r6 = r6;	 Catch:{ RemoteException -> 0x0080 }
                r0 = r0.zza(r3, r4, r5, r6);	 Catch:{ RemoteException -> 0x0080 }
                r2.set(r0);	 Catch:{ RemoteException -> 0x0080 }
                goto L_0x005f;
            L_0x0080:
                r0 = move-exception;
                r2 = r8.zzbvL;	 Catch:{ all -> 0x00a7 }
                r2 = r2.zzKk();	 Catch:{ all -> 0x00a7 }
                r2 = r2.zzLX();	 Catch:{ all -> 0x00a7 }
                r3 = "Failed to get user properties";
                r4 = r3;	 Catch:{ all -> 0x00a7 }
                r4 = com.google.android.gms.internal.zzatx.zzfE(r4);	 Catch:{ all -> 0x00a7 }
                r5 = r4;	 Catch:{ all -> 0x00a7 }
                r2.zzd(r3, r4, r5, r0);	 Catch:{ all -> 0x00a7 }
                r0 = r2;	 Catch:{ all -> 0x00a7 }
                r2 = java.util.Collections.emptyList();	 Catch:{ all -> 0x00a7 }
                r0.set(r2);	 Catch:{ all -> 0x00a7 }
                r0 = r2;	 Catch:{ all -> 0x006b }
                r0.notify();	 Catch:{ all -> 0x006b }
                goto L_0x0069;
            L_0x00a7:
                r0 = move-exception;
                r2 = r2;	 Catch:{ all -> 0x006b }
                r2.notify();	 Catch:{ all -> 0x006b }
                throw r0;	 Catch:{ all -> 0x006b }
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaul.10.run():void");
            }
        });
    }

    @WorkerThread
    protected void zza(final AtomicReference<List<zzauq>> atomicReference, final boolean z) {
        zzmR();
        zzob();
        zzo(new Runnable(this) {
            final /* synthetic */ zzaul zzbvL;

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                r5 = this;
                r1 = r2;
                monitor-enter(r1);
                r0 = r5.zzbvL;	 Catch:{ RemoteException -> 0x0046 }
                r0 = r0.zzbvF;	 Catch:{ RemoteException -> 0x0046 }
                if (r0 != 0) goto L_0x0021;
            L_0x000b:
                r0 = r5.zzbvL;	 Catch:{ RemoteException -> 0x0046 }
                r0 = r0.zzKk();	 Catch:{ RemoteException -> 0x0046 }
                r0 = r0.zzLX();	 Catch:{ RemoteException -> 0x0046 }
                r2 = "Failed to get user properties";
                r0.log(r2);	 Catch:{ RemoteException -> 0x0046 }
                r0 = r2;	 Catch:{ all -> 0x0043 }
                r0.notify();	 Catch:{ all -> 0x0043 }
                monitor-exit(r1);	 Catch:{ all -> 0x0043 }
            L_0x0020:
                return;
            L_0x0021:
                r2 = r2;	 Catch:{ RemoteException -> 0x0046 }
                r3 = r5.zzbvL;	 Catch:{ RemoteException -> 0x0046 }
                r3 = r3.zzKa();	 Catch:{ RemoteException -> 0x0046 }
                r4 = 0;
                r3 = r3.zzfD(r4);	 Catch:{ RemoteException -> 0x0046 }
                r4 = r3;	 Catch:{ RemoteException -> 0x0046 }
                r0 = r0.zza(r3, r4);	 Catch:{ RemoteException -> 0x0046 }
                r2.set(r0);	 Catch:{ RemoteException -> 0x0046 }
                r0 = r5.zzbvL;	 Catch:{ RemoteException -> 0x0046 }
                r0.zzoo();	 Catch:{ RemoteException -> 0x0046 }
                r0 = r2;	 Catch:{ all -> 0x0043 }
                r0.notify();	 Catch:{ all -> 0x0043 }
            L_0x0041:
                monitor-exit(r1);	 Catch:{ all -> 0x0043 }
                goto L_0x0020;
            L_0x0043:
                r0 = move-exception;
                monitor-exit(r1);	 Catch:{ all -> 0x0043 }
                throw r0;
            L_0x0046:
                r0 = move-exception;
                r2 = r5.zzbvL;	 Catch:{ all -> 0x005c }
                r2 = r2.zzKk();	 Catch:{ all -> 0x005c }
                r2 = r2.zzLX();	 Catch:{ all -> 0x005c }
                r3 = "Failed to get user properties";
                r2.zzj(r3, r0);	 Catch:{ all -> 0x005c }
                r0 = r2;	 Catch:{ all -> 0x0043 }
                r0.notify();	 Catch:{ all -> 0x0043 }
                goto L_0x0041;
            L_0x005c:
                r0 = move-exception;
                r2 = r2;	 Catch:{ all -> 0x0043 }
                r2.notify();	 Catch:{ all -> 0x0043 }
                throw r0;	 Catch:{ all -> 0x0043 }
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaul.12.run():void");
            }
        });
    }

    @WorkerThread
    protected void zzb(final zzauq com_google_android_gms_internal_zzauq) {
        zzmR();
        zzob();
        int i = VERSION.SDK_INT;
        zzKm().zzLf();
        final boolean z = zzKe().zza(com_google_android_gms_internal_zzauq);
        zzo(new Runnable(this) {
            final /* synthetic */ zzaul zzbvL;

            public void run() {
                zzatt zzc = this.zzbvL.zzbvF;
                if (zzc == null) {
                    this.zzbvL.zzKk().zzLX().log("Discarding data. Failed to set user attribute");
                    return;
                }
                this.zzbvL.zza(zzc, z ? null : com_google_android_gms_internal_zzauq);
                this.zzbvL.zzoo();
            }
        });
    }

    @WorkerThread
    protected void zzc(zzatq com_google_android_gms_internal_zzatq, String str) {
        zzac.zzw(com_google_android_gms_internal_zzatq);
        zzmR();
        zzob();
        int i = VERSION.SDK_INT;
        zzKm().zzLf();
        final boolean z = zzKe().zza(com_google_android_gms_internal_zzatq);
        final zzatq com_google_android_gms_internal_zzatq2 = com_google_android_gms_internal_zzatq;
        final String str2 = str;
        zzo(new Runnable(this, true) {
            final /* synthetic */ zzaul zzbvL;

            public void run() {
                zzatt zzc = this.zzbvL.zzbvF;
                if (zzc == null) {
                    this.zzbvL.zzKk().zzLX().log("Discarding data. Failed to send event to service");
                    return;
                }
                if (true) {
                    this.zzbvL.zza(zzc, z ? null : com_google_android_gms_internal_zzatq2);
                } else {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            zzc.zza(com_google_android_gms_internal_zzatq2, this.zzbvL.zzKa().zzfD(this.zzbvL.zzKk().zzMe()));
                        } else {
                            zzc.zza(com_google_android_gms_internal_zzatq2, str2, this.zzbvL.zzKk().zzMe());
                        }
                    } catch (RemoteException e) {
                        this.zzbvL.zzKk().zzLX().zzj("Failed to send event to the service", e);
                    }
                }
                this.zzbvL.zzoo();
            }
        });
    }

    @WorkerThread
    protected void zzf(zzatg com_google_android_gms_internal_zzatg) {
        zzac.zzw(com_google_android_gms_internal_zzatg);
        zzmR();
        zzob();
        zzKm().zzLf();
        final boolean z = zzKe().zzc(com_google_android_gms_internal_zzatg);
        final zzatg com_google_android_gms_internal_zzatg2 = new zzatg(com_google_android_gms_internal_zzatg);
        final zzatg com_google_android_gms_internal_zzatg3 = com_google_android_gms_internal_zzatg;
        zzo(new Runnable(this, true) {
            final /* synthetic */ zzaul zzbvL;

            public void run() {
                zzatt zzc = this.zzbvL.zzbvF;
                if (zzc == null) {
                    this.zzbvL.zzKk().zzLX().log("Discarding data. Failed to send conditional user property to service");
                    return;
                }
                if (true) {
                    this.zzbvL.zza(zzc, z ? null : com_google_android_gms_internal_zzatg2);
                } else {
                    try {
                        if (TextUtils.isEmpty(com_google_android_gms_internal_zzatg3.packageName)) {
                            zzc.zza(com_google_android_gms_internal_zzatg2, this.zzbvL.zzKa().zzfD(this.zzbvL.zzKk().zzMe()));
                        } else {
                            zzc.zzb(com_google_android_gms_internal_zzatg2);
                        }
                    } catch (RemoteException e) {
                        this.zzbvL.zzKk().zzLX().zzj("Failed to send conditional user property to the service", e);
                    }
                }
                this.zzbvL.zzoo();
            }
        });
    }

    public /* bridge */ /* synthetic */ void zzmR() {
        super.zzmR();
    }

    protected void zzmS() {
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.common.util.zze zznR() {
        return super.zznR();
    }

    @WorkerThread
    void zzoD() {
        zzmR();
        zzob();
        if (!isConnected()) {
            if (this.zzbvG == null) {
                this.zzbvG = zzKl().zzMl();
                if (this.zzbvG == null) {
                    zzKk().zzMd().log("State of service unknown");
                    this.zzbvG = Boolean.valueOf(zzMX());
                    zzKl().zzaK(this.zzbvG.booleanValue());
                }
            }
            if (this.zzbvG.booleanValue()) {
                zzKk().zzMd().log("Using measurement service");
                this.zzbvE.zzNa();
            } else if (zzMW()) {
                zzKk().zzMd().log("Using local app measurement service");
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context context = getContext();
                zzKm().zzLf();
                intent.setComponent(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
                this.zzbvE.zzC(intent);
            } else {
                zzKk().zzLX().log("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
        }
    }
}
