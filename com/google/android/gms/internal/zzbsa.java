package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbsc.zza;

public class zzbsa extends zzbrz<zzbsa> {
    private final long value;

    public zzbsa(Long l, zzbsc com_google_android_gms_internal_zzbsc) {
        super(com_google_android_gms_internal_zzbsc);
        this.value = l.longValue();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zzbsa)) {
            return false;
        }
        zzbsa com_google_android_gms_internal_zzbsa = (zzbsa) obj;
        return this.value == com_google_android_gms_internal_zzbsa.value && this.zzcjb.equals(com_google_android_gms_internal_zzbsa.zzcjb);
    }

    public Object getValue() {
        return Long.valueOf(this.value);
    }

    public int hashCode() {
        return ((int) (this.value ^ (this.value >>> 32))) + this.zzcjb.hashCode();
    }

    protected int zza(zzbsa com_google_android_gms_internal_zzbsa) {
        return zzbte.zzl(this.value, com_google_android_gms_internal_zzbsa.value);
    }

    public String zza(zza com_google_android_gms_internal_zzbsc_zza) {
        String valueOf = String.valueOf(String.valueOf(zzb(com_google_android_gms_internal_zzbsc_zza)).concat("number:"));
        String valueOf2 = String.valueOf(zzbte.zzl((double) this.value));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    protected zza zzaaE() {
        return zza.Number;
    }

    public /* synthetic */ zzbsc zzg(zzbsc com_google_android_gms_internal_zzbsc) {
        return zzp(com_google_android_gms_internal_zzbsc);
    }

    public zzbsa zzp(zzbsc com_google_android_gms_internal_zzbsc) {
        return new zzbsa(Long.valueOf(this.value), com_google_android_gms_internal_zzbsc);
    }
}
