package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class zzbrf {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbrf.class.desiredAssertionStatus());
    private static com.google.android.gms.internal.zzbrj.zza zzciD = new C10021();
    private final zzbrj zzciC;

    public static class zza {
        public final zzbre zzciv;
        public final List<zzbqw> zzciz;

        public zza(zzbre com_google_android_gms_internal_zzbre, List<zzbqw> list) {
            this.zzciv = com_google_android_gms_internal_zzbre;
            this.zzciz = list;
        }
    }

    class C10021 implements com.google.android.gms.internal.zzbrj.zza {
        C10021() {
        }

        public zzbsb zza(zzbrw com_google_android_gms_internal_zzbrw, zzbsb com_google_android_gms_internal_zzbsb, boolean z) {
            return null;
        }

        public zzbsc zzh(zzbrq com_google_android_gms_internal_zzbrq) {
            return null;
        }
    }

    private static class zzb implements com.google.android.gms.internal.zzbrj.zza {
        private final zzbpz zzciF;
        private final zzbsc zzciG;
        private final zzbre zzciv;

        public zzb(zzbpz com_google_android_gms_internal_zzbpz, zzbre com_google_android_gms_internal_zzbre, zzbsc com_google_android_gms_internal_zzbsc) {
            this.zzciF = com_google_android_gms_internal_zzbpz;
            this.zzciv = com_google_android_gms_internal_zzbre;
            this.zzciG = com_google_android_gms_internal_zzbsc;
        }

        public zzbsb zza(zzbrw com_google_android_gms_internal_zzbrw, zzbsb com_google_android_gms_internal_zzbsb, boolean z) {
            return this.zzciF.zza(this.zzciG != null ? this.zzciG : this.zzciv.zzaaw(), com_google_android_gms_internal_zzbsb, z, com_google_android_gms_internal_zzbrw);
        }

        public zzbsc zzh(zzbrq com_google_android_gms_internal_zzbrq) {
            zzbqu zzaat = this.zzciv.zzaat();
            if (zzaat.zzf(com_google_android_gms_internal_zzbrq)) {
                return zzaat.zzWH().zzm(com_google_android_gms_internal_zzbrq);
            }
            return this.zzciF.zza(com_google_android_gms_internal_zzbrq, this.zzciG != null ? new zzbqu(zzbrx.zza(this.zzciG, zzbry.zzabf()), true, false) : this.zzciv.zzaav());
        }
    }

    public zzbrf(zzbrj com_google_android_gms_internal_zzbrj) {
        this.zzciC = com_google_android_gms_internal_zzbrj;
    }

    private zzbre zza(zzbre com_google_android_gms_internal_zzbre, zzbph com_google_android_gms_internal_zzbph, zzboy com_google_android_gms_internal_zzboy, zzbpz com_google_android_gms_internal_zzbpz, zzbsc com_google_android_gms_internal_zzbsc, zzbrg com_google_android_gms_internal_zzbrg) {
        if ($assertionsDisabled || com_google_android_gms_internal_zzboy.zzYo() == null) {
            Entry entry;
            zzbph zzh;
            Iterator it = com_google_android_gms_internal_zzboy.iterator();
            zzbre com_google_android_gms_internal_zzbre2 = com_google_android_gms_internal_zzbre;
            while (it.hasNext()) {
                entry = (Entry) it.next();
                zzh = com_google_android_gms_internal_zzbph.zzh((zzbph) entry.getKey());
                if (zza(com_google_android_gms_internal_zzbre, zzh.zzYR())) {
                    com_google_android_gms_internal_zzbre2 = zza(com_google_android_gms_internal_zzbre2, zzh, (zzbsc) entry.getValue(), com_google_android_gms_internal_zzbpz, com_google_android_gms_internal_zzbsc, com_google_android_gms_internal_zzbrg);
                }
            }
            it = com_google_android_gms_internal_zzboy.iterator();
            while (it.hasNext()) {
                entry = (Entry) it.next();
                zzh = com_google_android_gms_internal_zzbph.zzh((zzbph) entry.getKey());
                if (!zza(com_google_android_gms_internal_zzbre, zzh.zzYR())) {
                    com_google_android_gms_internal_zzbre2 = zza(com_google_android_gms_internal_zzbre2, zzh, (zzbsc) entry.getValue(), com_google_android_gms_internal_zzbpz, com_google_android_gms_internal_zzbsc, com_google_android_gms_internal_zzbrg);
                }
            }
            return com_google_android_gms_internal_zzbre2;
        }
        throw new AssertionError("Can't have a merge that is an overwrite");
    }

    private zzbre zza(zzbre com_google_android_gms_internal_zzbre, zzbph com_google_android_gms_internal_zzbph, zzboy com_google_android_gms_internal_zzboy, zzbpz com_google_android_gms_internal_zzbpz, zzbsc com_google_android_gms_internal_zzbsc, boolean z, zzbrg com_google_android_gms_internal_zzbrg) {
        if (com_google_android_gms_internal_zzbre.zzaav().zzWH().isEmpty() && !com_google_android_gms_internal_zzbre.zzaav().zzZP()) {
            return com_google_android_gms_internal_zzbre;
        }
        if ($assertionsDisabled || com_google_android_gms_internal_zzboy.zzYo() == null) {
            zzbrq com_google_android_gms_internal_zzbrq;
            if (!com_google_android_gms_internal_zzbph.isEmpty()) {
                com_google_android_gms_internal_zzboy = zzboy.zzYn().zzb(com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzboy);
            }
            zzbsc zzWH = com_google_android_gms_internal_zzbre.zzaav().zzWH();
            Map zzYq = com_google_android_gms_internal_zzboy.zzYq();
            zzbre com_google_android_gms_internal_zzbre2 = com_google_android_gms_internal_zzbre;
            for (Entry entry : zzYq.entrySet()) {
                com_google_android_gms_internal_zzbrq = (zzbrq) entry.getKey();
                if (zzWH.zzk(com_google_android_gms_internal_zzbrq)) {
                    com_google_android_gms_internal_zzbre2 = zza(com_google_android_gms_internal_zzbre2, new zzbph(com_google_android_gms_internal_zzbrq), ((zzboy) entry.getValue()).zzb(zzWH.zzm(com_google_android_gms_internal_zzbrq)), com_google_android_gms_internal_zzbpz, com_google_android_gms_internal_zzbsc, z, com_google_android_gms_internal_zzbrg);
                }
            }
            for (Entry entry2 : zzYq.entrySet()) {
                com_google_android_gms_internal_zzbrq = (zzbrq) entry2.getKey();
                Object obj = (com_google_android_gms_internal_zzbre.zzaav().zzf(com_google_android_gms_internal_zzbrq) || ((zzboy) entry2.getValue()).zzYo() != null) ? null : 1;
                if (!zzWH.zzk(com_google_android_gms_internal_zzbrq) && obj == null) {
                    com_google_android_gms_internal_zzbre2 = zza(com_google_android_gms_internal_zzbre2, new zzbph(com_google_android_gms_internal_zzbrq), ((zzboy) entry2.getValue()).zzb(zzWH.zzm(com_google_android_gms_internal_zzbrq)), com_google_android_gms_internal_zzbpz, com_google_android_gms_internal_zzbsc, z, com_google_android_gms_internal_zzbrg);
                }
            }
            return com_google_android_gms_internal_zzbre2;
        }
        throw new AssertionError("Can't have a merge that is an overwrite");
    }

    private zzbre zza(zzbre com_google_android_gms_internal_zzbre, zzbph com_google_android_gms_internal_zzbph, zzbpz com_google_android_gms_internal_zzbpz, com.google.android.gms.internal.zzbrj.zza com_google_android_gms_internal_zzbrj_zza, zzbrg com_google_android_gms_internal_zzbrg) {
        zzbqu zzaat = com_google_android_gms_internal_zzbre.zzaat();
        if (com_google_android_gms_internal_zzbpz.zzv(com_google_android_gms_internal_zzbph) != null) {
            return com_google_android_gms_internal_zzbre;
        }
        zzbrx zza;
        zzbsc zza2;
        if (!com_google_android_gms_internal_zzbph.isEmpty()) {
            zzbrq zzYR = com_google_android_gms_internal_zzbph.zzYR();
            if (!zzYR.zzaaJ()) {
                zzbsc zzl;
                zzbph zzYS = com_google_android_gms_internal_zzbph.zzYS();
                if (zzaat.zzf(zzYR)) {
                    zza2 = com_google_android_gms_internal_zzbpz.zza(com_google_android_gms_internal_zzbph, zzaat.zzWH(), com_google_android_gms_internal_zzbre.zzaav().zzWH());
                    zzl = zza2 != null ? zzaat.zzWH().zzm(zzYR).zzl(zzYS, zza2) : zzaat.zzWH().zzm(zzYR);
                } else {
                    zzl = com_google_android_gms_internal_zzbpz.zza(zzYR, com_google_android_gms_internal_zzbre.zzaav());
                }
                zza = zzl != null ? this.zzciC.zza(zzaat.zzZR(), zzYR, zzl, zzYS, com_google_android_gms_internal_zzbrj_zza, com_google_android_gms_internal_zzbrg) : zzaat.zzZR();
            } else if ($assertionsDisabled || com_google_android_gms_internal_zzbph.size() == 1) {
                zza2 = com_google_android_gms_internal_zzbpz.zza(com_google_android_gms_internal_zzbph, zzaat.zzWH(), com_google_android_gms_internal_zzbre.zzaav().zzWH());
                zza = zza2 != null ? this.zzciC.zza(zzaat.zzZR(), zza2) : zzaat.zzZR();
            } else {
                throw new AssertionError("Can't have a priority with additional path components");
            }
        } else if ($assertionsDisabled || com_google_android_gms_internal_zzbre.zzaav().zzZP()) {
            if (com_google_android_gms_internal_zzbre.zzaav().zzZQ()) {
                zza2 = com_google_android_gms_internal_zzbre.zzaaw();
                if (!(zza2 instanceof zzbrr)) {
                    zza2 = zzbrv.zzaaY();
                }
                zza2 = com_google_android_gms_internal_zzbpz.zzd(zza2);
            } else {
                zza2 = com_google_android_gms_internal_zzbpz.zzc(com_google_android_gms_internal_zzbre.zzaaw());
            }
            zza = this.zzciC.zza(com_google_android_gms_internal_zzbre.zzaat().zzZR(), zzbrx.zza(zza2, this.zzciC.zzaai()), com_google_android_gms_internal_zzbrg);
        } else {
            throw new AssertionError("If change path is empty, we must have complete server data");
        }
        boolean z = zzaat.zzZP() || com_google_android_gms_internal_zzbph.isEmpty();
        return com_google_android_gms_internal_zzbre.zza(zza, z, this.zzciC.zzaaz());
    }

    private zzbre zza(zzbre com_google_android_gms_internal_zzbre, zzbph com_google_android_gms_internal_zzbph, zzbqq<Boolean> com_google_android_gms_internal_zzbqq_java_lang_Boolean, zzbpz com_google_android_gms_internal_zzbpz, zzbsc com_google_android_gms_internal_zzbsc, zzbrg com_google_android_gms_internal_zzbrg) {
        if (com_google_android_gms_internal_zzbpz.zzv(com_google_android_gms_internal_zzbph) != null) {
            return com_google_android_gms_internal_zzbre;
        }
        boolean zzZQ = com_google_android_gms_internal_zzbre.zzaav().zzZQ();
        zzbqu zzaav = com_google_android_gms_internal_zzbre.zzaav();
        zzboy zzYn;
        if (com_google_android_gms_internal_zzbqq_java_lang_Boolean.getValue() == null) {
            zzYn = zzboy.zzYn();
            Iterator it = com_google_android_gms_internal_zzbqq_java_lang_Boolean.iterator();
            while (it.hasNext()) {
                zzbph com_google_android_gms_internal_zzbph2 = (zzbph) ((Entry) it.next()).getKey();
                zzbph zzh = com_google_android_gms_internal_zzbph.zzh(com_google_android_gms_internal_zzbph2);
                if (zzaav.zzM(zzh)) {
                    zzYn = zzYn.zze(com_google_android_gms_internal_zzbph2, zzaav.zzWH().zzO(zzh));
                }
            }
            return zza(com_google_android_gms_internal_zzbre, com_google_android_gms_internal_zzbph, zzYn, com_google_android_gms_internal_zzbpz, com_google_android_gms_internal_zzbsc, zzZQ, com_google_android_gms_internal_zzbrg);
        } else if ((com_google_android_gms_internal_zzbph.isEmpty() && zzaav.zzZP()) || zzaav.zzM(com_google_android_gms_internal_zzbph)) {
            return zza(com_google_android_gms_internal_zzbre, com_google_android_gms_internal_zzbph, zzaav.zzWH().zzO(com_google_android_gms_internal_zzbph), com_google_android_gms_internal_zzbpz, com_google_android_gms_internal_zzbsc, zzZQ, com_google_android_gms_internal_zzbrg);
        } else if (!com_google_android_gms_internal_zzbph.isEmpty()) {
            return com_google_android_gms_internal_zzbre;
        } else {
            zzYn = zzboy.zzYn();
            for (zzbsb com_google_android_gms_internal_zzbsb : zzaav.zzWH()) {
                zzYn = zzYn.zza(com_google_android_gms_internal_zzbsb.zzabi(), com_google_android_gms_internal_zzbsb.zzWH());
            }
            return zza(com_google_android_gms_internal_zzbre, com_google_android_gms_internal_zzbph, zzYn, com_google_android_gms_internal_zzbpz, com_google_android_gms_internal_zzbsc, zzZQ, com_google_android_gms_internal_zzbrg);
        }
    }

    private zzbre zza(zzbre com_google_android_gms_internal_zzbre, zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc, zzbpz com_google_android_gms_internal_zzbpz, zzbsc com_google_android_gms_internal_zzbsc2, zzbrg com_google_android_gms_internal_zzbrg) {
        zzbqu zzaat = com_google_android_gms_internal_zzbre.zzaat();
        com.google.android.gms.internal.zzbrj.zza com_google_android_gms_internal_zzbrf_zzb = new zzb(com_google_android_gms_internal_zzbpz, com_google_android_gms_internal_zzbre, com_google_android_gms_internal_zzbsc2);
        if (com_google_android_gms_internal_zzbph.isEmpty()) {
            return com_google_android_gms_internal_zzbre.zza(this.zzciC.zza(com_google_android_gms_internal_zzbre.zzaat().zzZR(), zzbrx.zza(com_google_android_gms_internal_zzbsc, this.zzciC.zzaai()), com_google_android_gms_internal_zzbrg), true, this.zzciC.zzaaz());
        }
        zzbrq zzYR = com_google_android_gms_internal_zzbph.zzYR();
        if (zzYR.zzaaJ()) {
            return com_google_android_gms_internal_zzbre.zza(this.zzciC.zza(com_google_android_gms_internal_zzbre.zzaat().zzZR(), com_google_android_gms_internal_zzbsc), zzaat.zzZP(), zzaat.zzZQ());
        }
        zzbsc com_google_android_gms_internal_zzbsc3;
        zzbph zzYS = com_google_android_gms_internal_zzbph.zzYS();
        zzbsc zzm = zzaat.zzWH().zzm(zzYR);
        if (zzYS.isEmpty()) {
            com_google_android_gms_internal_zzbsc3 = com_google_android_gms_internal_zzbsc;
        } else {
            com_google_android_gms_internal_zzbsc3 = com_google_android_gms_internal_zzbrf_zzb.zzh(zzYR);
            if (com_google_android_gms_internal_zzbsc3 == null) {
                com_google_android_gms_internal_zzbsc3 = zzbrv.zzaaY();
            } else if (!(zzYS.zzYU().zzaaJ() && com_google_android_gms_internal_zzbsc3.zzO(zzYS.zzYT()).isEmpty())) {
                com_google_android_gms_internal_zzbsc3 = com_google_android_gms_internal_zzbsc3.zzl(zzYS, com_google_android_gms_internal_zzbsc);
            }
        }
        return !zzm.equals(com_google_android_gms_internal_zzbsc3) ? com_google_android_gms_internal_zzbre.zza(this.zzciC.zza(zzaat.zzZR(), zzYR, com_google_android_gms_internal_zzbsc3, zzYS, com_google_android_gms_internal_zzbrf_zzb, com_google_android_gms_internal_zzbrg), zzaat.zzZP(), this.zzciC.zzaaz()) : com_google_android_gms_internal_zzbre;
    }

    private zzbre zza(zzbre com_google_android_gms_internal_zzbre, zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc, zzbpz com_google_android_gms_internal_zzbpz, zzbsc com_google_android_gms_internal_zzbsc2, boolean z, zzbrg com_google_android_gms_internal_zzbrg) {
        zzbrx zza;
        zzbqu zzaav = com_google_android_gms_internal_zzbre.zzaav();
        zzbrj zzaay = z ? this.zzciC : this.zzciC.zzaay();
        if (com_google_android_gms_internal_zzbph.isEmpty()) {
            zza = zzaay.zza(zzaav.zzZR(), zzbrx.zza(com_google_android_gms_internal_zzbsc, zzaay.zzaai()), null);
        } else if (!zzaay.zzaaz() || zzaav.zzZQ()) {
            zzbrq zzYR = com_google_android_gms_internal_zzbph.zzYR();
            if (!zzaav.zzM(com_google_android_gms_internal_zzbph) && com_google_android_gms_internal_zzbph.size() > 1) {
                return com_google_android_gms_internal_zzbre;
            }
            zzbph zzYS = com_google_android_gms_internal_zzbph.zzYS();
            zzbsc zzl = zzaav.zzWH().zzm(zzYR).zzl(zzYS, com_google_android_gms_internal_zzbsc);
            zza = zzYR.zzaaJ() ? zzaay.zza(zzaav.zzZR(), zzl) : zzaay.zza(zzaav.zzZR(), zzYR, zzl, zzYS, zzciD, null);
        } else if ($assertionsDisabled || !com_google_android_gms_internal_zzbph.isEmpty()) {
            zzbrq zzYR2 = com_google_android_gms_internal_zzbph.zzYR();
            zza = zzaay.zza(zzaav.zzZR(), zzaav.zzZR().zzh(zzYR2, zzaav.zzWH().zzm(zzYR2).zzl(com_google_android_gms_internal_zzbph.zzYS(), com_google_android_gms_internal_zzbsc)), null);
        } else {
            throw new AssertionError("An empty path should have been caught in the other branch");
        }
        boolean z2 = zzaav.zzZP() || com_google_android_gms_internal_zzbph.isEmpty();
        zzbre zzb = com_google_android_gms_internal_zzbre.zzb(zza, z2, zzaay.zzaaz());
        return zza(zzb, com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzbpz, new zzb(com_google_android_gms_internal_zzbpz, zzb, com_google_android_gms_internal_zzbsc2), com_google_android_gms_internal_zzbrg);
    }

    private void zza(zzbre com_google_android_gms_internal_zzbre, zzbre com_google_android_gms_internal_zzbre2, List<zzbqw> list) {
        zzbqu zzaat = com_google_android_gms_internal_zzbre2.zzaat();
        if (zzaat.zzZP()) {
            Object obj = (zzaat.zzWH().zzaaM() || zzaat.zzWH().isEmpty()) ? 1 : null;
            if (!list.isEmpty() || !com_google_android_gms_internal_zzbre.zzaat().zzZP() || ((obj != null && !zzaat.zzWH().equals(com_google_android_gms_internal_zzbre.zzaau())) || !zzaat.zzWH().zzaaN().equals(com_google_android_gms_internal_zzbre.zzaau().zzaaN()))) {
                list.add(zzbqw.zza(zzaat.zzZR()));
            }
        }
    }

    private static boolean zza(zzbre com_google_android_gms_internal_zzbre, zzbrq com_google_android_gms_internal_zzbrq) {
        return com_google_android_gms_internal_zzbre.zzaat().zzf(com_google_android_gms_internal_zzbrq);
    }

    private zzbre zzb(zzbre com_google_android_gms_internal_zzbre, zzbph com_google_android_gms_internal_zzbph, zzbpz com_google_android_gms_internal_zzbpz, zzbsc com_google_android_gms_internal_zzbsc, zzbrg com_google_android_gms_internal_zzbrg) {
        zzbqu zzaav = com_google_android_gms_internal_zzbre.zzaav();
        zzbrx zzZR = zzaav.zzZR();
        boolean z = zzaav.zzZP() || com_google_android_gms_internal_zzbph.isEmpty();
        return zza(com_google_android_gms_internal_zzbre.zzb(zzZR, z, zzaav.zzZQ()), com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzbpz, zzciD, com_google_android_gms_internal_zzbrg);
    }

    public zzbre zza(zzbre com_google_android_gms_internal_zzbre, zzbph com_google_android_gms_internal_zzbph, zzbpz com_google_android_gms_internal_zzbpz, zzbsc com_google_android_gms_internal_zzbsc, zzbrg com_google_android_gms_internal_zzbrg) {
        if (com_google_android_gms_internal_zzbpz.zzv(com_google_android_gms_internal_zzbph) != null) {
            return com_google_android_gms_internal_zzbre;
        }
        com.google.android.gms.internal.zzbrj.zza com_google_android_gms_internal_zzbrf_zzb = new zzb(com_google_android_gms_internal_zzbpz, com_google_android_gms_internal_zzbre, com_google_android_gms_internal_zzbsc);
        zzbrx zzZR = com_google_android_gms_internal_zzbre.zzaat().zzZR();
        if (com_google_android_gms_internal_zzbph.isEmpty() || com_google_android_gms_internal_zzbph.zzYR().zzaaJ()) {
            zzZR = this.zzciC.zza(zzZR, zzbrx.zza(com_google_android_gms_internal_zzbre.zzaav().zzZP() ? com_google_android_gms_internal_zzbpz.zzc(com_google_android_gms_internal_zzbre.zzaaw()) : com_google_android_gms_internal_zzbpz.zzd(com_google_android_gms_internal_zzbre.zzaav().zzWH()), this.zzciC.zzaai()), com_google_android_gms_internal_zzbrg);
        } else {
            zzbrq zzYR = com_google_android_gms_internal_zzbph.zzYR();
            zzbsc zza = com_google_android_gms_internal_zzbpz.zza(zzYR, com_google_android_gms_internal_zzbre.zzaav());
            if (zza == null && com_google_android_gms_internal_zzbre.zzaav().zzf(zzYR)) {
                zza = zzZR.zzWH().zzm(zzYR);
            }
            if (zza != null) {
                zzZR = this.zzciC.zza(zzZR, zzYR, zza, com_google_android_gms_internal_zzbph.zzYS(), com_google_android_gms_internal_zzbrf_zzb, com_google_android_gms_internal_zzbrg);
            } else if (zza == null && com_google_android_gms_internal_zzbre.zzaat().zzWH().zzk(zzYR)) {
                zzZR = this.zzciC.zza(zzZR, zzYR, zzbrv.zzaaY(), com_google_android_gms_internal_zzbph.zzYS(), com_google_android_gms_internal_zzbrf_zzb, com_google_android_gms_internal_zzbrg);
            }
            if (zzZR.zzWH().isEmpty() && com_google_android_gms_internal_zzbre.zzaav().zzZP()) {
                zzbsc zzc = com_google_android_gms_internal_zzbpz.zzc(com_google_android_gms_internal_zzbre.zzaaw());
                if (zzc.zzaaM()) {
                    zzZR = this.zzciC.zza(zzZR, zzbrx.zza(zzc, this.zzciC.zzaai()), com_google_android_gms_internal_zzbrg);
                }
            }
        }
        boolean z = com_google_android_gms_internal_zzbre.zzaav().zzZP() || com_google_android_gms_internal_zzbpz.zzv(zzbph.zzYO()) != null;
        return com_google_android_gms_internal_zzbre.zza(zzZR, z, this.zzciC.zzaaz());
    }

    public zza zza(zzbre com_google_android_gms_internal_zzbre, zzbqe com_google_android_gms_internal_zzbqe, zzbpz com_google_android_gms_internal_zzbpz, zzbsc com_google_android_gms_internal_zzbsc) {
        zzbre zza;
        zzbrg com_google_android_gms_internal_zzbrg = new zzbrg();
        boolean z;
        switch (com_google_android_gms_internal_zzbqe.zzZy()) {
            case Overwrite:
                zzbqg com_google_android_gms_internal_zzbqg = (zzbqg) com_google_android_gms_internal_zzbqe;
                if (com_google_android_gms_internal_zzbqg.zzZx().zzZz()) {
                    zza = zza(com_google_android_gms_internal_zzbre, com_google_android_gms_internal_zzbqg.zzWL(), com_google_android_gms_internal_zzbqg.zzZD(), com_google_android_gms_internal_zzbpz, com_google_android_gms_internal_zzbsc, com_google_android_gms_internal_zzbrg);
                    break;
                } else if ($assertionsDisabled || com_google_android_gms_internal_zzbqg.zzZx().zzZA()) {
                    z = com_google_android_gms_internal_zzbqg.zzZx().zzZB() || (com_google_android_gms_internal_zzbre.zzaav().zzZQ() && !com_google_android_gms_internal_zzbqg.zzWL().isEmpty());
                    zza = zza(com_google_android_gms_internal_zzbre, com_google_android_gms_internal_zzbqg.zzWL(), com_google_android_gms_internal_zzbqg.zzZD(), com_google_android_gms_internal_zzbpz, com_google_android_gms_internal_zzbsc, z, com_google_android_gms_internal_zzbrg);
                    break;
                } else {
                    throw new AssertionError();
                }
                break;
            case Merge:
                zzbqd com_google_android_gms_internal_zzbqd = (zzbqd) com_google_android_gms_internal_zzbqe;
                if (com_google_android_gms_internal_zzbqd.zzZx().zzZz()) {
                    zza = zza(com_google_android_gms_internal_zzbre, com_google_android_gms_internal_zzbqd.zzWL(), com_google_android_gms_internal_zzbqd.zzZw(), com_google_android_gms_internal_zzbpz, com_google_android_gms_internal_zzbsc, com_google_android_gms_internal_zzbrg);
                    break;
                } else if ($assertionsDisabled || com_google_android_gms_internal_zzbqd.zzZx().zzZA()) {
                    z = com_google_android_gms_internal_zzbqd.zzZx().zzZB() || com_google_android_gms_internal_zzbre.zzaav().zzZQ();
                    zza = zza(com_google_android_gms_internal_zzbre, com_google_android_gms_internal_zzbqd.zzWL(), com_google_android_gms_internal_zzbqd.zzZw(), com_google_android_gms_internal_zzbpz, com_google_android_gms_internal_zzbsc, z, com_google_android_gms_internal_zzbrg);
                    break;
                } else {
                    throw new AssertionError();
                }
                break;
            case AckUserWrite:
                zzbqb com_google_android_gms_internal_zzbqb = (zzbqb) com_google_android_gms_internal_zzbqe;
                if (!com_google_android_gms_internal_zzbqb.zzZv()) {
                    zza = zza(com_google_android_gms_internal_zzbre, com_google_android_gms_internal_zzbqb.zzWL(), com_google_android_gms_internal_zzbqb.zzZu(), com_google_android_gms_internal_zzbpz, com_google_android_gms_internal_zzbsc, com_google_android_gms_internal_zzbrg);
                    break;
                }
                zza = zza(com_google_android_gms_internal_zzbre, com_google_android_gms_internal_zzbqb.zzWL(), com_google_android_gms_internal_zzbpz, com_google_android_gms_internal_zzbsc, com_google_android_gms_internal_zzbrg);
                break;
            case ListenComplete:
                zza = zzb(com_google_android_gms_internal_zzbre, com_google_android_gms_internal_zzbqe.zzWL(), com_google_android_gms_internal_zzbpz, com_google_android_gms_internal_zzbsc, com_google_android_gms_internal_zzbrg);
                break;
            default:
                String valueOf = String.valueOf(com_google_android_gms_internal_zzbqe.zzZy());
                throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 19).append("Unknown operation: ").append(valueOf).toString());
        }
        List arrayList = new ArrayList(com_google_android_gms_internal_zzbrg.zzaax());
        zza(com_google_android_gms_internal_zzbre, zza, arrayList);
        return new zza(zza, arrayList);
    }
}
