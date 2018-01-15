package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbqe.zza;

public class zzbqb extends zzbqe {
    private final boolean zzcgL;
    private final zzbqq<Boolean> zzcgM;

    public zzbqb(zzbph com_google_android_gms_internal_zzbph, zzbqq<Boolean> com_google_android_gms_internal_zzbqq_java_lang_Boolean, boolean z) {
        super(zza.AckUserWrite, zzbqf.zzcgV, com_google_android_gms_internal_zzbph);
        this.zzcgM = com_google_android_gms_internal_zzbqq_java_lang_Boolean;
        this.zzcgL = z;
    }

    public String toString() {
        return String.format("AckUserWrite { path=%s, revert=%s, affectedTree=%s }", new Object[]{zzWL(), Boolean.valueOf(this.zzcgL), this.zzcgM});
    }

    public zzbqq<Boolean> zzZu() {
        return this.zzcgM;
    }

    public boolean zzZv() {
        return this.zzcgL;
    }

    public zzbqe zzc(zzbrq com_google_android_gms_internal_zzbrq) {
        if (!this.zzcak.isEmpty()) {
            zzbte.zzb(this.zzcak.zzYR().equals(com_google_android_gms_internal_zzbrq), "operationForChild called for unrelated child.");
            return new zzbqb(this.zzcak.zzYS(), this.zzcgM, this.zzcgL);
        } else if (this.zzcgM.getValue() != null) {
            zzbte.zzb(this.zzcgM.zzZN().isEmpty(), "affectedTree should not have overlapping affected paths.");
            return this;
        } else {
            return new zzbqb(zzbph.zzYO(), this.zzcgM.zzI(new zzbph(com_google_android_gms_internal_zzbrq)), this.zzcgL);
        }
    }
}
