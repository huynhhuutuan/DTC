package com.google.android.gms.internal;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.FirebaseDatabase;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public abstract class zzbsy implements zzbpm {
    private ScheduledThreadPoolExecutor zzckE = new ScheduledThreadPoolExecutor(this, 1, new zza()) {
        final /* synthetic */ zzbsy zzckF;

        protected void afterExecute(Runnable runnable, Throwable th) {
            super.afterExecute(runnable, th);
            if (th == null && (runnable instanceof Future)) {
                Future future = (Future) runnable;
                try {
                    if (future.isDone()) {
                        future.get();
                    }
                } catch (CancellationException e) {
                } catch (ExecutionException e2) {
                    th = e2.getCause();
                } catch (InterruptedException e3) {
                    Thread.currentThread().interrupt();
                }
            }
            if (th != null) {
                this.zzckF.zzj(th);
            }
        }
    };

    private class zza implements ThreadFactory {
        final /* synthetic */ zzbsy zzckF;

        class C05261 implements UncaughtExceptionHandler {
            final /* synthetic */ zza zzckG;

            C05261(zza com_google_android_gms_internal_zzbsy_zza) {
                this.zzckG = com_google_android_gms_internal_zzbsy_zza;
            }

            public void uncaughtException(Thread thread, Throwable th) {
                this.zzckG.zzckF.zzj(th);
            }
        }

        private zza(zzbsy com_google_android_gms_internal_zzbsy) {
            this.zzckF = com_google_android_gms_internal_zzbsy;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = this.zzckF.getThreadFactory().newThread(runnable);
            zzbpt zzYN = this.zzckF.zzYN();
            zzYN.zza(newThread, "FirebaseDatabaseWorker");
            zzYN.zza(newThread, true);
            zzYN.zza(newThread, new C05261(this));
            return newThread;
        }
    }

    public zzbsy() {
        this.zzckE.setKeepAliveTime(3, TimeUnit.SECONDS);
    }

    public static String zzl(Throwable th) {
        if (th instanceof OutOfMemoryError) {
            return "Firebase Database encountered an OutOfMemoryError. You may need to reduce the amount of data you are syncing to the client (e.g. by using queries or syncing a deeper path). See https://firebase.google.com/docs/database/ios/structure-data#best_practices_for_data_structure and https://firebase.google.com/docs/database/android/retrieve-data#filtering_data";
        }
        if (th instanceof DatabaseException) {
            return "";
        }
        String valueOf = String.valueOf(FirebaseDatabase.getSdkVersion());
        return new StringBuilder(String.valueOf(valueOf).length() + 104).append("Uncaught exception in Firebase Database runloop (").append(valueOf).append("). Please report to firebase-database-client@google.com").toString();
    }

    protected ThreadFactory getThreadFactory() {
        return Executors.defaultThreadFactory();
    }

    public void restart() {
        this.zzckE.setCorePoolSize(1);
    }

    public void shutdown() {
        this.zzckE.setCorePoolSize(0);
    }

    public ScheduledExecutorService zzXs() {
        return this.zzckE;
    }

    protected zzbpt zzYN() {
        return zzbpt.zzcgp;
    }

    public abstract void zzj(Throwable th);

    public void zzs(Runnable runnable) {
        this.zzckE.execute(runnable);
    }
}
