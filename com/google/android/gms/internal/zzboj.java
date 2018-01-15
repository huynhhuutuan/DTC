package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

class zzboj implements com.google.android.gms.internal.zzbot.zza {
    private static long zzcbv = 0;
    private final zzbrn zzcaJ;
    private zzbon zzcbw;
    private zzbot zzcbx;
    private zza zzcby;
    private zzc zzcbz = zzc.REALTIME_CONNECTING;

    public interface zza {
        void zzau(Map<String, Object> map);

        void zzb(zzb com_google_android_gms_internal_zzboj_zzb);

        void zziJ(String str);

        void zziK(String str);

        void zzj(long j, String str);
    }

    public enum zzb {
        SERVER_RESET,
        OTHER
    }

    private enum zzc {
        REALTIME_CONNECTING,
        REALTIME_CONNECTED,
        REALTIME_DISCONNECTED
    }

    public zzboj(zzbol com_google_android_gms_internal_zzbol, zzbon com_google_android_gms_internal_zzbon, String str, zza com_google_android_gms_internal_zzboj_zza, String str2) {
        long j = zzcbv;
        zzcbv = 1 + j;
        this.zzcbw = com_google_android_gms_internal_zzbon;
        this.zzcby = com_google_android_gms_internal_zzboj_zza;
        this.zzcaJ = new zzbrn(com_google_android_gms_internal_zzbol.zzXq(), "Connection", "conn_" + j);
        this.zzcbx = new zzbot(com_google_android_gms_internal_zzbol, com_google_android_gms_internal_zzbon, str, this, str2);
    }

