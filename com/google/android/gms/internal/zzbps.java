package com.google.android.gms.internal;

public class zzbps {
    private final long zzcgo;

    public zzbps(long j) {
        this.zzcgo = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zzcgo == ((zzbps) obj).zzcgo;
    }

    public int hashCode() {
        return (int) (this.zzcgo ^ (this.zzcgo >>> 32));
    }

    public String toString() {
        return "Tag{tagNumber=" + this.zzcgo + "}";
    }

    public long zzZk() {
        return this.zzcgo;
    }
}
