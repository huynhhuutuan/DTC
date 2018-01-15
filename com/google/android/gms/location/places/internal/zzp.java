package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.PlaceLikelihood;

public class zzp extends zza implements PlaceLikelihood {
    public static final Creator<zzp> CREATOR = new zzq();
    final int zzaiI;
    final PlaceEntity zzbmK;
    final float zzbmL;

    zzp(int i, PlaceEntity placeEntity, float f) {
        this.zzaiI = i;
        this.zzbmK = placeEntity;
        this.zzbmL = f;
    }

    public static zzp zza(PlaceEntity placeEntity, float f) {
        return new zzp(0, (PlaceEntity) zzac.zzw(placeEntity), f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzp)) {
            return false;
        }
        zzp com_google_android_gms_location_places_internal_zzp = (zzp) obj;
        return this.zzbmK.equals(com_google_android_gms_location_places_internal_zzp.zzbmK) && this.zzbmL == com_google_android_gms_location_places_internal_zzp.zzbmL;
    }

    public /* synthetic */ Object freeze() {
        return zzJb();
    }

    public float getLikelihood() {
        return this.zzbmL;
    }

    public Place getPlace() {
        return this.zzbmK;
    }

    public int hashCode() {
        return zzaa.hashCode(this.zzbmK, Float.valueOf(this.zzbmL));
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return zzaa.zzv(this).zzg("place", this.zzbmK).zzg("likelihood", Float.valueOf(this.zzbmL)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzq.zza(this, parcel, i);
    }

    public PlaceLikelihood zzJb() {
        return this;
    }
}
