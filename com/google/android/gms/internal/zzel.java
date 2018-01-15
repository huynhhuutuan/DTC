package com.google.android.gms.internal;

@zzme
public class zzel {
    private static final Object zztX = new Object();
    private static zzel zzzT;
    private final zzqe zzzU = new zzqe();
    private final zzek zzzV = new zzek(new zzeb(), new zzea(), new zzfj(), new zzht(), new zzny(), new zzlk(), new zzky());

    static {
        zza(new zzel());
    }

    protected zzel() {
    }

    protected static void zza(zzel com_google_android_gms_internal_zzel) {
        synchronized (zztX) {
            zzzT = com_google_android_gms_internal_zzel;
        }
    }

    private static zzel zzeS() {
        zzel com_google_android_gms_internal_zzel;
        synchronized (zztX) {
            com_google_android_gms_internal_zzel = zzzT;
        }
        return com_google_android_gms_internal_zzel;
    }

    public static zzqe zzeT() {
        return zzeS().zzzU;
    }

    public static zzek zzeU() {
        return zzeS().zzzV;
    }
}
