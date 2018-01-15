package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.location.places.PlacePhotoMetadata;
import com.google.android.gms.location.places.PlacePhotoResult;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.zzh;
import com.google.android.gms.location.places.zzh.zza;

public class zzw implements PlacePhotoMetadata {
    private int mIndex;
    private final int zzMB;
    private final int zzMC;
    private final String zzbna;
    private final CharSequence zzbnb;

    public zzw(String str, int i, int i2, CharSequence charSequence, int i3) {
        this.zzbna = str;
        this.zzMB = i;
        this.zzMC = i2;
        this.zzbnb = charSequence;
        this.mIndex = i3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzw)) {
            return false;
        }
        zzw com_google_android_gms_location_places_internal_zzw = (zzw) obj;
        return com_google_android_gms_location_places_internal_zzw.zzMB == this.zzMB && com_google_android_gms_location_places_internal_zzw.zzMC == this.zzMC && zzaa.equal(com_google_android_gms_location_places_internal_zzw.zzbna, this.zzbna) && zzaa.equal(com_google_android_gms_location_places_internal_zzw.zzbnb, this.zzbnb);
    }

    public /* synthetic */ Object freeze() {
        return zzJc();
    }

    public CharSequence getAttributions() {
        return this.zzbnb;
    }

    public int getMaxHeight() {
        return this.zzMC;
    }

    public int getMaxWidth() {
        return this.zzMB;
    }

    public PendingResult<PlacePhotoResult> getPhoto(GoogleApiClient googleApiClient) {
        return getScaledPhoto(googleApiClient, getMaxWidth(), getMaxHeight());
    }

    public PendingResult<PlacePhotoResult> getScaledPhoto(GoogleApiClient googleApiClient, int i, int i2) {
        final int i3 = i;
        final int i4 = i2;
        return googleApiClient.zza(new zza<zzh>(this, Places.GEO_DATA_API, googleApiClient) {
            final /* synthetic */ zzw zzbne;

            protected void zza(zzh com_google_android_gms_location_places_internal_zzh) throws RemoteException {
                com_google_android_gms_location_places_internal_zzh.zza(new zzh((zza) this), this.zzbne.zzbna, i3, i4, this.zzbne.mIndex);
            }
        });
    }

    public int hashCode() {
        return zzaa.hashCode(Integer.valueOf(this.zzMB), Integer.valueOf(this.zzMC), this.zzbna, this.zzbnb);
    }

    public boolean isDataValid() {
        return true;
    }

    public PlacePhotoMetadata zzJc() {
        return this;
    }
}
