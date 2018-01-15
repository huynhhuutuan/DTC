package com.google.android.gms.internal;

import com.google.firebase.database.DatabaseError;

public class zzbqv implements zzbqy {
    private final zzbph zzcak;
    private final zzbpc zzchP;
    private final DatabaseError zzchQ;

    public zzbqv(zzbpc com_google_android_gms_internal_zzbpc, DatabaseError databaseError, zzbph com_google_android_gms_internal_zzbph) {
        this.zzchP = com_google_android_gms_internal_zzbpc;
        this.zzcak = com_google_android_gms_internal_zzbph;
        this.zzchQ = databaseError;
    }

    public String toString() {
        String valueOf = String.valueOf(zzWL());
        return new StringBuilder(String.valueOf(valueOf).length() + 7).append(valueOf).append(":CANCEL").toString();
    }

    public zzbph zzWL() {
        return this.zzcak;
    }

    public void zzZS() {
        this.zzchP.zza(this.zzchQ);
    }
}
