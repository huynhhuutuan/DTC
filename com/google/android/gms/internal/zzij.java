package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzw;
import java.util.Map;

@zzme
public class zzij implements zzid {
    public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
        if (zzw.zzdl().zzjQ()) {
            int i = -1;
            try {
                i = Integer.parseInt((String) map.get("eventType"));
            } catch (Throwable e) {
                zzqf.zzb("Parse Scion log event type error", e);
            }
            String str = (String) map.get("eventId");
            switch (i) {
                case 0:
                    zzw.zzdl().zzf(com_google_android_gms_internal_zzqw.getContext(), str);
                    return;
                case 1:
                    zzw.zzdl().zzg(com_google_android_gms_internal_zzqw.getContext(), str);
                    return;
                case 2:
                    zzw.zzdl().zzi(com_google_android_gms_internal_zzqw.getContext(), str);
                    return;
                default:
                    return;
            }
        }
    }
}
