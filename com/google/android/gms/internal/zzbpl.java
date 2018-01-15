package com.google.android.gms.internal;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.FirebaseDatabase;
import java.util.HashMap;
import java.util.Map;

public class zzbpl {
    private static final zzbpl zzcfz = new zzbpl();
    private final Map<zzbpa, Map<String, zzbpj>> zzcfA = new HashMap();

    class C04981 implements Runnable {
        final /* synthetic */ zzbpj zzceQ;

        C04981(zzbpj com_google_android_gms_internal_zzbpj) {
            this.zzceQ = com_google_android_gms_internal_zzbpj;
        }

        public void run() {
            this.zzceQ.interrupt();
        }
    }

    class C04992 implements Runnable {
        final /* synthetic */ zzbpj zzceQ;

        C04992(zzbpj com_google_android_gms_internal_zzbpj) {
            this.zzceQ = com_google_android_gms_internal_zzbpj;
        }

        public void run() {
            this.zzceQ.resume();
        }
    }

    public static zzbpj zza(zzbpa com_google_android_gms_internal_zzbpa, zzbpk com_google_android_gms_internal_zzbpk, FirebaseDatabase firebaseDatabase) throws DatabaseException {
        return zzcfz.zzb(com_google_android_gms_internal_zzbpa, com_google_android_gms_internal_zzbpk, firebaseDatabase);
    }

    private zzbpj zzb(zzbpa com_google_android_gms_internal_zzbpa, zzbpk com_google_android_gms_internal_zzbpk, FirebaseDatabase firebaseDatabase) throws DatabaseException {
        zzbpj com_google_android_gms_internal_zzbpj;
        com_google_android_gms_internal_zzbpa.zzYi();
        String str = com_google_android_gms_internal_zzbpk.zzcbM;
        String str2 = com_google_android_gms_internal_zzbpk.zzaGP;
        str2 = new StringBuilder((String.valueOf(str).length() + 9) + String.valueOf(str2).length()).append("https://").append(str).append("/").append(str2).toString();
        synchronized (this.zzcfA) {
            if (!this.zzcfA.containsKey(com_google_android_gms_internal_zzbpa)) {
                this.zzcfA.put(com_google_android_gms_internal_zzbpa, new HashMap());
            }
            Map map = (Map) this.zzcfA.get(com_google_android_gms_internal_zzbpa);
            if (map.containsKey(str2)) {
                throw new IllegalStateException("createLocalRepo() called for existing repo.");
            }
            com_google_android_gms_internal_zzbpj = new zzbpj(com_google_android_gms_internal_zzbpk, com_google_android_gms_internal_zzbpa, firebaseDatabase);
            map.put(str2, com_google_android_gms_internal_zzbpj);
        }
        return com_google_android_gms_internal_zzbpj;
    }

    public static void zzd(zzbpa com_google_android_gms_internal_zzbpa) {
        zzcfz.zzf(com_google_android_gms_internal_zzbpa);
    }

    public static void zze(zzbpa com_google_android_gms_internal_zzbpa) {
        zzcfz.zzg(com_google_android_gms_internal_zzbpa);
    }

    private void zzf(final zzbpa com_google_android_gms_internal_zzbpa) {
        zzbpm zzYA = com_google_android_gms_internal_zzbpa.zzYA();
        if (zzYA != null) {
            zzYA.zzs(new Runnable(this) {
                final /* synthetic */ zzbpl zzcfC;

                public void run() {
                    synchronized (this.zzcfC.zzcfA) {
                        if (this.zzcfC.zzcfA.containsKey(com_google_android_gms_internal_zzbpa)) {
                            Object obj = 1;
                            for (zzbpj com_google_android_gms_internal_zzbpj : ((Map) this.zzcfC.zzcfA.get(com_google_android_gms_internal_zzbpa)).values()) {
                                com_google_android_gms_internal_zzbpj.interrupt();
                                Object obj2 = (obj == null || com_google_android_gms_internal_zzbpj.zzYZ()) ? null : 1;
                                obj = obj2;
                            }
                            if (obj != null) {
                                com_google_android_gms_internal_zzbpa.stop();
                            }
                        }
                    }
                }
            });
        }
    }

    private void zzg(final zzbpa com_google_android_gms_internal_zzbpa) {
        zzbpm zzYA = com_google_android_gms_internal_zzbpa.zzYA();
        if (zzYA != null) {
            zzYA.zzs(new Runnable(this) {
                final /* synthetic */ zzbpl zzcfC;

                public void run() {
                    synchronized (this.zzcfC.zzcfA) {
                        if (this.zzcfC.zzcfA.containsKey(com_google_android_gms_internal_zzbpa)) {
                            for (zzbpj resume : ((Map) this.zzcfC.zzcfA.get(com_google_android_gms_internal_zzbpa)).values()) {
                                resume.resume();
                            }
                        }
                    }
                }
            });
        }
    }

    public static void zzk(zzbpj com_google_android_gms_internal_zzbpj) {
        com_google_android_gms_internal_zzbpj.zzs(new C04981(com_google_android_gms_internal_zzbpj));
    }

    public static void zzl(zzbpj com_google_android_gms_internal_zzbpj) {
        com_google_android_gms_internal_zzbpj.zzs(new C04992(com_google_android_gms_internal_zzbpj));
    }
}
