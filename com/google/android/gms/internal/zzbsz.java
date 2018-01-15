package com.google.android.gms.internal;

public class zzbsz {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbsz.class.desiredAssertionStatus());

    private static long zzd(zzbrz<?> com_google_android_gms_internal_zzbrz_) {
        long j = 8;
        if (!((com_google_android_gms_internal_zzbrz_ instanceof zzbru) || (com_google_android_gms_internal_zzbrz_ instanceof zzbsa))) {
            if (com_google_android_gms_internal_zzbrz_ instanceof zzbrp) {
                j = 4;
            } else if (com_google_android_gms_internal_zzbrz_ instanceof zzbsi) {
                j = (long) (((String) com_google_android_gms_internal_zzbrz_.getValue()).length() + 2);
            } else {
                String valueOf = String.valueOf(com_google_android_gms_internal_zzbrz_.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 24).append("Unknown leaf node type: ").append(valueOf).toString());
            }
        }
        if (com_google_android_gms_internal_zzbrz_.zzaaN().isEmpty()) {
            return j;
        }
        return zzd((zzbrz) com_google_android_gms_internal_zzbrz_.zzaaN()) + (24 + j);
    }

    public static long zzt(zzbsc com_google_android_gms_internal_zzbsc) {
        if (com_google_android_gms_internal_zzbsc.isEmpty()) {
            return 4;
        }
        if (com_google_android_gms_internal_zzbsc.zzaaM()) {
            return zzd((zzbrz) com_google_android_gms_internal_zzbsc);
        }
        if ($assertionsDisabled || (com_google_android_gms_internal_zzbsc instanceof zzbrr)) {
            long j = 1;
            for (zzbsb com_google_android_gms_internal_zzbsb : com_google_android_gms_internal_zzbsc) {
                j = zzt(com_google_android_gms_internal_zzbsb.zzWH()) + ((j + ((long) com_google_android_gms_internal_zzbsb.zzabi().asString().length())) + 4);
            }
            return !com_google_android_gms_internal_zzbsc.zzaaN().isEmpty() ? (j + 12) + zzd((zzbrz) com_google_android_gms_internal_zzbsc.zzaaN()) : j;
        } else {
            String valueOf = String.valueOf(com_google_android_gms_internal_zzbsc.getClass());
            throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Unexpected node type: ").append(valueOf).toString());
        }
    }

    public static int zzu(zzbsc com_google_android_gms_internal_zzbsc) {
        if (com_google_android_gms_internal_zzbsc.isEmpty()) {
            return 0;
        }
        if (com_google_android_gms_internal_zzbsc.zzaaM()) {
            return 1;
        }
        if ($assertionsDisabled || (com_google_android_gms_internal_zzbsc instanceof zzbrr)) {
            int i = 0;
            for (zzbsb zzWH : com_google_android_gms_internal_zzbsc) {
                i = zzu(zzWH.zzWH()) + i;
            }
            return i;
        }
        String valueOf = String.valueOf(com_google_android_gms_internal_zzbsc.getClass());
        throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Unexpected node type: ").append(valueOf).toString());
    }
}
