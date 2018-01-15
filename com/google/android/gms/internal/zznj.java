package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzw;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

@zzme
public final class zznj {
    private WeakHashMap<Context, zza> zzVb = new WeakHashMap();

    private class zza {
        public final long zzVd = zzw.zzcS().currentTimeMillis();
        public final zzni zzVe;

        public zza(zznj com_google_android_gms_internal_zznj, zzni com_google_android_gms_internal_zzni) {
            this.zzVe = com_google_android_gms_internal_zzni;
        }

        public boolean hasExpired() {
            return ((Long) zzgd.zzDw.get()).longValue() + this.zzVd < zzw.zzcS().currentTimeMillis();
        }
    }

    public Future<zzni> zzA(final Context context) {
        return zzpn.zza(new Callable<zzni>(this) {
            final /* synthetic */ zznj zzVc;

            public /* synthetic */ Object call() throws Exception {
                return zzjD();
            }

            public zzni zzjD() {
                zza com_google_android_gms_internal_zznj_zza = (zza) this.zzVc.zzVb.get(context);
                zzni zzjC = (com_google_android_gms_internal_zznj_zza == null || com_google_android_gms_internal_zznj_zza.hasExpired() || !((Boolean) zzgd.zzDv.get()).booleanValue()) ? new com.google.android.gms.internal.zzni.zza(context).zzjC() : new com.google.android.gms.internal.zzni.zza(context, com_google_android_gms_internal_zznj_zza.zzVe).zzjC();
                this.zzVc.zzVb.put(context, new zza(this.zzVc, zzjC));
                return zzjC;
            }
        });
    }
}
