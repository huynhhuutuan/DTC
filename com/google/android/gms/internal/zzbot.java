package com.google.android.gms.internal;

import java.io.EOFException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class zzbot {
    private static long zzccN = 0;
    private final zzbrn zzcaJ;
    private final ScheduledExecutorService zzcax;
    private zzb zzccO;
    private boolean zzccP = false;
    private boolean zzccQ = false;
    private long zzccR = 0;
    private zzbov zzccS;
    private zza zzccT;
    private ScheduledFuture<?> zzccU;
    private ScheduledFuture<?> zzccV;
    private final zzbol zzccW;

    class C04841 implements Runnable {
        final /* synthetic */ zzbot zzccX;

        C04841(zzbot com_google_android_gms_internal_zzbot) {
            this.zzccX = com_google_android_gms_internal_zzbot;
        }

        public void run() {
            this.zzccX.zzYb();
        }
    }

    class C04852 implements Runnable {
        final /* synthetic */ zzbot zzccX;

        C04852(zzbot com_google_android_gms_internal_zzbot) {
            this.zzccX = com_google_android_gms_internal_zzbot;
        }

        public void run() {
            if (this.zzccX.zzccO != null) {
                this.zzccX.zzccO.zziS("0");
                this.zzccX.zzXY();
            }
        }
    }

    public interface zza {
        void zzat(Map<String, Object> map);

        void zzba(boolean z);
    }

    private interface zzb {
        void close();

        void connect();

        void zziS(String str);
    }

    private class zzc implements zzb, zzbsn {
        final /* synthetic */ zzbot zzccX;
        private zzbsm zzccY;

        class C04861 implements Runnable {
            final /* synthetic */ zzc zzccZ;

            C04861(zzc com_google_android_gms_internal_zzbot_zzc) {
                this.zzccZ = com_google_android_gms_internal_zzbot_zzc;
            }

            public void run() {
                this.zzccZ.zzccX.zzccV.cancel(false);
                this.zzccZ.zzccX.zzccP = true;
                if (this.zzccZ.zzccX.zzcaJ.zzaaC()) {
                    this.zzccZ.zzccX.zzcaJ.zzi("websocket opened", new Object[0]);
                }
                this.zzccZ.zzccX.zzXY();
            }
        }

        class C04883 implements Runnable {
            final /* synthetic */ zzc zzccZ;

            C04883(zzc com_google_android_gms_internal_zzbot_zzc) {
                this.zzccZ = com_google_android_gms_internal_zzbot_zzc;
            }

            public void run() {
                if (this.zzccZ.zzccX.zzcaJ.zzaaC()) {
                    this.zzccZ.zzccX.zzcaJ.zzi("closed", new Object[0]);
                }
                this.zzccZ.zzccX.zzYa();
            }
        }

        private zzc(zzbot com_google_android_gms_internal_zzbot, zzbsm com_google_android_gms_internal_zzbsm) {
            this.zzccX = com_google_android_gms_internal_zzbot;
            this.zzccY = com_google_android_gms_internal_zzbsm;
            this.zzccY.zza((zzbsn) this);
        }

        private void shutdown() {
            this.zzccY.close();
            try {
                this.zzccY.zzabu();
            } catch (Throwable e) {
                this.zzccX.zzcaJ.zzd("Interrupted while shutting down websocket threads", e);
            }
        }

        public void close() {
            this.zzccY.close();
        }

        public void connect() {
            try {
                this.zzccY.connect();
            } catch (Throwable e) {
                if (this.zzccX.zzcaJ.zzaaC()) {
                    this.zzccX.zzcaJ.zza("Error connecting", e, new Object[0]);
                }
                shutdown();
            }
        }

        public void onClose() {
            this.zzccX.zzcax.execute(new C04883(this));
        }

        public void zzYc() {
            this.zzccX.zzcax.execute(new C04861(this));
        }

        public void zza(final zzbso com_google_android_gms_internal_zzbso) {
            this.zzccX.zzcax.execute(new Runnable(this) {
                final /* synthetic */ zzc zzccZ;

                public void run() {
                    if (com_google_android_gms_internal_zzbso.getCause() == null || !(com_google_android_gms_internal_zzbso.getCause() instanceof EOFException)) {
                        this.zzccZ.zzccX.zzcaJ.zza("WebSocket error.", com_google_android_gms_internal_zzbso, new Object[0]);
                    } else {
                        this.zzccZ.zzccX.zzcaJ.zzi("WebSocket reached EOF.", new Object[0]);
                    }
                    this.zzccZ.zzccX.zzYa();
                }
            });
        }

        public void zza(zzbsq com_google_android_gms_internal_zzbsq) {
            final String text = com_google_android_gms_internal_zzbsq.getText();
            if (this.zzccX.zzcaJ.zzaaC()) {
                zzbrn zzb = this.zzccX.zzcaJ;
                String str = "ws message: ";
                String valueOf = String.valueOf(text);
                zzb.zzi(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
            }
            this.zzccX.zzcax.execute(new Runnable(this) {
                final /* synthetic */ zzc zzccZ;

                public void run() {
                    this.zzccZ.zzccX.zziR(text);
                }
            });
        }

        public void zziS(String str) {
            this.zzccY.zziS(str);
        }
    }

    public zzbot(zzbol com_google_android_gms_internal_zzbol, zzbon com_google_android_gms_internal_zzbon, String str, zza com_google_android_gms_internal_zzbot_zza, String str2) {
        this.zzccW = com_google_android_gms_internal_zzbol;
        this.zzcax = com_google_android_gms_internal_zzbol.zzXs();
        this.zzccT = com_google_android_gms_internal_zzbot_zza;
        long j = zzccN;
        zzccN = 1 + j;
        this.zzcaJ = new zzbrn(com_google_android_gms_internal_zzbol.zzXq(), "WebSocket", "ws_" + j);
        this.zzccO = zza(com_google_android_gms_internal_zzbon, str, str2);
    }

    private boolean isBuffering() {
        return this.zzccS != null;
    }

    private void shutdown() {
        this.zzccQ = true;
        this.zzccT.zzba(this.zzccP);
    }

    private static String[] zzF(String str, int i) {
        int i2 = 0;
        if (str.length() <= i) {
            return new String[]{str};
        }
        ArrayList arrayList = new ArrayList();
        while (i2 < str.length()) {
            arrayList.add(str.substring(i2, Math.min(i2 + i, str.length())));
            i2 += i;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private void zzXY() {
        if (!this.zzccQ) {
            if (this.zzccU != null) {
                this.zzccU.cancel(false);
                if (this.zzcaJ.zzaaC()) {
                    this.zzcaJ.zzi("Reset keepAlive. Remaining: " + this.zzccU.getDelay(TimeUnit.MILLISECONDS), new Object[0]);
                }
            } else if (this.zzcaJ.zzaaC()) {
                this.zzcaJ.zzi("Reset keepAlive", new Object[0]);
            }
            this.zzccU = this.zzcax.schedule(zzXZ(), 45000, TimeUnit.MILLISECONDS);
        }
    }

    private Runnable zzXZ() {
        return new C04852(this);
    }

    private void zzYa() {
        if (!this.zzccQ) {
            if (this.zzcaJ.zzaaC()) {
                this.zzcaJ.zzi("closing itself", new Object[0]);
            }
            shutdown();
        }
        this.zzccO = null;
        if (this.zzccU != null) {
            this.zzccU.cancel(false);
        }
    }

    private void zzYb() {
        if (!this.zzccP && !this.zzccQ) {
            if (this.zzcaJ.zzaaC()) {
                this.zzcaJ.zzi("timed out on connect", new Object[0]);
            }
            this.zzccO.close();
        }
    }

    private zzb zza(zzbon com_google_android_gms_internal_zzbon, String str, String str2) {
        if (str == null) {
            str = com_google_android_gms_internal_zzbon.getHost();
        }
        URI zza = zzbon.zza(str, com_google_android_gms_internal_zzbon.isSecure(), com_google_android_gms_internal_zzbon.getNamespace(), str2);
        Map hashMap = new HashMap();
        hashMap.put("User-Agent", this.zzccW.zzkn());
        return new zzc(new zzbsm(zza, null, hashMap));
    }

    private void zziP(String str) {
        Throwable th;
        zzbrn com_google_android_gms_internal_zzbrn;
        String str2;
        String valueOf;
        this.zzccS.zziT(str);
        this.zzccR--;
        if (this.zzccR == 0) {
            try {
                this.zzccS.zzYi();
                Map zzje = zzbsv.zzje(this.zzccS.toString());
                this.zzccS = null;
                if (this.zzcaJ.zzaaC()) {
                    zzbrn com_google_android_gms_internal_zzbrn2 = this.zzcaJ;
                    String valueOf2 = String.valueOf(zzje);
                    com_google_android_gms_internal_zzbrn2.zzi(new StringBuilder(String.valueOf(valueOf2).length() + 36).append("handleIncomingFrame complete frame: ").append(valueOf2).toString(), new Object[0]);
                }
                this.zzccT.zzat(zzje);
            } catch (Throwable e) {
                th = e;
                com_google_android_gms_internal_zzbrn = this.zzcaJ;
                str2 = "Error parsing frame: ";
                valueOf = String.valueOf(this.zzccS.toString());
                com_google_android_gms_internal_zzbrn.zzd(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
                close();
                shutdown();
            } catch (Throwable e2) {
                th = e2;
                com_google_android_gms_internal_zzbrn = this.zzcaJ;
                str2 = "Error parsing frame (cast error): ";
                valueOf = String.valueOf(this.zzccS.toString());
                com_google_android_gms_internal_zzbrn.zzd(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
                close();
                shutdown();
            }
        }
    }

    private String zziQ(String str) {
        if (str.length() <= 6) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt > 0) {
                    zzqw(parseInt);
                }
                return null;
            } catch (NumberFormatException e) {
            }
        }
        zzqw(1);
        return str;
    }

    private void zziR(String str) {
        if (!this.zzccQ) {
            zzXY();
            if (isBuffering()) {
                zziP(str);
                return;
            }
            String zziQ = zziQ(str);
            if (zziQ != null) {
                zziP(zziQ);
            }
        }
    }

    private void zzqw(int i) {
        this.zzccR = (long) i;
        this.zzccS = new zzbov();
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi("HandleNewFrameCount: " + this.zzccR, new Object[0]);
        }
    }

    public void close() {
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi("websocket is being closed", new Object[0]);
        }
        this.zzccQ = true;
        this.zzccO.close();
        if (this.zzccV != null) {
            this.zzccV.cancel(true);
        }
        if (this.zzccU != null) {
            this.zzccU.cancel(true);
        }
    }

    public void open() {
        this.zzccO.connect();
        this.zzccV = this.zzcax.schedule(new C04841(this), 30000, TimeUnit.MILLISECONDS);
    }

    public void send(Map<String, Object> map) {
        zzXY();
        String str;
        try {
            String[] zzF = zzF(zzbsv.zzaF(map), 16384);
            if (zzF.length > 1) {
                this.zzccO.zziS(zzF.length);
            }
            for (String str2 : zzF) {
                this.zzccO.zziS(str2);
            }
        } catch (Throwable e) {
            Throwable th = e;
            zzbrn com_google_android_gms_internal_zzbrn = this.zzcaJ;
            str2 = "Failed to serialize message: ";
            String valueOf = String.valueOf(map.toString());
            com_google_android_gms_internal_zzbrn.zzd(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            shutdown();
        }
    }
}
