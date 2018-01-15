package com.google.android.gms.internal;

import java.util.Map;

public class zzbsu {
    private final String zzbxX;
    private final Map<String, Object> zzckD;

    public zzbsu(String str, Map<String, Object> map) {
        this.zzbxX = str;
        this.zzckD = map;
    }

    public static zzbsu zzjd(String str) {
        if (!str.startsWith("gauth|")) {
            return null;
        }
        try {
            Map zzje = zzbsv.zzje(str.substring("gauth|".length()));
            return new zzbsu((String) zzje.get("token"), (Map) zzje.get("auth"));
        } catch (Throwable e) {
            throw new RuntimeException("Failed to parse gauth token", e);
        }
    }

    public String getToken() {
        return this.zzbxX;
    }

    public Map<String, Object> zzabG() {
        return this.zzckD;
    }
}
