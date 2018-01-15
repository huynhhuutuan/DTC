package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import java.util.List;

@Deprecated
public class zzasx extends zza {
    public static final Creator<zzasx> CREATOR = new zzasz();
    final int zzaiI;
    private final String zzaiu;
    private final String zzblI;
    private final List<zzasv> zzbnk;

    zzasx(int i, String str, String str2, List<zzasv> list) {
        this.zzaiI = i;
        this.zzaiu = str;
        this.zzblI = str2;
        this.zzbnk = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzasx)) {
            return false;
        }
        zzasx com_google_android_gms_internal_zzasx = (zzasx) obj;
        return this.zzaiu.equals(com_google_android_gms_internal_zzasx.zzaiu) && this.zzblI.equals(com_google_android_gms_internal_zzasx.zzblI) && this.zzbnk.equals(com_google_android_gms_internal_zzasx.zzbnk);
    }

    public String getPlaceId() {
        return this.zzblI;
    }

    public int hashCode() {
        return zzaa.hashCode(this.zzaiu, this.zzblI, this.zzbnk);
    }

    public String toString() {
        return zzaa.zzv(this).zzg("accountName", this.zzaiu).zzg("placeId", this.zzblI).zzg("placeAliases", this.zzbnk).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzasz.zza(this, parcel, i);
    }

    public List<zzasv> zzJe() {
        return this.zzbnk;
    }

    public String zzJh() {
        return this.zzaiu;
    }
}
