package com.google.android.gms.internal;

import java.util.Random;

public class zzbtd {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbtd.class.desiredAssertionStatus());
    private static final Random zzckJ = new Random();
    private static long zzckK = 0;
    private static final int[] zzckL = new int[12];

    public static synchronized String zzaT(long j) {
        String stringBuilder;
        int i = 0;
        synchronized (zzbtd.class) {
            int i2;
            int i3 = j == zzckK ? 1 : 0;
            zzckK = j;
            char[] cArr = new char[8];
            StringBuilder stringBuilder2 = new StringBuilder(20);
            for (i2 = 7; i2 >= 0; i2--) {
                cArr[i2] = "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt((int) (j % 64));
                j /= 64;
            }
            if ($assertionsDisabled || j == 0) {
                stringBuilder2.append(cArr);
                if (i3 == 0) {
                    for (i2 = 0; i2 < 12; i2++) {
                        zzckL[i2] = zzckJ.nextInt(64);
                    }
                } else {
                    zzabJ();
                }
                while (i < 12) {
                    stringBuilder2.append("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt(zzckL[i]));
                    i++;
                }
                if ($assertionsDisabled || stringBuilder2.length() == 20) {
                    stringBuilder = stringBuilder2.toString();
                } else {
                    throw new AssertionError();
                }
            }
            throw new AssertionError();
        }
        return stringBuilder;
    }

    private static void zzabJ() {
        int i = 11;
        while (i >= 0) {
            if (zzckL[i] != 63) {
                zzckL[i] = zzckL[i] + 1;
                return;
            } else {
                zzckL[i] = 0;
                i--;
            }
        }
    }
}
