package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;

@Deprecated
public class zzasv extends zza {
    public static final Creator<zzasv> CREATOR = new zzasw();
    public static final zzasv zzbnm = new zzasv(0, "Home");
    public static final zzasv zzbnn = new zzasv(0, "Work");
    final int zzaiI;
    private final String zzbno;

    zzasv(int i, String str) {
        this.zzaiI = i;
        this.zzbno = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzasv)) {
            return false;
        }
        return zzaa.equal(this.zzbno, ((zzasv) obj).zzbno);
    }

    public int hashCode() {
        return zzaa.hashCode(this.zzbno);
    }

    public String toString() {
        return zzaa.zzv(this).zzg("alias", this.zzbno).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzasw.zza(this, parcel, i);
    }

    public String zzJg() {
        return this.zzbno;
    }
}
