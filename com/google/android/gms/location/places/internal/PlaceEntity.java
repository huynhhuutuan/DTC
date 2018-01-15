package com.google.android.gms.location.places.internal;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class PlaceEntity extends com.google.android.gms.common.internal.safeparcel.zza implements ReflectedParcelable, Place {
    public static final Creator<PlaceEntity> CREATOR = new zzo();
    private final String mName;
    private final String zzGV;
    private final String zzaSq;
    final int zzaiI;
    private Locale zzblY;
    private final LatLng zzblb;
    private final List<Integer> zzblc;
    private final String zzbld;
    private final Uri zzble;
    private final boolean zzbmA;
    private final float zzbmB;
    private final int zzbmC;
    private final List<Integer> zzbmD;
    private final String zzbmE;
    private final List<String> zzbmF;
    private final zzu zzbmG;
    private final Map<Integer, String> zzbmH;
    private final TimeZone zzbmI;
    private final Bundle zzbmv;
    @Deprecated
    private final zzs zzbmw;
    private final float zzbmx;
    private final LatLngBounds zzbmy;
    private final String zzbmz;

    public static class zza {
        private String mName;
        private String zzGV;
        private String zzaSq;
        private int zzaiI = 0;
        private LatLng zzblb;
        private String zzbld;
        private Uri zzble;
        private boolean zzbmA;
        private float zzbmB;
        private int zzbmC;
        private List<String> zzbmF;
        private zzu zzbmG;
        private List<Integer> zzbmJ;
        private float zzbmx;
        private LatLngBounds zzbmy;

        public zza zzG(List<Integer> list) {
            this.zzbmJ = list;
            return this;
        }

        public zza zzH(List<String> list) {
            this.zzbmF = list;
            return this;
        }

        public PlaceEntity zzJa() {
            return new PlaceEntity(0, this.zzGV, this.zzbmJ, Collections.emptyList(), null, this.mName, this.zzaSq, this.zzbld, null, this.zzbmF, this.zzblb, this.zzbmx, this.zzbmy, null, this.zzble, this.zzbmA, this.zzbmB, this.zzbmC, zzs.zza(this.mName, this.zzaSq, this.zzbld, null, this.zzbmF), this.zzbmG);
        }

        public zza zza(zzu com_google_android_gms_location_places_internal_zzu) {
            this.zzbmG = com_google_android_gms_location_places_internal_zzu;
            return this;
        }

        public zza zza(LatLng latLng) {
            this.zzblb = latLng;
            return this;
        }

        public zza zza(LatLngBounds latLngBounds) {
            this.zzbmy = latLngBounds;
            return this;
        }

        public zza zzaI(boolean z) {
            this.zzbmA = z;
            return this;
        }

        public zza zzeV(String str) {
            this.zzGV = str;
            return this;
        }

        public zza zzeW(String str) {
            this.mName = str;
            return this;
        }

        public zza zzeX(String str) {
            this.zzaSq = str;
            return this;
        }

        public zza zzeY(String str) {
            this.zzbld = str;
            return this;
        }

        public zza zzg(float f) {
            this.zzbmx = f;
            return this;
        }

        public zza zzh(float f) {
            this.zzbmB = f;
            return this;
        }

        public zza zzkR(int i) {
            this.zzbmC = i;
            return this;
        }

        public zza zzt(Uri uri) {
            this.zzble = uri;
            return this;
        }
    }

    PlaceEntity(int i, String str, List<Integer> list, List<Integer> list2, Bundle bundle, String str2, String str3, String str4, String str5, List<String> list3, LatLng latLng, float f, LatLngBounds latLngBounds, String str6, Uri uri, boolean z, float f2, int i2, zzs com_google_android_gms_location_places_internal_zzs, zzu com_google_android_gms_location_places_internal_zzu) {
        List emptyList;
        this.zzaiI = i;
        this.zzGV = str;
        this.zzblc = Collections.unmodifiableList(list);
        this.zzbmD = list2;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zzbmv = bundle;
        this.mName = str2;
        this.zzaSq = str3;
        this.zzbld = str4;
        this.zzbmE = str5;
        if (list3 == null) {
            emptyList = Collections.emptyList();
        }
        this.zzbmF = emptyList;
        this.zzblb = latLng;
        this.zzbmx = f;
        this.zzbmy = latLngBounds;
        if (str6 == null) {
            str6 = "UTC";
        }
        this.zzbmz = str6;
        this.zzble = uri;
        this.zzbmA = z;
        this.zzbmB = f2;
        this.zzbmC = i2;
        this.zzbmH = Collections.unmodifiableMap(new HashMap());
        this.zzbmI = null;
        this.zzblY = null;
        this.zzbmw = com_google_android_gms_location_places_internal_zzs;
        this.zzbmG = com_google_android_gms_location_places_internal_zzu;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceEntity)) {
            return false;
        }
        PlaceEntity placeEntity = (PlaceEntity) obj;
        return this.zzGV.equals(placeEntity.zzGV) && zzaa.equal(this.zzblY, placeEntity.zzblY);
    }

    public /* synthetic */ Object freeze() {
        return zzIZ();
    }

    public String getAddress() {
        return this.zzaSq;
    }

    public CharSequence getAttributions() {
        return zzf.zzo(this.zzbmF);
    }

    public String getId() {
        return this.zzGV;
    }

    public LatLng getLatLng() {
        return this.zzblb;
    }

    public Locale getLocale() {
        return this.zzblY;
    }

    public String getName() {
        return this.mName;
    }

    public String getPhoneNumber() {
        return this.zzbld;
    }

    public List<Integer> getPlaceTypes() {
        return this.zzblc;
    }

    public int getPriceLevel() {
        return this.zzbmC;
    }

    public float getRating() {
        return this.zzbmB;
    }

    public LatLngBounds getViewport() {
        return this.zzbmy;
    }

    public Uri getWebsiteUri() {
        return this.zzble;
    }

    public int hashCode() {
        return zzaa.hashCode(this.zzGV, this.zzblY);
    }

    public boolean isDataValid() {
        return true;
    }

    public void setLocale(Locale locale) {
        this.zzblY = locale;
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return zzaa.zzv(this).zzg("id", this.zzGV).zzg("placeTypes", this.zzblc).zzg("locale", this.zzblY).zzg("name", this.mName).zzg("address", this.zzaSq).zzg("phoneNumber", this.zzbld).zzg("latlng", this.zzblb).zzg("viewport", this.zzbmy).zzg("websiteUri", this.zzble).zzg("isPermanentlyClosed", Boolean.valueOf(this.zzbmA)).zzg("priceLevel", Integer.valueOf(this.zzbmC)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzo.zza(this, parcel, i);
    }

    public List<Integer> zzIQ() {
        return this.zzbmD;
    }

    public float zzIR() {
        return this.zzbmx;
    }

    public String zzIS() {
        return this.zzbmE;
    }

    public List<String> zzIT() {
        return this.zzbmF;
    }

    public boolean zzIU() {
        return this.zzbmA;
    }

    public zzu zzIV() {
        return this.zzbmG;
    }

    public Bundle zzIW() {
        return this.zzbmv;
    }

    public String zzIX() {
        return this.zzbmz;
    }

    @Deprecated
    public zzs zzIY() {
        return this.zzbmw;
    }

    public Place zzIZ() {
        return this;
    }
}
