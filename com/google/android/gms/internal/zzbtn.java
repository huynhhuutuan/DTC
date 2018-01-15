package com.google.android.gms.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.zzbts.zza;
import com.google.android.gms.internal.zzbts.zzb;
import com.google.android.gms.internal.zzbts.zzc;
import com.google.android.gms.internal.zzbts.zzd;
import com.google.android.gms.internal.zzbts.zze;
import com.google.android.gms.internal.zzbts.zzf;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class zzbtn implements Runnable {
    public final Context mContext;
    public final zzbtr zzclQ;
    public final zzbto zzclY;
    public final zzbto zzclZ;
    public final zzbto zzcma;

    public zzbtn(Context context, zzbto com_google_android_gms_internal_zzbto, zzbto com_google_android_gms_internal_zzbto2, zzbto com_google_android_gms_internal_zzbto3, zzbtr com_google_android_gms_internal_zzbtr) {
        this.mContext = context;
        this.zzclY = com_google_android_gms_internal_zzbto;
        this.zzclZ = com_google_android_gms_internal_zzbto2;
        this.zzcma = com_google_android_gms_internal_zzbto3;
        this.zzclQ = com_google_android_gms_internal_zzbtr;
    }

    private zza zza(zzbto com_google_android_gms_internal_zzbto) {
        zza com_google_android_gms_internal_zzbts_zza = new zza();
        if (com_google_android_gms_internal_zzbto.zzace() != null) {
            Map zzace = com_google_android_gms_internal_zzbto.zzace();
            List arrayList = new ArrayList();
            for (String str : zzace.keySet()) {
                List arrayList2 = new ArrayList();
                Map map = (Map) zzace.get(str);
                for (String str2 : map.keySet()) {
                    zzb com_google_android_gms_internal_zzbts_zzb = new zzb();
                    com_google_android_gms_internal_zzbts_zzb.zzaB = str2;
                    com_google_android_gms_internal_zzbts_zzb.zzcml = (byte[]) map.get(str2);
                    arrayList2.add(com_google_android_gms_internal_zzbts_zzb);
                }
                zzd com_google_android_gms_internal_zzbts_zzd = new zzd();
                com_google_android_gms_internal_zzbts_zzd.zzaGP = str;
                com_google_android_gms_internal_zzbts_zzd.zzcmq = (zzb[]) arrayList2.toArray(new zzb[arrayList2.size()]);
                arrayList.add(com_google_android_gms_internal_zzbts_zzd);
            }
            com_google_android_gms_internal_zzbts_zza.zzcmi = (zzd[]) arrayList.toArray(new zzd[arrayList.size()]);
        }
        if (com_google_android_gms_internal_zzbto.zzzD() != null) {
            List zzzD = com_google_android_gms_internal_zzbto.zzzD();
            com_google_android_gms_internal_zzbts_zza.zzcmj = (byte[][]) zzzD.toArray(new byte[zzzD.size()][]);
        }
        com_google_android_gms_internal_zzbts_zza.timestamp = com_google_android_gms_internal_zzbto.getTimestamp();
        return com_google_android_gms_internal_zzbts_zza;
    }

    public void run() {
        zzbxt com_google_android_gms_internal_zzbts_zze = new zze();
        if (this.zzclY != null) {
            com_google_android_gms_internal_zzbts_zze.zzcmr = zza(this.zzclY);
        }
        if (this.zzclZ != null) {
            com_google_android_gms_internal_zzbts_zze.zzcms = zza(this.zzclZ);
        }
        if (this.zzcma != null) {
            com_google_android_gms_internal_zzbts_zze.zzcmt = zza(this.zzcma);
        }
        if (this.zzclQ != null) {
            zzc com_google_android_gms_internal_zzbts_zzc = new zzc();
            com_google_android_gms_internal_zzbts_zzc.zzcmm = this.zzclQ.getLastFetchStatus();
            com_google_android_gms_internal_zzbts_zzc.zzcmn = this.zzclQ.isDeveloperModeEnabled();
            com_google_android_gms_internal_zzbts_zzc.zzcmo = this.zzclQ.zzacj();
            com_google_android_gms_internal_zzbts_zze.zzcmu = com_google_android_gms_internal_zzbts_zzc;
        }
        if (!(this.zzclQ == null || this.zzclQ.zzach() == null)) {
            List arrayList = new ArrayList();
            Map zzach = this.zzclQ.zzach();
            for (String str : zzach.keySet()) {
                if (zzach.get(str) != null) {
                    zzf com_google_android_gms_internal_zzbts_zzf = new zzf();
                    com_google_android_gms_internal_zzbts_zzf.zzaGP = str;
                    com_google_android_gms_internal_zzbts_zzf.zzcmx = ((zzbtl) zzach.get(str)).zzacd();
                    com_google_android_gms_internal_zzbts_zzf.resourceId = ((zzbtl) zzach.get(str)).zzacc();
                    arrayList.add(com_google_android_gms_internal_zzbts_zzf);
                }
            }
            com_google_android_gms_internal_zzbts_zze.zzcmv = (zzf[]) arrayList.toArray(new zzf[arrayList.size()]);
        }
        byte[] zzf = zzbxt.zzf(com_google_android_gms_internal_zzbts_zze);
        try {
            FileOutputStream openFileOutput = this.mContext.openFileOutput("persisted_config", 0);
            openFileOutput.write(zzf);
            openFileOutput.close();
        } catch (Throwable e) {
            Log.e("AsyncPersisterTask", "Could not persist config.", e);
        }
    }
}
