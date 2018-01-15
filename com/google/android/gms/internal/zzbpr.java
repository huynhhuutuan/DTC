package com.google.android.gms.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.firebase.database.DatabaseError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;

public class zzbpr {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbpr.class.desiredAssertionStatus());
    private final zzbrn zzcaJ;
    private final zzbql zzcfN;
    private zzbqq<zzbpq> zzcfO = zzbqq.zzZM();
    private final zzbpy zzcfP = new zzbpy();
    private final Map<zzbps, zzbrc> zzcfQ = new HashMap();
    private final Map<zzbrc, zzbps> zzcfR = new HashMap();
    private final Set<zzbrc> zzcfS = new HashSet();
    private final zzd zzcfT;
    private long zzcfU = 1;

    class C05089 implements Callable<List<? extends zzbqy>> {
        final /* synthetic */ zzbpr zzcfZ;

        C05089(zzbpr com_google_android_gms_internal_zzbpr) {
            this.zzcfZ = com_google_android_gms_internal_zzbpr;
        }

        public /* synthetic */ Object call() throws Exception {
            return zzMM();
        }

        public List<? extends zzbqy> zzMM() throws Exception {
            this.zzcfZ.zzcfN.zzWQ();
            if (this.zzcfZ.zzcfP.zzZr().isEmpty()) {
                return Collections.emptyList();
            }
            return this.zzcfZ.zza(new zzbqb(zzbph.zzYO(), new zzbqq(Boolean.valueOf(true)), true));
        }
    }

    public interface zza {
        List<? extends zzbqy> zzb(DatabaseError databaseError);
    }

    public interface zzd {
        void zza(zzbrc com_google_android_gms_internal_zzbrc, zzbps com_google_android_gms_internal_zzbps);

        void zza(zzbrc com_google_android_gms_internal_zzbrc, zzbps com_google_android_gms_internal_zzbps, zzboo com_google_android_gms_internal_zzboo, zza com_google_android_gms_internal_zzbpr_zza);
    }

    class C09845 implements com.google.android.gms.internal.zzbqq.zza<zzbpq, Void> {
        final /* synthetic */ zzbpr zzcfZ;

        C09845(zzbpr com_google_android_gms_internal_zzbpr) {
            this.zzcfZ = com_google_android_gms_internal_zzbpr;
        }

        public Void zza(zzbph com_google_android_gms_internal_zzbph, zzbpq com_google_android_gms_internal_zzbpq, Void voidR) {
            zzbrc zzaaq;
            if (com_google_android_gms_internal_zzbph.isEmpty() || !com_google_android_gms_internal_zzbpq.zzZg()) {
                for (zzbrd zzaaq2 : com_google_android_gms_internal_zzbpq.zzZf()) {
                    zzaaq = zzaaq2.zzaaq();
                    this.zzcfZ.zzcfT.zza(this.zzcfZ.zzd(zzaaq), this.zzcfZ.zze(zzaaq));
                }
            } else {
                zzaaq = com_google_android_gms_internal_zzbpq.zzZh().zzaaq();
                this.zzcfZ.zzcfT.zza(this.zzcfZ.zzd(zzaaq), this.zzcfZ.zze(zzaaq));
            }
            return null;
        }
    }

    private static class zzb extends zzbpc {
        private zzbrc zzcdL;

        public zzb(zzbrc com_google_android_gms_internal_zzbrc) {
            this.zzcdL = com_google_android_gms_internal_zzbrc;
        }

        public boolean equals(Object obj) {
            return (obj instanceof zzb) && ((zzb) obj).zzcdL.equals(this.zzcdL);
        }

        public int hashCode() {
            return this.zzcdL.hashCode();
        }

        public zzbrc zzYm() {
            return this.zzcdL;
        }

        public zzbpc zza(zzbrc com_google_android_gms_internal_zzbrc) {
            return new zzb(com_google_android_gms_internal_zzbrc);
        }

        public zzbqx zza(zzbqw com_google_android_gms_internal_zzbqw, zzbrc com_google_android_gms_internal_zzbrc) {
            return null;
        }

        public void zza(zzbqx com_google_android_gms_internal_zzbqx) {
        }

        public void zza(DatabaseError databaseError) {
        }

        public boolean zza(com.google.android.gms.internal.zzbqy.zza com_google_android_gms_internal_zzbqy_zza) {
            return false;
        }

        public boolean zzc(zzbpc com_google_android_gms_internal_zzbpc) {
            return com_google_android_gms_internal_zzbpc instanceof zzb;
        }
    }

    private class zzc implements zzboo, zza {
        final /* synthetic */ zzbpr zzcfZ;
        private final zzbrd zzcgm;
        private final zzbps zzcgn;

        public zzc(zzbpr com_google_android_gms_internal_zzbpr, zzbrd com_google_android_gms_internal_zzbrd) {
            this.zzcfZ = com_google_android_gms_internal_zzbpr;
            this.zzcgm = com_google_android_gms_internal_zzbrd;
            this.zzcgn = com_google_android_gms_internal_zzbpr.zze(com_google_android_gms_internal_zzbrd.zzaaq());
        }

        public String zzXv() {
            return this.zzcgm.zzaar().zzaaL();
        }

        public boolean zzXw() {
            return zzbsz.zzt(this.zzcgm.zzaar()) > PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }

        public zzboi zzXx() {
            zzbrs zzi = zzbrs.zzi(this.zzcgm.zzaar());
            List<zzbph> zzXo = zzi.zzXo();
            List arrayList = new ArrayList(zzXo.size());
            for (zzbph zzYQ : zzXo) {
                arrayList.add(zzYQ.zzYQ());
            }
            return new zzboi(arrayList, zzi.zzXp());
        }

        public List<? extends zzbqy> zzb(DatabaseError databaseError) {
            if (databaseError == null) {
                return this.zzcgn != null ? this.zzcfZ.zza(this.zzcgn) : this.zzcfZ.zzt(this.zzcgm.zzaaq().zzWL());
            } else {
                zzbrn zza = this.zzcfZ.zzcaJ;
                String valueOf = String.valueOf(this.zzcgm.zzaaq().zzWL());
                String valueOf2 = String.valueOf(databaseError.toString());
                zza.warn(new StringBuilder((String.valueOf(valueOf).length() + 19) + String.valueOf(valueOf2).length()).append("Listen at ").append(valueOf).append(" failed: ").append(valueOf2).toString());
                return this.zzcfZ.zza(this.zzcgm.zzaaq(), databaseError);
            }
        }
    }

    public zzbpr(zzbpa com_google_android_gms_internal_zzbpa, zzbql com_google_android_gms_internal_zzbql, zzd com_google_android_gms_internal_zzbpr_zzd) {
        this.zzcfT = com_google_android_gms_internal_zzbpr_zzd;
        this.zzcfN = com_google_android_gms_internal_zzbql;
        this.zzcaJ = com_google_android_gms_internal_zzbpa.zziV("SyncTree");
    }

    private zzbps zzZj() {
        long j = this.zzcfU;
        this.zzcfU = 1 + j;
        return new zzbps(j);
    }

    private List<zzbqy> zza(zzbqe com_google_android_gms_internal_zzbqe) {
        return zza(com_google_android_gms_internal_zzbqe, this.zzcfO, null, this.zzcfP.zzu(zzbph.zzYO()));
    }

    private List<zzbqy> zza(zzbqe com_google_android_gms_internal_zzbqe, zzbqq<zzbpq> com_google_android_gms_internal_zzbqq_com_google_android_gms_internal_zzbpq, zzbsc com_google_android_gms_internal_zzbsc, zzbpz com_google_android_gms_internal_zzbpz) {
        if (com_google_android_gms_internal_zzbqe.zzWL().isEmpty()) {
            return zzb(com_google_android_gms_internal_zzbqe, com_google_android_gms_internal_zzbqq_com_google_android_gms_internal_zzbpq, com_google_android_gms_internal_zzbsc, com_google_android_gms_internal_zzbpz);
        }
        zzbpq com_google_android_gms_internal_zzbpq = (zzbpq) com_google_android_gms_internal_zzbqq_com_google_android_gms_internal_zzbpq.getValue();
        if (com_google_android_gms_internal_zzbsc == null && com_google_android_gms_internal_zzbpq != null) {
            com_google_android_gms_internal_zzbsc = com_google_android_gms_internal_zzbpq.zzs(zzbph.zzYO());
        }
        List<zzbqy> arrayList = new ArrayList();
        zzbrq zzYR = com_google_android_gms_internal_zzbqe.zzWL().zzYR();
        zzbqe zzc = com_google_android_gms_internal_zzbqe.zzc(zzYR);
        zzbqq com_google_android_gms_internal_zzbqq = (zzbqq) com_google_android_gms_internal_zzbqq_com_google_android_gms_internal_zzbpq.zzZN().get(zzYR);
        if (!(com_google_android_gms_internal_zzbqq == null || zzc == null)) {
            arrayList.addAll(zza(zzc, com_google_android_gms_internal_zzbqq, com_google_android_gms_internal_zzbsc != null ? com_google_android_gms_internal_zzbsc.zzm(zzYR) : null, com_google_android_gms_internal_zzbpz.zzb(zzYR)));
        }
        if (com_google_android_gms_internal_zzbpq != null) {
            arrayList.addAll(com_google_android_gms_internal_zzbpq.zza(com_google_android_gms_internal_zzbqe, com_google_android_gms_internal_zzbpz, com_google_android_gms_internal_zzbsc));
        }
        return arrayList;
    }

    private List<zzbrd> zza(zzbqq<zzbpq> com_google_android_gms_internal_zzbqq_com_google_android_gms_internal_zzbpq) {
        List arrayList = new ArrayList();
        zza((zzbqq) com_google_android_gms_internal_zzbqq_com_google_android_gms_internal_zzbpq, arrayList);
        return arrayList;
    }

    private List<? extends zzbqy> zza(zzbrc com_google_android_gms_internal_zzbrc, zzbqe com_google_android_gms_internal_zzbqe) {
        zzbph zzWL = com_google_android_gms_internal_zzbrc.zzWL();
        zzbpq com_google_android_gms_internal_zzbpq = (zzbpq) this.zzcfO.zzK(zzWL);
        if ($assertionsDisabled || com_google_android_gms_internal_zzbpq != null) {
            return com_google_android_gms_internal_zzbpq.zza(com_google_android_gms_internal_zzbqe, this.zzcfP.zzu(zzWL), null);
        }
        throw new AssertionError("Missing sync point for query tag that we're tracking");
    }

    private void zza(zzbqq<zzbpq> com_google_android_gms_internal_zzbqq_com_google_android_gms_internal_zzbpq, List<zzbrd> list) {
        zzbpq com_google_android_gms_internal_zzbpq = (zzbpq) com_google_android_gms_internal_zzbqq_com_google_android_gms_internal_zzbpq.getValue();
        if (com_google_android_gms_internal_zzbpq == null || !com_google_android_gms_internal_zzbpq.zzZg()) {
            if (com_google_android_gms_internal_zzbpq != null) {
                list.addAll(com_google_android_gms_internal_zzbpq.zzZf());
            }
            Iterator it = com_google_android_gms_internal_zzbqq_com_google_android_gms_internal_zzbpq.zzZN().iterator();
            while (it.hasNext()) {
                zza((zzbqq) ((Entry) it.next()).getValue(), (List) list);
            }
            return;
        }
        list.add(com_google_android_gms_internal_zzbpq.zzZh());
    }

    private void zza(zzbrc com_google_android_gms_internal_zzbrc, zzbrd com_google_android_gms_internal_zzbrd) {
        zzbph zzWL = com_google_android_gms_internal_zzbrc.zzWL();
        zzbps zze = zze(com_google_android_gms_internal_zzbrc);
        Object com_google_android_gms_internal_zzbpr_zzc = new zzc(this, com_google_android_gms_internal_zzbrd);
        this.zzcfT.zza(zzd(com_google_android_gms_internal_zzbrc), zze, com_google_android_gms_internal_zzbpr_zzc, com_google_android_gms_internal_zzbpr_zzc);
        zzbqq zzI = this.zzcfO.zzI(zzWL);
        if (zze == null) {
            zzI.zza(new C09845(this));
        } else if (!$assertionsDisabled && ((zzbpq) zzI.getValue()).zzZg()) {
            throw new AssertionError("If we're adding a query, it shouldn't be shadowed");
        }
    }

    private void zzaa(List<zzbrc> list) {
        for (zzbrc com_google_android_gms_internal_zzbrc : list) {
            if (!com_google_android_gms_internal_zzbrc.zzaam()) {
                zzbps zze = zze(com_google_android_gms_internal_zzbrc);
                if ($assertionsDisabled || zze != null) {
                    this.zzcfR.remove(com_google_android_gms_internal_zzbrc);
                    this.zzcfQ.remove(zze);
                } else {
                    throw new AssertionError();
                }
            }
        }
    }

    private zzbrc zzb(zzbps com_google_android_gms_internal_zzbps) {
        return (zzbrc) this.zzcfQ.get(com_google_android_gms_internal_zzbps);
    }

    private List<zzbqy> zzb(zzbqe com_google_android_gms_internal_zzbqe, zzbqq<zzbpq> com_google_android_gms_internal_zzbqq_com_google_android_gms_internal_zzbpq, zzbsc com_google_android_gms_internal_zzbsc, zzbpz com_google_android_gms_internal_zzbpz) {
        zzbpq com_google_android_gms_internal_zzbpq = (zzbpq) com_google_android_gms_internal_zzbqq_com_google_android_gms_internal_zzbpq.getValue();
        final zzbsc zzs = (com_google_android_gms_internal_zzbsc != null || com_google_android_gms_internal_zzbpq == null) ? com_google_android_gms_internal_zzbsc : com_google_android_gms_internal_zzbpq.zzs(zzbph.zzYO());
        final List<zzbqy> arrayList = new ArrayList();
        final zzbpz com_google_android_gms_internal_zzbpz2 = com_google_android_gms_internal_zzbpz;
        final zzbqe com_google_android_gms_internal_zzbqe2 = com_google_android_gms_internal_zzbqe;
        com_google_android_gms_internal_zzbqq_com_google_android_gms_internal_zzbpq.zzZN().zza(new com.google.android.gms.internal.zzbod.zzb<zzbrq, zzbqq<zzbpq>>(this) {
            final /* synthetic */ zzbpr zzcfZ;

            public void zza(zzbrq com_google_android_gms_internal_zzbrq, zzbqq<zzbpq> com_google_android_gms_internal_zzbqq_com_google_android_gms_internal_zzbpq) {
                zzbsc com_google_android_gms_internal_zzbsc = null;
                if (zzs != null) {
                    com_google_android_gms_internal_zzbsc = zzs.zzm(com_google_android_gms_internal_zzbrq);
                }
                zzbpz zzb = com_google_android_gms_internal_zzbpz2.zzb(com_google_android_gms_internal_zzbrq);
                zzbqe zzc = com_google_android_gms_internal_zzbqe2.zzc(com_google_android_gms_internal_zzbrq);
                if (zzc != null) {
                    arrayList.addAll(this.zzcfZ.zzb(zzc, com_google_android_gms_internal_zzbqq_com_google_android_gms_internal_zzbpq, com_google_android_gms_internal_zzbsc, zzb));
                }
            }

            public /* synthetic */ void zzj(Object obj, Object obj2) {
                zza((zzbrq) obj, (zzbqq) obj2);
            }
        });
        if (com_google_android_gms_internal_zzbpq != null) {
            arrayList.addAll(com_google_android_gms_internal_zzbpq.zza(com_google_android_gms_internal_zzbqe, com_google_android_gms_internal_zzbpz, zzs));
        }
        return arrayList;
    }

    private List<zzbqy> zzb(final zzbrc com_google_android_gms_internal_zzbrc, final zzbpc com_google_android_gms_internal_zzbpc, final DatabaseError databaseError) {
        return (List) this.zzcfN.zzf(new Callable<List<zzbqy>>(this) {
            static final /* synthetic */ boolean $assertionsDisabled = (!zzbpr.class.desiredAssertionStatus());
            final /* synthetic */ zzbpr zzcfZ;

            public /* synthetic */ Object call() throws Exception {
                return zzMM();
            }

            public List<zzbqy> zzMM() {
                zzbph zzWL = com_google_android_gms_internal_zzbrc.zzWL();
                zzbpq com_google_android_gms_internal_zzbpq = (zzbpq) this.zzcfZ.zzcfO.zzK(zzWL);
                List<zzbqy> arrayList = new ArrayList();
                if (com_google_android_gms_internal_zzbpq != null && (com_google_android_gms_internal_zzbrc.isDefault() || com_google_android_gms_internal_zzbpq.zzc(com_google_android_gms_internal_zzbrc))) {
                    Object obj;
                    zzbtb zza = com_google_android_gms_internal_zzbpq.zza(com_google_android_gms_internal_zzbrc, com_google_android_gms_internal_zzbpc, databaseError);
                    if (com_google_android_gms_internal_zzbpq.isEmpty()) {
                        this.zzcfZ.zzcfO = this.zzcfZ.zzcfO.zzJ(zzWL);
                    }
                    List<zzbrc> list = (List) zza.getFirst();
                    arrayList = (List) zza.zzabI();
                    Object obj2 = null;
                    for (zzbrc com_google_android_gms_internal_zzbrc : list) {
                        this.zzcfZ.zzcfN.zzh(com_google_android_gms_internal_zzbrc);
                        obj = (obj2 != null || com_google_android_gms_internal_zzbrc.zzaam()) ? 1 : null;
                        obj2 = obj;
                    }
                    zzbqq zzd = this.zzcfZ.zzcfO;
                    obj = (zzd.getValue() == null || !((zzbpq) zzd.getValue()).zzZg()) ? null : 1;
                    Iterator it = zzWL.iterator();
                    zzbqq com_google_android_gms_internal_zzbqq = zzd;
                    Object obj3 = obj;
                    while (it.hasNext()) {
                        com_google_android_gms_internal_zzbqq = com_google_android_gms_internal_zzbqq.zze((zzbrq) it.next());
                        obj = (obj3 != null || (com_google_android_gms_internal_zzbqq.getValue() != null && ((zzbpq) com_google_android_gms_internal_zzbqq.getValue()).zzZg())) ? 1 : null;
                        if (obj != null) {
                            obj3 = obj;
                            break;
                        } else if (com_google_android_gms_internal_zzbqq.isEmpty()) {
                            obj3 = obj;
                            break;
                        } else {
                            obj3 = obj;
                        }
                    }
                    if (obj2 != null && obj3 == null) {
                        zzbqq zzI = this.zzcfZ.zzcfO.zzI(zzWL);
                        if (!zzI.isEmpty()) {
                            for (zzbrd com_google_android_gms_internal_zzbrd : this.zzcfZ.zza(zzI)) {
                                Object com_google_android_gms_internal_zzbpr_zzc = new zzc(this.zzcfZ, com_google_android_gms_internal_zzbrd);
                                this.zzcfZ.zzcfT.zza(this.zzcfZ.zzd(com_google_android_gms_internal_zzbrd.zzaaq()), com_google_android_gms_internal_zzbpr_zzc.zzcgn, com_google_android_gms_internal_zzbpr_zzc, com_google_android_gms_internal_zzbpr_zzc);
                            }
                        }
                    }
                    if (obj3 == null && !list.isEmpty() && databaseError == null) {
                        if (obj2 != null) {
                            this.zzcfZ.zzcfT.zza(this.zzcfZ.zzd(com_google_android_gms_internal_zzbrc), null);
                        } else {
                            for (zzbrc com_google_android_gms_internal_zzbrc2 : list) {
                                zzbps zza2 = this.zzcfZ.zze(com_google_android_gms_internal_zzbrc2);
                                if ($assertionsDisabled || zza2 != null) {
                                    this.zzcfZ.zzcfT.zza(this.zzcfZ.zzd(com_google_android_gms_internal_zzbrc2), zza2);
                                } else {
                                    throw new AssertionError();
                                }
                            }
                        }
                    }
                    this.zzcfZ.zzaa(list);
                }
                return arrayList;
            }
        });
    }

    private zzbrc zzd(zzbrc com_google_android_gms_internal_zzbrc) {
        return (!com_google_android_gms_internal_zzbrc.zzaam() || com_google_android_gms_internal_zzbrc.isDefault()) ? com_google_android_gms_internal_zzbrc : zzbrc.zzN(com_google_android_gms_internal_zzbrc.zzWL());
    }

    private zzbps zze(zzbrc com_google_android_gms_internal_zzbrc) {
        return (zzbps) this.zzcfR.get(com_google_android_gms_internal_zzbrc);
    }

    public boolean isEmpty() {
        return this.zzcfO.isEmpty();
    }

    public List<? extends zzbqy> zzZi() {
        return (List) this.zzcfN.zzf(new C05089(this));
    }

    public List<? extends zzbqy> zza(long j, boolean z, boolean z2, zzbsw com_google_android_gms_internal_zzbsw) {
        final boolean z3 = z2;
        final long j2 = j;
        final boolean z4 = z;
        final zzbsw com_google_android_gms_internal_zzbsw2 = com_google_android_gms_internal_zzbsw;
        return (List) this.zzcfN.zzf(new Callable<List<? extends zzbqy>>(this) {
            final /* synthetic */ zzbpr zzcfZ;

            public /* synthetic */ Object call() throws Exception {
                return zzMM();
            }

            public List<? extends zzbqy> zzMM() {
                if (z3) {
                    this.zzcfZ.zzcfN.zzaD(j2);
                }
                zzbpv zzaO = this.zzcfZ.zzcfP.zzaO(j2);
                boolean zzaP = this.zzcfZ.zzcfP.zzaP(j2);
                if (zzaO.isVisible() && !z4) {
                    Map zza = zzbpn.zza(com_google_android_gms_internal_zzbsw2);
                    if (zzaO.zzZo()) {
                        this.zzcfZ.zzcfN.zzk(zzaO.zzWL(), zzbpn.zza(zzaO.zzZm(), zza));
                    } else {
                        this.zzcfZ.zzcfN.zzc(zzaO.zzWL(), zzbpn.zza(zzaO.zzZn(), zza));
                    }
                }
                if (!zzaP) {
                    return Collections.emptyList();
                }
                zzbqq zzb;
                zzbqq zzZM = zzbqq.zzZM();
                if (zzaO.zzZo()) {
                    zzb = zzZM.zzb(zzbph.zzYO(), Boolean.valueOf(true));
                } else {
                    Iterator it = zzaO.zzZn().iterator();
                    zzb = zzZM;
                    while (it.hasNext()) {
                        zzb = zzb.zzb((zzbph) ((Entry) it.next()).getKey(), Boolean.valueOf(true));
                    }
                }
                return this.zzcfZ.zza(new zzbqb(zzaO.zzWL(), zzb, z4));
            }
        });
    }

    public List<? extends zzbqy> zza(zzbph com_google_android_gms_internal_zzbph, zzboy com_google_android_gms_internal_zzboy, zzboy com_google_android_gms_internal_zzboy2, long j, boolean z) {
        final boolean z2 = z;
        final zzbph com_google_android_gms_internal_zzbph2 = com_google_android_gms_internal_zzbph;
        final zzboy com_google_android_gms_internal_zzboy3 = com_google_android_gms_internal_zzboy;
        final long j2 = j;
        final zzboy com_google_android_gms_internal_zzboy4 = com_google_android_gms_internal_zzboy2;
        return (List) this.zzcfN.zzf(new Callable<List<? extends zzbqy>>(this) {
            final /* synthetic */ zzbpr zzcfZ;

            public /* synthetic */ Object call() throws Exception {
                return zzMM();
            }

            public List<? extends zzbqy> zzMM() throws Exception {
                if (z2) {
                    this.zzcfZ.zzcfN.zza(com_google_android_gms_internal_zzbph2, com_google_android_gms_internal_zzboy3, j2);
                }
                this.zzcfZ.zzcfP.zza(com_google_android_gms_internal_zzbph2, com_google_android_gms_internal_zzboy4, Long.valueOf(j2));
                return this.zzcfZ.zza(new zzbqd(zzbqf.zzcgV, com_google_android_gms_internal_zzbph2, com_google_android_gms_internal_zzboy4));
            }
        });
    }

    public List<? extends zzbqy> zza(final zzbph com_google_android_gms_internal_zzbph, final zzbsc com_google_android_gms_internal_zzbsc, final zzbps com_google_android_gms_internal_zzbps) {
        return (List) this.zzcfN.zzf(new Callable<List<? extends zzbqy>>(this) {
            final /* synthetic */ zzbpr zzcfZ;

            public /* synthetic */ Object call() throws Exception {
                return zzMM();
            }

            public List<? extends zzbqy> zzMM() {
                zzbrc zza = this.zzcfZ.zzb(com_google_android_gms_internal_zzbps);
                if (zza == null) {
                    return Collections.emptyList();
                }
                zzbph zza2 = zzbph.zza(zza.zzWL(), com_google_android_gms_internal_zzbph);
                this.zzcfZ.zzcfN.zza(zza2.isEmpty() ? zza : zzbrc.zzN(com_google_android_gms_internal_zzbph), com_google_android_gms_internal_zzbsc);
                return this.zzcfZ.zza(zza, new zzbqg(zzbqf.zzc(zza.zzaap()), zza2, com_google_android_gms_internal_zzbsc));
            }
        });
    }

    public List<? extends zzbqy> zza(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc, zzbsc com_google_android_gms_internal_zzbsc2, long j, boolean z, boolean z2) {
        boolean z3 = z || !z2;
        zzbte.zzb(z3, "We shouldn't be persisting non-visible writes.");
        final boolean z4 = z2;
        final zzbph com_google_android_gms_internal_zzbph2 = com_google_android_gms_internal_zzbph;
        final zzbsc com_google_android_gms_internal_zzbsc3 = com_google_android_gms_internal_zzbsc;
        final long j2 = j;
        final zzbsc com_google_android_gms_internal_zzbsc4 = com_google_android_gms_internal_zzbsc2;
        final boolean z5 = z;
        return (List) this.zzcfN.zzf(new Callable<List<? extends zzbqy>>(this) {
            final /* synthetic */ zzbpr zzcfZ;

            public /* synthetic */ Object call() throws Exception {
                return zzMM();
            }

            public List<? extends zzbqy> zzMM() {
                if (z4) {
                    this.zzcfZ.zzcfN.zza(com_google_android_gms_internal_zzbph2, com_google_android_gms_internal_zzbsc3, j2);
                }
                this.zzcfZ.zzcfP.zza(com_google_android_gms_internal_zzbph2, com_google_android_gms_internal_zzbsc4, Long.valueOf(j2), z5);
                return !z5 ? Collections.emptyList() : this.zzcfZ.zza(new zzbqg(zzbqf.zzcgV, com_google_android_gms_internal_zzbph2, com_google_android_gms_internal_zzbsc4));
            }
        });
    }

    public List<? extends zzbqy> zza(zzbph com_google_android_gms_internal_zzbph, List<zzbsh> list, zzbps com_google_android_gms_internal_zzbps) {
        zzbrc zzb = zzb(com_google_android_gms_internal_zzbps);
        if (zzb == null) {
            return Collections.emptyList();
        }
        if ($assertionsDisabled || com_google_android_gms_internal_zzbph.equals(zzb.zzWL())) {
            zzbpq com_google_android_gms_internal_zzbpq = (zzbpq) this.zzcfO.zzK(zzb.zzWL());
            if ($assertionsDisabled || com_google_android_gms_internal_zzbpq != null) {
                zzbrd zzb2 = com_google_android_gms_internal_zzbpq.zzb(zzb);
                if ($assertionsDisabled || zzb2 != null) {
                    zzbsc zzaar = zzb2.zzaar();
                    zzbsc com_google_android_gms_internal_zzbsc = zzaar;
                    for (zzbsh zzr : list) {
                        com_google_android_gms_internal_zzbsc = zzr.zzr(com_google_android_gms_internal_zzbsc);
                    }
                    return zza(com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzbsc, com_google_android_gms_internal_zzbps);
                }
                throw new AssertionError("Missing view for query tag that we're tracking");
            }
            throw new AssertionError("Missing sync point for query tag that we're tracking");
        }
        throw new AssertionError();
    }

    public List<? extends zzbqy> zza(final zzbph com_google_android_gms_internal_zzbph, final Map<zzbph, zzbsc> map) {
        return (List) this.zzcfN.zzf(new Callable<List<? extends zzbqy>>(this) {
            final /* synthetic */ zzbpr zzcfZ;

            public /* synthetic */ Object call() throws Exception {
                return zzMM();
            }

            public List<? extends zzbqy> zzMM() {
                zzboy zzaC = zzboy.zzaC(map);
                this.zzcfZ.zzcfN.zzd(com_google_android_gms_internal_zzbph, zzaC);
                return this.zzcfZ.zza(new zzbqd(zzbqf.zzcgW, com_google_android_gms_internal_zzbph, zzaC));
            }
        });
    }

    public List<? extends zzbqy> zza(final zzbph com_google_android_gms_internal_zzbph, final Map<zzbph, zzbsc> map, final zzbps com_google_android_gms_internal_zzbps) {
        return (List) this.zzcfN.zzf(new Callable<List<? extends zzbqy>>(this) {
            final /* synthetic */ zzbpr zzcfZ;

            public /* synthetic */ Object call() throws Exception {
                return zzMM();
            }

            public List<? extends zzbqy> zzMM() {
                zzbrc zza = this.zzcfZ.zzb(com_google_android_gms_internal_zzbps);
                if (zza == null) {
                    return Collections.emptyList();
                }
                zzbph zza2 = zzbph.zza(zza.zzWL(), com_google_android_gms_internal_zzbph);
                zzboy zzaC = zzboy.zzaC(map);
                this.zzcfZ.zzcfN.zzd(com_google_android_gms_internal_zzbph, zzaC);
                return this.zzcfZ.zza(zza, new zzbqd(zzbqf.zzc(zza.zzaap()), zza2, zzaC));
            }
        });
    }

    public List<? extends zzbqy> zza(final zzbps com_google_android_gms_internal_zzbps) {
        return (List) this.zzcfN.zzf(new Callable<List<? extends zzbqy>>(this) {
            final /* synthetic */ zzbpr zzcfZ;

            public /* synthetic */ Object call() throws Exception {
                return zzMM();
            }

            public List<? extends zzbqy> zzMM() {
                zzbrc zza = this.zzcfZ.zzb(com_google_android_gms_internal_zzbps);
                if (zza == null) {
                    return Collections.emptyList();
                }
                this.zzcfZ.zzcfN.zzi(zza);
                return this.zzcfZ.zza(zza, new zzbqc(zzbqf.zzc(zza.zzaap()), zzbph.zzYO()));
            }
        });
    }

    public List<zzbqy> zza(zzbrc com_google_android_gms_internal_zzbrc, DatabaseError databaseError) {
        return zzb(com_google_android_gms_internal_zzbrc, null, databaseError);
    }

    public void zza(zzbrc com_google_android_gms_internal_zzbrc, boolean z) {
        if (z && !this.zzcfS.contains(com_google_android_gms_internal_zzbrc)) {
            zzg(new zzb(com_google_android_gms_internal_zzbrc));
            this.zzcfS.add(com_google_android_gms_internal_zzbrc);
        } else if (!z && this.zzcfS.contains(com_google_android_gms_internal_zzbrc)) {
            zzh(new zzb(com_google_android_gms_internal_zzbrc));
            this.zzcfS.remove(com_google_android_gms_internal_zzbrc);
        }
    }

    public List<? extends zzbqy> zzb(zzbph com_google_android_gms_internal_zzbph, List<zzbsh> list) {
        zzbpq com_google_android_gms_internal_zzbpq = (zzbpq) this.zzcfO.zzK(com_google_android_gms_internal_zzbph);
        if (com_google_android_gms_internal_zzbpq == null) {
            return Collections.emptyList();
        }
        zzbrd zzZh = com_google_android_gms_internal_zzbpq.zzZh();
        if (zzZh == null) {
            return Collections.emptyList();
        }
        zzbsc zzaar = zzZh.zzaar();
        zzbsc com_google_android_gms_internal_zzbsc = zzaar;
        for (zzbsh zzr : list) {
            com_google_android_gms_internal_zzbsc = zzr.zzr(com_google_android_gms_internal_zzbsc);
        }
        return zzi(com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzbsc);
    }

    public zzbsc zzc(zzbph com_google_android_gms_internal_zzbph, List<Long> list) {
        zzbsc zzs;
        zzbqq com_google_android_gms_internal_zzbqq = this.zzcfO;
        com_google_android_gms_internal_zzbqq.getValue();
        zzbsc com_google_android_gms_internal_zzbsc = null;
        zzbph zzYO = zzbph.zzYO();
        zzbqq com_google_android_gms_internal_zzbqq2 = com_google_android_gms_internal_zzbqq;
        zzbph com_google_android_gms_internal_zzbph2 = com_google_android_gms_internal_zzbph;
        while (true) {
            zzbrq zzYR = com_google_android_gms_internal_zzbph2.zzYR();
            zzbph zzYS = com_google_android_gms_internal_zzbph2.zzYS();
            com_google_android_gms_internal_zzbph2 = zzYO.zza(zzYR);
            zzbph zza = zzbph.zza(com_google_android_gms_internal_zzbph2, com_google_android_gms_internal_zzbph);
            com_google_android_gms_internal_zzbqq2 = zzYR != null ? com_google_android_gms_internal_zzbqq2.zze(zzYR) : zzbqq.zzZM();
            zzbpq com_google_android_gms_internal_zzbpq = (zzbpq) com_google_android_gms_internal_zzbqq2.getValue();
            zzs = com_google_android_gms_internal_zzbpq != null ? com_google_android_gms_internal_zzbpq.zzs(zza) : com_google_android_gms_internal_zzbsc;
            if (!zzYS.isEmpty() && zzs == null) {
                com_google_android_gms_internal_zzbsc = zzs;
                zzYO = com_google_android_gms_internal_zzbph2;
                com_google_android_gms_internal_zzbph2 = zzYS;
            }
        }
        return this.zzcfP.zza(com_google_android_gms_internal_zzbph, zzs, (List) list, true);
    }

    public List<? extends zzbqy> zzg(final zzbpc com_google_android_gms_internal_zzbpc) {
        return (List) this.zzcfN.zzf(new Callable<List<? extends zzbqy>>(this) {
            static final /* synthetic */ boolean $assertionsDisabled = (!zzbpr.class.desiredAssertionStatus());
            final /* synthetic */ zzbpr zzcfZ;

            public /* synthetic */ Object call() throws Exception {
                return zzMM();
            }

            public List<? extends zzbqy> zzMM() {
                zzbpq com_google_android_gms_internal_zzbpq;
                zzbsc com_google_android_gms_internal_zzbsc;
                zzbpq com_google_android_gms_internal_zzbpq2;
                zzbqu com_google_android_gms_internal_zzbqu;
                zzbrc zzYm = com_google_android_gms_internal_zzbpc.zzYm();
                zzbph zzWL = zzYm.zzWL();
                zzbsc com_google_android_gms_internal_zzbsc2 = null;
                zzbph com_google_android_gms_internal_zzbph = zzWL;
                zzbqq zzd = this.zzcfZ.zzcfO;
                boolean z = false;
                while (!zzd.isEmpty()) {
                    boolean z2;
                    zzbsc com_google_android_gms_internal_zzbsc3;
                    com_google_android_gms_internal_zzbpq = (zzbpq) zzd.getValue();
                    if (com_google_android_gms_internal_zzbpq != null) {
                        if (com_google_android_gms_internal_zzbsc2 == null) {
                            com_google_android_gms_internal_zzbsc2 = com_google_android_gms_internal_zzbpq.zzs(com_google_android_gms_internal_zzbph);
                        }
                        z2 = z || com_google_android_gms_internal_zzbpq.zzZg();
                        com_google_android_gms_internal_zzbsc3 = com_google_android_gms_internal_zzbsc2;
                    } else {
                        z2 = z;
                        com_google_android_gms_internal_zzbsc3 = com_google_android_gms_internal_zzbsc2;
                    }
                    zzd = zzd.zze(com_google_android_gms_internal_zzbph.isEmpty() ? zzbrq.zzja("") : com_google_android_gms_internal_zzbph.zzYR());
                    com_google_android_gms_internal_zzbph = com_google_android_gms_internal_zzbph.zzYS();
                    com_google_android_gms_internal_zzbsc2 = com_google_android_gms_internal_zzbsc3;
                    z = z2;
                }
                com_google_android_gms_internal_zzbpq = (zzbpq) this.zzcfZ.zzcfO.zzK(zzWL);
                zzbpq com_google_android_gms_internal_zzbpq3;
                boolean z3;
                if (com_google_android_gms_internal_zzbpq == null) {
                    com_google_android_gms_internal_zzbpq = new zzbpq(this.zzcfZ.zzcfN);
                    this.zzcfZ.zzcfO = this.zzcfZ.zzcfO.zzb(zzWL, (Object) com_google_android_gms_internal_zzbpq);
                    com_google_android_gms_internal_zzbpq3 = com_google_android_gms_internal_zzbpq;
                    com_google_android_gms_internal_zzbsc = com_google_android_gms_internal_zzbsc2;
                    z3 = z;
                    com_google_android_gms_internal_zzbpq2 = com_google_android_gms_internal_zzbpq3;
                } else {
                    z = z || com_google_android_gms_internal_zzbpq.zzZg();
                    if (com_google_android_gms_internal_zzbsc2 == null) {
                        com_google_android_gms_internal_zzbsc2 = com_google_android_gms_internal_zzbpq.zzs(zzbph.zzYO());
                    }
                    com_google_android_gms_internal_zzbpq3 = com_google_android_gms_internal_zzbpq;
                    com_google_android_gms_internal_zzbsc = com_google_android_gms_internal_zzbsc2;
                    z3 = z;
                    com_google_android_gms_internal_zzbpq2 = com_google_android_gms_internal_zzbpq3;
                }
                this.zzcfZ.zzcfN.zzg(zzYm);
                if (com_google_android_gms_internal_zzbsc != null) {
                    com_google_android_gms_internal_zzbqu = new zzbqu(zzbrx.zza(com_google_android_gms_internal_zzbsc, zzYm.zzaai()), true, false);
                } else {
                    zzbqu zzf = this.zzcfZ.zzcfN.zzf(zzYm);
                    if (zzf.zzZP()) {
                        com_google_android_gms_internal_zzbqu = zzf;
                    } else {
                        zzbsc zzaaY = zzbrv.zzaaY();
                        Iterator it = this.zzcfZ.zzcfO.zzI(zzWL).zzZN().iterator();
                        while (it.hasNext()) {
                            Entry entry = (Entry) it.next();
                            zzbpq com_google_android_gms_internal_zzbpq4 = (zzbpq) ((zzbqq) entry.getValue()).getValue();
                            if (com_google_android_gms_internal_zzbpq4 != null) {
                                zzbsc zzs = com_google_android_gms_internal_zzbpq4.zzs(zzbph.zzYO());
                                if (zzs != null) {
                                    com_google_android_gms_internal_zzbsc = zzaaY.zze((zzbrq) entry.getKey(), zzs);
                                    zzaaY = com_google_android_gms_internal_zzbsc;
                                }
                            }
                            com_google_android_gms_internal_zzbsc = zzaaY;
                            zzaaY = com_google_android_gms_internal_zzbsc;
                        }
                        for (zzbsb com_google_android_gms_internal_zzbsb : zzf.zzWH()) {
                            if (!zzaaY.zzk(com_google_android_gms_internal_zzbsb.zzabi())) {
                                zzaaY = zzaaY.zze(com_google_android_gms_internal_zzbsb.zzabi(), com_google_android_gms_internal_zzbsb.zzWH());
                            }
                        }
                        com_google_android_gms_internal_zzbqu = new zzbqu(zzbrx.zza(zzaaY, zzYm.zzaai()), false, false);
                    }
                }
                boolean zzc = com_google_android_gms_internal_zzbpq2.zzc(zzYm);
                if (!(zzc || zzYm.zzaam())) {
                    if ($assertionsDisabled || !this.zzcfZ.zzcfR.containsKey(zzYm)) {
                        zzbps zzf2 = this.zzcfZ.zzZj();
                        this.zzcfZ.zzcfR.put(zzYm, zzf2);
                        this.zzcfZ.zzcfQ.put(zzf2, zzYm);
                    } else {
                        throw new AssertionError("View does not exist but we have a tag");
                    }
                }
                List<? extends zzbqy> zza = com_google_android_gms_internal_zzbpq2.zza(com_google_android_gms_internal_zzbpc, this.zzcfZ.zzcfP.zzu(zzWL), com_google_android_gms_internal_zzbqu);
                if (!(zzc || r4)) {
                    this.zzcfZ.zza(zzYm, com_google_android_gms_internal_zzbpq2.zzb(zzYm));
                }
                return zza;
            }
        });
    }

    public List<zzbqy> zzh(zzbpc com_google_android_gms_internal_zzbpc) {
        return zzb(com_google_android_gms_internal_zzbpc.zzYm(), com_google_android_gms_internal_zzbpc, null);
    }

    public List<? extends zzbqy> zzi(final zzbph com_google_android_gms_internal_zzbph, final zzbsc com_google_android_gms_internal_zzbsc) {
        return (List) this.zzcfN.zzf(new Callable<List<? extends zzbqy>>(this) {
            final /* synthetic */ zzbpr zzcfZ;

            public /* synthetic */ Object call() throws Exception {
                return zzMM();
            }

            public List<? extends zzbqy> zzMM() {
                this.zzcfZ.zzcfN.zza(zzbrc.zzN(com_google_android_gms_internal_zzbph), com_google_android_gms_internal_zzbsc);
                return this.zzcfZ.zza(new zzbqg(zzbqf.zzcgW, com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzbsc));
            }
        });
    }

    public List<? extends zzbqy> zzt(final zzbph com_google_android_gms_internal_zzbph) {
        return (List) this.zzcfN.zzf(new Callable<List<? extends zzbqy>>(this) {
            final /* synthetic */ zzbpr zzcfZ;

            public /* synthetic */ Object call() throws Exception {
                return zzMM();
            }

            public List<? extends zzbqy> zzMM() {
                this.zzcfZ.zzcfN.zzi(zzbrc.zzN(com_google_android_gms_internal_zzbph));
                return this.zzcfZ.zza(new zzbqc(zzbqf.zzcgW, com_google_android_gms_internal_zzbph));
            }
        });
    }
}
