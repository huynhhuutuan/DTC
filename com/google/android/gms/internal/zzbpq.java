package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbrd.zza;
import com.google.firebase.database.DatabaseError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzbpq {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbpq.class.desiredAssertionStatus());
    private final Map<zzbrb, zzbrd> zzcfM = new HashMap();
    private final zzbql zzcfN;

    public zzbpq(zzbql com_google_android_gms_internal_zzbql) {
        this.zzcfN = com_google_android_gms_internal_zzbql;
    }

    private List<zzbqx> zza(zzbrd com_google_android_gms_internal_zzbrd, zzbqe com_google_android_gms_internal_zzbqe, zzbpz com_google_android_gms_internal_zzbpz, zzbsc com_google_android_gms_internal_zzbsc) {
        zza zzb = com_google_android_gms_internal_zzbrd.zzb(com_google_android_gms_internal_zzbqe, com_google_android_gms_internal_zzbpz, com_google_android_gms_internal_zzbsc);
        if (!com_google_android_gms_internal_zzbrd.zzaaq().zzaam()) {
            Set hashSet = new HashSet();
            Set hashSet2 = new HashSet();
            for (zzbqw com_google_android_gms_internal_zzbqw : zzb.zzciz) {
                zzbqy.zza zzZU = com_google_android_gms_internal_zzbqw.zzZU();
                if (zzZU == zzbqy.zza.CHILD_ADDED) {
                    hashSet2.add(com_google_android_gms_internal_zzbqw.zzZT());
                } else if (zzZU == zzbqy.zza.CHILD_REMOVED) {
                    hashSet.add(com_google_android_gms_internal_zzbqw.zzZT());
                }
            }
            if (!(hashSet2.isEmpty() && hashSet.isEmpty())) {
                this.zzcfN.zza(com_google_android_gms_internal_zzbrd.zzaaq(), hashSet2, hashSet);
            }
        }
        return zzb.zzciy;
    }

    public boolean isEmpty() {
        return this.zzcfM.isEmpty();
    }

    public List<zzbrd> zzZf() {
        List<zzbrd> arrayList = new ArrayList();
        for (Entry value : this.zzcfM.entrySet()) {
            zzbrd com_google_android_gms_internal_zzbrd = (zzbrd) value.getValue();
            if (!com_google_android_gms_internal_zzbrd.zzaaq().zzaam()) {
                arrayList.add(com_google_android_gms_internal_zzbrd);
            }
        }
        return arrayList;
    }

    public boolean zzZg() {
        return zzZh() != null;
    }

    public zzbrd zzZh() {
        for (Entry value : this.zzcfM.entrySet()) {
            zzbrd com_google_android_gms_internal_zzbrd = (zzbrd) value.getValue();
            if (com_google_android_gms_internal_zzbrd.zzaaq().zzaam()) {
                return com_google_android_gms_internal_zzbrd;
            }
        }
        return null;
    }

    public zzbtb<List<zzbrc>, List<zzbqy>> zza(zzbrc com_google_android_gms_internal_zzbrc, zzbpc com_google_android_gms_internal_zzbpc, DatabaseError databaseError) {
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        boolean zzZg = zzZg();
        zzbrd com_google_android_gms_internal_zzbrd;
        if (com_google_android_gms_internal_zzbrc.isDefault()) {
            Iterator it = this.zzcfM.entrySet().iterator();
            while (it.hasNext()) {
                com_google_android_gms_internal_zzbrd = (zzbrd) ((Entry) it.next()).getValue();
                arrayList2.addAll(com_google_android_gms_internal_zzbrd.zza(com_google_android_gms_internal_zzbpc, databaseError));
                if (com_google_android_gms_internal_zzbrd.isEmpty()) {
                    it.remove();
                    if (!com_google_android_gms_internal_zzbrd.zzaaq().zzaam()) {
                        arrayList.add(com_google_android_gms_internal_zzbrd.zzaaq());
                    }
                }
            }
        } else {
            com_google_android_gms_internal_zzbrd = (zzbrd) this.zzcfM.get(com_google_android_gms_internal_zzbrc.zzaap());
            if (com_google_android_gms_internal_zzbrd != null) {
                arrayList2.addAll(com_google_android_gms_internal_zzbrd.zza(com_google_android_gms_internal_zzbpc, databaseError));
                if (com_google_android_gms_internal_zzbrd.isEmpty()) {
                    this.zzcfM.remove(com_google_android_gms_internal_zzbrc.zzaap());
                    if (!com_google_android_gms_internal_zzbrd.zzaaq().zzaam()) {
                        arrayList.add(com_google_android_gms_internal_zzbrd.zzaaq());
                    }
                }
            }
        }
        if (zzZg && !zzZg()) {
            arrayList.add(zzbrc.zzN(com_google_android_gms_internal_zzbrc.zzWL()));
        }
        return new zzbtb(arrayList, arrayList2);
    }

    public List<zzbqx> zza(zzbpc com_google_android_gms_internal_zzbpc, zzbpz com_google_android_gms_internal_zzbpz, zzbqu com_google_android_gms_internal_zzbqu) {
        zzbrc zzYm = com_google_android_gms_internal_zzbpc.zzYm();
        zzbrd com_google_android_gms_internal_zzbrd = (zzbrd) this.zzcfM.get(zzYm.zzaap());
        if (com_google_android_gms_internal_zzbrd == null) {
            boolean z;
            zzbsc zzc = com_google_android_gms_internal_zzbpz.zzc(com_google_android_gms_internal_zzbqu.zzZP() ? com_google_android_gms_internal_zzbqu.zzWH() : null);
            if (zzc != null) {
                z = true;
            } else {
                zzc = com_google_android_gms_internal_zzbpz.zzd(com_google_android_gms_internal_zzbqu.zzWH());
                z = false;
            }
            zzbrd com_google_android_gms_internal_zzbrd2 = new zzbrd(zzYm, new zzbre(new zzbqu(zzbrx.zza(zzc, zzYm.zzaai()), z, false), com_google_android_gms_internal_zzbqu));
            if (!zzYm.zzaam()) {
                Set hashSet = new HashSet();
                for (zzbsb zzabi : com_google_android_gms_internal_zzbrd2.zzaas()) {
                    hashSet.add(zzabi.zzabi());
                }
                this.zzcfN.zza(zzYm, hashSet);
            }
            this.zzcfM.put(zzYm.zzaap(), com_google_android_gms_internal_zzbrd2);
            com_google_android_gms_internal_zzbrd = com_google_android_gms_internal_zzbrd2;
        }
        com_google_android_gms_internal_zzbrd.zzb(com_google_android_gms_internal_zzbpc);
        return com_google_android_gms_internal_zzbrd.zzl(com_google_android_gms_internal_zzbpc);
    }

    public List<zzbqx> zza(zzbqe com_google_android_gms_internal_zzbqe, zzbpz com_google_android_gms_internal_zzbpz, zzbsc com_google_android_gms_internal_zzbsc) {
        zzbrb zzZC = com_google_android_gms_internal_zzbqe.zzZx().zzZC();
        if (zzZC != null) {
            zzbrd com_google_android_gms_internal_zzbrd = (zzbrd) this.zzcfM.get(zzZC);
            if ($assertionsDisabled || com_google_android_gms_internal_zzbrd != null) {
                return zza(com_google_android_gms_internal_zzbrd, com_google_android_gms_internal_zzbqe, com_google_android_gms_internal_zzbpz, com_google_android_gms_internal_zzbsc);
            }
            throw new AssertionError();
        }
        List<zzbqx> arrayList = new ArrayList();
        for (Entry value : this.zzcfM.entrySet()) {
            arrayList.addAll(zza((zzbrd) value.getValue(), com_google_android_gms_internal_zzbqe, com_google_android_gms_internal_zzbpz, com_google_android_gms_internal_zzbsc));
        }
        return arrayList;
    }

    public zzbrd zzb(zzbrc com_google_android_gms_internal_zzbrc) {
        return com_google_android_gms_internal_zzbrc.zzaam() ? zzZh() : (zzbrd) this.zzcfM.get(com_google_android_gms_internal_zzbrc.zzaap());
    }

    public boolean zzc(zzbrc com_google_android_gms_internal_zzbrc) {
        return zzb(com_google_android_gms_internal_zzbrc) != null;
    }

    public zzbsc zzs(zzbph com_google_android_gms_internal_zzbph) {
        for (zzbrd com_google_android_gms_internal_zzbrd : this.zzcfM.values()) {
            if (com_google_android_gms_internal_zzbrd.zzs(com_google_android_gms_internal_zzbph) != null) {
                return com_google_android_gms_internal_zzbrd.zzs(com_google_android_gms_internal_zzbph);
            }
        }
        return null;
    }
}
