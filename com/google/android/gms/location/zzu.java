package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;
import java.util.List;

public class zzu implements Creator<zzt> {
    static void zza(zzt com_google_android_gms_location_zzt, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zzb(parcel, 1, com_google_android_gms_location_zzt.zzIl(), false);
        zzc.zza(parcel, 2, com_google_android_gms_location_zzt.zzvu(), i, false);
        zzc.zza(parcel, 3, com_google_android_gms_location_zzt.getTag(), false);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgS(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzku(i);
    }

    public zzt zzgS(Parcel parcel) {
        PendingIntent pendingIntent = null;
        int zzaY = zzb.zzaY(parcel);
        String str = "";
        List list = null;
        while (parcel.dataPosition() < zzaY) {
            PendingIntent pendingIntent2;
            String str2;
            List list2;
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    String str3 = str;
                    pendingIntent2 = pendingIntent;
                    Object zzE = zzb.zzE(parcel, zzaX);
                    str2 = str3;
                    break;
                case 2:
                    list2 = list;
                    PendingIntent pendingIntent3 = (PendingIntent) zzb.zza(parcel, zzaX, PendingIntent.CREATOR);
                    str2 = str;
                    pendingIntent2 = pendingIntent3;
                    break;
                case 3:
                    str2 = zzb.zzq(parcel, zzaX);
                    pendingIntent2 = pendingIntent;
                    list2 = list;
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    str2 = str;
                    pendingIntent2 = pendingIntent;
                    list2 = list;
                    break;
            }
            list = list2;
            pendingIntent = pendingIntent2;
            str = str2;
        }
        if (parcel.dataPosition() == zzaY) {
            return new zzt(list, pendingIntent, str);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzt[] zzku(int i) {
        return new zzt[i];
    }
}
