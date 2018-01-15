package com.google.android.gms.internal;

public class zzbre {
    private final zzbqu zzciA;
    private final zzbqu zzciB;

    public zzbre(zzbqu com_google_android_gms_internal_zzbqu, zzbqu com_google_android_gms_internal_zzbqu2) {
        this.zzciA = com_google_android_gms_internal_zzbqu;
        this.zzciB = com_google_android_gms_internal_zzbqu2;
    }

    public zzbre zza(zzbrx com_google_android_gms_internal_zzbrx, boolean z, boolean z2) {
        return new zzbre(new zzbqu(com_google_android_gms_internal_zzbrx, z, z2), this.zzciB);
    }

    public zzbqu zzaat() {
        return this.zzciA;
    }

    public zzbsc zzaau() {
        return this.zzciA.zzZP() ? this.zzciA.zzWH() : null;
    }

    public zzbqu zzaav() {
        return this.zzciB;
    }

    public zzbsc zzaaw() {
        return this.zzciB.zzZP() ? this.zzciB.zzWH() : null;
    }

    public zzbre zzb(zzbrx com_google_android_gms_internal_zzbrx, boolean z, boolean z2) {
        return new zzbre(this.zzciA, new zzbqu(com_google_android_gms_internal_zzbrx, z, z2));
    }
}
