package com.google.android.gms.internal;

public class zzbry extends zzbrw {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbry.class.desiredAssertionStatus());
    private static final zzbry zzcjw = new zzbry();

    private zzbry() {
    }

    public static zzbry zzabf() {
        return zzcjw;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return zza((zzbsb) obj, (zzbsb) obj2);
    }

    public boolean equals(Object obj) {
        return obj instanceof zzbry;
    }

    public int hashCode() {
        return 37;
    }

    public String toString() {
        return "KeyIndex";
    }

    public int zza(zzbsb com_google_android_gms_internal_zzbsb, zzbsb com_google_android_gms_internal_zzbsb2) {
        return com_google_android_gms_internal_zzbsb.zzabi().zzi(com_google_android_gms_internal_zzbsb2.zzabi());
    }

    public zzbsb zzaba() {
        return zzbsb.zzabh();
    }

    public String zzabb() {
        return ".key";
    }

    public zzbsb zzg(zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc) {
        if ($assertionsDisabled || (com_google_android_gms_internal_zzbsc instanceof zzbsi)) {
            return new zzbsb(zzbrq.zzja((String) com_google_android_gms_internal_zzbsc.getValue()), zzbrv.zzaaY());
        }
        throw new AssertionError();
    }

    public boolean zzm(zzbsc com_google_android_gms_internal_zzbsc) {
        return true;
    }
}
