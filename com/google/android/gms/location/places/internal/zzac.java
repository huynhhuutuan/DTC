package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.location.places.internal.zza.zza;

public class zzac implements Creator<zza> {
    static void zza(zza com_google_android_gms_location_places_internal_zza_zza, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zzc(parcel, 1, com_google_android_gms_location_places_internal_zza_zza.mOffset);
        zzc.zzc(parcel, 2, com_google_android_gms_location_places_internal_zza_zza.mLength);
        zzc.zzc(parcel, 1000, com_google_android_gms_location_places_internal_zza_zza.zzaiI);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhq(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkX(i);
    }

    public zza zzhq(Parcel parcel) {
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

    public zza[] zzkX(int i) {
        return new zza[i];
    }
}
