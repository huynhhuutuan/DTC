package com.google.android.gms.internal;

import com.google.firebase.database.DatabaseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class zzbpw {
    private final List<String> zzcgx = new ArrayList();
    private int zzcgy = 0;

    private zzbpw(zzbph com_google_android_gms_internal_zzbph) throws DatabaseException {
        int i = 0;
        Iterator it = com_google_android_gms_internal_zzbph.iterator();
        while (it.hasNext()) {
            this.zzcgx.add(((zzbrq) it.next()).asString());
        }
        this.zzcgy = Math.max(1, this.zzcgx.size());
        while (i < this.zzcgx.size()) {
            this.zzcgy = zza((CharSequence) this.zzcgx.get(i)) + this.zzcgy;
            i++;
        }
        zzUr();
    }

    private void zzUr() throws DatabaseException {
        if (this.zzcgy > 768) {
            String valueOf = String.valueOf("Data has a key path longer than 768 bytes (");
            throw new DatabaseException(new StringBuilder(String.valueOf(valueOf).length() + 13).append(valueOf).append(this.zzcgy).append(").").toString());
        } else if (this.zzcgx.size() > 32) {
            String valueOf2 = String.valueOf("Path specified exceeds the maximum depth that can be written (32) or object contains a cycle ");
            String valueOf3 = String.valueOf(zzZq());
            throw new DatabaseException(valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2));
        }
    }

    private String zzZp() {
        String str = (String) this.zzcgx.remove(this.zzcgx.size() - 1);
        this.zzcgy -= zza(str);
        if (this.zzcgx.size() > 0) {
            this.zzcgy--;
        }
        return str;
    }

    private String zzZq() {
        if (this.zzcgx.size() == 0) {
            return "";
        }
        String valueOf = String.valueOf(zzf("/", this.zzcgx));
        return new StringBuilder(String.valueOf(valueOf).length() + 10).append("in path '").append(valueOf).append("'").toString();
    }

    private static int zza(CharSequence charSequence) {
        int i = 0;
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt <= '') {
                i2++;
            } else if (charAt <= '߿') {
                i2 += 2;
            } else if (Character.isHighSurrogate(charAt)) {
                i2 += 4;
                i++;
            } else {
                i2 += 3;
            }
            i++;
        }
        return i2;
    }

    public static void zza(zzbph com_google_android_gms_internal_zzbph, Object obj) throws DatabaseException {
        new zzbpw(com_google_android_gms_internal_zzbph).zzar(obj);
    }

    private void zzar(Object obj) throws DatabaseException {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            for (String str : map.keySet()) {
                if (!str.startsWith(".")) {
                    zziZ(str);
                    zzar(map.get(str));
                    zzZp();
                }
            }
        } else if (obj instanceof List) {
            List list = (List) obj;
            for (int i = 0; i < list.size(); i++) {
                zziZ(Integer.toString(i));
                zzar(list.get(i));
                zzZp();
            }
        }
    }

    private static String zzf(String str, List<String> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                stringBuilder.append(str);
            }
            stringBuilder.append((String) list.get(i));
        }
        return stringBuilder.toString();
    }

    private void zziZ(String str) throws DatabaseException {
        if (this.zzcgx.size() > 0) {
            this.zzcgy++;
        }
        this.zzcgx.add(str);
        this.zzcgy += zza(str);
        zzUr();
    }
}
