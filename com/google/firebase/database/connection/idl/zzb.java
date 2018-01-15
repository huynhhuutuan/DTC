package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;
import java.util.List;

public class zzb implements Creator<zza> {
    static void zza(zza com_google_firebase_database_connection_idl_zza, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zzc(parcel, 1, com_google_firebase_database_connection_idl_zza.versionCode);
        zzc.zzb(parcel, 2, com_google_firebase_database_connection_idl_zza.zzcbt, false);
        zzc.zzb(parcel, 3, com_google_firebase_database_connection_idl_zza.zzcbu, false);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzlO(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzqx(i);
    }

    public zza zzlO(Parcel parcel) {
        List list = null;
        int zzaY = com.google.android.gms.common.internal.safeparcel.zzb.zzaY(parcel);
        int i = 0;
        List list2 = null;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = com.google.android.gms.common.internal.safeparcel.zzb.zzaX(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.zzb.zzdc(zzaX)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.zzb.zzg(parcel, zzaX);
                    break;
                case 2:
                    list2 = com.google.android.gms.common.internal.safeparcel.zzb.zzE(parcel, zzaX);
                    break;
                case 3:
                    list = com.google.android.gms.common.internal.safeparcel.zzb.zzE(parcel, zzaX);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new zza(i, list2, list);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zza[] zzqx(int i) {
        return new zza[i];
    }
}
