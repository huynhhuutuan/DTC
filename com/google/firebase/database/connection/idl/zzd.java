package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;
import java.util.List;

public class zzd implements Creator<zzc> {
    static void zza(zzc com_google_firebase_database_connection_idl_zzc, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zzc(parcel, 1, com_google_firebase_database_connection_idl_zzc.versionCode);
        zzc.zza(parcel, 2, com_google_firebase_database_connection_idl_zzc.zzcdc, i, false);
        zzc.zzc(parcel, 3, com_google_firebase_database_connection_idl_zzc.zzcdd);
        zzc.zzb(parcel, 4, com_google_firebase_database_connection_idl_zzc.zzcde, false);
        zzc.zza(parcel, 5, com_google_firebase_database_connection_idl_zzc.zzcbJ);
        zzc.zza(parcel, 6, com_google_firebase_database_connection_idl_zzc.zzcdf, false);
        zzc.zza(parcel, 7, com_google_firebase_database_connection_idl_zzc.zzcbL, false);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzlP(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzqy(i);
    }

    public zzc zzlP(Parcel parcel) {
        boolean z = false;
        String str = null;
        int zzaY = zzb.zzaY(parcel);
        String str2 = null;
        List list = null;
        int i = 0;
        zzf com_google_firebase_database_connection_idl_zzf = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    i2 = zzb.zzg(parcel, zzaX);
                    break;
                case 2:
                    com_google_firebase_database_connection_idl_zzf = (zzf) zzb.zza(parcel, zzaX, zzf.CREATOR);
                    break;
                case 3:
                    i = zzb.zzg(parcel, zzaX);
                    break;
                case 4:
                    list = zzb.zzE(parcel, zzaX);
                    break;
                case 5:
                    z = zzb.zzc(parcel, zzaX);
                    break;
                case 6:
                    str2 = zzb.zzq(parcel, zzaX);
                    break;
                case 7:
                    str = zzb.zzq(parcel, zzaX);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new zzc(i2, com_google_firebase_database_connection_idl_zzf, i, list, z, str2, str);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzc[] zzqy(int i) {
        return new zzc[i];
    }
}
