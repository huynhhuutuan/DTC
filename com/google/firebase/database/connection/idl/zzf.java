package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.internal.zzbon;

class zzf extends zza {
    public static final Creator<zzf> CREATOR = new zzg();
    final int versionCode;
    final String zzaGP;
    final String zzcbM;
    final boolean zzcbN;

    public zzf(int i, String str, String str2, boolean z) {
        this.versionCode = i;
        this.zzcbM = str;
        this.zzaGP = str2;
        this.zzcbN = z;
    }

    public static zzbon zza(zzf com_google_firebase_database_connection_idl_zzf) {
        return new zzbon(com_google_firebase_database_connection_idl_zzf.zzcbM, com_google_firebase_database_connection_idl_zzf.zzaGP, com_google_firebase_database_connection_idl_zzf.zzcbN);
    }

    public static zzf zza(zzbon com_google_android_gms_internal_zzbon) {
        return new zzf(1, com_google_android_gms_internal_zzbon.getHost(), com_google_android_gms_internal_zzbon.getNamespace(), com_google_android_gms_internal_zzbon.isSecure());
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzg.zza(this, parcel, i);
    }
}
