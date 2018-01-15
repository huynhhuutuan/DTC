package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;

public class zzq implements Creator<zzp> {
    static void zza(zzp com_google_android_gms_location_places_internal_zzp, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zza(parcel, 1, com_google_android_gms_location_places_internal_zzp.zzbmK, i, false);
        zzc.zza(parcel, 2, com_google_android_gms_location_places_internal_zzp.zzbmL);
        zzc.zzc(parcel, 1000, com_google_android_gms_location_places_internal_zzp.zzaiI);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhm(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkT(i);
    }

    public zzp zzhm(Parcel parcel) {
        int zzaY = zzb.zzaY(parcel);
        int i = 0;
        PlaceEntity placeEntity = null;
        float f = 0.0f;
        while (parcel.dataPosition() < zzaY) {
            int i2;
            float f2;
            PlaceEntity placeEntity2;
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    i2 = i;
                    PlaceEntity placeEntity3 = (PlaceEntity) zzb.zza(parcel, zzaX, PlaceEntity.CREATOR);
                    f2 = f;
                    placeEntity2 = placeEntity3;
                    break;
                case 2:
                    f2 = zzb.zzl(parcel, zzaX);
                    placeEntity2 = placeEntity;
                    i2 = i;
                    break;
                case 1000:
                    float f3 = f;
                    placeEntity2 = placeEntity;
                    i2 = zzb.zzg(parcel, zzaX);
                    f2 = f3;
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    f2 = f;
                    placeEntity2 = placeEntity;
                    i2 = i;
                    break;
            }
            i = i2;
            placeEntity = placeEntity2;
            f = f2;
        }
        if (parcel.dataPosition() == zzaY) {
            return new zzp(i, placeEntity, f);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzp[] zzkT(int i) {
        return new zzp[i];
    }
}
