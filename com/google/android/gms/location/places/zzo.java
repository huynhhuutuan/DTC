package com.google.android.gms.location.places;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.internal.zzasy;

public class zzo extends com.google.android.gms.location.places.internal.zzl.zza {
    private static final String TAG = zzo.class.getSimpleName();
    private final zzd zzblQ;
    private final zza zzblR;
    private final zze zzblS;
    private final zzf zzblT;
    private final zzc zzblU;

    public static abstract class zzb<R extends Result, A extends com.google.android.gms.common.api.Api.zze> extends com.google.android.gms.internal.zzaad.zza<R, A> {
        public zzb(Api api, GoogleApiClient googleApiClient) {
            super(api, googleApiClient);
        }

        public /* synthetic */ void setResult(Object obj) {
            super.zzb((Result) obj);
        }
    }

    public static abstract class zza<A extends com.google.android.gms.common.api.Api.zze> extends zzb<AutocompletePredictionBuffer, A> {
        public zza(Api api, GoogleApiClient googleApiClient) {
            super(api, googleApiClient);
        }

        protected AutocompletePredictionBuffer zzbt(Status status) {
            return new AutocompletePredictionBuffer(DataHolder.zzcJ(status.getStatusCode()));
        }

        protected /* synthetic */ Result zzc(Status status) {
            return zzbt(status);
        }
    }

    public static abstract class zzc<A extends com.google.android.gms.common.api.Api.zze> extends zzb<PlaceBuffer, A> {
        public zzc(Api api, GoogleApiClient googleApiClient) {
            super(api, googleApiClient);
        }

        protected PlaceBuffer zzbu(Status status) {
            return new PlaceBuffer(DataHolder.zzcJ(status.getStatusCode()));
        }

        protected /* synthetic */ Result zzc(Status status) {
            return zzbu(status);
        }
    }

    public static abstract class zzd<A extends com.google.android.gms.common.api.Api.zze> extends zzb<PlaceLikelihoodBuffer, A> {
        public zzd(Api api, GoogleApiClient googleApiClient) {
            super(api, googleApiClient);
        }

        protected PlaceLikelihoodBuffer zzbv(Status status) {
            return new PlaceLikelihoodBuffer(DataHolder.zzcJ(status.getStatusCode()), 100);
        }

        protected /* synthetic */ Result zzc(Status status) {
            return zzbv(status);
        }
    }

    @Deprecated
    public static abstract class zze<A extends com.google.android.gms.common.api.Api.zze> extends zzb<zzasy, A> {
    }

    public static abstract class zzf<A extends com.google.android.gms.common.api.Api.zze> extends zzb<Status, A> {
        public zzf(Api api, GoogleApiClient googleApiClient) {
            super(api, googleApiClient);
        }

        protected Status zzb(Status status) {
            return status;
        }

        protected /* synthetic */ Result zzc(Status status) {
            return zzb(status);
        }
    }

    public zzo(zza com_google_android_gms_location_places_zzo_zza) {
        this.zzblQ = null;
        this.zzblR = com_google_android_gms_location_places_zzo_zza;
        this.zzblS = null;
        this.zzblT = null;
        this.zzblU = null;
    }

    public zzo(zzc com_google_android_gms_location_places_zzo_zzc) {
        this.zzblQ = null;
        this.zzblR = null;
        this.zzblS = null;
        this.zzblT = null;
        this.zzblU = com_google_android_gms_location_places_zzo_zzc;
    }

    public zzo(zzd com_google_android_gms_location_places_zzo_zzd) {
        this.zzblQ = com_google_android_gms_location_places_zzo_zzd;
        this.zzblR = null;
        this.zzblS = null;
        this.zzblT = null;
        this.zzblU = null;
    }

    public zzo(zzf com_google_android_gms_location_places_zzo_zzf) {
        this.zzblQ = null;
        this.zzblR = null;
        this.zzblS = null;
        this.zzblT = com_google_android_gms_location_places_zzo_zzf;
        this.zzblU = null;
    }

    public void zzam(DataHolder dataHolder) throws RemoteException {
        zzac.zza(this.zzblQ != null, (Object) "placeEstimator cannot be null");
        if (dataHolder == null) {
            if (Log.isLoggable(TAG, 6)) {
                Log.e(TAG, "onPlaceEstimated received null DataHolder", new Throwable());
            }
            this.zzblQ.zzB(Status.zzazz);
            return;
        }
        Bundle zzxf = dataHolder.zzxf();
        this.zzblQ.zzb(new PlaceLikelihoodBuffer(dataHolder, zzxf == null ? 100 : PlaceLikelihoodBuffer.zzM(zzxf)));
    }

    public void zzan(DataHolder dataHolder) throws RemoteException {
        if (dataHolder == null) {
            if (Log.isLoggable(TAG, 6)) {
                Log.e(TAG, "onAutocompletePrediction received null DataHolder", new Throwable());
            }
            this.zzblR.zzB(Status.zzazz);
            return;
        }
        this.zzblR.zzb(new AutocompletePredictionBuffer(dataHolder));
    }

    public void zzao(DataHolder dataHolder) throws RemoteException {
        zze com_google_android_gms_location_places_zzo_zze = null;
        if (dataHolder == null) {
            if (Log.isLoggable(TAG, 6)) {
                Log.e(TAG, "onPlaceUserDataFetched received null DataHolder", new Throwable());
            }
            com_google_android_gms_location_places_zzo_zze.zzB(Status.zzazz);
            return;
        }
        com_google_android_gms_location_places_zzo_zze.zzb(new zzasy(dataHolder));
    }

    public void zzap(DataHolder dataHolder) throws RemoteException {
        this.zzblU.zzb(new PlaceBuffer(dataHolder));
    }

    public void zzbs(Status status) throws RemoteException {
        this.zzblT.zzb(status);
    }
}
