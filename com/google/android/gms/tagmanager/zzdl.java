package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzak.zza;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzdl {
    private static final Object zzbIG = null;
    private static Long zzbIH = new Long(0);
    private static Double zzbII = new Double(0.0d);
    private static zzdk zzbIJ = zzdk.zzaA(0);
    private static String zzbIK = new String("");
    private static Boolean zzbIL = new Boolean(false);
    private static List<Object> zzbIM = new ArrayList(0);
    private static Map<Object, Object> zzbIN = new HashMap();
    private static zza zzbIO = zzR(zzbIK);

    private static double getDouble(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        zzbo.m11e("getDouble received non-Number");
        return 0.0d;
    }

    public static String zzM(Object obj) {
        return obj == null ? zzbIK : obj.toString();
    }

    public static zzdk zzN(Object obj) {
        return obj instanceof zzdk ? (zzdk) obj : zzT(obj) ? zzdk.zzaA(zzU(obj)) : zzS(obj) ? zzdk.zza(Double.valueOf(getDouble(obj))) : zzhx(zzM(obj));
    }

    public static Long zzO(Object obj) {
        return zzT(obj) ? Long.valueOf(zzU(obj)) : zzhy(zzM(obj));
    }

    public static Double zzP(Object obj) {
        return zzS(obj) ? Double.valueOf(getDouble(obj)) : zzhz(zzM(obj));
    }

    public static Boolean zzQ(Object obj) {
        return obj instanceof Boolean ? (Boolean) obj : zzhA(zzM(obj));
    }

    public static zza zzR(Object obj) {
        boolean z = false;
        zza com_google_android_gms_internal_zzak_zza = new zza();
        if (obj instanceof zza) {
            return (zza) obj;
        }
        if (obj instanceof String) {
            com_google_android_gms_internal_zzak_zza.type = 1;
            com_google_android_gms_internal_zzak_zza.string = (String) obj;
        } else if (obj instanceof List) {
            com_google_android_gms_internal_zzak_zza.type = 2;
            List<Object> list = (List) obj;
            r5 = new ArrayList(list.size());
            r1 = false;
            for (Object zzR : list) {
                zza zzR2 = zzR(zzR);
                if (zzR2 == zzbIO) {
                    return zzbIO;
                }
                r0 = r1 || zzR2.zzlD;
                r5.add(zzR2);
                r1 = r0;
            }
            com_google_android_gms_internal_zzak_zza.zzlu = (zza[]) r5.toArray(new zza[0]);
            z = r1;
        } else if (obj instanceof Map) {
            com_google_android_gms_internal_zzak_zza.type = 3;
            Set<Entry> entrySet = ((Map) obj).entrySet();
            r5 = new ArrayList(entrySet.size());
            List arrayList = new ArrayList(entrySet.size());
            r1 = false;
            for (Entry entry : entrySet) {
                zza zzR3 = zzR(entry.getKey());
                zza zzR4 = zzR(entry.getValue());
                if (zzR3 == zzbIO || zzR4 == zzbIO) {
                    return zzbIO;
                }
                r0 = r1 || zzR3.zzlD || zzR4.zzlD;
                r5.add(zzR3);
                arrayList.add(zzR4);
                r1 = r0;
            }
            com_google_android_gms_internal_zzak_zza.zzlv = (zza[]) r5.toArray(new zza[0]);
            com_google_android_gms_internal_zzak_zza.zzlw = (zza[]) arrayList.toArray(new zza[0]);
            z = r1;
        } else if (zzS(obj)) {
            com_google_android_gms_internal_zzak_zza.type = 1;
            com_google_android_gms_internal_zzak_zza.string = obj.toString();
        } else if (zzT(obj)) {
            com_google_android_gms_internal_zzak_zza.type = 6;
            com_google_android_gms_internal_zzak_zza.zzlz = zzU(obj);
        } else if (obj instanceof Boolean) {
            com_google_android_gms_internal_zzak_zza.type = 8;
            com_google_android_gms_internal_zzak_zza.zzlA = ((Boolean) obj).booleanValue();
        } else {
            String str = "Converting to Value from unknown object type: ";
            String valueOf = String.valueOf(obj == null ? "null" : obj.getClass().toString());
            zzbo.m11e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return zzbIO;
        }
        com_google_android_gms_internal_zzak_zza.zzlD = z;
        return com_google_android_gms_internal_zzak_zza;
    }

    public static Object zzRK() {
        return null;
    }

    public static Long zzRL() {
        return zzbIH;
    }

    public static Double zzRM() {
        return zzbII;
    }

    public static Boolean zzRN() {
        return zzbIL;
    }

    public static zzdk zzRO() {
        return zzbIJ;
    }

    public static String zzRP() {
        return zzbIK;
    }

    public static zza zzRQ() {
        return zzbIO;
    }

    private static boolean zzS(Object obj) {
        return (obj instanceof Double) || (obj instanceof Float) || ((obj instanceof zzdk) && ((zzdk) obj).zzRF());
    }

    private static boolean zzT(Object obj) {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || ((obj instanceof zzdk) && ((zzdk) obj).zzRG());
    }

    private static long zzU(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        zzbo.m11e("getInt64 received non-Number");
        return 0;
    }

    public static String zze(zza com_google_android_gms_internal_zzak_zza) {
        return zzM(zzj(com_google_android_gms_internal_zzak_zza));
    }

    public static zzdk zzf(zza com_google_android_gms_internal_zzak_zza) {
        return zzN(zzj(com_google_android_gms_internal_zzak_zza));
    }

    public static Long zzg(zza com_google_android_gms_internal_zzak_zza) {
        return zzO(zzj(com_google_android_gms_internal_zzak_zza));
    }

    public static Double zzh(zza com_google_android_gms_internal_zzak_zza) {
        return zzP(zzj(com_google_android_gms_internal_zzak_zza));
    }

    private static Boolean zzhA(String str) {
        return "true".equalsIgnoreCase(str) ? Boolean.TRUE : "false".equalsIgnoreCase(str) ? Boolean.FALSE : zzbIL;
    }

    public static zza zzhw(String str) {
        zza com_google_android_gms_internal_zzak_zza = new zza();
        com_google_android_gms_internal_zzak_zza.type = 5;
        com_google_android_gms_internal_zzak_zza.zzly = str;
        return com_google_android_gms_internal_zzak_zza;
    }

    private static zzdk zzhx(String str) {
        try {
            return zzdk.zzhv(str);
        } catch (NumberFormatException e) {
            zzbo.m11e(new StringBuilder(String.valueOf(str).length() + 33).append("Failed to convert '").append(str).append("' to a number.").toString());
            return zzbIJ;
        }
    }

    private static Long zzhy(String str) {
        zzdk zzhx = zzhx(str);
        return zzhx == zzbIJ ? zzbIH : Long.valueOf(zzhx.longValue());
    }

    private static Double zzhz(String str) {
        zzdk zzhx = zzhx(str);
        return zzhx == zzbIJ ? zzbII : Double.valueOf(zzhx.doubleValue());
    }

    public static Boolean zzi(zza com_google_android_gms_internal_zzak_zza) {
        return zzQ(zzj(com_google_android_gms_internal_zzak_zza));
    }

    public static Object zzj(zza com_google_android_gms_internal_zzak_zza) {
        int i = 0;
        if (com_google_android_gms_internal_zzak_zza == null) {
            return null;
        }
        zza[] com_google_android_gms_internal_zzak_zzaArr;
        int length;
        switch (com_google_android_gms_internal_zzak_zza.type) {
            case 1:
                return com_google_android_gms_internal_zzak_zza.string;
            case 2:
                ArrayList arrayList = new ArrayList(com_google_android_gms_internal_zzak_zza.zzlu.length);
                com_google_android_gms_internal_zzak_zzaArr = com_google_android_gms_internal_zzak_zza.zzlu;
                length = com_google_android_gms_internal_zzak_zzaArr.length;
                while (i < length) {
                    Object zzj = zzj(com_google_android_gms_internal_zzak_zzaArr[i]);
                    if (zzj == null) {
                        return null;
                    }
                    arrayList.add(zzj);
                    i++;
                }
                return arrayList;
            case 3:
                if (com_google_android_gms_internal_zzak_zza.zzlv.length != com_google_android_gms_internal_zzak_zza.zzlw.length) {
                    String str = "Converting an invalid value to object: ";
                    String valueOf = String.valueOf(com_google_android_gms_internal_zzak_zza.toString());
                    zzbo.m11e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    return null;
                }
                Map hashMap = new HashMap(com_google_android_gms_internal_zzak_zza.zzlw.length);
                while (i < com_google_android_gms_internal_zzak_zza.zzlv.length) {
                    Object zzj2 = zzj(com_google_android_gms_internal_zzak_zza.zzlv[i]);
                    Object zzj3 = zzj(com_google_android_gms_internal_zzak_zza.zzlw[i]);
                    if (zzj2 == null || zzj3 == null) {
                        return null;
                    }
                    hashMap.put(zzj2, zzj3);
                    i++;
                }
                return hashMap;
            case 4:
                zzbo.m11e("Trying to convert a macro reference to object");
                return null;
            case 5:
                zzbo.m11e("Trying to convert a function id to object");
                return null;
            case 6:
                return Long.valueOf(com_google_android_gms_internal_zzak_zza.zzlz);
            case 7:
                StringBuffer stringBuffer = new StringBuffer();
                com_google_android_gms_internal_zzak_zzaArr = com_google_android_gms_internal_zzak_zza.zzlB;
                length = com_google_android_gms_internal_zzak_zzaArr.length;
                while (i < length) {
                    String zze = zze(com_google_android_gms_internal_zzak_zzaArr[i]);
                    if (zze == zzbIK) {
                        return null;
                    }
                    stringBuffer.append(zze);
                    i++;
                }
                return stringBuffer.toString();
            case 8:
                return Boolean.valueOf(com_google_android_gms_internal_zzak_zza.zzlA);
            default:
                zzbo.m11e("Failed to convert a value of type: " + com_google_android_gms_internal_zzak_zza.type);
                return null;
        }
    }
}
