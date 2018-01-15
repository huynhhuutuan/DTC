package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.internal.zzac;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import java.util.Map;

@zzme
public class zzji {
    private final Context mContext;
    private final String zzJK;
    private zzpt<zzjf> zzJL;
    private zzpt<zzjf> zzJM;
    @Nullable
    private zzd zzJN;
    private int zzJO;
    private final Object zzrJ;
    private final zzqh zztt;

    static class zza {
        static int zzJZ = 60000;
        static int zzKa = AbstractSpiCall.DEFAULT_TIMEOUT;
    }

    public static class zzb<T> implements zzpt<T> {
        public void zzd(T t) {
        }
    }

    public static class zzc extends zzqq<zzjj> {
        private final zzd zzKb;
        private boolean zzKc;
        private final Object zzrJ = new Object();

        class C10861 implements com.google.android.gms.internal.zzqp.zzc<zzjj> {
            C10861(zzc com_google_android_gms_internal_zzji_zzc) {
            }

            public void zzb(zzjj com_google_android_gms_internal_zzjj) {
                zzpk.m28v("Ending javascript session.");
                ((zzjk) com_google_android_gms_internal_zzjj).zzgT();
            }

            public /* synthetic */ void zzd(Object obj) {
                zzb((zzjj) obj);
            }
        }

        class C10872 implements com.google.android.gms.internal.zzqp.zzc<zzjj> {
            final /* synthetic */ zzc zzKd;

            C10872(zzc com_google_android_gms_internal_zzji_zzc) {
                this.zzKd = com_google_android_gms_internal_zzji_zzc;
            }

            public void zzb(zzjj com_google_android_gms_internal_zzjj) {
                zzpk.m28v("Releasing engine reference.");
                this.zzKd.zzKb.zzgQ();
            }

            public /* synthetic */ void zzd(Object obj) {
                zzb((zzjj) obj);
            }
        }

        class C10883 implements com.google.android.gms.internal.zzqp.zza {
            final /* synthetic */ zzc zzKd;

            C10883(zzc com_google_android_gms_internal_zzji_zzc) {
                this.zzKd = com_google_android_gms_internal_zzji_zzc;
            }

            public void run() {
                this.zzKd.zzKb.zzgQ();
            }
        }

        public zzc(zzd com_google_android_gms_internal_zzji_zzd) {
            this.zzKb = com_google_android_gms_internal_zzji_zzd;
        }

        public void release() {
            synchronized (this.zzrJ) {
                if (this.zzKc) {
                    return;
                }
                this.zzKc = true;
                zza(new C10861(this), new com.google.android.gms.internal.zzqp.zzb());
                zza(new C10872(this), new C10883(this));
            }
        }
    }

    public static class zzd extends zzqq<zzjf> {
        private zzpt<zzjf> zzJM;
        private boolean zzKe;
        private int zzKf;
        private final Object zzrJ = new Object();

        class C10913 implements com.google.android.gms.internal.zzqp.zzc<zzjf> {
            final /* synthetic */ zzd zzKh;

            C10913(zzd com_google_android_gms_internal_zzji_zzd) {
                this.zzKh = com_google_android_gms_internal_zzji_zzd;
            }

            public void zza(final zzjf com_google_android_gms_internal_zzjf) {
                zzw.zzcM().runOnUiThread(new Runnable(this) {
                    final /* synthetic */ C10913 zzKj;

                    public void run() {
                        this.zzKj.zzKh.zzJM.zzd(com_google_android_gms_internal_zzjf);
                        com_google_android_gms_internal_zzjf.destroy();
                    }
                });
            }

            public /* synthetic */ void zzd(Object obj) {
                zza((zzjf) obj);
            }
        }

        public zzd(zzpt<zzjf> com_google_android_gms_internal_zzpt_com_google_android_gms_internal_zzjf) {
            this.zzJM = com_google_android_gms_internal_zzpt_com_google_android_gms_internal_zzjf;
            this.zzKe = false;
            this.zzKf = 0;
        }

