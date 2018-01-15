package com.google.android.gms.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

class zzcj {
    private static zzcj zzbHh;
    private volatile String zzbEY;
    private volatile zza zzbHi;
    private volatile String zzbHj;
    private volatile String zzbHk;

    enum zza {
        NONE,
        CONTAINER,
        CONTAINER_DEBUG
    }

    zzcj() {
        clear();
    }

    static zzcj zzRd() {
        zzcj com_google_android_gms_tagmanager_zzcj;
        synchronized (zzcj.class) {
            if (zzbHh == null) {
                zzbHh = new zzcj();
            }
            com_google_android_gms_tagmanager_zzcj = zzbHh;
        }
        return com_google_android_gms_tagmanager_zzcj;
    }

    private String zzhn(String str) {
        return str.split("&")[0].split("=")[1];
    }

    private String zzw(Uri uri) {
        return uri.getQuery().replace("&gtm_debug=x", "");
    }

    void clear() {
        this.zzbHi = zza.NONE;
        this.zzbHj = null;
        this.zzbEY = null;
        this.zzbHk = null;
    }

    String getContainerId() {
        return this.zzbEY;
    }

    zza zzRe() {
        return this.zzbHi;
    }

    String zzRf() {
        return this.zzbHj;
    }

    synchronized boolean zzv(Uri uri) {
        boolean z = true;
        synchronized (this) {
            try {
                String decode = URLDecoder.decode(uri.toString(), "UTF-8");
                String str;
                String valueOf;
                if (decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) {
                    str = "Container preview url: ";
                    valueOf = String.valueOf(decode);
                    zzbo.m12v(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    if (decode.matches(".*?&gtm_debug=x$")) {
                        this.zzbHi = zza.CONTAINER_DEBUG;
                    } else {
                        this.zzbHi = zza.CONTAINER;
                    }
                    this.zzbHk = zzw(uri);
                    if (this.zzbHi == zza.CONTAINER || this.zzbHi == zza.CONTAINER_DEBUG) {
                        decode = String.valueOf("/r?");
                        valueOf = String.valueOf(this.zzbHk);
                        this.zzbHj = valueOf.length() != 0 ? decode.concat(valueOf) : new String(decode);
                    }
                    this.zzbEY = zzhn(this.zzbHk);
                } else if (!decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$")) {
                    str = "Invalid preview uri: ";
                    String valueOf2 = String.valueOf(decode);
                    zzbo.zzbh(valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
                    z = false;
                } else if (zzhn(uri.getQuery()).equals(this.zzbEY)) {
                    decode = "Exit preview mode for container: ";
                    valueOf = String.valueOf(this.zzbEY);
                    zzbo.m12v(valueOf.length() != 0 ? decode.concat(valueOf) : new String(decode));
                    this.zzbHi = zza.NONE;
                    this.zzbHj = null;
                } else {
                    z = false;
                }
            } catch (UnsupportedEncodingException e) {
                z = false;
            }
        }
        return z;
    }
}
