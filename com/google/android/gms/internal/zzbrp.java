package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbsc.zza;

public class zzbrp extends zzbrz<zzbrp> {
    private final boolean value;

    public zzbrp(Boolean bool, zzbsc com_google_android_gms_internal_zzbsc) {
        super(com_google_android_gms_internal_zzbsc);
        this.value = bool.booleanValue();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zzbrp)) {
            return false;
        }
        zzbrp com_google_android_gms_internal_zzbrp = (zzbrp) obj;
        return this.value == com_google_android_gms_internal_zzbrp.value && this.zzcjb.equals(com_google_android_gms_internal_zzbrp.zzcjb);
    }

    public Object getValue() {
        return Boolean.valueOf(this.value);
    }

    public int hashCode() {
        return (this.value ? 1 : 0) + this.zzcjb.hashCode();
    }

    protected int zza(zzbrp com_google_android_gms_internal_zzbrp) {
        return this.value == com_google_android_gms_internal_zzbrp.value ? 0 : this.value ? 1 : -1;
    }

    public String zza(zza com_google_android_gms_internal_zzbsc_zza) {
        String valueOf = String.valueOf(zzb(com_google_android_gms_internal_zzbsc_zza));
        return new StringBuilder(String.valueOf(valueOf).length() + 13).append(valueOf).append("boolean:").append(this.value).toString();
    }

    protected zza zzaaE() {
        return zza.Boolean;
    }

    public zzbrp zzf(zzbsc com_google_android_gms_internal_zzbsc) {
        return new zzbrp(Boolean.valueOf(this.value), com_google_android_gms_internal_zzbsc);
    }

    public /* synthetic */ zzbsc zzg(zzbsc com_google_android_gms_internal_zzbsc) {
        return zzf(com_google_android_gms_internal_zzbsc);
    }
}
