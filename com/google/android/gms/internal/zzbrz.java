package com.google.android.gms.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class zzbrz<T extends zzbrz> implements zzbsc {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbrz.class.desiredAssertionStatus());
    protected final zzbsc zzcjb;
    private String zzcjc;

    protected enum zza {
        DeferredValue,
        Boolean,
        Number,
        String
    }

    zzbrz(zzbsc com_google_android_gms_internal_zzbsc) {
        this.zzcjb = com_google_android_gms_internal_zzbsc;
    }

    private static int zza(zzbsa com_google_android_gms_internal_zzbsa, zzbru com_google_android_gms_internal_zzbru) {
        return Double.valueOf((double) ((Long) com_google_android_gms_internal_zzbsa.getValue()).longValue()).compareTo((Double) com_google_android_gms_internal_zzbru.getValue());
    }

    public /* synthetic */ int compareTo(Object obj) {
        return zzh((zzbsc) obj);
    }

    public int getChildCount() {
        return 0;
    }

    public Object getValue(boolean z) {
        if (!z || this.zzcjb.isEmpty()) {
            return getValue();
        }
        Map hashMap = new HashMap();
        hashMap.put(".value", getValue());
        hashMap.put(".priority", this.zzcjb.getValue());
        return hashMap;
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator<zzbsb> iterator() {
        return Collections.emptyList().iterator();
    }

    public String toString() {
        String obj = getValue(true).toString();
        return obj.length() <= 100 ? obj : String.valueOf(obj.substring(0, 100)).concat("...");
    }

    public zzbsc zzO(zzbph com_google_android_gms_internal_zzbph) {
        return com_google_android_gms_internal_zzbph.isEmpty() ? this : com_google_android_gms_internal_zzbph.zzYR().zzaaJ() ? this.zzcjb : zzbrv.zzaaY();
    }

    public Iterator<zzbsb> zzWU() {
        return Collections.emptyList().iterator();
    }

    protected abstract int zza(T t);

    protected abstract zza zzaaE();

    public String zzaaL() {
        if (this.zzcjc == null) {
            this.zzcjc = zzbte.zzjh(zza(com.google.android.gms.internal.zzbsc.zza.V1));
        }
        return this.zzcjc;
    }

    public boolean zzaaM() {
        return true;
    }

    public zzbsc zzaaN() {
        return this.zzcjb;
    }

    protected String zzb(com.google.android.gms.internal.zzbsc.zza com_google_android_gms_internal_zzbsc_zza) {
        switch (com_google_android_gms_internal_zzbsc_zza) {
            case V1:
            case V2:
                if (this.zzcjb.isEmpty()) {
                    return "";
                }
                String valueOf = String.valueOf(this.zzcjb.zza(com_google_android_gms_internal_zzbsc_zza));
                return new StringBuilder(String.valueOf(valueOf).length() + 10).append("priority:").append(valueOf).append(":").toString();
            default:
                String valueOf2 = String.valueOf(com_google_android_gms_internal_zzbsc_zza);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf2).length() + 22).append("Unknown hash version: ").append(valueOf2).toString());
        }
    }

    protected int zzc(zzbrz<?> com_google_android_gms_internal_zzbrz_) {
        zza zzaaE = zzaaE();
        Enum zzaaE2 = com_google_android_gms_internal_zzbrz_.zzaaE();
        return zzaaE.equals(zzaaE2) ? zza(com_google_android_gms_internal_zzbrz_) : zzaaE.compareTo(zzaaE2);
    }

    public zzbsc zze(zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc) {
        return com_google_android_gms_internal_zzbrq.zzaaJ() ? zzg(com_google_android_gms_internal_zzbsc) : !com_google_android_gms_internal_zzbsc.isEmpty() ? zzbrv.zzaaY().zze(com_google_android_gms_internal_zzbrq, com_google_android_gms_internal_zzbsc).zzg(this.zzcjb) : this;
    }

    public int zzh(zzbsc com_google_android_gms_internal_zzbsc) {
        if (com_google_android_gms_internal_zzbsc.isEmpty()) {
            return 1;
        }
        if (com_google_android_gms_internal_zzbsc instanceof zzbrr) {
            return -1;
        }
        if ($assertionsDisabled || com_google_android_gms_internal_zzbsc.zzaaM()) {
            return ((this instanceof zzbsa) && (com_google_android_gms_internal_zzbsc instanceof zzbru)) ? zza((zzbsa) this, (zzbru) com_google_android_gms_internal_zzbsc) : ((this instanceof zzbru) && (com_google_android_gms_internal_zzbsc instanceof zzbsa)) ? zza((zzbsa) com_google_android_gms_internal_zzbsc, (zzbru) this) * -1 : zzc((zzbrz) com_google_android_gms_internal_zzbsc);
        } else {
            throw new AssertionError("Node is not leaf node!");
        }
    }

    public boolean zzk(zzbrq com_google_android_gms_internal_zzbrq) {
        return false;
    }

    public zzbrq zzl(zzbrq com_google_android_gms_internal_zzbrq) {
        return null;
    }

    public zzbsc zzl(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc) {
        zzbrq zzYR = com_google_android_gms_internal_zzbph.zzYR();
        if (zzYR == null) {
            return com_google_android_gms_internal_zzbsc;
        }
        if (com_google_android_gms_internal_zzbsc.isEmpty() && !zzYR.zzaaJ()) {
            return this;
        }
        if ($assertionsDisabled || !com_google_android_gms_internal_zzbph.zzYR().zzaaJ() || com_google_android_gms_internal_zzbph.size() == 1) {
            return zze(zzYR, zzbrv.zzaaY().zzl(com_google_android_gms_internal_zzbph.zzYS(), com_google_android_gms_internal_zzbsc));
        }
        throw new AssertionError();
    }

    public zzbsc zzm(zzbrq com_google_android_gms_internal_zzbrq) {
        return com_google_android_gms_internal_zzbrq.zzaaJ() ? this.zzcjb : zzbrv.zzaaY();
    }
}
