package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;

public class PlacePhotoMetadataResult extends zza implements Result {
    public static final Creator<PlacePhotoMetadataResult> CREATOR = new zzj();
    final int zzaiI;
    private final Status zzair;
    final DataHolder zzblF;
    private final PlacePhotoMetadataBuffer zzblG;

    PlacePhotoMetadataResult(int i, Status status, DataHolder dataHolder) {
        this.zzaiI = i;
        this.zzair = status;
        this.zzblF = dataHolder;
        if (dataHolder == null) {
            this.zzblG = null;
        } else {
            this.zzblG = new PlacePhotoMetadataBuffer(this.zzblF);
        }
    }

    public PlacePhotoMetadataResult(Status status, DataHolder dataHolder) {
        this(0, status, dataHolder);
    }

    public PlacePhotoMetadataBuffer getPhotoMetadata() {
        return this.zzblG;
    }

    public Status getStatus() {
        return this.zzair;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzj.zza(this, parcel, i);
    }
}
