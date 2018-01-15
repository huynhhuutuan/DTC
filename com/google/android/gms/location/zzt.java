package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzac;
import java.util.Collections;
import java.util.List;

public class zzt extends zza {
    public static final Creator<zzt> CREATOR = new zzu();
    private final PendingIntent mPendingIntent;
    private final String mTag;
    private final List<String> zzbkt;

    zzt(@Nullable List<String> list, @Nullable PendingIntent pendingIntent, String str) {
        this.zzbkt = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.mPendingIntent = pendingIntent;
        this.mTag = str;
    }

    public static zzt zzE(List<String> list) {
        zzac.zzb((Object) list, (Object) "geofence can't be null.");
        zzac.zzb(!list.isEmpty(), (Object) "Geofences must contains at least one id.");
        return new zzt(list, null, "");
    }

    public static zzt zzb(PendingIntent pendingIntent) {
        zzac.zzb((Object) pendingIntent, (Object) "PendingIntent can not be null.");
        return new zzt(null, pendingIntent, "");
    }

    public String getTag() {
        return this.mTag;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzu.zza(this, parcel, i);
    }

    public List<String> zzIl() {
        return this.zzbkt;
    }

    public PendingIntent zzvu() {
        return this.mPendingIntent;
    }
}
