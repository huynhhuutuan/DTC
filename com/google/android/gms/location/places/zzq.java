package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;

public class zzq implements Creator<zzp> {
    static void zza(zzp com_google_android_gms_location_places_zzp, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zza(parcel, 1, com_google_android_gms_location_places_zzp.zzUA, false);
        zzc.zzc(parcel, 2, com_google_android_gms_location_places_zzp.zzbmd);
        zzc.zzc(parcel, 1000, com_google_android_gms_location_places_zzp.zzaiI);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhh(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkN(i);
    }

    public zzp zzhh(Parcel parcel) {
        int i = 0;
        int zzaY = zzb.zzaY(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    str = zzb.zzq(parcel, zzaX);
                    break;
                case 2:
                    i = zzb.zzg(parcel, zzaX);
                    break;
                case 1000:
                    i2 = zzb.zzg(parcel, zzaX);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new zzp(i2, str, i);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzp[] zzkN(int i) {
        return new zzp[i];
    }
}
