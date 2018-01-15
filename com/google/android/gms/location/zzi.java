package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.internal.zzasm;
import java.util.List;

public class zzi implements Creator<GeofencingRequest> {
    static void zza(GeofencingRequest geofencingRequest, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zzc(parcel, 1, geofencingRequest.zzIe(), false);
        zzc.zzc(parcel, 2, geofencingRequest.getInitialTrigger());
        zzc.zza(parcel, 3, geofencingRequest.getTag(), false);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgK(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzki(i);
    }

    public GeofencingRequest zzgK(Parcel parcel) {
        int zzaY = zzb.zzaY(parcel);
        List list = null;
        int i = 0;
        String str = "";
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    list = zzb.zzc(parcel, zzaX, zzasm.CREATOR);
                    break;
                case 2:
                    i = zzb.zzg(parcel, zzaX);
                    break;
                case 3:
                    str = zzb.zzq(parcel, zzaX);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new GeofencingRequest(list, i, str);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public GeofencingRequest[] zzki(int i) {
        return new GeofencingRequest[i];
    }
}
