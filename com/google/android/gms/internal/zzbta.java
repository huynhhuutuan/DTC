package com.google.android.gms.internal;

public class zzbta implements zzbsw {
    private final zzbsw zzckH;
    private long zzckI = 0;

    public zzbta(zzbsw com_google_android_gms_internal_zzbsw, long j) {
        this.zzckH = com_google_android_gms_internal_zzbsw;
        this.zzckI = j;
    }

    public void zzaS(long j) {
        this.zzckI = j;
    }

    public long zzabH() {
        return this.zzckH.zzabH() + this.zzckI;
    }
}
