package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;
import java.util.List;

public class zzq implements Creator<LocationSettingsRequest> {
    static void zza(LocationSettingsRequest locationSettingsRequest, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zzc(parcel, 1, locationSettingsRequest.zzDe(), false);
        zzc.zza(parcel, 2, locationSettingsRequest.zzIi());
        zzc.zza(parcel, 3, locationSettingsRequest.zzIj());
        zzc.zza(parcel, 5, locationSettingsRequest.zzIk(), i, false);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgP(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkp(i);
    }

    public LocationSettingsRequest zzgP(Parcel parcel) {
        zzo com_google_android_gms_location_zzo = null;
        boolean z = false;
        int zzaY = zzb.zzaY(parcel);
        boolean z2 = false;
        List list = null;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    list = zzb.zzc(parcel, zzaX, LocationRequest.CREATOR);
                    break;
                case 2:
                    z2 = zzb.zzc(parcel, zzaX);
                    break;
                case 3:
                    z = zzb.zzc(parcel, zzaX);
                    break;
                case 5:
                    com_google_android_gms_location_zzo = (zzo) zzb.zza(parcel, zzaX, zzo.CREATOR);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new LocationSettingsRequest(list, z2, z, com_google_android_gms_location_zzo);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public LocationSettingsRequest[] zzkp(int i) {
        return new LocationSettingsRequest[i];
    }
}
