package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.internal.zzbon;
import com.google.android.gms.internal.zzbro;
import java.util.List;

public class zzc extends zza {
    public static final Creator<zzc> CREATOR = new zzd();
    final int versionCode;
    final boolean zzcbJ;
    final String zzcbL;
    final zzf zzcdc;
    final int zzcdd;
    final List<String> zzcde;
    final String zzcdf;

    public zzc(int i, zzf com_google_firebase_database_connection_idl_zzf, int i2, List<String> list, boolean z, String str, String str2) {
        this.versionCode = i;
        this.zzcdc = com_google_firebase_database_connection_idl_zzf;
        this.zzcdd = i2;
        this.zzcde = list;
        this.zzcbJ = z;
        this.zzcdf = str;
        this.zzcbL = str2;
    }

    public zzc(zzbon com_google_android_gms_internal_zzbon, zzbro.zza com_google_android_gms_internal_zzbro_zza, List<String> list, boolean z, String str, String str2) {
        int i;
        switch (com_google_android_gms_internal_zzbro_zza) {
            case DEBUG:
                i = 1;
                break;
            case INFO:
                i = 2;
                break;
            case WARN:
                i = 3;
                break;
            case ERROR:
                i = 4;
                break;
            default:
                i = 0;
                break;
        }
        this.versionCode = 1;
        this.zzcdc = zzf.zza(com_google_android_gms_internal_zzbon);
        this.zzcdd = i;
        this.zzcde = list;
        this.zzcbJ = z;
        this.zzcdf = str;
        this.zzcbL = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzd.zza(this, parcel, i);
    }

    public zzbro.zza zzYd() {
        switch (this.zzcdd) {
            case 0:
                return zzbro.zza.NONE;
            case 1:
                return zzbro.zza.DEBUG;
            case 2:
                return zzbro.zza.INFO;
            case 3:
                return zzbro.zza.WARN;
            case 4:
                return zzbro.zza.ERROR;
            default:
                return zzbro.zza.NONE;
        }
    }

    public List<String> zzYe() {
        return this.zzcde;
    }
}
