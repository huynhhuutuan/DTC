package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.internal.zzac;

public final class zzti {
    private static Boolean zzaby;
    private final Context mContext;
    private final Handler mHandler = new Handler();
    private final zza zzagJ;

    public interface zza {
        boolean callServiceStopSelfResult(int i);

        Context getContext();
    }

    public zzti(zza com_google_android_gms_internal_zzti_zza) {
        this.mContext = com_google_android_gms_internal_zzti_zza.getContext();
        zzac.zzw(this.mContext);
        this.zzagJ = com_google_android_gms_internal_zzti_zza;
    }

    public static boolean zzal(Context context) {
        zzac.zzw(context);
        if (zzaby != null) {
            return zzaby.booleanValue();
        }
        boolean zzy = zztm.zzy(context, "com.google.android.gms.analytics.AnalyticsService");
        zzaby = Boolean.valueOf(zzy);
        return zzy;
    }

    private void zzmt() {
        try {
            synchronized (zzth.zztX) {
                zzbay com_google_android_gms_internal_zzbay = zzth.zzabw;
                if (com_google_android_gms_internal_zzbay != null && com_google_android_gms_internal_zzbay.isHeld()) {
                    com_google_android_gms_internal_zzbay.release();
                }
            }
        } catch (SecurityException e) {
        }
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void onCreate() {
        zzsc.zzan(this.mContext).zznS().zzbP("Local AnalyticsService is starting up");
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void onDestroy() {
        zzsc.zzan(this.mContext).zznS().zzbP("Local AnalyticsService is shutting down");
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public int onStartCommand(Intent intent, int i, final int i2) {
        zzmt();
        final zzsc zzan = zzsc.zzan(this.mContext);
        final zztd zznS = zzan.zznS();
        if (intent == null) {
            zznS.zzbS("AnalyticsService started with null intent");
        } else {
            String action = intent.getAction();
            zznS.zza("Local AnalyticsService called. startId, action", Integer.valueOf(i2), action);
            if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
                zzan.zzmA().zza(new zzsu(this) {
                    final /* synthetic */ zzti zzagL;

                    class C06761 implements Runnable {
                        final /* synthetic */ C11281 zzagM;

                        C06761(C11281 c11281) {
                            this.zzagM = c11281;
                        }

                        public void run() {
                            if (this.zzagM.zzagL.zzagJ.callServiceStopSelfResult(i2)) {
                                zznS.zzbP("Local AnalyticsService processed last dispatch request");
                            }
                        }
                    }

                    public void zzf(Throwable th) {
                        this.zzagL.mHandler.post(new C06761(this));
                    }
                });
            }
        }
        return 2;
    }
}
