package com.google.android.gms.internal;

public abstract class zzaca<T> {
    private static String READ_PERMISSION = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    private static zza zzaDC = null;
    private static int zzaDD = 0;
    private static final Object zztX = new Object();
    protected final String zzAX;
    protected final T zzAY;
    private T zzaDE = null;

    private interface zza {
    }

    class C09391 extends zzaca<Boolean> {
        C09391(String str, Boolean bool) {
            super(str, bool);
        }
    }

    class C09402 extends zzaca<Long> {
        C09402(String str, Long l) {
            super(str, l);
        }
    }

    class C09413 extends zzaca<Integer> {
        C09413(String str, Integer num) {
            super(str, num);
        }
    }

    class C09424 extends zzaca<Float> {
        C09424(String str, Float f) {
            super(str, f);
        }
    }

    class C09435 extends zzaca<String> {
        C09435(String str, String str2) {
            super(str, str2);
        }
    }

    protected zzaca(String str, T t) {
        this.zzAX = str;
        this.zzAY = t;
    }

    public static zzaca<String> zzB(String str, String str2) {
        return new C09435(str, str2);
    }

    public static zzaca<Float> zza(String str, Float f) {
        return new C09424(str, f);
    }

    public static zzaca<Integer> zza(String str, Integer num) {
        return new C09413(str, num);
    }

    public static zzaca<Long> zza(String str, Long l) {
        return new C09402(str, l);
    }

    public static zzaca<Boolean> zzj(String str, boolean z) {
        return new C09391(str, Boolean.valueOf(z));
    }
}
