package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class zzbpy {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbpy.class.desiredAssertionStatus());
    private static final zzbqr<zzbpv> zzcgD = new C09882();
    private zzboy zzcgA = zzboy.zzYn();
    private List<zzbpv> zzcgB = new ArrayList();
    private Long zzcgC = Long.valueOf(-1);

    class C09882 implements zzbqr<zzbpv> {
        C09882() {
        }

        public boolean zza(zzbpv com_google_android_gms_internal_zzbpv) {
            return com_google_android_gms_internal_zzbpv.isVisible();
        }

        public /* synthetic */ boolean zzas(Object obj) {
            return zza((zzbpv) obj);
        }
    }

    private void zzZs() {
        this.zzcgA = zza(this.zzcgB, zzcgD, zzbph.zzYO());
        if (this.zzcgB.size() > 0) {
            this.zzcgC = Long.valueOf(((zzbpv) this.zzcgB.get(this.zzcgB.size() - 1)).zzZl());
        } else {
            this.zzcgC = Long.valueOf(-1);
        }
    }

    private static zzboy zza(List<zzbpv> list, zzbqr<zzbpv> com_google_android_gms_internal_zzbqr_com_google_android_gms_internal_zzbpv, zzbph com_google_android_gms_internal_zzbph) {
        zzboy zzYn = zzboy.zzYn();
        zzboy com_google_android_gms_internal_zzboy = zzYn;
        for (zzbpv com_google_android_gms_internal_zzbpv : list) {
            if (com_google_android_gms_internal_zzbqr_com_google_android_gms_internal_zzbpv.zzas(com_google_android_gms_internal_zzbpv)) {
                zzbph zzWL = com_google_android_gms_internal_zzbpv.zzWL();
                if (com_google_android_gms_internal_zzbpv.zzZo()) {
                    if (com_google_android_gms_internal_zzbph.zzi(zzWL)) {
                        zzYn = com_google_android_gms_internal_zzboy.zze(zzbph.zza(com_google_android_gms_internal_zzbph, zzWL), com_google_android_gms_internal_zzbpv.zzZm());
                    } else if (zzWL.zzi(com_google_android_gms_internal_zzbph)) {
                        zzYn = com_google_android_gms_internal_zzboy.zze(zzbph.zzYO(), com_google_android_gms_internal_zzbpv.zzZm().zzO(zzbph.zza(zzWL, com_google_android_gms_internal_zzbph)));
                    }
                    com_google_android_gms_internal_zzboy = zzYn;
                } else {
                    if (com_google_android_gms_internal_zzbph.zzi(zzWL)) {
                        zzYn = com_google_android_gms_internal_zzboy.zzb(zzbph.zza(com_google_android_gms_internal_zzbph, zzWL), com_google_android_gms_internal_zzbpv.zzZn());
                    } else if (zzWL.zzi(com_google_android_gms_internal_zzbph)) {
                        zzWL = zzbph.zza(zzWL, com_google_android_gms_internal_zzbph);
                        if (zzWL.isEmpty()) {
                            zzYn = com_google_android_gms_internal_zzboy.zzb(zzbph.zzYO(), com_google_android_gms_internal_zzbpv.zzZn());
                        } else {
                            zzbsc zzf = com_google_android_gms_internal_zzbpv.zzZn().zzf(zzWL);
                            if (zzf != null) {
                                zzYn = com_google_android_gms_internal_zzboy.zze(zzbph.zzYO(), zzf);
                            }
                        }
                    }
                    com_google_android_gms_internal_zzboy = zzYn;
                }
            }
            zzYn = com_google_android_gms_internal_zzboy;
            com_google_android_gms_internal_zzboy = zzYn;
        }
        return com_google_android_gms_internal_zzboy;
    }

    private boolean zza(zzbpv com_google_android_gms_internal_zzbpv, zzbph com_google_android_gms_internal_zzbph) {
        if (com_google_android_gms_internal_zzbpv.zzZo()) {
            return com_google_android_gms_internal_zzbpv.zzWL().zzi(com_google_android_gms_internal_zzbph);
        }
        Iterator it = com_google_android_gms_internal_zzbpv.zzZn().iterator();
        while (it.hasNext()) {
            if (com_google_android_gms_internal_zzbpv.zzWL().zzh((zzbph) ((Entry) it.next()).getKey()).zzi(com_google_android_gms_internal_zzbph)) {
                return true;
            }
        }
        return false;
    }

    public List<zzbpv> zzZr() {
        List arrayList = new ArrayList(this.zzcgB);
        this.zzcgA = zzboy.zzYn();
        this.zzcgB = new ArrayList();
        return arrayList;
    }

    public zzbsb zza(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc, zzbsb com_google_android_gms_internal_zzbsb, boolean z, zzbrw com_google_android_gms_internal_zzbrw) {
        zzbsb com_google_android_gms_internal_zzbsb2 = null;
        zzboy zzg = this.zzcgA.zzg(com_google_android_gms_internal_zzbph);
        zzbsc zzf = zzg.zzf(zzbph.zzYO());
        if (zzf == null) {
            if (com_google_android_gms_internal_zzbsc != null) {
                zzf = zzg.zzb(com_google_android_gms_internal_zzbsc);
            }
            return com_google_android_gms_internal_zzbsb2;
        }
        for (zzbsb com_google_android_gms_internal_zzbsb3 : r0) {
            zzbsb com_google_android_gms_internal_zzbsb32;
            if (com_google_android_gms_internal_zzbrw.zza(com_google_android_gms_internal_zzbsb32, com_google_android_gms_internal_zzbsb, z) <= 0 || (com_google_android_gms_internal_zzbsb2 != null && com_google_android_gms_internal_zzbrw.zza(com_google_android_gms_internal_zzbsb32, com_google_android_gms_internal_zzbsb2, z) >= 0)) {
                com_google_android_gms_internal_zzbsb32 = com_google_android_gms_internal_zzbsb2;
            }
            com_google_android_gms_internal_zzbsb2 = com_google_android_gms_internal_zzbsb32;
        }
        return com_google_android_gms_internal_zzbsb2;
    }

    public zzbsc zza(zzbph com_google_android_gms_internal_zzbph, zzbph com_google_android_gms_internal_zzbph2, zzbsc com_google_android_gms_internal_zzbsc, zzbsc com_google_android_gms_internal_zzbsc2) {
        if (!$assertionsDisabled && com_google_android_gms_internal_zzbsc == null && com_google_android_gms_internal_zzbsc2 == null) {
            throw new AssertionError("Either existingEventSnap or existingServerSnap must exist");
        }
        zzbph zzh = com_google_android_gms_internal_zzbph.zzh(com_google_android_gms_internal_zzbph2);
        if (this.zzcgA.zze(zzh)) {
            return null;
        }
        zzboy zzg = this.zzcgA.zzg(zzh);
        return zzg.isEmpty() ? com_google_android_gms_internal_zzbsc2.zzO(com_google_android_gms_internal_zzbph2) : zzg.zzb(com_google_android_gms_internal_zzbsc2.zzO(com_google_android_gms_internal_zzbph2));
    }

    public zzbsc zza(zzbph com_google_android_gms_internal_zzbph, zzbrq com_google_android_gms_internal_zzbrq, zzbqu com_google_android_gms_internal_zzbqu) {
        zzbph zza = com_google_android_gms_internal_zzbph.zza(com_google_android_gms_internal_zzbrq);
        zzbsc zzf = this.zzcgA.zzf(zza);
        return zzf != null ? zzf : com_google_android_gms_internal_zzbqu.zzf(com_google_android_gms_internal_zzbrq) ? this.zzcgA.zzg(zza).zzb(com_google_android_gms_internal_zzbqu.zzWH().zzm(com_google_android_gms_internal_zzbrq)) : null;
    }

    public zzbsc zza(final zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc, final List<Long> list, final boolean z) {
        zzboy zzg;
        if (!list.isEmpty() || z) {
            zzg = this.zzcgA.zzg(com_google_android_gms_internal_zzbph);
            if (!z && zzg.isEmpty()) {
                return com_google_android_gms_internal_zzbsc;
            }
            if (!z && com_google_android_gms_internal_zzbsc == null && !zzg.zze(zzbph.zzYO())) {
                return null;
            }
            zzg = zza(this.zzcgB, new zzbqr<zzbpv>(this) {
                public boolean zza(zzbpv com_google_android_gms_internal_zzbpv) {
                    return (com_google_android_gms_internal_zzbpv.isVisible() || z) && !list.contains(Long.valueOf(com_google_android_gms_internal_zzbpv.zzZl())) && (com_google_android_gms_internal_zzbpv.zzWL().zzi(com_google_android_gms_internal_zzbph) || com_google_android_gms_internal_zzbph.zzi(com_google_android_gms_internal_zzbpv.zzWL()));
                }

                public /* synthetic */ boolean zzas(Object obj) {
                    return zza((zzbpv) obj);
                }
            }, com_google_android_gms_internal_zzbph);
            if (com_google_android_gms_internal_zzbsc == null) {
                com_google_android_gms_internal_zzbsc = zzbrv.zzaaY();
            }
            return zzg.zzb(com_google_android_gms_internal_zzbsc);
        }
        zzbsc zzf = this.zzcgA.zzf(com_google_android_gms_internal_zzbph);
        if (zzf != null) {
            return zzf;
        }
        zzg = this.zzcgA.zzg(com_google_android_gms_internal_zzbph);
        if (zzg.isEmpty()) {
            return com_google_android_gms_internal_zzbsc;
        }
        if (com_google_android_gms_internal_zzbsc == null && !zzg.zze(zzbph.zzYO())) {
            return null;
        }
        if (com_google_android_gms_internal_zzbsc == null) {
            com_google_android_gms_internal_zzbsc = zzbrv.zzaaY();
        }
        return zzg.zzb(com_google_android_gms_internal_zzbsc);
    }

    public void zza(zzbph com_google_android_gms_internal_zzbph, zzboy com_google_android_gms_internal_zzboy, Long l) {
        if ($assertionsDisabled || l.longValue() > this.zzcgC.longValue()) {
            this.zzcgB.add(new zzbpv(l.longValue(), com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzboy));
            this.zzcgA = this.zzcgA.zzb(com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzboy);
            this.zzcgC = l;
            return;
        }
        throw new AssertionError();
    }

    public void zza(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc, Long l, boolean z) {
        if ($assertionsDisabled || l.longValue() > this.zzcgC.longValue()) {
            this.zzcgB.add(new zzbpv(l.longValue(), com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzbsc, z));
            if (z) {
                this.zzcgA = this.zzcgA.zze(com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzbsc);
            }
            this.zzcgC = l;
            return;
        }
        throw new AssertionError();
    }

    public zzbpv zzaO(long j) {
        for (zzbpv com_google_android_gms_internal_zzbpv : this.zzcgB) {
            if (com_google_android_gms_internal_zzbpv.zzZl() == j) {
                return com_google_android_gms_internal_zzbpv;
            }
        }
        return null;
    }

    public boolean zzaP(long j) {
        zzbpv com_google_android_gms_internal_zzbpv;
        zzbpv com_google_android_gms_internal_zzbpv2 = null;
        int i = 0;
        for (zzbpv com_google_android_gms_internal_zzbpv3 : this.zzcgB) {
            if (com_google_android_gms_internal_zzbpv3.zzZl() == j) {
                com_google_android_gms_internal_zzbpv2 = com_google_android_gms_internal_zzbpv3;
                break;
            }
            i++;
        }
        if ($assertionsDisabled || com_google_android_gms_internal_zzbpv2 != null) {
            this.zzcgB.remove(com_google_android_gms_internal_zzbpv2);
            boolean isVisible = com_google_android_gms_internal_zzbpv2.isVisible();
            int size = this.zzcgB.size() - 1;
            boolean z = false;
            while (isVisible && size >= 0) {
                boolean z2;
                com_google_android_gms_internal_zzbpv3 = (zzbpv) this.zzcgB.get(size);
                if (com_google_android_gms_internal_zzbpv3.isVisible()) {
                    if (size >= i && zza(com_google_android_gms_internal_zzbpv3, com_google_android_gms_internal_zzbpv2.zzWL())) {
                        z2 = z;
                        z = false;
                        size--;
                        isVisible = z;
                        z = z2;
                    } else if (com_google_android_gms_internal_zzbpv2.zzWL().zzi(com_google_android_gms_internal_zzbpv3.zzWL())) {
                        z2 = true;
                        z = isVisible;
                        size--;
                        isVisible = z;
                        z = z2;
                    }
                }
                z2 = z;
                z = isVisible;
                size--;
                isVisible = z;
                z = z2;
            }
            if (!isVisible) {
                return false;
            }
            if (z) {
                zzZs();
                return true;
            } else if (com_google_android_gms_internal_zzbpv2.zzZo()) {
                this.zzcgA = this.zzcgA.zzd(com_google_android_gms_internal_zzbpv2.zzWL());
                return true;
            } else {
                Iterator it = com_google_android_gms_internal_zzbpv2.zzZn().iterator();
                while (it.hasNext()) {
                    this.zzcgA = this.zzcgA.zzd(com_google_android_gms_internal_zzbpv2.zzWL().zzh((zzbph) ((Entry) it.next()).getKey()));
                }
                return true;
            }
        }
        throw new AssertionError("removeWrite called with nonexistent writeId");
    }

    public zzbsc zzj(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc) {
        zzbrv zzaaY = zzbrv.zzaaY();
        zzbsc<zzbsb> zzf = this.zzcgA.zzf(com_google_android_gms_internal_zzbph);
        zzbsc com_google_android_gms_internal_zzbsc2;
        if (zzf == null) {
            zzboy zzg = this.zzcgA.zzg(com_google_android_gms_internal_zzbph);
            com_google_android_gms_internal_zzbsc2 = zzaaY;
            for (zzbsb com_google_android_gms_internal_zzbsb : com_google_android_gms_internal_zzbsc) {
                com_google_android_gms_internal_zzbsc2 = com_google_android_gms_internal_zzbsc2.zze(com_google_android_gms_internal_zzbsb.zzabi(), zzg.zzg(new zzbph(com_google_android_gms_internal_zzbsb.zzabi())).zzb(com_google_android_gms_internal_zzbsb.zzWH()));
            }
            for (zzbsb com_google_android_gms_internal_zzbsb2 : zzg.zzYp()) {
                com_google_android_gms_internal_zzbsc2 = com_google_android_gms_internal_zzbsc2.zze(com_google_android_gms_internal_zzbsb2.zzabi(), com_google_android_gms_internal_zzbsb2.zzWH());
            }
            return com_google_android_gms_internal_zzbsc2;
        } else if (zzf.zzaaM()) {
            return zzaaY;
        } else {
            com_google_android_gms_internal_zzbsc2 = zzaaY;
            for (zzbsb com_google_android_gms_internal_zzbsb22 : zzf) {
                com_google_android_gms_internal_zzbsc2 = com_google_android_gms_internal_zzbsc2.zze(com_google_android_gms_internal_zzbsb22.zzabi(), com_google_android_gms_internal_zzbsb22.zzWH());
            }
            return com_google_android_gms_internal_zzbsc2;
        }
    }

    public zzbpz zzu(zzbph com_google_android_gms_internal_zzbph) {
        return new zzbpz(com_google_android_gms_internal_zzbph, this);
    }

    public zzbsc zzv(zzbph com_google_android_gms_internal_zzbph) {
        return this.zzcgA.zzf(com_google_android_gms_internal_zzbph);
    }
}
