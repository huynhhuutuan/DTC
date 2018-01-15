package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzak.zza;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class zzam {
    private final Set<String> zzbGn;
    private final String zzbGo;

    public zzam(String str, String... strArr) {
        this.zzbGo = str;
        this.zzbGn = new HashSet(strArr.length);
        for (Object add : strArr) {
            this.zzbGn.add(add);
        }
    }

    public String zzQK() {
        return this.zzbGo;
    }

    public Set<String> zzQL() {
        return this.zzbGn;
    }

    public abstract boolean zzQa();

    public abstract zza zzZ(Map<String, zza> map);

    boolean zzf(Set<String> set) {
        return set.containsAll(this.zzbGn);
    }
}
