package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;

public class zzarx implements Creator<zzarw> {
    static void zza(zzarw com_google_android_gms_internal_zzarw, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zzc(parcel, 1, com_google_android_gms_internal_zzarw.uid);
        zzc.zza(parcel, 2, com_google_android_gms_internal_zzarw.packageName, false);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgT(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkv(i);
    }

    public zzarw zzgT(Parcel parcel) {
        int zzaY = zzb.zzaY(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    i = zzb.zzg(parcel, zzaX);
                    break;
                case 2:
                    str = zzb.zzq(parcel, zzaX);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new zzarw(i, str);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzarw[] zzkv(int i) {
        return new zzarw[i];
    }
}
