package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class AutocompleteFilter extends zza implements ReflectedParcelable {
    public static final Creator<AutocompleteFilter> CREATOR = new zzc();
    public static final int TYPE_FILTER_ADDRESS = 2;
    public static final int TYPE_FILTER_CITIES = 5;
    public static final int TYPE_FILTER_ESTABLISHMENT = 34;
    public static final int TYPE_FILTER_GEOCODE = 1007;
    public static final int TYPE_FILTER_NONE = 0;
    public static final int TYPE_FILTER_REGIONS = 4;
    final int zzaiI;
    final boolean zzblf;
    final List<Integer> zzblg;
    final String zzblh;
    final int zzbli;

    public static final class Builder {
        private boolean zzblf = false;
        private String zzblh = "";
        private int zzbli = 0;

        public AutocompleteFilter build() {
            return new AutocompleteFilter(1, false, Arrays.asList(new Integer[]{Integer.valueOf(this.zzbli)}), this.zzblh);
        }

        public Builder setCountry(String str) {
            this.zzblh = str;
            return this;
        }

        public Builder setTypeFilter(int i) {
            this.zzbli = i;
            return this;
        }
    }

    AutocompleteFilter(int i, boolean z, List<Integer> list, String str) {
        boolean z2 = true;
        this.zzaiI = i;
        this.zzblg = list;
        this.zzbli = zzl(list);
        this.zzblh = str;
        if (this.zzaiI < 1) {
            if (z) {
                z2 = false;
            }
            this.zzblf = z2;
            return;
        }
        this.zzblf = z;
    }

    private static int zzl(@Nullable Collection<Integer> collection) {
        return (collection == null || collection.isEmpty()) ? 0 : ((Integer) collection.iterator().next()).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutocompleteFilter)) {
            return false;
        }
        AutocompleteFilter autocompleteFilter = (AutocompleteFilter) obj;
        return this.zzbli == autocompleteFilter.zzbli && this.zzblf == autocompleteFilter.zzblf && this.zzblh == autocompleteFilter.zzblh;
    }

    public int getTypeFilter() {
        return this.zzbli;
    }

    public int hashCode() {
        return zzaa.hashCode(Boolean.valueOf(this.zzblf), Integer.valueOf(this.zzbli), this.zzblh);
    }

    public String toString() {
        return zzaa.zzv(this).zzg("includeQueryPredictions", Boolean.valueOf(this.zzblf)).zzg("typeFilter", Integer.valueOf(this.zzbli)).zzg("country", this.zzblh).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }
}
