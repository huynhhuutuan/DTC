package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.location.places.internal.zzu.zza;
import com.google.android.gms.location.places.internal.zzu.zzb;
import java.util.List;

public class zze implements Creator<zzb> {
    static void zza(zzb com_google_android_gms_location_places_internal_zzu_zzb, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zzc(parcel, 1, com_google_android_gms_location_places_internal_zzu_zzb.zzbmT);
        zzc.zzc(parcel, 2, com_google_android_gms_location_places_internal_zzu_zzb.zzbmU);
        zzc.zzc(parcel, 3, com_google_android_gms_location_places_internal_zzu_zzb.zzbmV);
        zzc.zzc(parcel, 4, com_google_android_gms_location_places_internal_zzu_zzb.zzbmW);
        zzc.zzc(parcel, 5, com_google_android_gms_location_places_internal_zzu_zzb.zzbmX);
        zzc.zzc(parcel, 6, com_google_android_gms_location_places_internal_zzu_zzb.zzbmY);
        zzc.zzc(parcel, 7, com_google_android_gms_location_places_internal_zzu_zzb.zzbmZ, false);
        zzc.zzc(parcel, 1000, com_google_android_gms_location_places_internal_zzu_zzb.zzaiI);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhk(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkQ(i);
    }

    public zzb zzhk(Parcel parcel) {
        int i = 0;
        int zzaY = com.google.android.gms.common.internal.safeparcel.zzb.zzaY(parcel);
        List list = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = com.google.android.gms.common.internal.safeparcel.zzb.zzaX(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.zzb.zzdc(zzaX)) {
                case 1:
                    i6 = com.google.android.gms.common.internal.safeparcel.zzb.zzg(parcel, zzaX);
                    break;
                case 2:
                    i5 = com.google.android.gms.common.internal.safeparcel.zzb.zzg(parcel, zzaX);
                    break;
                case 3:
                    i4 = com.google.android.gms.common.internal.safeparcel.zzb.zzg(parcel, zzaX);
                    break;
                case 4:
                    i3 = com.google.android.gms.common.internal.safeparcel.zzb.zzg(parcel, zzaX);
                    break;
                case 5:
                    i2 = com.google.android.gms.common.internal.safeparcel.zzb.zzg(parcel, zzaX);
                    break;
                case 6:
                    i = com.google.android.gms.common.internal.safeparcel.zzb.zzg(parcel, zzaX);
                    break;
                case 7:
                    list = com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, zzaX, zza.CREATOR);
                    break;
                case 1000:
                    i7 = com.google.android.gms.common.internal.safeparcel.zzb.zzg(parcel, zzaX);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new zzb(i7, i6, i5, i4, i3, i2, i, list);
        }
        throw new com.google.android.gms.common.internal.safeparcel.zzb.zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzb[] zzkQ(int i) {
        return new zzb[i];
    }
}
