package com.google.android.gms.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

public class zzbtp implements FirebaseRemoteConfigInfo {
    private long zzcmc;
    private int zzcmd;
    private FirebaseRemoteConfigSettings zzcme;

    public FirebaseRemoteConfigSettings getConfigSettings() {
        return this.zzcme;
    }

    public long getFetchTimeMillis() {
        return this.zzcmc;
    }

    public int getLastFetchStatus() {
        return this.zzcmd;
    }

    public void setConfigSettings(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.zzcme = firebaseRemoteConfigSettings;
    }

    public void zzaU(long j) {
        this.zzcmc = j;
    }

    public void zzqI(int i) {
        this.zzcmd = i;
    }
}
