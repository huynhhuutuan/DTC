package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

public class zzbf {
    static Map<String, String> zzbGA = new HashMap();
    private static String zzbGz;

    static void zzM(Context context, String str) {
        zzdd.zzd(context, "gtm_install_referrer", "referrer", str);
        zzO(context, str);
    }

    public static String zzN(Context context, String str) {
        if (zzbGz == null) {
            synchronized (zzbf.class) {
                if (zzbGz == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("gtm_install_referrer", 0);
                    if (sharedPreferences != null) {
                        zzbGz = sharedPreferences.getString("referrer", "");
                    } else {
                        zzbGz = "";
                    }
                }
            }
        }
        return zzaj(zzbGz, str);
    }

    public static void zzO(Context context, String str) {
        String zzaj = zzaj(str, "conv");
        if (zzaj != null && zzaj.length() > 0) {
            zzbGA.put(zzaj, str);
            zzdd.zzd(context, "gtm_click_referrers", zzaj, str);
        }
    }

    public static String zzaj(String str, String str2) {
        if (str2 == null) {
            return str.length() > 0 ? str : null;
        } else {
            String str3 = "http://hostname/?";
            String valueOf = String.valueOf(str);
            return Uri.parse(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3)).getQueryParameter(str2);
        }
    }

    public static void zzhk(String str) {
        synchronized (zzbf.class) {
            zzbGz = str;
        }
    }

    public static String zzr(Context context, String str, String str2) {
        String str3 = (String) zzbGA.get(str);
        if (str3 == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("gtm_click_referrers", 0);
            str3 = sharedPreferences != null ? sharedPreferences.getString(str, "") : "";
            zzbGA.put(str, str3);
        }
        return zzaj(str3, str2);
    }
}
