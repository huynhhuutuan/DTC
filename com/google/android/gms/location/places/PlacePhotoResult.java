package com.google.android.gms.location.places;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;

public class PlacePhotoResult extends zza implements Result {
    public static final Creator<PlacePhotoResult> CREATOR = new zzk();
    private final Bitmap mBitmap;
    final int zzaiI;
    private final Status zzair;
    final BitmapTeleporter zzblH;

    PlacePhotoResult(int i, Status status, BitmapTeleporter bitmapTeleporter) {
        this.zzaiI = i;
        this.zzair = status;
        this.zzblH = bitmapTeleporter;
        if (this.zzblH != null) {
            this.mBitmap = bitmapTeleporter.zzxg();
        } else {
            this.mBitmap = null;
        }
    }

    public PlacePhotoResult(Status status, @Nullable BitmapTeleporter bitmapTeleporter) {
        this(0, status, bitmapTeleporter);
    }

    public Bitmap getBitmap() {
        return this.mBitmap;
    }

    public Status getStatus() {
        return this.zzair;
    }

    public String toString() {
        return zzaa.zzv(this).zzg("status", this.zzair).zzg("bitmap", this.mBitmap).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzk.zza(this, parcel, i);
    }
}
