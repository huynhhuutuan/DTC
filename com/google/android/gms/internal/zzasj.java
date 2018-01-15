package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

public class zzasj implements Creator<zzasi> {
    static void zza(zzasi com_google_android_gms_internal_zzasi, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zza(parcel, 1, com_google_android_gms_internal_zzasi.zzaWw, i, false);
        zzc.zzc(parcel, 5, com_google_android_gms_internal_zzasi.zzbjB, false);
        zzc.zza(parcel, 6, com_google_android_gms_internal_zzasi.mTag, false);
        zzc.zza(parcel, 7, com_google_android_gms_internal_zzasi.zzbkR);
        zzc.zza(parcel, 8, com_google_android_gms_internal_zzasi.zzbkS);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgV(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzky(i);
    }

    public zzasi zzgV(Parcel parcel) {
        String str = null;
        boolean z = false;
        int zzaY = zzb.zzaY(parcel);
        List list = zzasi.zzbkQ;
        boolean z2 = false;
        LocationRequest locationRequest = null;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    locationRequest = (LocationRequest) zzb.zza(parcel, zzaX, LocationRequest.CREATOR);
                    break;
                case 5:
                    list = zzb.zzc(parcel, zzaX, zzarw.CREATOR);
                    break;
                case 6:
                    str = zzb.zzq(parcel, zzaX);
                    break;
                case 7:
                    z2 = zzb.zzc(parcel, zzaX);
                    break;
                case 8:
                    z = zzb.zzc(parcel, zzaX);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new zzasi(locationRequest, list, str, z2, z);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzasi[] zzky(int i) {
        return new zzasi[i];
    }
}
