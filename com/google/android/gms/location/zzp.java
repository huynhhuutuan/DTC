package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;

public class zzp implements Creator<zzo> {
    static void zza(zzo com_google_android_gms_location_zzo, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zza(parcel, 1, com_google_android_gms_location_zzo.zzIf(), false);
        zzc.zza(parcel, 2, com_google_android_gms_location_zzo.zzIg(), false);
        zzc.zzc(parcel, 3, com_google_android_gms_location_zzo.zzIh());
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgO(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzko(i);
    }

    public zzo zzgO(Parcel parcel) {
        int zzaY = zzb.zzaY(parcel);
        String str = "";
        String str2 = "";
        int i = 0;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    str = zzb.zzq(parcel, zzaX);
                    break;
                case 2:
                    str2 = zzb.zzq(parcel, zzaX);
                    break;
                case 3:
                    i = zzb.zzg(parcel, zzaX);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new zzo(str, str2, i);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzo[] zzko(int i) {
        return new zzo[i];
    }
}
