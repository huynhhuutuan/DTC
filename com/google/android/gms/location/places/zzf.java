package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;

public final class zzf extends zza {
    public static final Creator<zzf> CREATOR = new zzg();
    private int mPriority = 110;
    private final int zzaiI;
    private final int zzbjH;
    private final int zzblr;
    @Deprecated
    private final PlaceFilter zzbls;
    private final zzd zzblt;
    private final boolean zzblu;
    private final int zzblv;

    zzf(int i, int i2, int i3, PlaceFilter placeFilter, zzd com_google_android_gms_location_places_zzd, boolean z, int i4, int i5) {
        this.zzaiI = i;
        this.zzbjH = i2;
        this.zzblr = i3;
        if (com_google_android_gms_location_places_zzd != null) {
            this.zzblt = com_google_android_gms_location_places_zzd;
        } else if (placeFilter == null) {
            this.zzblt = null;
        } else if (placeFilter.getPlaceIds() != null && !placeFilter.getPlaceIds().isEmpty()) {
            this.zzblt = zzd.zzm(placeFilter.getPlaceIds());
        } else if (placeFilter.zzID() == null || placeFilter.zzID().isEmpty()) {
            this.zzblt = null;
        } else {
            this.zzblt = zzd.zzn(placeFilter.zzID());
        }
        this.zzbls = null;
        this.zzblu = z;
        this.zzblv = i4;
        this.mPriority = i5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf com_google_android_gms_location_places_zzf = (zzf) obj;
        return this.zzbjH == com_google_android_gms_location_places_zzf.zzbjH && this.zzblr == com_google_android_gms_location_places_zzf.zzblr && zzaa.equal(this.zzblt, com_google_android_gms_location_places_zzf.zzblt) && this.mPriority == com_google_android_gms_location_places_zzf.mPriority;
    }

    public int getPriority() {
        return this.mPriority;
    }

    public int getVersionCode() {
        return this.zzaiI;
    }

    public int hashCode() {
        return zzaa.hashCode(Integer.valueOf(this.zzbjH), Integer.valueOf(this.zzblr), this.zzblt, Integer.valueOf(this.mPriority));
    }

    public String toString() {
        return zzaa.zzv(this).zzg("transitionTypes", Integer.valueOf(this.zzbjH)).zzg("loiteringTimeMillis", Integer.valueOf(this.zzblr)).zzg("nearbyAlertFilter", this.zzblt).zzg("priority", Integer.valueOf(this.mPriority)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzg.zza(this, parcel, i);
    }

    public zzd zzIA() {
        return this.zzblt;
    }

    public boolean zzIB() {
        return this.zzblu;
    }

    public int zzIC() {
        return this.zzblv;
    }

    public int zzIu() {
        return this.zzbjH;
    }

    public int zzIy() {
        return this.zzblr;
    }

    @Deprecated
    public PlaceFilter zzIz() {
        return null;
    }
}
