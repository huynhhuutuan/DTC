package com.google.android.gms.internal;

import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class zzbou {
    private final zzbrn zzcaJ;
    private final ScheduledExecutorService zzcax;
    private boolean zzcdA;
    private final long zzcdt;
    private final long zzcdu;
    private final double zzcdv;
    private final double zzcdw;
    private final Random zzcdx;
    private ScheduledFuture<?> zzcdy;
    private long zzcdz;

    public static class zza {
        private final zzbrn zzcaJ;
        private final ScheduledExecutorService zzcdC;
        private long zzcdD = 30000;
        private long zzcdt = 1000;
        private double zzcdv = 0.5d;
        private double zzcdw = 1.3d;

        public zza(ScheduledExecutorService scheduledExecutorService, zzbro com_google_android_gms_internal_zzbro, String str) {
            this.zzcdC = scheduledExecutorService;
            this.zzcaJ = new zzbrn(com_google_android_gms_internal_zzbro, str);
        }

        public zzbou zzYh() {
            return new zzbou(this.zzcdC, this.zzcaJ, this.zzcdt, this.zzcdD, this.zzcdw, this.zzcdv);
        }

        public zza zzaL(long j) {
            this.zzcdt = j;
            return this;
        }

        public zza zzaM(long j) {
            this.zzcdD = j;
            return this;
        }

        public zza zzj(double d) {
            this.zzcdw = d;
            return this;
        }

        public zza zzk(double d) {
            if (d < 0.0d || d > 1.0d) {
                throw new IllegalArgumentException("Argument out of range: " + d);
            }
            this.zzcdv = d;
            return this;
        }
    }

    private zzbou(ScheduledExecutorService scheduledExecutorService, zzbrn com_google_android_gms_internal_zzbrn, long j, long j2, double d, double d2) {
        this.zzcdx = new Random();
        this.zzcdA = true;
        this.zzcax = scheduledExecutorService;
        this.zzcaJ = com_google_android_gms_internal_zzbrn;
        this.zzcdt = j;
        this.zzcdu = j2;
        this.zzcdw = d;
        this.zzcdv = d2;
    }

    public void cancel() {
        if (this.zzcdy != null) {
            this.zzcaJ.zzi("Cancelling existing retry attempt", new Object[0]);
            this.zzcdy.cancel(false);
            this.zzcdy = null;
        } else {
            this.zzcaJ.zzi("No existing retry attempt to cancel", new Object[0]);
        }
        this.zzcdz = 0;
    }

    public void zzVT() {
        this.zzcdA = true;
        this.zzcdz = 0;
    }

    public void zzYg() {
        this.zzcdz = this.zzcdu;
    }

    public void zzr(final Runnable runnable) {
        long j = 0;
        Runnable c04901 = new Runnable(this) {
            final /* synthetic */ zzbou zzcdB;

            public void run() {
                this.zzcdB.zzcdy = null;
                runnable.run();
            }
        };
        if (this.zzcdy != null) {
            this.zzcaJ.zzi("Cancelling previous scheduled retry", new Object[0]);
            this.zzcdy.cancel(false);
            this.zzcdy = null;
        }
        if (!this.zzcdA) {
            if (this.zzcdz == 0) {
                this.zzcdz = this.zzcdt;
            } else {
                this.zzcdz = Math.min((long) (((double) this.zzcdz) * this.zzcdw), this.zzcdu);
            }
            j = (long) (((1.0d - this.zzcdv) * ((double) this.zzcdz)) + ((this.zzcdv * ((double) this.zzcdz)) * this.zzcdx.nextDouble()));
        }
        this.zzcdA = false;
        this.zzcaJ.zzi("Scheduling retry in %dms", Long.valueOf(j));
        this.zzcdy = this.zzcax.schedule(c04901, j, TimeUnit.MILLISECONDS);
    }
}
