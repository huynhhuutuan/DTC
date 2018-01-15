package com.google.android.gms.tagmanager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.zzac;
import java.util.Random;

public class zzq {
    private final Context mContext;
    private final String zzbEY;
    private final Random zzzW;

    public zzq(Context context, String str) {
        this(context, str, new Random());
    }

    @VisibleForTesting
    zzq(Context context, String str, Random random) {
        this.mContext = (Context) zzac.zzw(context);
        this.zzbEY = (String) zzac.zzw(str);
        this.zzzW = random;
    }

    private SharedPreferences zzQt() {
        Context context = this.mContext;
        String valueOf = String.valueOf("_gtmContainerRefreshPolicy_");
        String valueOf2 = String.valueOf(this.zzbEY);
        return context.getSharedPreferences(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), 0);
    }

    private long zzi(long j, long j2) {
        SharedPreferences zzQt = zzQt();
        long max = Math.max(0, zzQt.getLong("FORBIDDEN_COUNT", 0));
        return (long) (((float) (((long) ((((float) max) / ((float) ((Math.max(0, zzQt.getLong("SUCCESSFUL_COUNT", 0)) + max) + 1))) * ((float) (j2 - j)))) + j)) * this.zzzW.nextFloat());
    }

    public long zzQp() {
        return 43200000 + zzi(7200000, 259200000);
    }

    public long zzQq() {
        return 3600000 + zzi(600000, 86400000);
    }

    @SuppressLint({"CommitPrefEdits"})
    public void zzQr() {
        SharedPreferences zzQt = zzQt();
        long j = zzQt.getLong("FORBIDDEN_COUNT", 0);
        long j2 = zzQt.getLong("SUCCESSFUL_COUNT", 0);
        Editor edit = zzQt.edit();
        long min = j == 0 ? 3 : Math.min(10, 1 + j);
        j = Math.max(0, Math.min(j2, 10 - min));
        edit.putLong("FORBIDDEN_COUNT", min);
        edit.putLong("SUCCESSFUL_COUNT", j);
        zzdd.zza(edit);
    }

    @SuppressLint({"CommitPrefEdits"})
    public void zzQs() {
        SharedPreferences zzQt = zzQt();
        long j = zzQt.getLong("SUCCESSFUL_COUNT", 0);
        long j2 = zzQt.getLong("FORBIDDEN_COUNT", 0);
        j = Math.min(10, j + 1);
        j2 = Math.max(0, Math.min(j2, 10 - j));
        Editor edit = zzQt.edit();
        edit.putLong("SUCCESSFUL_COUNT", j);
        edit.putLong("FORBIDDEN_COUNT", j2);
        zzdd.zza(edit);
    }
}
