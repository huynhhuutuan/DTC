package com.google.android.gms.location.places;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;

public final class zzm extends zza {
    public static final Creator<zzm> CREATOR = new zzn();
    private final int mPriority;
    final int zzaiI;
    private final long zzbjI;
    private final long zzbjY;
    private final PlaceFilter zzblJ;
    private final boolean zzblK;
    private final boolean zzblL;

    public zzm(int i, PlaceFilter placeFilter, long j, int i2, long j2, boolean z, boolean z2) {
        this.zzaiI = i;
        this.zzblJ = placeFilter;
        this.zzbjY = j;
        this.mPriority = i2;
        this.zzbjI = j2;
        this.zzblK = z;
        this.zzblL = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm com_google_android_gms_location_places_zzm = (zzm) obj;
        return zzaa.equal(this.zzblJ, com_google_android_gms_location_places_zzm.zzblJ) && this.zzbjY == com_google_android_gms_location_places_zzm.zzbjY && this.mPriority == com_google_android_gms_location_places_zzm.mPriority && this.zzbjI == com_google_android_gms_location_places_zzm.zzbjI && this.zzblK == com_google_android_gms_location_places_zzm.zzblK;
    }

    public long getExpirationTime() {
        return this.zzbjI;
    }

    public long getInterval() {
        return this.zzbjY;
    }

    public int getPriority() {
        return this.mPriority;
    }

    public int hashCode() {
        return zzaa.hashCode(this.zzblJ, Long.valueOf(this.zzbjY), Integer.valueOf(this.mPriority), Long.valueOf(this.zzbjI), Boolean.valueOf(this.zzblK));
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return zzaa.zzv(this).zzg("filter", this.zzblJ).zzg("interval", Long.valueOf(this.zzbjY)).zzg("priority", Integer.valueOf(this.mPriority)).zzg("expireAt", Long.valueOf(this.zzbjI)).zzg("receiveFailures", Boolean.valueOf(this.zzblK)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzn.zza(this, parcel, i);
    }

    public boolean zzIG() {
        return this.zzblK;
    }

    public boolean zzIH() {
        return this.zzblL;
    }

    @Deprecated
    public PlaceFilter zzIz() {
        return this.zzblJ;
    }
}
