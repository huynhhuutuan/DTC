package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.internal.PlaceEntity.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class zzy extends zzab implements Place {
    private final String zzblI = zzO("place_id", "");

    public zzy(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    private List<String> zzIT() {
        return zzc("place_attributions", Collections.emptyList());
    }

    private PlaceEntity zzJd() {
        PlaceEntity zzJa = new zza().zzeX(getAddress().toString()).zzH(zzIT()).zzeV(getId()).zzaI(zzIU()).zza(getLatLng()).zzg(zzIR()).zzeW(getName().toString()).zzeY(getPhoneNumber().toString()).zzkR(getPriceLevel()).zzh(getRating()).zzG(getPlaceTypes()).zza(getViewport()).zzt(getWebsiteUri()).zza(zzIV()).zzJa();
        zzJa.setLocale(getLocale());
        return zzJa;
    }

    public /* synthetic */ Object freeze() {
        return zzIZ();
    }

    public CharSequence getAddress() {
        return zzO("place_address", "");
    }

    public CharSequence getAttributions() {
        return zzf.zzo(zzIT());
    }

    public String getId() {
        return this.zzblI;
    }

    public LatLng getLatLng() {
        return (LatLng) zza("place_lat_lng", LatLng.CREATOR);
    }

    public Locale getLocale() {
        Object zzO = zzO("place_locale_language", "");
        if (!TextUtils.isEmpty(zzO)) {
            return new Locale(zzO, zzO("place_locale_country", ""));
        }
        zzO = zzO("place_locale", "");
        return !TextUtils.isEmpty(zzO) ? new Locale(zzO) : Locale.getDefault();
    }

    public CharSequence getName() {
        return zzO("place_name", "");
    }

    public CharSequence getPhoneNumber() {
        return zzO("place_phone_number", "");
    }

    public List<Integer> getPlaceTypes() {
        return zzb("place_types", Collections.emptyList());
    }

    public int getPriceLevel() {
        return zzy("place_price_level", -1);
    }

    public float getRating() {
        return zzb("place_rating", -1.0f);
    }

    public LatLngBounds getViewport() {
        return (LatLngBounds) zza("place_viewport", LatLngBounds.CREATOR);
    }

    public Uri getWebsiteUri() {
        String zzO = zzO("place_website_uri", null);
        return zzO == null ? null : Uri.parse(zzO);
    }

    public float zzIR() {
        return zzb("place_level_number", 0.0f);
    }

    public boolean zzIU() {
        return zzk("place_is_permanently_closed", false);
    }

    zzu zzIV() {
        return (zzu) zza("place_opening_hours", zzu.CREATOR);
    }

    public Place zzIZ() {
        return zzJd();
    }
}
