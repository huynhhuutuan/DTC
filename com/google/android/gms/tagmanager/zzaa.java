package com.google.android.gms.tagmanager;

import android.content.Context;

public class zzaa implements zzat {
    private static final Object zzbEM = new Object();
    private static zzaa zzbGa;
    private zzcl zzbFo;
    private zzau zzbGb;

    private zzaa(Context context) {
        this(zzav.zzca(context), new zzda());
    }

    zzaa(zzau com_google_android_gms_tagmanager_zzau, zzcl com_google_android_gms_tagmanager_zzcl) {
        this.zzbGb = com_google_android_gms_tagmanager_zzau;
        this.zzbFo = com_google_android_gms_tagmanager_zzcl;
    }

    public static zzat zzbT(Context context) {
        zzat com_google_android_gms_tagmanager_zzat;
        synchronized (zzbEM) {
            if (zzbGa == null) {
                zzbGa = new zzaa(context);
            }
            com_google_android_gms_tagmanager_zzat = zzbGa;
        }
        return com_google_android_gms_tagmanager_zzat;
    }

    public boolean zzhf(String str) {
        if (this.zzbFo.zzpV()) {
            this.zzbGb.zzhj(str);
            return true;
        }
        zzbo.zzbh("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
        return false;
    }
}
