package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbsc.zza;

public class zzbru extends zzbrz<zzbru> {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbru.class.desiredAssertionStatus());
    private final Double zzcjr;

    public zzbru(Double d, zzbsc com_google_android_gms_internal_zzbsc) {
        super(com_google_android_gms_internal_zzbsc);
        this.zzcjr = d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zzbru)) {
            return false;
        }
        zzbru com_google_android_gms_internal_zzbru = (zzbru) obj;
        return this.zzcjr.equals(com_google_android_gms_internal_zzbru.zzcjr) && this.zzcjb.equals(com_google_android_gms_internal_zzbru.zzcjb);
    }

    public Object getValue() {
        return this.zzcjr;
    }

    public int hashCode() {
        return this.zzcjr.hashCode() + this.zzcjb.hashCode();
    }

    protected int zza(zzbru com_google_android_gms_internal_zzbru) {
        return this.zzcjr.compareTo(com_google_android_gms_internal_zzbru.zzcjr);
    }

    public String zza(zza com_google_android_gms_internal_zzbsc_zza) {
        String valueOf = String.valueOf(String.valueOf(zzb(com_google_android_gms_internal_zzbsc_zza)).concat("number:"));
        String valueOf2 = String.valueOf(zzbte.zzl(this.zzcjr.doubleValue()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    protected zza zzaaE() {
        return zza.Number;
    }

    public /* synthetic */ zzbsc zzg(zzbsc com_google_android_gms_internal_zzbsc) {
        return zzk(com_google_android_gms_internal_zzbsc);
    }

    public zzbru zzk(zzbsc com_google_android_gms_internal_zzbsc) {
        if ($assertionsDisabled || zzbsg.zzq(com_google_android_gms_internal_zzbsc)) {
            return new zzbru(this.zzcjr, com_google_android_gms_internal_zzbsc);
        }
        throw new AssertionError();
    }
}
