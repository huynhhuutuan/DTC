package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;

public class zzeh implements Creator<zzeg> {
    static void zza(zzeg com_google_android_gms_internal_zzeg, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zza(parcel, 2, com_google_android_gms_internal_zzeg.zzzy, false);
        zzc.zzc(parcel, 3, com_google_android_gms_internal_zzeg.height);
        zzc.zzc(parcel, 4, com_google_android_gms_internal_zzeg.heightPixels);
        zzc.zza(parcel, 5, com_google_android_gms_internal_zzeg.zzzz);
        zzc.zzc(parcel, 6, com_google_android_gms_internal_zzeg.width);
        zzc.zzc(parcel, 7, com_google_android_gms_internal_zzeg.widthPixels);
        zzc.zza(parcel, 8, com_google_android_gms_internal_zzeg.zzzA, i, false);
        zzc.zza(parcel, 9, com_google_android_gms_internal_zzeg.zzzB);
        zzc.zza(parcel, 10, com_google_android_gms_internal_zzeg.zzzC);
        zzc.zza(parcel, 11, com_google_android_gms_internal_zzeg.zzzD);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzf(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzw(i);
    }

    public zzeg zzf(Parcel parcel) {
        zzeg[] com_google_android_gms_internal_zzegArr = null;
        boolean z = false;
        int zzaY = zzb.zzaY(parcel);
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        boolean z4 = false;
        int i3 = 0;
        int i4 = 0;
        String str = null;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 2:
                    str = zzb.zzq(parcel, zzaX);
                    break;
                case 3:
                    i4 = zzb.zzg(parcel, zzaX);
                    break;
                case 4:
                    i3 = zzb.zzg(parcel, zzaX);
                    break;
                case 5:
                    z4 = zzb.zzc(parcel, zzaX);
                    break;
                case 6:
                    i2 = zzb.zzg(parcel, zzaX);
                    break;
                case 7:
                    i = zzb.zzg(parcel, zzaX);
                    break;
                case 8:
                    com_google_android_gms_internal_zzegArr = (zzeg[]) zzb.zzb(parcel, zzaX, zzeg.CREATOR);
                    break;
                case 9:
                    z3 = zzb.zzc(parcel, zzaX);
                    break;
                case 10:
                    z2 = zzb.zzc(parcel, zzaX);
                    break;
                case 11:
                    z = zzb.zzc(parcel, zzaX);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new zzeg(str, i4, i3, z4, i2, i, com_google_android_gms_internal_zzegArr, z3, z2, z);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzeg[] zzw(int i) {
        return new zzeg[i];
    }
}
