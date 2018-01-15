package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.internal.zzpb.zza;
import io.fabric.sdk.android.services.events.EventsFilesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONObject;

@zzme
public class zzok extends zzpj implements zzoj {
    private final Context mContext;
    private final zza zzPR;
    private final ArrayList<Future> zzVG;
    private final ArrayList<String> zzVH;
    private final HashMap<String, zzoe> zzVI;
    private final List<zzof> zzVJ;
    private final HashSet<String> zzVK;
    private final zzns zzVL;
    private final long zzVv;
    private final Object zzrJ;

    public zzok(Context context, zza com_google_android_gms_internal_zzpb_zza, zzns com_google_android_gms_internal_zzns) {
        this(context, com_google_android_gms_internal_zzpb_zza, com_google_android_gms_internal_zzns, ((Long) zzgd.zzCO.get()).longValue());
    }

    zzok(Context context, zza com_google_android_gms_internal_zzpb_zza, zzns com_google_android_gms_internal_zzns, long j) {
        this.zzVG = new ArrayList();
        this.zzVH = new ArrayList();
        this.zzVI = new HashMap();
        this.zzVJ = new ArrayList();
        this.zzVK = new HashSet();
        this.zzrJ = new Object();
        this.mContext = context;
        this.zzPR = com_google_android_gms_internal_zzpb_zza;
        this.zzVL = com_google_android_gms_internal_zzns;
        this.zzVv = j;
    }

    private static int zzT(int i) {
        switch (i) {
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 4;
            case 6:
                return 0;
            case 7:
                return 3;
            default:
                return 6;
        }
    }

    private zzpb zza(int i, @Nullable String str, @Nullable zzjq com_google_android_gms_internal_zzjq) {
        return new zzpb(this.zzPR.zzTi.zzRy, null, this.zzPR.zzWm.zzKF, i, this.zzPR.zzWm.zzKG, this.zzPR.zzWm.zzSp, this.zzPR.zzWm.orientation, this.zzPR.zzWm.zzKL, this.zzPR.zzTi.zzRB, this.zzPR.zzWm.zzSn, com_google_android_gms_internal_zzjq, null, str, this.zzPR.zzWc, null, this.zzPR.zzWm.zzSo, this.zzPR.zzvr, this.zzPR.zzWm.zzSm, this.zzPR.zzWg, this.zzPR.zzWm.zzSr, this.zzPR.zzWm.zzSs, this.zzPR.zzWa, null, this.zzPR.zzWm.zzSC, this.zzPR.zzWm.zzSD, this.zzPR.zzWm.zzSE, this.zzPR.zzWm.zzSF, this.zzPR.zzWm.zzSG, zzjM(), this.zzPR.zzWm.zzKI, this.zzPR.zzWm.zzSJ);
    }

    private zzpb zza(String str, zzjq com_google_android_gms_internal_zzjq) {
        return zza(-2, str, com_google_android_gms_internal_zzjq);
    }

    private static String zza(zzof com_google_android_gms_internal_zzof) {
        String str = com_google_android_gms_internal_zzof.zzKq;
        int zzT = zzT(com_google_android_gms_internal_zzof.errorCode);
        return new StringBuilder(String.valueOf(str).length() + 33).append(str).append(".").append(zzT).append(".").append(com_google_android_gms_internal_zzof.zzLn).toString();
    }

    private void zza(String str, String str2, zzjq com_google_android_gms_internal_zzjq) {
        synchronized (this.zzrJ) {
            zzol zzaN = this.zzVL.zzaN(str);
            if (zzaN == null || zzaN.zzjO() == null || zzaN.zzjN() == null) {
                this.zzVJ.add(new zzof.zza().zzaQ(com_google_android_gms_internal_zzjq.zzKq).zzaP(str).zzl(0).zzae(7).zzjK());
                return;
            }
            zzpj zza = zza(str, str2, com_google_android_gms_internal_zzjq, zzaN);
            this.zzVG.add((Future) zza.zziP());
            this.zzVH.add(str);
            this.zzVI.put(str, zza);
        }
    }

    private zzpb zzjL() {
        return zza(3, null, null);
    }

