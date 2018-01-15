package com.google.android.gms.internal;

public class zzbsf extends zzbrw {
    private static final zzbsf zzcjK = new zzbsf();

    private zzbsf() {
    }

    public static zzbsf zzabj() {
        return zzcjK;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return zza((zzbsb) obj, (zzbsb) obj2);
    }

    public boolean equals(Object obj) {
        return obj instanceof zzbsf;
    }

    public int hashCode() {
        return 3155577;
    }

    public String toString() {
        return "PriorityIndex";
    }

    public int zza(zzbsb com_google_android_gms_internal_zzbsb, zzbsb com_google_android_gms_internal_zzbsb2) {
        return zzbsd.zza(com_google_android_gms_internal_zzbsb.zzabi(), com_google_android_gms_internal_zzbsb.zzWH().zzaaN(), com_google_android_gms_internal_zzbsb2.zzabi(), com_google_android_gms_internal_zzbsb2.zzWH().zzaaN());
    }

    public zzbsb zzaba() {
        return zzg(zzbrq.zzaaG(), zzbsc.zzcjF);
    }

    public String zzabb() {
        throw new IllegalArgumentException("Can't get query definition on priority index!");
    }

    public zzbsb zzg(zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc) {
        return new zzbsb(com_google_android_gms_internal_zzbrq, new zzbsi("[PRIORITY-POST]", com_google_android_gms_internal_zzbsc));
    }

    public boolean zzm(zzbsc com_google_android_gms_internal_zzbsc) {
        return !com_google_android_gms_internal_zzbsc.zzaaN().isEmpty();
    }
}
