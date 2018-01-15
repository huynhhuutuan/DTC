package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;

public class zze implements Creator<zzd> {
    static void zza(zzd com_google_android_gms_location_zzd, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zzc(parcel, 1, com_google_android_gms_location_zzd.zzBV());
        zzc.zzc(parcel, 2, com_google_android_gms_location_zzd.zzIb());
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgH(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkc(i);
    }

    public zzd zzgH(Parcel parcel) {
        int i = 0;
        int zzaY = zzb.zzaY(parcel);
        int i2 = 0;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    i2 = zzb.zzg(parcel, zzaX);
                    break;
                case 2:
                    i = zzb.zzg(parcel, zzaX);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new zzd(i2, i);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzd[] zzkc(int i) {
        return new zzd[i];
    }
}
