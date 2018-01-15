package com.google.android.gms.internal;

public class zzbst {
    private static final boolean zzckC = zzabE();

    private static boolean zzabE() {
        try {
            Class.forName("android.app.Activity");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public static boolean zzabF() {
        return zzckC;
    }
}