    private void zzau(Map<String, Object> map) {
        if (this.zzcaJ.zzaaC()) {
            zzbrn com_google_android_gms_internal_zzbrn = this.zzcaJ;
            String str = "received data message: ";
            String valueOf = String.valueOf(map.toString());
            com_google_android_gms_internal_zzbrn.zzi(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
        }
        this.zzcby.zzau(map);
    }

    private void zzav(Map<String, Object> map) {
        if (this.zzcaJ.zzaaC()) {
            zzbrn com_google_android_gms_internal_zzbrn = this.zzcaJ;
            String str = "Got control message: ";
            String valueOf = String.valueOf(map.toString());
            com_google_android_gms_internal_zzbrn.zzi(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
        }
        try {
            valueOf = (String) map.get("t");
            if (valueOf == null) {
                if (this.zzcaJ.zzaaC()) {
                    com_google_android_gms_internal_zzbrn = this.zzcaJ;
                    str = "Got invalid control message: ";
                    valueOf = String.valueOf(map.toString());
                    com_google_android_gms_internal_zzbrn.zzi(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
                }
                close();
            } else if (valueOf.equals("s")) {
                zziH((String) map.get("d"));
            } else if (valueOf.equals("r")) {
                zziI((String) map.get("d"));
            } else if (valueOf.equals("h")) {
                zzaw((Map) map.get("d"));
            } else if (this.zzcaJ.zzaaC()) {
                com_google_android_gms_internal_zzbrn = this.zzcaJ;
                str = "Ignoring unknown control message: ";
                valueOf = String.valueOf(valueOf);
                com_google_android_gms_internal_zzbrn.zzi(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
            }
        } catch (ClassCastException e) {
            if (this.zzcaJ.zzaaC()) {
                com_google_android_gms_internal_zzbrn = this.zzcaJ;
                str = "Failed to parse control message: ";
                valueOf = String.valueOf(e.toString());
                com_google_android_gms_internal_zzbrn.zzi(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
            }
            close();
        }
    }

    private void zzaw(Map<String, Object> map) {
        long longValue = ((Long) map.get("ts")).longValue();
        this.zzcby.zziJ((String) map.get("h"));
        String str = (String) map.get("s");
        if (this.zzcbz == zzc.REALTIME_CONNECTING) {
            zzi(longValue, str);
        }
    }

    private void zzb(Map<String, Object> map, boolean z) {
        if (this.zzcbz != zzc.REALTIME_CONNECTED) {
            this.zzcaJ.zzi("Tried to send on an unconnected connection", new Object[0]);
            return;
        }
        if (z) {
            this.zzcaJ.zzi("Sending data (contents hidden)", new Object[0]);
        } else {
            this.zzcaJ.zzi("Sending data: %s", map);
        }
        this.zzcbx.send(map);
    }

    private void zzi(long j, String str) {
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi("realtime connection established", new Object[0]);
        }
        this.zzcbz = zzc.REALTIME_CONNECTED;
        this.zzcby.zzj(j, str);
    }

    private void zziH(String str) {
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi("Connection shutdown command received. Shutting down...", new Object[0]);
        }
        this.zzcby.zziK(str);
        close();
    }

    private void zziI(String str) {
        if (this.zzcaJ.zzaaC()) {
            zzbrn com_google_android_gms_internal_zzbrn = this.zzcaJ;
            String valueOf = String.valueOf(this.zzcbw.getHost());
            com_google_android_gms_internal_zzbrn.zzi(new StringBuilder((String.valueOf(valueOf).length() + 62) + String.valueOf(str).length()).append("Got a reset; killing connection to ").append(valueOf).append("; Updating internalHost to ").append(str).toString(), new Object[0]);
        }
        this.zzcby.zziJ(str);
        zza(zzb.SERVER_RESET);
    }

    public void close() {
        zza(zzb.OTHER);
    }

    public void open() {
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi("Opening a connection", new Object[0]);
        }
        this.zzcbx.open();
    }

    public void zza(zzb com_google_android_gms_internal_zzboj_zzb) {
        if (this.zzcbz != zzc.REALTIME_DISCONNECTED) {
            if (this.zzcaJ.zzaaC()) {
                this.zzcaJ.zzi("closing realtime connection", new Object[0]);
            }
            this.zzcbz = zzc.REALTIME_DISCONNECTED;
            if (this.zzcbx != null) {
                this.zzcbx.close();
                this.zzcbx = null;
            }
            this.zzcby.zzb(com_google_android_gms_internal_zzboj_zzb);
        }
    }

    public void zza(Map<String, Object> map, boolean z) {
        Map hashMap = new HashMap();
        hashMap.put("t", "d");
        hashMap.put("d", map);
        zzb(hashMap, z);
    }

    public void zzat(Map<String, Object> map) {
        String str;
        zzbrn com_google_android_gms_internal_zzbrn;
        String str2;
        try {
            str = (String) map.get("t");
            if (str == null) {
                if (this.zzcaJ.zzaaC()) {
                    com_google_android_gms_internal_zzbrn = this.zzcaJ;
                    str2 = "Failed to parse server message: missing message type:";
                    str = String.valueOf(map.toString());
                    com_google_android_gms_internal_zzbrn.zzi(str.length() != 0 ? str2.concat(str) : new String(str2), new Object[0]);
                }
                close();
            } else if (str.equals("d")) {
                zzau((Map) map.get("d"));
            } else if (str.equals("c")) {
                zzav((Map) map.get("d"));
            } else if (this.zzcaJ.zzaaC()) {
                com_google_android_gms_internal_zzbrn = this.zzcaJ;
                str2 = "Ignoring unknown server message type: ";
                str = String.valueOf(str);
                com_google_android_gms_internal_zzbrn.zzi(str.length() != 0 ? str2.concat(str) : new String(str2), new Object[0]);
            }
        } catch (ClassCastException e) {
            if (this.zzcaJ.zzaaC()) {
                com_google_android_gms_internal_zzbrn = this.zzcaJ;
                str2 = "Failed to parse server message: ";
                str = String.valueOf(e.toString());
                com_google_android_gms_internal_zzbrn.zzi(str.length() != 0 ? str2.concat(str) : new String(str2), new Object[0]);
            }
            close();
        }
    }

    public void zzba(boolean z) {
        this.zzcbx = null;
        if (z || this.zzcbz != zzc.REALTIME_CONNECTING) {
            if (this.zzcaJ.zzaaC()) {
                this.zzcaJ.zzi("Realtime connection lost", new Object[0]);
            }
        } else if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi("Realtime connection failed", new Object[0]);
        }
        close();
    }
}
