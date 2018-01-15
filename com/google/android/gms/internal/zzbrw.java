package com.google.android.gms.internal;

import java.util.Comparator;

public abstract class zzbrw implements Comparator<zzbsb> {
    public static zzbrw zzjb(String str) {
        if (str.equals(".value")) {
            return zzbsj.zzabl();
        }
        if (str.equals(".key")) {
            return zzbry.zzabf();
        }
        if (!str.equals(".priority")) {
            return new zzbse(new zzbph(str));
        }
        throw new IllegalStateException("queryDefinition shouldn't ever be .priority since it's the default");
    }

    public int zza(zzbsb com_google_android_gms_internal_zzbsb, zzbsb com_google_android_gms_internal_zzbsb2, boolean z) {
        return z ? compare(com_google_android_gms_internal_zzbsb2, com_google_android_gms_internal_zzbsb) : compare(com_google_android_gms_internal_zzbsb, com_google_android_gms_internal_zzbsb2);
    }

    public boolean zza(zzbsc com_google_android_gms_internal_zzbsc, zzbsc com_google_android_gms_internal_zzbsc2) {
        return compare(new zzbsb(zzbrq.zzaaF(), com_google_android_gms_internal_zzbsc), new zzbsb(zzbrq.zzaaF(), com_google_android_gms_internal_zzbsc2)) != 0;
    }

    public zzbsb zzaaZ() {
        return zzbsb.zzabg();
    }

    public abstract zzbsb zzaba();

    public abstract String zzabb();

    public abstract zzbsb zzg(zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc);

    public abstract boolean zzm(zzbsc com_google_android_gms_internal_zzbsc);
}
