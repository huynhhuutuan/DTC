package com.google.android.gms.internal;

import java.util.Map.Entry;

public class zzbqs<T> {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbqs.class.desiredAssertionStatus());
    private zzbrq zzchH;
    private zzbqs<T> zzchI;
    private zzbqt<T> zzchJ;

    public interface zza<T> {
        boolean zze(zzbqs<T> com_google_android_gms_internal_zzbqs_T);
    }

    public interface zzb<T> {
        void zzd(zzbqs<T> com_google_android_gms_internal_zzbqs_T);
    }

    public zzbqs() {
        this(null, null, new zzbqt());
    }

    public zzbqs(zzbrq com_google_android_gms_internal_zzbrq, zzbqs<T> com_google_android_gms_internal_zzbqs_T, zzbqt<T> com_google_android_gms_internal_zzbqt_T) {
        this.zzchH = com_google_android_gms_internal_zzbrq;
        this.zzchI = com_google_android_gms_internal_zzbqs_T;
        this.zzchJ = com_google_android_gms_internal_zzbqt_T;
    }

    private void zzZO() {
        if (this.zzchI != null) {
            this.zzchI.zza(this.zzchH, this);
        }
    }

    private void zza(zzbrq com_google_android_gms_internal_zzbrq, zzbqs<T> com_google_android_gms_internal_zzbqs_T) {
        boolean isEmpty = com_google_android_gms_internal_zzbqs_T.isEmpty();
        boolean containsKey = this.zzchJ.zzcfI.containsKey(com_google_android_gms_internal_zzbrq);
        if (isEmpty && containsKey) {
            this.zzchJ.zzcfI.remove(com_google_android_gms_internal_zzbrq);
            zzZO();
        } else if (!isEmpty && !containsKey) {
            this.zzchJ.zzcfI.put(com_google_android_gms_internal_zzbrq, com_google_android_gms_internal_zzbqs_T.zzchJ);
            zzZO();
        }
    }

    public T getValue() {
        return this.zzchJ.value;
    }

    public boolean hasChildren() {
        return !this.zzchJ.zzcfI.isEmpty();
    }

    public boolean isEmpty() {
        return this.zzchJ.value == null && this.zzchJ.zzcfI.isEmpty();
    }

    public void setValue(T t) {
        this.zzchJ.value = t;
        zzZO();
    }

    public String toString() {
        return toString("");
    }

    String toString(String str) {
        String asString = this.zzchH == null ? "<anon>" : this.zzchH.asString();
        String valueOf = String.valueOf(this.zzchJ.toString(String.valueOf(str).concat("\t")));
        return new StringBuilder(((String.valueOf(str).length() + 1) + String.valueOf(asString).length()) + String.valueOf(valueOf).length()).append(str).append(asString).append("\n").append(valueOf).toString();
    }

    public zzbqs<T> zzL(zzbph com_google_android_gms_internal_zzbph) {
        zzbqs<T> com_google_android_gms_internal_zzbqs_T;
        zzbrq zzYR = com_google_android_gms_internal_zzbph.zzYR();
        while (zzYR != null) {
            zzbqs<T> com_google_android_gms_internal_zzbqs = new zzbqs(zzYR, com_google_android_gms_internal_zzbqs_T, com_google_android_gms_internal_zzbqs_T.zzchJ.zzcfI.containsKey(zzYR) ? (zzbqt) com_google_android_gms_internal_zzbqs_T.zzchJ.zzcfI.get(zzYR) : new zzbqt());
            com_google_android_gms_internal_zzbph = com_google_android_gms_internal_zzbph.zzYS();
            zzYR = com_google_android_gms_internal_zzbph.zzYR();
            com_google_android_gms_internal_zzbqs_T = com_google_android_gms_internal_zzbqs;
        }
        return com_google_android_gms_internal_zzbqs_T;
    }

    public zzbph zzWL() {
        if (this.zzchI != null) {
            if ($assertionsDisabled || this.zzchH != null) {
                return this.zzchI.zzWL().zza(this.zzchH);
            }
            throw new AssertionError();
        } else if (this.zzchH == null) {
            return zzbph.zzYO();
        } else {
            return new zzbph(this.zzchH);
        }
    }

    public void zza(zzb<T> com_google_android_gms_internal_zzbqs_zzb_T) {
        zza(com_google_android_gms_internal_zzbqs_zzb_T, false, false);
    }

    public void zza(final zzb<T> com_google_android_gms_internal_zzbqs_zzb_T, boolean z, final boolean z2) {
        if (z && !z2) {
            com_google_android_gms_internal_zzbqs_zzb_T.zzd(this);
        }
        zzb(new zzb<T>(this) {
            public void zzd(zzbqs<T> com_google_android_gms_internal_zzbqs_T) {
                com_google_android_gms_internal_zzbqs_T.zza(com_google_android_gms_internal_zzbqs_zzb_T, true, z2);
            }
        });
        if (z && z2) {
            com_google_android_gms_internal_zzbqs_zzb_T.zzd(this);
        }
    }

    public boolean zza(zza<T> com_google_android_gms_internal_zzbqs_zza_T) {
        return zza((zza) com_google_android_gms_internal_zzbqs_zza_T, false);
    }

    public boolean zza(zza<T> com_google_android_gms_internal_zzbqs_zza_T, boolean z) {
        if (!z) {
            this = this.zzchI;
        }
        while (this != null) {
            com_google_android_gms_internal_zzbqs_zza_T.zze(this);
            this = this.zzchI;
        }
        return false;
    }

    public void zzb(zzb<T> com_google_android_gms_internal_zzbqs_zzb_T) {
        Object[] toArray = this.zzchJ.zzcfI.entrySet().toArray();
        for (Object obj : toArray) {
            Entry entry = (Entry) obj;
            com_google_android_gms_internal_zzbqs_zzb_T.zzd(new zzbqs((zzbrq) entry.getKey(), this, (zzbqt) entry.getValue()));
        }
    }
}
