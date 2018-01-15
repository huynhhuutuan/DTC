package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;

public class zzasw implements Creator<zzasv> {
    static void zza(zzasv com_google_android_gms_internal_zzasv, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zza(parcel, 1, com_google_android_gms_internal_zzasv.zzJg(), false);
        zzc.zzc(parcel, 1000, com_google_android_gms_internal_zzasv.zzaiI);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzht(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzla(i);
    }

    public zzasv zzht(Parcel parcel) {
        int zzaY = zzb.zzaY(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    str = zzb.zzq(parcel, zzaX);
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
            return new zzasv(i, str);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzasv[] zzla(int i) {
        return new zzasv[i];
    }
}
