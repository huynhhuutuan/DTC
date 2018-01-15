package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbqy.zza;

public class zzbqw {
    private final zzbrx zzchM;
    private final zza zzchR;
    private final zzbrx zzchS;
    private final zzbrq zzchT;
    private final zzbrq zzchU;

    private zzbqw(zza com_google_android_gms_internal_zzbqy_zza, zzbrx com_google_android_gms_internal_zzbrx, zzbrq com_google_android_gms_internal_zzbrq, zzbrq com_google_android_gms_internal_zzbrq2, zzbrx com_google_android_gms_internal_zzbrx2) {
        this.zzchR = com_google_android_gms_internal_zzbqy_zza;
        this.zzchM = com_google_android_gms_internal_zzbrx;
        this.zzchT = com_google_android_gms_internal_zzbrq;
        this.zzchU = com_google_android_gms_internal_zzbrq2;
        this.zzchS = com_google_android_gms_internal_zzbrx2;
    }

    public static zzbqw zza(zzbrq com_google_android_gms_internal_zzbrq, zzbrx com_google_android_gms_internal_zzbrx) {
        return new zzbqw(zza.CHILD_ADDED, com_google_android_gms_internal_zzbrx, com_google_android_gms_internal_zzbrq, null, null);
    }

    public static zzbqw zza(zzbrq com_google_android_gms_internal_zzbrq, zzbrx com_google_android_gms_internal_zzbrx, zzbrx com_google_android_gms_internal_zzbrx2) {
        return new zzbqw(zza.CHILD_CHANGED, com_google_android_gms_internal_zzbrx, com_google_android_gms_internal_zzbrq, null, com_google_android_gms_internal_zzbrx2);
    }

    public static zzbqw zza(zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc, zzbsc com_google_android_gms_internal_zzbsc2) {
        return zza(com_google_android_gms_internal_zzbrq, zzbrx.zzn(com_google_android_gms_internal_zzbsc), zzbrx.zzn(com_google_android_gms_internal_zzbsc2));
    }

    public static zzbqw zza(zzbrx com_google_android_gms_internal_zzbrx) {
        return new zzbqw(zza.VALUE, com_google_android_gms_internal_zzbrx, null, null, null);
    }

    public static zzbqw zzb(zzbrq com_google_android_gms_internal_zzbrq, zzbrx com_google_android_gms_internal_zzbrx) {
        return new zzbqw(zza.CHILD_REMOVED, com_google_android_gms_internal_zzbrx, com_google_android_gms_internal_zzbrq, null, null);
    }

    public static zzbqw zzc(zzbrq com_google_android_gms_internal_zzbrq, zzbrx com_google_android_gms_internal_zzbrx) {
        return new zzbqw(zza.CHILD_MOVED, com_google_android_gms_internal_zzbrx, com_google_android_gms_internal_zzbrq, null, null);
    }

    public static zzbqw zzc(zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc) {
        return zza(com_google_android_gms_internal_zzbrq, zzbrx.zzn(com_google_android_gms_internal_zzbsc));
    }

    public static zzbqw zzd(zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc) {
        return zzb(com_google_android_gms_internal_zzbrq, zzbrx.zzn(com_google_android_gms_internal_zzbsc));
    }

    public String toString() {
        String valueOf = String.valueOf(this.zzchR);
        String valueOf2 = String.valueOf(this.zzchT);
        return new StringBuilder((String.valueOf(valueOf).length() + 9) + String.valueOf(valueOf2).length()).append("Change: ").append(valueOf).append(" ").append(valueOf2).toString();
    }

    public zzbrx zzZR() {
        return this.zzchM;
    }

    public zzbrq zzZT() {
        return this.zzchT;
    }

    public zza zzZU() {
        return this.zzchR;
    }

    public zzbrq zzZV() {
        return this.zzchU;
    }

    public zzbrx zzZW() {
        return this.zzchS;
    }

    public zzbqw zzg(zzbrq com_google_android_gms_internal_zzbrq) {
        return new zzbqw(this.zzchR, this.zzchM, this.zzchT, com_google_android_gms_internal_zzbrq, this.zzchS);
    }
}
