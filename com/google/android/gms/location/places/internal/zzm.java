package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.PlaceDetectionApi;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceLikelihoodBuffer;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.zzo;
import com.google.android.gms.location.places.zzo.zzd;
import com.google.android.gms.location.places.zzo.zzf;

public class zzm implements PlaceDetectionApi {
    public PendingResult<PlaceLikelihoodBuffer> getCurrentPlace(GoogleApiClient googleApiClient, final PlaceFilter placeFilter) {
        return googleApiClient.zza(new zzd<zzn>(this, Places.PLACE_DETECTION_API, googleApiClient) {
            protected void zza(zzn com_google_android_gms_location_places_internal_zzn) throws RemoteException {
                com_google_android_gms_location_places_internal_zzn.zza(new zzo((zzd) this), placeFilter);
            }
        });
    }

    public PendingResult<Status> reportDeviceAtPlace(GoogleApiClient googleApiClient, final PlaceReport placeReport) {
        return googleApiClient.zzb(new zzf<zzn>(this, Places.PLACE_DETECTION_API, googleApiClient) {
            protected void zza(zzn com_google_android_gms_location_places_internal_zzn) throws RemoteException {
                com_google_android_gms_location_places_internal_zzn.zza(new zzo((zzf) this), placeReport);
            }
        });
    }
}
