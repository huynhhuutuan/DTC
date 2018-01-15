package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbqy.zza;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class zzbrg {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbrg.class.desiredAssertionStatus());
    private final Map<zzbrq, zzbqw> zzciH = new HashMap();

    public void zza(zzbqw com_google_android_gms_internal_zzbqw) {
        zza zzZU = com_google_android_gms_internal_zzbqw.zzZU();
        zzbrq zzZT = com_google_android_gms_internal_zzbqw.zzZT();
        if (!$assertionsDisabled && zzZU != zza.CHILD_ADDED && zzZU != zza.CHILD_CHANGED && zzZU != zza.CHILD_REMOVED) {
            throw new AssertionError("Only child changes supported for tracking");
        } else if (!$assertionsDisabled && com_google_android_gms_internal_zzbqw.zzZT().zzaaJ()) {
            throw new AssertionError();
        } else if (this.zzciH.containsKey(zzZT)) {
            zzbqw com_google_android_gms_internal_zzbqw2 = (zzbqw) this.zzciH.get(zzZT);
            zza zzZU2 = com_google_android_gms_internal_zzbqw2.zzZU();
            if (zzZU == zza.CHILD_ADDED && zzZU2 == zza.CHILD_REMOVED) {
                this.zzciH.put(com_google_android_gms_internal_zzbqw.zzZT(), zzbqw.zza(zzZT, com_google_android_gms_internal_zzbqw.zzZR(), com_google_android_gms_internal_zzbqw2.zzZR()));
            } else if (zzZU == zza.CHILD_REMOVED && zzZU2 == zza.CHILD_ADDED) {
                this.zzciH.remove(zzZT);
            } else if (zzZU == zza.CHILD_REMOVED && zzZU2 == zza.CHILD_CHANGED) {
                this.zzciH.put(zzZT, zzbqw.zzb(zzZT, com_google_android_gms_internal_zzbqw2.zzZW()));
            } else if (zzZU == zza.CHILD_CHANGED && zzZU2 == zza.CHILD_ADDED) {
                this.zzciH.put(zzZT, zzbqw.zza(zzZT, com_google_android_gms_internal_zzbqw.zzZR()));
            } else if (zzZU == zza.CHILD_CHANGED && zzZU2 == zza.CHILD_CHANGED) {
                this.zzciH.put(zzZT, zzbqw.zza(zzZT, com_google_android_gms_internal_zzbqw.zzZR(), com_google_android_gms_internal_zzbqw2.zzZW()));
            } else {
                String valueOf = String.valueOf(com_google_android_gms_internal_zzbqw);
                String valueOf2 = String.valueOf(com_google_android_gms_internal_zzbqw2);
                throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 48) + String.valueOf(valueOf2).length()).append("Illegal combination of changes: ").append(valueOf).append(" occurred after ").append(valueOf2).toString());
            }
        } else {
            this.zzciH.put(com_google_android_gms_internal_zzbqw.zzZT(), com_google_android_gms_internal_zzbqw);
        }
    }

    public List<zzbqw> zzaax() {
        return new ArrayList(this.zzciH.values());
    }
}
