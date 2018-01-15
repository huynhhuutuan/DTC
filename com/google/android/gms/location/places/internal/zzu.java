package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Collections;
import java.util.List;

public class zzu extends com.google.android.gms.common.internal.safeparcel.zza {
    public static final Creator<zzu> CREATOR = new zzv();
    public final int zzaiI;
    final List<zza> zzbmP;
    final List<zzb> zzbmQ;

    public static class zza extends com.google.android.gms.common.internal.safeparcel.zza {
        public static final Creator<zza> CREATOR = new zzd();
        final int zzaiI;
        final int zzbmR;
        final int zzbmS;

        zza(int i, int i2, int i3) {
            this.zzaiI = i;
            this.zzbmR = i2;
            this.zzbmS = i3;
        }

        public void writeToParcel(Parcel parcel, int i) {
            zzd.zza(this, parcel, i);
        }
    }

    public static class zzb extends com.google.android.gms.common.internal.safeparcel.zza {
        public static final Creator<zzb> CREATOR = new zze();
        final int zzaiI;
        final int zzbmT;
        final int zzbmU;
        final int zzbmV;
        final int zzbmW;
        final int zzbmX;
        final int zzbmY;
        final List<zza> zzbmZ;

        zzb(int i, int i2, int i3, int i4, int i5, int i6, int i7, List<zza> list) {
            this.zzaiI = i;
            this.zzbmT = i2;
            this.zzbmU = i3;
            this.zzbmV = i4;
            this.zzbmW = i5;
            this.zzbmX = i6;
            this.zzbmY = i7;
            this.zzbmZ = Collections.unmodifiableList(list);
        }

        public void writeToParcel(Parcel parcel, int i) {
            zze.zza(this, parcel, i);
        }
    }

    zzu(int i, List<zza> list, List<zzb> list2) {
        this.zzaiI = i;
        this.zzbmP = Collections.unmodifiableList(list);
        this.zzbmQ = Collections.unmodifiableList(list2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzv.zza(this, parcel, i);
    }
}
