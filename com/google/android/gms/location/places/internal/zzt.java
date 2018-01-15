package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;
import java.util.List;

public class zzt implements Creator<zzs> {
    static void zza(zzs com_google_android_gms_location_places_internal_zzs, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zza(parcel, 1, com_google_android_gms_location_places_internal_zzs.name, false);
        zzc.zza(parcel, 2, com_google_android_gms_location_places_internal_zzs.address, false);
        zzc.zza(parcel, 3, com_google_android_gms_location_places_internal_zzs.zzbmM, false);
        zzc.zza(parcel, 4, com_google_android_gms_location_places_internal_zzs.zzbmN, false);
        zzc.zzb(parcel, 5, com_google_android_gms_location_places_internal_zzs.zzbmO, false);
        zzc.zzc(parcel, 1000, com_google_android_gms_location_places_internal_zzs.versionCode);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhn(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkU(i);
    }

    public zzs zzhn(Parcel parcel) {
        List list = null;
        int zzaY = zzb.zzaY(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    str4 = zzb.zzq(parcel, zzaX);
                    break;
                case 2:
                    str3 = zzb.zzq(parcel, zzaX);
                    break;
                case 3:
                    str2 = zzb.zzq(parcel, zzaX);
                    break;
                case 4:
                    str = zzb.zzq(parcel, zzaX);
                    break;
                case 5:
                    list = zzb.zzE(parcel, zzaX);
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
            return new zzs(i, str4, str3, str2, str, list);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzs[] zzkU(int i) {
        return new zzs[i];
    }
}
