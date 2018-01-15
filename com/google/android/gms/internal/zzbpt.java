package com.google.android.gms.internal;

import java.lang.Thread.UncaughtExceptionHandler;

public interface zzbpt {
    public static final zzbpt zzcgp = new C09861();

    class C09861 implements zzbpt {
        C09861() {
        }

        public void zza(Thread thread, String str) {
            thread.setName(str);
        }

        public void zza(Thread thread, UncaughtExceptionHandler uncaughtExceptionHandler) {
            thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }

        public void zza(Thread thread, boolean z) {
            thread.setDaemon(z);
        }
    }

    void zza(Thread thread, String str);

    void zza(Thread thread, UncaughtExceptionHandler uncaughtExceptionHandler);

    void zza(Thread thread, boolean z);
}
