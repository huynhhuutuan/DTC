package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@zzme
public class zzod {
    public static void zza(Context context, Runnable runnable) {
        zzac.zzdj("Adapters must be initialized on the main thread.");
        Map zzkf = zzw.zzcQ().zzkw().zzkf();
        if (zzkf != null && !zzkf.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    zzqf.zzc("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            zzns zzjE = zzns.zzjE();
            if (zzjE != null) {
                zza(context, zzkf.values(), zzjE);
            }
        }
    }

    static void zza(Context context, Collection<zzjr> collection, zzns com_google_android_gms_internal_zzns) {
        String valueOf;
        Map hashMap = new HashMap();
        IObjectWrapper zzA = zzd.zzA(context);
        for (zzjr com_google_android_gms_internal_zzjr : collection) {
            for (zzjq com_google_android_gms_internal_zzjq : com_google_android_gms_internal_zzjr.zzKD) {
                String str = com_google_android_gms_internal_zzjq.zzKv;
                for (String valueOf2 : com_google_android_gms_internal_zzjq.zzKp) {
                    if (!hashMap.containsKey(valueOf2)) {
                        hashMap.put(valueOf2, new ArrayList());
                    }
                    if (str != null) {
                        ((Collection) hashMap.get(valueOf2)).add(str);
                    }
                }
            }
        }
        for (Entry entry : hashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            try {
                zzol zzaN = com_google_android_gms_internal_zzns.zzaN(str2);
                if (zzaN != null) {
                    zzkb zzjN = zzaN.zzjN();
                    if (!zzjN.isInitialized() && zzjN.zzhg()) {
                        zzjN.zza(zzA, zzaN.zzjO(), (List) entry.getValue());
                        String str3 = "Initialized rewarded video mediation adapter ";
                        valueOf2 = String.valueOf(str2);
                        zzqf.zzbf(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
                    }
                }
            } catch (Throwable th) {
                zzqf.zzc(new StringBuilder(String.valueOf(str2).length() + 56).append("Failed to initialize rewarded video mediation adapter \"").append(str2).append("\"").toString(), th);
            }
        }
    }
}
