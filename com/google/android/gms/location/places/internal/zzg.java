package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.AutocompletePredictionBuffer;
import com.google.android.gms.location.places.GeoDataApi;
import com.google.android.gms.location.places.PlaceBuffer;
import com.google.android.gms.location.places.PlacePhotoMetadataResult;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.zzh;
import com.google.android.gms.location.places.zzh.zzb;
import com.google.android.gms.location.places.zzo;
import com.google.android.gms.location.places.zzo.zza;
import com.google.android.gms.location.places.zzo.zzc;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;

public class zzg implements GeoDataApi {
    public PendingResult<PlaceBuffer> addPlace(GoogleApiClient googleApiClient, final AddPlaceRequest addPlaceRequest) {
        return googleApiClient.zzb(new zzc<zzh>(this, Places.GEO_DATA_API, googleApiClient) {
            protected void zza(zzh com_google_android_gms_location_places_internal_zzh) throws RemoteException {
                com_google_android_gms_location_places_internal_zzh.zza(new zzo((zzc) this), addPlaceRequest);
            }
        });
    }

    public PendingResult<AutocompletePredictionBuffer> getAutocompletePredictions(GoogleApiClient googleApiClient, String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter) {
        final String str2 = str;
        final LatLngBounds latLngBounds2 = latLngBounds;
        final AutocompleteFilter autocompleteFilter2 = autocompleteFilter;
        return googleApiClient.zza(new zza<zzh>(this, Places.GEO_DATA_API, googleApiClient) {
            protected void zza(zzh com_google_android_gms_location_places_internal_zzh) throws RemoteException {
                com_google_android_gms_location_places_internal_zzh.zza(new zzo((zza) this), str2, latLngBounds2, autocompleteFilter2);
            }
        });
    }

    public PendingResult<PlaceBuffer> getPlaceById(GoogleApiClient googleApiClient, final String... strArr) {
        boolean z = true;
        if (strArr == null || strArr.length < 1) {
            z = false;
        }
        zzac.zzax(z);
        return googleApiClient.zza(new zzc<zzh>(this, Places.GEO_DATA_API, googleApiClient) {
            protected void zza(zzh com_google_android_gms_location_places_internal_zzh) throws RemoteException {
                com_google_android_gms_location_places_internal_zzh.zza(new zzo((zzc) this), Arrays.asList(strArr));
            }
        });
    }

    public PendingResult<PlacePhotoMetadataResult> getPlacePhotos(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.zza(new zzb<zzh>(this, Places.GEO_DATA_API, googleApiClient) {
            protected void zza(zzh com_google_android_gms_location_places_internal_zzh) throws RemoteException {
                com_google_android_gms_location_places_internal_zzh.zza(new zzh((zzb) this), str);
            }
        });
    }
}
