package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbqy.zza;
import com.google.firebase.database.DatabaseError;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class zzbpc {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbpc.class.desiredAssertionStatus());
    private AtomicBoolean zzcef = new AtomicBoolean(false);
    private zzbpd zzceg;
    private boolean zzceh = false;

    public void zzYJ() {
        if (this.zzcef.compareAndSet(false, true) && this.zzceg != null) {
            this.zzceg.zzd(this);
            this.zzceg = null;
        }
    }

    public boolean zzYK() {
        return this.zzcef.get();
    }

    public boolean zzYL() {
        return this.zzceh;
    }

    public abstract zzbrc zzYm();

    public abstract zzbpc zza(zzbrc com_google_android_gms_internal_zzbrc);

    public abstract zzbqx zza(zzbqw com_google_android_gms_internal_zzbqw, zzbrc com_google_android_gms_internal_zzbrc);

    public void zza(zzbpd com_google_android_gms_internal_zzbpd) {
        if (!$assertionsDisabled && zzYK()) {
            throw new AssertionError();
        } else if ($assertionsDisabled || this.zzceg == null) {
            this.zzceg = com_google_android_gms_internal_zzbpd;
        } else {
            throw new AssertionError();
        }
    }

    public abstract void zza(zzbqx com_google_android_gms_internal_zzbqx);

    public abstract void zza(DatabaseError databaseError);

    public abstract boolean zza(zza com_google_android_gms_internal_zzbqy_zza);

    public void zzbf(boolean z) {
        this.zzceh = z;
    }

    public abstract boolean zzc(zzbpc com_google_android_gms_internal_zzbpc);
}
