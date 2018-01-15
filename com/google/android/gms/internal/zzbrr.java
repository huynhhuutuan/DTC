package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class zzbrr implements zzbsc {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbrr.class.desiredAssertionStatus());
    public static Comparator<zzbrq> zzcja = new C05171();
    private final zzbny<zzbrq, zzbsc> zzchB;
    private final zzbsc zzcjb;
    private String zzcjc;

    class C05171 implements Comparator<zzbrq> {
        C05171() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return zza((zzbrq) obj, (zzbrq) obj2);
        }

        public int zza(zzbrq com_google_android_gms_internal_zzbrq, zzbrq com_google_android_gms_internal_zzbrq2) {
            return com_google_android_gms_internal_zzbrq.zzi(com_google_android_gms_internal_zzbrq2);
        }
    }

    private static class zzb implements Iterator<zzbsb> {
        private final Iterator<Entry<zzbrq, zzbsc>> zzcbb;

        public zzb(Iterator<Entry<zzbrq, zzbsc>> it) {
            this.zzcbb = it;
        }

        public boolean hasNext() {
            return this.zzcbb.hasNext();
        }

        public /* synthetic */ Object next() {
            return zzaaQ();
        }

        public void remove() {
            this.zzcbb.remove();
        }

        public zzbsb zzaaQ() {
            Entry entry = (Entry) this.zzcbb.next();
            return new zzbsb((zzbrq) entry.getKey(), (zzbsc) entry.getValue());
        }
    }

    public static abstract class zza extends com.google.android.gms.internal.zzbod.zzb<zzbrq, zzbsc> {
        public abstract void zzb(zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc);

        public void zzf(zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc) {
            zzb(com_google_android_gms_internal_zzbrq, com_google_android_gms_internal_zzbsc);
        }

        public /* synthetic */ void zzj(Object obj, Object obj2) {
            zzf((zzbrq) obj, (zzbsc) obj2);
        }
    }

    protected zzbrr() {
        this.zzcjc = null;
        this.zzchB = com.google.android.gms.internal.zzbny.zza.zza(zzcja);
        this.zzcjb = zzbsg.zzabk();
    }

    protected zzbrr(zzbny<zzbrq, zzbsc> com_google_android_gms_internal_zzbny_com_google_android_gms_internal_zzbrq__com_google_android_gms_internal_zzbsc, zzbsc com_google_android_gms_internal_zzbsc) {
        this.zzcjc = null;
        if (!com_google_android_gms_internal_zzbny_com_google_android_gms_internal_zzbrq__com_google_android_gms_internal_zzbsc.isEmpty() || com_google_android_gms_internal_zzbsc.isEmpty()) {
            this.zzcjb = com_google_android_gms_internal_zzbsc;
            this.zzchB = com_google_android_gms_internal_zzbny_com_google_android_gms_internal_zzbrq__com_google_android_gms_internal_zzbsc;
            return;
        }
        throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
    }

    private static void zzb(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            stringBuilder.append(" ");
        }
    }

    private void zzc(StringBuilder stringBuilder, int i) {
        if (this.zzchB.isEmpty() && this.zzcjb.isEmpty()) {
            stringBuilder.append("{ }");
            return;
        }
        stringBuilder.append("{\n");
        Iterator it = this.zzchB.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            zzb(stringBuilder, i + 2);
            stringBuilder.append(((zzbrq) entry.getKey()).asString());
            stringBuilder.append("=");
            if (entry.getValue() instanceof zzbrr) {
                ((zzbrr) entry.getValue()).zzc(stringBuilder, i + 2);
            } else {
                stringBuilder.append(((zzbsc) entry.getValue()).toString());
            }
            stringBuilder.append("\n");
        }
        if (!this.zzcjb.isEmpty()) {
            zzb(stringBuilder, i + 2);
            stringBuilder.append(".priority=");
            stringBuilder.append(this.zzcjb.toString());
            stringBuilder.append("\n");
        }
        zzb(stringBuilder, i);
        stringBuilder.append("}");
    }

    public /* synthetic */ int compareTo(Object obj) {
        return zzh((zzbsc) obj);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbrr)) {
            return false;
        }
        zzbrr com_google_android_gms_internal_zzbrr = (zzbrr) obj;
        if (!zzaaN().equals(com_google_android_gms_internal_zzbrr.zzaaN())) {
            return false;
        }
        if (this.zzchB.size() != com_google_android_gms_internal_zzbrr.zzchB.size()) {
            return false;
        }
        Iterator it = this.zzchB.iterator();
        Iterator it2 = com_google_android_gms_internal_zzbrr.zzchB.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Entry entry = (Entry) it.next();
            Entry entry2 = (Entry) it2.next();
            if (((zzbrq) entry.getKey()).equals(entry2.getKey())) {
                if (!((zzbsc) entry.getValue()).equals(entry2.getValue())) {
                }
            }
            return false;
        }
        if (!it.hasNext() && !it2.hasNext()) {
            return true;
        }
        throw new IllegalStateException("Something went wrong internally.");
    }

    public int getChildCount() {
        return this.zzchB.size();
    }

    public Object getValue() {
        return getValue(false);
    }

    public Object getValue(boolean z) {
        int i = 0;
        if (isEmpty()) {
            return null;
        }
        Map hashMap = new HashMap();
        Iterator it = this.zzchB.iterator();
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            int i5;
            int i6;
            Entry entry = (Entry) it.next();
            String asString = ((zzbrq) entry.getKey()).asString();
            hashMap.put(asString, ((zzbsc) entry.getValue()).getValue(z));
            i4++;
            if (i2 != 0) {
                if (asString.length() <= 1 || asString.charAt(0) != '0') {
                    Integer zzjj = zzbte.zzjj(asString);
                    if (zzjj == null || zzjj.intValue() < 0) {
                        i5 = 0;
                        i6 = i3;
                        i2 = i5;
                        i3 = i6;
                    } else if (zzjj.intValue() > i3) {
                        i3 = zzjj.intValue();
                        i5 = i2;
                        i6 = i3;
                        i2 = i5;
                        i3 = i6;
                    }
                } else {
                    i5 = 0;
                    i6 = i3;
                    i2 = i5;
                    i3 = i6;
                }
            }
            i5 = i2;
            i6 = i3;
            i2 = i5;
            i3 = i6;
        }
        if (z || i2 == 0 || i3 >= i4 * 2) {
            if (z && !this.zzcjb.isEmpty()) {
                hashMap.put(".priority", this.zzcjb.getValue());
            }
            return hashMap;
        }
        List arrayList = new ArrayList(i3 + 1);
        while (i <= i3) {
            arrayList.add(hashMap.get(i));
            i++;
        }
        return arrayList;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            zzbsb com_google_android_gms_internal_zzbsb = (zzbsb) it.next();
            i = com_google_android_gms_internal_zzbsb.zzWH().hashCode() + (((i * 31) + com_google_android_gms_internal_zzbsb.zzabi().hashCode()) * 17);
        }
        return i;
    }

    public boolean isEmpty() {
        return this.zzchB.isEmpty();
    }

    public Iterator<zzbsb> iterator() {
        return new zzb(this.zzchB.iterator());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        zzc(stringBuilder, 0);
        return stringBuilder.toString();
    }

    public zzbsc zzO(zzbph com_google_android_gms_internal_zzbph) {
        zzbrq zzYR = com_google_android_gms_internal_zzbph.zzYR();
        return zzYR == null ? this : zzm(zzYR).zzO(com_google_android_gms_internal_zzbph.zzYS());
    }

    public Iterator<zzbsb> zzWU() {
        return new zzb(this.zzchB.zzWU());
    }

    public String zza(com.google.android.gms.internal.zzbsc.zza com_google_android_gms_internal_zzbsc_zza) {
        if (com_google_android_gms_internal_zzbsc_zza != com.google.android.gms.internal.zzbsc.zza.V1) {
            throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (!this.zzcjb.isEmpty()) {
            stringBuilder.append("priority:");
            stringBuilder.append(this.zzcjb.zza(com.google.android.gms.internal.zzbsc.zza.V1));
            stringBuilder.append(":");
        }
        List<zzbsb> arrayList = new ArrayList();
        Iterator it = iterator();
        Object obj = null;
        while (it.hasNext()) {
            zzbsb com_google_android_gms_internal_zzbsb = (zzbsb) it.next();
            arrayList.add(com_google_android_gms_internal_zzbsb);
            Object obj2 = (obj == null && com_google_android_gms_internal_zzbsb.zzWH().zzaaN().isEmpty()) ? null : 1;
            obj = obj2;
        }
        if (obj != null) {
            Collections.sort(arrayList, zzbsf.zzabj());
        }
        for (zzbsb com_google_android_gms_internal_zzbsb2 : arrayList) {
            String zzaaL = com_google_android_gms_internal_zzbsb2.zzWH().zzaaL();
            if (!zzaaL.equals("")) {
                stringBuilder.append(":");
                stringBuilder.append(com_google_android_gms_internal_zzbsb2.zzabi().asString());
                stringBuilder.append(":");
                stringBuilder.append(zzaaL);
            }
        }
        return stringBuilder.toString();
    }

    public void zza(zza com_google_android_gms_internal_zzbrr_zza) {
        zza(com_google_android_gms_internal_zzbrr_zza, false);
    }

    public void zza(final zza com_google_android_gms_internal_zzbrr_zza, boolean z) {
        if (!z || zzaaN().isEmpty()) {
            this.zzchB.zza(com_google_android_gms_internal_zzbrr_zza);
        } else {
            this.zzchB.zza(new com.google.android.gms.internal.zzbod.zzb<zzbrq, zzbsc>(this) {
                boolean zzcjd = false;
                final /* synthetic */ zzbrr zzcjf;

                public void zzf(zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc) {
                    if (!this.zzcjd && com_google_android_gms_internal_zzbrq.zzi(zzbrq.zzaaH()) > 0) {
                        this.zzcjd = true;
                        com_google_android_gms_internal_zzbrr_zza.zzb(zzbrq.zzaaH(), this.zzcjf.zzaaN());
                    }
                    com_google_android_gms_internal_zzbrr_zza.zzb(com_google_android_gms_internal_zzbrq, com_google_android_gms_internal_zzbsc);
                }

                public /* synthetic */ void zzj(Object obj, Object obj2) {
                    zzf((zzbrq) obj, (zzbsc) obj2);
                }
            });
        }
    }

    public String zzaaL() {
        if (this.zzcjc == null) {
            String zza = zza(com.google.android.gms.internal.zzbsc.zza.V1);
            this.zzcjc = zza.isEmpty() ? "" : zzbte.zzjh(zza);
        }
        return this.zzcjc;
    }

    public boolean zzaaM() {
        return false;
    }

    public zzbsc zzaaN() {
        return this.zzcjb;
    }

    public zzbrq zzaaO() {
        return (zzbrq) this.zzchB.zzWS();
    }

    public zzbrq zzaaP() {
        return (zzbrq) this.zzchB.zzWT();
    }

    public zzbsc zze(zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc) {
        if (com_google_android_gms_internal_zzbrq.zzaaJ()) {
            return zzg(com_google_android_gms_internal_zzbsc);
        }
        zzbny com_google_android_gms_internal_zzbny = this.zzchB;
        if (com_google_android_gms_internal_zzbny.containsKey(com_google_android_gms_internal_zzbrq)) {
            com_google_android_gms_internal_zzbny = com_google_android_gms_internal_zzbny.zzag(com_google_android_gms_internal_zzbrq);
        }
        if (!com_google_android_gms_internal_zzbsc.isEmpty()) {
            com_google_android_gms_internal_zzbny = com_google_android_gms_internal_zzbny.zzi(com_google_android_gms_internal_zzbrq, com_google_android_gms_internal_zzbsc);
        }
        return com_google_android_gms_internal_zzbny.isEmpty() ? zzbrv.zzaaY() : new zzbrr(com_google_android_gms_internal_zzbny, this.zzcjb);
    }

    public zzbsc zzg(zzbsc com_google_android_gms_internal_zzbsc) {
        return this.zzchB.isEmpty() ? zzbrv.zzaaY() : new zzbrr(this.zzchB, com_google_android_gms_internal_zzbsc);
    }

    public int zzh(zzbsc com_google_android_gms_internal_zzbsc) {
        return isEmpty() ? com_google_android_gms_internal_zzbsc.isEmpty() ? 0 : -1 : com_google_android_gms_internal_zzbsc.zzaaM() ? 1 : com_google_android_gms_internal_zzbsc.isEmpty() ? 1 : com_google_android_gms_internal_zzbsc == zzbsc.zzcjF ? -1 : 0;
    }

    public boolean zzk(zzbrq com_google_android_gms_internal_zzbrq) {
        return !zzm(com_google_android_gms_internal_zzbrq).isEmpty();
    }

    public zzbrq zzl(zzbrq com_google_android_gms_internal_zzbrq) {
        return (zzbrq) this.zzchB.zzah(com_google_android_gms_internal_zzbrq);
    }

    public zzbsc zzl(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc) {
        zzbrq zzYR = com_google_android_gms_internal_zzbph.zzYR();
        if (zzYR == null) {
            return com_google_android_gms_internal_zzbsc;
        }
        if (!zzYR.zzaaJ()) {
            return zze(zzYR, zzm(zzYR).zzl(com_google_android_gms_internal_zzbph.zzYS(), com_google_android_gms_internal_zzbsc));
        }
        if ($assertionsDisabled || zzbsg.zzq(com_google_android_gms_internal_zzbsc)) {
            return zzg(com_google_android_gms_internal_zzbsc);
        }
        throw new AssertionError();
    }

    public zzbsc zzm(zzbrq com_google_android_gms_internal_zzbrq) {
        return (!com_google_android_gms_internal_zzbrq.zzaaJ() || this.zzcjb.isEmpty()) ? this.zzchB.containsKey(com_google_android_gms_internal_zzbrq) ? (zzbsc) this.zzchB.get(com_google_android_gms_internal_zzbrq) : zzbrv.zzaaY() : this.zzcjb;
    }
}
