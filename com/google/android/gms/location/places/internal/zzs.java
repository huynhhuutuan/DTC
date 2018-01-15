package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import java.util.List;

@Deprecated
public final class zzs extends zza {
    public static final Creator<zzs> CREATOR = new zzt();
    public final String address;
    public final String name;
    public final int versionCode;
    public final String zzbmM;
    public final String zzbmN;
    public final List<String> zzbmO;

    public zzs(int i, String str, String str2, String str3, String str4, List<String> list) {
        this.versionCode = i;
        this.name = str;
        this.address = str2;
        this.zzbmM = str3;
        this.zzbmN = str4;
        this.zzbmO = list;
    }

    public static zzs zza(String str, String str2, String str3, String str4, List<String> list) {
        return new zzs(0, str, str2, str3, str4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs com_google_android_gms_location_places_internal_zzs = (zzs) obj;
        return zzaa.equal(this.name, com_google_android_gms_location_places_internal_zzs.name) && zzaa.equal(this.address, com_google_android_gms_location_places_internal_zzs.address) && zzaa.equal(this.zzbmM, com_google_android_gms_location_places_internal_zzs.zzbmM) && zzaa.equal(this.zzbmN, com_google_android_gms_location_places_internal_zzs.zzbmN) && zzaa.equal(this.zzbmO, com_google_android_gms_location_places_internal_zzs.zzbmO);
    }

    public int hashCode() {
        return zzaa.hashCode(this.name, this.address, this.zzbmM, this.zzbmN);
    }

    public String toString() {
        return zzaa.zzv(this).zzg("name", this.name).zzg("address", this.address).zzg("internationalPhoneNumber", this.zzbmM).zzg("regularOpenHours", this.zzbmN).zzg("attributions", this.zzbmO).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzt.zza(this, parcel, i);
    }
}
