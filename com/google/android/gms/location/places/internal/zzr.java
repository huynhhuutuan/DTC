package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.PlaceLikelihood;

public class zzr extends zzab implements PlaceLikelihood {
    public zzr(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public /* synthetic */ Object freeze() {
        return zzJb();
    }

    public float getLikelihood() {
        return zzb("place_likelihood", -1.0f);
    }

    public Place getPlace() {
        return new zzy(this.zzaBi, this.zzaDL);
    }

    public PlaceLikelihood zzJb() {
        return zzp.zza((PlaceEntity) getPlace().freeze(), getLikelihood());
    }
}
