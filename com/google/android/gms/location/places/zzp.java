package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.util.zzf;
import java.util.Set;

public final class zzp extends zza {
    public static final Creator<zzp> CREATOR = new zzq();
    public static final zzp zzblZ = zzx("test_type", 1);
    public static final zzp zzbma = zzx("labeled_place", 6);
    public static final zzp zzbmb = zzx("here_content", 7);
    public static final Set<zzp> zzbmc = zzf.zza(zzblZ, zzbma, zzbmb);
    final String zzUA;
    final int zzaiI;
    final int zzbmd;

    zzp(int i, String str, int i2) {
        zzac.zzdr(str);
        this.zzaiI = i;
        this.zzUA = str;
        this.zzbmd = i2;
    }

    private static zzp zzx(String str, int i) {
        return new zzp(0, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzp)) {
            return false;
        }
        zzp com_google_android_gms_location_places_zzp = (zzp) obj;
        return this.zzUA.equals(com_google_android_gms_location_places_zzp.zzUA) && this.zzbmd == com_google_android_gms_location_places_zzp.zzbmd;
    }

    public int hashCode() {
        return this.zzUA.hashCode();
    }

    public String toString() {
        return this.zzUA;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzq.zza(this, parcel, i);
    }
}
