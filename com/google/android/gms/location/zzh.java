package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;

public class zzh implements Creator<DetectedActivity> {
    static void zza(DetectedActivity detectedActivity, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zzc(parcel, 1, detectedActivity.zzbjF);
        zzc.zzc(parcel, 2, detectedActivity.zzbjG);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgJ(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkg(i);
    }

    public DetectedActivity zzgJ(Parcel parcel) {
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
            return new DetectedActivity(i2, i);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public DetectedActivity[] zzkg(int i) {
        return new DetectedActivity[i];
    }
}
