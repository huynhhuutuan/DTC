package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.location.places.internal.zzc;

public class AutocompletePredictionBuffer extends AbstractDataBuffer<AutocompletePrediction> implements Result {
    public AutocompletePredictionBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    public AutocompletePrediction get(int i) {
        return new zzc(this.zzaBi, i);
    }

    public Status getStatus() {
        return PlacesStatusCodes.zzdv(this.zzaBi.getStatusCode());
    }

    public String toString() {
        return zzaa.zzv(this).zzg("status", getStatus()).toString();
    }
}
