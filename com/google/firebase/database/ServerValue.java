package com.google.firebase.database;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ServerValue {
    public static final Map<String, String> TIMESTAMP = zziF("timestamp");

    private static Map<String, String> zziF(String str) {
        Map hashMap = new HashMap();
        hashMap.put(".sv", str);
        return Collections.unmodifiableMap(hashMap);
    }
}
