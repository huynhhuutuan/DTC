package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzl;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlacesOptions;
import com.google.android.gms.location.places.PlacesOptions.Builder;
import com.google.android.gms.location.places.zzo;
import java.util.Locale;

public class zzn extends zzl<zzi> {
    private final Locale zzblY;
    private final zzz zzbms;

    public static class zza extends com.google.android.gms.common.api.Api.zza<zzn, PlacesOptions> {
        public /* synthetic */ zze zza(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return zzb(context, looper, com_google_android_gms_common_internal_zzg, (PlacesOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }

        public zzn zzb(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, PlacesOptions placesOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            PlacesOptions build = placesOptions == null ? new Builder().build() : placesOptions;
            String packageName = context.getPackageName();
            if (build.zzblV != null) {
                packageName = build.zzblV;
            }
            return new zzn(context, looper, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener, packageName, build);
        }
    }

    private zzn(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str, PlacesOptions placesOptions) {
        super(context, looper, 67, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        this.zzblY = Locale.getDefault();
        String str2 = null;
        if (com_google_android_gms_common_internal_zzg.getAccount() != null) {
            str2 = com_google_android_gms_common_internal_zzg.getAccount().name;
        }
        this.zzbms = new zzz(str, this.zzblY, str2, placesOptions.zzblW, placesOptions.zzblX);
    }

    public void zza(zzo com_google_android_gms_location_places_zzo, PlaceFilter placeFilter) throws RemoteException {
        if (placeFilter == null) {
            placeFilter = PlaceFilter.zzIE();
        }
        ((zzi) zzxD()).zza(placeFilter, this.zzbms, (zzl) com_google_android_gms_location_places_zzo);
    }

    public void zza(zzo com_google_android_gms_location_places_zzo, PlaceReport placeReport) throws RemoteException {
        zzac.zzw(placeReport);
        ((zzi) zzxD()).zza(placeReport, this.zzbms, (zzl) com_google_android_gms_location_places_zzo);
    }

    protected zzi zzdp(IBinder iBinder) {
        return com.google.android.gms.location.places.internal.zzi.zza.zzdl(iBinder);
    }

    protected String zzeA() {
        return "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService";
    }

    protected String zzez() {
        return "com.google.android.gms.location.places.PlaceDetectionApi";
    }

    protected /* synthetic */ IInterface zzh(IBinder iBinder) {
        return zzdp(iBinder);
    }
}
