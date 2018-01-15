package com.google.android.gms.internal;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class zzbjg {
    public static final Integer zzbNr = Integer.valueOf(0);
    public static final Integer zzbNs = Integer.valueOf(1);
    private final Context mContext;
    private final ExecutorService zzbtM;

    public zzbjg(Context context) {
        this(context, Executors.newSingleThreadExecutor());
    }

    zzbjg(Context context, ExecutorService executorService) {
        this.mContext = context;
        this.zzbtM = executorService;
    }
}
