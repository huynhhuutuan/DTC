package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbqq.zza;

public class zzbqn {
    private static final zzbqr<Boolean> zzchl = new C09901();
    private static final zzbqr<Boolean> zzchm = new C09912();
    private static final zzbqq<Boolean> zzchn = new zzbqq(Boolean.valueOf(true));
    private static final zzbqq<Boolean> zzcho = new zzbqq(Boolean.valueOf(false));
    private final zzbqq<Boolean> zzchk;

    class C09901 implements zzbqr<Boolean> {
        C09901() {
        }

        public /* synthetic */ boolean zzas(Object obj) {
            return zze((Boolean) obj);
        }

        public boolean zze(Boolean bool) {
            return !bool.booleanValue();
        }
    }

    class C09912 implements zzbqr<Boolean> {
        C09912() {
        }

        public /* synthetic */ boolean zzas(Object obj) {
            return zze((Boolean) obj);
        }

        public boolean zze(Boolean bool) {
            return bool.booleanValue();
        }
    }

    public zzbqn() {
        this.zzchk = zzbqq.zzZM();
    }

    private zzbqn(zzbqq<Boolean> com_google_android_gms_internal_zzbqq_java_lang_Boolean) {
        this.zzchk = com_google_android_gms_internal_zzbqq_java_lang_Boolean;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbqn)) {
            return false;
        }
        return this.zzchk.equals(((zzbqn) obj).zzchk);
    }

    public int hashCode() {
        return this.zzchk.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.zzchk.toString());
        return new StringBuilder(String.valueOf(valueOf).length() + 14).append("{PruneForest:").append(valueOf).append("}").toString();
    }

    public boolean zzZH() {
        return this.zzchk.zzb(zzchm);
    }

    public <T> T zza(T t, final zza<Void, T> com_google_android_gms_internal_zzbqq_zza_java_lang_Void__T) {
        return this.zzchk.zzb((Object) t, new zza<Boolean, T>(this) {
            public T zza(zzbph com_google_android_gms_internal_zzbph, Boolean bool, T t) {
                return !bool.booleanValue() ? com_google_android_gms_internal_zzbqq_zza_java_lang_Void__T.zza(com_google_android_gms_internal_zzbph, null, t) : t;
            }
        });
    }

    public zzbqn zzd(zzbrq com_google_android_gms_internal_zzbrq) {
        zzbqq zze = this.zzchk.zze(com_google_android_gms_internal_zzbrq);
        zzbqq com_google_android_gms_internal_zzbqq = zze == null ? new zzbqq((Boolean) this.zzchk.getValue()) : (zze.getValue() != null || this.zzchk.getValue() == null) ? zze : zze.zzb(zzbph.zzYO(), (Boolean) this.zzchk.getValue());
        return new zzbqn(com_google_android_gms_internal_zzbqq);
    }

    public boolean zzw(zzbph com_google_android_gms_internal_zzbph) {
        Boolean bool = (Boolean) this.zzchk.zzH(com_google_android_gms_internal_zzbph);
        return bool != null && bool.booleanValue();
    }

    public boolean zzx(zzbph com_google_android_gms_internal_zzbph) {
        Boolean bool = (Boolean) this.zzchk.zzH(com_google_android_gms_internal_zzbph);
        return (bool == null || bool.booleanValue()) ? false : true;
    }

    public zzbqn zzy(zzbph com_google_android_gms_internal_zzbph) {
        if (this.zzchk.zzb(com_google_android_gms_internal_zzbph, zzchl) == null) {
            return this.zzchk.zzb(com_google_android_gms_internal_zzbph, zzchm) != null ? this : new zzbqn(this.zzchk.zza(com_google_android_gms_internal_zzbph, zzchn));
        } else {
            throw new IllegalArgumentException("Can't prune path that was kept previously!");
        }
    }

    public zzbqn zzz(zzbph com_google_android_gms_internal_zzbph) {
        return this.zzchk.zzb(com_google_android_gms_internal_zzbph, zzchl) != null ? this : new zzbqn(this.zzchk.zza(com_google_android_gms_internal_zzbph, zzcho));
    }
}
