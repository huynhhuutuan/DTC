package com.google.android.gms.internal;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class zzbpu implements zzbpe {
    private final ThreadPoolExecutor zzcgq;

    public zzbpu(final ThreadFactory threadFactory, final zzbpt com_google_android_gms_internal_zzbpt) {
        int i = 1;
        this.zzcgq = new ThreadPoolExecutor(1, i, 3, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory(this) {
            public Thread newThread(Runnable runnable) {
                Thread newThread = threadFactory.newThread(runnable);
                com_google_android_gms_internal_zzbpt.zza(newThread, "FirebaseDatabaseEventTarget");
                com_google_android_gms_internal_zzbpt.zza(newThread, true);
                return newThread;
            }
        });
    }

    public void restart() {
        this.zzcgq.setCorePoolSize(1);
    }

    public void shutdown() {
        this.zzcgq.setCorePoolSize(0);
    }

    public void zzq(Runnable runnable) {
        this.zzcgq.execute(runnable);
    }
}
