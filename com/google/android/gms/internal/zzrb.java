package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.util.zzf;
import com.google.android.gms.internal.zzfa.zza;
import java.util.HashMap;
import java.util.Map;

@zzme
public class zzrb extends zza {
    private final zzqw zzIs;
    private int zzaaA;
    private zzfb zzaaB;
    private boolean zzaaC;
    private boolean zzaaD;
    private float zzaaE;
    private float zzaaF;
    private final float zzaaz;
    private final Object zzrJ = new Object();
    private boolean zzrM = true;

    public zzrb(zzqw com_google_android_gms_internal_zzqw, float f) {
        this.zzIs = com_google_android_gms_internal_zzqw;
        this.zzaaz = f;
    }

    private void zzbn(String str) {
        zzd(str, null);
    }

    private void zzd(String str, @Nullable Map<String, String> map) {
        final Map hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzw.zzcM().runOnUiThread(new Runnable(this) {
            final /* synthetic */ zzrb zzaaH;

            public void run() {
                this.zzaaH.zzIs.zza("pubVideoCmd", hashMap);
            }
        });
    }

    private void zzl(final int i, final int i2) {
        zzw.zzcM().runOnUiThread(new Runnable(this) {
            final /* synthetic */ zzrb zzaaH;

            public void run() {
                boolean z = false;
                synchronized (this.zzaaH.zzrJ) {
                    boolean z2 = i != i2;
                    boolean z3 = !this.zzaaH.zzaaC && i2 == 1;
                    boolean z4 = z2 && i2 == 1;
                    boolean z5 = z2 && i2 == 2;
                    z2 = z2 && i2 == 3;
                    zzrb com_google_android_gms_internal_zzrb = this.zzaaH;
                    if (this.zzaaH.zzaaC || z3) {
                        z = true;
                    }
                    com_google_android_gms_internal_zzrb.zzaaC = z;
                    if (this.zzaaH.zzaaB == null) {
                        return;
                    }
                    if (z3) {
                        try {
                            this.zzaaH.zzaaB.zzeY();
                        } catch (Throwable e) {
                            zzqf.zzc("Unable to call onVideoStart()", e);
                        }
                    }
                    if (z4) {
                        try {
                            this.zzaaH.zzaaB.zzeZ();
                        } catch (Throwable e2) {
                            zzqf.zzc("Unable to call onVideoPlay()", e2);
                        }
                    }
                    if (z5) {
                        try {
                            this.zzaaH.zzaaB.zzfa();
                        } catch (Throwable e22) {
                            zzqf.zzc("Unable to call onVideoPause()", e22);
                        }
                    }
                    if (z2) {
                        try {
                            this.zzaaH.zzaaB.onVideoEnd();
                        } catch (Throwable e222) {
                            zzqf.zzc("Unable to call onVideoEnd()", e222);
                        }
                    }
                }
            }
        });
    }

    public float getAspectRatio() {
        float f;
        synchronized (this.zzrJ) {
            f = this.zzaaF;
        }
        return f;
    }

    public int getPlaybackState() {
        int i;
        synchronized (this.zzrJ) {
            i = this.zzaaA;
        }
        return i;
    }

    public boolean isMuted() {
        boolean z;
        synchronized (this.zzrJ) {
            z = this.zzaaD;
        }
        return z;
    }

    public void pause() {
        zzbn("pause");
    }

    public void play() {
        zzbn("play");
    }

    public void zzQ(boolean z) {
        synchronized (this.zzrJ) {
            this.zzrM = z;
        }
        zzd("initialState", zzf.zzd("muteStart", z ? "1" : "0"));
    }

    public void zza(float f, int i, boolean z, float f2) {
        int i2;
        synchronized (this.zzrJ) {
            this.zzaaE = f;
            this.zzaaD = z;
            i2 = this.zzaaA;
            this.zzaaA = i;
            this.zzaaF = f2;
        }
        zzl(i2, i);
    }

    public void zza(zzfb com_google_android_gms_internal_zzfb) {
        synchronized (this.zzrJ) {
            this.zzaaB = com_google_android_gms_internal_zzfb;
        }
    }

    public float zzeW() {
        return this.zzaaz;
    }

    public float zzeX() {
        float f;
        synchronized (this.zzrJ) {
            f = this.zzaaE;
        }
        return f;
    }

    public void zzn(boolean z) {
        zzbn(z ? "mute" : "unmute");
    }
}
