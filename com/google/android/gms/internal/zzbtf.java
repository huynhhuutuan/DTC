package com.google.android.gms.internal;

import com.google.firebase.database.DatabaseException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class zzbtf {
    private static final Pattern zzckN = Pattern.compile("[\\[\\]\\.#$]");
    private static final Pattern zzckO = Pattern.compile("[\\[\\]\\.#\\$\\/\\u0000-\\u001F\\u007F]");

    private static boolean zzP(zzbph com_google_android_gms_internal_zzbph) {
        zzbrq zzYR = com_google_android_gms_internal_zzbph.zzYR();
        return zzYR == null || !zzYR.asString().startsWith(".");
    }

    public static void zzQ(zzbph com_google_android_gms_internal_zzbph) throws DatabaseException {
        if (!zzP(com_google_android_gms_internal_zzbph)) {
            String str = "Invalid write location: ";
            String valueOf = String.valueOf(com_google_android_gms_internal_zzbph.toString());
            throw new DatabaseException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    public static void zzax(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (!map.containsKey(".sv")) {
                for (Entry entry : map.entrySet()) {
                    zzjq((String) entry.getKey());
                    zzax(entry.getValue());
                }
            }
        } else if (obj instanceof List) {
            for (Object zzax : (List) obj) {
                zzax(zzax);
            }
        }
    }

    public static Map<zzbph, zzbsc> zzc(zzbph com_google_android_gms_internal_zzbph, Map<String, Object> map) throws DatabaseException {
        Map treeMap = new TreeMap();
        for (Entry entry : map.entrySet()) {
            zzbph com_google_android_gms_internal_zzbph2 = new zzbph((String) entry.getKey());
            Object value = entry.getValue();
            zzbpw.zza(com_google_android_gms_internal_zzbph.zzh(com_google_android_gms_internal_zzbph2), value);
            String asString = !com_google_android_gms_internal_zzbph2.isEmpty() ? com_google_android_gms_internal_zzbph2.zzYU().asString() : "";
            if (asString.equals(".sv") || asString.equals(".value")) {
                String valueOf = String.valueOf(com_google_android_gms_internal_zzbph2);
                throw new DatabaseException(new StringBuilder((String.valueOf(valueOf).length() + 40) + String.valueOf(asString).length()).append("Path '").append(valueOf).append("' contains disallowed child name: ").append(asString).toString());
            } else if (!asString.equals(".priority") || zzbsg.zzq(zzbsd.zzat(value))) {
                zzax(value);
                treeMap.put(com_google_android_gms_internal_zzbph2, zzbsd.zzat(value));
            } else {
                String valueOf2 = String.valueOf(com_google_android_gms_internal_zzbph2);
                throw new DatabaseException(new StringBuilder(String.valueOf(valueOf2).length() + 83).append("Path '").append(valueOf2).append("' contains invalid priority (must be a string, double, ServerValue, or null).").toString());
            }
        }
        zzbph com_google_android_gms_internal_zzbph3 = null;
        for (zzbph com_google_android_gms_internal_zzbph4 : treeMap.keySet()) {
            boolean z = com_google_android_gms_internal_zzbph3 == null || com_google_android_gms_internal_zzbph3.zzj(com_google_android_gms_internal_zzbph4) < 0;
            zzbte.zzbb(z);
            if (com_google_android_gms_internal_zzbph3 == null || !com_google_android_gms_internal_zzbph3.zzi(com_google_android_gms_internal_zzbph4)) {
                com_google_android_gms_internal_zzbph3 = com_google_android_gms_internal_zzbph4;
            } else {
                valueOf2 = String.valueOf(com_google_android_gms_internal_zzbph3);
                asString = String.valueOf(com_google_android_gms_internal_zzbph4);
                throw new DatabaseException(new StringBuilder((String.valueOf(valueOf2).length() + 42) + String.valueOf(asString).length()).append("Path '").append(valueOf2).append("' is an ancestor of '").append(asString).append("' in an update.").toString());
            }
        }
        return treeMap;
    }

    private static boolean zzjk(String str) {
        return !zzckN.matcher(str).find();
    }

    public static void zzjl(String str) throws DatabaseException {
        if (!zzjk(str)) {
            throw new DatabaseException(new StringBuilder(String.valueOf(str).length() + 101).append("Invalid Firebase Database path: ").append(str).append(". Firebase Database paths must not contain '.', '#', '$', '[', or ']'").toString());
        }
    }

    public static void zzjm(String str) throws DatabaseException {
        if (str.startsWith(".info")) {
            zzjl(str.substring(5));
        } else if (str.startsWith("/.info")) {
            zzjl(str.substring(6));
        } else {
            zzjl(str);
        }
    }

    private static boolean zzjn(String str) {
        return str != null && str.length() > 0 && (str.equals(".value") || str.equals(".priority") || !(str.startsWith(".") || zzckO.matcher(str).find()));
    }

    private static boolean zzjo(String str) {
        return str.equals(".info") || !zzckO.matcher(str).find();
    }

    public static void zzjp(String str) throws DatabaseException {
        if (str != null && !zzjo(str)) {
            throw new DatabaseException(new StringBuilder(String.valueOf(str).length() + 68).append("Invalid key: ").append(str).append(". Keys must not contain '/', '.', '#', '$', '[', or ']'").toString());
        }
    }

    public static void zzjq(String str) throws DatabaseException {
        if (!zzjn(str)) {
            throw new DatabaseException(new StringBuilder(String.valueOf(str).length() + 68).append("Invalid key: ").append(str).append(". Keys must not contain '/', '.', '#', '$', '[', or ']'").toString());
        }
    }
}
