package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;
import java.util.List;

public class zze implements Creator<zzd> {
    static void zza(zzd com_google_android_gms_location_places_zzd, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zzb(parcel, 1, com_google_android_gms_location_places_zzd.zzblj, false);
        zzc.zza(parcel, 2, com_google_android_gms_location_places_zzd.zzblk, false);
        zzc.zzc(parcel, 3, com_google_android_gms_location_places_zzd.zzbll, false);
        zzc.zza(parcel, 4, com_google_android_gms_location_places_zzd.zzblm, false);
        zzc.zza(parcel, 5, com_google_android_gms_location_places_zzd.zzbln);
        zzc.zzc(parcel, 1000, com_google_android_gms_location_places_zzd.zzaiI);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzha(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkF(i);
    }

    public zzd zzha(Parcel parcel) {
        boolean z = false;
        String str = null;
        int zzaY = zzb.zzaY(parcel);
        List list = null;
        List list2 = null;
        List list3 = null;
        int i = 0;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    list3 = zzb.zzE(parcel, zzaX);
                    break;
                case 2:
                    list2 = zzb.zzD(parcel, zzaX);
                    break;
                case 3:
                    list = zzb.zzc(parcel, zzaX, zzp.CREATOR);
                    break;
                case 4:
                    str = zzb.zzq(parcel, zzaX);
                    break;
                case 5:
                    z = zzb.zzc(parcel, zzaX);
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
            return new zzd(i, list3, list2, list, str, z);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzd[] zzkF(int i) {
        return new zzd[i];
    }
}
