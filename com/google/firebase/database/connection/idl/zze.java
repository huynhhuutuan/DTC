package com.google.firebase.database.connection.idl;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzbol;
import com.google.android.gms.internal.zzboo;
import com.google.android.gms.internal.zzbop;
import com.google.android.gms.internal.zzbos;
import com.google.firebase.database.connection.idl.zzm.zza;
import java.util.List;
import java.util.Map;

public class zze implements zzbop {
    private final zzk zzcdh;

    class C12372 extends zza {
        final /* synthetic */ zzbos zzcdj;

        C12372(zzbos com_google_android_gms_internal_zzbos) {
            this.zzcdj = com_google_android_gms_internal_zzbos;
        }

        public void zzar(String str, String str2) throws RemoteException {
            this.zzcdj.zzar(str, str2);
        }
    }

    private zze(zzk com_google_firebase_database_connection_idl_zzk) {
        this.zzcdh = com_google_firebase_database_connection_idl_zzk;
    }

    public static zze zza(Context context, zzc com_google_firebase_database_connection_idl_zzc, zzbol com_google_android_gms_internal_zzbol, zzbop.zza com_google_android_gms_internal_zzbop_zza) {
        return new zze(IPersistentConnectionImpl.loadDynamic(context, com_google_firebase_database_connection_idl_zzc, com_google_android_gms_internal_zzbol.zzXr(), com_google_android_gms_internal_zzbol.zzXs(), com_google_android_gms_internal_zzbop_zza));
    }

    private static zzm zza(zzbos com_google_android_gms_internal_zzbos) {
        return new C12372(com_google_android_gms_internal_zzbos);
    }

    public void initialize() {
        try {
            this.zzcdh.initialize();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void interrupt(String str) {
        try {
            this.zzcdh.interrupt(str);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isInterrupted(String str) {
        try {
            return this.zzcdh.isInterrupted(str);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void purgeOutstandingWrites() {
        try {
            this.zzcdh.purgeOutstandingWrites();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void refreshAuthToken() {
        try {
            this.zzcdh.refreshAuthToken();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void resume(String str) {
        try {
            this.zzcdh.resume(str);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void shutdown() {
        try {
            this.zzcdh.shutdown();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void zza(List<String> list, zzbos com_google_android_gms_internal_zzbos) {
        try {
            this.zzcdh.onDisconnectCancel(list, zza(com_google_android_gms_internal_zzbos));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void zza(List<String> list, Object obj, zzbos com_google_android_gms_internal_zzbos) {
        try {
            this.zzcdh.put(list, zzd.zzA(obj), zza(com_google_android_gms_internal_zzbos));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void zza(List<String> list, Object obj, String str, zzbos com_google_android_gms_internal_zzbos) {
        try {
            this.zzcdh.compareAndPut(list, zzd.zzA(obj), str, zza(com_google_android_gms_internal_zzbos));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void zza(List<String> list, Map<String, Object> map) {
        try {
            this.zzcdh.unlisten(list, zzd.zzA(map));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void zza(List<String> list, Map<String, Object> map, final zzboo com_google_android_gms_internal_zzboo, Long l, zzbos com_google_android_gms_internal_zzbos) {
        long longValue;
        zzj c12361 = new zzj.zza(this) {
            public String zzXv() {
                return com_google_android_gms_internal_zzboo.zzXv();
            }

            public boolean zzXw() {
                return com_google_android_gms_internal_zzboo.zzXw();
            }

            public zza zzYf() {
                return zza.zza(com_google_android_gms_internal_zzboo.zzXx());
            }
        };
        if (l != null) {
            try {
                longValue = l.longValue();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        longValue = -1;
        this.zzcdh.listen(list, zzd.zzA(map), c12361, longValue, zza(com_google_android_gms_internal_zzbos));
    }

    public void zza(List<String> list, Map<String, Object> map, zzbos com_google_android_gms_internal_zzbos) {
        try {
            this.zzcdh.merge(list, zzd.zzA(map), zza(com_google_android_gms_internal_zzbos));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void zzb(List<String> list, Object obj, zzbos com_google_android_gms_internal_zzbos) {
        try {
            this.zzcdh.onDisconnectPut(list, zzd.zzA(obj), zza(com_google_android_gms_internal_zzbos));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void zzb(List<String> list, Map<String, Object> map, zzbos com_google_android_gms_internal_zzbos) {
        try {
            this.zzcdh.onDisconnectMerge(list, zzd.zzA(map), zza(com_google_android_gms_internal_zzbos));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void zziN(String str) {
        try {
            this.zzcdh.refreshAuthToken2(str);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
