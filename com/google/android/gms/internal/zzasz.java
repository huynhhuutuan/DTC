package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;
import java.util.List;

public class zzasz implements Creator<zzasx> {
    static void zza(zzasx com_google_android_gms_internal_zzasx, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zza(parcel, 1, com_google_android_gms_internal_zzasx.zzJh(), false);
        zzc.zza(parcel, 2, com_google_android_gms_internal_zzasx.getPlaceId(), false);
        zzc.zzc(parcel, 6, com_google_android_gms_internal_zzasx.zzJe(), false);
        zzc.zzc(parcel, 1000, com_google_android_gms_internal_zzasx.zzaiI);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhu(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzlb(i);
    }

    public zzasx zzhu(Parcel parcel) {
        List list = null;
        int zzaY = zzb.zzaY(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    str2 = zzb.zzq(parcel, zzaX);
                    break;
                case 2:
                    str = zzb.zzq(parcel, zzaX);
                    break;
                case 6:
                    list = zzb.zzc(parcel, zzaX, zzasv.CREATOR);
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
            return new zzasx(i, str2, str, list);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzasx[] zzlb(int i) {
        return new zzasx[i];
    }
}
