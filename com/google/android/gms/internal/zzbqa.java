package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class zzbqa implements zzbpd {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbqa.class.desiredAssertionStatus());
    private static zzbqa zzcgK = new zzbqa();
    final HashMap<zzbpc, List<zzbpc>> zzcgJ = new HashMap();

    private zzbqa() {
    }

    public static zzbqa zzZt() {
        return zzcgK;
    }

    private void zzj(zzbpc com_google_android_gms_internal_zzbpc) {
        int i = 0;
        synchronized (this.zzcgJ) {
            List list = (List) this.zzcgJ.get(com_google_android_gms_internal_zzbpc);
            int i2;
            if (list != null) {
                int i3;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    if (list.get(i4) == com_google_android_gms_internal_zzbpc) {
                        i3 = 1;
                        list.remove(i4);
                        break;
                    }
                }
                i3 = 0;
                if (list.isEmpty()) {
                    this.zzcgJ.remove(com_google_android_gms_internal_zzbpc);
                }
                i2 = i3;
            } else {
                i2 = 0;
            }
            if (!$assertionsDisabled && r0 == 0 && com_google_android_gms_internal_zzbpc.zzYL()) {
                throw new AssertionError();
            }
            if (!com_google_android_gms_internal_zzbpc.zzYm().isDefault()) {
                zzbpc zza = com_google_android_gms_internal_zzbpc.zza(zzbrc.zzN(com_google_android_gms_internal_zzbpc.zzYm().zzWL()));
                list = (List) this.zzcgJ.get(zza);
                if (list != null) {
                    while (i < list.size()) {
                        if (list.get(i) == com_google_android_gms_internal_zzbpc) {
                            list.remove(i);
                            break;
                        }
                        i++;
                    }
                    if (list.isEmpty()) {
                        this.zzcgJ.remove(zza);
                    }
                }
            }
        }
    }

    public void zzd(zzbpc com_google_android_gms_internal_zzbpc) {
        zzj(com_google_android_gms_internal_zzbpc);
    }

    public void zzi(zzbpc com_google_android_gms_internal_zzbpc) {
        synchronized (this.zzcgJ) {
            List list = (List) this.zzcgJ.get(com_google_android_gms_internal_zzbpc);
            if (list == null) {
                list = new ArrayList();
                this.zzcgJ.put(com_google_android_gms_internal_zzbpc, list);
            }
            list.add(com_google_android_gms_internal_zzbpc);
            if (!com_google_android_gms_internal_zzbpc.zzYm().isDefault()) {
                zzbpc zza = com_google_android_gms_internal_zzbpc.zza(zzbrc.zzN(com_google_android_gms_internal_zzbpc.zzYm().zzWL()));
                list = (List) this.zzcgJ.get(zza);
                if (list == null) {
                    list = new ArrayList();
                    this.zzcgJ.put(zza, list);
                }
                list.add(com_google_android_gms_internal_zzbpc);
            }
            com_google_android_gms_internal_zzbpc.zzbf(true);
            com_google_android_gms_internal_zzbpc.zza((zzbpd) this);
        }
    }

    public void zzk(zzbpc com_google_android_gms_internal_zzbpc) {
        synchronized (this.zzcgJ) {
            List list = (List) this.zzcgJ.get(com_google_android_gms_internal_zzbpc);
            if (!(list == null || list.isEmpty())) {
                if (com_google_android_gms_internal_zzbpc.zzYm().isDefault()) {
                    HashSet hashSet = new HashSet();
                    for (int size = list.size() - 1; size >= 0; size--) {
                        zzbpc com_google_android_gms_internal_zzbpc2 = (zzbpc) list.get(size);
                        if (!hashSet.contains(com_google_android_gms_internal_zzbpc2.zzYm())) {
                            hashSet.add(com_google_android_gms_internal_zzbpc2.zzYm());
                            com_google_android_gms_internal_zzbpc2.zzYJ();
                        }
                    }
                } else {
                    ((zzbpc) list.get(0)).zzYJ();
                }
            }
        }
    }
}
