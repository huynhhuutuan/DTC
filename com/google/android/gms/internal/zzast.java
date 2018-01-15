package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;
import java.util.ArrayList;
import java.util.List;

public class zzast implements Creator<zzass> {
    static void zza(zzass com_google_android_gms_internal_zzass, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zza(parcel, 1, com_google_android_gms_internal_zzass.getStatus(), i, false);
        zzc.zzc(parcel, 2, com_google_android_gms_internal_zzass.zzJf(), false);
        zzc.zzc(parcel, 1000, com_google_android_gms_internal_zzass.zzaiI);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhs(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkZ(i);
    }

    public zzass zzhs(Parcel parcel) {
        List list = null;
        int zzaY = zzb.zzaY(parcel);
        int i = 0;
        Status status = null;
        while (parcel.dataPosition() < zzaY) {
            int i2;
            Status status2;
            ArrayList zzc;
            int zzaX = zzb.zzaX(parcel);
            List list2;
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    i2 = i;
                    Status status3 = (Status) zzb.zza(parcel, zzaX, Status.CREATOR);
                    list2 = list;
                    status2 = status3;
                    break;
                case 2:
                    zzc = zzb.zzc(parcel, zzaX, zzasq.CREATOR);
                    status2 = status;
                    i2 = i;
                    break;
                case 1000:
                    List list3 = list;
                    status2 = status;
                    i2 = zzb.zzg(parcel, zzaX);
                    list2 = list3;
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    zzc = list;
                    status2 = status;
                    i2 = i;
                    break;
            }
            i = i2;
            status = status2;
            Object obj = zzc;
        }
        if (parcel.dataPosition() == zzaY) {
            return new zzass(i, status, list);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzass[] zzkZ(int i) {
        return new zzass[i];
    }
}
