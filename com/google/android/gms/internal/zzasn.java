package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;

public class zzasn implements Creator<zzasm> {
    static void zza(zzasm com_google_android_gms_internal_zzasm, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zza(parcel, 1, com_google_android_gms_internal_zzasm.getRequestId(), false);
        zzc.zza(parcel, 2, com_google_android_gms_internal_zzasm.getExpirationTime());
        zzc.zza(parcel, 3, com_google_android_gms_internal_zzasm.zzIt());
        zzc.zza(parcel, 4, com_google_android_gms_internal_zzasm.getLatitude());
        zzc.zza(parcel, 5, com_google_android_gms_internal_zzasm.getLongitude());
        zzc.zza(parcel, 6, com_google_android_gms_internal_zzasm.getRadius());
        zzc.zzc(parcel, 7, com_google_android_gms_internal_zzasm.zzIu());
        zzc.zzc(parcel, 8, com_google_android_gms_internal_zzasm.zzIv());
        zzc.zzc(parcel, 9, com_google_android_gms_internal_zzasm.zzIw());
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgX(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkC(i);
    }

    public zzasm zzgX(Parcel parcel) {
        int zzaY = zzb.zzaY(parcel);
        String str = null;
        int i = 0;
        short s = (short) 0;
        double d = 0.0d;
        double d2 = 0.0d;
        float f = 0.0f;
        long j = 0;
        int i2 = 0;
        int i3 = -1;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    str = zzb.zzq(parcel, zzaX);
                    break;
                case 2:
                    j = zzb.zzi(parcel, zzaX);
                    break;
                case 3:
                    s = zzb.zzf(parcel, zzaX);
                    break;
                case 4:
                    d = zzb.zzn(parcel, zzaX);
                    break;
                case 5:
                    d2 = zzb.zzn(parcel, zzaX);
                    break;
                case 6:
                    f = zzb.zzl(parcel, zzaX);
                    break;
                case 7:
                    i = zzb.zzg(parcel, zzaX);
                    break;
                case 8:
                    i2 = zzb.zzg(parcel, zzaX);
                    break;
                case 9:
                    i3 = zzb.zzg(parcel, zzaX);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new zzasm(str, i, s, d, d2, f, j, i2, i3);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzasm[] zzkC(int i) {
        return new zzasm[i];
    }
}
