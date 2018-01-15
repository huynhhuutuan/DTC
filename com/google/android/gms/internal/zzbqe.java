package com.google.android.gms.internal;

public abstract class zzbqe {
    protected final zzbph zzcak;
    protected final zza zzcgO;
    protected final zzbqf zzcgP;

    public enum zza {
        Overwrite,
        Merge,
        AckUserWrite,
        ListenComplete
    }

    protected zzbqe(zza com_google_android_gms_internal_zzbqe_zza, zzbqf com_google_android_gms_internal_zzbqf, zzbph com_google_android_gms_internal_zzbph) {
        this.zzcgO = com_google_android_gms_internal_zzbqe_zza;
        this.zzcgP = com_google_android_gms_internal_zzbqf;
        this.zzcak = com_google_android_gms_internal_zzbph;
    }

    public zzbph zzWL() {
        return this.zzcak;
    }

    public zzbqf zzZx() {
        return this.zzcgP;
    }

    public zza zzZy() {
        return this.zzcgO;
    }

    public abstract zzbqe zzc(zzbrq com_google_android_gms_internal_zzbrq);
}
