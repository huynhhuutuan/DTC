package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbqq.zza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzbqp {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbqp.class.desiredAssertionStatus());
    private static final zzbqr<Map<zzbrb, zzbqo>> zzcht = new C09931();
    private static final zzbqr<Map<zzbrb, zzbqo>> zzchu = new C09942();
    private static final zzbqr<zzbqo> zzchv = new C09953();
    private static final zzbqr<zzbqo> zzchw = new C09964();
    private final zzbrn zzcaJ;
    private final zzbqm zzchf;
    private zzbqq<Map<zzbrb, zzbqo>> zzchx;
    private final zzbsw zzchy;
    private long zzchz = 0;

    class C05106 implements Comparator<zzbqo> {
        C05106(zzbqp com_google_android_gms_internal_zzbqp) {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return zza((zzbqo) obj, (zzbqo) obj2);
        }

        public int zza(zzbqo com_google_android_gms_internal_zzbqo, zzbqo com_google_android_gms_internal_zzbqo2) {
            return zzbte.zzl(com_google_android_gms_internal_zzbqo.zzchr, com_google_android_gms_internal_zzbqo2.zzchr);
        }
    }

    class C09931 implements zzbqr<Map<zzbrb, zzbqo>> {
        C09931() {
        }

        public boolean zzaD(Map<zzbrb, zzbqo> map) {
            zzbqo com_google_android_gms_internal_zzbqo = (zzbqo) map.get(zzbrb.zzcii);
            return com_google_android_gms_internal_zzbqo != null && com_google_android_gms_internal_zzbqo.zzchs;
        }

        public /* synthetic */ boolean zzas(Object obj) {
            return zzaD((Map) obj);
        }
    }

    class C09942 implements zzbqr<Map<zzbrb, zzbqo>> {
        C09942() {
        }

        public boolean zzaD(Map<zzbrb, zzbqo> map) {
            zzbqo com_google_android_gms_internal_zzbqo = (zzbqo) map.get(zzbrb.zzcii);
            return com_google_android_gms_internal_zzbqo != null && com_google_android_gms_internal_zzbqo.zzbrc;
        }

        public /* synthetic */ boolean zzas(Object obj) {
            return zzaD((Map) obj);
        }
    }

    class C09953 implements zzbqr<zzbqo> {
        C09953() {
        }

        public /* synthetic */ boolean zzas(Object obj) {
            return zzc((zzbqo) obj);
        }

        public boolean zzc(zzbqo com_google_android_gms_internal_zzbqo) {
            return !com_google_android_gms_internal_zzbqo.zzbrc;
        }
    }

    class C09964 implements zzbqr<zzbqo> {
        C09964() {
        }

        public /* synthetic */ boolean zzas(Object obj) {
            return zzc((zzbqo) obj);
        }

        public boolean zzc(zzbqo com_google_android_gms_internal_zzbqo) {
            return !zzbqp.zzchv.zzas(com_google_android_gms_internal_zzbqo);
        }
    }

    class C09975 implements zza<Map<zzbrb, zzbqo>, Void> {
        final /* synthetic */ zzbqp zzchA;

        C09975(zzbqp com_google_android_gms_internal_zzbqp) {
            this.zzchA = com_google_android_gms_internal_zzbqp;
        }

        public Void zza(zzbph com_google_android_gms_internal_zzbph, Map<zzbrb, zzbqo> map, Void voidR) {
            for (Entry value : map.entrySet()) {
                zzbqo com_google_android_gms_internal_zzbqo = (zzbqo) value.getValue();
                if (!com_google_android_gms_internal_zzbqo.zzchs) {
                    this.zzchA.zza(com_google_android_gms_internal_zzbqo.zzZI());
                }
            }
            return null;
        }
    }

    public zzbqp(zzbqm com_google_android_gms_internal_zzbqm, zzbrn com_google_android_gms_internal_zzbrn, zzbsw com_google_android_gms_internal_zzbsw) {
        this.zzchf = com_google_android_gms_internal_zzbqm;
        this.zzcaJ = com_google_android_gms_internal_zzbrn;
        this.zzchy = com_google_android_gms_internal_zzbsw;
        this.zzchx = new zzbqq(null);
        zzZJ();
        for (zzbqo com_google_android_gms_internal_zzbqo : this.zzchf.zzWP()) {
            this.zzchz = Math.max(com_google_android_gms_internal_zzbqo.id + 1, this.zzchz);
            zzb(com_google_android_gms_internal_zzbqo);
        }
    }

    private boolean zzE(zzbph com_google_android_gms_internal_zzbph) {
        return this.zzchx.zza(com_google_android_gms_internal_zzbph, zzcht) != null;
    }

    private Set<Long> zzF(zzbph com_google_android_gms_internal_zzbph) {
        Set<Long> hashSet = new HashSet();
        Map map = (Map) this.zzchx.zzK(com_google_android_gms_internal_zzbph);
        if (map != null) {
            for (zzbqo com_google_android_gms_internal_zzbqo : map.values()) {
                if (!com_google_android_gms_internal_zzbqo.zzchq.zzaam()) {
                    hashSet.add(Long.valueOf(com_google_android_gms_internal_zzbqo.id));
                }
            }
        }
        return hashSet;
    }

    private void zzZJ() {
        try {
            this.zzchf.beginTransaction();
            this.zzchf.zzaF(this.zzchy.zzabH());
            this.zzchf.setTransactionSuccessful();
        } finally {
            this.zzchf.endTransaction();
        }
    }

    private static long zza(zzbqh com_google_android_gms_internal_zzbqh, long j) {
        return j - Math.min((long) Math.floor((double) ((1.0f - com_google_android_gms_internal_zzbqh.zzZE()) * ((float) j))), com_google_android_gms_internal_zzbqh.zzZF());
    }

    private List<zzbqo> zza(zzbqr<zzbqo> com_google_android_gms_internal_zzbqr_com_google_android_gms_internal_zzbqo) {
        List<zzbqo> arrayList = new ArrayList();
        Iterator it = this.zzchx.iterator();
        while (it.hasNext()) {
            for (zzbqo com_google_android_gms_internal_zzbqo : ((Map) ((Entry) it.next()).getValue()).values()) {
                if (com_google_android_gms_internal_zzbqr_com_google_android_gms_internal_zzbqo.zzas(com_google_android_gms_internal_zzbqo)) {
                    arrayList.add(com_google_android_gms_internal_zzbqo);
                }
            }
        }
        return arrayList;
    }

    private void zza(zzbqo com_google_android_gms_internal_zzbqo) {
        zzb(com_google_android_gms_internal_zzbqo);
        this.zzchf.zza(com_google_android_gms_internal_zzbqo);
    }

    private void zzb(zzbqo com_google_android_gms_internal_zzbqo) {
        Map map;
        zzj(com_google_android_gms_internal_zzbqo.zzchq);
        Map map2 = (Map) this.zzchx.zzK(com_google_android_gms_internal_zzbqo.zzchq.zzWL());
        if (map2 == null) {
            map2 = new HashMap();
            this.zzchx = this.zzchx.zzb(com_google_android_gms_internal_zzbqo.zzchq.zzWL(), (Object) map2);
            map = map2;
        } else {
            map = map2;
        }
        zzbqo com_google_android_gms_internal_zzbqo2 = (zzbqo) map.get(com_google_android_gms_internal_zzbqo.zzchq.zzaap());
        boolean z = com_google_android_gms_internal_zzbqo2 == null || com_google_android_gms_internal_zzbqo2.id == com_google_android_gms_internal_zzbqo.id;
        zzbte.zzbb(z);
        map.put(com_google_android_gms_internal_zzbqo.zzchq.zzaap(), com_google_android_gms_internal_zzbqo);
    }

    private void zzb(zzbrc com_google_android_gms_internal_zzbrc, boolean z) {
        zzbrc zzk = zzk(com_google_android_gms_internal_zzbrc);
        zzbqo zzl = zzl(zzk);
        long zzabH = this.zzchy.zzabH();
        if (zzl != null) {
            zzl = zzl.zzaR(zzabH).zzbg(z);
        } else if ($assertionsDisabled || z) {
            long j = this.zzchz;
            this.zzchz = 1 + j;
            zzl = new zzbqo(j, zzk, zzabH, false, z);
        } else {
            throw new AssertionError("If we're setting the query to inactive, we should already be tracking it!");
        }
        zza(zzl);
    }

    private static void zzj(zzbrc com_google_android_gms_internal_zzbrc) {
        boolean z = !com_google_android_gms_internal_zzbrc.zzaam() || com_google_android_gms_internal_zzbrc.isDefault();
        zzbte.zzb(z, "Can't have tracked non-default query that loads all data");
    }

    private static zzbrc zzk(zzbrc com_google_android_gms_internal_zzbrc) {
        return com_google_android_gms_internal_zzbrc.zzaam() ? zzbrc.zzN(com_google_android_gms_internal_zzbrc.zzWL()) : com_google_android_gms_internal_zzbrc;
    }

    public void zzA(zzbph com_google_android_gms_internal_zzbph) {
        this.zzchx.zzI(com_google_android_gms_internal_zzbph).zza(new C09975(this));
    }

    public Set<zzbrq> zzB(zzbph com_google_android_gms_internal_zzbph) {
        if ($assertionsDisabled || !zzo(zzbrc.zzN(com_google_android_gms_internal_zzbph))) {
            Set<zzbrq> hashSet = new HashSet();
            Set zzF = zzF(com_google_android_gms_internal_zzbph);
            if (!zzF.isEmpty()) {
                hashSet.addAll(this.zzchf.zzg(zzF));
            }
            Iterator it = this.zzchx.zzI(com_google_android_gms_internal_zzbph).zzZN().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                zzbrq com_google_android_gms_internal_zzbrq = (zzbrq) entry.getKey();
                zzbqq com_google_android_gms_internal_zzbqq = (zzbqq) entry.getValue();
                if (com_google_android_gms_internal_zzbqq.getValue() != null && zzcht.zzas((Map) com_google_android_gms_internal_zzbqq.getValue())) {
                    hashSet.add(com_google_android_gms_internal_zzbrq);
                }
            }
            return hashSet;
        }
        throw new AssertionError("Path is fully complete.");
    }

    public void zzC(zzbph com_google_android_gms_internal_zzbph) {
        if (!zzE(com_google_android_gms_internal_zzbph)) {
            zzbrc zzN = zzbrc.zzN(com_google_android_gms_internal_zzbph);
            zzbqo zzl = zzl(zzN);
            if (zzl == null) {
                long j = this.zzchz;
                this.zzchz = 1 + j;
                zzl = new zzbqo(j, zzN, this.zzchy.zzabH(), true, false);
            } else if ($assertionsDisabled || !zzl.zzchs) {
                zzl = zzl.zzZI();
            } else {
                throw new AssertionError("This should have been handled above!");
            }
            zza(zzl);
        }
    }

    public boolean zzD(zzbph com_google_android_gms_internal_zzbph) {
        return this.zzchx.zzb(com_google_android_gms_internal_zzbph, zzchu) != null;
    }

    public long zzZK() {
        return (long) zza(zzchv).size();
    }

    public zzbqn zza(zzbqh com_google_android_gms_internal_zzbqh) {
        List zza = zza(zzchv);
        long zza2 = zza(com_google_android_gms_internal_zzbqh, (long) zza.size());
        zzbqn com_google_android_gms_internal_zzbqn = new zzbqn();
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi("Pruning old queries.  Prunable: " + zza.size() + " Count to prune: " + zza2, new Object[0]);
        }
        Collections.sort(zza, new C05106(this));
        for (int i = 0; ((long) i) < zza2; i++) {
            zzbqo com_google_android_gms_internal_zzbqo = (zzbqo) zza.get(i);
            com_google_android_gms_internal_zzbqn = com_google_android_gms_internal_zzbqn.zzy(com_google_android_gms_internal_zzbqo.zzchq.zzWL());
            zzm(com_google_android_gms_internal_zzbqo.zzchq);
        }
        zzbqn com_google_android_gms_internal_zzbqn2 = com_google_android_gms_internal_zzbqn;
        for (int i2 = (int) zza2; i2 < zza.size(); i2++) {
            com_google_android_gms_internal_zzbqn2 = com_google_android_gms_internal_zzbqn2.zzz(((zzbqo) zza.get(i2)).zzchq.zzWL());
        }
        List<zzbqo> zza3 = zza(zzchw);
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi("Unprunable queries: " + zza3.size(), new Object[0]);
        }
        for (zzbqo com_google_android_gms_internal_zzbqo2 : zza3) {
            com_google_android_gms_internal_zzbqn2 = com_google_android_gms_internal_zzbqn2.zzz(com_google_android_gms_internal_zzbqo2.zzchq.zzWL());
        }
        return com_google_android_gms_internal_zzbqn2;
    }

    public void zzg(zzbrc com_google_android_gms_internal_zzbrc) {
        zzb(com_google_android_gms_internal_zzbrc, true);
    }

    public void zzh(zzbrc com_google_android_gms_internal_zzbrc) {
        zzb(com_google_android_gms_internal_zzbrc, false);
    }

    public zzbqo zzl(zzbrc com_google_android_gms_internal_zzbrc) {
        zzbrc zzk = zzk(com_google_android_gms_internal_zzbrc);
        Map map = (Map) this.zzchx.zzK(zzk.zzWL());
        return map != null ? (zzbqo) map.get(zzk.zzaap()) : null;
    }

    public void zzm(zzbrc com_google_android_gms_internal_zzbrc) {
        zzbrc zzk = zzk(com_google_android_gms_internal_zzbrc);
        zzbqo zzl = zzl(zzk);
        if ($assertionsDisabled || zzl != null) {
            this.zzchf.zzaE(zzl.id);
            Map map = (Map) this.zzchx.zzK(zzk.zzWL());
            map.remove(zzk.zzaap());
            if (map.isEmpty()) {
                this.zzchx = this.zzchx.zzJ(zzk.zzWL());
                return;
            }
            return;
        }
        throw new AssertionError("Query must exist to be removed.");
    }

    public void zzn(zzbrc com_google_android_gms_internal_zzbrc) {
        zzbqo zzl = zzl(zzk(com_google_android_gms_internal_zzbrc));
        if (zzl != null && !zzl.zzchs) {
            zza(zzl.zzZI());
        }
    }

    public boolean zzo(zzbrc com_google_android_gms_internal_zzbrc) {
        if (zzE(com_google_android_gms_internal_zzbrc.zzWL())) {
            return true;
        }
        if (com_google_android_gms_internal_zzbrc.zzaam()) {
            return false;
        }
        Map map = (Map) this.zzchx.zzK(com_google_android_gms_internal_zzbrc.zzWL());
        boolean z = map != null && map.containsKey(com_google_android_gms_internal_zzbrc.zzaap()) && ((zzbqo) map.get(com_google_android_gms_internal_zzbrc.zzaap())).zzchs;
        return z;
    }
}
