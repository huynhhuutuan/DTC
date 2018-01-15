package com.google.android.gms.internal;

import android.util.Base64;
import java.net.URI;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

class zzbsp {
    private String protocol = null;
    private URI zzcjZ = null;
    private String zzcko = null;
    private Map<String, String> zzckp = null;

    public zzbsp(URI uri, String str, Map<String, String> map) {
        this.zzcjZ = uri;
        this.protocol = str;
        this.zzckp = map;
        this.zzcko = zzaby();
    }

    private int zzG(int i, int i2) {
        return (int) ((Math.random() * ((double) i2)) + ((double) i));
    }

    private String zza(LinkedHashMap<String, String> linkedHashMap) {
        String str = new String();
        String str2 = str;
        for (String str3 : linkedHashMap.keySet()) {
            String valueOf = String.valueOf(str2);
            str2 = (String) linkedHashMap.get(str3);
            str2 = new StringBuilder(((String.valueOf(valueOf).length() + 4) + String.valueOf(str3).length()) + String.valueOf(str2).length()).append(valueOf).append(str3).append(": ").append(str2).append("\r\n").toString();
        }
        return str2;
    }

    private String zzaby() {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) zzG(0, 255);
        }
        return Base64.encodeToString(bArr, 2);
    }

    public byte[] zzabx() {
        Object obj;
        String path = this.zzcjZ.getPath();
        String query = this.zzcjZ.getQuery();
        String valueOf = String.valueOf(path);
        if (query == null) {
            obj = "";
        } else {
            String str = "?";
            path = String.valueOf(query);
            obj = path.length() != 0 ? str.concat(path) : new String(str);
        }
        path = String.valueOf(obj);
        valueOf = path.length() != 0 ? valueOf.concat(path) : new String(valueOf);
        obj = this.zzcjZ.getHost();
        if (this.zzcjZ.getPort() != -1) {
            path = String.valueOf(obj);
            obj = new StringBuilder(String.valueOf(path).length() + 12).append(path).append(":").append(this.zzcjZ.getPort()).toString();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Host", obj);
        linkedHashMap.put("Upgrade", "websocket");
        linkedHashMap.put("Connection", "Upgrade");
        linkedHashMap.put("Sec-WebSocket-Version", "13");
        linkedHashMap.put("Sec-WebSocket-Key", this.zzcko);
        if (this.protocol != null) {
            linkedHashMap.put("Sec-WebSocket-Protocol", this.protocol);
        }
        if (this.zzckp != null) {
            for (String path2 : this.zzckp.keySet()) {
                if (!linkedHashMap.containsKey(path2)) {
                    linkedHashMap.put(path2, (String) this.zzckp.get(path2));
                }
            }
        }
        query = String.valueOf(new StringBuilder(String.valueOf(valueOf).length() + 15).append("GET ").append(valueOf).append(" HTTP/1.1\r\n").toString());
        path2 = String.valueOf(zza(linkedHashMap));
        path2 = String.valueOf(path2.length() != 0 ? query.concat(path2) : new String(query)).concat("\r\n");
        Object obj2 = new byte[path2.getBytes().length];
        System.arraycopy(path2.getBytes(), 0, obj2, 0, path2.getBytes().length);
        return obj2;
    }

    public void zzc(HashMap<String, String> hashMap) {
        if (!((String) hashMap.get("Upgrade")).toLowerCase(Locale.US).equals("websocket")) {
            throw new zzbso("connection failed: missing header field in server handshake: Upgrade");
        } else if (!((String) hashMap.get("Connection")).toLowerCase(Locale.US).equals("upgrade")) {
            throw new zzbso("connection failed: missing header field in server handshake: Connection");
        }
    }

    public void zzjc(String str) {
        int intValue = Integer.valueOf(str.substring(9, 12)).intValue();
        if (intValue == 407) {
            throw new zzbso("connection failed: proxy authentication not supported");
        } else if (intValue == 404) {
            throw new zzbso("connection failed: 404 not found");
        } else if (intValue != 101) {
            throw new zzbso("connection failed: unknown status code " + intValue);
        }
    }
}
