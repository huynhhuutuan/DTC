package com.google.android.gms.internal;

import com.google.firebase.database.DatabaseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class zzbph implements Comparable<zzbph>, Iterable<zzbrq> {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbph.class.desiredAssertionStatus());
    private static final zzbph zzcep = new zzbph("");
    private final int end;
    private final int start;
    private final zzbrq[] zzceo;

    class C04931 implements Iterator<zzbrq> {
        int offset = this.zzceq.start;
        final /* synthetic */ zzbph zzceq;

        C04931(zzbph com_google_android_gms_internal_zzbph) {
            this.zzceq = com_google_android_gms_internal_zzbph;
        }

        public boolean hasNext() {
            return this.offset < this.zzceq.end;
        }

        public /* synthetic */ Object next() {
            return zzYV();
        }

        public void remove() {
            throw new UnsupportedOperationException("Can't remove component from immutable Path!");
        }

        public zzbrq zzYV() {
            if (hasNext()) {
                zzbrq com_google_android_gms_internal_zzbrq = this.zzceq.zzceo[this.offset];
                this.offset++;
                return com_google_android_gms_internal_zzbrq;
            }
            throw new NoSuchElementException("No more elements.");
        }
    }

    public zzbph(String str) {
        String[] split = str.split("/");
        int i = 0;
        for (String length : split) {
            if (length.length() > 0) {
                i++;
            }
        }
        this.zzceo = new zzbrq[i];
        int length2 = split.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length2) {
            String str2 = split[i2];
            if (str2.length() > 0) {
                i = i3 + 1;
                this.zzceo[i3] = zzbrq.zzja(str2);
            } else {
                i = i3;
            }
            i2++;
            i3 = i;
        }
        this.start = 0;
        this.end = this.zzceo.length;
    }

    public zzbph(List<String> list) {
        this.zzceo = new zzbrq[list.size()];
        int i = 0;
        for (String zzja : list) {
            int i2 = i + 1;
            this.zzceo[i] = zzbrq.zzja(zzja);
            i = i2;
        }
        this.start = 0;
        this.end = list.size();
    }

    public zzbph(zzbrq... com_google_android_gms_internal_zzbrqArr) {
        this.zzceo = (zzbrq[]) Arrays.copyOf(com_google_android_gms_internal_zzbrqArr, com_google_android_gms_internal_zzbrqArr.length);
        this.start = 0;
        this.end = com_google_android_gms_internal_zzbrqArr.length;
        int length = com_google_android_gms_internal_zzbrqArr.length;
        int i = 0;
        while (i < length) {
            zzbrq com_google_android_gms_internal_zzbrq = com_google_android_gms_internal_zzbrqArr[i];
            if ($assertionsDisabled || com_google_android_gms_internal_zzbrq != null) {
                i++;
            } else {
                throw new AssertionError("Can't construct a path with a null value!");
            }
        }
    }

    private zzbph(zzbrq[] com_google_android_gms_internal_zzbrqArr, int i, int i2) {
        this.zzceo = com_google_android_gms_internal_zzbrqArr;
        this.start = i;
        this.end = i2;
    }

    public static zzbph zzYO() {
        return zzcep;
    }

    public static zzbph zza(zzbph com_google_android_gms_internal_zzbph, zzbph com_google_android_gms_internal_zzbph2) {
        zzbrq zzYR = com_google_android_gms_internal_zzbph.zzYR();
        zzbrq zzYR2 = com_google_android_gms_internal_zzbph2.zzYR();
        if (zzYR == null) {
            return com_google_android_gms_internal_zzbph2;
        }
        if (zzYR.equals(zzYR2)) {
            return zza(com_google_android_gms_internal_zzbph.zzYS(), com_google_android_gms_internal_zzbph2.zzYS());
        }
        String valueOf = String.valueOf(com_google_android_gms_internal_zzbph2);
        String valueOf2 = String.valueOf(com_google_android_gms_internal_zzbph);
        throw new DatabaseException(new StringBuilder((String.valueOf(valueOf).length() + 37) + String.valueOf(valueOf2).length()).append("INTERNAL ERROR: ").append(valueOf).append(" is not contained in ").append(valueOf2).toString());
    }

    public /* synthetic */ int compareTo(Object obj) {
        return zzj((zzbph) obj);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zzbph)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        zzbph com_google_android_gms_internal_zzbph = (zzbph) obj;
        if (size() != com_google_android_gms_internal_zzbph.size()) {
            return false;
        }
        int i = this.start;
        int i2 = com_google_android_gms_internal_zzbph.start;
        while (i < this.end && i2 < com_google_android_gms_internal_zzbph.end) {
            if (!this.zzceo[i].equals(com_google_android_gms_internal_zzbph.zzceo[i2])) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = this.start; i2 < this.end; i2++) {
            i = (i * 37) + this.zzceo[i2].hashCode();
        }
        return i;
    }

    public boolean isEmpty() {
        return this.start >= this.end;
    }

    public Iterator<zzbrq> iterator() {
        return new C04931(this);
    }

    public int size() {
        return this.end - this.start;
    }

    public String toString() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = this.start; i < this.end; i++) {
            stringBuilder.append("/");
            stringBuilder.append(this.zzceo[i].asString());
        }
        return stringBuilder.toString();
    }

    public String zzYP() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = this.start; i < this.end; i++) {
            if (i > this.start) {
                stringBuilder.append("/");
            }
            stringBuilder.append(this.zzceo[i].asString());
        }
        return stringBuilder.toString();
    }

    public List<String> zzYQ() {
        List<String> arrayList = new ArrayList(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(((zzbrq) it.next()).asString());
        }
        return arrayList;
    }

    public zzbrq zzYR() {
        return isEmpty() ? null : this.zzceo[this.start];
    }

    public zzbph zzYS() {
        int i = this.start;
        if (!isEmpty()) {
            i++;
        }
        return new zzbph(this.zzceo, i, this.end);
    }

    public zzbph zzYT() {
        return isEmpty() ? null : new zzbph(this.zzceo, this.start, this.end - 1);
    }

    public zzbrq zzYU() {
        return !isEmpty() ? this.zzceo[this.end - 1] : null;
    }

    public zzbph zza(zzbrq com_google_android_gms_internal_zzbrq) {
        int size = size();
        Object obj = new zzbrq[(size + 1)];
        System.arraycopy(this.zzceo, this.start, obj, 0, size);
        obj[size] = com_google_android_gms_internal_zzbrq;
        return new zzbph(obj, 0, size + 1);
    }

    public zzbph zzh(zzbph com_google_android_gms_internal_zzbph) {
        int size = size() + com_google_android_gms_internal_zzbph.size();
        Object obj = new zzbrq[size];
        System.arraycopy(this.zzceo, this.start, obj, 0, size());
        System.arraycopy(com_google_android_gms_internal_zzbph.zzceo, com_google_android_gms_internal_zzbph.start, obj, size(), com_google_android_gms_internal_zzbph.size());
        return new zzbph(obj, 0, size);
    }

    public boolean zzi(zzbph com_google_android_gms_internal_zzbph) {
        if (size() > com_google_android_gms_internal_zzbph.size()) {
            return false;
        }
        int i = this.start;
        int i2 = com_google_android_gms_internal_zzbph.start;
        while (i < this.end) {
            if (!this.zzceo[i].equals(com_google_android_gms_internal_zzbph.zzceo[i2])) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public int zzj(zzbph com_google_android_gms_internal_zzbph) {
        int i = this.start;
        int i2 = com_google_android_gms_internal_zzbph.start;
        while (i < this.end && i2 < com_google_android_gms_internal_zzbph.end) {
            int zzi = this.zzceo[i].zzi(com_google_android_gms_internal_zzbph.zzceo[i2]);
            if (zzi != 0) {
                return zzi;
            }
            i++;
            i2++;
        }
        return (i == this.end && i2 == com_google_android_gms_internal_zzbph.end) ? 0 : i == this.end ? -1 : 1;
    }
}
