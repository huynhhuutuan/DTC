package com.google.android.gms.internal;

public class zzbrq implements Comparable<zzbrq> {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbrq.class.desiredAssertionStatus());
    private static final zzbrq zzciW = new zzbrq("[MIN_KEY]");
    private static final zzbrq zzciX = new zzbrq("[MAX_KEY]");
    private static final zzbrq zzciY = new zzbrq(".priority");
    private static final zzbrq zzciZ = new zzbrq(".info");
    private final String zzaB;

    private static class zza extends zzbrq {
        private final int zzaGW;

        zza(String str, int i) {
            super(str);
            this.zzaGW = i;
        }

        protected int intValue() {
            return this.zzaGW;
        }

        public String toString() {
            String zzj = this.zzaB;
            return new StringBuilder(String.valueOf(zzj).length() + 20).append("IntegerChildName(\"").append(zzj).append("\")").toString();
        }

        protected boolean zzaaK() {
            return true;
        }
    }

    private zzbrq(String str) {
        this.zzaB = str;
    }

    public static zzbrq zzaaF() {
        return zzciW;
    }

    public static zzbrq zzaaG() {
        return zzciX;
    }

    public static zzbrq zzaaH() {
        return zzciY;
    }

    public static zzbrq zzaaI() {
        return zzciZ;
    }

    public static zzbrq zzja(String str) {
        Integer zzjj = zzbte.zzjj(str);
        if (zzjj != null) {
            return new zza(str, zzjj.intValue());
        }
        if (str.equals(".priority")) {
            return zzciY;
        }
        if ($assertionsDisabled || !str.contains("/")) {
            return new zzbrq(str);
        }
        throw new AssertionError();
    }

    public String asString() {
        return this.zzaB;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return zzi((zzbrq) obj);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zzbrq)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.zzaB.equals(((zzbrq) obj).zzaB);
    }

    public int hashCode() {
        return this.zzaB.hashCode();
    }

    protected int intValue() {
        return 0;
    }

    public String toString() {
        String str = this.zzaB;
        return new StringBuilder(String.valueOf(str).length() + 12).append("ChildKey(\"").append(str).append("\")").toString();
    }

    public boolean zzaaJ() {
        return this == zzciY;
    }

    protected boolean zzaaK() {
        return false;
    }

    public int zzi(zzbrq com_google_android_gms_internal_zzbrq) {
        if (this == com_google_android_gms_internal_zzbrq) {
            return 0;
        }
        if (this == zzciW || com_google_android_gms_internal_zzbrq == zzciX) {
            return -1;
        }
        if (com_google_android_gms_internal_zzbrq == zzciW || this == zzciX) {
            return 1;
        }
        if (!zzaaK()) {
            return com_google_android_gms_internal_zzbrq.zzaaK() ? 1 : this.zzaB.compareTo(com_google_android_gms_internal_zzbrq.zzaB);
        } else {
            if (!com_google_android_gms_internal_zzbrq.zzaaK()) {
                return -1;
            }
            int zzH = zzbte.zzH(intValue(), com_google_android_gms_internal_zzbrq.intValue());
            return zzH == 0 ? zzbte.zzH(this.zzaB.length(), com_google_android_gms_internal_zzbrq.zzaB.length()) : zzH;
        }
    }
}
