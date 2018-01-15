package com.google.android.gms.internal;

import java.util.AbstractMap.SimpleEntry;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Stack;

public class zzbnz<K, V> implements Iterator<Entry<K, V>> {
    private final Stack<zzbof<K, V>> zzcaY = new Stack();
    private final boolean zzcaZ;

    zzbnz(zzbod<K, V> com_google_android_gms_internal_zzbod_K__V, K k, Comparator<K> comparator, boolean z) {
        this.zzcaZ = z;
        zzbod com_google_android_gms_internal_zzbod = com_google_android_gms_internal_zzbod_K__V;
        while (!com_google_android_gms_internal_zzbod.isEmpty()) {
            int compare = k != null ? z ? comparator.compare(k, com_google_android_gms_internal_zzbod.getKey()) : comparator.compare(com_google_android_gms_internal_zzbod.getKey(), k) : 1;
            if (compare < 0) {
                com_google_android_gms_internal_zzbod = z ? com_google_android_gms_internal_zzbod.zzXb() : com_google_android_gms_internal_zzbod.zzXc();
            } else if (compare == 0) {
                this.zzcaY.push((zzbof) com_google_android_gms_internal_zzbod);
                return;
            } else {
                this.zzcaY.push((zzbof) com_google_android_gms_internal_zzbod);
                com_google_android_gms_internal_zzbod = z ? com_google_android_gms_internal_zzbod.zzXc() : com_google_android_gms_internal_zzbod.zzXb();
            }
        }
    }

    public boolean hasNext() {
        return this.zzcaY.size() > 0;
    }

    public Entry<K, V> next() {
        try {
            zzbof com_google_android_gms_internal_zzbof = (zzbof) this.zzcaY.pop();
            Entry simpleEntry = new SimpleEntry(com_google_android_gms_internal_zzbof.getKey(), com_google_android_gms_internal_zzbof.getValue());
            zzbod zzXb;
            if (this.zzcaZ) {
                for (zzXb = com_google_android_gms_internal_zzbof.zzXb(); !zzXb.isEmpty(); zzXb = zzXb.zzXc()) {
                    this.zzcaY.push((zzbof) zzXb);
                }
            } else {
                for (zzXb = com_google_android_gms_internal_zzbof.zzXc(); !zzXb.isEmpty(); zzXb = zzXb.zzXb()) {
                    this.zzcaY.push((zzbof) zzXb);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException e) {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
