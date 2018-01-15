package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.util.zze;
import com.google.android.gms.common.util.zzi;
import java.util.HashMap;
import java.util.Map;

public class zzbje {
    private final Context mContext;
    private String zzbFC;
    Map<String, Object> zzbLY;
    private final Map<String, Object> zzbLZ;
    private final zzbjg zzbNk;
    private final zze zzuP;

    public zzbje(Context context) {
        this(context, new HashMap(), new zzbjg(context), zzi.zzzc());
    }

    zzbje(Context context, Map<String, Object> map, zzbjg com_google_android_gms_internal_zzbjg, zze com_google_android_gms_common_util_zze) {
        this.zzbFC = null;
        this.zzbLY = new HashMap();
        this.mContext = context;
        this.zzuP = com_google_android_gms_common_util_zze;
        this.zzbNk = com_google_android_gms_internal_zzbjg;
        this.zzbLZ = map;
    }

    public void zzig(String str) {
        this.zzbFC = str;
    }
}
