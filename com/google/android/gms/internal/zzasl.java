package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;

public class zzasl implements Creator<zzask> {
    static void zza(zzask com_google_android_gms_internal_zzask, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zzc(parcel, 1, com_google_android_gms_internal_zzask.zzbkT);
        zzc.zza(parcel, 2, com_google_android_gms_internal_zzask.zzbkU, i, false);
        zzc.zza(parcel, 3, com_google_android_gms_internal_zzask.zzIq(), false);
        zzc.zza(parcel, 4, com_google_android_gms_internal_zzask.mPendingIntent, i, false);
        zzc.zza(parcel, 5, com_google_android_gms_internal_zzask.zzIr(), false);
        zzc.zza(parcel, 6, com_google_android_gms_internal_zzask.zzIs(), false);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgW(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkz(i);
    }

    public zzask zzgW(Parcel parcel) {
        IBinder iBinder = null;
        int zzaY = zzb.zzaY(parcel);
        int i = 1;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder3 = null;
        zzasi com_google_android_gms_internal_zzasi = null;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    i = zzb.zzg(parcel, zzaX);
                    break;
                case 2:
                    com_google_android_gms_internal_zzasi = (zzasi) zzb.zza(parcel, zzaX, zzasi.CREATOR);
                    break;
                case 3:
                    iBinder3 = zzb.zzr(parcel, zzaX);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) zzb.zza(parcel, zzaX, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = zzb.zzr(parcel, zzaX);
                    break;
                case 6:
                    iBinder = zzb.zzr(parcel, zzaX);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new zzask(i, com_google_android_gms_internal_zzasi, iBinder3, pendingIntent, iBinder2, iBinder);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzask[] zzkz(int i) {
        return new zzask[i];
    }
}
