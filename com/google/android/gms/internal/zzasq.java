package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import java.util.List;

public class zzasq extends zza {
    public static final Creator<zzasq> CREATOR = new zzasr();
    final int zzaiI;
    private final String zzblI;
    private final List<String> zzbnk;

    zzasq(int i, @NonNull String str, @NonNull List<String> list) {
        this.zzaiI = i;
        this.zzblI = str;
        this.zzbnk = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzasq)) {
            return false;
        }
        zzasq com_google_android_gms_internal_zzasq = (zzasq) obj;
        return this.zzblI.equals(com_google_android_gms_internal_zzasq.zzblI) && this.zzbnk.equals(com_google_android_gms_internal_zzasq.zzbnk);
    }

    public String getPlaceId() {
        return this.zzblI;
    }

    public int hashCode() {
        return zzaa.hashCode(this.zzblI, this.zzbnk);
    }

    public String toString() {
        return zzaa.zzv(this).zzg("placeId", this.zzblI).zzg("placeAliases", this.zzbnk).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzasr.zza(this, parcel, i);
    }

    public List<String> zzJe() {
        return this.zzbnk;
    }
}
