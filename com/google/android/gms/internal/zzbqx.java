package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbqy.zza;
import com.google.firebase.database.DataSnapshot;

public class zzbqx implements zzbqy {
    private final zzbpc zzchP;
    private final zza zzchR;
    private final DataSnapshot zzchV;
    private final String zzchW;

    public zzbqx(zza com_google_android_gms_internal_zzbqy_zza, zzbpc com_google_android_gms_internal_zzbpc, DataSnapshot dataSnapshot, String str) {
        this.zzchR = com_google_android_gms_internal_zzbqy_zza;
        this.zzchP = com_google_android_gms_internal_zzbpc;
        this.zzchV = dataSnapshot;
        this.zzchW = str;
    }

    public String toString() {
        if (this.zzchR == zza.VALUE) {
            String valueOf = String.valueOf(zzWL());
            String valueOf2 = String.valueOf(this.zzchR);
            String valueOf3 = String.valueOf(this.zzchV.getValue(true));
            return new StringBuilder(((String.valueOf(valueOf).length() + 4) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf).append(": ").append(valueOf2).append(": ").append(valueOf3).toString();
        }
        valueOf = String.valueOf(zzWL());
        valueOf2 = String.valueOf(this.zzchR);
        valueOf3 = String.valueOf(this.zzchV.getKey());
        String valueOf4 = String.valueOf(this.zzchV.getValue(true));
        return new StringBuilder((((String.valueOf(valueOf).length() + 10) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append(valueOf).append(": ").append(valueOf2).append(": { ").append(valueOf3).append(": ").append(valueOf4).append(" }").toString();
    }

    public zzbph zzWL() {
        zzbph zzWL = this.zzchV.getRef().zzWL();
        return this.zzchR == zza.VALUE ? zzWL : zzWL.zzYT();
    }

    public void zzZS() {
        this.zzchP.zza(this);
    }

    public zza zzZU() {
        return this.zzchR;
    }

    public DataSnapshot zzZX() {
        return this.zzchV;
    }

    public String zzZY() {
        return this.zzchW;
    }
}
