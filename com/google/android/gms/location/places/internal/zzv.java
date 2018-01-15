package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.location.places.internal.zzu.zza;
import java.util.List;

public class zzv implements Creator<zzu> {
    static void zza(zzu com_google_android_gms_location_places_internal_zzu, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zzc(parcel, 1, com_google_android_gms_location_places_internal_zzu.zzbmP, false);
        zzc.zzc(parcel, 2, com_google_android_gms_location_places_internal_zzu.zzbmQ, false);
        zzc.zzc(parcel, 1000, com_google_android_gms_location_places_internal_zzu.zzaiI);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzho(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkV(i);
    }

    public zzu zzho(Parcel parcel) {
        List list = null;
        int zzaY = zzb.zzaY(parcel);
        int i = 0;
        List list2 = null;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    list2 = zzb.zzc(parcel, zzaX, zza.CREATOR);
                    break;
                case 2:
                    list = zzb.zzc(parcel, zzaX, zzu.zzb.CREATOR);
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
            return new zzu(i, list2, list);
        }
        throw new zzb.zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzu[] zzkV(int i) {
        return new zzu[i];
    }
}
