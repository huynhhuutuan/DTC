package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;

public class zzd extends zza {
    public static final Creator<zzd> CREATOR = new zze();
    private final int zzaSu;
    private final int zzbjy;

    zzd(int i, int i2) {
        this.zzaSu = i;
        this.zzbjy = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzd)) {
            return false;
        }
        zzd com_google_android_gms_location_zzd = (zzd) obj;
        return this.zzaSu == com_google_android_gms_location_zzd.zzaSu && this.zzbjy == com_google_android_gms_location_zzd.zzbjy;
    }

    public int hashCode() {
        return zzaa.hashCode(Integer.valueOf(this.zzaSu), Integer.valueOf(this.zzbjy));
    }

    public String toString() {
        int i = this.zzaSu;
        return "ActivityTransition [mActivityType=" + i + ", mTransitionType=" + this.zzbjy + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        zze.zza(this, parcel, i);
    }

    public int zzBV() {
        return this.zzaSu;
    }

    public int zzIb() {
        return this.zzbjy;
    }
}
