package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;

public class zzboi {
    private final List<List<String>> zzcbt;
    private final List<String> zzcbu;

    public zzboi(List<List<String>> list, List<String> list2) {
        if (list.size() != list2.size() - 1) {
            throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
        }
        this.zzcbt = list;
        this.zzcbu = list2;
    }

    public List<List<String>> zzXo() {
        return Collections.unmodifiableList(this.zzcbt);
    }

    public List<String> zzXp() {
        return Collections.unmodifiableList(this.zzcbu);
    }
}
