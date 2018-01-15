package com.google.android.gms.internal;

public class zzbsb {
    private static final zzbsb zzcjD = new zzbsb(zzbrq.zzaaF(), zzbrv.zzaaY());
    private static final zzbsb zzcjE = new zzbsb(zzbrq.zzaaG(), zzbsc.zzcjF);
    private final zzbrq zzchH;
    private final zzbsc zzcju;

    public zzbsb(zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc) {
        this.zzchH = com_google_android_gms_internal_zzbrq;
        this.zzcju = com_google_android_gms_internal_zzbsc;
    }

    public static zzbsb zzabg() {
        return zzcjD;
    }

    public static zzbsb zzabh() {
        return zzcjE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzbsb com_google_android_gms_internal_zzbsb = (zzbsb) obj;
        return !this.zzchH.equals(com_google_android_gms_internal_zzbsb.zzchH) ? false : this.zzcju.equals(com_google_android_gms_internal_zzbsb.zzcju);
    }

    public int hashCode() {
        return (this.zzchH.hashCode() * 31) + this.zzcju.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.zzchH);
        String valueOf2 = String.valueOf(this.zzcju);
        return new StringBuilder((String.valueOf(valueOf).length() + 23) + String.valueOf(valueOf2).length()).append("NamedNode{name=").append(valueOf).append(", node=").append(valueOf2).append("}").toString();
    }

    public zzbsc zzWH() {
        return this.zzcju;
    }

    public zzbrq zzabi() {
        return this.zzchH;
    }
}
