package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;

public final class LocationAvailability extends zza implements ReflectedParcelable {
    public static final Creator<LocationAvailability> CREATOR = new zzl();
    int zzbjU;
    int zzbjV;
    long zzbjW;
    int zzbjX;

    LocationAvailability(int i, int i2, int i3, long j) {
        this.zzbjX = i;
        this.zzbjU = i2;
        this.zzbjV = i3;
        this.zzbjW = j;
    }

    public static LocationAvailability extractLocationAvailability(Intent intent) {
        return !hasLocationAvailability(intent) ? null : (LocationAvailability) intent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    public static boolean hasLocationAvailability(Intent intent) {
        return intent == null ? false : intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationAvailability)) {
            return false;
        }
        LocationAvailability locationAvailability = (LocationAvailability) obj;
        return this.zzbjX == locationAvailability.zzbjX && this.zzbjU == locationAvailability.zzbjU && this.zzbjV == locationAvailability.zzbjV && this.zzbjW == locationAvailability.zzbjW;
    }

    public int hashCode() {
        return zzaa.hashCode(Integer.valueOf(this.zzbjX), Integer.valueOf(this.zzbjU), Integer.valueOf(this.zzbjV), Long.valueOf(this.zzbjW));
    }

    public boolean isLocationAvailable() {
        return this.zzbjX < 1000;
    }

    public String toString() {
        return "LocationAvailability[isLocationAvailable: " + isLocationAvailable() + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzl.zza(this, parcel, i);
    }
}
