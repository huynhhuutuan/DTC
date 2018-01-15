package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AddPlaceRequest extends zza {
    public static final Creator<AddPlaceRequest> CREATOR = new zzb();
    private final String mName;
    private final String zzaSq;
    final int zzaiI;
    private final LatLng zzblb;
    private final List<Integer> zzblc;
    private final String zzbld;
    private final Uri zzble;

    AddPlaceRequest(int i, String str, LatLng latLng, String str2, List<Integer> list, String str3, Uri uri) {
        boolean z = false;
        this.zzaiI = i;
        this.mName = zzac.zzdr(str);
        this.zzblb = (LatLng) zzac.zzw(latLng);
        this.zzaSq = zzac.zzdr(str2);
        this.zzblc = new ArrayList((Collection) zzac.zzw(list));
        zzac.zzb(!this.zzblc.isEmpty(), (Object) "At least one place type should be provided.");
        if (!(TextUtils.isEmpty(str3) && uri == null)) {
            z = true;
        }
        zzac.zzb(z, (Object) "One of phone number or URI should be provided.");
        this.zzbld = str3;
        this.zzble = uri;
    }

    public AddPlaceRequest(String str, LatLng latLng, String str2, List<Integer> list, Uri uri) {
        this(str, latLng, str2, list, null, (Uri) zzac.zzw(uri));
    }

    public AddPlaceRequest(String str, LatLng latLng, String str2, List<Integer> list, String str3) {
        this(str, latLng, str2, list, zzac.zzdr(str3), null);
    }

    public AddPlaceRequest(String str, LatLng latLng, String str2, List<Integer> list, String str3, Uri uri) {
        this(0, str, latLng, str2, list, str3, uri);
    }

    public String getAddress() {
        return this.zzaSq;
    }

    public LatLng getLatLng() {
        return this.zzblb;
    }

    public String getName() {
        return this.mName;
    }

    @Nullable
    public String getPhoneNumber() {
        return this.zzbld;
    }

    public List<Integer> getPlaceTypes() {
        return this.zzblc;
    }

    @Nullable
    public Uri getWebsiteUri() {
        return this.zzble;
    }

    public String toString() {
        return zzaa.zzv(this).zzg("name", this.mName).zzg("latLng", this.zzblb).zzg("address", this.zzaSq).zzg("placeTypes", this.zzblc).zzg("phoneNumer", this.zzbld).zzg("websiteUri", this.zzble).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }
}
