package com.google.firebase.iid;

import android.app.AlarmManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.VisibleForTesting;
import android.support.annotation.WorkerThread;
import android.util.Log;

public class FirebaseInstanceIdService extends zzb {
    private static BroadcastReceiver zzclf;
    @VisibleForTesting
    static final Object zzclg = new Object();
    @VisibleForTesting
    static boolean zzclh = false;
    private boolean zzcli = false;

    private String zzJ(Intent intent) {
        String stringExtra = intent.getStringExtra("subtype");
        return stringExtra == null ? "" : stringExtra;
    }

    private int zza(Intent intent, boolean z) {
        int intExtra = intent == null ? 10 : intent.getIntExtra("next_retry_delay_in_seconds", 0);
        return (intExtra >= 10 || z) ? intExtra >= 10 ? intExtra > 28800 ? 28800 : intExtra : 10 : 30;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void zza(android.content.Context r2, com.google.firebase.iid.FirebaseInstanceId r3) {
        /*
        r1 = zzclg;
        monitor-enter(r1);
        r0 = zzclh;	 Catch:{ all -> 0x0026 }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
    L_0x0008:
        return;
    L_0x0009:
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
        r0 = r3.zzabM();
        if (r0 == 0) goto L_0x0022;
    L_0x0010:
        r1 = com.google.firebase.iid.zzd.zzbhM;
        r0 = r0.zzjB(r1);
        if (r0 != 0) goto L_0x0022;
    L_0x0018:
        r0 = r3.zzabO();
        r0 = r0.zzabR();
        if (r0 == 0) goto L_0x0008;
    L_0x0022:
        zzct(r2);
        goto L_0x0008;
    L_0x0026:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdService.zza(android.content.Context, com.google.firebase.iid.FirebaseInstanceId):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void zza(android.content.Intent r9, boolean r10, boolean r11) {
        /*
        r8 = this;
        r2 = 1;
        r1 = 0;
        r3 = zzclg;
        monitor-enter(r3);
        r0 = 0;
        zzclh = r0;	 Catch:{ all -> 0x0010 }
        monitor-exit(r3);	 Catch:{ all -> 0x0010 }
        r0 = com.google.firebase.iid.zzf.zzbA(r8);
        if (r0 != 0) goto L_0x0013;
    L_0x000f:
        return;
    L_0x0010:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0010 }
        throw r0;
    L_0x0013:
        r0 = com.google.firebase.iid.FirebaseInstanceId.getInstance();
        r3 = r0.zzabM();
        if (r3 == 0) goto L_0x0025;
    L_0x001d:
        r4 = com.google.firebase.iid.zzd.zzbhM;
        r4 = r3.zzjB(r4);
        if (r4 == 0) goto L_0x0063;
    L_0x0025:
        r1 = r0.zzabN();	 Catch:{ IOException -> 0x004b, SecurityException -> 0x005a }
        if (r1 == 0) goto L_0x0054;
    L_0x002b:
        r2 = r8.zzcli;	 Catch:{ IOException -> 0x004b, SecurityException -> 0x005a }
        if (r2 == 0) goto L_0x0036;
    L_0x002f:
        r2 = "FirebaseInstanceId";
        r4 = "get master token succeeded";
        android.util.Log.d(r2, r4);	 Catch:{ IOException -> 0x004b, SecurityException -> 0x005a }
    L_0x0036:
        zza(r8, r0);	 Catch:{ IOException -> 0x004b, SecurityException -> 0x005a }
        if (r11 != 0) goto L_0x0047;
    L_0x003b:
        if (r3 == 0) goto L_0x0047;
    L_0x003d:
        if (r3 == 0) goto L_0x000f;
    L_0x003f:
        r0 = r3.zzbxX;	 Catch:{ IOException -> 0x004b, SecurityException -> 0x005a }
        r0 = r1.equals(r0);	 Catch:{ IOException -> 0x004b, SecurityException -> 0x005a }
        if (r0 != 0) goto L_0x000f;
    L_0x0047:
        r8.onTokenRefresh();	 Catch:{ IOException -> 0x004b, SecurityException -> 0x005a }
        goto L_0x000f;
    L_0x004b:
        r0 = move-exception;
        r0 = r0.getMessage();
        r8.zzd(r9, r0);
        goto L_0x000f;
    L_0x0054:
        r0 = "returned token is null";
        r8.zzd(r9, r0);	 Catch:{ IOException -> 0x004b, SecurityException -> 0x005a }
        goto L_0x000f;
    L_0x005a:
        r0 = move-exception;
        r1 = "FirebaseInstanceId";
        r2 = "Unable to get master token";
        android.util.Log.e(r1, r2, r0);
        goto L_0x000f;
    L_0x0063:
        r4 = r0.zzabO();
        r0 = r4.zzabR();
        r3 = r0;
    L_0x006c:
        if (r3 == 0) goto L_0x00d4;
    L_0x006e:
        r0 = "!";
        r0 = r3.split(r0);
        r5 = r0.length;
        r6 = 2;
        if (r5 != r6) goto L_0x0087;
    L_0x0078:
        r5 = r0[r1];
        r6 = r0[r2];
        r0 = -1;
        r7 = r5.hashCode();	 Catch:{ IOException -> 0x00b7 }
        switch(r7) {
            case 83: goto L_0x0090;
            case 84: goto L_0x0084;
            case 85: goto L_0x009a;
            default: goto L_0x0084;
        };
    L_0x0084:
        switch(r0) {
            case 0: goto L_0x00a4;
            case 1: goto L_0x00c1;
            default: goto L_0x0087;
        };
    L_0x0087:
        r4.zzjx(r3);
        r0 = r4.zzabR();
        r3 = r0;
        goto L_0x006c;
    L_0x0090:
        r7 = "S";
        r5 = r5.equals(r7);	 Catch:{ IOException -> 0x00b7 }
        if (r5 == 0) goto L_0x0084;
    L_0x0098:
        r0 = r1;
        goto L_0x0084;
    L_0x009a:
        r7 = "U";
        r5 = r5.equals(r7);	 Catch:{ IOException -> 0x00b7 }
        if (r5 == 0) goto L_0x0084;
    L_0x00a2:
        r0 = r2;
        goto L_0x0084;
    L_0x00a4:
        r0 = com.google.firebase.iid.FirebaseInstanceId.getInstance();	 Catch:{ IOException -> 0x00b7 }
        r0.zzju(r6);	 Catch:{ IOException -> 0x00b7 }
        r0 = r8.zzcli;	 Catch:{ IOException -> 0x00b7 }
        if (r0 == 0) goto L_0x0087;
    L_0x00af:
        r0 = "FirebaseInstanceId";
        r5 = "subscribe operation succeeded";
        android.util.Log.d(r0, r5);	 Catch:{ IOException -> 0x00b7 }
        goto L_0x0087;
    L_0x00b7:
        r0 = move-exception;
        r0 = r0.getMessage();
        r8.zzd(r9, r0);
        goto L_0x000f;
    L_0x00c1:
        r0 = com.google.firebase.iid.FirebaseInstanceId.getInstance();	 Catch:{ IOException -> 0x00b7 }
        r0.zzjv(r6);	 Catch:{ IOException -> 0x00b7 }
        r0 = r8.zzcli;	 Catch:{ IOException -> 0x00b7 }
        if (r0 == 0) goto L_0x0087;
    L_0x00cc:
        r0 = "FirebaseInstanceId";
        r5 = "unsubscribe operation succeeded";
        android.util.Log.d(r0, r5);	 Catch:{ IOException -> 0x00b7 }
        goto L_0x0087;
    L_0x00d4:
        r0 = "FirebaseInstanceId";
        r1 = "topic sync succeeded";
        android.util.Log.d(r0, r1);
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdService.zza(android.content.Intent, boolean, boolean):void");
    }

    private void zza(zzf com_google_firebase_iid_zzf, Bundle bundle) {
        String zzbA = zzf.zzbA(this);
        if (zzbA == null) {
            Log.w("FirebaseInstanceId", "Unable to respond to ping due to missing target package");
            return;
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        intent.setPackage(zzbA);
        intent.putExtras(bundle);
        com_google_firebase_iid_zzf.zzs(intent);
        intent.putExtra("google.to", "google.com/iid");
        intent.putExtra("google.message_id", zzf.zzHm());
        sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    static void zzct(Context context) {
        if (zzf.zzbA(context) != null) {
            synchronized (zzclg) {
                if (!zzclh) {
                    zzg.zzabT().zzf(context, zzqE(0));
                    zzclh = true;
                }
            }
        }
    }

    private static boolean zzcu(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private void zzd(Intent intent, String str) {
        boolean zzcu = zzcu(this);
        final int zza = zza(intent, zzcu);
        Log.d("FirebaseInstanceId", new StringBuilder(String.valueOf(str).length() + 47).append("background sync failed: ").append(str).append(", retry in ").append(zza).append("s").toString());
        synchronized (zzclg) {
            zzqF(zza);
            zzclh = true;
        }
        if (!zzcu) {
            if (this.zzcli) {
                Log.d("FirebaseInstanceId", "device not connected. Connectivity change received registered");
            }
            if (zzclf == null) {
                zzclf = new BroadcastReceiver(this) {
                    final /* synthetic */ FirebaseInstanceIdService zzclk;

                    public void onReceive(Context context, Intent intent) {
                        if (FirebaseInstanceIdService.zzcu(context)) {
                            if (this.zzclk.zzcli) {
                                Log.d("FirebaseInstanceId", "connectivity changed. starting background sync.");
                            }
                            this.zzclk.getApplicationContext().unregisterReceiver(this);
                            zzg.zzabT().zzf(context, FirebaseInstanceIdService.zzqE(zza));
                        }
                    }
                };
            }
            getApplicationContext().registerReceiver(zzclf, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    private zzd zzjw(String str) {
        if (str == null) {
            return zzd.zzb(this, null);
        }
        Bundle bundle = new Bundle();
        bundle.putString("subtype", str);
        return zzd.zzb(this, bundle);
    }

    private static Intent zzqE(int i) {
        Intent intent = new Intent("ACTION_TOKEN_REFRESH_RETRY");
        intent.putExtra("next_retry_delay_in_seconds", i);
        return intent;
    }

    private void zzqF(int i) {
        ((AlarmManager) getSystemService("alarm")).set(3, SystemClock.elapsedRealtime() + ((long) (i * 1000)), zzg.zza(this, 0, zzqE(i * 2), 134217728));
    }

    @WorkerThread
    public void onTokenRefresh() {
    }

    protected Intent zzF(Intent intent) {
        return zzg.zzabT().zzabU();
    }

    public boolean zzH(Intent intent) {
        this.zzcli = Log.isLoggable("FirebaseInstanceId", 3);
        if (intent.getStringExtra("error") == null && intent.getStringExtra("registration_id") == null) {
            return false;
        }
        String zzJ = zzJ(intent);
        if (this.zzcli) {
            String str = "FirebaseInstanceId";
            String str2 = "Register result in service ";
            String valueOf = String.valueOf(zzJ);
            Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        zzjw(zzJ).zzabQ().zzv(intent);
        return true;
    }

    public void zzI(Intent intent) {
        String zzJ = zzJ(intent);
        zzd zzjw = zzjw(zzJ);
        String stringExtra = intent.getStringExtra("CMD");
        if (this.zzcli) {
            String valueOf = String.valueOf(intent.getExtras());
            Log.d("FirebaseInstanceId", new StringBuilder(((String.valueOf(zzJ).length() + 18) + String.valueOf(stringExtra).length()) + String.valueOf(valueOf).length()).append("Service command ").append(zzJ).append(" ").append(stringExtra).append(" ").append(valueOf).toString());
        }
        if (intent.getStringExtra("unregistered") != null) {
            zzh zzabP = zzjw.zzabP();
            if (zzJ == null) {
                zzJ = "";
            }
            zzabP.zzeK(zzJ);
            zzjw.zzabQ().zzv(intent);
        } else if ("gcm.googleapis.com/refresh".equals(intent.getStringExtra("from"))) {
            zzjw.zzabP().zzeK(zzJ);
            zza(intent, false, true);
        } else if ("RST".equals(stringExtra)) {
            zzjw.zzHh();
            zza(intent, true, true);
        } else if ("RST_FULL".equals(stringExtra)) {
            if (!zzjw.zzabP().isEmpty()) {
                zzjw.zzHh();
                zzjw.zzabP().zzHn();
                zza(intent, true, true);
            }
        } else if ("SYNC".equals(stringExtra)) {
            zzjw.zzabP().zzeK(zzJ);
            zza(intent, false, true);
        } else if ("PING".equals(stringExtra)) {
            zza(zzjw.zzabQ(), intent.getExtras());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void zzm(android.content.Intent r5) {
        /*
        r4 = this;
        r1 = 0;
        r0 = r5.getAction();
        if (r0 != 0) goto L_0x0009;
    L_0x0007:
        r0 = "";
    L_0x0009:
        r2 = -1;
        r3 = r0.hashCode();
        switch(r3) {
            case -1737547627: goto L_0x0019;
            default: goto L_0x0011;
        };
    L_0x0011:
        r0 = r2;
    L_0x0012:
        switch(r0) {
            case 0: goto L_0x0023;
            default: goto L_0x0015;
        };
    L_0x0015:
        r4.zzI(r5);
    L_0x0018:
        return;
    L_0x0019:
        r3 = "ACTION_TOKEN_REFRESH_RETRY";
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x0011;
    L_0x0021:
        r0 = r1;
        goto L_0x0012;
    L_0x0023:
        r4.zza(r5, r1, r1);
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdService.zzm(android.content.Intent):void");
    }
}