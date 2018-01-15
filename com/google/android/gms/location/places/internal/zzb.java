package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.location.places.internal.zza.zza;
import java.util.List;

public class zzb implements Creator<zza> {
    static void zza(zza com_google_android_gms_location_places_internal_zza, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zza(parcel, 1, com_google_android_gms_location_places_internal_zza.zzbmf, false);
        zzc.zza(parcel, 2, com_google_android_gms_location_places_internal_zza.zzblI, false);
        zzc.zza(parcel, 3, com_google_android_gms_location_places_internal_zza.zzblc, false);
        zzc.zzc(parcel, 4, com_google_android_gms_location_places_internal_zza.zzbmg, false);
        zzc.zzc(parcel, 5, com_google_android_gms_location_places_internal_zza.zzbmh);
        zzc.zza(parcel, 6, com_google_android_gms_location_places_internal_zza.zzbmi, false);
        zzc.zzc(parcel, 7, com_google_android_gms_location_places_internal_zza.zzbmj, false);
        zzc.zzc(parcel, 1000, com_google_android_gms_location_places_internal_zza.zzaiI);
        zzc.zza(parcel, 8, com_google_android_gms_location_places_internal_zza.zzbmk, false);
        zzc.zzc(parcel, 9, com_google_android_gms_location_places_internal_zza.zzbml, false);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhi(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkO(i);
    }

    public zza zzhi(Parcel parcel) {
        int i = 0;
        List list = null;
        int zzaY = com.google.android.gms.common.internal.safeparcel.zzb.zzaY(parcel);
        String str = null;
        List list2 = null;
        String str2 = null;
        List list3 = null;
        String str3 = null;
        List list4 = null;
        String str4 = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = com.google.android.gms.common.internal.safeparcel.zzb.zzaX(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.zzb.zzdc(zzaX)) {
                case 1:
                    str3 = com.google.android.gms.common.internal.safeparcel.zzb.zzq(parcel, zzaX);
                    break;
                case 2:
                    str4 = com.google.android.gms.common.internal.safeparcel.zzb.zzq(parcel, zzaX);
                    break;
                case 3:
                    list4 = com.google.android.gms.common.internal.safeparcel.zzb.zzD(parcel, zzaX);
                    break;
                case 4:
                    list3 = com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, zzaX, zza.CREATOR);
                    break;
                case 5:
                    i = com.google.android.gms.common.internal.safeparcel.zzb.zzg(parcel, zzaX);
                    break;
                case 6:
                    str2 = com.google.android.gms.common.internal.safeparcel.zzb.zzq(parcel, zzaX);
                    break;
                case 7:
                    list2 = com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, zzaX, zza.CREATOR);
                    break;
                case 8:
                    str = com.google.android.gms.common.internal.safeparcel.zzb.zzq(parcel, zzaX);
                    break;
                case 9:
                    list = com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, zzaX, zza.CREATOR);
                    break;
                case 1000:
                    i2 = com.google.android.gms.common.internal.safeparcel.zzb.zzg(parcel, zzaX);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new zza(i2, str4, list4, i, str3, list3, str2, list2, str, list);
        }
        throw new com.google.android.gms.common.internal.safeparcel.zzb.zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zza[] zzkO(int i) {
        return new zza[i];
    }
}
