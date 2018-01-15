package com.google.android.gms.internal;

import com.google.firebase.database.DatabaseError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class zzbrd {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbrd.class.desiredAssertionStatus());
    private final zzbrc zzcid;
    private final zzbrf zzciu;
    private zzbre zzciv;
    private final List<zzbpc> zzciw = new ArrayList();
    private final zzbqz zzcix;

    public static class zza {
        public final List<zzbqx> zzciy;
        public final List<zzbqw> zzciz;

        public zza(List<zzbqx> list, List<zzbqw> list2) {
            this.zzciy = list;
            this.zzciz = list2;
        }
    }

    public zzbrd(zzbrc com_google_android_gms_internal_zzbrc, zzbre com_google_android_gms_internal_zzbre) {
        this.zzcid = com_google_android_gms_internal_zzbrc;
        zzbrh com_google_android_gms_internal_zzbrh = new zzbrh(com_google_android_gms_internal_zzbrc.zzaai());
        zzbrj zzaao = com_google_android_gms_internal_zzbrc.zzaap().zzaao();
        this.zzciu = new zzbrf(zzaao);
        zzbqu zzaav = com_google_android_gms_internal_zzbre.zzaav();
        zzbqu zzaat = com_google_android_gms_internal_zzbre.zzaat();
        zzbrx zza = zzbrx.zza(zzbrv.zzaaY(), com_google_android_gms_internal_zzbrc.zzaai());
        zzbrx zza2 = com_google_android_gms_internal_zzbrh.zza(zza, zzaav.zzZR(), null);
        zza = zzaao.zza(zza, zzaat.zzZR(), null);
        this.zzciv = new zzbre(new zzbqu(zza, zzaat.zzZP(), zzaao.zzaaz()), new zzbqu(zza2, zzaav.zzZP(), com_google_android_gms_internal_zzbrh.zzaaz()));
        this.zzcix = new zzbqz(com_google_android_gms_internal_zzbrc);
    }

    private List<zzbqx> zza(List<zzbqw> list, zzbrx com_google_android_gms_internal_zzbrx, zzbpc com_google_android_gms_internal_zzbpc) {
        List list2;
        if (com_google_android_gms_internal_zzbpc == null) {
            list2 = this.zzciw;
        } else {
            list2 = Arrays.asList(new zzbpc[]{com_google_android_gms_internal_zzbpc});
        }
        return this.zzcix.zza((List) list, com_google_android_gms_internal_zzbrx, list2);
    }

    public boolean isEmpty() {
        return this.zzciw.isEmpty();
    }

    public List<zzbqy> zza(zzbpc com_google_android_gms_internal_zzbpc, DatabaseError databaseError) {
        List<zzbqy> list;
        if (databaseError != null) {
            List<zzbqy> arrayList = new ArrayList();
            if ($assertionsDisabled || com_google_android_gms_internal_zzbpc == null) {
                zzbph zzWL = this.zzcid.zzWL();
                for (zzbpc com_google_android_gms_internal_zzbqv : this.zzciw) {
                    zzbpc com_google_android_gms_internal_zzbqv2;
                    arrayList.add(new zzbqv(com_google_android_gms_internal_zzbqv2, databaseError, zzWL));
                }
                list = arrayList;
            } else {
                throw new AssertionError("A cancel should cancel all event registrations");
            }
        }
        list = Collections.emptyList();
        if (com_google_android_gms_internal_zzbpc != null) {
            int i = 0;
            int i2 = -1;
            while (i < this.zzciw.size()) {
                com_google_android_gms_internal_zzbqv2 = (zzbpc) this.zzciw.get(i);
                if (com_google_android_gms_internal_zzbqv2.zzc(com_google_android_gms_internal_zzbpc)) {
                    if (com_google_android_gms_internal_zzbqv2.zzYK()) {
                        break;
                    }
                    i2 = i;
                }
                i++;
            }
            i = i2;
            if (i != -1) {
                com_google_android_gms_internal_zzbqv2 = (zzbpc) this.zzciw.get(i);
                this.zzciw.remove(i);
                com_google_android_gms_internal_zzbqv2.zzYJ();
            }
        } else {
            for (zzbpc com_google_android_gms_internal_zzbqv22 : this.zzciw) {
                com_google_android_gms_internal_zzbqv22.zzYJ();
            }
            this.zzciw.clear();
        }
        return list;
    }

    public zzbrc zzaaq() {
        return this.zzcid;
    }

    public zzbsc zzaar() {
        return this.zzciv.zzaav().zzWH();
    }

    public zzbsc zzaas() {
        return this.zzciv.zzaat().zzWH();
    }

    public zza zzb(zzbqe com_google_android_gms_internal_zzbqe, zzbpz com_google_android_gms_internal_zzbpz, zzbsc com_google_android_gms_internal_zzbsc) {
        if (com_google_android_gms_internal_zzbqe.zzZy() == com.google.android.gms.internal.zzbqe.zza.Merge && com_google_android_gms_internal_zzbqe.zzZx().zzZC() != null) {
            if (!$assertionsDisabled && this.zzciv.zzaaw() == null) {
                throw new AssertionError("We should always have a full cache before handling merges");
            } else if (!$assertionsDisabled && this.zzciv.zzaau() == null) {
                throw new AssertionError("Missing event cache, even though we have a server cache");
            }
        }
        zzbre com_google_android_gms_internal_zzbre = this.zzciv;
        com.google.android.gms.internal.zzbrf.zza zza = this.zzciu.zza(com_google_android_gms_internal_zzbre, com_google_android_gms_internal_zzbqe, com_google_android_gms_internal_zzbpz, com_google_android_gms_internal_zzbsc);
        if ($assertionsDisabled || zza.zzciv.zzaav().zzZP() || !com_google_android_gms_internal_zzbre.zzaav().zzZP()) {
            this.zzciv = zza.zzciv;
            return new zza(zza(zza.zzciz, zza.zzciv.zzaat().zzZR(), null), zza.zzciz);
        }
        throw new AssertionError("Once a server snap is complete, it should never go back");
    }

    public void zzb(zzbpc com_google_android_gms_internal_zzbpc) {
        this.zzciw.add(com_google_android_gms_internal_zzbpc);
    }

    public List<zzbqx> zzl(zzbpc com_google_android_gms_internal_zzbpc) {
        zzbqu zzaat = this.zzciv.zzaat();
        List arrayList = new ArrayList();
        for (zzbsb com_google_android_gms_internal_zzbsb : zzaat.zzWH()) {
            arrayList.add(zzbqw.zzc(com_google_android_gms_internal_zzbsb.zzabi(), com_google_android_gms_internal_zzbsb.zzWH()));
        }
        if (zzaat.zzZP()) {
            arrayList.add(zzbqw.zza(zzaat.zzZR()));
        }
        return zza(arrayList, zzaat.zzZR(), com_google_android_gms_internal_zzbpc);
    }

    public zzbsc zzs(zzbph com_google_android_gms_internal_zzbph) {
        zzbsc zzaaw = this.zzciv.zzaaw();
        return (zzaaw == null || (!this.zzcid.zzaam() && (com_google_android_gms_internal_zzbph.isEmpty() || zzaaw.zzm(com_google_android_gms_internal_zzbph.zzYR()).isEmpty()))) ? null : zzaaw.zzO(com_google_android_gms_internal_zzbph);
    }
}
