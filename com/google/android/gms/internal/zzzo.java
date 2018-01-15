package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zzc;

public class zzzo extends zzc<NoOptions> implements zzzl {

    static class zza extends com.google.android.gms.internal.zzzr.zza {
        zza() {
        }

        public void zza(Status status, long j) {
            throw new UnsupportedOperationException();
        }

        public void zzb(Status status, long j) {
            throw new UnsupportedOperationException();
        }

        public void zzv(Status status) {
            throw new UnsupportedOperationException();
        }

        public void zzw(Status status) {
            throw new UnsupportedOperationException();
        }

        public void zzx(Status status) {
            throw new UnsupportedOperationException();
        }
    }

    static final class zzb extends com.google.android.gms.internal.zzaad.zza<Status, zzzp> {
        private final zzzm zzaxS;

        class C12561 extends zza {
            final /* synthetic */ zzb zzaxT;

            C12561(zzb com_google_android_gms_internal_zzzo_zzb) {
                this.zzaxT = com_google_android_gms_internal_zzzo_zzb;
            }

            public void zzv(Status status) {
                this.zzaxT.zzb(status);
            }
        }

        zzb(zzzm com_google_android_gms_internal_zzzm, GoogleApiClient googleApiClient) {
            super(zzzk.API, googleApiClient);
            this.zzaxS = com_google_android_gms_internal_zzzm;
        }

        public /* synthetic */ void setResult(Object obj) {
            super.zzb((Status) obj);
        }

        protected void zza(zzzp com_google_android_gms_internal_zzzp) throws RemoteException {
            zzzr c12561 = new C12561(this);
            try {
                zzzo.zzb(this.zzaxS);
                com_google_android_gms_internal_zzzp.zza(c12561, this.zzaxS);
            } catch (Throwable e) {
                Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e);
                zzB(new Status(10, "MessageProducer"));
            }
        }

        protected Status zzb(Status status) {
            return status;
        }

        protected /* synthetic */ Result zzc(Status status) {
            return zzb(status);
        }
    }

    zzzo(@NonNull Context context) {
        super(context, zzzk.API, null, new zzzy());
    }

    public static zzzl zzaA(@NonNull Context context) {
        return new zzzo(context);
    }

    static void zzb(zzzm com_google_android_gms_internal_zzzm) {
        if (com_google_android_gms_internal_zzzm.zzaxQ != null && com_google_android_gms_internal_zzzm.zzaxP.zzcvq.length == 0) {
            com_google_android_gms_internal_zzzm.zzaxP.zzcvq = com_google_android_gms_internal_zzzm.zzaxQ.zzuV();
        }
        if (com_google_android_gms_internal_zzzm.zzaxR != null && com_google_android_gms_internal_zzzm.zzaxP.zzcvx.length == 0) {
            com_google_android_gms_internal_zzzm.zzaxP.zzcvx = com_google_android_gms_internal_zzzm.zzaxR.zzuV();
        }
        com_google_android_gms_internal_zzzm.zzaxJ = zzbxt.zzf(com_google_android_gms_internal_zzzm.zzaxP);
    }

    public PendingResult<Status> zza(zzzm com_google_android_gms_internal_zzzm) {
        return doBestEffortWrite(new zzb(com_google_android_gms_internal_zzzm, asGoogleApiClient()));
    }
}
