package com.google.firebase.remoteconfig;

public class FirebaseRemoteConfigSettings {
    private final boolean zzclU;

    public static class Builder {
        private boolean zzclU = false;

        public FirebaseRemoteConfigSettings build() {
            return new FirebaseRemoteConfigSettings();
        }

        public Builder setDeveloperModeEnabled(boolean z) {
            this.zzclU = z;
            return this;
        }
    }

    private FirebaseRemoteConfigSettings(Builder builder) {
        this.zzclU = builder.zzclU;
    }

    public boolean isDeveloperModeEnabled() {
        return this.zzclU;
    }
}
