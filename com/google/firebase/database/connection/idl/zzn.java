package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.internal.zzbor;
import java.util.List;

class zzn extends zza {
    public static final Creator<zzn> CREATOR = new zzo();
    final int versionCode;
    final List<String> zzccK;
    final List<String> zzccL;

    public zzn(int i, List<String> list, List<String> list2) {
        this.versionCode = i;
        this.zzccK = list;
        this.zzccL = list2;
    }

    public static zzbor zza(zzn com_google_firebase_database_connection_idl_zzn, Object obj) {
        return new zzbor(com_google_firebase_database_connection_idl_zzn.zzccK, com_google_firebase_database_connection_idl_zzn.zzccL, obj);
    }

    public static zzn zza(zzbor com_google_android_gms_internal_zzbor) {
        return new zzn(1, com_google_android_gms_internal_zzbor.zzXV(), com_google_android_gms_internal_zzbor.zzXW());
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzo.zza(this, parcel, i);
    }
}
