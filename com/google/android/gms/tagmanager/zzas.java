package com.google.android.gms.tagmanager;

import android.text.TextUtils;

class zzas {
    private final long zzagi;
    private final long zzbGq;
    private final long zzbGr;
    private String zzbGs;

    zzas(long j, long j2, long j3) {
        this.zzbGq = j;
        this.zzagi = j2;
        this.zzbGr = j3;
    }

    long zzQM() {
        return this.zzbGq;
    }

    long zzQN() {
        return this.zzbGr;
    }

    String zzQO() {
        return this.zzbGs;
    }

    void zzhi(String str) {
        if (str != null && !TextUtils.isEmpty(str.trim())) {
            this.zzbGs = str;
        }
    }
}
