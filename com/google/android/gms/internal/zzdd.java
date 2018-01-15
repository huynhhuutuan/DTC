package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import com.google.android.gms.common.util.zzt;
import java.util.ArrayList;
import java.util.List;

@zzme
public class zzdd {
    private final Object zzxG = new Object();
    private zza zzxH = null;
    private boolean zzxI = false;

    @TargetApi(14)
    static class zza implements ActivityLifecycleCallbacks {
        @Nullable
        private Activity mActivity;
        private Context mContext;
        private List<zzb> mListeners = new ArrayList();
        private final Object zzrJ = new Object();
        private boolean zztZ = false;
        private boolean zzxJ = true;
        private boolean zzxK = false;
        private Runnable zzxL;
        private long zzxM;

        class C05321 implements Runnable {
            final /* synthetic */ zza zzxN;

            C05321(zza com_google_android_gms_internal_zzdd_zza) {
                this.zzxN = com_google_android_gms_internal_zzdd_zza;
            }

            public void run() {
                synchronized (this.zzxN.zzrJ) {
                    if (this.zzxN.zzxJ && this.zzxN.zzxK) {
                        this.zzxN.zzxJ = false;
                        zzqf.zzbf("App went background");
                        for (zzb zzk : this.zzxN.mListeners) {
                            try {
                                zzk.zzk(false);
                            } catch (Throwable e) {
                                zzqf.zzb("OnForegroundStateChangedListener threw exception.", e);
                            }
                        }
                    } else {
                        zzqf.zzbf("App is still foreground");
                    }
                }
            }
        }

        zza() {
        }

        private void setActivity(Activity activity) {
            synchronized (this.zzrJ) {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.mActivity = activity;
                }
            }
        }

        @Nullable
        public Activity getActivity() {
            return this.mActivity;
        }

