package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;

class zzav extends Thread implements zzau {
    private static zzav zzbGu;
    private volatile boolean mClosed = false;
    private final Context mContext;
    private volatile boolean zzNA = false;
    private final LinkedBlockingQueue<Runnable> zzbGt = new LinkedBlockingQueue();
    private volatile zzaw zzbGv;

    private zzav(Context context) {
        super("GAThread");
        if (context != null) {
            this.mContext = context.getApplicationContext();
        } else {
            this.mContext = context;
        }
        start();
    }

    static zzav zzca(Context context) {
        if (zzbGu == null) {
            zzbGu = new zzav(context);
        }
        return zzbGu;
    }

    private String zzg(Throwable th) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        th.printStackTrace(printStream);
        printStream.flush();
        return new String(byteArrayOutputStream.toByteArray());
    }

    public void run() {
        while (true) {
            boolean z = this.mClosed;
            try {
                Runnable runnable = (Runnable) this.zzbGt.take();
                if (!this.zzNA) {
                    runnable.run();
                }
            } catch (InterruptedException e) {
                zzbo.zzbg(e.toString());
            } catch (Throwable th) {
                String str = "Error on Google TagManager Thread: ";
                String valueOf = String.valueOf(zzg(th));
                zzbo.m11e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                zzbo.m11e("Google TagManager is shutting down.");
                this.zzNA = true;
            }
        }
    }

    public void zzhj(String str) {
        zzp(str, System.currentTimeMillis());
    }

    public void zzp(Runnable runnable) {
        this.zzbGt.add(runnable);
    }

    void zzp(String str, long j) {
        final zzav com_google_android_gms_tagmanager_zzav = this;
        final long j2 = j;
        final String str2 = str;
        zzp(new Runnable(this) {
            final /* synthetic */ zzav zzbGy;

            public void run() {
                if (this.zzbGy.zzbGv == null) {
                    zzdc zzRx = zzdc.zzRx();
                    zzRx.zza(this.zzbGy.mContext, com_google_android_gms_tagmanager_zzav);
                    this.zzbGy.zzbGv = zzRx.zzRA();
                }
                this.zzbGy.zzbGv.zzg(j2, str2);
            }
        });
    }
}
