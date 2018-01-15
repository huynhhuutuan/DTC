package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.zzw;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@zzme
public final class zzpn {
    private static final ThreadPoolExecutor zzXu = new ThreadPoolExecutor(10, 10, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), zzaW("Default"));
    private static final ThreadPoolExecutor zzXv = new ThreadPoolExecutor(5, 5, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), zzaW("Loader"));

    class C06231 implements Callable<Void> {
        final /* synthetic */ Runnable zzXw;

        C06231(Runnable runnable) {
            this.zzXw = runnable;
        }

        public /* synthetic */ Object call() throws Exception {
            return zzbk();
        }

        public Void zzbk() {
            this.zzXw.run();
            return null;
        }
    }

    class C06242 implements Callable<Void> {
        final /* synthetic */ Runnable zzXw;

        C06242(Runnable runnable) {
            this.zzXw = runnable;
        }

        public /* synthetic */ Object call() throws Exception {
            return zzbk();
        }

        public Void zzbk() {
            this.zzXw.run();
            return null;
        }
    }

    class C06253 implements Runnable {
        final /* synthetic */ zzqj zzXx;
        final /* synthetic */ Callable zzXy;

        C06253(zzqj com_google_android_gms_internal_zzqj, Callable callable) {
            this.zzXx = com_google_android_gms_internal_zzqj;
            this.zzXy = callable;
        }

        public void run() {
            try {
                Process.setThreadPriority(10);
                this.zzXx.zzh(this.zzXy.call());
            } catch (Throwable e) {
                zzw.zzcQ().zza(e, "AdThreadPool.submit");
                this.zzXx.zze(e);
            }
        }
    }

    class C06264 implements Runnable {
        final /* synthetic */ zzqj zzXx;
        final /* synthetic */ Future zzXz;

        C06264(zzqj com_google_android_gms_internal_zzqj, Future future) {
            this.zzXx = com_google_android_gms_internal_zzqj;
            this.zzXz = future;
        }

        public void run() {
            if (this.zzXx.isCancelled()) {
                this.zzXz.cancel(true);
            }
        }
    }

    class C06275 implements ThreadFactory {
        private final AtomicInteger zzXA = new AtomicInteger(1);
        final /* synthetic */ String zzXB;

        C06275(String str) {
            this.zzXB = str;
        }

        public Thread newThread(Runnable runnable) {
            String str = this.zzXB;
            return new Thread(runnable, new StringBuilder(String.valueOf(str).length() + 23).append("AdWorker(").append(str).append(") #").append(this.zzXA.getAndIncrement()).toString());
        }
    }

    static {
        zzXu.allowCoreThreadTimeOut(true);
        zzXv.allowCoreThreadTimeOut(true);
    }

    public static zzqm<Void> zza(int i, Runnable runnable) {
        return i == 1 ? zza(zzXv, new C06231(runnable)) : zza(zzXu, new C06242(runnable));
    }

    public static zzqm<Void> zza(Runnable runnable) {
        return zza(0, runnable);
    }

    public static <T> zzqm<T> zza(Callable<T> callable) {
        return zza(zzXu, (Callable) callable);
    }

    public static <T> zzqm<T> zza(ExecutorService executorService, Callable<T> callable) {
        Object com_google_android_gms_internal_zzqj = new zzqj();
        try {
            com_google_android_gms_internal_zzqj.zzd(new C06264(com_google_android_gms_internal_zzqj, executorService.submit(new C06253(com_google_android_gms_internal_zzqj, callable))));
        } catch (Throwable e) {
            zzqf.zzc("Thread execution is rejected.", e);
            com_google_android_gms_internal_zzqj.cancel(true);
        }
        return com_google_android_gms_internal_zzqj;
    }

    private static ThreadFactory zzaW(String str) {
        return new C06275(str);
    }
}
