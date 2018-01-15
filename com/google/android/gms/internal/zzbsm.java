package com.google.android.gms.internal;

import java.lang.Thread.State;
import java.net.Socket;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class zzbsm {
    private static final AtomicInteger zzcjU = new AtomicInteger(0);
    private static final Charset zzcjV = Charset.forName("UTF-8");
    private static ThreadFactory zzcke = Executors.defaultThreadFactory();
    private static zzbsl zzckf = new C10041();
    private final int zzazO = zzcjU.incrementAndGet();
    private volatile zza zzcjW = zza.NONE;
    private volatile Socket zzcjX = null;
    private zzbsn zzcjY = null;
    private final URI zzcjZ;
    private final zzbsr zzcka;
    private final zzbss zzckb;
    private final zzbsp zzckc;
    private final Thread zzckd = getThreadFactory().newThread(new C05222(this));

    class C05222 implements Runnable {
        final /* synthetic */ zzbsm zzckg;

        C05222(zzbsm com_google_android_gms_internal_zzbsm) {
            this.zzckg = com_google_android_gms_internal_zzbsm;
        }

        public void run() {
            this.zzckg.zzabv();
        }
    }

    private enum zza {
        NONE,
        CONNECTING,
        CONNECTED,
        DISCONNECTING,
        DISCONNECTED
    }

    class C10041 implements zzbsl {
        C10041() {
        }

        public void zza(Thread thread, String str) {
            thread.setName(str);
        }
    }

    public zzbsm(URI uri, String str, Map<String, String> map) {
        this.zzcjZ = uri;
        this.zzckc = new zzbsp(uri, str, map);
        this.zzcka = new zzbsr(this);
        this.zzckb = new zzbss(this, "TubeSock", this.zzazO);
    }

    private Socket createSocket() {
        Throwable th;
        String str;
        String valueOf;
        String scheme = this.zzcjZ.getScheme();
        String host = this.zzcjZ.getHost();
        int port = this.zzcjZ.getPort();
        if (scheme != null && scheme.equals("ws")) {
            try {
                return new Socket(host, port == -1 ? 80 : port);
            } catch (Throwable e) {
                th = e;
                str = "unknown host: ";
                valueOf = String.valueOf(host);
                throw new zzbso(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
            } catch (Throwable e2) {
                host = String.valueOf(this.zzcjZ);
                throw new zzbso(new StringBuilder(String.valueOf(host).length() + 31).append("error while creating socket to ").append(host).toString(), e2);
            }
        } else if (scheme == null || !scheme.equals("wss")) {
            String str2 = "unsupported protocol: ";
            valueOf = String.valueOf(scheme);
            throw new zzbso(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else {
            if (port == -1) {
                port = 443;
            }
            try {
                SSLSocket sSLSocket = (SSLSocket) SSLSocketFactory.getDefault().createSocket(host, port);
                if (HttpsURLConnection.getDefaultHostnameVerifier().verify(host, sSLSocket.getSession())) {
                    return sSLSocket;
                }
                scheme = String.valueOf(this.zzcjZ);
                throw new zzbso(new StringBuilder(String.valueOf(scheme).length() + 39).append("Error while verifying secure socket to ").append(scheme).toString());
            } catch (Throwable e22) {
                th = e22;
                str = "unknown host: ";
                valueOf = String.valueOf(host);
                throw new zzbso(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
            } catch (Throwable e222) {
                host = String.valueOf(this.zzcjZ);
                throw new zzbso(new StringBuilder(String.valueOf(host).length() + 38).append("error while creating secure socket to ").append(host).toString(), e222);
            }
        }
    }

    static ThreadFactory getThreadFactory() {
        return zzcke;
    }

    private synchronized void zza(byte b, byte[] bArr) {
        if (this.zzcjW != zza.CONNECTED) {
            this.zzcjY.zza(new zzbso("error while sending data: not connected"));
        } else {
            try {
                this.zzckb.zzb(b, true, bArr);
            } catch (Throwable e) {
                this.zzcjY.zza(new zzbso("Failed to send frame", e));
                close();
            }
        }
    }

    public static void zza(ThreadFactory threadFactory, zzbsl com_google_android_gms_internal_zzbsl) {
        zzcke = threadFactory;
        zzckf = com_google_android_gms_internal_zzbsl;
    }

    static zzbsl zzabp() {
        return zzckf;
    }

    private synchronized void zzabs() {
        if (this.zzcjW != zza.DISCONNECTED) {
            this.zzcka.zzabz();
            this.zzckb.zzabC();
            if (this.zzcjX != null) {
                try {
                    this.zzcjX.close();
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
            this.zzcjW = zza.DISCONNECTED;
            this.zzcjY.onClose();
        }
    }

    private void zzabt() {
        try {
            this.zzcjW = zza.DISCONNECTING;
            this.zzckb.zzabC();
            this.zzckb.zzb((byte) 8, true, new byte[0]);
        } catch (Throwable e) {
            this.zzcjY.zza(new zzbso("Failed to send close frame", e));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void zzabv() {
        /*
        r11 = this;
        r4 = 1;
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r1 = 0;
        r0 = r11.createSocket();	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        monitor-enter(r11);	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r11.zzcjX = r0;	 Catch:{ all -> 0x0025 }
        r2 = r11.zzcjW;	 Catch:{ all -> 0x0025 }
        r3 = com.google.android.gms.internal.zzbsm.zza.DISCONNECTED;	 Catch:{ all -> 0x0025 }
        if (r2 != r3) goto L_0x0032;
    L_0x0011:
        r0 = r11.zzcjX;	 Catch:{ IOException -> 0x001e }
        r0.close();	 Catch:{ IOException -> 0x001e }
        r0 = 0;
        r11.zzcjX = r0;	 Catch:{ all -> 0x0025 }
        monitor-exit(r11);	 Catch:{ all -> 0x0025 }
        r11.close();
    L_0x001d:
        return;
    L_0x001e:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0025 }
        r1.<init>(r0);	 Catch:{ all -> 0x0025 }
        throw r1;	 Catch:{ all -> 0x0025 }
    L_0x0025:
        r0 = move-exception;
        monitor-exit(r11);	 Catch:{ all -> 0x0025 }
        throw r0;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
    L_0x0028:
        r0 = move-exception;
        r1 = r11.zzcjY;	 Catch:{ all -> 0x00e1 }
        r1.zza(r0);	 Catch:{ all -> 0x00e1 }
        r11.close();
        goto L_0x001d;
    L_0x0032:
        monitor-exit(r11);	 Catch:{ all -> 0x0025 }
        r5 = new java.io.DataInputStream;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r2 = r0.getInputStream();	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r5.<init>(r2);	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r6 = r0.getOutputStream();	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0 = r11.zzckc;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0 = r0.zzabx();	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r6.write(r0);	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = new byte[r0];	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r7 = new java.util.ArrayList;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r7.<init>();	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0 = r1;
        r3 = r1;
    L_0x0054:
        if (r3 != 0) goto L_0x00ec;
    L_0x0056:
        r8 = r5.read();	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r9 = -1;
        if (r8 != r9) goto L_0x0088;
    L_0x005d:
        r0 = new com.google.android.gms.internal.zzbso;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r1 = "Connection closed before handshake was complete";
        r0.<init>(r1);	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        throw r0;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
    L_0x0065:
        r0 = move-exception;
        r2 = r11.zzcjY;	 Catch:{ all -> 0x00e1 }
        r3 = new com.google.android.gms.internal.zzbso;	 Catch:{ all -> 0x00e1 }
        r4 = "error while connecting: ";
        r1 = r0.getMessage();	 Catch:{ all -> 0x00e1 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00e1 }
        r5 = r1.length();	 Catch:{ all -> 0x00e1 }
        if (r5 == 0) goto L_0x014d;
    L_0x007a:
        r1 = r4.concat(r1);	 Catch:{ all -> 0x00e1 }
    L_0x007e:
        r3.<init>(r1, r0);	 Catch:{ all -> 0x00e1 }
        r2.zza(r3);	 Catch:{ all -> 0x00e1 }
        r11.close();
        goto L_0x001d;
    L_0x0088:
        r8 = (byte) r8;
        r2[r0] = r8;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0 = r0 + 1;
        r8 = r0 + -1;
        r8 = r2[r8];	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r9 = 10;
        if (r8 != r9) goto L_0x00c2;
    L_0x0095:
        r8 = r0 + -2;
        r8 = r2[r8];	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r9 = 13;
        if (r8 != r9) goto L_0x00c2;
    L_0x009d:
        r0 = new java.lang.String;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r8 = zzcjV;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0.<init>(r2, r8);	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r2 = r0.trim();	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r8 = "";
        r2 = r2.equals(r8);	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        if (r2 == 0) goto L_0x00b9;
    L_0x00b0:
        r2 = r4;
    L_0x00b1:
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = new byte[r0];	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r3 = r2;
        r2 = r0;
        r0 = r1;
        goto L_0x0054;
    L_0x00b9:
        r0 = r0.trim();	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r7.add(r0);	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r2 = r3;
        goto L_0x00b1;
    L_0x00c2:
        if (r0 != r10) goto L_0x0054;
    L_0x00c4:
        r0 = new java.lang.String;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r1 = zzcjV;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0.<init>(r2, r1);	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r1 = new com.google.android.gms.internal.zzbso;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r2 = "Unexpected long line in handshake: ";
        r0 = java.lang.String.valueOf(r0);	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r3 = r0.length();	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        if (r3 == 0) goto L_0x00e6;
    L_0x00d9:
        r0 = r2.concat(r0);	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
    L_0x00dd:
        r1.<init>(r0);	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        throw r1;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
    L_0x00e1:
        r0 = move-exception;
        r11.close();
        throw r0;
    L_0x00e6:
        r0 = new java.lang.String;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0.<init>(r2);	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        goto L_0x00dd;
    L_0x00ec:
        r1 = r11.zzckc;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0 = 0;
        r0 = r7.get(r0);	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0 = (java.lang.String) r0;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r1.zzjc(r0);	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0 = 0;
        r7.remove(r0);	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r1 = new java.util.HashMap;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r1.<init>();	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r2 = r7.iterator();	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
    L_0x0105:
        r0 = r2.hasNext();	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        if (r0 == 0) goto L_0x0122;
    L_0x010b:
        r0 = r2.next();	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0 = (java.lang.String) r0;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r3 = ": ";
        r4 = 2;
        r0 = r0.split(r3, r4);	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r3 = 0;
        r3 = r0[r3];	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r4 = 1;
        r0 = r0[r4];	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r1.put(r3, r0);	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        goto L_0x0105;
    L_0x0122:
        r0 = r11.zzckc;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0.zzc(r1);	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0 = r11.zzckb;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0.zzb(r6);	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0 = r11.zzcka;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0.zza(r5);	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0 = com.google.android.gms.internal.zzbsm.zza.CONNECTED;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r11.zzcjW = r0;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0 = r11.zzckb;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0 = r0.zzabw();	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0.start();	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0 = r11.zzcjY;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0.zzYc();	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0 = r11.zzcka;	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r0.run();	 Catch:{ zzbso -> 0x0028, IOException -> 0x0065 }
        r11.close();
        goto L_0x001d;
    L_0x014d:
        r1 = new java.lang.String;	 Catch:{ all -> 0x00e1 }
        r1.<init>(r4);	 Catch:{ all -> 0x00e1 }
        goto L_0x007e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzbsm.zzabv():void");
    }

    public synchronized void close() {
        switch (this.zzcjW) {
            case NONE:
                this.zzcjW = zza.DISCONNECTED;
                break;
            case CONNECTING:
                zzabs();
                break;
            case CONNECTED:
                zzabt();
                break;
        }
    }

    public synchronized void connect() {
        if (this.zzcjW != zza.NONE) {
            this.zzcjY.zza(new zzbso("connect() already called"));
            close();
        } else {
            zzbsl zzabp = zzabp();
            Thread zzabw = zzabw();
            String valueOf = String.valueOf("TubeSockReader-");
            zzabp.zza(zzabw, new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.zzazO).toString());
            this.zzcjW = zza.CONNECTING;
            zzabw().start();
        }
    }

    synchronized void zzY(byte[] bArr) {
        zza((byte) 10, bArr);
    }

    public void zza(zzbsn com_google_android_gms_internal_zzbsn) {
        this.zzcjY = com_google_android_gms_internal_zzbsn;
    }

    zzbsn zzabq() {
        return this.zzcjY;
    }

    void zzabr() {
        zzabs();
    }

    public void zzabu() throws InterruptedException {
        if (this.zzckb.zzabw().getState() != State.NEW) {
            this.zzckb.zzabw().join();
        }
        zzabw().join();
    }

    Thread zzabw() {
        return this.zzckd;
    }

    void zzb(zzbso com_google_android_gms_internal_zzbso) {
        this.zzcjY.zza(com_google_android_gms_internal_zzbso);
        if (this.zzcjW == zza.CONNECTED) {
            close();
        }
        zzabs();
    }

    public synchronized void zziS(String str) {
        zza((byte) 1, str.getBytes(zzcjV));
    }
}
