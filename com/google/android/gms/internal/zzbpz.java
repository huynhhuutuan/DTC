package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;

public class zzbpz {
    private final zzbph zzcgH;
    private final zzbpy zzcgI;

    public zzbpz(zzbph com_google_android_gms_internal_zzbph, zzbpy com_google_android_gms_internal_zzbpy) {
        this.zzcgH = com_google_android_gms_internal_zzbph;
        this.zzcgI = com_google_android_gms_internal_zzbpy;
    }

    public zzbsb zza(zzbsc com_google_android_gms_internal_zzbsc, zzbsb com_google_android_gms_internal_zzbsb, boolean z, zzbrw com_google_android_gms_internal_zzbrw) {
        return this.zzcgI.zza(this.zzcgH, com_google_android_gms_internal_zzbsc, com_google_android_gms_internal_zzbsb, z, com_google_android_gms_internal_zzbrw);
    }

    public zzbsc zza(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc, zzbsc com_google_android_gms_internal_zzbsc2) {
        return this.zzcgI.zza(this.zzcgH, com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzbsc, com_google_android_gms_internal_zzbsc2);
    }

    public zzbsc zza(zzbrq com_google_android_gms_internal_zzbrq, zzbqu com_google_android_gms_internal_zzbqu) {
        return this.zzcgI.zza(this.zzcgH, com_google_android_gms_internal_zzbrq, com_google_android_gms_internal_zzbqu);
    }

    public zzbsc zza(zzbsc com_google_android_gms_internal_zzbsc, List<Long> list) {
        return zza(com_google_android_gms_internal_zzbsc, (List) list, false);
    }

    public zzbsc zza(zzbsc com_google_android_gms_internal_zzbsc, List<Long> list, boolean z) {
        return this.zzcgI.zza(this.zzcgH, com_google_android_gms_internal_zzbsc, (List) list, z);
    }

    public zzbpz zzb(zzbrq com_google_android_gms_internal_zzbrq) {
        return new zzbpz(this.zzcgH.zza(com_google_android_gms_internal_zzbrq), this.zzcgI);
    }

    public zzbsc zzc(zzbsc com_google_android_gms_internal_zzbsc) {
        return zza(com_google_android_gms_internal_zzbsc, Collections.emptyList());
    }

    public zzbsc zzd(zzbsc com_google_android_gms_internal_zzbsc) {
        return this.zzcgI.zzj(this.zzcgH, com_google_android_gms_internal_zzbsc);
    }

    public zzbsc zzv(zzbph com_google_android_gms_internal_zzbph) {
        return this.zzcgI.zzv(this.zzcgH.zzh(com_google_android_gms_internal_zzbph));
    }
}
