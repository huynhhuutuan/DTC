package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbro.zza;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public class zzbrn {
    private final String prefix;
    private final zzbro zzcbI;
    private final String zzciP;

    public zzbrn(zzbro com_google_android_gms_internal_zzbro, String str) {
        this(com_google_android_gms_internal_zzbro, str, null);
    }

    public zzbrn(zzbro com_google_android_gms_internal_zzbro, String str, String str2) {
        this.zzcbI = com_google_android_gms_internal_zzbro;
        this.zzciP = str;
        this.prefix = str2;
    }

    private long zzaaD() {
        return System.currentTimeMillis();
    }

    private String zzj(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        if (this.prefix == null) {
            return str;
        }
        String str2 = this.prefix;
        return new StringBuilder((String.valueOf(str2).length() + 3) + String.valueOf(str).length()).append(str2).append(" - ").append(str).toString();
    }

    private static String zzk(Throwable th) {
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public void info(String str) {
        this.zzcbI.zzb(zza.INFO, this.zzciP, zzj(str, new Object[0]), zzaaD());
    }

    public void warn(String str) {
        zze(str, null);
    }

    public void zza(String str, Throwable th, Object... objArr) {
        if (zzaaC()) {
            String zzj = zzj(str, objArr);
            if (th != null) {
                String valueOf = String.valueOf(zzk(th));
                zzj = new StringBuilder((String.valueOf(zzj).length() + 1) + String.valueOf(valueOf).length()).append(zzj).append("\n").append(valueOf).toString();
            }
            this.zzcbI.zzb(zza.DEBUG, this.zzciP, zzj, zzaaD());
        }
    }

    public boolean zzaaC() {
        return this.zzcbI.zzYd().ordinal() <= zza.DEBUG.ordinal();
    }

    public void zzd(String str, Throwable th) {
        String valueOf = String.valueOf(zzj(str, new Object[0]));
        String valueOf2 = String.valueOf(zzk(th));
        this.zzcbI.zzb(zza.ERROR, this.zzciP, new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("\n").append(valueOf2).toString(), zzaaD());
    }

    public void zze(String str, Throwable th) {
        String zzj = zzj(str, new Object[0]);
        if (th != null) {
            String valueOf = String.valueOf(zzk(th));
            zzj = new StringBuilder((String.valueOf(zzj).length() + 1) + String.valueOf(valueOf).length()).append(zzj).append("\n").append(valueOf).toString();
        }
        this.zzcbI.zzb(zza.WARN, this.zzciP, zzj, zzaaD());
    }

    public void zzi(String str, Object... objArr) {
        zza(str, null, objArr);
    }
}
