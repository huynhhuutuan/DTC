package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbqy.zza;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

public class zzbpx extends zzbpc {
    private final zzbpj zzcad;
    private final zzbrc zzcdL;
    private final ValueEventListener zzcgz;

    public zzbpx(zzbpj com_google_android_gms_internal_zzbpj, ValueEventListener valueEventListener, zzbrc com_google_android_gms_internal_zzbrc) {
        this.zzcad = com_google_android_gms_internal_zzbpj;
        this.zzcgz = valueEventListener;
        this.zzcdL = com_google_android_gms_internal_zzbrc;
    }

    public boolean equals(Object obj) {
        return (obj instanceof zzbpx) && ((zzbpx) obj).zzcgz.equals(this.zzcgz) && ((zzbpx) obj).zzcad.equals(this.zzcad) && ((zzbpx) obj).zzcdL.equals(this.zzcdL);
    }

    public int hashCode() {
        return (((this.zzcgz.hashCode() * 31) + this.zzcad.hashCode()) * 31) + this.zzcdL.hashCode();
    }

    public String toString() {
        return "ValueEventRegistration";
    }

    public zzbrc zzYm() {
        return this.zzcdL;
    }

    public zzbpc zza(zzbrc com_google_android_gms_internal_zzbrc) {
        return new zzbpx(this.zzcad, this.zzcgz, com_google_android_gms_internal_zzbrc);
    }

    public zzbqx zza(zzbqw com_google_android_gms_internal_zzbqw, zzbrc com_google_android_gms_internal_zzbrc) {
        return new zzbqx(zza.VALUE, this, com.google.firebase.database.zza.zza(com.google.firebase.database.zza.zza(this.zzcad, com_google_android_gms_internal_zzbrc.zzWL()), com_google_android_gms_internal_zzbqw.zzZR()), null);
    }

    public void zza(zzbqx com_google_android_gms_internal_zzbqx) {
        if (!zzYK()) {
            this.zzcgz.onDataChange(com_google_android_gms_internal_zzbqx.zzZX());
        }
    }

    public void zza(DatabaseError databaseError) {
        this.zzcgz.onCancelled(databaseError);
    }

    public boolean zza(zza com_google_android_gms_internal_zzbqy_zza) {
        return com_google_android_gms_internal_zzbqy_zza == zza.VALUE;
    }

    public boolean zzc(zzbpc com_google_android_gms_internal_zzbpc) {
        return (com_google_android_gms_internal_zzbpc instanceof zzbpx) && ((zzbpx) com_google_android_gms_internal_zzbpc).zzcgz.equals(this.zzcgz);
    }
}
