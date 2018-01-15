package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzl;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.PlacesOptions;
import com.google.android.gms.location.places.PlacesOptions.Builder;
import com.google.android.gms.location.places.zzo;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import java.util.Locale;

public class zzh extends zzl<zzj> {
    private final zzz zzbms;

    public static class zza extends com.google.android.gms.common.api.Api.zza<zzh, PlacesOptions> {
        public zzh zza(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, PlacesOptions placesOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            PlacesOptions build = placesOptions == null ? new Builder().build() : placesOptions;
            String packageName = context.getPackageName();
            if (build.zzblV != null) {
                packageName = build.zzblV;
            }
            return new zzh(context, looper, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener, packageName, build);
        }
    }

    private zzh(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str, PlacesOptions placesOptions) {
        super(context, looper, 65, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        Locale locale = Locale.getDefault();
        if (!(placesOptions == null || placesOptions.getLocale() == null)) {
            locale = placesOptions.getLocale();
        }
        String str2 = null;
        if (placesOptions != null && placesOptions.getAccountName() != null) {
            str2 = placesOptions.getAccountName();
        } else if (com_google_android_gms_common_internal_zzg.getAccount() != null) {
            str2 = com_google_android_gms_common_internal_zzg.getAccount().name;
        }
        this.zzbms = new zzz(str, locale, str2, placesOptions.zzblW, placesOptions.zzblX);
    }

    public void zza(com.google.android.gms.location.places.zzh com_google_android_gms_location_places_zzh, String str) throws RemoteException {
        zzac.zzb((Object) str, (Object) "placeId cannot be null");
        ((zzj) zzxD()).zza(str, this.zzbms, (zzk) com_google_android_gms_location_places_zzh);
    }

    public void zza(com.google.android.gms.location.places.zzh com_google_android_gms_location_places_zzh, String str, int i, int i2, int i3) throws RemoteException {
        boolean z = true;
        zzac.zzb((Object) str, (Object) "fifeUrl cannot be null");
        zzac.zzb(i > 0, (Object) "width should be > 0");
        if (i <= 0) {
            z = false;
        }
        zzac.zzb(z, (Object) "height should be > 0");
        ((zzj) zzxD()).zza(str, i, i2, i3, this.zzbms, (zzk) com_google_android_gms_location_places_zzh);
    }

    public void zza(zzo com_google_android_gms_location_places_zzo, AddPlaceRequest addPlaceRequest) throws RemoteException {
        zzac.zzb((Object) addPlaceRequest, (Object) "userAddedPlace == null");
        ((zzj) zzxD()).zza(addPlaceRequest, this.zzbms, (zzl) com_google_android_gms_location_places_zzo);
    }

    public void zza(zzo com_google_android_gms_location_places_zzo, String str, @Nullable LatLngBounds latLngBounds, @Nullable AutocompleteFilter autocompleteFilter) throws RemoteException {
        zzac.zzb((Object) com_google_android_gms_location_places_zzo, (Object) "callback == null");
        ((zzj) zzxD()).zza(str == null ? "" : str, latLngBounds, autocompleteFilter == null ? new AutocompleteFilter.Builder().build() : autocompleteFilter, this.zzbms, (zzl) com_google_android_gms_location_places_zzo);
    }

    public void zza(zzo com_google_android_gms_location_places_zzo, List<String> list) throws RemoteException {
        ((zzj) zzxD()).zzb((List) list, this.zzbms, (zzl) com_google_android_gms_location_places_zzo);
    }

    protected zzj zzdk(IBinder iBinder) {
        return com.google.android.gms.location.places.internal.zzj.zza.zzdm(iBinder);
    }

    protected String zzeA() {
        return "com.google.android.gms.location.places.internal.IGooglePlacesService";
    }

    protected String zzez() {
        return "com.google.android.gms.location.places.GeoDataApi";
    }

    protected /* synthetic */ IInterface zzh(IBinder iBinder) {
        return zzdk(iBinder);
    }
}
