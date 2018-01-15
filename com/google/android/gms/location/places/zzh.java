package com.google.android.gms.location.places;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public class zzh extends com.google.android.gms.location.places.internal.zzk.zza {
    private final zzb zzblw;
    private final zza zzblx;

    public static abstract class zza<A extends zze> extends com.google.android.gms.location.places.zzo.zzb<PlacePhotoResult, A> {
        public zza(Api api, GoogleApiClient googleApiClient) {
            super(api, googleApiClient);
        }

        protected PlacePhotoResult zzbq(Status status) {
            return new PlacePhotoResult(status, null);
        }

        protected /* synthetic */ Result zzc(Status status) {
            return zzbq(status);
        }
    }

    public static abstract class zzb<A extends zze> extends com.google.android.gms.location.places.zzo.zzb<PlacePhotoMetadataResult, A> {
        public zzb(Api api, GoogleApiClient googleApiClient) {
            super(api, googleApiClient);
        }

        protected PlacePhotoMetadataResult zzbr(Status status) {
            return new PlacePhotoMetadataResult(status, null);
        }

        protected /* synthetic */ Result zzc(Status status) {
            return zzbr(status);
        }
    }

    public zzh(zza com_google_android_gms_location_places_zzh_zza) {
        this.zzblw = null;
        this.zzblx = com_google_android_gms_location_places_zzh_zza;
    }

    public zzh(zzb com_google_android_gms_location_places_zzh_zzb) {
        this.zzblw = com_google_android_gms_location_places_zzh_zzb;
        this.zzblx = null;
    }

    public void zza(PlacePhotoMetadataResult placePhotoMetadataResult) throws RemoteException {
        this.zzblw.zzb(placePhotoMetadataResult);
    }

    public void zza(PlacePhotoResult placePhotoResult) throws RemoteException {
        this.zzblx.zzb(placePhotoResult);
    }
}
