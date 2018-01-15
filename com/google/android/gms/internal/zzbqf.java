package com.google.android.gms.internal;

public class zzbqf {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbqf.class.desiredAssertionStatus());
    public static final zzbqf zzcgV = new zzbqf(zza.User, null, false);
    public static final zzbqf zzcgW = new zzbqf(zza.Server, null, false);
    private final zza zzcgX;
    private final zzbrb zzcgY;
    private final boolean zzcgZ;

    private enum zza {
        User,
        Server
    }

    public zzbqf(zza com_google_android_gms_internal_zzbqf_zza, zzbrb com_google_android_gms_internal_zzbrb, boolean z) {
        this.zzcgX = com_google_android_gms_internal_zzbqf_zza;
        this.zzcgY = com_google_android_gms_internal_zzbrb;
        this.zzcgZ = z;
        if (!$assertionsDisabled && z && !zzZA()) {
            throw new AssertionError();
        }
    }

    public static zzbqf zzc(zzbrb com_google_android_gms_internal_zzbrb) {
        return new zzbqf(zza.Server, com_google_android_gms_internal_zzbrb, true);
    }

    public String toString() {
        String valueOf = String.valueOf(this.zzcgX);
        String valueOf2 = String.valueOf(this.zzcgY);
        return new StringBuilder((String.valueOf(valueOf).length() + 52) + String.valueOf(valueOf2).length()).append("OperationSource{source=").append(valueOf).append(", queryParams=").append(valueOf2).append(", tagged=").append(this.zzcgZ).append("}").toString();
    }

    public boolean zzZA() {
        return this.zzcgX == zza.Server;
    }

    public boolean zzZB() {
        return this.zzcgZ;
    }

    public zzbrb zzZC() {
        return this.zzcgY;
    }

    public boolean zzZz() {
        return this.zzcgX == zza.User;
    }
}
