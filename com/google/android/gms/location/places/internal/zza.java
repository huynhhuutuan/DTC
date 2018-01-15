package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.style.CharacterStyle;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.location.places.AutocompletePrediction;
import java.util.Collections;
import java.util.List;

public class zza extends com.google.android.gms.common.internal.safeparcel.zza implements AutocompletePrediction {
    public static final Creator<zza> CREATOR = new zzb();
    private static final List<zza> zzbme = Collections.emptyList();
    final int zzaiI;
    final String zzblI;
    final List<Integer> zzblc;
    final String zzbmf;
    final List<zza> zzbmg;
    final int zzbmh;
    final String zzbmi;
    final List<zza> zzbmj;
    final String zzbmk;
    final List<zza> zzbml;

    public static class zza extends com.google.android.gms.common.internal.safeparcel.zza {
        public static final Creator<zza> CREATOR = new zzac();
        final int mLength;
        final int mOffset;
        final int zzaiI;

        public zza(int i, int i2, int i3) {
            this.zzaiI = i;
            this.mOffset = i2;
            this.mLength = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza com_google_android_gms_location_places_internal_zza_zza = (zza) obj;
            return zzaa.equal(Integer.valueOf(this.mOffset), Integer.valueOf(com_google_android_gms_location_places_internal_zza_zza.mOffset)) && zzaa.equal(Integer.valueOf(this.mLength), Integer.valueOf(com_google_android_gms_location_places_internal_zza_zza.mLength));
        }

        public int getLength() {
            return this.mLength;
        }

        public int getOffset() {
            return this.mOffset;
        }

        public int hashCode() {
            return zzaa.hashCode(Integer.valueOf(this.mOffset), Integer.valueOf(this.mLength));
        }

        public String toString() {
            return zzaa.zzv(this).zzg("offset", Integer.valueOf(this.mOffset)).zzg("length", Integer.valueOf(this.mLength)).toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            zzac.zza(this, parcel, i);
        }
    }

    zza(int i, String str, List<Integer> list, int i2, String str2, List<zza> list2, String str3, List<zza> list3, String str4, List<zza> list4) {
        this.zzaiI = i;
        this.zzblI = str;
        this.zzblc = list;
        this.zzbmh = i2;
        this.zzbmf = str2;
        this.zzbmg = list2;
        this.zzbmi = str3;
        this.zzbmj = list3;
        this.zzbmk = str4;
        this.zzbml = list4;
    }

    public static zza zza(String str, List<Integer> list, int i, String str2, List<zza> list2, String str3, List<zza> list3, String str4, List<zza> list4) {
        return new zza(0, str, list, i, (String) zzac.zzw(str2), list2, str3, list3, str4, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zza)) {
            return false;
        }
        zza com_google_android_gms_location_places_internal_zza = (zza) obj;
        return zzaa.equal(this.zzblI, com_google_android_gms_location_places_internal_zza.zzblI) && zzaa.equal(this.zzblc, com_google_android_gms_location_places_internal_zza.zzblc) && zzaa.equal(Integer.valueOf(this.zzbmh), Integer.valueOf(com_google_android_gms_location_places_internal_zza.zzbmh)) && zzaa.equal(this.zzbmf, com_google_android_gms_location_places_internal_zza.zzbmf) && zzaa.equal(this.zzbmg, com_google_android_gms_location_places_internal_zza.zzbmg) && zzaa.equal(this.zzbmi, com_google_android_gms_location_places_internal_zza.zzbmi) && zzaa.equal(this.zzbmj, com_google_android_gms_location_places_internal_zza.zzbmj) && zzaa.equal(this.zzbmk, com_google_android_gms_location_places_internal_zza.zzbmk) && zzaa.equal(this.zzbml, com_google_android_gms_location_places_internal_zza.zzbml);
    }

    public /* synthetic */ Object freeze() {
        return zzII();
    }

    public CharSequence getFullText(@Nullable CharacterStyle characterStyle) {
        return zzf.zza(this.zzbmf, this.zzbmg, characterStyle);
    }

    @Nullable
    public String getPlaceId() {
        return this.zzblI;
    }

    public List<Integer> getPlaceTypes() {
        return this.zzblc;
    }

    public CharSequence getPrimaryText(@Nullable CharacterStyle characterStyle) {
        return zzf.zza(this.zzbmi, this.zzbmj, characterStyle);
    }

    public CharSequence getSecondaryText(@Nullable CharacterStyle characterStyle) {
        return zzf.zza(this.zzbmk, this.zzbml, characterStyle);
    }

    public int hashCode() {
        return zzaa.hashCode(this.zzblI, this.zzblc, Integer.valueOf(this.zzbmh), this.zzbmf, this.zzbmg, this.zzbmi, this.zzbmj, this.zzbmk, this.zzbml);
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return zzaa.zzv(this).zzg("placeId", this.zzblI).zzg("placeTypes", this.zzblc).zzg("fullText", this.zzbmf).zzg("fullTextMatchedSubstrings", this.zzbmg).zzg("primaryText", this.zzbmi).zzg("primaryTextMatchedSubstrings", this.zzbmj).zzg("secondaryText", this.zzbmk).zzg("secondaryTextMatchedSubstrings", this.zzbml).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }

    public AutocompletePrediction zzII() {
        return this;
    }
}
