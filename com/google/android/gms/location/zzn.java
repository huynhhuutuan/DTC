package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;
import java.util.List;

public class zzn implements Creator<LocationResult> {
    static void zza(LocationResult locationResult, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zzc(parcel, 1, locationResult.getLocations(), false);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgN(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkn(i);
    }

    public LocationResult zzgN(Parcel parcel) {
        int zzaY = zzb.zzaY(parcel);
        List list = LocationResult.zzbkd;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    list = zzb.zzc(parcel, zzaX, Location.CREATOR);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new LocationResult(list);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public LocationResult[] zzkn(int i) {
        return new LocationResult[i];
    }
}
