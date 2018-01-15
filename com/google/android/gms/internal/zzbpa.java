package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbro.zza;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.FirebaseDatabase;
import java.util.concurrent.ScheduledExecutorService;

public class zzbpa {
    protected long cacheSize = 10485760;
    protected FirebaseApp zzcay;
    protected zzbro zzcbI;
    protected boolean zzcbJ;
    protected String zzcbL;
    private boolean zzcdJ = false;
    protected zzbpe zzcdW;
    protected zzbow zzcdX;
    protected zzbpm zzcdY;
    protected String zzcdZ;
    protected zza zzcea = zza.INFO;
    private boolean zzceb = false;
    private zzbpi zzcec;

    class C09711 implements zzbok {
        final /* synthetic */ zzbow zzced;

        C09711(zzbow com_google_android_gms_internal_zzbow) {
            this.zzced = com_google_android_gms_internal_zzbow;
        }

        public void zza(boolean z, final zzbok.zza com_google_android_gms_internal_zzbok_zza) {
            this.zzced.zza(z, new zzbow.zza(this) {
                public void onError(String str) {
                    com_google_android_gms_internal_zzbok_zza.onError(str);
                }

                public void zziL(String str) {
                    com_google_android_gms_internal_zzbok_zza.zziL(str);
                }
            });
        }
    }

    private ScheduledExecutorService zzXs() {
        zzbpm zzYA = zzYA();
        if (zzYA instanceof zzbsy) {
            return ((zzbsy) zzYA).zzXs();
        }
        throw new RuntimeException("Custom run loops are not supported!");
    }

    private void zzYD() {
        if (this.zzcbI == null) {
            this.zzcbI = zzYr().zza(this, this.zzcea, null);
        }
    }

    private void zzYE() {
        if (this.zzcdY == null) {
            this.zzcdY = this.zzcec.zzb(this);
        }
    }

    private void zzYF() {
        if (this.zzcdW == null) {
            this.zzcdW = zzYr().zza(this);
        }
    }

    private void zzYG() {
        if (this.zzcbL == null) {
            this.zzcbL = zziX(zzYr().zzc(this));
        }
    }

    private void zzYH() {
        if (this.zzcdX == null) {
            this.zzcdX = zzYr().zza(zzXs());
        }
    }

    private void zzYI() {
        if (this.zzcdZ == null) {
            this.zzcdZ = "default";
        }
    }

    private zzbpi zzYr() {
        if (this.zzcec == null) {
            if (zzbst.zzabF()) {
                zzYs();
            } else if (zzbpf.isActive()) {
                zzbpi com_google_android_gms_internal_zzbpi = zzbpf.INSTANCE;
                com_google_android_gms_internal_zzbpi.initialize();
                this.zzcec = com_google_android_gms_internal_zzbpi;
            } else {
                this.zzcec = zzbpg.INSTANCE;
            }
        }
        return this.zzcec;
    }

    private synchronized void zzYs() {
        this.zzcec = new zzbnv(this.zzcay);
    }

    private void zzYu() {
        zzYD();
        zzYr();
        zzYG();
        zzYF();
        zzYE();
        zzYI();
        zzYH();
    }

    private void zzYv() {
        this.zzcdW.restart();
        this.zzcdY.restart();
    }

    private static zzbok zza(zzbow com_google_android_gms_internal_zzbow) {
        return new C09711(com_google_android_gms_internal_zzbow);
    }

    private String zziX(String str) {
        return "Firebase/" + "5" + "/" + FirebaseDatabase.getSdkVersion() + "/" + str;
    }

    public boolean isFrozen() {
        return this.zzcdJ;
    }

    void stop() {
        this.zzceb = true;
        this.zzcdW.shutdown();
        this.zzcdY.shutdown();
    }

    public zzbro zzXq() {
        return this.zzcbI;
    }

    public boolean zzXt() {
        return this.zzcbJ;
    }

    public zzbpm zzYA() {
        return this.zzcdY;
    }

    public String zzYB() {
        return this.zzcdZ;
    }

    public zzbow zzYC() {
        return this.zzcdX;
    }

    public zza zzYd() {
        return this.zzcea;
    }

    synchronized void zzYi() {
        if (!this.zzcdJ) {
            this.zzcdJ = true;
            zzYu();
        }
    }

    public void zzYt() {
        if (this.zzceb) {
            zzYv();
            this.zzceb = false;
        }
    }

    protected void zzYw() {
        if (isFrozen()) {
            throw new DatabaseException("Modifications to DatabaseConfig objects must occur before they are in use");
        }
    }

    public zzbol zzYx() {
        return new zzbol(zzXq(), zza(zzYC()), zzXs(), zzXt(), FirebaseDatabase.getSdkVersion(), zzkn());
    }

    public long zzYy() {
        return this.cacheSize;
    }

    public zzbpe zzYz() {
        return this.zzcdW;
    }

    public zzbop zza(zzbon com_google_android_gms_internal_zzbon, zzbop.zza com_google_android_gms_internal_zzbop_zza) {
        return zzYr().zza(this, zzYx(), com_google_android_gms_internal_zzbon, com_google_android_gms_internal_zzbop_zza);
    }

    public zzbrn zziV(String str) {
        return new zzbrn(this.zzcbI, str);
    }

    zzbql zziW(String str) {
        if (!this.zzcbJ) {
            return new zzbqk();
        }
        zzbql zza = this.zzcec.zza(this, str);
        if (zza != null) {
            return zza;
        }
        throw new IllegalArgumentException("You have enabled persistence, but persistence is not supported on this platform.");
    }

    public String zzkn() {
        return this.zzcbL;
    }
}
