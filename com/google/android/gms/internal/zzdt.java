package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;

public class zzdt implements Creator<zzds> {
    static void zza(zzds com_google_android_gms_internal_zzds, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zza(parcel, 2, com_google_android_gms_internal_zzds.url, false);
        zzc.zza(parcel, 3, com_google_android_gms_internal_zzds.zzyL);
        zzc.zza(parcel, 4, com_google_android_gms_internal_zzds.zzyM, false);
        zzc.zza(parcel, 5, com_google_android_gms_internal_zzds.zzyN, false);
        zzc.zza(parcel, 6, com_google_android_gms_internal_zzds.zzyO, false);
        zzc.zza(parcel, 7, com_google_android_gms_internal_zzds.zzyP, false);
        zzc.zza(parcel, 8, com_google_android_gms_internal_zzds.zzyQ);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzd(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzu(i);
    }

    public zzds zzd(Parcel parcel) {
        Bundle bundle = null;
        int zzaY = zzb.zzaY(parcel);
        long j = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 2:
                    str4 = zzb.zzq(parcel, zzaX);
                    break;
                case 3:
                    j = zzb.zzi(parcel, zzaX);
                    break;
                case 4:
                    str3 = zzb.zzq(parcel, zzaX);
                    break;
                case 5:
                    str2 = zzb.zzq(parcel, zzaX);
                    break;
                case 6:
                    str = zzb.zzq(parcel, zzaX);
                    break;
                case 7:
                    bundle = zzb.zzs(parcel, zzaX);
                    break;
                case 8:
                    z = zzb.zzc(parcel, zzaX);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new zzds(str4, j, str3, str2, str, bundle, z);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzds[] zzu(int i) {
        return new zzds[i];
    }
}
