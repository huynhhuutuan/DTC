package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbsc.zza;

public class zzbsi extends zzbrz<zzbsi> {
    private final String value;

    public zzbsi(String str, zzbsc com_google_android_gms_internal_zzbsc) {
        super(com_google_android_gms_internal_zzbsc);
        this.value = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zzbsi)) {
            return false;
        }
        zzbsi com_google_android_gms_internal_zzbsi = (zzbsi) obj;
        return this.value.equals(com_google_android_gms_internal_zzbsi.value) && this.zzcjb.equals(com_google_android_gms_internal_zzbsi.zzcjb);
    }

    public Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + this.zzcjb.hashCode();
    }

    protected int zza(zzbsi com_google_android_gms_internal_zzbsi) {
        return this.value.compareTo(com_google_android_gms_internal_zzbsi.value);
    }

    public String zza(zza com_google_android_gms_internal_zzbsc_zza) {
        String valueOf;
        String str;
        switch (com_google_android_gms_internal_zzbsc_zza) {
            case V1:
                valueOf = String.valueOf(zzb(com_google_android_gms_internal_zzbsc_zza));
                str = this.value;
                return new StringBuilder((String.valueOf(valueOf).length() + 7) + String.valueOf(str).length()).append(valueOf).append("string:").append(str).toString();
            case V2:
                valueOf = String.valueOf(zzb(com_google_android_gms_internal_zzbsc_zza));
                str = String.valueOf(zzbte.zzji(this.value));
                return new StringBuilder((String.valueOf(valueOf).length() + 7) + String.valueOf(str).length()).append(valueOf).append("string:").append(str).toString();
            default:
                str = String.valueOf(com_google_android_gms_internal_zzbsc_zza);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 38).append("Invalid hash version for string node: ").append(str).toString());
        }
    }

    protected zza zzaaE() {
        return zza.String;
    }

    public /* synthetic */ zzbsc zzg(zzbsc com_google_android_gms_internal_zzbsc) {
        return zzs(com_google_android_gms_internal_zzbsc);
    }

    public zzbsi zzs(zzbsc com_google_android_gms_internal_zzbsc) {
        return new zzbsi(this.value, com_google_android_gms_internal_zzbsc);
    }
}
