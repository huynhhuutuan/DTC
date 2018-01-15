package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

public class zzasi extends zza {
    public static final Creator<zzasi> CREATOR = new zzasj();
    static final List<zzarw> zzbkQ = Collections.emptyList();
    @Nullable
    String mTag;
    LocationRequest zzaWw;
    List<zzarw> zzbjB;
    boolean zzbjp = true;
    boolean zzbkR;
    boolean zzbkS;

    zzasi(LocationRequest locationRequest, List<zzarw> list, @Nullable String str, boolean z, boolean z2) {
        this.zzaWw = locationRequest;
        this.zzbjB = list;
        this.mTag = str;
        this.zzbkR = z;
        this.zzbkS = z2;
    }

    public static zzasi zza(@Nullable String str, LocationRequest locationRequest) {
        return new zzasi(locationRequest, zzbkQ, str, false, false);
    }

    @Deprecated
    public static zzasi zzb(LocationRequest locationRequest) {
        return zza(null, locationRequest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zzasi)) {
            return false;
        }
        zzasi com_google_android_gms_internal_zzasi = (zzasi) obj;
        return zzaa.equal(this.zzaWw, com_google_android_gms_internal_zzasi.zzaWw) && zzaa.equal(this.zzbjB, com_google_android_gms_internal_zzasi.zzbjB) && zzaa.equal(this.mTag, com_google_android_gms_internal_zzasi.mTag) && this.zzbkR == com_google_android_gms_internal_zzasi.zzbkR && this.zzbkS == com_google_android_gms_internal_zzasi.zzbkS;
    }

    public int hashCode() {
        return this.zzaWw.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.zzaWw.toString());
        if (this.mTag != null) {
            stringBuilder.append(" tag=").append(this.mTag);
        }
        stringBuilder.append(" hideAppOps=").append(this.zzbkR);
        stringBuilder.append(" clients=").append(this.zzbjB);
        stringBuilder.append(" forceCoarseLocation=").append(this.zzbkS);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzasj.zza(this, parcel, i);
    }
}
