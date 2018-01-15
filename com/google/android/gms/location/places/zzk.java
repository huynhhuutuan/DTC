package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;

public class zzk implements Creator<PlacePhotoResult> {
    static void zza(PlacePhotoResult placePhotoResult, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zza(parcel, 1, placePhotoResult.getStatus(), i, false);
        zzc.zza(parcel, 2, placePhotoResult.zzblH, i, false);
        zzc.zzc(parcel, 1000, placePhotoResult.zzaiI);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhe(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkK(i);
    }

    public PlacePhotoResult zzhe(Parcel parcel) {
        BitmapTeleporter bitmapTeleporter = null;
        int zzaY = zzb.zzaY(parcel);
        int i = 0;
        Status status = null;
        while (parcel.dataPosition() < zzaY) {
            int i2;
            BitmapTeleporter bitmapTeleporter2;
            Status status2;
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    i2 = i;
                    Status status3 = (Status) zzb.zza(parcel, zzaX, Status.CREATOR);
                    bitmapTeleporter2 = bitmapTeleporter;
                    status2 = status3;
                    break;
                case 2:
                    bitmapTeleporter2 = (BitmapTeleporter) zzb.zza(parcel, zzaX, BitmapTeleporter.CREATOR);
                    status2 = status;
                    i2 = i;
                    break;
                case 1000:
                    BitmapTeleporter bitmapTeleporter3 = bitmapTeleporter;
                    status2 = status;
                    i2 = zzb.zzg(parcel, zzaX);
                    bitmapTeleporter2 = bitmapTeleporter3;
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    bitmapTeleporter2 = bitmapTeleporter;
                    status2 = status;
                    i2 = i;
                    break;
            }
            i = i2;
            status = status2;
            bitmapTeleporter = bitmapTeleporter2;
        }
        if (parcel.dataPosition() == zzaY) {
            return new PlacePhotoResult(i, status, bitmapTeleporter);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public PlacePhotoResult[] zzkK(int i) {
        return new PlacePhotoResult[i];
    }
}
