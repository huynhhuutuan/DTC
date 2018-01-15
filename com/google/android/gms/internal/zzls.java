package com.google.android.gms.internal;

import com.google.android.gms.internal.zzlq.zza;

@zzme
public class zzls extends zzpj {
    private final zza zzPQ;
    private final zzpb.zza zzPR;
    private final zzmn zzPS = this.zzPR.zzWm;

    public zzls(zzpb.zza com_google_android_gms_internal_zzpb_zza, zza com_google_android_gms_internal_zzlq_zza) {
        this.zzPR = com_google_android_gms_internal_zzpb_zza;
        this.zzPQ = com_google_android_gms_internal_zzlq_zza;
    }

    private zzpb zzS(int i) {
        return new zzpb(this.zzPR.zzTi.zzRy, null, null, i, null, null, this.zzPS.orientation, this.zzPS.zzKL, this.zzPR.zzTi.zzRB, false, null, null, null, null, null, this.zzPS.zzSo, this.zzPR.zzvr, this.zzPS.zzSm, this.zzPR.zzWg, this.zzPS.zzSr, this.zzPS.zzSs, this.zzPR.zzWa, null, null, null, null, this.zzPR.zzWm.zzSF, this.zzPR.zzWm.zzSG, null, null, null);
    }

    public void onStop() {
    }

    public void zzco() {
        final zzpb zzS = zzS(0);
        zzpo.zzXC.post(new Runnable(this) {
            final /* synthetic */ zzls zzQa;

            public void run() {
                this.zzQa.zzPQ.zzb(zzS);
            }
        });
    }
}
