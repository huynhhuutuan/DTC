package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbqe.zza;

public class zzbqc extends zzbqe {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbqc.class.desiredAssertionStatus());

    public zzbqc(zzbqf com_google_android_gms_internal_zzbqf, zzbph com_google_android_gms_internal_zzbph) {
        super(zza.ListenComplete, com_google_android_gms_internal_zzbqf, com_google_android_gms_internal_zzbph);
        if (!$assertionsDisabled && com_google_android_gms_internal_zzbqf.zzZz()) {
            throw new AssertionError("Can't have a listen complete from a user source");
        }
    }

    public String toString() {
        return String.format("ListenComplete { path=%s, source=%s }", new Object[]{zzWL(), zzZx()});
    }

    public zzbqe zzc(zzbrq com_google_android_gms_internal_zzbrq) {
        return this.zzcak.isEmpty() ? new zzbqc(this.zzcgP, zzbph.zzYO()) : new zzbqc(this.zzcgP, this.zzcak.zzYS());
    }
}
