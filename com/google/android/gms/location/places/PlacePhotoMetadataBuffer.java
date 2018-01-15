package com.google.android.gms.location.places;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.zzx;

public class PlacePhotoMetadataBuffer extends AbstractDataBuffer<PlacePhotoMetadata> {
    public PlacePhotoMetadataBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    public PlacePhotoMetadata get(int i) {
        return new zzx(this.zzaBi, i);
    }
}
