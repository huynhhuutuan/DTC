package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.location.places.internal.zzg;
import com.google.android.gms.location.places.internal.zzh;
import com.google.android.gms.location.places.internal.zzh.zza;
import com.google.android.gms.location.places.internal.zzm;
import com.google.android.gms.location.places.internal.zzn;

public class Places {
    public static final Api<PlacesOptions> GEO_DATA_API = new Api("Places.GEO_DATA_API", new zza(), zzblO);
    public static final GeoDataApi GeoDataApi = new zzg();
    public static final Api<PlacesOptions> PLACE_DETECTION_API = new Api("Places.PLACE_DETECTION_API", new zzn.zza(), zzblP);
    public static final PlaceDetectionApi PlaceDetectionApi = new zzm();
    public static final zzf<zzh> zzblO = new zzf();
    public static final zzf<zzn> zzblP = new zzf();

    private Places() {
    }
}
