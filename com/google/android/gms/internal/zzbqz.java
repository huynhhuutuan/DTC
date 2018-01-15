package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbqy.zza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class zzbqz {
    private final zzbrc zzcid;
    private final zzbrw zzcie;

    class C05111 implements Comparator<zzbqw> {
        static final /* synthetic */ boolean $assertionsDisabled = (!zzbqz.class.desiredAssertionStatus());
        final /* synthetic */ zzbqz zzcif;

        C05111(zzbqz com_google_android_gms_internal_zzbqz) {
            this.zzcif = com_google_android_gms_internal_zzbqz;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return zza((zzbqw) obj, (zzbqw) obj2);
        }

        public int zza(zzbqw com_google_android_gms_internal_zzbqw, zzbqw com_google_android_gms_internal_zzbqw2) {
            if ($assertionsDisabled || !(com_google_android_gms_internal_zzbqw.zzZT() == null || com_google_android_gms_internal_zzbqw2.zzZT() == null)) {
                return this.zzcif.zzcie.compare(new zzbsb(com_google_android_gms_internal_zzbqw.zzZT(), com_google_android_gms_internal_zzbqw.zzZR().zzWH()), new zzbsb(com_google_android_gms_internal_zzbqw2.zzZT(), com_google_android_gms_internal_zzbqw2.zzZR().zzWH()));
            }
            throw new AssertionError();
        }
    }

    public zzbqz(zzbrc com_google_android_gms_internal_zzbrc) {
        this.zzcid = com_google_android_gms_internal_zzbrc;
        this.zzcie = com_google_android_gms_internal_zzbrc.zzaai();
    }

    private Comparator<zzbqw> zzZZ() {
        return new C05111(this);
    }

    private zzbqx zza(zzbqw com_google_android_gms_internal_zzbqw, zzbpc com_google_android_gms_internal_zzbpc, zzbrx com_google_android_gms_internal_zzbrx) {
        if (!(com_google_android_gms_internal_zzbqw.zzZU().equals(zza.VALUE) || com_google_android_gms_internal_zzbqw.zzZU().equals(zza.CHILD_REMOVED))) {
            com_google_android_gms_internal_zzbqw = com_google_android_gms_internal_zzbqw.zzg(com_google_android_gms_internal_zzbrx.zza(com_google_android_gms_internal_zzbqw.zzZT(), com_google_android_gms_internal_zzbqw.zzZR().zzWH(), this.zzcie));
        }
        return com_google_android_gms_internal_zzbpc.zza(com_google_android_gms_internal_zzbqw, this.zzcid);
    }

    private void zza(List<zzbqx> list, zza com_google_android_gms_internal_zzbqy_zza, List<zzbqw> list2, List<zzbpc> list3, zzbrx com_google_android_gms_internal_zzbrx) {
        List<zzbqw> arrayList = new ArrayList();
        for (zzbqw com_google_android_gms_internal_zzbqw : list2) {
            if (com_google_android_gms_internal_zzbqw.zzZU().equals(com_google_android_gms_internal_zzbqy_zza)) {
                arrayList.add(com_google_android_gms_internal_zzbqw);
            }
        }
        Collections.sort(arrayList, zzZZ());
        for (zzbqw com_google_android_gms_internal_zzbqw2 : arrayList) {
            for (zzbpc com_google_android_gms_internal_zzbpc : list3) {
                if (com_google_android_gms_internal_zzbpc.zza(com_google_android_gms_internal_zzbqy_zza)) {
                    list.add(zza(com_google_android_gms_internal_zzbqw2, com_google_android_gms_internal_zzbpc, com_google_android_gms_internal_zzbrx));
                }
            }
        }
    }

    public List<zzbqx> zza(List<zzbqw> list, zzbrx com_google_android_gms_internal_zzbrx, List<zzbpc> list2) {
        List<zzbqx> arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        for (zzbqw com_google_android_gms_internal_zzbqw : list) {
            if (com_google_android_gms_internal_zzbqw.zzZU().equals(zza.CHILD_CHANGED) && this.zzcie.zza(com_google_android_gms_internal_zzbqw.zzZW().zzWH(), com_google_android_gms_internal_zzbqw.zzZR().zzWH())) {
                arrayList2.add(zzbqw.zzc(com_google_android_gms_internal_zzbqw.zzZT(), com_google_android_gms_internal_zzbqw.zzZR()));
            }
        }
        zza(arrayList, zza.CHILD_REMOVED, list, list2, com_google_android_gms_internal_zzbrx);
        zza(arrayList, zza.CHILD_ADDED, list, list2, com_google_android_gms_internal_zzbrx);
        zza(arrayList, zza.CHILD_MOVED, arrayList2, list2, com_google_android_gms_internal_zzbrx);
        zza(arrayList, zza.CHILD_CHANGED, list, list2, com_google_android_gms_internal_zzbrx);
        zza(arrayList, zza.VALUE, list, list2, com_google_android_gms_internal_zzbrx);
        return arrayList;
    }
}
