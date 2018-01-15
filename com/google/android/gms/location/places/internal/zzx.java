package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.PlacePhotoMetadata;
import com.google.android.gms.location.places.PlacePhotoResult;

public class zzx extends zzab implements PlacePhotoMetadata {
    private final String zzbna = getString("photo_fife_url");

    public zzx(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public /* synthetic */ Object freeze() {
        return zzJc();
    }

    public CharSequence getAttributions() {
        return zzO("photo_attributions", null);
    }

    public int getMaxHeight() {
        return zzy("photo_max_height", 0);
    }

    public int getMaxWidth() {
        return zzy("photo_max_width", 0);
    }

    public PendingResult<PlacePhotoResult> getPhoto(GoogleApiClient googleApiClient) {
        return getScaledPhoto(googleApiClient, getMaxWidth(), getMaxHeight());
    }

    public PendingResult<PlacePhotoResult> getScaledPhoto(GoogleApiClient googleApiClient, int i, int i2) {
        return ((PlacePhotoMetadata) freeze()).getScaledPhoto(googleApiClient, i, i2);
    }

    public PlacePhotoMetadata zzJc() {
        return new zzw(this.zzbna, getMaxWidth(), getMaxHeight(), getAttributions(), this.zzaDL);
    }
}
