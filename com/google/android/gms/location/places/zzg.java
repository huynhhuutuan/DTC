package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;

public class zzg implements Creator<zzf> {
    static void zza(zzf com_google_android_gms_location_places_zzf, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zzc(parcel, 1, com_google_android_gms_location_places_zzf.zzIu());
        zzc.zzc(parcel, 2, com_google_android_gms_location_places_zzf.zzIy());
        zzc.zza(parcel, 3, com_google_android_gms_location_places_zzf.zzIz(), i, false);
        zzc.zza(parcel, 4, com_google_android_gms_location_places_zzf.zzIA(), i, false);
        zzc.zza(parcel, 5, com_google_android_gms_location_places_zzf.zzIB());
        zzc.zzc(parcel, 6, com_google_android_gms_location_places_zzf.zzIC());
        zzc.zzc(parcel, 7, com_google_android_gms_location_places_zzf.getPriority());
        zzc.zzc(parcel, 1000, com_google_android_gms_location_places_zzf.getVersionCode());
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhb(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkG(i);
    }

    public zzf zzhb(Parcel parcel) {
        zzd com_google_android_gms_location_places_zzd = null;
        int i = 0;
        int zzaY = zzb.zzaY(parcel);
        int i2 = -1;
        int i3 = 110;
        boolean z = false;
        PlaceFilter placeFilter = null;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    i4 = zzb.zzg(parcel, zzaX);
                    break;
                case 2:
                    i2 = zzb.zzg(parcel, zzaX);
                    break;
                case 3:
                    placeFilter = (PlaceFilter) zzb.zza(parcel, zzaX, PlaceFilter.CREATOR);
                    break;
                case 4:
                    com_google_android_gms_location_places_zzd = (zzd) zzb.zza(parcel, zzaX, zzd.CREATOR);
                    break;
                case 5:
                    z = zzb.zzc(parcel, zzaX);
                    break;
                case 6:
                    i = zzb.zzg(parcel, zzaX);
                    break;
                case 7:
                    i3 = zzb.zzg(parcel, zzaX);
                    break;
                case 1000:
                    i5 = zzb.zzg(parcel, zzaX);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new zzf(i5, i4, i2, placeFilter, com_google_android_gms_location_places_zzd, z, i, i3);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzf[] zzkG(int i) {
        return new zzf[i];
    }
}
