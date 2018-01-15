package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbqe.zza;

public class zzbqd extends zzbqe {
    private final zzboy zzcgN;

    public zzbqd(zzbqf com_google_android_gms_internal_zzbqf, zzbph com_google_android_gms_internal_zzbph, zzboy com_google_android_gms_internal_zzboy) {
        super(zza.Merge, com_google_android_gms_internal_zzbqf, com_google_android_gms_internal_zzbph);
        this.zzcgN = com_google_android_gms_internal_zzboy;
    }

    public String toString() {
        return String.format("Merge { path=%s, source=%s, children=%s }", new Object[]{zzWL(), zzZx(), this.zzcgN});
    }

    public zzboy zzZw() {
        return this.zzcgN;
    }

    public zzbqe zzc(zzbrq com_google_android_gms_internal_zzbrq) {
        if (!this.zzcak.isEmpty()) {
            return this.zzcak.zzYR().equals(com_google_android_gms_internal_zzbrq) ? new zzbqd(this.zzcgP, this.zzcak.zzYS(), this.zzcgN) : null;
        } else {
            zzboy zzg = this.zzcgN.zzg(new zzbph(com_google_android_gms_internal_zzbrq));
            return zzg.isEmpty() ? null : zzg.zzYo() != null ? new zzbqg(this.zzcgP, zzbph.zzYO(), zzg.zzYo()) : new zzbqd(this.zzcgP, zzbph.zzYO(), zzg);
        }
    }
}
