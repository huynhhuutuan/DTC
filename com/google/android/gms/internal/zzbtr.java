package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

public class zzbtr {
    private boolean zzclU;
    private long zzclX;
    private int zzcmd;
    private long zzcmg;
    private Map<String, zzbtl> zzcmh;

    public zzbtr() {
        this(-1);
    }

    public zzbtr(int i, long j, Map<String, zzbtl> map, boolean z) {
        this(i, j, map, z, -1);
    }

    public zzbtr(int i, long j, Map<String, zzbtl> map, boolean z, long j2) {
        Map hashMap;
        this.zzcmd = i;
        this.zzcmg = j;
        if (map == null) {
            hashMap = new HashMap();
        }
        this.zzcmh = hashMap;
        this.zzclU = z;
        this.zzclX = j2;
    }

    public zzbtr(long j) {
        this(0, j, null, false);
    }

    public int getLastFetchStatus() {
        return this.zzcmd;
    }

    public boolean isDeveloperModeEnabled() {
        return this.zzclU;
    }

    public void zza(String str, zzbtl com_google_android_gms_internal_zzbtl) {
        this.zzcmh.put(str, com_google_android_gms_internal_zzbtl);
    }

    public void zzaI(Map<String, zzbtl> map) {
        Map hashMap;
        if (map == null) {
            hashMap = new HashMap();
        }
        this.zzcmh = hashMap;
    }

    public void zzaV(long j) {
        this.zzcmg = j;
    }

    public void zzaW(long j) {
        this.zzclX = j;
    }

    public Map<String, zzbtl> zzach() {
        return this.zzcmh;
    }

    public long zzaci() {
        return this.zzcmg;
    }

    public long zzacj() {
        return this.zzclX;
    }

    public void zzbh(boolean z) {
        this.zzclU = z;
    }

    public void zzjG(String str) {
        if (this.zzcmh.get(str) != null) {
            this.zzcmh.remove(str);
        }
    }

    public void zzqI(int i) {
        this.zzcmd = i;
    }
}
