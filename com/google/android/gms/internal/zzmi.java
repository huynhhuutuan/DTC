package com.google.android.gms.internal;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzf.zzc;

@zzme
public abstract class zzmi implements com.google.android.gms.internal.zzmh.zza, zzpq<Void> {
    private final zzqp<zzmk> zzRq;
    private final com.google.android.gms.internal.zzmh.zza zzRr;
    private final Object zzrJ = new Object();

    class C11082 implements com.google.android.gms.internal.zzqp.zza {
        final /* synthetic */ zzmi zzRt;

        C11082(zzmi com_google_android_gms_internal_zzmi) {
            this.zzRt = com_google_android_gms_internal_zzmi;
        }

        public void run() {
            this.zzRt.zzjn();
        }
    }

    @zzme
    public static final class zza extends zzmi {
        private final Context mContext;

        public zza(Context context, zzqp<zzmk> com_google_android_gms_internal_zzqp_com_google_android_gms_internal_zzmk, com.google.android.gms.internal.zzmh.zza com_google_android_gms_internal_zzmh_zza) {
            super(com_google_android_gms_internal_zzqp_com_google_android_gms_internal_zzmk, com_google_android_gms_internal_zzmh_zza);
            this.mContext = context;
        }

        public void zzjn() {
        }

        public zzmt zzjo() {
            return zznc.zza(this.mContext, new zzfw((String) zzgd.zzBh.get()), zznb.zzju());
        }
    }

    @zzme
    public static class zzb extends zzmi implements com.google.android.gms.common.internal.zzf.zzb, zzc {
        private Context mContext;
        private zzqp<zzmk> zzRq;
        private final com.google.android.gms.internal.zzmh.zza zzRr;
        protected zzmj zzRu;
        private boolean zzRv;
        private final Object zzrJ = new Object();
        private zzqh zztt;

        public zzb(Context context, zzqh com_google_android_gms_internal_zzqh, zzqp<zzmk> com_google_android_gms_internal_zzqp_com_google_android_gms_internal_zzmk, com.google.android.gms.internal.zzmh.zza com_google_android_gms_internal_zzmh_zza) {
            Looper zzlb;
            super(com_google_android_gms_internal_zzqp_com_google_android_gms_internal_zzmk, com_google_android_gms_internal_zzmh_zza);
            this.mContext = context;
            this.zztt = com_google_android_gms_internal_zzqh;
            this.zzRq = com_google_android_gms_internal_zzqp_com_google_android_gms_internal_zzmk;
            this.zzRr = com_google_android_gms_internal_zzmh_zza;
            if (((Boolean) zzgd.zzBT.get()).booleanValue()) {
                this.zzRv = true;
                zzlb = zzw.zzdc().zzlb();
            } else {
                zzlb = context.getMainLooper();
            }
            this.zzRu = new zzmj(context, zzlb, this, this, this.zztt.zzYX);
            connect();
        }

        protected void connect() {
            this.zzRu.zzxz();
        }

        public void onConnected(Bundle bundle) {
            zziP();
        }

        public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
            zzqf.zzbf("Cannot connect to remote service, fallback to local instance.");
            zzjp().zziP();
            Bundle bundle = new Bundle();
            bundle.putString("action", "gms_connection_failed_fallback_to_local");
            zzw.zzcM().zzb(this.mContext, this.zztt.zzba, "gmob-apps", bundle, true);
        }

        public void onConnectionSuspended(int i) {
            zzqf.zzbf("Disconnected from remote ad request service.");
        }

        public void zzjn() {
            synchronized (this.zzrJ) {
                if (this.zzRu.isConnected() || this.zzRu.isConnecting()) {
                    this.zzRu.disconnect();
                }
                Binder.flushPendingCommands();
                if (this.zzRv) {
                    zzw.zzdc().zzlc();
                    this.zzRv = false;
                }
            }
        }

        public zzmt zzjo() {
            zzmt zzjq;
            synchronized (this.zzrJ) {
                try {
                    zzjq = this.zzRu.zzjq();
                } catch (IllegalStateException e) {
                    zzjq = null;
                    return zzjq;
                } catch (DeadObjectException e2) {
                    zzjq = null;
                    return zzjq;
                }
            }
            return zzjq;
        }

        zzpq zzjp() {
            return new zza(this.mContext, this.zzRq, this.zzRr);
        }
    }

    public zzmi(zzqp<zzmk> com_google_android_gms_internal_zzqp_com_google_android_gms_internal_zzmk, com.google.android.gms.internal.zzmh.zza com_google_android_gms_internal_zzmh_zza) {
        this.zzRq = com_google_android_gms_internal_zzqp_com_google_android_gms_internal_zzmk;
        this.zzRr = com_google_android_gms_internal_zzmh_zza;
    }

    public void cancel() {
        zzjn();
    }

    public void zza(zzmn com_google_android_gms_internal_zzmn) {
        synchronized (this.zzrJ) {
            this.zzRr.zza(com_google_android_gms_internal_zzmn);
            zzjn();
        }
    }

    boolean zza(zzmt com_google_android_gms_internal_zzmt, zzmk com_google_android_gms_internal_zzmk) {
        try {
            com_google_android_gms_internal_zzmt.zza(com_google_android_gms_internal_zzmk, new zzmm(this));
            return true;
        } catch (Throwable th) {
            zzqf.zzc("Could not fetch ad response from ad request service due to an Exception.", th);
            zzw.zzcQ().zza(th, "AdRequestClientTask.getAdResponseFromService");
            this.zzRr.zza(new zzmn(0));
            return false;
        }
    }

    public Void zziN() {
        final zzmt zzjo = zzjo();
        if (zzjo == null) {
            this.zzRr.zza(new zzmn(0));
            zzjn();
        } else {
            this.zzRq.zza(new zzqp.zzc<zzmk>(this) {
                final /* synthetic */ zzmi zzRt;

                public void zzc(zzmk com_google_android_gms_internal_zzmk) {
                    if (!this.zzRt.zza(zzjo, com_google_android_gms_internal_zzmk)) {
                        this.zzRt.zzjn();
                    }
                }

                public /* synthetic */ void zzd(Object obj) {
                    zzc((zzmk) obj);
                }
            }, new C11082(this));
        }
        return null;
    }

    public /* synthetic */ Object zziP() {
        return zziN();
    }

    public abstract void zzjn();

    public abstract zzmt zzjo();
}
