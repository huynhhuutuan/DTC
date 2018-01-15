package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

public final class TaskExecutors {
    public static final Executor MAIN_THREAD = new zza();
    static final Executor zzbNH = new C07071();

    class C07071 implements Executor {
        C07071() {
        }

        public void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }

    private static final class zza implements Executor {
        private final Handler mHandler = new Handler(Looper.getMainLooper());

        public void execute(@NonNull Runnable runnable) {
            this.mHandler.post(runnable);
        }
    }

    private TaskExecutors() {
    }
}
