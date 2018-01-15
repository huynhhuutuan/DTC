package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;
import java.util.List;

public class zzasr implements Creator<zzasq> {
    static void zza(zzasq com_google_android_gms_internal_zzasq, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zza(parcel, 1, com_google_android_gms_internal_zzasq.getPlaceId(), false);
        zzc.zzb(parcel, 2, com_google_android_gms_internal_zzasq.zzJe(), false);
        zzc.zzc(parcel, 1000, com_google_android_gms_internal_zzasq.zzaiI);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhr(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkY(i);
    }

    public zzasq zzhr(Parcel parcel) {
        List list = null;
        int zzaY = zzb.zzaY(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    str = zzb.zzq(parcel, zzaX);
                    break;
                case 2:
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
            return new zzasq(i, str, list);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzasq[] zzkY(int i) {
        return new zzasq[i];
    }
}
