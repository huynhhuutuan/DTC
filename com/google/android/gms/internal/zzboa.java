package com.google.android.gms.internal;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class zzboa<T> implements Iterable<T> {
    private final zzbny<T, Void> zzcba;

    private static class zza<T> implements Iterator<T> {
        final Iterator<Entry<T, Void>> zzcbb;

        public zza(Iterator<Entry<T, Void>> it) {
            this.zzcbb = it;
        }

        public boolean hasNext() {
            return this.zzcbb.hasNext();
        }

        public T next() {
            return ((Entry) this.zzcbb.next()).getKey();
        }

        public void remove() {
            this.zzcbb.remove();
        }
    }

    private zzboa(zzbny<T, Void> com_google_android_gms_internal_zzbny_T__java_lang_Void) {
        this.zzcba = com_google_android_gms_internal_zzbny_T__java_lang_Void;
    }

    public zzboa(List<T> list, Comparator<T> comparator) {
        this.zzcba = com.google.android.gms.internal.zzbny.zza.zzb(list, Collections.emptyMap(), com.google.android.gms.internal.zzbny.zza.zzWV(), comparator);
    }

    public Iterator<T> iterator() {
        return new zza(this.zzcba.iterator());
    }

    public Iterator<T> zzWU() {
        return new zza(this.zzcba.zzWU());
    }

    public T zzWW() {
        return this.zzcba.zzWS();
    }

    public T zzWX() {
        return this.zzcba.zzWT();
    }

    public zzboa<T> zzal(T t) {
        zzbny zzag = this.zzcba.zzag(t);
        return zzag == this.zzcba ? this : new zzboa(zzag);
    }

    public zzboa<T> zzam(T t) {
        return new zzboa(this.zzcba.zzi(t, null));
    }

    public T zzan(T t) {
        return this.zzcba.zzah(t);
    }
}
