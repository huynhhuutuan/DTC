package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;

public class zzbqi implements zzbql {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbqi.class.desiredAssertionStatus());
    private final zzbrn zzcaJ;
    private final zzbqm zzchf;
    private final zzbqp zzchg;
    private final zzbqh zzchh;
    private long zzchi;

    public zzbqi(zzbpa com_google_android_gms_internal_zzbpa, zzbqm com_google_android_gms_internal_zzbqm, zzbqh com_google_android_gms_internal_zzbqh) {
        this(com_google_android_gms_internal_zzbpa, com_google_android_gms_internal_zzbqm, com_google_android_gms_internal_zzbqh, new zzbsx());
    }

    public zzbqi(zzbpa com_google_android_gms_internal_zzbpa, zzbqm com_google_android_gms_internal_zzbqm, zzbqh com_google_android_gms_internal_zzbqh, zzbsw com_google_android_gms_internal_zzbsw) {
        this.zzchi = 0;
        this.zzchf = com_google_android_gms_internal_zzbqm;
        this.zzcaJ = com_google_android_gms_internal_zzbpa.zziV("Persistence");
        this.zzchg = new zzbqp(this.zzchf, this.zzcaJ, com_google_android_gms_internal_zzbsw);
        this.zzchh = com_google_android_gms_internal_zzbqh;
    }

    private void zzZG() {
        this.zzchi++;
        if (this.zzchh.zzaQ(this.zzchi)) {
            if (this.zzcaJ.zzaaC()) {
                this.zzcaJ.zzi("Reached prune check threshold.", new Object[0]);
            }
            this.zzchi = 0;
            int i = 1;
            long zzWO = this.zzchf.zzWO();
            if (this.zzcaJ.zzaaC()) {
                this.zzcaJ.zzi("Cache size: " + zzWO, new Object[0]);
            }
            while (i != 0 && this.zzchh.zzk(r2, this.zzchg.zzZK())) {
                zzbqn zza = this.zzchg.zza(this.zzchh);
                if (zza.zzZH()) {
                    this.zzchf.zza(zzbph.zzYO(), zza);
                } else {
                    i = 0;
                }
                zzWO = this.zzchf.zzWO();
                if (this.zzcaJ.zzaaC()) {
                    this.zzcaJ.zzi("Cache size after prune: " + zzWO, new Object[0]);
                }
            }
        }
    }

    public List<zzbpv> zzWN() {
        return this.zzchf.zzWN();
    }

    public void zzWQ() {
        this.zzchf.zzWQ();
    }

    public void zza(zzbph com_google_android_gms_internal_zzbph, zzboy com_google_android_gms_internal_zzboy, long j) {
        this.zzchf.zza(com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzboy, j);
    }

    public void zza(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc, long j) {
        this.zzchf.zza(com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzbsc, j);
    }

    public void zza(zzbrc com_google_android_gms_internal_zzbrc, zzbsc com_google_android_gms_internal_zzbsc) {
        if (com_google_android_gms_internal_zzbrc.zzaam()) {
            this.zzchf.zza(com_google_android_gms_internal_zzbrc.zzWL(), com_google_android_gms_internal_zzbsc);
        } else {
            this.zzchf.zzb(com_google_android_gms_internal_zzbrc.zzWL(), com_google_android_gms_internal_zzbsc);
        }
        zzi(com_google_android_gms_internal_zzbrc);
        zzZG();
    }

    public void zza(zzbrc com_google_android_gms_internal_zzbrc, Set<zzbrq> set) {
        if ($assertionsDisabled || !com_google_android_gms_internal_zzbrc.zzaam()) {
            zzbqo zzl = this.zzchg.zzl(com_google_android_gms_internal_zzbrc);
            if ($assertionsDisabled || (zzl != null && zzl.zzbrc)) {
                this.zzchf.zza(zzl.id, (Set) set);
                return;
            }
            throw new AssertionError("We only expect tracked keys for currently-active queries.");
        }
        throw new AssertionError("We should only track keys for filtered queries.");
    }

    public void zza(zzbrc com_google_android_gms_internal_zzbrc, Set<zzbrq> set, Set<zzbrq> set2) {
        if ($assertionsDisabled || !com_google_android_gms_internal_zzbrc.zzaam()) {
            zzbqo zzl = this.zzchg.zzl(com_google_android_gms_internal_zzbrc);
            if ($assertionsDisabled || (zzl != null && zzl.zzbrc)) {
                this.zzchf.zza(zzl.id, (Set) set, (Set) set2);
                return;
            }
            throw new AssertionError("We only expect tracked keys for currently-active queries.");
        }
        throw new AssertionError("We should only track keys for filtered queries.");
    }

    public void zzaD(long j) {
        this.zzchf.zzaD(j);
    }

    public void zzc(zzbph com_google_android_gms_internal_zzbph, zzboy com_google_android_gms_internal_zzboy) {
        Iterator it = com_google_android_gms_internal_zzboy.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            zzk(com_google_android_gms_internal_zzbph.zzh((zzbph) entry.getKey()), (zzbsc) entry.getValue());
        }
    }

    public void zzd(zzbph com_google_android_gms_internal_zzbph, zzboy com_google_android_gms_internal_zzboy) {
        this.zzchf.zza(com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzboy);
        zzZG();
    }

    public zzbqu zzf(zzbrc com_google_android_gms_internal_zzbrc) {
        boolean z;
        Set zzaG;
        if (this.zzchg.zzo(com_google_android_gms_internal_zzbrc)) {
            zzbqo zzl = this.zzchg.zzl(com_google_android_gms_internal_zzbrc);
            zzaG = (com_google_android_gms_internal_zzbrc.zzaam() || zzl == null || !zzl.zzchs) ? null : this.zzchf.zzaG(zzl.id);
            z = true;
        } else {
            zzaG = this.zzchg.zzB(com_google_android_gms_internal_zzbrc.zzWL());
            z = false;
        }
        zzbsc zza = this.zzchf.zza(com_google_android_gms_internal_zzbrc.zzWL());
        if (r0 == null) {
            return new zzbqu(zzbrx.zza(zza, com_google_android_gms_internal_zzbrc.zzaai()), true, false);
        }
        zzbsc zzaaY = zzbrv.zzaaY();
        for (zzbrq com_google_android_gms_internal_zzbrq : r0) {
            zzaaY = zzaaY.zze(com_google_android_gms_internal_zzbrq, zza.zzm(com_google_android_gms_internal_zzbrq));
        }
        return new zzbqu(zzbrx.zza(zzaaY, com_google_android_gms_internal_zzbrc.zzaai()), z, true);
    }

    public <T> T zzf(Callable<T> callable) {
        this.zzchf.beginTransaction();
        try {
            T call = callable.call();
            this.zzchf.setTransactionSuccessful();
            this.zzchf.endTransaction();
            return call;
        } catch (Throwable th) {
            this.zzchf.endTransaction();
        }
    }

    public void zzg(zzbrc com_google_android_gms_internal_zzbrc) {
        this.zzchg.zzg(com_google_android_gms_internal_zzbrc);
    }

    public void zzh(zzbrc com_google_android_gms_internal_zzbrc) {
        this.zzchg.zzh(com_google_android_gms_internal_zzbrc);
    }

    public void zzi(zzbrc com_google_android_gms_internal_zzbrc) {
        if (com_google_android_gms_internal_zzbrc.zzaam()) {
            this.zzchg.zzA(com_google_android_gms_internal_zzbrc.zzWL());
        } else {
            this.zzchg.zzn(com_google_android_gms_internal_zzbrc);
        }
    }

    public void zzk(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc) {
        if (!this.zzchg.zzD(com_google_android_gms_internal_zzbph)) {
            this.zzchf.zza(com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzbsc);
            this.zzchg.zzC(com_google_android_gms_internal_zzbph);
        }
    }
}
