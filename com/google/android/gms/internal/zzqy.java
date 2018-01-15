package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.internal.zzw;
import java.util.concurrent.Callable;

@zzme
public class zzqy {
    public zzqw zza(Context context, zzeg com_google_android_gms_internal_zzeg, boolean z, boolean z2, @Nullable zzaw com_google_android_gms_internal_zzaw, zzqh com_google_android_gms_internal_zzqh) {
        final Context context2 = context;
        final zzeg com_google_android_gms_internal_zzeg2 = com_google_android_gms_internal_zzeg;
        final boolean z3 = z;
        final boolean z4 = z2;
        final zzaw com_google_android_gms_internal_zzaw2 = com_google_android_gms_internal_zzaw;
        final zzqh com_google_android_gms_internal_zzqh2 = com_google_android_gms_internal_zzqh;
        return (zzqw) zzqb.zzb(new Callable<zzqw>(this) {
            final /* synthetic */ zzqy zzZU;

            public /* synthetic */ Object call() throws Exception {
                return zzma();
            }

            public zzqw zzma() {
                return this.zzZU.zza(context2, com_google_android_gms_internal_zzeg2, z3, z4, com_google_android_gms_internal_zzaw2, com_google_android_gms_internal_zzqh2, null, null, null);
            }
        });
    }

    public zzqw zza(Context context, zzeg com_google_android_gms_internal_zzeg, boolean z, boolean z2, @Nullable zzaw com_google_android_gms_internal_zzaw, zzqh com_google_android_gms_internal_zzqh, zzgl com_google_android_gms_internal_zzgl, zzu com_google_android_gms_ads_internal_zzu, zze com_google_android_gms_ads_internal_zze) {
        final Context context2 = context;
        final zzeg com_google_android_gms_internal_zzeg2 = com_google_android_gms_internal_zzeg;
        final boolean z3 = z;
        final boolean z4 = z2;
        final zzaw com_google_android_gms_internal_zzaw2 = com_google_android_gms_internal_zzaw;
        final zzqh com_google_android_gms_internal_zzqh2 = com_google_android_gms_internal_zzqh;
        final zzgl com_google_android_gms_internal_zzgl2 = com_google_android_gms_internal_zzgl;
        final zzu com_google_android_gms_ads_internal_zzu2 = com_google_android_gms_ads_internal_zzu;
        final zze com_google_android_gms_ads_internal_zze2 = com_google_android_gms_ads_internal_zze;
        return (zzqw) zzqb.zzb(new Callable<zzqw>(this) {
            public /* synthetic */ Object call() throws Exception {
                return zzma();
            }

            public zzqw zzma() {
                zzqw com_google_android_gms_internal_zzqz = new zzqz(zzra.zzb(context2, com_google_android_gms_internal_zzeg2, z3, z4, com_google_android_gms_internal_zzaw2, com_google_android_gms_internal_zzqh2, com_google_android_gms_internal_zzgl2, com_google_android_gms_ads_internal_zzu2, com_google_android_gms_ads_internal_zze2));
                com_google_android_gms_internal_zzqz.setWebViewClient(zzw.zzcO().zzb(com_google_android_gms_internal_zzqz, z4));
                com_google_android_gms_internal_zzqz.setWebChromeClient(zzw.zzcO().zzn(com_google_android_gms_internal_zzqz));
                return com_google_android_gms_internal_zzqz;
            }
        });
    }
}
