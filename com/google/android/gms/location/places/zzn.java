package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;

public class zzn implements Creator<zzm> {
    static void zza(zzm com_google_android_gms_location_places_zzm, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zza(parcel, 2, com_google_android_gms_location_places_zzm.zzIz(), i, false);
        zzc.zza(parcel, 3, com_google_android_gms_location_places_zzm.getInterval());
        zzc.zzc(parcel, 4, com_google_android_gms_location_places_zzm.getPriority());
        zzc.zza(parcel, 5, com_google_android_gms_location_places_zzm.getExpirationTime());
        zzc.zza(parcel, 6, com_google_android_gms_location_places_zzm.zzIG());
        zzc.zza(parcel, 7, com_google_android_gms_location_places_zzm.zzIH());
        zzc.zzc(parcel, 1000, com_google_android_gms_location_places_zzm.zzaiI);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhg(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkM(i);
    }

    public zzm zzhg(Parcel parcel) {
        boolean z = false;
        int zzaY = zzb.zzaY(parcel);
        PlaceFilter placeFilter = null;
        long j = -1;
        int i = -1;
        long j2 = Long.MAX_VALUE;
        boolean z2 = false;
        int i2 = 0;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 2:
                    placeFilter = (PlaceFilter) zzb.zza(parcel, zzaX, PlaceFilter.CREATOR);
                    break;
                case 3:
                    j = zzb.zzi(parcel, zzaX);
                    break;
                case 4:
                    i = zzb.zzg(parcel, zzaX);
                    break;
                case 5:
                    j2 = zzb.zzi(parcel, zzaX);
                    break;
                case 6:
                    z2 = zzb.zzc(parcel, zzaX);
                    break;
                case 7:
                    z = zzb.zzc(parcel, zzaX);
                    break;
                case 1000:
                    i2 = zzb.zzg(parcel, zzaX);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new zzm(i2, placeFilter, j, i, j2, z2, z);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzm[] zzkM(int i) {
        return new zzm[i];
    }
}
