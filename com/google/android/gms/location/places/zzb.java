package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public class zzb implements Creator<AddPlaceRequest> {
    static void zza(AddPlaceRequest addPlaceRequest, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zza(parcel, 1, addPlaceRequest.getName(), false);
        zzc.zza(parcel, 2, addPlaceRequest.getLatLng(), i, false);
        zzc.zza(parcel, 3, addPlaceRequest.getAddress(), false);
        zzc.zza(parcel, 4, addPlaceRequest.getPlaceTypes(), false);
        zzc.zza(parcel, 5, addPlaceRequest.getPhoneNumber(), false);
        zzc.zza(parcel, 6, addPlaceRequest.getWebsiteUri(), i, false);
        zzc.zzc(parcel, 1000, addPlaceRequest.zzaiI);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgY(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkD(i);
    }

    public AddPlaceRequest zzgY(Parcel parcel) {
        Uri uri = null;
        int zzaY = com.google.android.gms.common.internal.safeparcel.zzb.zzaY(parcel);
        int i = 0;
        String str = null;
        List list = null;
        String str2 = null;
        LatLng latLng = null;
        String str3 = null;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = com.google.android.gms.common.internal.safeparcel.zzb.zzaX(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.zzb.zzdc(zzaX)) {
                case 1:
                    str3 = com.google.android.gms.common.internal.safeparcel.zzb.zzq(parcel, zzaX);
                    break;
                case 2:
                    latLng = (LatLng) com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, zzaX, LatLng.CREATOR);
                    break;
                case 3:
                    str2 = com.google.android.gms.common.internal.safeparcel.zzb.zzq(parcel, zzaX);
                    break;
                case 4:
                    list = com.google.android.gms.common.internal.safeparcel.zzb.zzD(parcel, zzaX);
                    break;
                case 5:
                    str = com.google.android.gms.common.internal.safeparcel.zzb.zzq(parcel, zzaX);
                    break;
                case 6:
                    uri = (Uri) com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, zzaX, Uri.CREATOR);
                    break;
                case 1000:
                    i = com.google.android.gms.common.internal.safeparcel.zzb.zzg(parcel, zzaX);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new AddPlaceRequest(i, str3, latLng, str2, list, str, uri);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public AddPlaceRequest[] zzkD(int i) {
        return new AddPlaceRequest[i];
    }
}