        @Nullable
        public Context getContext() {
            return this.mContext;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onActivityDestroyed(android.app.Activity r3) {
            /*
            r2 = this;
            r1 = r2.zzrJ;
            monitor-enter(r1);
            r0 = r2.mActivity;	 Catch:{ all -> 0x0016 }
            if (r0 != 0) goto L_0x0009;
        L_0x0007:
            monitor-exit(r1);	 Catch:{ all -> 0x0016 }
        L_0x0008:
            return;
        L_0x0009:
            r0 = r2.mActivity;	 Catch:{ all -> 0x0016 }
            r0 = r0.equals(r3);	 Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0014;
        L_0x0011:
            r0 = 0;
            r2.mActivity = r0;	 Catch:{ all -> 0x0016 }
        L_0x0014:
            monitor-exit(r1);	 Catch:{ all -> 0x0016 }
            goto L_0x0008;
        L_0x0016:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x0016 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdd.zza.onActivityDestroyed(android.app.Activity):void");
        }

        public void onActivityPaused(Activity activity) {
            setActivity(activity);
            this.zzxK = true;
            if (this.zzxL != null) {
                zzpo.zzXC.removeCallbacks(this.zzxL);
            }
            Handler handler = zzpo.zzXC;
            Runnable c05321 = new C05321(this);
            this.zzxL = c05321;
            handler.postDelayed(c05321, this.zzxM);
        }

        public void onActivityResumed(Activity activity) {
            boolean z = false;
            setActivity(activity);
            this.zzxK = false;
            if (!this.zzxJ) {
                z = true;
            }
            this.zzxJ = true;
            if (this.zzxL != null) {
                zzpo.zzXC.removeCallbacks(this.zzxL);
            }
            synchronized (this.zzrJ) {
                if (z) {
                    for (zzb zzk : this.mListeners) {
                        try {
                            zzk.zzk(true);
                        } catch (Throwable e) {
                            zzqf.zzb("OnForegroundStateChangedListener threw exception.", e);
                        }
                    }
                } else {
                    zzqf.zzbf("App is still foreground.");
                }
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            setActivity(activity);
        }

        public void onActivityStopped(Activity activity) {
        }

        public void zza(Application application, Context context) {
            if (!this.zztZ) {
                application.registerActivityLifecycleCallbacks(this);
                if (context instanceof Activity) {
                    setActivity((Activity) context);
                }
                this.mContext = context;
                this.zzxM = ((Long) zzgd.zzCQ.get()).longValue();
                this.zztZ = true;
            }
        }

        public void zza(zzb com_google_android_gms_internal_zzdd_zzb) {
            this.mListeners.add(com_google_android_gms_internal_zzdd_zzb);
        }
    }

    public interface zzb {
        void zzk(boolean z);
    }

    @Nullable
    public Activity getActivity() {
        Activity activity;
        synchronized (this.zzxG) {
            zzt.zzzg();
            if (this.zzxH != null) {
                activity = this.zzxH.getActivity();
            } else {
                activity = null;
            }
        }
        return activity;
    }

    @Nullable
    public Context getContext() {
        Context context;
        synchronized (this.zzxG) {
            zzt.zzzg();
            if (this.zzxH != null) {
                context = this.zzxH.getContext();
            } else {
                context = null;
            }
        }
        return context;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initialize(android.content.Context r5) {
        /*
        r4 = this;
        r2 = r4.zzxG;
        monitor-enter(r2);
        r0 = r4.zzxI;	 Catch:{ all -> 0x0031 }
        if (r0 != 0) goto L_0x0047;
    L_0x0007:
        com.google.android.gms.common.util.zzt.zzzg();	 Catch:{ all -> 0x0031 }
        r0 = com.google.android.gms.internal.zzgd.zzCP;	 Catch:{ all -> 0x0031 }
        r0 = r0.get();	 Catch:{ all -> 0x0031 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x0031 }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x0031 }
        if (r0 != 0) goto L_0x001a;
    L_0x0018:
        monitor-exit(r2);	 Catch:{ all -> 0x0031 }
    L_0x0019:
        return;
    L_0x001a:
        r1 = 0;
        r0 = r5.getApplicationContext();	 Catch:{ all -> 0x0031 }
        if (r0 != 0) goto L_0x0022;
    L_0x0021:
        r0 = r5;
    L_0x0022:
        r3 = r0 instanceof android.app.Application;	 Catch:{ all -> 0x0031 }
        if (r3 == 0) goto L_0x0049;
    L_0x0026:
        r0 = (android.app.Application) r0;	 Catch:{ all -> 0x0031 }
    L_0x0028:
        if (r0 != 0) goto L_0x0034;
    L_0x002a:
        r0 = "Can not cast Context to Application";
        com.google.android.gms.internal.zzqf.zzbh(r0);	 Catch:{ all -> 0x0031 }
        monitor-exit(r2);	 Catch:{ all -> 0x0031 }
        goto L_0x0019;
    L_0x0031:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0031 }
        throw r0;
    L_0x0034:
        r1 = r4.zzxH;	 Catch:{ all -> 0x0031 }
        if (r1 != 0) goto L_0x003f;
    L_0x0038:
        r1 = new com.google.android.gms.internal.zzdd$zza;	 Catch:{ all -> 0x0031 }
        r1.<init>();	 Catch:{ all -> 0x0031 }
        r4.zzxH = r1;	 Catch:{ all -> 0x0031 }
    L_0x003f:
        r1 = r4.zzxH;	 Catch:{ all -> 0x0031 }
        r1.zza(r0, r5);	 Catch:{ all -> 0x0031 }
        r0 = 1;
        r4.zzxI = r0;	 Catch:{ all -> 0x0031 }
    L_0x0047:
        monitor-exit(r2);	 Catch:{ all -> 0x0031 }
        goto L_0x0019;
    L_0x0049:
        r0 = r1;
        goto L_0x0028;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdd.initialize(android.content.Context):void");
    }

    public void zza(zzb com_google_android_gms_internal_zzdd_zzb) {
        synchronized (this.zzxG) {
            zzt.zzzg();
            if (((Boolean) zzgd.zzCP.get()).booleanValue()) {
                if (this.zzxH == null) {
                    this.zzxH = new zza();
                }
                this.zzxH.zza(com_google_android_gms_internal_zzdd_zzb);
                return;
            }
        }
    }
}
