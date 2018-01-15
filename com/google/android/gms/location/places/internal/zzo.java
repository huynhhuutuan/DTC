package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

public class zzo implements Creator<PlaceEntity> {
    static void zza(PlaceEntity placeEntity, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zza(parcel, 1, placeEntity.getId(), false);
        zzc.zza(parcel, 2, placeEntity.zzIW(), false);
        zzc.zza(parcel, 3, placeEntity.zzIY(), i, false);
        zzc.zza(parcel, 4, placeEntity.getLatLng(), i, false);
        zzc.zza(parcel, 5, placeEntity.zzIR());
        zzc.zza(parcel, 6, placeEntity.getViewport(), i, false);
        zzc.zza(parcel, 7, placeEntity.zzIX(), false);
        zzc.zzc(parcel, 1000, placeEntity.zzaiI);
        zzc.zza(parcel, 8, placeEntity.getWebsiteUri(), i, false);
        zzc.zza(parcel, 9, placeEntity.zzIU());
        zzc.zza(parcel, 10, placeEntity.getRating());
        zzc.zzc(parcel, 11, placeEntity.getPriceLevel());
        zzc.zza(parcel, 13, placeEntity.zzIQ(), false);
        zzc.zza(parcel, 14, (String) placeEntity.getAddress(), false);
        zzc.zza(parcel, 15, (String) placeEntity.getPhoneNumber(), false);
        zzc.zza(parcel, 16, placeEntity.zzIS(), false);
        zzc.zzb(parcel, 17, placeEntity.zzIT(), false);
        zzc.zza(parcel, 19, (String) placeEntity.getName(), false);
        zzc.zza(parcel, 20, placeEntity.getPlaceTypes(), false);
        zzc.zza(parcel, 21, placeEntity.zzIV(), i, false);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhl(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkS(i);
    }

    public PlaceEntity zzhl(Parcel parcel) {
        int zzaY = zzb.zzaY(parcel);
        int i = 0;
        String str = null;
        List list = null;
        List list2 = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list3 = null;
        LatLng latLng = null;
        float f = 0.0f;
        LatLngBounds latLngBounds = null;
        String str6 = null;
        Uri uri = null;
        boolean z = false;
        float f2 = 0.0f;
        int i2 = 0;
        zzs com_google_android_gms_location_places_internal_zzs = null;
        zzu com_google_android_gms_location_places_internal_zzu = null;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    str = zzb.zzq(parcel, zzaX);
                    break;
                case 2:
                    bundle = zzb.zzs(parcel, zzaX);
                    break;
                case 3:
                    com_google_android_gms_location_places_internal_zzs = (zzs) zzb.zza(parcel, zzaX, zzs.CREATOR);
                    break;
                case 4:
                    latLng = (LatLng) zzb.zza(parcel, zzaX, LatLng.CREATOR);
                    break;
                case 5:
                    f = zzb.zzl(parcel, zzaX);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) zzb.zza(parcel, zzaX, LatLngBounds.CREATOR);
                    break;
                case 7:
                    str6 = zzb.zzq(parcel, zzaX);
                    break;
                case 8:
                    uri = (Uri) zzb.zza(parcel, zzaX, Uri.CREATOR);
                    break;
                case 9:
                    z = zzb.zzc(parcel, zzaX);
                    break;
                case 10:
                    f2 = zzb.zzl(parcel, zzaX);
                    break;
                case 11:
                    i2 = zzb.zzg(parcel, zzaX);
                    break;
                case 13:
                    list2 = zzb.zzD(parcel, zzaX);
                    break;
                case 14:
                    str3 = zzb.zzq(parcel, zzaX);
                    break;
                case 15:
                    str4 = zzb.zzq(parcel, zzaX);
                    break;
                case 16:
                    str5 = zzb.zzq(parcel, zzaX);
                    break;
                case 17:
                    list3 = zzb.zzE(parcel, zzaX);
                    break;
                case 19:
                    str2 = zzb.zzq(parcel, zzaX);
                    break;
                case 20:
                    list = zzb.zzD(parcel, zzaX);
                    break;
                case 21:
                    com_google_android_gms_location_places_internal_zzu = (zzu) zzb.zza(parcel, zzaX, zzu.CREATOR);
                    break;
                case 1000:
                    i = zzb.zzg(parcel, zzaX);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new PlaceEntity(i, str, list, list2, bundle, str2, str3, str4, str5, list3, latLng, f, latLngBounds, str6, uri, z, f2, i2, com_google_android_gms_location_places_internal_zzs, com_google_android_gms_location_places_internal_zzu);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public PlaceEntity[] zzkS(int i) {
        return new PlaceEntity[i];
    }
}
