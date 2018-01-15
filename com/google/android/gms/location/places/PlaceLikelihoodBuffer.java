package com.google.android.gms.location.places;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.location.places.internal.zzp;
import com.google.android.gms.location.places.internal.zzr;
import java.util.Comparator;

public class PlaceLikelihoodBuffer extends AbstractDataBuffer<PlaceLikelihood> implements Result {
    private static final Comparator<zzp> zzblE = new C06811();
    private final int zzAW;
    private final Status zzair;
    private final String zzbly;

    class C06811 implements Comparator<zzp> {
        C06811() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return zza((zzp) obj, (zzp) obj2);
        }

        public int zza(zzp com_google_android_gms_location_places_internal_zzp, zzp com_google_android_gms_location_places_internal_zzp2) {
            return -Float.compare(com_google_android_gms_location_places_internal_zzp.getLikelihood(), com_google_android_gms_location_places_internal_zzp2.getLikelihood());
        }
    }

    public static class zza {
        static int zzkI(int i) {
            switch (i) {
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                    return i;
                default:
                    throw new IllegalArgumentException("invalid source: " + i);
            }
        }
    }

    public PlaceLikelihoodBuffer(DataHolder dataHolder, int i) {
        super(dataHolder);
        this.zzair = PlacesStatusCodes.zzdv(dataHolder.getStatusCode());
        this.zzAW = zza.zzkI(i);
        if (dataHolder == null || dataHolder.zzxf() == null) {
            this.zzbly = null;
        } else {
            this.zzbly = dataHolder.zzxf().getString("com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY");
        }
    }

    public static int zzM(Bundle bundle) {
        return bundle.getInt("com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY");
    }

    public PlaceLikelihood get(int i) {
        return new zzr(this.zzaBi, i);
    }

    @Nullable
    public CharSequence getAttributions() {
        return this.zzbly;
    }

    public Status getStatus() {
        return this.zzair;
    }

    public String toString() {
        return zzaa.zzv(this).zzg("status", getStatus()).zzg("attributions", this.zzbly).toString();
    }
}
