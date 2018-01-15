package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.internal.zzarw;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class zzf extends zza {
    public static final Creator<zzf> CREATOR = new zzg();
    public static final Comparator<zzd> zzbjz = new C06891();
    @Nullable
    private final String mTag;
    private final List<zzd> zzbjA;
    private final List<zzarw> zzbjB;

    class C06891 implements Comparator<zzd> {
        C06891() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return zza((zzd) obj, (zzd) obj2);
        }

        public int zza(zzd com_google_android_gms_location_zzd, zzd com_google_android_gms_location_zzd2) {
            int zzBV = com_google_android_gms_location_zzd.zzBV();
            int zzBV2 = com_google_android_gms_location_zzd2.zzBV();
            if (zzBV != zzBV2) {
                return zzBV < zzBV2 ? -1 : 1;
            } else {
                zzBV = com_google_android_gms_location_zzd.zzIb();
                zzBV2 = com_google_android_gms_location_zzd2.zzIb();
                return zzBV == zzBV2 ? 0 : zzBV >= zzBV2 ? 1 : -1;
            }
        }
    }

    public zzf(List<zzd> list, @Nullable String str, @Nullable List<zzarw> list2) {
        zzac.zzb((Object) list, (Object) "transitions can't be null");
        zzac.zzb(list.size() > 0, (Object) "transitions can't be empty.");
        zzD(list);
        this.zzbjA = Collections.unmodifiableList(list);
        this.mTag = str;
        this.zzbjB = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
    }

    private static void zzD(List<zzd> list) {
        TreeSet treeSet = new TreeSet(zzbjz);
        for (zzd add : list) {
            zzac.zzb(treeSet.add(add), String.format("Found duplicated transition: %s.", new Object[]{add}));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzf com_google_android_gms_location_zzf = (zzf) obj;
        return zzaa.equal(this.zzbjA, com_google_android_gms_location_zzf.zzbjA) && zzaa.equal(this.mTag, com_google_android_gms_location_zzf.mTag) && zzaa.equal(this.zzbjB, com_google_android_gms_location_zzf.zzbjB);
    }

    @Nullable
    public String getTag() {
        return this.mTag;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.mTag != null ? this.mTag.hashCode() : 0) + (this.zzbjA.hashCode() * 31)) * 31;
        if (this.zzbjB != null) {
            i = this.zzbjB.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.zzbjA);
        String str = this.mTag;
        String valueOf2 = String.valueOf(this.zzbjB);
        return new StringBuilder(((String.valueOf(valueOf).length() + 61) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()).append("ActivityTransitionRequest [mTransitions=").append(valueOf).append(", mTag='").append(str).append("'").append(", mClients=").append(valueOf2).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzg.zza(this, parcel, i);
    }

    public List<zzd> zzIc() {
        return this.zzbjA;
    }

    public List<zzarw> zzId() {
        return this.zzbjB;
    }
}