    private String zzjM() {
        StringBuilder stringBuilder = new StringBuilder("");
        if (this.zzVJ == null) {
            return stringBuilder.toString();
        }
        for (zzof com_google_android_gms_internal_zzof : this.zzVJ) {
            if (!(com_google_android_gms_internal_zzof == null || TextUtils.isEmpty(com_google_android_gms_internal_zzof.zzKq))) {
                stringBuilder.append(String.valueOf(zza(com_google_android_gms_internal_zzof)).concat(EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR));
            }
        }
        return stringBuilder.substring(0, Math.max(0, stringBuilder.length() - 1));
    }

    public void onStop() {
    }

    protected zzoe zza(String str, String str2, zzjq com_google_android_gms_internal_zzjq, zzol com_google_android_gms_internal_zzol) {
        return new zzoe(this.mContext, str, str2, com_google_android_gms_internal_zzjq, this.zzPR, com_google_android_gms_internal_zzol, this, this.zzVv);
    }

    public void zza(String str, int i) {
    }

    public void zzaO(String str) {
        synchronized (this.zzrJ) {
            this.zzVK.add(str);
        }
    }

    public void zzco() {
        zzoe com_google_android_gms_internal_zzoe;
        final zzpb zza;
        for (zzjq com_google_android_gms_internal_zzjq : this.zzPR.zzWc.zzKD) {
            String str = com_google_android_gms_internal_zzjq.zzKv;
            for (String str2 : com_google_android_gms_internal_zzjq.zzKp) {
                String str22;
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str22) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str22)) {
                    try {
                        str22 = new JSONObject(str).getString("class_name");
                    } catch (Throwable e) {
                        zzqf.zzb("Unable to determine custom event class name, skipping...", e);
                    }
                }
                zza(str22, str, com_google_android_gms_internal_zzjq);
            }
        }
        int i = 0;
        while (i < this.zzVG.size()) {
            String str3;
            try {
                ((Future) this.zzVG.get(i)).get();
                synchronized (this.zzrJ) {
                    str3 = (String) this.zzVH.get(i);
                    if (!TextUtils.isEmpty(str3)) {
                        com_google_android_gms_internal_zzoe = (zzoe) this.zzVI.get(str3);
                        if (com_google_android_gms_internal_zzoe != null) {
                            this.zzVJ.add(com_google_android_gms_internal_zzoe.zzjH());
                        }
                    }
                }
                synchronized (this.zzrJ) {
                    if (this.zzVK.contains(this.zzVH.get(i))) {
                        str3 = (String) this.zzVH.get(i);
                        zza = zza(str3, this.zzVI.get(str3) != null ? ((zzoe) this.zzVI.get(str3)).zzjI() : null);
                        zzqe.zzYP.post(new Runnable(this) {
                            final /* synthetic */ zzok zzVM;

                            public void run() {
                                this.zzVM.zzVL.zzb(zza);
                            }
                        });
                        return;
                    }
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                synchronized (this.zzrJ) {
                    str3 = (String) this.zzVH.get(i);
                    if (!TextUtils.isEmpty(str3)) {
                        com_google_android_gms_internal_zzoe = (zzoe) this.zzVI.get(str3);
                        if (com_google_android_gms_internal_zzoe != null) {
                            this.zzVJ.add(com_google_android_gms_internal_zzoe.zzjH());
                        }
                    }
                }
            } catch (Throwable e3) {
                zzqf.zzc("Unable to resolve rewarded adapter.", e3);
                synchronized (this.zzrJ) {
                    str3 = (String) this.zzVH.get(i);
                    if (!TextUtils.isEmpty(str3)) {
                        com_google_android_gms_internal_zzoe = (zzoe) this.zzVI.get(str3);
                        if (com_google_android_gms_internal_zzoe != null) {
                            this.zzVJ.add(com_google_android_gms_internal_zzoe.zzjH());
                        }
                    }
                }
            } catch (Throwable e32) {
                Throwable th = e32;
                synchronized (this.zzrJ) {
                    str3 = (String) this.zzVH.get(i);
                    if (!TextUtils.isEmpty(str3)) {
                        com_google_android_gms_internal_zzoe = (zzoe) this.zzVI.get(str3);
                        if (com_google_android_gms_internal_zzoe != null) {
                            this.zzVJ.add(com_google_android_gms_internal_zzoe.zzjH());
                        }
                    }
                }
            }
        }
        zza = zzjL();
        zzqe.zzYP.post(new Runnable(this) {
            final /* synthetic */ zzok zzVM;

            public void run() {
                this.zzVM.zzVL.zzb(zza);
            }
        });
        return;
        i++;
    }
}
