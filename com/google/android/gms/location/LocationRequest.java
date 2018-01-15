package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;

public final class LocationRequest extends zza implements ReflectedParcelable {
    public static final Creator<LocationRequest> CREATOR = new zzm();
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;
    int mPriority;
    boolean zzaWy;
    long zzbjI;
    long zzbjY;
    long zzbjZ;
    int zzbka;
    float zzbkb;
    long zzbkc;

    public LocationRequest() {
        this.mPriority = 102;
        this.zzbjY = 3600000;
        this.zzbjZ = 600000;
        this.zzaWy = false;
        this.zzbjI = Long.MAX_VALUE;
        this.zzbka = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.zzbkb = 0.0f;
        this.zzbkc = 0;
    }

    LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4) {
        this.mPriority = i;
        this.zzbjY = j;
        this.zzbjZ = j2;
        this.zzaWy = z;
        this.zzbjI = j3;
        this.zzbka = i2;
        this.zzbkb = f;
        this.zzbkc = j4;
    }

    public static LocationRequest create() {
        return new LocationRequest();
    }

    private static void zzV(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("invalid interval: " + j);
        }
    }

    private static void zze(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("invalid displacement: " + f);
        }
    }

    private static void zzkk(int i) {
        switch (i) {
            case 100:
            case 102:
            case 104:
            case 105:
                return;
            default:
                throw new IllegalArgumentException("invalid quality: " + i);
        }
    }

    public static String zzkl(int i) {
        switch (i) {
            case 100:
                return "PRIORITY_HIGH_ACCURACY";
            case 102:
                return "PRIORITY_BALANCED_POWER_ACCURACY";
            case 104:
                return "PRIORITY_LOW_POWER";
            case 105:
                return "PRIORITY_NO_POWER";
            default:
                return "???";
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.mPriority == locationRequest.mPriority && this.zzbjY == locationRequest.zzbjY && this.zzbjZ == locationRequest.zzbjZ && this.zzaWy == locationRequest.zzaWy && this.zzbjI == locationRequest.zzbjI && this.zzbka == locationRequest.zzbka && this.zzbkb == locationRequest.zzbkb && getMaxWaitTime() == locationRequest.getMaxWaitTime();
    }

    public long getExpirationTime() {
        return this.zzbjI;
    }

    public long getFastestInterval() {
        return this.zzbjZ;
    }

    public long getInterval() {
        return this.zzbjY;
    }

    public long getMaxWaitTime() {
        long j = this.zzbkc;
        return j < this.zzbjY ? this.zzbjY : j;
    }

    public int getNumUpdates() {
        return this.zzbka;
    }

    public int getPriority() {
        return this.mPriority;
    }

    public float getSmallestDisplacement() {
        return this.zzbkb;
    }

    public int hashCode() {
        return zzaa.hashCode(Integer.valueOf(this.mPriority), Long.valueOf(this.zzbjY), Float.valueOf(this.zzbkb), Long.valueOf(this.zzbkc));
    }

    public LocationRequest setExpirationDuration(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j > Long.MAX_VALUE - elapsedRealtime) {
            this.zzbjI = Long.MAX_VALUE;
        } else {
            this.zzbjI = elapsedRealtime + j;
        }
        if (this.zzbjI < 0) {
            this.zzbjI = 0;
        }
        return this;
    }

    public LocationRequest setExpirationTime(long j) {
        this.zzbjI = j;
        if (this.zzbjI < 0) {
            this.zzbjI = 0;
        }
        return this;
    }

    public LocationRequest setFastestInterval(long j) {
        zzV(j);
        this.zzaWy = true;
        this.zzbjZ = j;
        return this;
    }

    public LocationRequest setInterval(long j) {
        zzV(j);
        this.zzbjY = j;
        if (!this.zzaWy) {
            this.zzbjZ = (long) (((double) this.zzbjY) / 6.0d);
        }
        return this;
    }

    public LocationRequest setMaxWaitTime(long j) {
        zzV(j);
        this.zzbkc = j;
        return this;
    }

    public LocationRequest setNumUpdates(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("invalid numUpdates: " + i);
        }
        this.zzbka = i;
        return this;
    }

    public LocationRequest setPriority(int i) {
        zzkk(i);
        this.mPriority = i;
        return this;
    }

    public LocationRequest setSmallestDisplacement(float f) {
        zze(f);
        this.zzbkb = f;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request[").append(zzkl(this.mPriority));
        if (this.mPriority != 105) {
            stringBuilder.append(" requested=");
            stringBuilder.append(this.zzbjY).append("ms");
        }
        stringBuilder.append(" fastest=");
        stringBuilder.append(this.zzbjZ).append("ms");
        if (this.zzbkc > this.zzbjY) {
            stringBuilder.append(" maxWait=");
            stringBuilder.append(this.zzbkc).append("ms");
        }
        if (this.zzbkb > 0.0f) {
            stringBuilder.append(" smallestDisplacement=");
            stringBuilder.append(this.zzbkb).append("m");
        }
        if (this.zzbjI != Long.MAX_VALUE) {
            long elapsedRealtime = this.zzbjI - SystemClock.elapsedRealtime();
            stringBuilder.append(" expireIn=");
            stringBuilder.append(elapsedRealtime).append("ms");
        }
        if (this.zzbka != ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
            stringBuilder.append(" num=").append(this.zzbka);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzm.zza(this, parcel, i);
    }
}
