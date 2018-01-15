package com.google.android.gms.internal;

public class zzbpk {
    public String zzaGP;
    public String zzcbM;
    public boolean zzcbN;
    public String zzcfy;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzbpk com_google_android_gms_internal_zzbpk = (zzbpk) obj;
        return (this.zzcbN == com_google_android_gms_internal_zzbpk.zzcbN && this.zzcbM.equals(com_google_android_gms_internal_zzbpk.zzcbM)) ? this.zzaGP.equals(com_google_android_gms_internal_zzbpk.zzaGP) : false;
    }

    public int hashCode() {
        return (((this.zzcbN ? 1 : 0) + (this.zzcbM.hashCode() * 31)) * 31) + this.zzaGP.hashCode();
    }

    public String toString() {
        String str = this.zzcbN ? "s" : "";
        String str2 = this.zzcbM;
        return new StringBuilder((String.valueOf(str).length() + 7) + String.valueOf(str2).length()).append("http").append(str).append("://").append(str2).toString();
    }
}
