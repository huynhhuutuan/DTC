package com.google.android.gms.internal;

public class zzbqo {
    public final long id;
    public final boolean zzbrc;
    public final zzbrc zzchq;
    public final long zzchr;
    public final boolean zzchs;

    public zzbqo(long j, zzbrc com_google_android_gms_internal_zzbrc, long j2, boolean z, boolean z2) {
        this.id = j;
        if (!com_google_android_gms_internal_zzbrc.zzaam() || com_google_android_gms_internal_zzbrc.isDefault()) {
            this.zzchq = com_google_android_gms_internal_zzbrc;
            this.zzchr = j2;
            this.zzchs = z;
            this.zzbrc = z2;
            return;
        }
        throw new IllegalArgumentException("Can't create TrackedQuery for a non-default query that loads all data");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        zzbqo com_google_android_gms_internal_zzbqo = (zzbqo) obj;
        return this.id == com_google_android_gms_internal_zzbqo.id && this.zzchq.equals(com_google_android_gms_internal_zzbqo.zzchq) && this.zzchr == com_google_android_gms_internal_zzbqo.zzchr && this.zzchs == com_google_android_gms_internal_zzbqo.zzchs && this.zzbrc == com_google_android_gms_internal_zzbqo.zzbrc;
    }

    public int hashCode() {
        return (((((((Long.valueOf(this.id).hashCode() * 31) + this.zzchq.hashCode()) * 31) + Long.valueOf(this.zzchr).hashCode()) * 31) + Boolean.valueOf(this.zzchs).hashCode()) * 31) + Boolean.valueOf(this.zzbrc).hashCode();
    }

    public String toString() {
        long j = this.id;
        String valueOf = String.valueOf(this.zzchq);
        long j2 = this.zzchr;
        boolean z = this.zzchs;
        return new StringBuilder(String.valueOf(valueOf).length() + 109).append("TrackedQuery{id=").append(j).append(", querySpec=").append(valueOf).append(", lastUse=").append(j2).append(", complete=").append(z).append(", active=").append(this.zzbrc).append("}").toString();
    }

    public zzbqo zzZI() {
        return new zzbqo(this.id, this.zzchq, this.zzchr, true, this.zzbrc);
    }

    public zzbqo zzaR(long j) {
        return new zzbqo(this.id, this.zzchq, j, this.zzchs, this.zzbrc);
    }

    public zzbqo zzbg(boolean z) {
        return new zzbqo(this.id, this.zzchq, this.zzchr, this.zzchs, z);
    }
}
