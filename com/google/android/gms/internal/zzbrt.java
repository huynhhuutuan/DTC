package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbsc.zza;
import java.util.Map;

public class zzbrt extends zzbrz<zzbrt> {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbrt.class.desiredAssertionStatus());
    private Map<Object, Object> zzcjq;

    public zzbrt(Map<Object, Object> map, zzbsc com_google_android_gms_internal_zzbsc) {
        super(com_google_android_gms_internal_zzbsc);
        this.zzcjq = map;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zzbrt)) {
            return false;
        }
        zzbrt com_google_android_gms_internal_zzbrt = (zzbrt) obj;
        return this.zzcjq.equals(com_google_android_gms_internal_zzbrt.zzcjq) && this.zzcjb.equals(com_google_android_gms_internal_zzbrt.zzcjb);
    }

    public Object getValue() {
        return this.zzcjq;
    }

    public int hashCode() {
        return this.zzcjq.hashCode() + this.zzcjb.hashCode();
    }

    public String zza(zza com_google_android_gms_internal_zzbsc_zza) {
        String valueOf = String.valueOf(zzb(com_google_android_gms_internal_zzbsc_zza));
        String valueOf2 = String.valueOf(this.zzcjq);
        return new StringBuilder((String.valueOf(valueOf).length() + 14) + String.valueOf(valueOf2).length()).append(valueOf).append("deferredValue:").append(valueOf2).toString();
    }

    protected zza zzaaE() {
        return zza.DeferredValue;
    }

    public /* synthetic */ zzbsc zzg(zzbsc com_google_android_gms_internal_zzbsc) {
        return zzj(com_google_android_gms_internal_zzbsc);
    }

    public zzbrt zzj(zzbsc com_google_android_gms_internal_zzbsc) {
        if ($assertionsDisabled || zzbsg.zzq(com_google_android_gms_internal_zzbsc)) {
            return new zzbrt(this.zzcjq, com_google_android_gms_internal_zzbsc);
        }
        throw new AssertionError();
    }
}
