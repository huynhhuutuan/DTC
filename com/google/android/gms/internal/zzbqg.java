package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbqe.zza;

public class zzbqg extends zzbqe {
    private final zzbsc zzchd;

    public zzbqg(zzbqf com_google_android_gms_internal_zzbqf, zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc) {
        super(zza.Overwrite, com_google_android_gms_internal_zzbqf, com_google_android_gms_internal_zzbph);
        this.zzchd = com_google_android_gms_internal_zzbsc;
    }

    public String toString() {
        return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", new Object[]{zzWL(), zzZx(), this.zzchd});
    }

    public zzbsc zzZD() {
        return this.zzchd;
    }

    public zzbqe zzc(zzbrq com_google_android_gms_internal_zzbrq) {
        return this.zzcak.isEmpty() ? new zzbqg(this.zzcgP, zzbph.zzYO(), this.zzchd.zzm(com_google_android_gms_internal_zzbrq)) : new zzbqg(this.zzcgP, this.zzcak.zzYS(), this.zzchd);
    }
}
