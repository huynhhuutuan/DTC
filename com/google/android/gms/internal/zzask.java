package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.location.zzj;
import com.google.android.gms.location.zzk;

public class zzask extends zza {
    public static final Creator<zzask> CREATOR = new zzasl();
    PendingIntent mPendingIntent;
    int zzbkT;
    zzasi zzbkU;
    zzk zzbkV;
    zzj zzbkW;
    zzasc zzbkX;

    zzask(int i, zzasi com_google_android_gms_internal_zzasi, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        zzasc com_google_android_gms_internal_zzasc = null;
        this.zzbkT = i;
        this.zzbkU = com_google_android_gms_internal_zzasi;
        this.zzbkV = iBinder == null ? null : zzk.zza.zzde(iBinder);
        this.mPendingIntent = pendingIntent;
        this.zzbkW = iBinder2 == null ? null : zzj.zza.zzdd(iBinder2);
        if (iBinder3 != null) {
            com_google_android_gms_internal_zzasc = zzasc.zza.zzdg(iBinder3);
        }
        this.zzbkX = com_google_android_gms_internal_zzasc;
    }

    public static zzask zza(zzasi com_google_android_gms_internal_zzasi, PendingIntent pendingIntent, @Nullable zzasc com_google_android_gms_internal_zzasc) {
        return new zzask(1, com_google_android_gms_internal_zzasi, null, pendingIntent, null, com_google_android_gms_internal_zzasc != null ? com_google_android_gms_internal_zzasc.asBinder() : null);
    }

    public static zzask zza(zzasi com_google_android_gms_internal_zzasi, zzj com_google_android_gms_location_zzj, @Nullable zzasc com_google_android_gms_internal_zzasc) {
        return new zzask(1, com_google_android_gms_internal_zzasi, null, null, com_google_android_gms_location_zzj.asBinder(), com_google_android_gms_internal_zzasc != null ? com_google_android_gms_internal_zzasc.asBinder() : null);
    }

    public static zzask zza(zzasi com_google_android_gms_internal_zzasi, zzk com_google_android_gms_location_zzk, @Nullable zzasc com_google_android_gms_internal_zzasc) {
        return new zzask(1, com_google_android_gms_internal_zzasi, com_google_android_gms_location_zzk.asBinder(), null, null, com_google_android_gms_internal_zzasc != null ? com_google_android_gms_internal_zzasc.asBinder() : null);
    }

    public static zzask zza(zzj com_google_android_gms_location_zzj, @Nullable zzasc com_google_android_gms_internal_zzasc) {
        return new zzask(2, null, null, null, com_google_android_gms_location_zzj.asBinder(), com_google_android_gms_internal_zzasc != null ? com_google_android_gms_internal_zzasc.asBinder() : null);
    }

    public static zzask zza(zzk com_google_android_gms_location_zzk, @Nullable zzasc com_google_android_gms_internal_zzasc) {
        return new zzask(2, null, com_google_android_gms_location_zzk.asBinder(), null, null, com_google_android_gms_internal_zzasc != null ? com_google_android_gms_internal_zzasc.asBinder() : null);
    }

    public static zzask zzb(PendingIntent pendingIntent, @Nullable zzasc com_google_android_gms_internal_zzasc) {
        return new zzask(2, null, null, pendingIntent, null, com_google_android_gms_internal_zzasc != null ? com_google_android_gms_internal_zzasc.asBinder() : null);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzasl.zza(this, parcel, i);
    }

    IBinder zzIq() {
        return this.zzbkV == null ? null : this.zzbkV.asBinder();
    }

    IBinder zzIr() {
        return this.zzbkW == null ? null : this.zzbkW.asBinder();
    }

    IBinder zzIs() {
        return this.zzbkX == null ? null : this.zzbkX.asBinder();
    }
}
