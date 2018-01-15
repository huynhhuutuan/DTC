package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;

public class zzb implements Creator<zza> {
    static void zza(zza com_google_android_gms_location_zza, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zza(parcel, 1, com_google_android_gms_location_zza.getIntervalMillis());
        zzc.zza(parcel, 2, com_google_android_gms_location_zza.zzHW());
        zzc.zza(parcel, 3, com_google_android_gms_location_zza.zzHX(), i, false);
        zzc.zza(parcel, 4, com_google_android_gms_location_zza.getTag(), false);
        zzc.zza(parcel, 5, com_google_android_gms_location_zza.zzHY(), false);
        zzc.zza(parcel, 6, com_google_android_gms_location_zza.zzHZ());
        zzc.zza(parcel, 7, com_google_android_gms_location_zza.getAccountName(), false);
        zzc.zza(parcel, 8, com_google_android_gms_location_zza.zzIa());
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgF(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzka(i);
    }

    public zza zzgF(Parcel parcel) {
        long j = 0;
        boolean z = false;
        String str = null;
        int zzaY = com.google.android.gms.common.internal.safeparcel.zzb.zzaY(parcel);
        int[] iArr = null;
        String str2 = null;
        WorkSource workSource = null;
        boolean z2 = false;
        long j2 = 0;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = com.google.android.gms.common.internal.safeparcel.zzb.zzaX(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.zzb.zzdc(zzaX)) {
                case 1:
                    j2 = com.google.android.gms.common.internal.safeparcel.zzb.zzi(parcel, zzaX);
                    break;
                case 2:
                    z2 = com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, zzaX);
                    break;
                case 3:
                    workSource = (WorkSource) com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, zzaX, WorkSource.CREATOR);
                    break;
                case 4:
                    str2 = com.google.android.gms.common.internal.safeparcel.zzb.zzq(parcel, zzaX);
                    break;
                case 5:
                    iArr = com.google.android.gms.common.internal.safeparcel.zzb.zzw(parcel, zzaX);
                    break;
                case 6:
                    z = com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, zzaX);
                    break;
                case 7:
                    str = com.google.android.gms.common.internal.safeparcel.zzb.zzq(parcel, zzaX);
                    break;
                case 8:
                    j = com.google.android.gms.common.internal.safeparcel.zzb.zzi(parcel, zzaX);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new zza(j2, z2, workSource, str2, iArr, z, str, j);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zza[] zzka(int i) {
        return new zza[i];
    }
}
