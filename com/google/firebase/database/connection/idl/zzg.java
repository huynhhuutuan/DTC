package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;

public class zzg implements Creator<zzf> {
    static void zza(zzf com_google_firebase_database_connection_idl_zzf, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zzc(parcel, 1, com_google_firebase_database_connection_idl_zzf.versionCode);
        zzc.zza(parcel, 2, com_google_firebase_database_connection_idl_zzf.zzcbM, false);
        zzc.zza(parcel, 3, com_google_firebase_database_connection_idl_zzf.zzaGP, false);
        zzc.zza(parcel, 4, com_google_firebase_database_connection_idl_zzf.zzcbN);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzlQ(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzqz(i);
    }

    public zzf zzlQ(Parcel parcel) {
        String str = null;
        boolean z = false;
        int zzaY = zzb.zzaY(parcel);
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    i = zzb.zzg(parcel, zzaX);
                    break;
                case 2:
                    str2 = zzb.zzq(parcel, zzaX);
                    break;
                case 3:
                    str = zzb.zzq(parcel, zzaX);
                    break;
                case 4:
                    z = zzb.zzc(parcel, zzaX);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new zzf(i, str2, str, z);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzf[] zzqz(int i) {
        return new zzf[i];
    }
}
