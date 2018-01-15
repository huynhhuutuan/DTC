package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzaea extends zza {
    public static final Creator<zzaea> CREATOR = new zzaeb();
    private final Bundle zzaIZ;

    public zzaea(Bundle bundle) {
        this.zzaIZ = bundle;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzaeb.zza(this, parcel, i);
    }

    public Bundle zzzP() {
        return this.zzaIZ;
    }
}
