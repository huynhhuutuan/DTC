package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;
import java.util.List;

public class zzi implements Creator<PlaceFilter> {
    static void zza(PlaceFilter placeFilter, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zza(parcel, 1, placeFilter.zzblk, false);
        zzc.zza(parcel, 3, placeFilter.zzblA);
        zzc.zzc(parcel, 4, placeFilter.zzbll, false);
        zzc.zzb(parcel, 6, placeFilter.zzblj, false);
        zzc.zzc(parcel, 1000, placeFilter.zzaiI);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhc(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkH(i);
    }

    public PlaceFilter zzhc(Parcel parcel) {
        boolean z = false;
        List list = null;
        int zzaY = zzb.zzaY(parcel);
        List list2 = null;
        List list3 = null;
        int i = 0;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    list3 = zzb.zzD(parcel, zzaX);
                    break;
                case 3:
                    z = zzb.zzc(parcel, zzaX);
                    break;
                case 4:
                    list = zzb.zzc(parcel, zzaX, zzp.CREATOR);
                    break;
                case 6:
                    list2 = zzb.zzE(parcel, zzaX);
                    break;
                case 1000:
                    i = zzb.zzg(parcel, zzaX);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new PlaceFilter(i, list3, z, list2, list);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public PlaceFilter[] zzkH(int i) {
        return new PlaceFilter[i];
    }
}
