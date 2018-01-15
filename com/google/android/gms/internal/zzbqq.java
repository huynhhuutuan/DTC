package com.google.android.gms.internal;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class zzbqq<T> implements Iterable<Entry<zzbph, T>> {
    private static final zzbny zzchC = com.google.android.gms.internal.zzbny.zza.zza(zzboh.zzh(zzbrq.class));
    private static final zzbqq zzchD = new zzbqq(null, zzchC);
    private final T value;
    private final zzbny<zzbrq, zzbqq<T>> zzchB;

    public interface zza<T, R> {
        R zza(zzbph com_google_android_gms_internal_zzbph, T t, R r);
    }

    public zzbqq(T t) {
        this(t, zzchC);
    }

    public zzbqq(T t, zzbny<zzbrq, zzbqq<T>> com_google_android_gms_internal_zzbny_com_google_android_gms_internal_zzbrq__com_google_android_gms_internal_zzbqq_T) {
        this.value = t;
        this.zzchB = com_google_android_gms_internal_zzbny_com_google_android_gms_internal_zzbrq__com_google_android_gms_internal_zzbqq_T;
    }

    public static <V> zzbqq<V> zzZM() {
        return zzchD;
    }

    private <R> R zza(zzbph com_google_android_gms_internal_zzbph, zza<? super T, R> com_google_android_gms_internal_zzbqq_zza__super_T__R, R r) {
        Iterator it = this.zzchB.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            r = ((zzbqq) entry.getValue()).zza(com_google_android_gms_internal_zzbph.zza((zzbrq) entry.getKey()), com_google_android_gms_internal_zzbqq_zza__super_T__R, r);
        }
        return this.value != null ? com_google_android_gms_internal_zzbqq_zza__super_T__R.zza(com_google_android_gms_internal_zzbph, this.value, r) : r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzbqq com_google_android_gms_internal_zzbqq = (zzbqq) obj;
        if (this.zzchB == null ? com_google_android_gms_internal_zzbqq.zzchB != null : !this.zzchB.equals(com_google_android_gms_internal_zzbqq.zzchB)) {
            return false;
        }
        if (this.value != null) {
            if (this.value.equals(com_google_android_gms_internal_zzbqq.value)) {
                return true;
            }
        } else if (com_google_android_gms_internal_zzbqq.value == null) {
            return true;
        }
        return false;
    }

    public T getValue() {
        return this.value;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.value != null ? this.value.hashCode() : 0) * 31;
        if (this.zzchB != null) {
            i = this.zzchB.hashCode();
        }
        return hashCode + i;
    }

    public boolean isEmpty() {
        return this.value == null && this.zzchB.isEmpty();
    }

    public Iterator<Entry<zzbph, T>> iterator() {
        final List arrayList = new ArrayList();
        zza(new zza<T, Void>(this) {
            public Void zza(zzbph com_google_android_gms_internal_zzbph, T t, Void voidR) {
                arrayList.add(new SimpleImmutableEntry(com_google_android_gms_internal_zzbph, t));
                return null;
            }
        });
        return arrayList.iterator();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ImmutableTree { value=");
        stringBuilder.append(getValue());
        stringBuilder.append(", children={");
        Iterator it = this.zzchB.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            stringBuilder.append(((zzbrq) entry.getKey()).asString());
            stringBuilder.append("=");
            stringBuilder.append(entry.getValue());
        }
        stringBuilder.append("} }");
        return stringBuilder.toString();
    }

    public Collection<T> values() {
        final Collection arrayList = new ArrayList();
        zza(new zza<T, Void>(this) {
            public Void zza(zzbph com_google_android_gms_internal_zzbph, T t, Void voidR) {
                arrayList.add(t);
                return null;
            }
        });
        return arrayList;
    }

    public zzbph zzG(zzbph com_google_android_gms_internal_zzbph) {
        return zza(com_google_android_gms_internal_zzbph, zzbqr.zzchG);
    }

    public T zzH(zzbph com_google_android_gms_internal_zzbph) {
        return zzc(com_google_android_gms_internal_zzbph, zzbqr.zzchG);
    }

    public zzbqq<T> zzI(zzbph com_google_android_gms_internal_zzbph) {
        if (com_google_android_gms_internal_zzbph.isEmpty()) {
            return this;
        }
        zzbqq com_google_android_gms_internal_zzbqq = (zzbqq) this.zzchB.get(com_google_android_gms_internal_zzbph.zzYR());
        return com_google_android_gms_internal_zzbqq != null ? com_google_android_gms_internal_zzbqq.zzI(com_google_android_gms_internal_zzbph.zzYS()) : zzZM();
    }

    public zzbqq<T> zzJ(zzbph com_google_android_gms_internal_zzbph) {
        if (com_google_android_gms_internal_zzbph.isEmpty()) {
            return this.zzchB.isEmpty() ? zzZM() : new zzbqq(null, this.zzchB);
        } else {
            zzbrq zzYR = com_google_android_gms_internal_zzbph.zzYR();
            zzbqq com_google_android_gms_internal_zzbqq = (zzbqq) this.zzchB.get(zzYR);
            if (com_google_android_gms_internal_zzbqq == null) {
                return this;
            }
            com_google_android_gms_internal_zzbqq = com_google_android_gms_internal_zzbqq.zzJ(com_google_android_gms_internal_zzbph.zzYS());
            zzbny zzag = com_google_android_gms_internal_zzbqq.isEmpty() ? this.zzchB.zzag(zzYR) : this.zzchB.zzi(zzYR, com_google_android_gms_internal_zzbqq);
            return (this.value == null && zzag.isEmpty()) ? zzZM() : new zzbqq(this.value, zzag);
        }
    }

    public T zzK(zzbph com_google_android_gms_internal_zzbph) {
        if (com_google_android_gms_internal_zzbph.isEmpty()) {
            return this.value;
        }
        zzbqq com_google_android_gms_internal_zzbqq = (zzbqq) this.zzchB.get(com_google_android_gms_internal_zzbph.zzYR());
        return com_google_android_gms_internal_zzbqq != null ? com_google_android_gms_internal_zzbqq.zzK(com_google_android_gms_internal_zzbph.zzYS()) : null;
    }

    public zzbny<zzbrq, zzbqq<T>> zzZN() {
        return this.zzchB;
    }

    public zzbph zza(zzbph com_google_android_gms_internal_zzbph, zzbqr<? super T> com_google_android_gms_internal_zzbqr__super_T) {
        if (this.value != null && com_google_android_gms_internal_zzbqr__super_T.zzas(this.value)) {
            return zzbph.zzYO();
        }
        if (com_google_android_gms_internal_zzbph.isEmpty()) {
            return null;
        }
        zzbqq com_google_android_gms_internal_zzbqq = (zzbqq) this.zzchB.get(com_google_android_gms_internal_zzbph.zzYR());
        if (com_google_android_gms_internal_zzbqq == null) {
            return null;
        }
        zzbph zza = com_google_android_gms_internal_zzbqq.zza(com_google_android_gms_internal_zzbph.zzYS(), (zzbqr) com_google_android_gms_internal_zzbqr__super_T);
        if (zza == null) {
            return null;
        }
        return new zzbph(r2).zzh(zza);
    }

    public zzbqq<T> zza(zzbph com_google_android_gms_internal_zzbph, zzbqq<T> com_google_android_gms_internal_zzbqq_T) {
        if (com_google_android_gms_internal_zzbph.isEmpty()) {
            return com_google_android_gms_internal_zzbqq_T;
        }
        zzbrq zzYR = com_google_android_gms_internal_zzbph.zzYR();
        zzbqq com_google_android_gms_internal_zzbqq = (zzbqq) this.zzchB.get(zzYR);
        if (com_google_android_gms_internal_zzbqq == null) {
            com_google_android_gms_internal_zzbqq = zzZM();
        }
        com_google_android_gms_internal_zzbqq = com_google_android_gms_internal_zzbqq.zza(com_google_android_gms_internal_zzbph.zzYS(), (zzbqq) com_google_android_gms_internal_zzbqq_T);
        return new zzbqq(this.value, com_google_android_gms_internal_zzbqq.isEmpty() ? this.zzchB.zzag(zzYR) : this.zzchB.zzi(zzYR, com_google_android_gms_internal_zzbqq));
    }

    public void zza(zza<T, Void> com_google_android_gms_internal_zzbqq_zza_T__java_lang_Void) {
        zza(zzbph.zzYO(), com_google_android_gms_internal_zzbqq_zza_T__java_lang_Void, null);
    }

    public zzbqq<T> zzb(zzbph com_google_android_gms_internal_zzbph, T t) {
        if (com_google_android_gms_internal_zzbph.isEmpty()) {
            return new zzbqq(t, this.zzchB);
        }
        zzbrq zzYR = com_google_android_gms_internal_zzbph.zzYR();
        zzbqq com_google_android_gms_internal_zzbqq = (zzbqq) this.zzchB.get(zzYR);
        if (com_google_android_gms_internal_zzbqq == null) {
            com_google_android_gms_internal_zzbqq = zzZM();
        }
        return new zzbqq(this.value, this.zzchB.zzi(zzYR, com_google_android_gms_internal_zzbqq.zzb(com_google_android_gms_internal_zzbph.zzYS(), (Object) t)));
    }

    public T zzb(zzbph com_google_android_gms_internal_zzbph, zzbqr<? super T> com_google_android_gms_internal_zzbqr__super_T) {
        if (this.value != null && com_google_android_gms_internal_zzbqr__super_T.zzas(this.value)) {
            return this.value;
        }
        Iterator it = com_google_android_gms_internal_zzbph.iterator();
        while (it.hasNext()) {
            zzbqq com_google_android_gms_internal_zzbqq = (zzbqq) this.zzchB.get((zzbrq) it.next());
            if (com_google_android_gms_internal_zzbqq == null) {
                return null;
            }
            if (com_google_android_gms_internal_zzbqq.value != null && com_google_android_gms_internal_zzbqr__super_T.zzas(com_google_android_gms_internal_zzbqq.value)) {
                return com_google_android_gms_internal_zzbqq.value;
            }
            this = com_google_android_gms_internal_zzbqq;
        }
        return null;
    }

    public <R> R zzb(R r, zza<? super T, R> com_google_android_gms_internal_zzbqq_zza__super_T__R) {
        return zza(zzbph.zzYO(), com_google_android_gms_internal_zzbqq_zza__super_T__R, r);
    }

    public boolean zzb(zzbqr<? super T> com_google_android_gms_internal_zzbqr__super_T) {
        if (this.value != null && com_google_android_gms_internal_zzbqr__super_T.zzas(this.value)) {
            return true;
        }
        Iterator it = this.zzchB.iterator();
        while (it.hasNext()) {
            if (((zzbqq) ((Entry) it.next()).getValue()).zzb(com_google_android_gms_internal_zzbqr__super_T)) {
                return true;
            }
        }
        return false;
    }

    public T zzc(zzbph com_google_android_gms_internal_zzbph, zzbqr<? super T> com_google_android_gms_internal_zzbqr__super_T) {
        T t = (this.value == null || !com_google_android_gms_internal_zzbqr__super_T.zzas(this.value)) ? null : this.value;
        Iterator it = com_google_android_gms_internal_zzbph.iterator();
        T t2 = t;
        while (it.hasNext()) {
            zzbqq com_google_android_gms_internal_zzbqq = (zzbqq) this.zzchB.get((zzbrq) it.next());
            if (com_google_android_gms_internal_zzbqq == null) {
                break;
            }
            if (com_google_android_gms_internal_zzbqq.value != null && com_google_android_gms_internal_zzbqr__super_T.zzas(com_google_android_gms_internal_zzbqq.value)) {
                t2 = com_google_android_gms_internal_zzbqq.value;
            }
            this = com_google_android_gms_internal_zzbqq;
        }
        return t2;
    }

    public zzbqq<T> zze(zzbrq com_google_android_gms_internal_zzbrq) {
        zzbqq<T> com_google_android_gms_internal_zzbqq_T = (zzbqq) this.zzchB.get(com_google_android_gms_internal_zzbrq);
        return com_google_android_gms_internal_zzbqq_T != null ? com_google_android_gms_internal_zzbqq_T : zzZM();
    }
}
