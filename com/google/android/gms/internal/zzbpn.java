package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbpp.zzb;
import com.google.android.gms.internal.zzbrr.zza;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class zzbpn {

    class C09821 implements zzb {
        final /* synthetic */ zzbpp zzcfD;
        final /* synthetic */ Map zzcfE;

        C09821(zzbpp com_google_android_gms_internal_zzbpp, Map map) {
            this.zzcfD = com_google_android_gms_internal_zzbpp;
            this.zzcfE = map;
        }

        public void zzf(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc) {
            this.zzcfD.zzh(com_google_android_gms_internal_zzbph, zzbpn.zza(com_google_android_gms_internal_zzbsc, this.zzcfE));
        }
    }

    class C11972 extends zza {
        final /* synthetic */ Map zzcfE;
        final /* synthetic */ zzbpo zzcfF;

        C11972(Map map, zzbpo com_google_android_gms_internal_zzbpo) {
            this.zzcfE = map;
            this.zzcfF = com_google_android_gms_internal_zzbpo;
        }

        public void zzb(zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc) {
            zzbsc zza = zzbpn.zza(com_google_android_gms_internal_zzbsc, this.zzcfE);
            if (zza != com_google_android_gms_internal_zzbsc) {
                this.zzcfF.zzg(new zzbph(com_google_android_gms_internal_zzbrq.asString()), zza);
            }
        }
    }

    public static zzboy zza(zzboy com_google_android_gms_internal_zzboy, Map<String, Object> map) {
        zzboy zzYn = zzboy.zzYn();
        Iterator it = com_google_android_gms_internal_zzboy.iterator();
        zzboy com_google_android_gms_internal_zzboy2 = zzYn;
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            com_google_android_gms_internal_zzboy2 = com_google_android_gms_internal_zzboy2.zze((zzbph) entry.getKey(), zza((zzbsc) entry.getValue(), (Map) map));
        }
        return com_google_android_gms_internal_zzboy2;
    }

    public static zzbpp zza(zzbpp com_google_android_gms_internal_zzbpp, Map<String, Object> map) {
        zzbpp com_google_android_gms_internal_zzbpp2 = new zzbpp();
        com_google_android_gms_internal_zzbpp.zza(new zzbph(""), new C09821(com_google_android_gms_internal_zzbpp2, map));
        return com_google_android_gms_internal_zzbpp2;
    }

    public static zzbsc zza(zzbsc com_google_android_gms_internal_zzbsc, Map<String, Object> map) {
        Object value = com_google_android_gms_internal_zzbsc.zzaaN().getValue();
        if (value instanceof Map) {
            Map map2 = (Map) value;
            if (map2.containsKey(".sv")) {
                value = map.get((String) map2.get(".sv"));
            }
        }
        zzbsc zzau = zzbsg.zzau(value);
        if (com_google_android_gms_internal_zzbsc.zzaaM()) {
            value = zza(com_google_android_gms_internal_zzbsc.getValue(), (Map) map);
            return (value.equals(com_google_android_gms_internal_zzbsc.getValue()) && zzau.equals(com_google_android_gms_internal_zzbsc.zzaaN())) ? com_google_android_gms_internal_zzbsc : zzbsd.zza(value, zzau);
        } else if (com_google_android_gms_internal_zzbsc.isEmpty()) {
            return com_google_android_gms_internal_zzbsc;
        } else {
            zzbrr com_google_android_gms_internal_zzbrr = (zzbrr) com_google_android_gms_internal_zzbsc;
            zzbpo com_google_android_gms_internal_zzbpo = new zzbpo(com_google_android_gms_internal_zzbrr);
            com_google_android_gms_internal_zzbrr.zza(new C11972(map, com_google_android_gms_internal_zzbpo));
            return !com_google_android_gms_internal_zzbpo.zzZe().zzaaN().equals(zzau) ? com_google_android_gms_internal_zzbpo.zzZe().zzg(zzau) : com_google_android_gms_internal_zzbpo.zzZe();
        }
    }

    public static Object zza(Object obj, Map<String, Object> map) {
        if (!(obj instanceof Map)) {
            return obj;
        }
        Map map2 = (Map) obj;
        if (!map2.containsKey(".sv")) {
            return obj;
        }
        String str = (String) map2.get(".sv");
        return map.containsKey(str) ? map.get(str) : obj;
    }

    public static Map<String, Object> zza(zzbsw com_google_android_gms_internal_zzbsw) {
        Map<String, Object> hashMap = new HashMap();
        hashMap.put("timestamp", Long.valueOf(com_google_android_gms_internal_zzbsw.zzabH()));
        return hashMap;
    }
}
