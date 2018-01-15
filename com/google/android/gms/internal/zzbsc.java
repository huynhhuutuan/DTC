package com.google.android.gms.internal;

import java.util.Iterator;

public interface zzbsc extends Comparable<zzbsc>, Iterable<zzbsb> {
    public static final zzbrr zzcjF = new C12001();

    public enum zza {
        V1,
        V2
    }

    class C12001 extends zzbrr {
        C12001() {
        }

        public /* synthetic */ int compareTo(Object obj) {
            return zzh((zzbsc) obj);
        }

        public boolean equals(Object obj) {
            return obj == this;
        }

        public boolean isEmpty() {
            return false;
        }

        public String toString() {
            return "<Max Node>";
        }

        public zzbsc zzaaN() {
            return this;
        }

        public int zzh(zzbsc com_google_android_gms_internal_zzbsc) {
            return com_google_android_gms_internal_zzbsc == this ? 0 : 1;
        }

        public boolean zzk(zzbrq com_google_android_gms_internal_zzbrq) {
            return false;
        }

        public zzbsc zzm(zzbrq com_google_android_gms_internal_zzbrq) {
            return com_google_android_gms_internal_zzbrq.zzaaJ() ? zzaaN() : zzbrv.zzaaY();
        }
    }

    int getChildCount();

    Object getValue();

    Object getValue(boolean z);

    boolean isEmpty();

    zzbsc zzO(zzbph com_google_android_gms_internal_zzbph);

    Iterator<zzbsb> zzWU();

    String zza(zza com_google_android_gms_internal_zzbsc_zza);

    String zzaaL();

    boolean zzaaM();

    zzbsc zzaaN();

    zzbsc zze(zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc);

    zzbsc zzg(zzbsc com_google_android_gms_internal_zzbsc);

    boolean zzk(zzbrq com_google_android_gms_internal_zzbrq);

    zzbrq zzl(zzbrq com_google_android_gms_internal_zzbrq);

    zzbsc zzl(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc);

    zzbsc zzm(zzbrq com_google_android_gms_internal_zzbrq);
}
