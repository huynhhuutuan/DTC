package com.google.android.gms.internal;

public class zzbqu {
    private final zzbrx zzchM;
    private final boolean zzchN;
    private final boolean zzchO;

    public zzbqu(zzbrx com_google_android_gms_internal_zzbrx, boolean z, boolean z2) {
        this.zzchM = com_google_android_gms_internal_zzbrx;
        this.zzchN = z;
        this.zzchO = z2;
    }

    public boolean zzM(zzbph com_google_android_gms_internal_zzbph) {
        return com_google_android_gms_internal_zzbph.isEmpty() ? zzZP() && !this.zzchO : zzf(com_google_android_gms_internal_zzbph.zzYR());
    }

    public zzbsc zzWH() {
        return this.zzchM.zzWH();
    }

    public boolean zzZP() {
        return this.zzchN;
    }

    public boolean zzZQ() {
        return this.zzchO;
    }

    public zzbrx zzZR() {
        return this.zzchM;
    }

    public boolean zzf(zzbrq com_google_android_gms_internal_zzbrq) {
        return (zzZP() && !this.zzchO) || this.zzchM.zzWH().zzk(com_google_android_gms_internal_zzbrq);
    }
}
