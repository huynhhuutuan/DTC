package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzai;
import com.google.android.gms.internal.zzaj.zzi;
import com.google.android.gms.internal.zzbjf;
import com.google.android.gms.internal.zzbjf.zze;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class zzcx {
    private static final zzce<com.google.android.gms.internal.zzak.zza> zzbHG = new zzce(zzdl.zzRQ(), true);
    private final DataLayer zzbEZ;
    private final com.google.android.gms.internal.zzbjf.zzc zzbHH;
    private final zzaj zzbHI;
    private final Map<String, zzam> zzbHJ;
    private final Map<String, zzam> zzbHK;
    private final Map<String, zzam> zzbHL;
    private final zzl<com.google.android.gms.internal.zzbjf.zza, zzce<com.google.android.gms.internal.zzak.zza>> zzbHM;
    private final zzl<String, zzb> zzbHN;
    private final Set<zze> zzbHO;
    private final Map<String, zzc> zzbHP;
    private volatile String zzbHQ;
    private int zzbHR;

    interface zza {
        void zza(zze com_google_android_gms_internal_zzbjf_zze, Set<com.google.android.gms.internal.zzbjf.zza> set, Set<com.google.android.gms.internal.zzbjf.zza> set2, zzcs com_google_android_gms_tagmanager_zzcs);
    }

    private static class zzb {
        private zzce<com.google.android.gms.internal.zzak.zza> zzbHW;
        private com.google.android.gms.internal.zzak.zza zzbHX;

        public zzb(zzce<com.google.android.gms.internal.zzak.zza> com_google_android_gms_tagmanager_zzce_com_google_android_gms_internal_zzak_zza, com.google.android.gms.internal.zzak.zza com_google_android_gms_internal_zzak_zza) {
            this.zzbHW = com_google_android_gms_tagmanager_zzce_com_google_android_gms_internal_zzak_zza;
            this.zzbHX = com_google_android_gms_internal_zzak_zza;
        }

        public int getSize() {
            return (this.zzbHX == null ? 0 : this.zzbHX.zzaeR()) + ((com.google.android.gms.internal.zzak.zza) this.zzbHW.getObject()).zzaeR();
        }

        public zzce<com.google.android.gms.internal.zzak.zza> zzRp() {
            return this.zzbHW;
        }

        public com.google.android.gms.internal.zzak.zza zzRq() {
            return this.zzbHX;
        }
    }

    private static class zzc {
        private final Set<zze> zzbHO = new HashSet();
        private final Map<zze, List<com.google.android.gms.internal.zzbjf.zza>> zzbHY = new HashMap();
        private final Map<zze, List<com.google.android.gms.internal.zzbjf.zza>> zzbHZ = new HashMap();
        private final Map<zze, List<String>> zzbIa = new HashMap();
        private final Map<zze, List<String>> zzbIb = new HashMap();
        private com.google.android.gms.internal.zzbjf.zza zzbIc;

        public Set<zze> zzRr() {
            return this.zzbHO;
        }

        public Map<zze, List<com.google.android.gms.internal.zzbjf.zza>> zzRs() {
            return this.zzbHY;
        }

        public Map<zze, List<String>> zzRt() {
            return this.zzbIa;
        }

        public Map<zze, List<String>> zzRu() {
            return this.zzbIb;
        }

        public Map<zze, List<com.google.android.gms.internal.zzbjf.zza>> zzRv() {
            return this.zzbHZ;
        }

        public com.google.android.gms.internal.zzbjf.zza zzRw() {
            return this.zzbIc;
        }

        public void zza(zze com_google_android_gms_internal_zzbjf_zze) {
            this.zzbHO.add(com_google_android_gms_internal_zzbjf_zze);
        }

        public void zza(zze com_google_android_gms_internal_zzbjf_zze, com.google.android.gms.internal.zzbjf.zza com_google_android_gms_internal_zzbjf_zza) {
            List list = (List) this.zzbHY.get(com_google_android_gms_internal_zzbjf_zze);
            if (list == null) {
                list = new ArrayList();
                this.zzbHY.put(com_google_android_gms_internal_zzbjf_zze, list);
            }
            list.add(com_google_android_gms_internal_zzbjf_zza);
        }

        public void zza(zze com_google_android_gms_internal_zzbjf_zze, String str) {
            List list = (List) this.zzbIa.get(com_google_android_gms_internal_zzbjf_zze);
            if (list == null) {
                list = new ArrayList();
                this.zzbIa.put(com_google_android_gms_internal_zzbjf_zze, list);
            }
            list.add(str);
        }

        public void zzb(com.google.android.gms.internal.zzbjf.zza com_google_android_gms_internal_zzbjf_zza) {
            this.zzbIc = com_google_android_gms_internal_zzbjf_zza;
        }

        public void zzb(zze com_google_android_gms_internal_zzbjf_zze, com.google.android.gms.internal.zzbjf.zza com_google_android_gms_internal_zzbjf_zza) {
            List list = (List) this.zzbHZ.get(com_google_android_gms_internal_zzbjf_zze);
            if (list == null) {
                list = new ArrayList();
                this.zzbHZ.put(com_google_android_gms_internal_zzbjf_zze, list);
            }
            list.add(com_google_android_gms_internal_zzbjf_zza);
        }

        public void zzb(zze com_google_android_gms_internal_zzbjf_zze, String str) {
            List list = (List) this.zzbIb.get(com_google_android_gms_internal_zzbjf_zze);
            if (list == null) {
                list = new ArrayList();
                this.zzbIb.put(com_google_android_gms_internal_zzbjf_zze, list);
            }
            list.add(str);
        }
    }

    class C11381 implements com.google.android.gms.tagmanager.zzm.zza<com.google.android.gms.internal.zzbjf.zza, zzce<com.google.android.gms.internal.zzak.zza>> {
        C11381(zzcx com_google_android_gms_tagmanager_zzcx) {
        }

        public /* synthetic */ int sizeOf(Object obj, Object obj2) {
            return zza((com.google.android.gms.internal.zzbjf.zza) obj, (zzce) obj2);
        }

        public int zza(com.google.android.gms.internal.zzbjf.zza com_google_android_gms_internal_zzbjf_zza, zzce<com.google.android.gms.internal.zzak.zza> com_google_android_gms_tagmanager_zzce_com_google_android_gms_internal_zzak_zza) {
            return ((com.google.android.gms.internal.zzak.zza) com_google_android_gms_tagmanager_zzce_com_google_android_gms_internal_zzak_zza.getObject()).zzaeR();
        }
    }

    class C11392 implements com.google.android.gms.tagmanager.zzm.zza<String, zzb> {
        C11392(zzcx com_google_android_gms_tagmanager_zzcx) {
        }

        public /* synthetic */ int sizeOf(Object obj, Object obj2) {
            return zza((String) obj, (zzb) obj2);
        }

        public int zza(String str, zzb com_google_android_gms_tagmanager_zzcx_zzb) {
            return str.length() + com_google_android_gms_tagmanager_zzcx_zzb.getSize();
        }
    }

    class C11414 implements zza {
        C11414(zzcx com_google_android_gms_tagmanager_zzcx) {
        }

        public void zza(zze com_google_android_gms_internal_zzbjf_zze, Set<com.google.android.gms.internal.zzbjf.zza> set, Set<com.google.android.gms.internal.zzbjf.zza> set2, zzcs com_google_android_gms_tagmanager_zzcs) {
            set.addAll(com_google_android_gms_internal_zzbjf_zze.zzSZ());
            set2.addAll(com_google_android_gms_internal_zzbjf_zze.zzTa());
            com_google_android_gms_tagmanager_zzcs.zzQU();
            com_google_android_gms_tagmanager_zzcs.zzQV();
        }
    }

    public zzcx(Context context, com.google.android.gms.internal.zzbjf.zzc com_google_android_gms_internal_zzbjf_zzc, DataLayer dataLayer, com.google.android.gms.tagmanager.zzu.zza com_google_android_gms_tagmanager_zzu_zza, com.google.android.gms.tagmanager.zzu.zza com_google_android_gms_tagmanager_zzu_zza2, zzaj com_google_android_gms_tagmanager_zzaj) {
        if (com_google_android_gms_internal_zzbjf_zzc == null) {
            throw new NullPointerException("resource cannot be null");
        }
        this.zzbHH = com_google_android_gms_internal_zzbjf_zzc;
        this.zzbHO = new HashSet(com_google_android_gms_internal_zzbjf_zzc.zzST());
        this.zzbEZ = dataLayer;
        this.zzbHI = com_google_android_gms_tagmanager_zzaj;
        this.zzbHM = new zzm().zza(1048576, new C11381(this));
        this.zzbHN = new zzm().zza(1048576, new C11392(this));
        this.zzbHJ = new HashMap();
        zzb(new zzj(context));
        zzb(new zzu(com_google_android_gms_tagmanager_zzu_zza2));
        zzb(new zzy(dataLayer));
        zzb(new zzdm(context, dataLayer));
        this.zzbHK = new HashMap();
        zzc(new zzs());
        zzc(new zzag());
        zzc(new zzah());
        zzc(new zzao());
        zzc(new zzap());
        zzc(new zzbk());
        zzc(new zzbl());
        zzc(new zzcn());
        zzc(new zzdf());
        this.zzbHL = new HashMap();
        zza(new zzb(context));
        zza(new zzc(context));
        zza(new zze(context));
        zza(new zzf(context));
        zza(new zzg(context));
        zza(new zzh(context));
        zza(new zzi(context));
        zza(new zzn());
        zza(new zzr(this.zzbHH.getVersion()));
        zza(new zzu(com_google_android_gms_tagmanager_zzu_zza));
        zza(new zzw(dataLayer));
        zza(new zzab(context));
        zza(new zzac());
        zza(new zzaf());
        zza(new zzak(this));
        zza(new zzaq());
        zza(new zzar());
        zza(new zzbe(context));
        zza(new zzbg());
        zza(new zzbj());
        zza(new zzbq());
        zza(new zzbs(context));
        zza(new zzcf());
        zza(new zzch());
        zza(new zzck());
        zza(new zzcm());
        zza(new zzco(context));
        zza(new zzcy());
        zza(new zzcz());
        zza(new zzdh());
        zza(new zzdn());
        this.zzbHP = new HashMap();
        for (zze com_google_android_gms_internal_zzbjf_zze : this.zzbHO) {
            int i;
            for (i = 0; i < com_google_android_gms_internal_zzbjf_zze.zzTB().size(); i++) {
                com.google.android.gms.internal.zzbjf.zza com_google_android_gms_internal_zzbjf_zza = (com.google.android.gms.internal.zzbjf.zza) com_google_android_gms_internal_zzbjf_zze.zzTB().get(i);
                zzc zzh = zzh(this.zzbHP, zza(com_google_android_gms_internal_zzbjf_zza));
                zzh.zza(com_google_android_gms_internal_zzbjf_zze);
                zzh.zza(com_google_android_gms_internal_zzbjf_zze, com_google_android_gms_internal_zzbjf_zza);
                zzh.zza(com_google_android_gms_internal_zzbjf_zze, "Unknown");
            }
            for (i = 0; i < com_google_android_gms_internal_zzbjf_zze.zzTC().size(); i++) {
                com_google_android_gms_internal_zzbjf_zza = (com.google.android.gms.internal.zzbjf.zza) com_google_android_gms_internal_zzbjf_zze.zzTC().get(i);
                zzh = zzh(this.zzbHP, zza(com_google_android_gms_internal_zzbjf_zza));
                zzh.zza(com_google_android_gms_internal_zzbjf_zze);
                zzh.zzb(com_google_android_gms_internal_zzbjf_zze, com_google_android_gms_internal_zzbjf_zza);
                zzh.zzb(com_google_android_gms_internal_zzbjf_zze, "Unknown");
            }
        }
        for (Entry entry : this.zzbHH.zzTy().entrySet()) {
            for (com.google.android.gms.internal.zzbjf.zza com_google_android_gms_internal_zzbjf_zza2 : (List) entry.getValue()) {
                if (!zzdl.zzi((com.google.android.gms.internal.zzak.zza) com_google_android_gms_internal_zzbjf_zza2.zzSV().get(zzai.NOT_DEFAULT_MACRO.toString())).booleanValue()) {
                    zzh(this.zzbHP, (String) entry.getKey()).zzb(com_google_android_gms_internal_zzbjf_zza2);
                }
            }
        }
    }

    private String zzRo() {
        if (this.zzbHR <= 1) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toString(this.zzbHR));
        for (int i = 2; i < this.zzbHR; i++) {
            stringBuilder.append(' ');
        }
        stringBuilder.append(": ");
        return stringBuilder.toString();
    }

    private zzce<com.google.android.gms.internal.zzak.zza> zza(com.google.android.gms.internal.zzak.zza com_google_android_gms_internal_zzak_zza, Set<String> set, zzdo com_google_android_gms_tagmanager_zzdo) {
        if (!com_google_android_gms_internal_zzak_zza.zzlD) {
            return new zzce(com_google_android_gms_internal_zzak_zza, true);
        }
        com.google.android.gms.internal.zzak.zza zzm;
        int i;
        zzce zza;
        String str;
        String valueOf;
        switch (com_google_android_gms_internal_zzak_zza.type) {
            case 2:
                zzm = zzbjf.zzm(com_google_android_gms_internal_zzak_zza);
                zzm.zzlu = new com.google.android.gms.internal.zzak.zza[com_google_android_gms_internal_zzak_zza.zzlu.length];
                for (i = 0; i < com_google_android_gms_internal_zzak_zza.zzlu.length; i++) {
                    zza = zza(com_google_android_gms_internal_zzak_zza.zzlu[i], (Set) set, com_google_android_gms_tagmanager_zzdo.zznC(i));
                    if (zza == zzbHG) {
                        return zzbHG;
                    }
                    zzm.zzlu[i] = (com.google.android.gms.internal.zzak.zza) zza.getObject();
                }
                return new zzce(zzm, false);
            case 3:
                zzm = zzbjf.zzm(com_google_android_gms_internal_zzak_zza);
                if (com_google_android_gms_internal_zzak_zza.zzlv.length != com_google_android_gms_internal_zzak_zza.zzlw.length) {
                    str = "Invalid serving value: ";
                    valueOf = String.valueOf(com_google_android_gms_internal_zzak_zza.toString());
                    zzbo.m11e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    return zzbHG;
                }
                zzm.zzlv = new com.google.android.gms.internal.zzak.zza[com_google_android_gms_internal_zzak_zza.zzlv.length];
                zzm.zzlw = new com.google.android.gms.internal.zzak.zza[com_google_android_gms_internal_zzak_zza.zzlv.length];
                for (i = 0; i < com_google_android_gms_internal_zzak_zza.zzlv.length; i++) {
                    zza = zza(com_google_android_gms_internal_zzak_zza.zzlv[i], (Set) set, com_google_android_gms_tagmanager_zzdo.zznD(i));
                    zzce zza2 = zza(com_google_android_gms_internal_zzak_zza.zzlw[i], (Set) set, com_google_android_gms_tagmanager_zzdo.zznE(i));
                    if (zza == zzbHG || zza2 == zzbHG) {
                        return zzbHG;
                    }
                    zzm.zzlv[i] = (com.google.android.gms.internal.zzak.zza) zza.getObject();
                    zzm.zzlw[i] = (com.google.android.gms.internal.zzak.zza) zza2.getObject();
                }
                return new zzce(zzm, false);
            case 4:
                if (set.contains(com_google_android_gms_internal_zzak_zza.zzlx)) {
                    valueOf = String.valueOf(com_google_android_gms_internal_zzak_zza.zzlx);
                    str = String.valueOf(set.toString());
                    zzbo.m11e(new StringBuilder((String.valueOf(valueOf).length() + 79) + String.valueOf(str).length()).append("Macro cycle detected.  Current macro reference: ").append(valueOf).append(".  Previous macro references: ").append(str).append(".").toString());
                    return zzbHG;
                }
                set.add(com_google_android_gms_internal_zzak_zza.zzlx);
                zzce<com.google.android.gms.internal.zzak.zza> zza3 = zzdp.zza(zza(com_google_android_gms_internal_zzak_zza.zzlx, (Set) set, com_google_android_gms_tagmanager_zzdo.zzQX()), com_google_android_gms_internal_zzak_zza.zzlC);
                set.remove(com_google_android_gms_internal_zzak_zza.zzlx);
                return zza3;
            case 7:
                zzm = zzbjf.zzm(com_google_android_gms_internal_zzak_zza);
                zzm.zzlB = new com.google.android.gms.internal.zzak.zza[com_google_android_gms_internal_zzak_zza.zzlB.length];
                for (i = 0; i < com_google_android_gms_internal_zzak_zza.zzlB.length; i++) {
                    zza = zza(com_google_android_gms_internal_zzak_zza.zzlB[i], (Set) set, com_google_android_gms_tagmanager_zzdo.zznF(i));
                    if (zza == zzbHG) {
                        return zzbHG;
                    }
                    zzm.zzlB[i] = (com.google.android.gms.internal.zzak.zza) zza.getObject();
                }
                return new zzce(zzm, false);
            default:
                zzbo.m11e("Unknown type: " + com_google_android_gms_internal_zzak_zza.type);
                return zzbHG;
        }
    }

    private zzce<com.google.android.gms.internal.zzak.zza> zza(String str, Set<String> set, zzbr com_google_android_gms_tagmanager_zzbr) {
        this.zzbHR++;
        zzb com_google_android_gms_tagmanager_zzcx_zzb = (zzb) this.zzbHN.get(str);
        if (com_google_android_gms_tagmanager_zzcx_zzb != null) {
            zza(com_google_android_gms_tagmanager_zzcx_zzb.zzRq(), (Set) set);
            this.zzbHR--;
            return com_google_android_gms_tagmanager_zzcx_zzb.zzRp();
        }
        zzc com_google_android_gms_tagmanager_zzcx_zzc = (zzc) this.zzbHP.get(str);
        if (com_google_android_gms_tagmanager_zzcx_zzc == null) {
            String valueOf = String.valueOf(zzRo());
            zzbo.m11e(new StringBuilder((String.valueOf(valueOf).length() + 15) + String.valueOf(str).length()).append(valueOf).append("Invalid macro: ").append(str).toString());
            this.zzbHR--;
            return zzbHG;
        }
        com.google.android.gms.internal.zzbjf.zza zzRw;
        zzce zza = zza(str, com_google_android_gms_tagmanager_zzcx_zzc.zzRr(), com_google_android_gms_tagmanager_zzcx_zzc.zzRs(), com_google_android_gms_tagmanager_zzcx_zzc.zzRt(), com_google_android_gms_tagmanager_zzcx_zzc.zzRv(), com_google_android_gms_tagmanager_zzcx_zzc.zzRu(), set, com_google_android_gms_tagmanager_zzbr.zzQy());
        if (((Set) zza.getObject()).isEmpty()) {
            zzRw = com_google_android_gms_tagmanager_zzcx_zzc.zzRw();
        } else {
            if (((Set) zza.getObject()).size() > 1) {
                valueOf = String.valueOf(zzRo());
                zzbo.zzbh(new StringBuilder((String.valueOf(valueOf).length() + 37) + String.valueOf(str).length()).append(valueOf).append("Multiple macros active for macroName ").append(str).toString());
            }
            zzRw = (com.google.android.gms.internal.zzbjf.zza) ((Set) zza.getObject()).iterator().next();
        }
        if (zzRw == null) {
            this.zzbHR--;
            return zzbHG;
        }
        zzce zza2 = zza(this.zzbHL, zzRw, (Set) set, com_google_android_gms_tagmanager_zzbr.zzQP());
        boolean z = zza.zzQY() && zza2.zzQY();
        zzce<com.google.android.gms.internal.zzak.zza> com_google_android_gms_tagmanager_zzce = zza2 == zzbHG ? zzbHG : new zzce((com.google.android.gms.internal.zzak.zza) zza2.getObject(), z);
        com.google.android.gms.internal.zzak.zza zzRq = zzRw.zzRq();
        if (com_google_android_gms_tagmanager_zzce.zzQY()) {
            this.zzbHN.zzh(str, new zzb(com_google_android_gms_tagmanager_zzce, zzRq));
        }
        zza(zzRq, (Set) set);
        this.zzbHR--;
        return com_google_android_gms_tagmanager_zzce;
    }

    private zzce<com.google.android.gms.internal.zzak.zza> zza(Map<String, zzam> map, com.google.android.gms.internal.zzbjf.zza com_google_android_gms_internal_zzbjf_zza, Set<String> set, zzcp com_google_android_gms_tagmanager_zzcp) {
        boolean z = true;
        com.google.android.gms.internal.zzak.zza com_google_android_gms_internal_zzak_zza = (com.google.android.gms.internal.zzak.zza) com_google_android_gms_internal_zzbjf_zza.zzSV().get(zzai.FUNCTION.toString());
        if (com_google_android_gms_internal_zzak_zza == null) {
            zzbo.m11e("No function id in properties");
            return zzbHG;
        }
        String str = com_google_android_gms_internal_zzak_zza.zzly;
        zzam com_google_android_gms_tagmanager_zzam = (zzam) map.get(str);
        if (com_google_android_gms_tagmanager_zzam == null) {
            zzbo.m11e(String.valueOf(str).concat(" has no backing implementation."));
            return zzbHG;
        }
        zzce<com.google.android.gms.internal.zzak.zza> com_google_android_gms_tagmanager_zzce_com_google_android_gms_internal_zzak_zza = (zzce) this.zzbHM.get(com_google_android_gms_internal_zzbjf_zza);
        if (com_google_android_gms_tagmanager_zzce_com_google_android_gms_internal_zzak_zza != null) {
            return com_google_android_gms_tagmanager_zzce_com_google_android_gms_internal_zzak_zza;
        }
        Map hashMap = new HashMap();
        boolean z2 = true;
        for (Entry entry : com_google_android_gms_internal_zzbjf_zza.zzSV().entrySet()) {
            zzce zza = zza((com.google.android.gms.internal.zzak.zza) entry.getValue(), (Set) set, com_google_android_gms_tagmanager_zzcp.zzhm((String) entry.getKey()).zzd((com.google.android.gms.internal.zzak.zza) entry.getValue()));
            if (zza == zzbHG) {
                return zzbHG;
            }
            boolean z3;
            if (zza.zzQY()) {
                com_google_android_gms_internal_zzbjf_zza.zza((String) entry.getKey(), (com.google.android.gms.internal.zzak.zza) zza.getObject());
                z3 = z2;
            } else {
                z3 = false;
            }
            hashMap.put((String) entry.getKey(), (com.google.android.gms.internal.zzak.zza) zza.getObject());
            z2 = z3;
        }
        if (com_google_android_gms_tagmanager_zzam.zzf(hashMap.keySet())) {
            if (!(z2 && com_google_android_gms_tagmanager_zzam.zzQa())) {
                z = false;
            }
            com_google_android_gms_tagmanager_zzce_com_google_android_gms_internal_zzak_zza = new zzce(com_google_android_gms_tagmanager_zzam.zzZ(hashMap), z);
            if (!z) {
                return com_google_android_gms_tagmanager_zzce_com_google_android_gms_internal_zzak_zza;
            }
            this.zzbHM.zzh(com_google_android_gms_internal_zzbjf_zza, com_google_android_gms_tagmanager_zzce_com_google_android_gms_internal_zzak_zza);
            return com_google_android_gms_tagmanager_zzce_com_google_android_gms_internal_zzak_zza;
        }
        String valueOf = String.valueOf(com_google_android_gms_tagmanager_zzam.zzQL());
        String valueOf2 = String.valueOf(hashMap.keySet());
        zzbo.m11e(new StringBuilder(((String.valueOf(str).length() + 43) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("Incorrect keys for function ").append(str).append(" required ").append(valueOf).append(" had ").append(valueOf2).toString());
        return zzbHG;
    }

    private zzce<Set<com.google.android.gms.internal.zzbjf.zza>> zza(Set<zze> set, Set<String> set2, zza com_google_android_gms_tagmanager_zzcx_zza, zzcw com_google_android_gms_tagmanager_zzcw) {
        Set hashSet = new HashSet();
        Collection hashSet2 = new HashSet();
        boolean z = true;
        for (zze com_google_android_gms_internal_zzbjf_zze : set) {
            zzcs zzQW = com_google_android_gms_tagmanager_zzcw.zzQW();
            zzce zza = zza(com_google_android_gms_internal_zzbjf_zze, (Set) set2, zzQW);
            if (((Boolean) zza.getObject()).booleanValue()) {
                com_google_android_gms_tagmanager_zzcx_zza.zza(com_google_android_gms_internal_zzbjf_zze, hashSet, hashSet2, zzQW);
            }
            boolean z2 = z && zza.zzQY();
            z = z2;
        }
        hashSet.removeAll(hashSet2);
        return new zzce(hashSet, z);
    }

    private static String zza(com.google.android.gms.internal.zzbjf.zza com_google_android_gms_internal_zzbjf_zza) {
        return zzdl.zze((com.google.android.gms.internal.zzak.zza) com_google_android_gms_internal_zzbjf_zza.zzSV().get(zzai.INSTANCE_NAME.toString()));
    }

    private void zza(com.google.android.gms.internal.zzak.zza com_google_android_gms_internal_zzak_zza, Set<String> set) {
        if (com_google_android_gms_internal_zzak_zza != null) {
            zzce zza = zza(com_google_android_gms_internal_zzak_zza, (Set) set, new zzcc());
            if (zza != zzbHG) {
                Object zzj = zzdl.zzj((com.google.android.gms.internal.zzak.zza) zza.getObject());
                if (zzj instanceof Map) {
                    this.zzbEZ.push((Map) zzj);
                } else if (zzj instanceof List) {
                    for (Object zzj2 : (List) zzj2) {
                        if (zzj2 instanceof Map) {
                            this.zzbEZ.push((Map) zzj2);
                        } else {
                            zzbo.zzbh("pushAfterEvaluate: value not a Map");
                        }
                    }
                } else {
                    zzbo.zzbh("pushAfterEvaluate: value not a Map or List");
                }
            }
        }
    }

    private static void zza(Map<String, zzam> map, zzam com_google_android_gms_tagmanager_zzam) {
        if (map.containsKey(com_google_android_gms_tagmanager_zzam.zzQK())) {
            String str = "Duplicate function type name: ";
            String valueOf = String.valueOf(com_google_android_gms_tagmanager_zzam.zzQK());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        map.put(com_google_android_gms_tagmanager_zzam.zzQK(), com_google_android_gms_tagmanager_zzam);
    }

    private static zzc zzh(Map<String, zzc> map, String str) {
        zzc com_google_android_gms_tagmanager_zzcx_zzc = (zzc) map.get(str);
        if (com_google_android_gms_tagmanager_zzcx_zzc != null) {
            return com_google_android_gms_tagmanager_zzcx_zzc;
        }
        com_google_android_gms_tagmanager_zzcx_zzc = new zzc();
        map.put(str, com_google_android_gms_tagmanager_zzcx_zzc);
        return com_google_android_gms_tagmanager_zzcx_zzc;
    }

    public synchronized void zzQ(List<zzi> list) {
        for (zzi com_google_android_gms_internal_zzaj_zzi : list) {
            if (com_google_android_gms_internal_zzaj_zzi.name == null || !com_google_android_gms_internal_zzaj_zzi.name.startsWith("gaExperiment:")) {
                String valueOf = String.valueOf(com_google_android_gms_internal_zzaj_zzi);
                zzbo.m12v(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Ignored supplemental: ").append(valueOf).toString());
            } else {
                zzal.zza(this.zzbEZ, com_google_android_gms_internal_zzaj_zzi);
            }
        }
    }

    synchronized String zzRn() {
        return this.zzbHQ;
    }

    zzce<Boolean> zza(com.google.android.gms.internal.zzbjf.zza com_google_android_gms_internal_zzbjf_zza, Set<String> set, zzcp com_google_android_gms_tagmanager_zzcp) {
        zzce zza = zza(this.zzbHK, com_google_android_gms_internal_zzbjf_zza, (Set) set, com_google_android_gms_tagmanager_zzcp);
        Boolean zzi = zzdl.zzi((com.google.android.gms.internal.zzak.zza) zza.getObject());
        zzdl.zzR(zzi);
        return new zzce(zzi, zza.zzQY());
    }

    zzce<Boolean> zza(zze com_google_android_gms_internal_zzbjf_zze, Set<String> set, zzcs com_google_android_gms_tagmanager_zzcs) {
        boolean z = true;
        for (com.google.android.gms.internal.zzbjf.zza zza : com_google_android_gms_internal_zzbjf_zze.zzSY()) {
            zzce zza2 = zza(zza, (Set) set, com_google_android_gms_tagmanager_zzcs.zzQQ());
            if (((Boolean) zza2.getObject()).booleanValue()) {
                zzdl.zzR(Boolean.valueOf(false));
                return new zzce(Boolean.valueOf(false), zza2.zzQY());
            }
            boolean z2 = z && zza2.zzQY();
            z = z2;
        }
        for (com.google.android.gms.internal.zzbjf.zza zza3 : com_google_android_gms_internal_zzbjf_zze.zzSX()) {
            zza2 = zza(zza3, (Set) set, com_google_android_gms_tagmanager_zzcs.zzQR());
            if (((Boolean) zza2.getObject()).booleanValue()) {
                z = z && zza2.zzQY();
            } else {
                zzdl.zzR(Boolean.valueOf(false));
                return new zzce(Boolean.valueOf(false), zza2.zzQY());
            }
        }
        zzdl.zzR(Boolean.valueOf(true));
        return new zzce(Boolean.valueOf(true), z);
    }

    zzce<Set<com.google.android.gms.internal.zzbjf.zza>> zza(String str, Set<zze> set, Map<zze, List<com.google.android.gms.internal.zzbjf.zza>> map, Map<zze, List<String>> map2, Map<zze, List<com.google.android.gms.internal.zzbjf.zza>> map3, Map<zze, List<String>> map4, Set<String> set2, zzcw com_google_android_gms_tagmanager_zzcw) {
        final Map<zze, List<com.google.android.gms.internal.zzbjf.zza>> map5 = map;
        final Map<zze, List<String>> map6 = map2;
        final Map<zze, List<com.google.android.gms.internal.zzbjf.zza>> map7 = map3;
        final Map<zze, List<String>> map8 = map4;
        return zza((Set) set, (Set) set2, new zza(this) {
            public void zza(zze com_google_android_gms_internal_zzbjf_zze, Set<com.google.android.gms.internal.zzbjf.zza> set, Set<com.google.android.gms.internal.zzbjf.zza> set2, zzcs com_google_android_gms_tagmanager_zzcs) {
                List list = (List) map5.get(com_google_android_gms_internal_zzbjf_zze);
                map6.get(com_google_android_gms_internal_zzbjf_zze);
                if (list != null) {
                    set.addAll(list);
                    com_google_android_gms_tagmanager_zzcs.zzQS();
                }
                list = (List) map7.get(com_google_android_gms_internal_zzbjf_zze);
                map8.get(com_google_android_gms_internal_zzbjf_zze);
                if (list != null) {
                    set2.addAll(list);
                    com_google_android_gms_tagmanager_zzcs.zzQT();
                }
            }
        }, com_google_android_gms_tagmanager_zzcw);
    }

    zzce<Set<com.google.android.gms.internal.zzbjf.zza>> zza(Set<zze> set, zzcw com_google_android_gms_tagmanager_zzcw) {
        return zza((Set) set, new HashSet(), new C11414(this), com_google_android_gms_tagmanager_zzcw);
    }

    void zza(zzam com_google_android_gms_tagmanager_zzam) {
        zza(this.zzbHL, com_google_android_gms_tagmanager_zzam);
    }

    void zzb(zzam com_google_android_gms_tagmanager_zzam) {
        zza(this.zzbHJ, com_google_android_gms_tagmanager_zzam);
    }

    void zzc(zzam com_google_android_gms_tagmanager_zzam) {
        zza(this.zzbHK, com_google_android_gms_tagmanager_zzam);
    }

    public synchronized void zzgU(String str) {
        zzhr(str);
        zzv zzQJ = this.zzbHI.zzhh(str).zzQJ();
        for (com.google.android.gms.internal.zzbjf.zza zza : (Set) zza(this.zzbHO, zzQJ.zzQy()).getObject()) {
            zza(this.zzbHJ, zza, new HashSet(), zzQJ.zzQx());
        }
        zzhr(null);
    }

    public zzce<com.google.android.gms.internal.zzak.zza> zzhq(String str) {
        this.zzbHR = 0;
        return zza(str, new HashSet(), this.zzbHI.zzhg(str).zzQI());
    }

    synchronized void zzhr(String str) {
        this.zzbHQ = str;
    }
}
