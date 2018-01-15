package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;

public class zzj implements Creator<PlacePhotoMetadataResult> {
    static void zza(PlacePhotoMetadataResult placePhotoMetadataResult, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zza(parcel, 1, placePhotoMetadataResult.getStatus(), i, false);
        zzc.zza(parcel, 2, placePhotoMetadataResult.zzblF, i, false);
        zzc.zzc(parcel, 1000, placePhotoMetadataResult.zzaiI);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhd(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkJ(i);
    }

    public PlacePhotoMetadataResult zzhd(Parcel parcel) {
        DataHolder dataHolder = null;
        int zzaY = zzb.zzaY(parcel);
        int i = 0;
        Status status = null;
        while (parcel.dataPosition() < zzaY) {
            int i2;
            DataHolder dataHolder2;
            Status status2;
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    i2 = i;
                    Status status3 = (Status) zzb.zza(parcel, zzaX, Status.CREATOR);
                    dataHolder2 = dataHolder;
                    status2 = status3;
                    break;
                case 2:
                    dataHolder2 = (DataHolder) zzb.zza(parcel, zzaX, DataHolder.CREATOR);
                    status2 = status;
                    i2 = i;
                    break;
                case 1000:
                    DataHolder dataHolder3 = dataHolder;
                    status2 = status;
                    i2 = zzb.zzg(parcel, zzaX);
                    dataHolder2 = dataHolder3;
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    dataHolder2 = dataHolder;
                    status2 = status;
                    i2 = i;
                    break;
            }
            i = i2;
            status = status2;
            dataHolder = dataHolder2;
        }
        if (parcel.dataPosition() == zzaY) {
            return new PlacePhotoMetadataResult(i, status, dataHolder);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public PlacePhotoMetadataResult[] zzkJ(int i) {
        return new PlacePhotoMetadataResult[i];
    }
}