        public zzc zzgP() {
            final zzc com_google_android_gms_internal_zzji_zzc = new zzc(this);
            synchronized (this.zzrJ) {
                zza(new com.google.android.gms.internal.zzqp.zzc<zzjf>(this) {
                    public void zza(zzjf com_google_android_gms_internal_zzjf) {
                        zzpk.m28v("Getting a new session for JS Engine.");
                        com_google_android_gms_internal_zzji_zzc.zzg(com_google_android_gms_internal_zzjf.zzgM());
                    }

                    public /* synthetic */ void zzd(Object obj) {
                        zza((zzjf) obj);
                    }
                }, new com.google.android.gms.internal.zzqp.zza(this) {
                    public void run() {
                        zzpk.m28v("Rejecting reference for JS Engine.");
                        com_google_android_gms_internal_zzji_zzc.reject();
                    }
                });
                zzac.zzaw(this.zzKf >= 0);
                this.zzKf++;
            }
            return com_google_android_gms_internal_zzji_zzc;
        }

        protected void zzgQ() {
            boolean z = true;
            synchronized (this.zzrJ) {
                if (this.zzKf < 1) {
                    z = false;
                }
                zzac.zzaw(z);
                zzpk.m28v("Releasing 1 reference for JS Engine");
                this.zzKf--;
                zzgS();
            }
        }

        public void zzgR() {
            boolean z = true;
            synchronized (this.zzrJ) {
                if (this.zzKf < 0) {
                    z = false;
                }
                zzac.zzaw(z);
                zzpk.m28v("Releasing root reference. JS Engine will be destroyed once other references are released.");
                this.zzKe = true;
                zzgS();
            }
        }

        protected void zzgS() {
            synchronized (this.zzrJ) {
                zzac.zzaw(this.zzKf >= 0);
                if (this.zzKe && this.zzKf == 0) {
                    zzpk.m28v("No reference is left (including root). Cleaning up engine.");
                    zza(new C10913(this), new com.google.android.gms.internal.zzqp.zzb());
                } else {
                    zzpk.m28v("There are still references to the engine. Not destroying.");
                }
            }
        }
    }

    public static class zze extends zzqq<zzjj> {
        private zzc zzKk;

        public zze(zzc com_google_android_gms_internal_zzji_zzc) {
            this.zzKk = com_google_android_gms_internal_zzji_zzc;
        }

        public void finalize() {
            this.zzKk.release();
            this.zzKk = null;
        }

        public int getStatus() {
            return this.zzKk.getStatus();
        }

        public void reject() {
            this.zzKk.reject();
        }

        public void zza(com.google.android.gms.internal.zzqp.zzc<zzjj> com_google_android_gms_internal_zzqp_zzc_com_google_android_gms_internal_zzjj, com.google.android.gms.internal.zzqp.zza com_google_android_gms_internal_zzqp_zza) {
            this.zzKk.zza(com_google_android_gms_internal_zzqp_zzc_com_google_android_gms_internal_zzjj, com_google_android_gms_internal_zzqp_zza);
        }

        public /* synthetic */ void zzg(Object obj) {
            zzj((zzjj) obj);
        }

        public void zzj(zzjj com_google_android_gms_internal_zzjj) {
            this.zzKk.zzg(com_google_android_gms_internal_zzjj);
        }
    }

    public zzji(Context context, zzqh com_google_android_gms_internal_zzqh, String str) {
        this.zzrJ = new Object();
        this.zzJO = 1;
        this.zzJK = str;
        this.mContext = context.getApplicationContext();
        this.zztt = com_google_android_gms_internal_zzqh;
        this.zzJL = new zzb();
        this.zzJM = new zzb();
    }

    public zzji(Context context, zzqh com_google_android_gms_internal_zzqh, String str, zzpt<zzjf> com_google_android_gms_internal_zzpt_com_google_android_gms_internal_zzjf, zzpt<zzjf> com_google_android_gms_internal_zzpt_com_google_android_gms_internal_zzjf2) {
        this(context, com_google_android_gms_internal_zzqh, str);
        this.zzJL = com_google_android_gms_internal_zzpt_com_google_android_gms_internal_zzjf;
        this.zzJM = com_google_android_gms_internal_zzpt_com_google_android_gms_internal_zzjf2;
    }

