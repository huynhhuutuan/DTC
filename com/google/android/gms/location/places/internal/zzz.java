package com.google.android.gms.location.places.internal;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import java.util.Locale;

public class zzz extends zza {
    public static final Creator<zzz> CREATOR = new zzaa();
    public static final zzz zzbnf = new zzz("com.google.android.gms", Locale.getDefault(), null);
    public final int versionCode;
    public final String zzaJT;
    public final String zzblW;
    public final String zzbng;
    public final String zzbnh;
    public final int zzbni;
    public final int zzbnj;

    public zzz(int i, String str, String str2, String str3, String str4, int i2, int i3) {
        this.versionCode = i;
        this.zzbng = str;
        this.zzbnh = str2;
        this.zzaJT = str3;
        this.zzblW = str4;
        this.zzbni = i2;
        this.zzbnj = i3;
    }

    public zzz(String str, Locale locale, String str2) {
        this(3, str, locale.toString(), str2, null, GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE, 0);
    }

    public zzz(String str, Locale locale, String str2, String str3, int i) {
        this(3, str, locale.toString(), str2, str3, GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzz)) {
            return false;
        }
        zzz com_google_android_gms_location_places_internal_zzz = (zzz) obj;
        return this.zzbni == com_google_android_gms_location_places_internal_zzz.zzbni && this.zzbnj == com_google_android_gms_location_places_internal_zzz.zzbnj && this.zzbnh.equals(com_google_android_gms_location_places_internal_zzz.zzbnh) && this.zzbng.equals(com_google_android_gms_location_places_internal_zzz.zzbng) && zzaa.equal(this.zzaJT, com_google_android_gms_location_places_internal_zzz.zzaJT) && zzaa.equal(this.zzblW, com_google_android_gms_location_places_internal_zzz.zzblW);
    }

    public int hashCode() {
        return zzaa.hashCode(this.zzbng, this.zzbnh, this.zzaJT, this.zzblW, Integer.valueOf(this.zzbni), Integer.valueOf(this.zzbnj));
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return zzaa.zzv(this).zzg("clientPackageName", this.zzbng).zzg("locale", this.zzbnh).zzg("accountName", this.zzaJT).zzg("gCoreClientName", this.zzblW).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzaa.zza(this, parcel, i);
    }
}
