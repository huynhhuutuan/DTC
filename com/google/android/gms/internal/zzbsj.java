package com.google.android.gms.internal;

public class zzbsj extends zzbrw {
    private static final zzbsj zzcjO = new zzbsj();

    private zzbsj() {
    }

    public static zzbsj zzabl() {
        return zzcjO;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return zza((zzbsb) obj, (zzbsb) obj2);
    }

    public boolean equals(Object obj) {
        return obj instanceof zzbsj;
    }

    public int hashCode() {
        return 4;
    }

    public String toString() {
        return "ValueIndex";
    }

    public int zza(zzbsb com_google_android_gms_internal_zzbsb, zzbsb com_google_android_gms_internal_zzbsb2) {
        int compareTo = com_google_android_gms_internal_zzbsb.zzWH().compareTo(com_google_android_gms_internal_zzbsb2.zzWH());
        return compareTo == 0 ? com_google_android_gms_internal_zzbsb.zzabi().zzi(com_google_android_gms_internal_zzbsb2.zzabi()) : compareTo;
    }

    public zzbsb zzaba() {
        return new zzbsb(zzbrq.zzaaG(), zzbsc.zzcjF);
    }

    public String zzabb() {
        return ".value";
    }

    public zzbsb zzg(zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc) {
        return new zzbsb(com_google_android_gms_internal_zzbrq, com_google_android_gms_internal_zzbsc);
    }

    public boolean zzm(zzbsc com_google_android_gms_internal_zzbsc) {
        return true;
    }
}
