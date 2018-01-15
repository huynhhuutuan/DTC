package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.zzaa;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class PlaceFilter extends zza {
    public static final Creator<PlaceFilter> CREATOR = new zzi();
    private static final PlaceFilter zzblz = new PlaceFilter();
    final int zzaiI;
    final boolean zzblA;
    final List<String> zzblj;
    final List<Integer> zzblk;
    final List<zzp> zzbll;
    private final Set<String> zzblo;
    private final Set<Integer> zzblp;
    private final Set<zzp> zzblq;

    @Deprecated
    public static final class zza {
        private boolean zzblA;
        private Collection<Integer> zzblB;
        private Collection<zzp> zzblC;
        private String[] zzblD;

        private zza() {
            this.zzblB = null;
            this.zzblA = false;
            this.zzblC = null;
            this.zzblD = null;
        }

        public PlaceFilter zzIF() {
            return new PlaceFilter(null, false, null, null);
        }
    }

    public PlaceFilter() {
        this(false, null);
    }

    PlaceFilter(int i, @Nullable List<Integer> list, boolean z, @Nullable List<String> list2, @Nullable List<zzp> list3) {
        this.zzaiI = i;
        this.zzblk = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.zzblA = z;
        this.zzbll = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.zzblj = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.zzblp = zza.zzF(this.zzblk);
        this.zzblq = zza.zzF(this.zzbll);
        this.zzblo = zza.zzF(this.zzblj);
    }

    public PlaceFilter(@Nullable Collection<Integer> collection, boolean z, @Nullable Collection<String> collection2, @Nullable Collection<zzp> collection3) {
        this(0, zza.zzk(collection), z, zza.zzk(collection2), zza.zzk(collection3));
    }

    public PlaceFilter(boolean z, @Nullable Collection<String> collection) {
        this(null, z, collection, null);
    }

    @Deprecated
    public static PlaceFilter zzIE() {
        return new zza().zzIF();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceFilter)) {
            return false;
        }
        PlaceFilter placeFilter = (PlaceFilter) obj;
        return this.zzblp.equals(placeFilter.zzblp) && this.zzblA == placeFilter.zzblA && this.zzblq.equals(placeFilter.zzblq) && this.zzblo.equals(placeFilter.zzblo);
    }

    public Set<String> getPlaceIds() {
        return this.zzblo;
    }

    public int hashCode() {
        return zzaa.hashCode(this.zzblp, Boolean.valueOf(this.zzblA), this.zzblq, this.zzblo);
    }

    public boolean isRestrictedToPlacesOpenNow() {
        return this.zzblA;
    }

    public String toString() {
        com.google.android.gms.common.internal.zzaa.zza zzv = zzaa.zzv(this);
        if (!this.zzblp.isEmpty()) {
            zzv.zzg("types", this.zzblp);
        }
        zzv.zzg("requireOpenNow", Boolean.valueOf(this.zzblA));
        if (!this.zzblo.isEmpty()) {
            zzv.zzg("placeIds", this.zzblo);
        }
        if (!this.zzblq.isEmpty()) {
            zzv.zzg("requestedUserDataTypes", this.zzblq);
        }
        return zzv.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzi.zza(this, parcel, i);
    }

    public Set<Integer> zzID() {
        return this.zzblp;
    }
}
