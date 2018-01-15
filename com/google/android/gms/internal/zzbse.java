package com.google.android.gms.internal;

public class zzbse extends zzbrw {
    private final zzbph zzcjJ;

    public zzbse(zzbph com_google_android_gms_internal_zzbph) {
        if (com_google_android_gms_internal_zzbph.size() == 1 && com_google_android_gms_internal_zzbph.zzYR().zzaaJ()) {
            throw new IllegalArgumentException("Can't create PathIndex with '.priority' as key. Please use PriorityIndex instead!");
        }
        this.zzcjJ = com_google_android_gms_internal_zzbph;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return zza((zzbsb) obj, (zzbsb) obj2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zzcjJ.equals(((zzbse) obj).zzcjJ);
    }

    public int hashCode() {
        return this.zzcjJ.hashCode();
    }

    public int zza(zzbsb com_google_android_gms_internal_zzbsb, zzbsb com_google_android_gms_internal_zzbsb2) {
        int compareTo = com_google_android_gms_internal_zzbsb.zzWH().zzO(this.zzcjJ).compareTo(com_google_android_gms_internal_zzbsb2.zzWH().zzO(this.zzcjJ));
        return compareTo == 0 ? com_google_android_gms_internal_zzbsb.zzabi().zzi(com_google_android_gms_internal_zzbsb2.zzabi()) : compareTo;
    }

    public zzbsb zzaba() {
        return new zzbsb(zzbrq.zzaaG(), zzbrv.zzaaY().zzl(this.zzcjJ, zzbsc.zzcjF));
    }

    public String zzabb() {
        return this.zzcjJ.zzYP();
    }

    public zzbsb zzg(zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc) {
        return new zzbsb(com_google_android_gms_internal_zzbrq, zzbrv.zzaaY().zzl(this.zzcjJ, com_google_android_gms_internal_zzbsc));
    }

    public boolean zzm(zzbsc com_google_android_gms_internal_zzbsc) {
        return !com_google_android_gms_internal_zzbsc.zzO(this.zzcjJ).isEmpty();
    }
}
