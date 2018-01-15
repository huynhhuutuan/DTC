package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;

public class zzaa implements Creator<zzz> {
    static void zza(zzz com_google_android_gms_location_places_internal_zzz, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zza(parcel, 1, com_google_android_gms_location_places_internal_zzz.zzbng, false);
        zzc.zza(parcel, 2, com_google_android_gms_location_places_internal_zzz.zzbnh, false);
        zzc.zza(parcel, 3, com_google_android_gms_location_places_internal_zzz.zzaJT, false);
        zzc.zza(parcel, 4, com_google_android_gms_location_places_internal_zzz.zzblW, false);
        zzc.zzc(parcel, 6, com_google_android_gms_location_places_internal_zzz.zzbni);
        zzc.zzc(parcel, 7, com_google_android_gms_location_places_internal_zzz.zzbnj);
        zzc.zzc(parcel, 1000, com_google_android_gms_location_places_internal_zzz.versionCode);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhp(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkW(i);
    }

    public zzz zzhp(Parcel parcel) {
        int i = 0;
        String str = null;
        int zzaY = zzb.zzaY(parcel);
        int i2 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i3 = 0;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    str4 = zzb.zzq(parcel, zzaX);
                    break;
                case 2:
                    str3 = zzb.zzq(parcel, zzaX);
                    break;
                case 3:
                    str2 = zzb.zzq(parcel, zzaX);
                    break;
                case 4:
                    str = zzb.zzq(parcel, zzaX);
                    break;
                case 6:
                    i2 = zzb.zzg(parcel, zzaX);
                    break;
                case 7:
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
            return new zzz(i3, str4, str3, str2, str, i2, i);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzz[] zzkW(int i) {
        return new zzz[i];
    }
}
