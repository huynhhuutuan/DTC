package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.internal.zzarw;
import java.util.List;

public class zzg implements Creator<zzf> {
    static void zza(zzf com_google_android_gms_location_zzf, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zzc(parcel, 1, com_google_android_gms_location_zzf.zzIc(), false);
        zzc.zza(parcel, 2, com_google_android_gms_location_zzf.getTag(), false);
        zzc.zzc(parcel, 3, com_google_android_gms_location_zzf.zzId(), false);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgI(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkd(i);
    }

    public zzf zzgI(Parcel parcel) {
        List list = null;
        int zzaY = zzb.zzaY(parcel);
        String str = null;
        List list2 = null;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    list2 = zzb.zzc(parcel, zzaX, zzd.CREATOR);
                    break;
                case 2:
                    str = zzb.zzq(parcel, zzaX);
                    break;
                case 3:
                    list = zzb.zzc(parcel, zzaX, zzarw.CREATOR);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new zzf(list2, str, list);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzf[] zzkd(int i) {
        return new zzf[i];
    }
}
