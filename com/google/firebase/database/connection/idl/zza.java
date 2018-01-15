package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzboi;
import com.google.android.gms.internal.zzbom;
import java.util.ArrayList;
import java.util.List;

class zza extends com.google.android.gms.common.internal.safeparcel.zza {
    public static final Creator<zza> CREATOR = new zzb();
    final int versionCode;
    final List<String> zzcbt;
    final List<String> zzcbu;

    public zza(int i, List<String> list, List<String> list2) {
        this.versionCode = i;
        this.zzcbt = list;
        this.zzcbu = list2;
    }

    public static zzboi zza(zza com_google_firebase_database_connection_idl_zza) {
        List arrayList = new ArrayList(com_google_firebase_database_connection_idl_zza.zzcbt.size());
        for (String zziM : com_google_firebase_database_connection_idl_zza.zzcbt) {
            arrayList.add(zzbom.zziM(zziM));
        }
        return new zzboi(arrayList, com_google_firebase_database_connection_idl_zza.zzcbu);
    }

    public static zza zza(zzboi com_google_android_gms_internal_zzboi) {
        List<List> zzXo = com_google_android_gms_internal_zzboi.zzXo();
        List arrayList = new ArrayList(zzXo.size());
        for (List zzW : zzXo) {
            arrayList.add(zzbom.zzW(zzW));
        }
        return new zza(1, arrayList, com_google_android_gms_internal_zzboi.zzXp());
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }
}
