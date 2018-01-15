package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbny.zza;
import com.google.firebase.database.DatabaseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class zzbsd {
    public static int zza(zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc, zzbrq com_google_android_gms_internal_zzbrq2, zzbsc com_google_android_gms_internal_zzbsc2) {
        int compareTo = com_google_android_gms_internal_zzbsc.compareTo(com_google_android_gms_internal_zzbsc2);
        return compareTo != 0 ? compareTo : com_google_android_gms_internal_zzbrq.zzi(com_google_android_gms_internal_zzbrq2);
    }

    public static zzbsc zza(Object obj, zzbsc com_google_android_gms_internal_zzbsc) throws DatabaseException {
        try {
            Map map;
            Object obj2;
            List list;
            Map hashMap;
            int i;
            String str;
            zzbsc zzat;
            Map hashMap2;
            if (obj instanceof Map) {
                map = (Map) obj;
                if (map.containsKey(".priority")) {
                    com_google_android_gms_internal_zzbsc = zzbsg.zzau(map.get(".priority"));
                }
                if (map.containsKey(".value")) {
                    obj2 = map.get(".value");
                    if (obj2 == null) {
                        return zzbrv.zzaaY();
                    }
                    if (obj2 instanceof String) {
                        return new zzbsi((String) obj2, com_google_android_gms_internal_zzbsc);
                    }
                    if (obj2 instanceof Long) {
                        return new zzbsa((Long) obj2, com_google_android_gms_internal_zzbsc);
                    }
                    if (obj2 instanceof Integer) {
                        return new zzbsa(Long.valueOf((long) ((Integer) obj2).intValue()), com_google_android_gms_internal_zzbsc);
                    }
                    if (obj2 instanceof Double) {
                        return new zzbru((Double) obj2, com_google_android_gms_internal_zzbsc);
                    }
                    if (obj2 instanceof Boolean) {
                        return new zzbrp((Boolean) obj2, com_google_android_gms_internal_zzbsc);
                    }
                    if (!(obj2 instanceof Map) || (obj2 instanceof List)) {
                        if (obj2 instanceof Map) {
                            list = (List) obj2;
                            hashMap = new HashMap(list.size());
                            for (i = 0; i < list.size(); i++) {
                                str = i;
                                zzat = zzat(list.get(i));
                                if (!zzat.isEmpty()) {
                                    hashMap.put(zzbrq.zzja(str), zzat);
                                }
                            }
                            map = hashMap;
                        } else {
                            map = (Map) obj2;
                            if (map.containsKey(".sv")) {
                                return new zzbrt(map, com_google_android_gms_internal_zzbsc);
                            }
                            hashMap2 = new HashMap(map.size());
                            for (String str2 : map.keySet()) {
                                if (!str2.startsWith(".")) {
                                    zzat = zzat(map.get(str2));
                                    if (!zzat.isEmpty()) {
                                        hashMap2.put(zzbrq.zzja(str2), zzat);
                                    }
                                }
                            }
                            map = hashMap2;
                        }
                        return map.isEmpty() ? zzbrv.zzaaY() : new zzbrr(zza.zzb(map, zzbrr.zzcja), com_google_android_gms_internal_zzbsc);
                    } else {
                        String str3 = "Failed to parse node with class ";
                        String valueOf = String.valueOf(obj2.getClass().toString());
                        throw new DatabaseException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    }
                }
            }
            obj2 = obj;
            if (obj2 == null) {
                return zzbrv.zzaaY();
            }
            if (obj2 instanceof String) {
                return new zzbsi((String) obj2, com_google_android_gms_internal_zzbsc);
            }
            if (obj2 instanceof Long) {
                return new zzbsa((Long) obj2, com_google_android_gms_internal_zzbsc);
            }
            if (obj2 instanceof Integer) {
                return new zzbsa(Long.valueOf((long) ((Integer) obj2).intValue()), com_google_android_gms_internal_zzbsc);
            }
            if (obj2 instanceof Double) {
                return new zzbru((Double) obj2, com_google_android_gms_internal_zzbsc);
            }
            if (obj2 instanceof Boolean) {
                return new zzbrp((Boolean) obj2, com_google_android_gms_internal_zzbsc);
            }
            if (obj2 instanceof Map) {
            }
            if (obj2 instanceof Map) {
                list = (List) obj2;
                hashMap = new HashMap(list.size());
                for (i = 0; i < list.size(); i++) {
                    str = i;
                    zzat = zzat(list.get(i));
                    if (!zzat.isEmpty()) {
                        hashMap.put(zzbrq.zzja(str), zzat);
                    }
                }
                map = hashMap;
            } else {
                map = (Map) obj2;
                if (map.containsKey(".sv")) {
                    return new zzbrt(map, com_google_android_gms_internal_zzbsc);
                }
                hashMap2 = new HashMap(map.size());
                for (String str22 : map.keySet()) {
                    if (!str22.startsWith(".")) {
                        zzat = zzat(map.get(str22));
                        if (!zzat.isEmpty()) {
                            hashMap2.put(zzbrq.zzja(str22), zzat);
                        }
                    }
                }
                map = hashMap2;
            }
            if (map.isEmpty()) {
            }
        } catch (Throwable e) {
            throw new DatabaseException("Failed to parse node", e);
        }
    }

    public static zzbsc zzat(Object obj) throws DatabaseException {
        return zza(obj, zzbsg.zzabk());
    }
}
