package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;

public class zzbnu implements zzbpe {
    private final Handler handler = new Handler(Looper.getMainLooper());

    public void restart() {
    }

    public void shutdown() {
    }

    public void zzq(Runnable runnable) {
        this.handler.post(runnable);
    }
}
