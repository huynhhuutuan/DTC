package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.os.ConditionVariable;
import android.support.annotation.Nullable;
import java.util.concurrent.Callable;

@zzme
public class zzgc {
    private final ConditionVariable zzBc = new ConditionVariable();
    @Nullable
    private SharedPreferences zzBd = null;
    private final Object zzrJ = new Object();
    private volatile boolean zztZ = false;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initialize(android.content.Context r4) {
        /*
        r3 = this;
        r0 = r3.zztZ;
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r1 = r3.zzrJ;
        monitor-enter(r1);
        r0 = r3.zztZ;	 Catch:{ all -> 0x000e }
        if (r0 == 0) goto L_0x0011;
    L_0x000c:
        monitor-exit(r1);	 Catch:{ all -> 0x000e }
        goto L_0x0004;
    L_0x000e:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x000e }
        throw r0;
    L_0x0011:
        r0 = com.google.android.gms.common.zzg.getRemoteContext(r4);	 Catch:{ all -> 0x0032 }
        if (r0 != 0) goto L_0x001e;
    L_0x0017:
        r0 = r3.zzBc;	 Catch:{ all -> 0x000e }
        r0.open();	 Catch:{ all -> 0x000e }
        monitor-exit(r1);	 Catch:{ all -> 0x000e }
        goto L_0x0004;
    L_0x001e:
        r2 = com.google.android.gms.ads.internal.zzw.zzcW();	 Catch:{ all -> 0x0032 }
        r0 = r2.zzn(r0);	 Catch:{ all -> 0x0032 }
        r3.zzBd = r0;	 Catch:{ all -> 0x0032 }
        r0 = 1;
        r3.zztZ = r0;	 Catch:{ all -> 0x0032 }
        r0 = r3.zzBc;	 Catch:{ all -> 0x000e }
        r0.open();	 Catch:{ all -> 0x000e }
        monitor-exit(r1);	 Catch:{ all -> 0x000e }
        goto L_0x0004;
    L_0x0032:
        r0 = move-exception;
        r2 = r3.zzBc;	 Catch:{ all -> 0x000e }
        r2.open();	 Catch:{ all -> 0x000e }
        throw r0;	 Catch:{ all -> 0x000e }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzgc.initialize(android.content.Context):void");
    }

    public <T> T zzd(final zzfz<T> com_google_android_gms_internal_zzfz_T) {
        if (this.zzBc.block(5000)) {
            if (!this.zztZ) {
                synchronized (this.zzrJ) {
                    if (!this.zztZ) {
                        T zzfr = com_google_android_gms_internal_zzfz_T.zzfr();
                        return zzfr;
                    }
                }
            }
            return zzqb.zzb(new Callable<T>(this) {
                final /* synthetic */ zzgc zzBf;

                public T call() {
                    return com_google_android_gms_internal_zzfz_T.zza(this.zzBf.zzBd);
                }
            });
        }
        throw new IllegalStateException("Flags.initialize() was not called!");
    }
}
