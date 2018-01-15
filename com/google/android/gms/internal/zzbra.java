package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class zzbra {
    private final zzbrn zzcaJ;
    private final zzbpe zzcdW;

    public zzbra(zzbpa com_google_android_gms_internal_zzbpa) {
        this.zzcdW = com_google_android_gms_internal_zzbpa.zzYz();
        this.zzcaJ = com_google_android_gms_internal_zzbpa.zziV("EventRaiser");
    }

    public void zzab(List<? extends zzbqy> list) {
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi("Raising " + list.size() + " event(s)", new Object[0]);
        }
        final ArrayList arrayList = new ArrayList(list);
        this.zzcdW.zzq(new Runnable(this) {
            final /* synthetic */ zzbra zzcih;

            public void run() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzbqy com_google_android_gms_internal_zzbqy = (zzbqy) it.next();
                    if (this.zzcih.zzcaJ.zzaaC()) {
                        zzbrn zza = this.zzcih.zzcaJ;
                        String str = "Raising ";
                        String valueOf = String.valueOf(com_google_android_gms_internal_zzbqy.toString());
                        zza.zzi(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
                    }
                    com_google_android_gms_internal_zzbqy.zzZS();
                }
            }
        });
    }
}
