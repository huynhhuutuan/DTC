package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import java.util.List;

public class zzc implements Creator<AutocompleteFilter> {
    static void zza(AutocompleteFilter autocompleteFilter, Parcel parcel, int i) {
        int zzaZ = com.google.android.gms.common.internal.safeparcel.zzc.zzaZ(parcel);
        com.google.android.gms.common.internal.safeparcel.zzc.zza(parcel, 1, autocompleteFilter.zzblf);
        com.google.android.gms.common.internal.safeparcel.zzc.zza(parcel, 2, autocompleteFilter.zzblg, false);
        com.google.android.gms.common.internal.safeparcel.zzc.zza(parcel, 3, autocompleteFilter.zzblh, false);
        com.google.android.gms.common.internal.safeparcel.zzc.zzc(parcel, 1000, autocompleteFilter.zzaiI);
        com.google.android.gms.common.internal.safeparcel.zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgZ(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkE(i);
    }

    public AutocompleteFilter zzgZ(Parcel parcel) {
        String str = null;
        boolean z = false;
        int zzaY = zzb.zzaY(parcel);
        List list = null;
        int i = 0;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    z = zzb.zzc(parcel, zzaX);
                    break;
                case 2:
                    list = zzb.zzD(parcel, zzaX);
                    break;
                case 3:
                    str = zzb.zzq(parcel, zzaX);
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
            return new AutocompleteFilter(i, z, list, str);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public AutocompleteFilter[] zzkE(int i) {
        return new AutocompleteFilter[i];
    }
}
