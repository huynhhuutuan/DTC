package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzw;

@zzme
public abstract class zzfz<T> {
    private final int zzAW;
    private final String zzAX;
    private final T zzAY;

    class C10361 extends zzfz<Boolean> {
        C10361(int i, String str, Boolean bool) {
            super(i, str, bool);
        }

        public /* synthetic */ Object zza(SharedPreferences sharedPreferences) {
            return zzb(sharedPreferences);
        }

        public Boolean zzb(SharedPreferences sharedPreferences) {
            return Boolean.valueOf(sharedPreferences.getBoolean(getKey(), ((Boolean) zzfr()).booleanValue()));
        }
    }

    class C10372 extends zzfz<Integer> {
        C10372(int i, String str, Integer num) {
            super(i, str, num);
        }

        public /* synthetic */ Object zza(SharedPreferences sharedPreferences) {
            return zzc(sharedPreferences);
        }

        public Integer zzc(SharedPreferences sharedPreferences) {
            return Integer.valueOf(sharedPreferences.getInt(getKey(), ((Integer) zzfr()).intValue()));
        }
    }

    class C10383 extends zzfz<Long> {
        C10383(int i, String str, Long l) {
            super(i, str, l);
        }

        public /* synthetic */ Object zza(SharedPreferences sharedPreferences) {
            return zzd(sharedPreferences);
        }

        public Long zzd(SharedPreferences sharedPreferences) {
            return Long.valueOf(sharedPreferences.getLong(getKey(), ((Long) zzfr()).longValue()));
        }
    }

    class C10394 extends zzfz<Float> {
        C10394(int i, String str, Float f) {
            super(i, str, f);
        }

        public /* synthetic */ Object zza(SharedPreferences sharedPreferences) {
            return zze(sharedPreferences);
        }

        public Float zze(SharedPreferences sharedPreferences) {
            return Float.valueOf(sharedPreferences.getFloat(getKey(), ((Float) zzfr()).floatValue()));
        }
    }

    class C10405 extends zzfz<String> {
        C10405(int i, String str, String str2) {
            super(i, str, str2);
        }

        public /* synthetic */ Object zza(SharedPreferences sharedPreferences) {
            return zzf(sharedPreferences);
        }

        public String zzf(SharedPreferences sharedPreferences) {
            return sharedPreferences.getString(getKey(), (String) zzfr());
        }
    }

    private zzfz(int i, String str, T t) {
        this.zzAW = i;
        this.zzAX = str;
        this.zzAY = t;
        zzw.zzcX().zza(this);
    }

    public static zzfz<String> zza(int i, String str) {
        zzfz<String> zza = zza(i, str, null);
        zzw.zzcX().zzb(zza);
        return zza;
    }

    public static zzfz<Float> zza(int i, String str, float f) {
        return new C10394(i, str, Float.valueOf(f));
    }

    public static zzfz<Integer> zza(int i, String str, int i2) {
        return new C10372(i, str, Integer.valueOf(i2));
    }

    public static zzfz<Long> zza(int i, String str, long j) {
        return new C10383(i, str, Long.valueOf(j));
    }

    public static zzfz<Boolean> zza(int i, String str, Boolean bool) {
        return new C10361(i, str, bool);
    }

    public static zzfz<String> zza(int i, String str, String str2) {
        return new C10405(i, str, str2);
    }

    public static zzfz<String> zzb(int i, String str) {
        zzfz<String> zza = zza(i, str, null);
        zzw.zzcX().zzc(zza);
        return zza;
    }

    public T get() {
        return zzw.zzcY().zzd(this);
    }

    public String getKey() {
        return this.zzAX;
    }

    protected abstract T zza(SharedPreferences sharedPreferences);

    public T zzfr() {
        return this.zzAY;
    }
}
