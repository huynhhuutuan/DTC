package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;
import java.util.List;

public class zzo implements Creator<zzn> {
    static void zza(zzn com_google_firebase_database_connection_idl_zzn, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zzc(parcel, 1, com_google_firebase_database_connection_idl_zzn.versionCode);
        zzc.zzb(parcel, 2, com_google_firebase_database_connection_idl_zzn.zzccK, false);
        zzc.zzb(parcel, 3, com_google_firebase_database_connection_idl_zzn.zzccL, false);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzlR(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzqA(i);
    }

    public zzn zzlR(Parcel parcel) {
        List list = null;
        int zzaY = zzb.zzaY(parcel);
        int i = 0;
        List list2 = null;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    i = zzb.zzg(parcel, zzaX);
                    break;
                case 2:
                    list2 = zzb.zzE(parcel, zzaX);
                    break;
                case 3:
                    list = zzb.zzE(parcel, zzaX);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new zzn(i, list2, list);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzn[] zzqA(int i) {
        return new zzn[i];
    }
}
