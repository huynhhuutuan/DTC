package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;

public class zzass extends zza implements Result {
    public static final Creator<zzass> CREATOR = new zzast();
    final int zzaiI;
    private final Status zzair;
    private final List<zzasq> zzbnl;

    zzass(int i, Status status, List<zzasq> list) {
        this.zzaiI = i;
        this.zzair = status;
        this.zzbnl = list;
    }

    public Status getStatus() {
        return this.zzair;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzast.zza(this, parcel, i);
    }

    public List<zzasq> zzJf() {
        return this.zzbnl;
    }
}
