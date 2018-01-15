package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzaa.zza;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class zzd extends zza {
    public static final Creator<zzd> CREATOR = new zze();
    final int zzaiI;
    final List<String> zzblj;
    final List<Integer> zzblk;
    final List<zzp> zzbll;
    final String zzblm;
    final boolean zzbln;
    private final Set<String> zzblo;
    private final Set<Integer> zzblp;
    private final Set<zzp> zzblq;

    zzd(int i, @Nullable List<String> list, @Nullable List<Integer> list2, @Nullable List<zzp> list3, @Nullable String str, boolean z) {
        this.zzaiI = i;
        this.zzblk = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.zzbll = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.zzblj = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.zzblp = zza.zzF(this.zzblk);
        this.zzblq = zza.zzF(this.zzbll);
        this.zzblo = zza.zzF(this.zzblj);
        this.zzblm = str;
        this.zzbln = z;
    }

    public static zzd zzm(Collection<String> collection) {
        if (collection != null && !collection.isEmpty()) {
            return new zzd(0, zza.zzk(collection), null, null, null, false);
        }
        throw new IllegalArgumentException("NearbyAlertFilters must contain at least oneplace ID to match results with.");
    }

    public static zzd zzn(Collection<Integer> collection) {
        if (collection != null && !collection.isEmpty()) {
            return new zzd(0, null, zza.zzk(collection), null, null, false);
        }
        throw new IllegalArgumentException("NearbyAlertFilters must contain at least oneplace type to match results with.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzd)) {
            return false;
        }
        zzd com_google_android_gms_location_places_zzd = (zzd) obj;
        return (this.zzblm != null || com_google_android_gms_location_places_zzd.zzblm == null) ? this.zzblp.equals(com_google_android_gms_location_places_zzd.zzblp) && this.zzblq.equals(com_google_android_gms_location_places_zzd.zzblq) && this.zzblo.equals(com_google_android_gms_location_places_zzd.zzblo) && ((this.zzblm == null || this.zzblm.equals(com_google_android_gms_location_places_zzd.zzblm)) && this.zzbln == com_google_android_gms_location_places_zzd.zzIx()) : false;
    }

    public Set<String> getPlaceIds() {
        return this.zzblo;
    }

    public int hashCode() {
        return zzaa.hashCode(this.zzblp, this.zzblq, this.zzblo, this.zzblm, Boolean.valueOf(this.zzbln));
    }

    public String toString() {
        zza zzv = zzaa.zzv(this);
        if (!this.zzblp.isEmpty()) {
            zzv.zzg("types", this.zzblp);
        }
        if (!this.zzblo.isEmpty()) {
            zzv.zzg("placeIds", this.zzblo);
        }
        if (!this.zzblq.isEmpty()) {
            zzv.zzg("requestedUserDataTypes", this.zzblq);
        }
        if (this.zzblm != null) {
            zzv.zzg("chainName", this.zzblm);
        }
        zzv.zzg("Beacon required: ", Boolean.valueOf(this.zzbln));
        return zzv.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zze.zza(this, parcel, i);
    }

    public boolean zzIx() {
        return this.zzbln;
    }
}
