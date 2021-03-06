package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzak.zza;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

class zzdp {
    private static zzce<zza> zza(zzce<zza> com_google_android_gms_tagmanager_zzce_com_google_android_gms_internal_zzak_zza) {
        try {
            return new zzce(zzdl.zzR(zzhD(zzdl.zze((zza) com_google_android_gms_tagmanager_zzce_com_google_android_gms_internal_zzak_zza.getObject()))), com_google_android_gms_tagmanager_zzce_com_google_android_gms_internal_zzak_zza.zzQY());
        } catch (Throwable e) {
            zzbo.zzb("Escape URI: unsupported encoding", e);
            return com_google_android_gms_tagmanager_zzce_com_google_android_gms_internal_zzak_zza;
        }
    }

    private static zzce<zza> zza(zzce<zza> com_google_android_gms_tagmanager_zzce_com_google_android_gms_internal_zzak_zza, int i) {
        if (zzl((zza) com_google_android_gms_tagmanager_zzce_com_google_android_gms_internal_zzak_zza.getObject())) {
            switch (i) {
                case 12:
                    return zza(com_google_android_gms_tagmanager_zzce_com_google_android_gms_internal_zzak_zza);
                default:
                    zzbo.m11e("Unsupported Value Escaping: " + i);
                    return com_google_android_gms_tagmanager_zzce_com_google_android_gms_internal_zzak_zza;
            }
        }
        zzbo.m11e("Escaping can only be applied to strings.");
        return com_google_android_gms_tagmanager_zzce_com_google_android_gms_internal_zzak_zza;
    }

    static zzce<zza> zza(zzce<zza> com_google_android_gms_tagmanager_zzce_com_google_android_gms_internal_zzak_zza, int... iArr) {
        zzce zza;
        for (int zza2 : iArr) {
            zza = zza(zza, zza2);
        }
        return zza;
    }

    static String zzhD(String str) throws UnsupportedEncodingException {
        return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
    }

    private static boolean zzl(zza com_google_android_gms_internal_zzak_zza) {
        return zzdl.zzj(com_google_android_gms_internal_zzak_zza) instanceof String;
    }
}
