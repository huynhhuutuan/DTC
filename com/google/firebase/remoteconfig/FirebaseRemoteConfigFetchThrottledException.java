package com.google.firebase.remoteconfig;

public class FirebaseRemoteConfigFetchThrottledException extends FirebaseRemoteConfigFetchException {
    private final long zzaIO;

    public FirebaseRemoteConfigFetchThrottledException(long j) {
        this.zzaIO = j;
    }

    public long getThrottleEndTimeMillis() {
        return this.zzaIO;
    }
}
