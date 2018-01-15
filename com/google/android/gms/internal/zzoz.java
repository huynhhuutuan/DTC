package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

@zzme
public final class zzoz implements zzpa {
    public zzqm<Info> zzG(final Context context) {
        final zzqm com_google_android_gms_internal_zzqj = new zzqj();
        if (zzel.zzeT().zzag(context)) {
            zzpn.zza(new Runnable(this) {
                public void run() {
                    Throwable e;
                    try {
                        com_google_android_gms_internal_zzqj.zzh(AdvertisingIdClient.getAdvertisingIdInfo(context));
                        return;
                    } catch (IOException e2) {
                        e = e2;
                    } catch (IllegalStateException e3) {
                        e = e3;
                    } catch (GooglePlayServicesNotAvailableException e4) {
                        e = e4;
                    } catch (GooglePlayServicesRepairableException e5) {
                        e = e5;
                    }
                    com_google_android_gms_internal_zzqj.zze(e);
                    zzqf.zzb("Exception while getting advertising Id info", e);
                }
            });
        }
        return com_google_android_gms_internal_zzqj;
    }

    public zzqm<String> zzg(zzmk com_google_android_gms_internal_zzmk) {
        return new zzqk(com_google_android_gms_internal_zzmk.zzRA);
    }
}
