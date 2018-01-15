package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.location.places.internal.zzu.zza;

public class zzd implements Creator<zza> {
    static void zza(zza com_google_android_gms_location_places_internal_zzu_zza, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zzc(parcel, 1, com_google_android_gms_location_places_internal_zzu_zza.zzbmR);
        zzc.zzc(parcel, 2, com_google_android_gms_location_places_internal_zzu_zza.zzbmS);
        zzc.zzc(parcel, 1000, com_google_android_gms_location_places_internal_zzu_zza.zzaiI);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhj(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkP(i);
    }

    public zza zzhj(Parcel parcel) {
        int i = 0;
        int zzaY = zzb.zzaY(parcel);
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    i2 = zzb.zzg(parcel, zzaX);
                    break;
                case 2:
                    i = zzb.zzg(parcel, zzaX);
                    break;
                case 1000:
                    i3 = zzb.zzg(parcel, zzaX);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new zza(i3, i2, i);
        }
        throw new zzb.zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zza[] zzkP(int i) {
        return new zza[i];
    }
}
