package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;
import java.util.List;

public class zzadv implements Creator<zzadu> {
    static void zza(zzadu com_google_android_gms_internal_zzadu, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zza(parcel, 2, com_google_android_gms_internal_zzadu.getPackageName(), false);
        zzc.zza(parcel, 3, com_google_android_gms_internal_zzadu.zzzF());
        zzc.zza(parcel, 4, com_google_android_gms_internal_zzadu.zzzG(), i, false);
        zzc.zza(parcel, 5, com_google_android_gms_internal_zzadu.zzzH(), false);
        zzc.zza(parcel, 6, com_google_android_gms_internal_zzadu.getAppInstanceId(), false);
        zzc.zza(parcel, 7, com_google_android_gms_internal_zzadu.zzzI(), false);
        zzc.zzb(parcel, 8, com_google_android_gms_internal_zzadu.zzzJ(), false);
        zzc.zzc(parcel, 9, com_google_android_gms_internal_zzadu.zzzz());
        zzc.zzc(parcel, 10, com_google_android_gms_internal_zzadu.zzzK(), false);
        zzc.zzc(parcel, 11, com_google_android_gms_internal_zzadu.zzzA());
        zzc.zzc(parcel, 12, com_google_android_gms_internal_zzadu.zzzB());
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzbn(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzdz(i);
    }

    public zzadu zzbn(Parcel parcel) {
        int zzaY = zzb.zzaY(parcel);
        String str = null;
        long j = 0;
        DataHolder dataHolder = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        int i = 0;
        List list2 = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 2:
                    str = zzb.zzq(parcel, zzaX);
                    break;
                case 3:
                    j = zzb.zzi(parcel, zzaX);
                    break;
                case 4:
                    dataHolder = (DataHolder) zzb.zza(parcel, zzaX, DataHolder.CREATOR);
                    break;
                case 5:
                    str2 = zzb.zzq(parcel, zzaX);
                    break;
                case 6:
                    str3 = zzb.zzq(parcel, zzaX);
                    break;
                case 7:
                    str4 = zzb.zzq(parcel, zzaX);
                    break;
                case 8:
                    list = zzb.zzE(parcel, zzaX);
                    break;
                case 9:
                    i = zzb.zzg(parcel, zzaX);
                    break;
                case 10:
                    list2 = zzb.zzc(parcel, zzaX, zzadk.CREATOR);
                    break;
                case 11:
                    i2 = zzb.zzg(parcel, zzaX);
                    break;
                case 12:
                    i3 = zzb.zzg(parcel, zzaX);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new zzadu(str, j, dataHolder, str2, str3, str4, list, i, list2, i2, i3);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzadu[] zzdz(int i) {
        return new zzadu[i];
    }
}
