package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zze;
import java.util.concurrent.Future;

@zzme
public class zzjg {

    private static class zza<JavascriptEngine> extends zzqj<JavascriptEngine> {
        JavascriptEngine zzJD;

        private zza() {
        }
    }

    private zzjf zza(Context context, zzqh com_google_android_gms_internal_zzqh, final zza<zzjf> com_google_android_gms_internal_zzjg_zza_com_google_android_gms_internal_zzjf, zzaw com_google_android_gms_internal_zzaw, zze com_google_android_gms_ads_internal_zze) {
        zzjf com_google_android_gms_internal_zzjh = new zzjh(context, com_google_android_gms_internal_zzqh, com_google_android_gms_internal_zzaw, com_google_android_gms_ads_internal_zze);
        com_google_android_gms_internal_zzjg_zza_com_google_android_gms_internal_zzjf.zzJD = com_google_android_gms_internal_zzjh;
        com_google_android_gms_internal_zzjh.zza(new com.google.android.gms.internal.zzjf.zza(this) {
            public void zzgN() {
                com_google_android_gms_internal_zzjg_zza_com_google_android_gms_internal_zzjf.zzh((zzjf) com_google_android_gms_internal_zzjg_zza_com_google_android_gms_internal_zzjf.zzJD);
            }
        });
        return com_google_android_gms_internal_zzjh;
    }

    public Future<zzjf> zza(Context context, zzqh com_google_android_gms_internal_zzqh, String str, zzaw com_google_android_gms_internal_zzaw, zze com_google_android_gms_ads_internal_zze) {
        final Future com_google_android_gms_internal_zzjg_zza = new zza();
        final Context context2 = context;
        final zzqh com_google_android_gms_internal_zzqh2 = com_google_android_gms_internal_zzqh;
        final zzaw com_google_android_gms_internal_zzaw2 = com_google_android_gms_internal_zzaw;
        final zze com_google_android_gms_ads_internal_zze2 = com_google_android_gms_ads_internal_zze;
        final String str2 = str;
        zzpo.zzXC.post(new Runnable(this) {
            final /* synthetic */ zzjg zzJC;

            public void run() {
                this.zzJC.zza(context2, com_google_android_gms_internal_zzqh2, com_google_android_gms_internal_zzjg_zza, com_google_android_gms_internal_zzaw2, com_google_android_gms_ads_internal_zze2).zzan(str2);
            }
        });
        return com_google_android_gms_internal_zzjg_zza;
    }
}
