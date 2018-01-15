package com.google.android.gms.location.places;

import android.support.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.zzy;

public class PlaceBuffer extends AbstractDataBuffer<Place> implements Result {
    private final Status zzair;
    private final String zzbly;

    public PlaceBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.zzair = PlacesStatusCodes.zzdv(dataHolder.getStatusCode());
        if (dataHolder == null || dataHolder.zzxf() == null) {
            this.zzbly = null;
        } else {
            this.zzbly = dataHolder.zzxf().getString("com.google.android.gms.location.places.PlaceBuffer.ATTRIBUTIONS_EXTRA_KEY");
        }
    }

    public Place get(int i) {
        return new zzy(this.zzaBi, i);
    }

    @Nullable
    public CharSequence getAttributions() {
        return this.zzbly;
    }

    public Status getStatus() {
        return this.zzair;
    }
}
