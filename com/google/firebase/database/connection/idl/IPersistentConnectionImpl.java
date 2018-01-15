package com.google.firebase.database.connection.idl;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.firebase_database.ModuleDescriptor;
import com.google.android.gms.internal.zzboi;
import com.google.android.gms.internal.zzbok;
import com.google.android.gms.internal.zzbol;
import com.google.android.gms.internal.zzboo;
import com.google.android.gms.internal.zzbop;
import com.google.android.gms.internal.zzboq;
import com.google.android.gms.internal.zzbor;
import com.google.android.gms.internal.zzbos;
import com.google.android.gms.internal.zzbrl;
import com.google.firebase.database.connection.idl.zzk.zza;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

@DynamiteApi
public class IPersistentConnectionImpl extends zza {
    private zzbop zzcdk;

    class C11512 implements zzbos {
        final /* synthetic */ zzm zzcdm;

        C11512(zzm com_google_firebase_database_connection_idl_zzm) {
            this.zzcdm = com_google_firebase_database_connection_idl_zzm;
        }

        public void zzar(String str, String str2) {
            try {
                this.zzcdm.zzar(str, str2);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    class C11524 implements zzbop.zza {
        final /* synthetic */ zzl zzcdo;

        C11524(zzl com_google_firebase_database_connection_idl_zzl) {
            this.zzcdo = com_google_firebase_database_connection_idl_zzl;
        }

        public void onDisconnect() {
            try {
                this.zzcdo.onDisconnect();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void zzXy() {
            try {
                this.zzcdo.zzXy();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void zza(List<String> list, Object obj, boolean z, Long l) {
            try {
                this.zzcdo.zza((List) list, zzd.zzA(obj), z, IPersistentConnectionImpl.zza(l));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void zza(List<String> list, List<zzbor> list2, Long l) {
            List arrayList = new ArrayList(list2.size());
            List arrayList2 = new ArrayList(list2.size());
            for (zzbor com_google_android_gms_internal_zzbor : list2) {
                arrayList.add(zzn.zza(com_google_android_gms_internal_zzbor));
                arrayList2.add(com_google_android_gms_internal_zzbor.zzXX());
            }
            try {
                this.zzcdo.zza((List) list, arrayList, zzd.zzA(arrayList2), IPersistentConnectionImpl.zza(l));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void zzax(Map<String, Object> map) {
            try {
                this.zzcdo.zzP(zzd.zzA(map));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void zzbc(boolean z) {
            try {
                this.zzcdo.zzbc(z);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    class C11546 implements zzbok {
        final /* synthetic */ zzh zzcdr;

        C11546(zzh com_google_firebase_database_connection_idl_zzh) {
            this.zzcdr = com_google_firebase_database_connection_idl_zzh;
        }

        public void zza(boolean z, final zzbok.zza com_google_android_gms_internal_zzbok_zza) {
            try {
                this.zzcdr.zza(z, new zzi.zza(this) {
                    public void onError(String str) throws RemoteException {
                        com_google_android_gms_internal_zzbok_zza.onError(str);
                    }

                    public void zziL(String str) throws RemoteException {
                        com_google_android_gms_internal_zzbok_zza.zziL(str);
                    }
                });
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    class C12333 extends zzl.zza {
        final /* synthetic */ zzbop.zza zzcdn;

        C12333(zzbop.zza com_google_android_gms_internal_zzbop_zza) {
            this.zzcdn = com_google_android_gms_internal_zzbop_zza;
        }

        public void onDisconnect() {
            this.zzcdn.onDisconnect();
        }

        public void zzP(IObjectWrapper iObjectWrapper) {
            this.zzcdn.zzax((Map) zzd.zzF(iObjectWrapper));
        }

        public void zzXy() {
            this.zzcdn.zzXy();
        }

        public void zza(List<String> list, IObjectWrapper iObjectWrapper, boolean z, long j) {
            this.zzcdn.zza(list, zzd.zzF(iObjectWrapper), z, IPersistentConnectionImpl.zzaJ(j));
        }

        public void zza(List<String> list, List<zzn> list2, IObjectWrapper iObjectWrapper, long j) {
            List list3 = (List) zzd.zzF(iObjectWrapper);
            List arrayList = new ArrayList(list2.size());
            for (int i = 0; i < list2.size(); i++) {
                arrayList.add(zzn.zza((zzn) list2.get(i), list3.get(i)));
            }
            this.zzcdn.zza(list, arrayList, IPersistentConnectionImpl.zzaJ(j));
        }

        public void zzbc(boolean z) {
            this.zzcdn.zzbc(z);
        }
    }

    class C12345 extends zzh.zza {
        final /* synthetic */ zzbok zzcdp;

        C12345(zzbok com_google_android_gms_internal_zzbok) {
            this.zzcdp = com_google_android_gms_internal_zzbok;
        }

        public void zza(boolean z, final zzi com_google_firebase_database_connection_idl_zzi) throws RemoteException {
            this.zzcdp.zza(z, new zzbok.zza(this) {
                public void onError(String str) {
                    try {
                        com_google_firebase_database_connection_idl_zzi.onError(str);
                    } catch (Throwable e) {
                        throw new RuntimeException(e);
                    }
                }

                public void zziL(String str) {
                    try {
                        com_google_firebase_database_connection_idl_zzi.zziL(str);
                    } catch (Throwable e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }
    }

    public static zzk loadDynamic(Context context, zzc com_google_firebase_database_connection_idl_zzc, zzbok com_google_android_gms_internal_zzbok, ScheduledExecutorService scheduledExecutorService, zzbop.zza com_google_android_gms_internal_zzbop_zza) {
        try {
            zzk asInterface = zza.asInterface(DynamiteModule.zza(context, DynamiteModule.zzaRX, ModuleDescriptor.MODULE_ID).zzdT("com.google.firebase.database.connection.idl.IPersistentConnectionImpl"));
            asInterface.setup(com_google_firebase_database_connection_idl_zzc, zza(com_google_android_gms_internal_zzbok), zzd.zzA(scheduledExecutorService), zza(com_google_android_gms_internal_zzbop_zza));
            return asInterface;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }

    private static long zza(Long l) {
        if (l == null) {
            return -1;
        }
        if (l.longValue() != -1) {
            return l.longValue();
        }
        throw new IllegalArgumentException("Tag parameter clashed with NO_TAG value");
    }

    private static zzbok zza(zzh com_google_firebase_database_connection_idl_zzh) {
        return new C11546(com_google_firebase_database_connection_idl_zzh);
    }

    private static zzbop.zza zza(zzl com_google_firebase_database_connection_idl_zzl) {
        return new C11524(com_google_firebase_database_connection_idl_zzl);
    }

    private static zzbos zza(zzm com_google_firebase_database_connection_idl_zzm) {
        return new C11512(com_google_firebase_database_connection_idl_zzm);
    }

    private static zzh zza(zzbok com_google_android_gms_internal_zzbok) {
        return new C12345(com_google_android_gms_internal_zzbok);
    }

    private static zzl zza(zzbop.zza com_google_android_gms_internal_zzbop_zza) {
        return new C12333(com_google_android_gms_internal_zzbop_zza);
    }

    private static Long zzaJ(long j) {
        return j == -1 ? null : Long.valueOf(j);
    }

    public void compareAndPut(List<String> list, IObjectWrapper iObjectWrapper, String str, zzm com_google_firebase_database_connection_idl_zzm) {
        this.zzcdk.zza(list, zzd.zzF(iObjectWrapper), str, zza(com_google_firebase_database_connection_idl_zzm));
    }

    public void initialize() {
        this.zzcdk.initialize();
    }

    public void interrupt(String str) {
        this.zzcdk.interrupt(str);
    }

    public boolean isInterrupted(String str) {
        return this.zzcdk.isInterrupted(str);
    }

    public void listen(List<String> list, IObjectWrapper iObjectWrapper, final zzj com_google_firebase_database_connection_idl_zzj, long j, zzm com_google_firebase_database_connection_idl_zzm) {
        Long zzaJ = zzaJ(j);
        List<String> list2 = list;
        this.zzcdk.zza(list2, (Map) zzd.zzF(iObjectWrapper), new zzboo(this) {
            public String zzXv() {
                try {
                    return com_google_firebase_database_connection_idl_zzj.zzXv();
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }

            public boolean zzXw() {
                try {
                    return com_google_firebase_database_connection_idl_zzj.zzXw();
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }

            public zzboi zzXx() {
                try {
                    return zza.zza(com_google_firebase_database_connection_idl_zzj.zzYf());
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
        }, zzaJ, zza(com_google_firebase_database_connection_idl_zzm));
    }

    public void merge(List<String> list, IObjectWrapper iObjectWrapper, zzm com_google_firebase_database_connection_idl_zzm) {
        this.zzcdk.zza((List) list, (Map) zzd.zzF(iObjectWrapper), zza(com_google_firebase_database_connection_idl_zzm));
    }

    public void onDisconnectCancel(List<String> list, zzm com_google_firebase_database_connection_idl_zzm) {
        this.zzcdk.zza((List) list, zza(com_google_firebase_database_connection_idl_zzm));
    }

    public void onDisconnectMerge(List<String> list, IObjectWrapper iObjectWrapper, zzm com_google_firebase_database_connection_idl_zzm) {
        this.zzcdk.zzb((List) list, (Map) zzd.zzF(iObjectWrapper), zza(com_google_firebase_database_connection_idl_zzm));
    }

    public void onDisconnectPut(List<String> list, IObjectWrapper iObjectWrapper, zzm com_google_firebase_database_connection_idl_zzm) {
        this.zzcdk.zzb((List) list, zzd.zzF(iObjectWrapper), zza(com_google_firebase_database_connection_idl_zzm));
    }

    public void purgeOutstandingWrites() {
        this.zzcdk.purgeOutstandingWrites();
    }

    public void put(List<String> list, IObjectWrapper iObjectWrapper, zzm com_google_firebase_database_connection_idl_zzm) {
        this.zzcdk.zza((List) list, zzd.zzF(iObjectWrapper), zza(com_google_firebase_database_connection_idl_zzm));
    }

    public void refreshAuthToken() {
        this.zzcdk.refreshAuthToken();
    }

    public void refreshAuthToken2(String str) {
        this.zzcdk.zziN(str);
    }

    public void resume(String str) {
        this.zzcdk.resume(str);
    }

    public void setup(zzc com_google_firebase_database_connection_idl_zzc, zzh com_google_firebase_database_connection_idl_zzh, IObjectWrapper iObjectWrapper, zzl com_google_firebase_database_connection_idl_zzl) {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzd.zzF(iObjectWrapper);
        this.zzcdk = new zzboq(new zzbol(new zzbrl(com_google_firebase_database_connection_idl_zzc.zzYd(), com_google_firebase_database_connection_idl_zzc.zzYe()), zza(com_google_firebase_database_connection_idl_zzh), scheduledExecutorService, com_google_firebase_database_connection_idl_zzc.zzcbJ, com_google_firebase_database_connection_idl_zzc.zzcdf, com_google_firebase_database_connection_idl_zzc.zzcbL), zzf.zza(com_google_firebase_database_connection_idl_zzc.zzcdc), zza(com_google_firebase_database_connection_idl_zzl));
    }

    public void shutdown() {
        this.zzcdk.shutdown();
    }

    public void unlisten(List<String> list, IObjectWrapper iObjectWrapper) {
        this.zzcdk.zza((List) list, (Map) zzd.zzF(iObjectWrapper));
    }
}