    private zzd zza(@Nullable final zzaw com_google_android_gms_internal_zzaw) {
        final zzd com_google_android_gms_internal_zzji_zzd = new zzd(this.zzJM);
        zzw.zzcM().runOnUiThread(new Runnable(this) {
            final /* synthetic */ zzji zzJR;

            public void run() {
                final zzjf zza = this.zzJR.zza(this.zzJR.mContext, this.zzJR.zztt, com_google_android_gms_internal_zzaw);
                zza.zza(new com.google.android.gms.internal.zzjf.zza(this) {
                    final /* synthetic */ C05671 zzJT;

                    class C05641 implements Runnable {
                        final /* synthetic */ C10811 zzJU;

                        class C05631 implements Runnable {
                            final /* synthetic */ C05641 zzJV;

                            C05631(C05641 c05641) {
                                this.zzJV = c05641;
                            }

                            public void run() {
                                zza.destroy();
                            }
                        }

                        C05641(C10811 c10811) {
                            this.zzJU = c10811;
                        }

                        /* JADX WARNING: inconsistent code. */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public void run() {
                            /*
                            r3 = this;
                            r0 = r3.zzJU;
                            r0 = r0.zzJT;
                            r0 = r0.zzJR;
                            r1 = r0.zzrJ;
                            monitor-enter(r1);
                            r0 = r3.zzJU;	 Catch:{ all -> 0x0043 }
                            r0 = r0.zzJT;	 Catch:{ all -> 0x0043 }
                            r0 = r0;	 Catch:{ all -> 0x0043 }
                            r0 = r0.getStatus();	 Catch:{ all -> 0x0043 }
                            r2 = -1;
                            if (r0 == r2) goto L_0x0025;
                        L_0x0018:
                            r0 = r3.zzJU;	 Catch:{ all -> 0x0043 }
                            r0 = r0.zzJT;	 Catch:{ all -> 0x0043 }
                            r0 = r0;	 Catch:{ all -> 0x0043 }
                            r0 = r0.getStatus();	 Catch:{ all -> 0x0043 }
                            r2 = 1;
                            if (r0 != r2) goto L_0x0027;
                        L_0x0025:
                            monitor-exit(r1);	 Catch:{ all -> 0x0043 }
                        L_0x0026:
                            return;
                        L_0x0027:
                            r0 = r3.zzJU;	 Catch:{ all -> 0x0043 }
                            r0 = r0.zzJT;	 Catch:{ all -> 0x0043 }
                            r0 = r0;	 Catch:{ all -> 0x0043 }
                            r0.reject();	 Catch:{ all -> 0x0043 }
                            r0 = com.google.android.gms.ads.internal.zzw.zzcM();	 Catch:{ all -> 0x0043 }
                            r2 = new com.google.android.gms.internal.zzji$1$1$1$1;	 Catch:{ all -> 0x0043 }
                            r2.<init>(r3);	 Catch:{ all -> 0x0043 }
                            r0.runOnUiThread(r2);	 Catch:{ all -> 0x0043 }
                            r0 = "Could not receive loaded message in a timely manner. Rejecting.";
                            com.google.android.gms.internal.zzpk.m28v(r0);	 Catch:{ all -> 0x0043 }
                            monitor-exit(r1);	 Catch:{ all -> 0x0043 }
                            goto L_0x0026;
                        L_0x0043:
                            r0 = move-exception;
                            monitor-exit(r1);	 Catch:{ all -> 0x0043 }
                            throw r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzji.1.1.1.run():void");
                        }
                    }

                    public void zzgN() {
                        zzpo.zzXC.postDelayed(new C05641(this), (long) zza.zzKa);
                    }
                });
                zza.zza("/jsLoaded", new zzid(this) {
                    final /* synthetic */ C05671 zzJT;

                    /* JADX WARNING: inconsistent code. */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void zza(com.google.android.gms.internal.zzqw r4, java.util.Map<java.lang.String, java.lang.String> r5) {
                        /*
                        r3 = this;
                        r0 = r3.zzJT;
                        r0 = r0.zzJR;
                        r1 = r0.zzrJ;
                        monitor-enter(r1);
                        r0 = r3.zzJT;	 Catch:{ all -> 0x0051 }
                        r0 = r0;	 Catch:{ all -> 0x0051 }
                        r0 = r0.getStatus();	 Catch:{ all -> 0x0051 }
                        r2 = -1;
                        if (r0 == r2) goto L_0x001f;
                    L_0x0014:
                        r0 = r3.zzJT;	 Catch:{ all -> 0x0051 }
                        r0 = r0;	 Catch:{ all -> 0x0051 }
                        r0 = r0.getStatus();	 Catch:{ all -> 0x0051 }
                        r2 = 1;
                        if (r0 != r2) goto L_0x0021;
                    L_0x001f:
                        monitor-exit(r1);	 Catch:{ all -> 0x0051 }
                    L_0x0020:
                        return;
                    L_0x0021:
                        r0 = r3.zzJT;	 Catch:{ all -> 0x0051 }
                        r0 = r0.zzJR;	 Catch:{ all -> 0x0051 }
                        r2 = 0;
                        r0.zzJO = r2;	 Catch:{ all -> 0x0051 }
                        r0 = r3.zzJT;	 Catch:{ all -> 0x0051 }
                        r0 = r0.zzJR;	 Catch:{ all -> 0x0051 }
                        r0 = r0.zzJL;	 Catch:{ all -> 0x0051 }
                        r2 = r0;	 Catch:{ all -> 0x0051 }
                        r0.zzd(r2);	 Catch:{ all -> 0x0051 }
                        r0 = r3.zzJT;	 Catch:{ all -> 0x0051 }
                        r0 = r0;	 Catch:{ all -> 0x0051 }
                        r2 = r0;	 Catch:{ all -> 0x0051 }
                        r0.zzg(r2);	 Catch:{ all -> 0x0051 }
                        r0 = r3.zzJT;	 Catch:{ all -> 0x0051 }
                        r0 = r0.zzJR;	 Catch:{ all -> 0x0051 }
                        r2 = r3.zzJT;	 Catch:{ all -> 0x0051 }
                        r2 = r0;	 Catch:{ all -> 0x0051 }
                        r0.zzJN = r2;	 Catch:{ all -> 0x0051 }
                        r0 = "Successfully loaded JS Engine.";
                        com.google.android.gms.internal.zzpk.m28v(r0);	 Catch:{ all -> 0x0051 }
                        monitor-exit(r1);	 Catch:{ all -> 0x0051 }
                        goto L_0x0020;
                    L_0x0051:
                        r0 = move-exception;
                        monitor-exit(r1);	 Catch:{ all -> 0x0051 }
                        throw r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzji.1.2.zza(com.google.android.gms.internal.zzqw, java.util.Map):void");
                    }
                });
                final zzqa com_google_android_gms_internal_zzqa = new zzqa();
                zzid c10833 = new zzid(this) {
                    final /* synthetic */ C05671 zzJT;

                    public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
                        synchronized (this.zzJT.zzJR.zzrJ) {
                            zzqf.zzbg("JS Engine is requesting an update");
                            if (this.zzJT.zzJR.zzJO == 0) {
                                zzqf.zzbg("Starting reload.");
                                this.zzJT.zzJR.zzJO = 2;
                                this.zzJT.zzJR.zzb(com_google_android_gms_internal_zzaw);
                            }
                            zza.zzb("/requestReload", (zzid) com_google_android_gms_internal_zzqa.get());
                        }
                    }
                };
                com_google_android_gms_internal_zzqa.set(c10833);
                zza.zza("/requestReload", c10833);
                if (this.zzJR.zzJK.endsWith(".js")) {
                    zza.zzam(this.zzJR.zzJK);
                } else if (this.zzJR.zzJK.startsWith("<html>")) {
                    zza.zzao(this.zzJR.zzJK);
                } else {
                    zza.zzan(this.zzJR.zzJK);
                }
                zzpo.zzXC.postDelayed(new Runnable(this) {
                    final /* synthetic */ C05671 zzJT;

                    class C05651 implements Runnable {
                        final /* synthetic */ C05664 zzJX;

                        C05651(C05664 c05664) {
                            this.zzJX = c05664;
                        }

                        public void run() {
                            zza.destroy();
                        }
                    }

                    /* JADX WARNING: inconsistent code. */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void run() {
                        /*
                        r3 = this;
                        r0 = r3.zzJT;
                        r0 = r0.zzJR;
                        r1 = r0.zzrJ;
                        monitor-enter(r1);
                        r0 = r3.zzJT;	 Catch:{ all -> 0x003b }
                        r0 = r0;	 Catch:{ all -> 0x003b }
                        r0 = r0.getStatus();	 Catch:{ all -> 0x003b }
                        r2 = -1;
                        if (r0 == r2) goto L_0x001f;
                    L_0x0014:
                        r0 = r3.zzJT;	 Catch:{ all -> 0x003b }
                        r0 = r0;	 Catch:{ all -> 0x003b }
                        r0 = r0.getStatus();	 Catch:{ all -> 0x003b }
                        r2 = 1;
                        if (r0 != r2) goto L_0x0021;
                    L_0x001f:
                        monitor-exit(r1);	 Catch:{ all -> 0x003b }
                    L_0x0020:
                        return;
                    L_0x0021:
                        r0 = r3.zzJT;	 Catch:{ all -> 0x003b }
                        r0 = r0;	 Catch:{ all -> 0x003b }
                        r0.reject();	 Catch:{ all -> 0x003b }
                        r0 = com.google.android.gms.ads.internal.zzw.zzcM();	 Catch:{ all -> 0x003b }
                        r2 = new com.google.android.gms.internal.zzji$1$4$1;	 Catch:{ all -> 0x003b }
                        r2.<init>(r3);	 Catch:{ all -> 0x003b }
                        r0.runOnUiThread(r2);	 Catch:{ all -> 0x003b }
                        r0 = "Could not receive loaded message in a timely manner. Rejecting.";
                        com.google.android.gms.internal.zzpk.m28v(r0);	 Catch:{ all -> 0x003b }
                        monitor-exit(r1);	 Catch:{ all -> 0x003b }
                        goto L_0x0020;
                    L_0x003b:
                        r0 = move-exception;
                        monitor-exit(r1);	 Catch:{ all -> 0x003b }
                        throw r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzji.1.4.run():void");
                    }
                }, (long) zza.zzJZ);
            }
        });
        return com_google_android_gms_internal_zzji_zzd;
    }

    protected zzjf zza(Context context, zzqh com_google_android_gms_internal_zzqh, @Nullable zzaw com_google_android_gms_internal_zzaw) {
        return new zzjh(context, com_google_android_gms_internal_zzqh, com_google_android_gms_internal_zzaw, null);
    }

    protected zzd zzb(@Nullable zzaw com_google_android_gms_internal_zzaw) {
        final zzd zza = zza(com_google_android_gms_internal_zzaw);
        zza.zza(new com.google.android.gms.internal.zzqp.zzc<zzjf>(this) {
            final /* synthetic */ zzji zzJR;

            public void zza(zzjf com_google_android_gms_internal_zzjf) {
                synchronized (this.zzJR.zzrJ) {
                    this.zzJR.zzJO = 0;
                    if (!(this.zzJR.zzJN == null || zza == this.zzJR.zzJN)) {
                        zzpk.m28v("New JS engine is loaded, marking previous one as destroyable.");
                        this.zzJR.zzJN.zzgR();
                    }
                    this.zzJR.zzJN = zza;
                }
            }

            public /* synthetic */ void zzd(Object obj) {
                zza((zzjf) obj);
            }
        }, new com.google.android.gms.internal.zzqp.zza(this) {
            final /* synthetic */ zzji zzJR;

            public void run() {
                synchronized (this.zzJR.zzrJ) {
                    this.zzJR.zzJO = 1;
                    zzpk.m28v("Failed loading new engine. Marking new engine destroyable.");
                    zza.zzgR();
                }
            }
        });
        return zza;
    }

    public zzc zzc(@Nullable zzaw com_google_android_gms_internal_zzaw) {
        zzc zzgP;
        synchronized (this.zzrJ) {
            if (this.zzJN == null || this.zzJN.getStatus() == -1) {
                this.zzJO = 2;
                this.zzJN = zzb(com_google_android_gms_internal_zzaw);
                zzgP = this.zzJN.zzgP();
            } else if (this.zzJO == 0) {
                zzgP = this.zzJN.zzgP();
            } else if (this.zzJO == 1) {
                this.zzJO = 2;
                zzb(com_google_android_gms_internal_zzaw);
                zzgP = this.zzJN.zzgP();
            } else if (this.zzJO == 2) {
                zzgP = this.zzJN.zzgP();
            } else {
                zzgP = this.zzJN.zzgP();
            }
        }
        return zzgP;
    }

    public zzc zzgO() {
        return zzc(null);
    }
}
