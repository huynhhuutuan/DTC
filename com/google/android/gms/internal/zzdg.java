package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@zzme
public abstract class zzdg {
    @Nullable
    private static MessageDigest zzym = null;
    protected Object zzrJ = new Object();

    abstract byte[] zzF(String str);

    @Nullable
    protected MessageDigest zzet() {
        MessageDigest messageDigest;
        synchronized (this.zzrJ) {
            if (zzym != null) {
                messageDigest = zzym;
            } else {
                for (int i = 0; i < 2; i++) {
                    try {
                        zzym = MessageDigest.getInstance(CommonUtils.MD5_INSTANCE);
                    } catch (NoSuchAlgorithmException e) {
                    }
                }
                messageDigest = zzym;
            }
        }
        return messageDigest;
    }
}
