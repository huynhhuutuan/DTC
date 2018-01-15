package com.google.android.gms.tagmanager;

class zzdk extends Number implements Comparable<zzdk> {
    private double zzbID;
    private long zzbIE;
    private boolean zzbIF = false;

    private zzdk(double d) {
        this.zzbID = d;
    }

    private zzdk(long j) {
        this.zzbIE = j;
    }

    public static zzdk zza(Double d) {
        return new zzdk(d.doubleValue());
    }

    public static zzdk zzaA(long j) {
        return new zzdk(j);
    }

    public static zzdk zzhv(String str) throws NumberFormatException {
        try {
            return new zzdk(Long.parseLong(str));
        } catch (NumberFormatException e) {
            try {
                return new zzdk(Double.parseDouble(str));
            } catch (NumberFormatException e2) {
                throw new NumberFormatException(String.valueOf(str).concat(" is not a valid TypedNumber"));
            }
        }
    }

    public byte byteValue() {
        return (byte) ((int) longValue());
    }

    public /* synthetic */ int compareTo(Object obj) {
        return zza((zzdk) obj);
    }

    public double doubleValue() {
        return zzRG() ? (double) this.zzbIE : this.zzbID;
    }

    public boolean equals(Object obj) {
        return (obj instanceof zzdk) && zza((zzdk) obj) == 0;
    }

    public float floatValue() {
        return (float) doubleValue();
    }

    public int hashCode() {
        return new Long(longValue()).hashCode();
    }

    public int intValue() {
        return zzRI();
    }

    public long longValue() {
        return zzRH();
    }

    public short shortValue() {
        return zzRJ();
    }

    public String toString() {
        return zzRG() ? Long.toString(this.zzbIE) : Double.toString(this.zzbID);
    }

    public boolean zzRF() {
        return !zzRG();
    }

    public boolean zzRG() {
        return this.zzbIF;
    }

    public long zzRH() {
        return zzRG() ? this.zzbIE : (long) this.zzbID;
    }

    public int zzRI() {
        return (int) longValue();
    }

    public short zzRJ() {
        return (short) ((int) longValue());
    }

    public int zza(zzdk com_google_android_gms_tagmanager_zzdk) {
        return (zzRG() && com_google_android_gms_tagmanager_zzdk.zzRG()) ? new Long(this.zzbIE).compareTo(Long.valueOf(com_google_android_gms_tagmanager_zzdk.zzbIE)) : Double.compare(doubleValue(), com_google_android_gms_tagmanager_zzdk.doubleValue());
    }
}
