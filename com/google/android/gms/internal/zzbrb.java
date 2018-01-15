package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

public class zzbrb {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbrb.class.desiredAssertionStatus());
    public static final zzbrb zzcii = new zzbrb();
    private zzbrw zzcie = zzbsf.zzabj();
    private Integer zzcij;
    private zza zzcik;
    private zzbsc zzcil = null;
    private zzbrq zzcim = null;
    private zzbsc zzcin = null;
    private zzbrq zzcio = null;
    private String zzcip = null;

    private enum zza {
        LEFT,
        RIGHT
    }

    public static zzbrb zzaE(Map<String, Object> map) {
        String str;
        zzbrb com_google_android_gms_internal_zzbrb = new zzbrb();
        com_google_android_gms_internal_zzbrb.zzcij = (Integer) map.get("l");
        if (map.containsKey("sp")) {
            com_google_android_gms_internal_zzbrb.zzcil = zze(zzbsd.zzat(map.get("sp")));
            str = (String) map.get("sn");
            if (str != null) {
                com_google_android_gms_internal_zzbrb.zzcim = zzbrq.zzja(str);
            }
        }
        if (map.containsKey("ep")) {
            com_google_android_gms_internal_zzbrb.zzcin = zze(zzbsd.zzat(map.get("ep")));
            str = (String) map.get("en");
            if (str != null) {
                com_google_android_gms_internal_zzbrb.zzcio = zzbrq.zzja(str);
            }
        }
        str = (String) map.get("vf");
        if (str != null) {
            com_google_android_gms_internal_zzbrb.zzcik = str.equals("l") ? zza.LEFT : zza.RIGHT;
        }
        str = (String) map.get("i");
        if (str != null) {
            com_google_android_gms_internal_zzbrb.zzcie = zzbrw.zzjb(str);
        }
        return com_google_android_gms_internal_zzbrb;
    }

    private zzbrb zzaaj() {
        zzbrb com_google_android_gms_internal_zzbrb = new zzbrb();
        com_google_android_gms_internal_zzbrb.zzcij = this.zzcij;
        com_google_android_gms_internal_zzbrb.zzcil = this.zzcil;
        com_google_android_gms_internal_zzbrb.zzcim = this.zzcim;
        com_google_android_gms_internal_zzbrb.zzcin = this.zzcin;
        com_google_android_gms_internal_zzbrb.zzcio = this.zzcio;
        com_google_android_gms_internal_zzbrb.zzcik = this.zzcik;
        com_google_android_gms_internal_zzbrb.zzcie = this.zzcie;
        return com_google_android_gms_internal_zzbrb;
    }

    private static zzbsc zze(zzbsc com_google_android_gms_internal_zzbsc) {
        if ((com_google_android_gms_internal_zzbsc instanceof zzbsi) || (com_google_android_gms_internal_zzbsc instanceof zzbrp) || (com_google_android_gms_internal_zzbsc instanceof zzbru) || (com_google_android_gms_internal_zzbsc instanceof zzbrv)) {
            return com_google_android_gms_internal_zzbsc;
        }
        if (com_google_android_gms_internal_zzbsc instanceof zzbsa) {
            return new zzbru(Double.valueOf(((Long) com_google_android_gms_internal_zzbsc.getValue()).doubleValue()), zzbsg.zzabk());
        }
        String valueOf = String.valueOf(com_google_android_gms_internal_zzbsc.getValue());
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 43).append("Unexpected value passed to normalizeValue: ").append(valueOf).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzbrb com_google_android_gms_internal_zzbrb = (zzbrb) obj;
        return (this.zzcij == null ? com_google_android_gms_internal_zzbrb.zzcij != null : !this.zzcij.equals(com_google_android_gms_internal_zzbrb.zzcij)) ? false : (this.zzcie == null ? com_google_android_gms_internal_zzbrb.zzcie != null : !this.zzcie.equals(com_google_android_gms_internal_zzbrb.zzcie)) ? false : (this.zzcio == null ? com_google_android_gms_internal_zzbrb.zzcio != null : !this.zzcio.equals(com_google_android_gms_internal_zzbrb.zzcio)) ? false : (this.zzcin == null ? com_google_android_gms_internal_zzbrb.zzcin != null : !this.zzcin.equals(com_google_android_gms_internal_zzbrb.zzcin)) ? false : (this.zzcim == null ? com_google_android_gms_internal_zzbrb.zzcim != null : !this.zzcim.equals(com_google_android_gms_internal_zzbrb.zzcim)) ? false : (this.zzcil == null ? com_google_android_gms_internal_zzbrb.zzcil != null : !this.zzcil.equals(com_google_android_gms_internal_zzbrb.zzcil)) ? false : zzaak() == com_google_android_gms_internal_zzbrb.zzaak();
    }

    public int getLimit() {
        if (zzaag()) {
            return this.zzcij.intValue();
        }
        throw new IllegalArgumentException("Cannot get limit if limit has not been set");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.zzcio != null ? this.zzcio.hashCode() : 0) + (((this.zzcin != null ? this.zzcin.hashCode() : 0) + (((this.zzcim != null ? this.zzcim.hashCode() : 0) + (((this.zzcil != null ? this.zzcil.hashCode() : 0) + (((zzaak() ? 1231 : 1237) + ((this.zzcij != null ? this.zzcij.intValue() : 0) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        if (this.zzcie != null) {
            i = this.zzcie.hashCode();
        }
        return hashCode + i;
    }

    public boolean isDefault() {
        return zzaam() && this.zzcie.equals(zzbsf.zzabj());
    }

    public boolean isValid() {
        return (zzaaa() && zzaad() && zzaag() && !zzaah()) ? false : true;
    }

    public String toString() {
        return zzaal().toString();
    }

    public zzbrb zza(zzbrw com_google_android_gms_internal_zzbrw) {
        zzbrb zzaaj = zzaaj();
        zzaaj.zzcie = com_google_android_gms_internal_zzbrw;
        return zzaaj;
    }

    public zzbrb zza(zzbsc com_google_android_gms_internal_zzbsc, zzbrq com_google_android_gms_internal_zzbrq) {
        if ($assertionsDisabled || com_google_android_gms_internal_zzbsc.zzaaM() || com_google_android_gms_internal_zzbsc.isEmpty()) {
            zzbte.zzbb(!(com_google_android_gms_internal_zzbsc instanceof zzbsa));
            zzbrb zzaaj = zzaaj();
            zzaaj.zzcil = com_google_android_gms_internal_zzbsc;
            zzaaj.zzcim = com_google_android_gms_internal_zzbrq;
            return zzaaj;
        }
        throw new AssertionError();
    }

    public boolean zzaaa() {
        return this.zzcil != null;
    }

    public zzbsc zzaab() {
        if (zzaaa()) {
            return this.zzcil;
        }
        throw new IllegalArgumentException("Cannot get index start value if start has not been set");
    }

    public zzbrq zzaac() {
        if (zzaaa()) {
            return this.zzcim != null ? this.zzcim : zzbrq.zzaaF();
        } else {
            throw new IllegalArgumentException("Cannot get index start name if start has not been set");
        }
    }

    public boolean zzaad() {
        return this.zzcin != null;
    }

    public zzbsc zzaae() {
        if (zzaad()) {
            return this.zzcin;
        }
        throw new IllegalArgumentException("Cannot get index end value if start has not been set");
    }

    public zzbrq zzaaf() {
        if (zzaad()) {
            return this.zzcio != null ? this.zzcio : zzbrq.zzaaG();
        } else {
            throw new IllegalArgumentException("Cannot get index end name if start has not been set");
        }
    }

    public boolean zzaag() {
        return this.zzcij != null;
    }

    public boolean zzaah() {
        return zzaag() && this.zzcik != null;
    }

    public zzbrw zzaai() {
        return this.zzcie;
    }

    public boolean zzaak() {
        return this.zzcik != null ? this.zzcik == zza.LEFT : zzaaa();
    }

    public Map<String, Object> zzaal() {
        Map<String, Object> hashMap = new HashMap();
        if (zzaaa()) {
            hashMap.put("sp", this.zzcil.getValue());
            if (this.zzcim != null) {
                hashMap.put("sn", this.zzcim.asString());
            }
        }
        if (zzaad()) {
            hashMap.put("ep", this.zzcin.getValue());
            if (this.zzcio != null) {
                hashMap.put("en", this.zzcio.asString());
            }
        }
        if (this.zzcij != null) {
            hashMap.put("l", this.zzcij);
            zza com_google_android_gms_internal_zzbrb_zza = this.zzcik;
            if (com_google_android_gms_internal_zzbrb_zza == null) {
                com_google_android_gms_internal_zzbrb_zza = zzaaa() ? zza.LEFT : zza.RIGHT;
            }
            switch (com_google_android_gms_internal_zzbrb_zza) {
                case LEFT:
                    hashMap.put("vf", "l");
                    break;
                case RIGHT:
                    hashMap.put("vf", "r");
                    break;
            }
        }
        if (!this.zzcie.equals(zzbsf.zzabj())) {
            hashMap.put("i", this.zzcie.zzabb());
        }
        return hashMap;
    }

    public boolean zzaam() {
        return (zzaaa() || zzaad() || zzaag()) ? false : true;
    }

    public String zzaan() {
        if (this.zzcip == null) {
            try {
                this.zzcip = zzbsv.zzaF(zzaal());
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        return this.zzcip;
    }

    public zzbrj zzaao() {
        return zzaam() ? new zzbrh(zzaai()) : zzaag() ? new zzbri(this) : new zzbrk(this);
    }

    public zzbrb zzb(zzbsc com_google_android_gms_internal_zzbsc, zzbrq com_google_android_gms_internal_zzbrq) {
        if ($assertionsDisabled || com_google_android_gms_internal_zzbsc.zzaaM() || com_google_android_gms_internal_zzbsc.isEmpty()) {
            zzbte.zzbb(!(com_google_android_gms_internal_zzbsc instanceof zzbsa));
            zzbrb zzaaj = zzaaj();
            zzaaj.zzcin = com_google_android_gms_internal_zzbsc;
            zzaaj.zzcio = com_google_android_gms_internal_zzbrq;
            return zzaaj;
        }
        throw new AssertionError();
    }

    public zzbrb zzqB(int i) {
        zzbrb zzaaj = zzaaj();
        zzaaj.zzcij = Integer.valueOf(i);
        zzaaj.zzcik = zza.LEFT;
        return zzaaj;
    }

    public zzbrb zzqC(int i) {
        zzbrb zzaaj = zzaaj();
        zzaaj.zzcij = Integer.valueOf(i);
        zzaaj.zzcik = zza.RIGHT;
        return zzaaj;
    }
}
