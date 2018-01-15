package com.google.android.gms.internal;

import com.google.android.gms.internal.zzaj.zzh;
import com.google.android.gms.tagmanager.zzbo;
import com.google.android.gms.tagmanager.zzdl;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class zzbjf {

    public static class zza {
        private final com.google.android.gms.internal.zzak.zza zzbHX;
        private final Map<String, com.google.android.gms.internal.zzak.zza> zzbMB;

        private zza(Map<String, com.google.android.gms.internal.zzak.zza> map, com.google.android.gms.internal.zzak.zza com_google_android_gms_internal_zzak_zza) {
            this.zzbMB = map;
            this.zzbHX = com_google_android_gms_internal_zzak_zza;
        }

        public static zzb zzTv() {
            return new zzb();
        }

        public String toString() {
            String valueOf = String.valueOf(zzSV());
            String valueOf2 = String.valueOf(this.zzbHX);
            return new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(valueOf2).length()).append("Properties: ").append(valueOf).append(" pushAfterEvaluate: ").append(valueOf2).toString();
        }

        public com.google.android.gms.internal.zzak.zza zzRq() {
            return this.zzbHX;
        }

        public Map<String, com.google.android.gms.internal.zzak.zza> zzSV() {
            return Collections.unmodifiableMap(this.zzbMB);
        }

        public void zza(String str, com.google.android.gms.internal.zzak.zza com_google_android_gms_internal_zzak_zza) {
            this.zzbMB.put(str, com_google_android_gms_internal_zzak_zza);
        }
    }

    public static class zzb {
        private com.google.android.gms.internal.zzak.zza zzbHX;
        private final Map<String, com.google.android.gms.internal.zzak.zza> zzbMB;

        private zzb() {
            this.zzbMB = new HashMap();
        }

        public zza zzTw() {
            return new zza(this.zzbMB, this.zzbHX);
        }

        public zzb zzb(String str, com.google.android.gms.internal.zzak.zza com_google_android_gms_internal_zzak_zza) {
            this.zzbMB.put(str, com_google_android_gms_internal_zzak_zza);
            return this;
        }

        public zzb zzo(com.google.android.gms.internal.zzak.zza com_google_android_gms_internal_zzak_zza) {
            this.zzbHX = com_google_android_gms_internal_zzak_zza;
            return this;
        }
    }

    public static class zzc {
        private final String zzavB;
        private final int zzbMA;
        private final List<zze> zzbMy;
        private final Map<String, List<zza>> zzbMz;

        private zzc(List<zze> list, Map<String, List<zza>> map, String str, int i) {
            this.zzbMy = Collections.unmodifiableList(list);
            this.zzbMz = Collections.unmodifiableMap(map);
            this.zzavB = str;
            this.zzbMA = i;
        }

        public static zzd zzTx() {
            return new zzd();
        }

        public String getVersion() {
            return this.zzavB;
        }

        public String toString() {
            String valueOf = String.valueOf(zzST());
            String valueOf2 = String.valueOf(this.zzbMz);
            return new StringBuilder((String.valueOf(valueOf).length() + 17) + String.valueOf(valueOf2).length()).append("Rules: ").append(valueOf).append("  Macros: ").append(valueOf2).toString();
        }

        public List<zze> zzST() {
            return this.zzbMy;
        }

        public Map<String, List<zza>> zzTy() {
            return this.zzbMz;
        }
    }

    public static class zzd {
        private String zzavB;
        private int zzbMA;
        private final List<zze> zzbMy;
        private final Map<String, List<zza>> zzbMz;

        private zzd() {
            this.zzbMy = new ArrayList();
            this.zzbMz = new HashMap();
            this.zzavB = "";
            this.zzbMA = 0;
        }

        public zzc zzTz() {
            return new zzc(this.zzbMy, this.zzbMz, this.zzavB, this.zzbMA);
        }

        public zzd zzb(zze com_google_android_gms_internal_zzbjf_zze) {
            this.zzbMy.add(com_google_android_gms_internal_zzbjf_zze);
            return this;
        }

        public zzd zzc(zza com_google_android_gms_internal_zzbjf_zza) {
            String zze = zzdl.zze((com.google.android.gms.internal.zzak.zza) com_google_android_gms_internal_zzbjf_zza.zzSV().get(zzai.INSTANCE_NAME.toString()));
            List list = (List) this.zzbMz.get(zze);
            if (list == null) {
                list = new ArrayList();
                this.zzbMz.put(zze, list);
            }
            list.add(com_google_android_gms_internal_zzbjf_zza);
            return this;
        }

        public zzd zzih(String str) {
            this.zzavB = str;
            return this;
        }

        public zzd zznO(int i) {
            this.zzbMA = i;
            return this;
        }
    }

    public static class zze {
        private final List<zza> zzbMD;
        private final List<zza> zzbME;
        private final List<zza> zzbMF;
        private final List<zza> zzbMG;
        private final List<zza> zzbNl;
        private final List<zza> zzbNm;
        private final List<String> zzbNn;
        private final List<String> zzbNo;
        private final List<String> zzbNp;
        private final List<String> zzbNq;

        private zze(List<zza> list, List<zza> list2, List<zza> list3, List<zza> list4, List<zza> list5, List<zza> list6, List<String> list7, List<String> list8, List<String> list9, List<String> list10) {
            this.zzbMD = Collections.unmodifiableList(list);
            this.zzbME = Collections.unmodifiableList(list2);
            this.zzbMF = Collections.unmodifiableList(list3);
            this.zzbMG = Collections.unmodifiableList(list4);
            this.zzbNl = Collections.unmodifiableList(list5);
            this.zzbNm = Collections.unmodifiableList(list6);
            this.zzbNn = Collections.unmodifiableList(list7);
            this.zzbNo = Collections.unmodifiableList(list8);
            this.zzbNp = Collections.unmodifiableList(list9);
            this.zzbNq = Collections.unmodifiableList(list10);
        }

        public static zzf zzTA() {
            return new zzf();
        }

        public String toString() {
            String valueOf = String.valueOf(zzSX());
            String valueOf2 = String.valueOf(zzSY());
            String valueOf3 = String.valueOf(zzSZ());
            String valueOf4 = String.valueOf(zzTa());
            String valueOf5 = String.valueOf(zzTB());
            String valueOf6 = String.valueOf(zzTC());
            return new StringBuilder((((((String.valueOf(valueOf).length() + 102) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()).append("Positive predicates: ").append(valueOf).append("  Negative predicates: ").append(valueOf2).append("  Add tags: ").append(valueOf3).append("  Remove tags: ").append(valueOf4).append("  Add macros: ").append(valueOf5).append("  Remove macros: ").append(valueOf6).toString();
        }

        public List<zza> zzSX() {
            return this.zzbMD;
        }

        public List<zza> zzSY() {
            return this.zzbME;
        }

        public List<zza> zzSZ() {
            return this.zzbMF;
        }

        public List<zza> zzTB() {
            return this.zzbNl;
        }

        public List<zza> zzTC() {
            return this.zzbNm;
        }

        public List<zza> zzTa() {
            return this.zzbMG;
        }
    }

    public static class zzf {
        private final List<zza> zzbMD;
        private final List<zza> zzbME;
        private final List<zza> zzbMF;
        private final List<zza> zzbMG;
        private final List<zza> zzbNl;
        private final List<zza> zzbNm;
        private final List<String> zzbNn;
        private final List<String> zzbNo;
        private final List<String> zzbNp;
        private final List<String> zzbNq;

        private zzf() {
            this.zzbMD = new ArrayList();
            this.zzbME = new ArrayList();
            this.zzbMF = new ArrayList();
            this.zzbMG = new ArrayList();
            this.zzbNl = new ArrayList();
            this.zzbNm = new ArrayList();
            this.zzbNn = new ArrayList();
            this.zzbNo = new ArrayList();
            this.zzbNp = new ArrayList();
            this.zzbNq = new ArrayList();
        }

        public zze zzTD() {
            return new zze(this.zzbMD, this.zzbME, this.zzbMF, this.zzbMG, this.zzbNl, this.zzbNm, this.zzbNn, this.zzbNo, this.zzbNp, this.zzbNq);
        }

        public zzf zzd(zza com_google_android_gms_internal_zzbjf_zza) {
            this.zzbMD.add(com_google_android_gms_internal_zzbjf_zza);
            return this;
        }

        public zzf zze(zza com_google_android_gms_internal_zzbjf_zza) {
            this.zzbME.add(com_google_android_gms_internal_zzbjf_zza);
            return this;
        }

        public zzf zzf(zza com_google_android_gms_internal_zzbjf_zza) {
            this.zzbMF.add(com_google_android_gms_internal_zzbjf_zza);
            return this;
        }

        public zzf zzg(zza com_google_android_gms_internal_zzbjf_zza) {
            this.zzbMG.add(com_google_android_gms_internal_zzbjf_zza);
            return this;
        }

        public zzf zzh(zza com_google_android_gms_internal_zzbjf_zza) {
            this.zzbNl.add(com_google_android_gms_internal_zzbjf_zza);
            return this;
        }

        public zzf zzi(zza com_google_android_gms_internal_zzbjf_zza) {
            this.zzbNm.add(com_google_android_gms_internal_zzbjf_zza);
            return this;
        }

        public zzf zzii(String str) {
            this.zzbNp.add(str);
            return this;
        }

        public zzf zzij(String str) {
            this.zzbNq.add(str);
            return this;
        }

        public zzf zzik(String str) {
            this.zzbNn.add(str);
            return this;
        }

        public zzf zzil(String str) {
            this.zzbNo.add(str);
            return this;
        }
    }

    public static class zzg extends Exception {
        public zzg(String str) {
            super(str);
        }
    }

    private static com.google.android.gms.internal.zzak.zza zza(int i, com.google.android.gms.internal.zzaj.zzf com_google_android_gms_internal_zzaj_zzf, com.google.android.gms.internal.zzak.zza[] com_google_android_gms_internal_zzak_zzaArr, Set<Integer> set) throws zzg {
        int i2 = 0;
        if (set.contains(Integer.valueOf(i))) {
            String valueOf = String.valueOf(set);
            zzhS(new StringBuilder(String.valueOf(valueOf).length() + 90).append("Value cycle detected.  Current value reference: ").append(i).append(".  Previous value references: ").append(valueOf).append(".").toString());
        }
        com.google.android.gms.internal.zzak.zza com_google_android_gms_internal_zzak_zza = (com.google.android.gms.internal.zzak.zza) zza(com_google_android_gms_internal_zzaj_zzf.zzkF, i, "values");
        if (com_google_android_gms_internal_zzak_zzaArr[i] != null) {
            return com_google_android_gms_internal_zzak_zzaArr[i];
        }
        com.google.android.gms.internal.zzak.zza com_google_android_gms_internal_zzak_zza2 = null;
        set.add(Integer.valueOf(i));
        zzh zzn;
        int[] iArr;
        int length;
        int i3;
        int i4;
        switch (com_google_android_gms_internal_zzak_zza.type) {
            case 1:
            case 5:
            case 6:
            case 8:
                com_google_android_gms_internal_zzak_zza2 = com_google_android_gms_internal_zzak_zza;
                break;
            case 2:
                zzn = zzn(com_google_android_gms_internal_zzak_zza);
                com_google_android_gms_internal_zzak_zza2 = zzm(com_google_android_gms_internal_zzak_zza);
                com_google_android_gms_internal_zzak_zza2.zzlu = new com.google.android.gms.internal.zzak.zza[zzn.zzlg.length];
                iArr = zzn.zzlg;
                length = iArr.length;
                i3 = 0;
                while (i2 < length) {
                    i4 = i3 + 1;
                    com_google_android_gms_internal_zzak_zza2.zzlu[i3] = zza(iArr[i2], com_google_android_gms_internal_zzaj_zzf, com_google_android_gms_internal_zzak_zzaArr, (Set) set);
                    i2++;
                    i3 = i4;
                }
                break;
            case 3:
                com_google_android_gms_internal_zzak_zza2 = zzm(com_google_android_gms_internal_zzak_zza);
                zzh zzn2 = zzn(com_google_android_gms_internal_zzak_zza);
                if (zzn2.zzlh.length != zzn2.zzli.length) {
                    i3 = zzn2.zzlh.length;
                    zzhS("Uneven map keys (" + i3 + ") and map values (" + zzn2.zzli.length + ")");
                }
                com_google_android_gms_internal_zzak_zza2.zzlv = new com.google.android.gms.internal.zzak.zza[zzn2.zzlh.length];
                com_google_android_gms_internal_zzak_zza2.zzlw = new com.google.android.gms.internal.zzak.zza[zzn2.zzlh.length];
                int[] iArr2 = zzn2.zzlh;
                int length2 = iArr2.length;
                i3 = 0;
                i4 = 0;
                while (i3 < length2) {
                    int i5 = i4 + 1;
                    com_google_android_gms_internal_zzak_zza2.zzlv[i4] = zza(iArr2[i3], com_google_android_gms_internal_zzaj_zzf, com_google_android_gms_internal_zzak_zzaArr, (Set) set);
                    i3++;
                    i4 = i5;
                }
                iArr = zzn2.zzli;
                length = iArr.length;
                i3 = 0;
                while (i2 < length) {
                    i4 = i3 + 1;
                    com_google_android_gms_internal_zzak_zza2.zzlw[i3] = zza(iArr[i2], com_google_android_gms_internal_zzaj_zzf, com_google_android_gms_internal_zzak_zzaArr, (Set) set);
                    i2++;
                    i3 = i4;
                }
                break;
            case 4:
                com_google_android_gms_internal_zzak_zza2 = zzm(com_google_android_gms_internal_zzak_zza);
                com_google_android_gms_internal_zzak_zza2.zzlx = zzdl.zze(zza(zzn(com_google_android_gms_internal_zzak_zza).zzll, com_google_android_gms_internal_zzaj_zzf, com_google_android_gms_internal_zzak_zzaArr, (Set) set));
                break;
            case 7:
                com_google_android_gms_internal_zzak_zza2 = zzm(com_google_android_gms_internal_zzak_zza);
                zzn = zzn(com_google_android_gms_internal_zzak_zza);
                com_google_android_gms_internal_zzak_zza2.zzlB = new com.google.android.gms.internal.zzak.zza[zzn.zzlk.length];
                iArr = zzn.zzlk;
                length = iArr.length;
                i3 = 0;
                while (i2 < length) {
                    i4 = i3 + 1;
                    com_google_android_gms_internal_zzak_zza2.zzlB[i3] = zza(iArr[i2], com_google_android_gms_internal_zzaj_zzf, com_google_android_gms_internal_zzak_zzaArr, (Set) set);
                    i2++;
                    i3 = i4;
                }
                break;
        }
        if (com_google_android_gms_internal_zzak_zza2 == null) {
            valueOf = String.valueOf(com_google_android_gms_internal_zzak_zza);
            zzhS(new StringBuilder(String.valueOf(valueOf).length() + 15).append("Invalid value: ").append(valueOf).toString());
        }
        com_google_android_gms_internal_zzak_zzaArr[i] = com_google_android_gms_internal_zzak_zza2;
        set.remove(Integer.valueOf(i));
        return com_google_android_gms_internal_zzak_zza2;
    }

    private static zza zza(com.google.android.gms.internal.zzaj.zzb com_google_android_gms_internal_zzaj_zzb, com.google.android.gms.internal.zzaj.zzf com_google_android_gms_internal_zzaj_zzf, com.google.android.gms.internal.zzak.zza[] com_google_android_gms_internal_zzak_zzaArr, int i) throws zzg {
        zzb zzTv = zza.zzTv();
        for (int valueOf : com_google_android_gms_internal_zzaj_zzb.zzkq) {
            com.google.android.gms.internal.zzaj.zze com_google_android_gms_internal_zzaj_zze = (com.google.android.gms.internal.zzaj.zze) zza(com_google_android_gms_internal_zzaj_zzf.zzkG, Integer.valueOf(valueOf).intValue(), "properties");
            String str = (String) zza(com_google_android_gms_internal_zzaj_zzf.zzkE, com_google_android_gms_internal_zzaj_zze.key, "keys");
            com.google.android.gms.internal.zzak.zza com_google_android_gms_internal_zzak_zza = (com.google.android.gms.internal.zzak.zza) zza(com_google_android_gms_internal_zzak_zzaArr, com_google_android_gms_internal_zzaj_zze.value, "values");
            if (zzai.PUSH_AFTER_EVALUATE.toString().equals(str)) {
                zzTv.zzo(com_google_android_gms_internal_zzak_zza);
            } else {
                zzTv.zzb(str, com_google_android_gms_internal_zzak_zza);
            }
        }
        return zzTv.zzTw();
    }

    private static zze zza(com.google.android.gms.internal.zzaj.zzg com_google_android_gms_internal_zzaj_zzg, List<zza> list, List<zza> list2, List<zza> list3, com.google.android.gms.internal.zzaj.zzf com_google_android_gms_internal_zzaj_zzf) {
        zzf zzTA = zze.zzTA();
        for (int valueOf : com_google_android_gms_internal_zzaj_zzg.zzkU) {
            zzTA.zzd((zza) list3.get(Integer.valueOf(valueOf).intValue()));
        }
        for (int valueOf2 : com_google_android_gms_internal_zzaj_zzg.zzkV) {
            zzTA.zze((zza) list3.get(Integer.valueOf(valueOf2).intValue()));
        }
        for (int valueOf22 : com_google_android_gms_internal_zzaj_zzg.zzkW) {
            zzTA.zzf((zza) list.get(Integer.valueOf(valueOf22).intValue()));
        }
        for (int valueOf3 : com_google_android_gms_internal_zzaj_zzg.zzkY) {
            zzTA.zzii(com_google_android_gms_internal_zzaj_zzf.zzkF[Integer.valueOf(valueOf3).intValue()].string);
        }
        for (int valueOf222 : com_google_android_gms_internal_zzaj_zzg.zzkX) {
            zzTA.zzg((zza) list.get(Integer.valueOf(valueOf222).intValue()));
        }
        for (int valueOf32 : com_google_android_gms_internal_zzaj_zzg.zzkZ) {
            zzTA.zzij(com_google_android_gms_internal_zzaj_zzf.zzkF[Integer.valueOf(valueOf32).intValue()].string);
        }
        for (int valueOf2222 : com_google_android_gms_internal_zzaj_zzg.zzla) {
            zzTA.zzh((zza) list2.get(Integer.valueOf(valueOf2222).intValue()));
        }
        for (int valueOf322 : com_google_android_gms_internal_zzaj_zzg.zzlc) {
            zzTA.zzik(com_google_android_gms_internal_zzaj_zzf.zzkF[Integer.valueOf(valueOf322).intValue()].string);
        }
        for (int valueOf22222 : com_google_android_gms_internal_zzaj_zzg.zzlb) {
            zzTA.zzi((zza) list2.get(Integer.valueOf(valueOf22222).intValue()));
        }
        for (int valueOf4 : com_google_android_gms_internal_zzaj_zzg.zzld) {
            zzTA.zzil(com_google_android_gms_internal_zzaj_zzf.zzkF[Integer.valueOf(valueOf4).intValue()].string);
        }
        return zzTA.zzTD();
    }

    private static <T> T zza(T[] tArr, int i, String str) throws zzg {
        if (i < 0 || i >= tArr.length) {
            zzhS(new StringBuilder(String.valueOf(str).length() + 45).append("Index out of bounds detected: ").append(i).append(" in ").append(str).toString());
        }
        return tArr[i];
    }

    public static zzc zzb(com.google.android.gms.internal.zzaj.zzf com_google_android_gms_internal_zzaj_zzf) throws zzg {
        int i;
        int i2 = 0;
        com.google.android.gms.internal.zzak.zza[] com_google_android_gms_internal_zzak_zzaArr = new com.google.android.gms.internal.zzak.zza[com_google_android_gms_internal_zzaj_zzf.zzkF.length];
        for (i = 0; i < com_google_android_gms_internal_zzaj_zzf.zzkF.length; i++) {
            zza(i, com_google_android_gms_internal_zzaj_zzf, com_google_android_gms_internal_zzak_zzaArr, new HashSet(0));
        }
        zzd zzTx = zzc.zzTx();
        List arrayList = new ArrayList();
        for (i = 0; i < com_google_android_gms_internal_zzaj_zzf.zzkI.length; i++) {
            arrayList.add(zza(com_google_android_gms_internal_zzaj_zzf.zzkI[i], com_google_android_gms_internal_zzaj_zzf, com_google_android_gms_internal_zzak_zzaArr, i));
        }
        List arrayList2 = new ArrayList();
        for (i = 0; i < com_google_android_gms_internal_zzaj_zzf.zzkJ.length; i++) {
            arrayList2.add(zza(com_google_android_gms_internal_zzaj_zzf.zzkJ[i], com_google_android_gms_internal_zzaj_zzf, com_google_android_gms_internal_zzak_zzaArr, i));
        }
        List arrayList3 = new ArrayList();
        for (i = 0; i < com_google_android_gms_internal_zzaj_zzf.zzkH.length; i++) {
            zza zza = zza(com_google_android_gms_internal_zzaj_zzf.zzkH[i], com_google_android_gms_internal_zzaj_zzf, com_google_android_gms_internal_zzak_zzaArr, i);
            zzTx.zzc(zza);
            arrayList3.add(zza);
        }
        com.google.android.gms.internal.zzaj.zzg[] com_google_android_gms_internal_zzaj_zzgArr = com_google_android_gms_internal_zzaj_zzf.zzkK;
        int length = com_google_android_gms_internal_zzaj_zzgArr.length;
        while (i2 < length) {
            zzTx.zzb(zza(com_google_android_gms_internal_zzaj_zzgArr[i2], arrayList, arrayList3, arrayList2, com_google_android_gms_internal_zzaj_zzf));
            i2++;
        }
        zzTx.zzih(com_google_android_gms_internal_zzaj_zzf.version);
        zzTx.zznO(com_google_android_gms_internal_zzaj_zzf.zzkS);
        return zzTx.zzTz();
    }

    public static void zzc(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    private static void zzhS(String str) throws zzg {
        zzbo.m11e(str);
        throw new zzg(str);
    }

    public static com.google.android.gms.internal.zzak.zza zzm(com.google.android.gms.internal.zzak.zza com_google_android_gms_internal_zzak_zza) {
        com.google.android.gms.internal.zzak.zza com_google_android_gms_internal_zzak_zza2 = new com.google.android.gms.internal.zzak.zza();
        com_google_android_gms_internal_zzak_zza2.type = com_google_android_gms_internal_zzak_zza.type;
        com_google_android_gms_internal_zzak_zza2.zzlC = (int[]) com_google_android_gms_internal_zzak_zza.zzlC.clone();
        if (com_google_android_gms_internal_zzak_zza.zzlD) {
            com_google_android_gms_internal_zzak_zza2.zzlD = com_google_android_gms_internal_zzak_zza.zzlD;
        }
        return com_google_android_gms_internal_zzak_zza2;
    }

    private static zzh zzn(com.google.android.gms.internal.zzak.zza com_google_android_gms_internal_zzak_zza) throws zzg {
        if (((zzh) com_google_android_gms_internal_zzak_zza.zza(zzh.zzle)) == null) {
            String valueOf = String.valueOf(com_google_android_gms_internal_zzak_zza);
            zzhS(new StringBuilder(String.valueOf(valueOf).length() + 54).append("Expected a ServingValue and didn't get one. Value is: ").append(valueOf).toString());
        }
        return (zzh) com_google_android_gms_internal_zzak_zza.zza(zzh.zzle);
    }
}
