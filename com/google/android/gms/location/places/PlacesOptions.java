package com.google.android.gms.location.places;

import android.support.annotation.Nullable;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.internal.zzaa;
import java.util.Locale;

public final class PlacesOptions implements Optional {
    @Nullable
    public final String zzaiu;
    @Nullable
    public final String zzblV;
    @Nullable
    public final String zzblW;
    public final int zzblX;
    @Nullable
    public final Locale zzblY;

    public static class Builder {
        private int zzblX = 0;

        public PlacesOptions build() {
            return new PlacesOptions();
        }
    }

    private PlacesOptions(Builder builder) {
        this.zzblV = null;
        this.zzblW = null;
        this.zzblX = 0;
        this.zzaiu = null;
        this.zzblY = null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlacesOptions)) {
            return false;
        }
        PlacesOptions placesOptions = (PlacesOptions) obj;
        return zzaa.equal(this.zzblV, placesOptions.zzblV) && zzaa.equal(this.zzblW, placesOptions.zzblW) && zzaa.equal(Integer.valueOf(this.zzblX), Integer.valueOf(placesOptions.zzblX)) && zzaa.equal(this.zzaiu, placesOptions.zzaiu) && zzaa.equal(this.zzblY, placesOptions.zzblY);
    }

    @Nullable
    public String getAccountName() {
        return this.zzaiu;
    }

    @Nullable
    public Locale getLocale() {
        return this.zzblY;
    }

    public int hashCode() {
        return zzaa.hashCode(this.zzblV, this.zzblW, Integer.valueOf(this.zzblX), this.zzaiu, this.zzblY);
    }
}
