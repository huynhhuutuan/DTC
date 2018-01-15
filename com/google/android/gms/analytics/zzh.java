package com.google.android.gms.analytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.internal.zzrk;
import com.google.android.gms.internal.zzrp;
import com.google.android.gms.internal.zztm;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzh {
    private static volatile zzh zzach;
    private final Context mContext;
    private final List<Object> zzaci = new CopyOnWriteArrayList();
    private final zzd zzacj = new zzd();
    private final zza zzack = new zza(this);
    private volatile zzrk zzacl;
    private UncaughtExceptionHandler zzacm;

    private class zza extends ThreadPoolExecutor {
        final /* synthetic */ zzh zzaco;

        public zza(zzh com_google_android_gms_analytics_zzh) {
            this.zzaco = com_google_android_gms_analytics_zzh;
            super(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());
            setThreadFactory(new zzb());
            allowCoreThreadTimeOut(true);
        }

        protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
            return new FutureTask<T>(this, runnable, t) {
                final /* synthetic */ zza zzacp;

                protected void setException(Throwable th) {
                    UncaughtExceptionHandler zzb = this.zzacp.zzaco.zzacm;
                    if (zzb != null) {
                        zzb.uncaughtException(Thread.currentThread(), th);
                    } else if (Log.isLoggable("GAv4", 6)) {
                        String valueOf = String.valueOf(th);
                        Log.e("GAv4", new StringBuilder(String.valueOf(valueOf).length() + 37).append("MeasurementExecutor: job failed with ").append(valueOf).toString());
                    }
                    super.setException(th);
                }
            };
        }
    }

    private static class zzb implements ThreadFactory {
        private static final AtomicInteger zzacq = new AtomicInteger();

        private zzb() {
        }

        public Thread newThread(Runnable runnable) {
            return new zzc(runnable, "measurement-" + zzacq.incrementAndGet());
        }
    }

    private static class zzc extends Thread {
        zzc(Runnable runnable, String str) {
            super(runnable, str);
        }

        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    zzh(Context context) {
        Context applicationContext = context.getApplicationContext();
        zzac.zzw(applicationContext);
        this.mContext = applicationContext;
    }

    public static zzh zzam(Context context) {
        zzac.zzw(context);
        if (zzach == null) {
            synchronized (zzh.class) {
                if (zzach == null) {
                    zzach = new zzh(context);
                }
            }
        }
        return zzach;
    }

    private void zzb(zze com_google_android_gms_analytics_zze) {
        zzac.zzdk("deliver should be called from worker thread");
        zzac.zzb(com_google_android_gms_analytics_zze.zzmH(), (Object) "Measurement must be submitted");
        List<zzi> zzmE = com_google_android_gms_analytics_zze.zzmE();
        if (!zzmE.isEmpty()) {
            Set hashSet = new HashSet();
            for (zzi com_google_android_gms_analytics_zzi : zzmE) {
                Uri zzmr = com_google_android_gms_analytics_zzi.zzmr();
                if (!hashSet.contains(zzmr)) {
                    hashSet.add(zzmr);
                    com_google_android_gms_analytics_zzi.zzb(com_google_android_gms_analytics_zze);
                }
            }
        }
    }

    public static void zzmR() {
        if (!(Thread.currentThread() instanceof zzc)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public Context getContext() {
        return this.mContext;
    }

    public void zza(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zzacm = uncaughtExceptionHandler;
    }

    public <V> Future<V> zzc(Callable<V> callable) {
        zzac.zzw(callable);
        if (!(Thread.currentThread() instanceof zzc)) {
            return this.zzack.submit(callable);
        }
        Future futureTask = new FutureTask(callable);
        futureTask.run();
        return futureTask;
    }

    void zze(zze com_google_android_gms_analytics_zze) {
        if (com_google_android_gms_analytics_zze.zzmL()) {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        } else if (com_google_android_gms_analytics_zze.zzmH()) {
            throw new IllegalStateException("Measurement can only be submitted once");
        } else {
            final zze zzmC = com_google_android_gms_analytics_zze.zzmC();
            zzmC.zzmI();
            this.zzack.execute(new Runnable(this) {
                final /* synthetic */ zzh zzaco;

                public void run() {
                    zzmC.zzmJ().zza(zzmC);
                    Iterator it = this.zzaco.zzaci.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    this.zzaco.zzb(zzmC);
                }
            });
        }
    }

    public void zzg(Runnable runnable) {
        zzac.zzw(runnable);
        this.zzack.submit(runnable);
    }

    public zzrk zzmP() {
        if (this.zzacl == null) {
            synchronized (this) {
                if (this.zzacl == null) {
                    zzrk com_google_android_gms_internal_zzrk = new zzrk();
                    PackageManager packageManager = this.mContext.getPackageManager();
                    String packageName = this.mContext.getPackageName();
                    com_google_android_gms_internal_zzrk.setAppId(packageName);
                    com_google_android_gms_internal_zzrk.setAppInstallerId(packageManager.getInstallerPackageName(packageName));
                    String str = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(this.mContext.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            str = packageInfo.versionName;
                        }
                    } catch (NameNotFoundException e) {
                        String str2 = "GAv4";
                        String str3 = "Error retrieving package info: appName set to ";
                        String valueOf = String.valueOf(packageName);
                        Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    }
                    com_google_android_gms_internal_zzrk.setAppName(packageName);
                    com_google_android_gms_internal_zzrk.setAppVersion(str);
                    this.zzacl = com_google_android_gms_internal_zzrk;
                }
            }
        }
        return this.zzacl;
    }

    public zzrp zzmQ() {
        DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
        zzrp com_google_android_gms_internal_zzrp = new zzrp();
        com_google_android_gms_internal_zzrp.setLanguage(zztm.zza(Locale.getDefault()));
        com_google_android_gms_internal_zzrp.zzaB(displayMetrics.widthPixels);
        com_google_android_gms_internal_zzrp.zzaC(displayMetrics.heightPixels);
        return com_google_android_gms_internal_zzrp;
    }
}
