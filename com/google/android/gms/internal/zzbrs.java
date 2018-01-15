package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class zzbrs {
    private final List<zzbph> zzcbt;
    private final List<String> zzcbu;

    static class zza {
        private StringBuilder zzcjh = null;
        private Stack<zzbrq> zzcji = new Stack();
        private int zzcjj = -1;
        private int zzcjk;
        private boolean zzcjl = true;
        private final List<zzbph> zzcjm = new ArrayList();
        private final List<String> zzcjn = new ArrayList();
        private final zzc zzcjo;

        public zza(zzc com_google_android_gms_internal_zzbrs_zzc) {
            this.zzcjo = com_google_android_gms_internal_zzbrs_zzc;
        }

        private void zza(StringBuilder stringBuilder, zzbrq com_google_android_gms_internal_zzbrq) {
            stringBuilder.append(zzbte.zzji(com_google_android_gms_internal_zzbrq.asString()));
        }

        private void zzaaU() {
            if (!zzaaR()) {
                this.zzcjh = new StringBuilder();
                this.zzcjh.append("(");
                Iterator it = zzqD(this.zzcjk).iterator();
                while (it.hasNext()) {
                    zza(this.zzcjh, (zzbrq) it.next());
                    this.zzcjh.append(":(");
                }
                this.zzcjl = false;
            }
        }

        private void zzaaV() {
            this.zzcjk--;
            if (zzaaR()) {
                this.zzcjh.append(")");
            }
            this.zzcjl = true;
        }

        private void zzaaW() {
            zzbte.zzb(this.zzcjk == 0, "Can't finish hashing in the middle processing a child");
            if (zzaaR()) {
                zzaaX();
            }
            this.zzcjn.add("");
        }

        private void zzaaX() {
            zzbte.zzb(zzaaR(), "Can't end range without starting a range!");
            for (int i = 0; i < this.zzcjk; i++) {
                this.zzcjh.append(")");
            }
            this.zzcjh.append(")");
            zzbph zzqD = zzqD(this.zzcjj);
            this.zzcjn.add(zzbte.zzjh(this.zzcjh.toString()));
            this.zzcjm.add(zzqD);
            this.zzcjh = null;
        }

        private void zzb(zzbrz<?> com_google_android_gms_internal_zzbrz_) {
            zzaaU();
            this.zzcjj = this.zzcjk;
            this.zzcjh.append(com_google_android_gms_internal_zzbrz_.zza(com.google.android.gms.internal.zzbsc.zza.V2));
            this.zzcjl = true;
            if (this.zzcjo.zze(this)) {
                zzaaX();
            }
        }

        private void zzn(zzbrq com_google_android_gms_internal_zzbrq) {
            zzaaU();
            if (this.zzcjl) {
                this.zzcjh.append(",");
            }
            zza(this.zzcjh, com_google_android_gms_internal_zzbrq);
            this.zzcjh.append(":(");
            if (this.zzcjk == this.zzcji.size()) {
                this.zzcji.add(com_google_android_gms_internal_zzbrq);
            } else {
                this.zzcji.set(this.zzcjk, com_google_android_gms_internal_zzbrq);
            }
            this.zzcjk++;
            this.zzcjl = false;
        }

        private zzbph zzqD(int i) {
            zzbrq[] com_google_android_gms_internal_zzbrqArr = new zzbrq[i];
            for (int i2 = 0; i2 < i; i2++) {
                com_google_android_gms_internal_zzbrqArr[i2] = (zzbrq) this.zzcji.get(i2);
            }
            return new zzbph(com_google_android_gms_internal_zzbrqArr);
        }

        public boolean zzaaR() {
            return this.zzcjh != null;
        }

        public int zzaaS() {
            return this.zzcjh.length();
        }

        public zzbph zzaaT() {
            return zzqD(this.zzcjk);
        }
    }

    public interface zzc {
        boolean zze(zza com_google_android_gms_internal_zzbrs_zza);
    }

    private static class zzb implements zzc {
        private final long zzcjp;

        public zzb(zzbsc com_google_android_gms_internal_zzbsc) {
            this.zzcjp = Math.max(512, (long) Math.sqrt((double) (zzbsz.zzt(com_google_android_gms_internal_zzbsc) * 100)));
        }

        public boolean zze(zza com_google_android_gms_internal_zzbrs_zza) {
            return ((long) com_google_android_gms_internal_zzbrs_zza.zzaaS()) > this.zzcjp && (com_google_android_gms_internal_zzbrs_zza.zzaaT().isEmpty() || !com_google_android_gms_internal_zzbrs_zza.zzaaT().zzYU().equals(zzbrq.zzaaH()));
        }
    }

    class C11991 extends com.google.android.gms.internal.zzbrr.zza {
        final /* synthetic */ zza zzcjg;

        C11991(zza com_google_android_gms_internal_zzbrs_zza) {
            this.zzcjg = com_google_android_gms_internal_zzbrs_zza;
        }

        public void zzb(zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc) {
            this.zzcjg.zzn(com_google_android_gms_internal_zzbrq);
            zzbrs.zza(com_google_android_gms_internal_zzbsc, this.zzcjg);
            this.zzcjg.zzaaV();
        }
    }

    private zzbrs(List<zzbph> list, List<String> list2) {
        if (list.size() != list2.size() - 1) {
            throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
        }
        this.zzcbt = list;
        this.zzcbu = list2;
    }

    public static zzbrs zza(zzbsc com_google_android_gms_internal_zzbsc, zzc com_google_android_gms_internal_zzbrs_zzc) {
        if (com_google_android_gms_internal_zzbsc.isEmpty()) {
            return new zzbrs(Collections.emptyList(), Collections.singletonList(""));
        }
        zza com_google_android_gms_internal_zzbrs_zza = new zza(com_google_android_gms_internal_zzbrs_zzc);
        zza(com_google_android_gms_internal_zzbsc, com_google_android_gms_internal_zzbrs_zza);
        com_google_android_gms_internal_zzbrs_zza.zzaaW();
        return new zzbrs(com_google_android_gms_internal_zzbrs_zza.zzcjm, com_google_android_gms_internal_zzbrs_zza.zzcjn);
    }

    private static void zza(zzbsc com_google_android_gms_internal_zzbsc, zza com_google_android_gms_internal_zzbrs_zza) {
        if (com_google_android_gms_internal_zzbsc.zzaaM()) {
            com_google_android_gms_internal_zzbrs_zza.zzb((zzbrz) com_google_android_gms_internal_zzbsc);
        } else if (com_google_android_gms_internal_zzbsc.isEmpty()) {
            throw new IllegalArgumentException("Can't calculate hash on empty node!");
        } else if (com_google_android_gms_internal_zzbsc instanceof zzbrr) {
            ((zzbrr) com_google_android_gms_internal_zzbsc).zza(new C11991(com_google_android_gms_internal_zzbrs_zza), true);
        } else {
            String valueOf = String.valueOf(com_google_android_gms_internal_zzbsc);
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 33).append("Expected children node, but got: ").append(valueOf).toString());
        }
    }

    public static zzbrs zzi(zzbsc com_google_android_gms_internal_zzbsc) {
        return zza(com_google_android_gms_internal_zzbsc, new zzb(com_google_android_gms_internal_zzbsc));
    }

    public List<zzbph> zzXo() {
        return Collections.unmodifiableList(this.zzcbt);
    }

    public List<String> zzXp() {
        return Collections.unmodifiableList(this.zzcbu);
    }
}
