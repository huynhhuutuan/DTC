package com.google.android.gms.internal;

public class zzbpv {
    private final zzbph zzcak;
    private final long zzcgt;
    private final zzbsc zzcgu;
    private final zzboy zzcgv;
    private final boolean zzcgw;

    public zzbpv(long j, zzbph com_google_android_gms_internal_zzbph, zzboy com_google_android_gms_internal_zzboy) {
        this.zzcgt = j;
        this.zzcak = com_google_android_gms_internal_zzbph;
        this.zzcgu = null;
        this.zzcgv = com_google_android_gms_internal_zzboy;
        this.zzcgw = true;
    }

    public zzbpv(long j, zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc, boolean z) {
        this.zzcgt = j;
        this.zzcak = com_google_android_gms_internal_zzbph;
        this.zzcgu = com_google_android_gms_internal_zzbsc;
        this.zzcgv = null;
        this.zzcgw = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzbpv com_google_android_gms_internal_zzbpv = (zzbpv) obj;
        if (this.zzcgt != com_google_android_gms_internal_zzbpv.zzcgt) {
            return false;
        }
        if (!this.zzcak.equals(com_google_android_gms_internal_zzbpv.zzcak)) {
            return false;
        }
        if (this.zzcgw != com_google_android_gms_internal_zzbpv.zzcgw) {
            return false;
        }
        if (!this.zzcgu == null ? this.zzcgu.equals(com_google_android_gms_internal_zzbpv.zzcgu) : com_google_android_gms_internal_zzbpv.zzcgu == null) {
            return false;
        }
        if (this.zzcgv != null) {
            if (this.zzcgv.equals(com_google_android_gms_internal_zzbpv.zzcgv)) {
                return true;
            }
        } else if (com_google_android_gms_internal_zzbpv.zzcgv == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.zzcgu != null ? this.zzcgu.hashCode() : 0) + (((((Long.valueOf(this.zzcgt).hashCode() * 31) + Boolean.valueOf(this.zzcgw).hashCode()) * 31) + this.zzcak.hashCode()) * 31)) * 31;
        if (this.zzcgv != null) {
            i = this.zzcgv.hashCode();
        }
        return hashCode + i;
    }

    public boolean isVisible() {
        return this.zzcgw;
    }

    public String toString() {
        long j = this.zzcgt;
        String valueOf = String.valueOf(this.zzcak);
        boolean z = this.zzcgw;
        String valueOf2 = String.valueOf(this.zzcgu);
        String valueOf3 = String.valueOf(this.zzcgv);
        return new StringBuilder(((String.valueOf(valueOf).length() + 78) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("UserWriteRecord{id=").append(j).append(" path=").append(valueOf).append(" visible=").append(z).append(" overwrite=").append(valueOf2).append(" merge=").append(valueOf3).append("}").toString();
    }

    public zzbph zzWL() {
        return this.zzcak;
    }

    public long zzZl() {
        return this.zzcgt;
    }

    public zzbsc zzZm() {
        if (this.zzcgu != null) {
            return this.zzcgu;
        }
        throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
    }

    public zzboy zzZn() {
        if (this.zzcgv != null) {
            return this.zzcgv;
        }
        throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
    }

    public boolean zzZo() {
        return this.zzcgu != null;
    }
}
