package com.google.android.gms.internal;

import java.util.Map;

public class zzbrc {
    private final zzbph zzcak;
    private final zzbrb zzcao;

    public zzbrc(zzbph com_google_android_gms_internal_zzbph, zzbrb com_google_android_gms_internal_zzbrb) {
        this.zzcak = com_google_android_gms_internal_zzbph;
        this.zzcao = com_google_android_gms_internal_zzbrb;
    }

    public static zzbrc zzN(zzbph com_google_android_gms_internal_zzbph) {
        return new zzbrc(com_google_android_gms_internal_zzbph, zzbrb.zzcii);
    }

    public static zzbrc zzb(zzbph com_google_android_gms_internal_zzbph, Map<String, Object> map) {
        return new zzbrc(com_google_android_gms_internal_zzbph, zzbrb.zzaE(map));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzbrc com_google_android_gms_internal_zzbrc = (zzbrc) obj;
        return !this.zzcak.equals(com_google_android_gms_internal_zzbrc.zzcak) ? false : this.zzcao.equals(com_google_android_gms_internal_zzbrc.zzcao);
    }

    public int hashCode() {
        return (this.zzcak.hashCode() * 31) + this.zzcao.hashCode();
    }

    public boolean isDefault() {
        return this.zzcao.isDefault();
    }

    public String toString() {
        String valueOf = String.valueOf(this.zzcak);
        String valueOf2 = String.valueOf(this.zzcao);
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(":").append(valueOf2).toString();
    }

    public zzbph zzWL() {
        return this.zzcak;
    }

    public zzbrw zzaai() {
        return this.zzcao.zzaai();
    }

    public boolean zzaam() {
        return this.zzcao.zzaam();
    }

    public zzbrb zzaap() {
        return this.zzcao;
    }
}
