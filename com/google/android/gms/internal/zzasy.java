package com.google.android.gms.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzd;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.location.places.PlacesStatusCodes;

@Deprecated
public final class zzasy extends zzd<zzasx> implements Result {
    private final Status zzair;

    public zzasy(DataHolder dataHolder) {
        this(dataHolder, PlacesStatusCodes.zzdv(dataHolder.getStatusCode()));
    }

    private zzasy(DataHolder dataHolder, Status status) {
        super(dataHolder, zzasx.CREATOR);
        boolean z = dataHolder == null || dataHolder.getStatusCode() == status.getStatusCode();
        zzac.zzax(z);
        this.zzair = status;
    }

    public Status getStatus() {
        return this.zzair;
    }
}
