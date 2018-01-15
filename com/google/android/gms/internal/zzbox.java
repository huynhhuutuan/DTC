package com.google.android.gms.internal;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.zza;

public class zzbox extends zzbpc {
    private final zzbpj zzcad;
    private final ChildEventListener zzcdK;
    private final zzbrc zzcdL;

    public zzbox(zzbpj com_google_android_gms_internal_zzbpj, ChildEventListener childEventListener, zzbrc com_google_android_gms_internal_zzbrc) {
        this.zzcad = com_google_android_gms_internal_zzbpj;
        this.zzcdK = childEventListener;
        this.zzcdL = com_google_android_gms_internal_zzbrc;
    }

    public boolean equals(Object obj) {
        return (obj instanceof zzbox) && ((zzbox) obj).zzcdK.equals(this.zzcdK) && ((zzbox) obj).zzcad.equals(this.zzcad) && ((zzbox) obj).zzcdL.equals(this.zzcdL);
    }

    public int hashCode() {
        return (((this.zzcdK.hashCode() * 31) + this.zzcad.hashCode()) * 31) + this.zzcdL.hashCode();
    }

    public String toString() {
        return "ChildEventRegistration";
    }

    public zzbrc zzYm() {
        return this.zzcdL;
    }

    public zzbpc zza(zzbrc com_google_android_gms_internal_zzbrc) {
        return new zzbox(this.zzcad, this.zzcdK, com_google_android_gms_internal_zzbrc);
    }

    public zzbqx zza(zzbqw com_google_android_gms_internal_zzbqw, zzbrc com_google_android_gms_internal_zzbrc) {
        return new zzbqx(com_google_android_gms_internal_zzbqw.zzZU(), this, zza.zza(zza.zza(this.zzcad, com_google_android_gms_internal_zzbrc.zzWL().zza(com_google_android_gms_internal_zzbqw.zzZT())), com_google_android_gms_internal_zzbqw.zzZR()), com_google_android_gms_internal_zzbqw.zzZV() != null ? com_google_android_gms_internal_zzbqw.zzZV().asString() : null);
    }

    public void zza(zzbqx com_google_android_gms_internal_zzbqx) {
        if (!zzYK()) {
            switch (com_google_android_gms_internal_zzbqx.zzZU()) {
                case CHILD_ADDED:
                    this.zzcdK.onChildAdded(com_google_android_gms_internal_zzbqx.zzZX(), com_google_android_gms_internal_zzbqx.zzZY());
                    return;
                case CHILD_CHANGED:
                    this.zzcdK.onChildChanged(com_google_android_gms_internal_zzbqx.zzZX(), com_google_android_gms_internal_zzbqx.zzZY());
                    return;
                case CHILD_MOVED:
                    this.zzcdK.onChildMoved(com_google_android_gms_internal_zzbqx.zzZX(), com_google_android_gms_internal_zzbqx.zzZY());
                    return;
                case CHILD_REMOVED:
                    this.zzcdK.onChildRemoved(com_google_android_gms_internal_zzbqx.zzZX());
                    return;
                default:
                    return;
            }
        }
    }

    public void zza(DatabaseError databaseError) {
        this.zzcdK.onCancelled(databaseError);
    }

    public boolean zza(zzbqy.zza com_google_android_gms_internal_zzbqy_zza) {
        return com_google_android_gms_internal_zzbqy_zza != zzbqy.zza.VALUE;
    }

    public boolean zzc(zzbpc com_google_android_gms_internal_zzbpc) {
        return (com_google_android_gms_internal_zzbpc instanceof zzbox) && ((zzbox) com_google_android_gms_internal_zzbpc).zzcdK.equals(this.zzcdK);
    }
}
