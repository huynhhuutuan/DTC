package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.zze;
import com.google.android.gms.internal.zzag.zza;
import com.google.android.gms.internal.zzag.zzd;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class zzbd {
    private static final String TAG = zzbd.class.getSimpleName();
    protected static final Object zzqC = new Object();
    private static zze zzqE = null;
    protected static final Object zzqy = new Object();
    private volatile boolean zzpU = false;
    private GoogleApiClient zzqA = null;
    protected boolean zzqB = false;
    protected boolean zzqD = false;
    protected boolean zzqF = false;
    private Map<Pair<String, String>, zzbz> zzqG;
    protected Context zzqn;
    protected Context zzqo;
    private ExecutorService zzqp;
    private DexClassLoader zzqq;
    private zzay zzqr;
    private byte[] zzqs;
    private volatile AdvertisingIdClient zzqt = null;
    private Future zzqu = null;
    private volatile zza zzqv = null;
    private Future zzqw = null;
    private volatile boolean zzqx = false;
    private zzaq zzqz;

    class C04721 implements Runnable {
        final /* synthetic */ zzbd zzqH;

        C04721(zzbd com_google_android_gms_internal_zzbd) {
            this.zzqH = com_google_android_gms_internal_zzbd;
        }

        public void run() {
            this.zzqH.zzaT();
        }
    }

    class C04732 implements Runnable {
        final /* synthetic */ zzbd zzqH;

        C04732(zzbd com_google_android_gms_internal_zzbd) {
            this.zzqH = com_google_android_gms_internal_zzbd;
        }

        public void run() {
            this.zzqH.zzaW();
            synchronized (zzbd.zzqy) {
                this.zzqH.zzqx = false;
            }
        }
    }

    class C04743 implements Runnable {
        final /* synthetic */ zzbd zzqH;

        C04743(zzbd com_google_android_gms_internal_zzbd) {
            this.zzqH = com_google_android_gms_internal_zzbd;
        }

        public void run() {
            zzgd.initialize(this.zzqH.zzqn);
        }
    }

    private zzbd(Context context) {
        this.zzqn = context;
        this.zzqo = context.getApplicationContext();
        this.zzqG = new HashMap();
    }

    public static zzbd zza(Context context, String str, String str2, boolean z) {
        zzbd com_google_android_gms_internal_zzbd = new zzbd(context);
        try {
            com_google_android_gms_internal_zzbd.zzb(str, str2, z);
            return com_google_android_gms_internal_zzbd;
        } catch (zzba e) {
            return null;
        }
    }

    @NonNull
    private File zza(String str, File file, String str2) throws zzay.zza, IOException {
        File file2 = new File(String.format("%s/%s.jar", new Object[]{file, str2}));
        if (!file2.exists()) {
            byte[] zzc = this.zzqr.zzc(this.zzqs, str);
            file2.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(zzc, 0, zzc.length);
            fileOutputStream.close();
        }
        return file2;
    }

    private void zza(File file) {
        if (file.exists()) {
            file.delete();
            return;
        }
        Log.d(TAG, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
    }

    private void zza(File file, String str) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        Throwable th;
        FileOutputStream fileOutputStream = null;
        File file2 = new File(String.format("%s/%s.tmp", new Object[]{file, str}));
        if (!file2.exists()) {
            File file3 = new File(String.format("%s/%s.dex", new Object[]{file, str}));
            if (file3.exists()) {
                long length = file3.length();
                if (length > 0) {
                    byte[] bArr = new byte[((int) length)];
                    FileOutputStream fileOutputStream2;
                    try {
                        fileInputStream = new FileInputStream(file3);
                        try {
                            if (fileInputStream.read(bArr) <= 0) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e) {
                                }
                                zza(file3);
                                return;
                            }
                            zzbxt com_google_android_gms_internal_zzag_zzd = new zzd();
                            com_google_android_gms_internal_zzag_zzd.zzcx = VERSION.SDK.getBytes();
                            com_google_android_gms_internal_zzag_zzd.zzcw = str.getBytes();
                            bArr = this.zzqr.zzd(this.zzqs, bArr).getBytes();
                            com_google_android_gms_internal_zzag_zzd.data = bArr;
                            com_google_android_gms_internal_zzag_zzd.zzcv = zzao.zzh(bArr);
                            file2.createNewFile();
                            fileOutputStream2 = new FileOutputStream(file2);
                            try {
                                byte[] zzf = zzbxt.zzf(com_google_android_gms_internal_zzag_zzd);
                                fileOutputStream2.write(zzf, 0, zzf.length);
                                fileOutputStream2.close();
                                try {
                                    fileInputStream.close();
                                } catch (IOException e2) {
                                }
                                try {
                                    fileOutputStream2.close();
                                } catch (IOException e3) {
                                }
                                zza(file3);
                            } catch (IOException e4) {
                                fileInputStream2 = fileInputStream;
                                if (fileInputStream2 != null) {
                                    try {
                                        fileInputStream2.close();
                                    } catch (IOException e5) {
                                    }
                                }
                                if (fileOutputStream2 != null) {
                                    try {
                                        fileOutputStream2.close();
                                    } catch (IOException e6) {
                                    }
                                }
                                zza(file3);
                            } catch (NoSuchAlgorithmException e7) {
                                fileInputStream2 = fileInputStream;
                                if (fileInputStream2 != null) {
                                    fileInputStream2.close();
                                }
                                if (fileOutputStream2 != null) {
                                    fileOutputStream2.close();
                                }
                                zza(file3);
                            } catch (zzay.zza e8) {
                                fileInputStream2 = fileInputStream;
                                if (fileInputStream2 != null) {
                                    fileInputStream2.close();
                                }
                                if (fileOutputStream2 != null) {
                                    fileOutputStream2.close();
                                }
                                zza(file3);
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                fileOutputStream = fileOutputStream2;
                                th = th3;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e9) {
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e10) {
                                    }
                                }
                                zza(file3);
                                throw th;
                            }
                        } catch (IOException e11) {
                            fileOutputStream2 = null;
                            fileInputStream2 = fileInputStream;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            zza(file3);
                        } catch (NoSuchAlgorithmException e12) {
                            fileOutputStream2 = null;
                            fileInputStream2 = fileInputStream;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            zza(file3);
                        } catch (zzay.zza e13) {
                            fileOutputStream2 = null;
                            fileInputStream2 = fileInputStream;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            zza(file3);
                        } catch (Throwable th4) {
                            th = th4;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            zza(file3);
                            throw th;
                        }
                    } catch (IOException e14) {
                        fileOutputStream2 = null;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        zza(file3);
                    } catch (NoSuchAlgorithmException e15) {
                        fileOutputStream2 = null;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        zza(file3);
                    } catch (zzay.zza e16) {
                        fileOutputStream2 = null;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        zza(file3);
                    } catch (Throwable th5) {
                        th = th5;
                        fileInputStream = null;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        zza(file3);
                        throw th;
                    }
                }
            }
        }
    }

    private void zzaT() {
        try {
            if (this.zzqt == null && this.zzqo != null) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.zzqo);
                advertisingIdClient.start();
                this.zzqt = advertisingIdClient;
            }
        } catch (GooglePlayServicesNotAvailableException e) {
            this.zzqt = null;
        } catch (IOException e2) {
            this.zzqt = null;
        } catch (GooglePlayServicesRepairableException e3) {
            this.zzqt = null;
        }
    }

    private void zzaU() {
        if (((Boolean) zzgd.zzDV.get()).booleanValue()) {
            zzaV();
        }
    }

    private void zzaW() {
        if (this.zzqD) {
            try {
                this.zzqv = zzaqg.zzq(this.zzqn, this.zzqn.getPackageName(), Integer.toString(this.zzqn.getPackageManager().getPackageInfo(this.zzqn.getPackageName(), 0).versionCode));
            } catch (Throwable th) {
            }
        }
    }

    private void zzaX() {
        boolean z = true;
        this.zzqp.execute(new C04743(this));
        try {
            zzqE = zze.zzuY();
            this.zzqB = zzqE.zzaC(this.zzqn) > 0;
            if (zzqE.isGooglePlayServicesAvailable(this.zzqn) != 0) {
                z = false;
            }
            this.zzqD = z;
            if (this.zzqn.getApplicationContext() != null) {
                this.zzqA = new Builder(this.zzqn).addApi(zzzk.API).build();
            }
        } catch (Throwable th) {
        }
    }

    private boolean zzb(File file, String str) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream2;
        Throwable th;
        FileOutputStream fileOutputStream2 = null;
        File file2 = new File(String.format("%s/%s.tmp", new Object[]{file, str}));
        if (!file2.exists()) {
            return false;
        }
        File file3 = new File(String.format("%s/%s.dex", new Object[]{file, str}));
        if (file3.exists()) {
            return false;
        }
        try {
            long length = file2.length();
            if (length <= 0) {
                zza(file2);
                return false;
            }
            byte[] bArr = new byte[((int) length)];
            fileInputStream = new FileInputStream(file2);
            try {
                if (fileInputStream.read(bArr) <= 0) {
                    Log.d(TAG, "Cannot read the cache data.");
                    zza(file2);
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                    }
                    return false;
                }
                zzd zze = zzd.zze(bArr);
                if (str.equals(new String(zze.zzcw)) && Arrays.equals(zze.zzcv, zzao.zzh(zze.data)) && Arrays.equals(zze.zzcx, VERSION.SDK.getBytes())) {
                    bArr = this.zzqr.zzc(this.zzqs, new String(zze.data));
                    file3.createNewFile();
                    FileOutputStream fileOutputStream3 = new FileOutputStream(file3);
                    try {
                        fileOutputStream3.write(bArr, 0, bArr.length);
                        try {
                            fileInputStream.close();
                        } catch (IOException e2) {
                        }
                        try {
                            fileOutputStream3.close();
                            return true;
                        } catch (IOException e3) {
                            return true;
                        }
                    } catch (IOException e4) {
                        fileOutputStream = fileOutputStream3;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e5) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e6) {
                            }
                        }
                        return false;
                    } catch (NoSuchAlgorithmException e7) {
                        fileOutputStream = fileOutputStream3;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return false;
                    } catch (zzay.zza e8) {
                        fileOutputStream = fileOutputStream3;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream2 = fileOutputStream3;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e9) {
                            }
                        }
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e10) {
                            }
                        }
                        throw th;
                    }
                }
                zza(file2);
                try {
                    fileInputStream.close();
                } catch (IOException e11) {
                }
                return false;
            } catch (IOException e12) {
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                return false;
            } catch (NoSuchAlgorithmException e13) {
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                return false;
            } catch (zzay.zza e14) {
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
                throw th;
            }
        } catch (IOException e15) {
            fileOutputStream = null;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            return false;
        } catch (NoSuchAlgorithmException e16) {
            fileOutputStream = null;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            return false;
        } catch (zzay.zza e17) {
            fileOutputStream = null;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            return false;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            throw th;
        }
    }

    private boolean zzb(String str, String str2, boolean z) throws zzba {
        this.zzqp = Executors.newCachedThreadPool();
        zzc(z);
        zzaX();
        zzaU();
        if (zzbf.zzbc() && ((Boolean) zzgd.zzDT.get()).booleanValue()) {
            throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
        }
        zzo(str);
        zzp(str2);
        this.zzqz = new zzaq(this);
        return true;
    }

    private void zzc(boolean z) {
        this.zzpU = z;
        if (z) {
            this.zzqu = this.zzqp.submit(new C04721(this));
        }
    }

    private void zzo(String str) throws zzba {
        this.zzqr = new zzay(null);
        try {
            this.zzqs = this.zzqr.zzn(str);
        } catch (Throwable e) {
            throw new zzba(e);
        }
    }

    private boolean zzp(String str) throws zzba {
        File file;
        String zzU;
        File zza;
        try {
            File cacheDir = this.zzqn.getCacheDir();
            if (cacheDir == null) {
                cacheDir = this.zzqn.getDir("dex", 0);
                if (cacheDir == null) {
                    throw new zzba();
                }
            }
            file = cacheDir;
            zzU = zzaz.zzU();
            zza = zza(str, file, zzU);
            zzb(file, zzU);
            this.zzqq = new DexClassLoader(zza.getAbsolutePath(), file.getAbsolutePath(), null, this.zzqn.getClassLoader());
            zza(zza);
            zza(file, zzU);
            zzq(String.format("%s/%s.dex", new Object[]{file, zzU}));
            return true;
        } catch (Throwable e) {
            throw new zzba(e);
        } catch (Throwable e2) {
            throw new zzba(e2);
        } catch (Throwable e22) {
            throw new zzba(e22);
        } catch (Throwable e222) {
            throw new zzba(e222);
        } catch (Throwable th) {
            zza(zza);
            zza(file, zzU);
            zzq(String.format("%s/%s.dex", new Object[]{file, zzU}));
        }
    }

    private void zzq(String str) {
        zza(new File(str));
    }

    public Context getApplicationContext() {
        return this.zzqo;
    }

    public Context getContext() {
        return this.zzqn;
    }

    public int zzQ() {
        zzaq zzaP = zzaP();
        return zzaP != null ? zzaP.zzQ() : Integer.MIN_VALUE;
    }

    public boolean zza(String str, String str2, List<Class> list) {
        if (this.zzqG.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.zzqG.put(new Pair(str, str2), new zzbz(this, str, str2, list));
        return true;
    }

    public ExecutorService zzaI() {
        return this.zzqp;
    }

    public DexClassLoader zzaJ() {
        return this.zzqq;
    }

    public zzay zzaK() {
        return this.zzqr;
    }

    public byte[] zzaL() {
        return this.zzqs;
    }

    public GoogleApiClient zzaM() {
        return this.zzqA;
    }

    public boolean zzaN() {
        return this.zzqB;
    }

    public boolean zzaO() {
        return this.zzqF;
    }

    public zzaq zzaP() {
        return this.zzqz;
    }

    public boolean zzaQ() {
        return this.zzqD;
    }

    public zza zzaR() {
        return this.zzqv;
    }

    public Future zzaS() {
        return this.zzqw;
    }

    public void zzaV() {
        synchronized (zzqy) {
            if (!this.zzqx) {
                this.zzqw = this.zzqp.submit(new C04732(this));
                this.zzqx = true;
            }
        }
    }

    public AdvertisingIdClient zzaY() {
        if (!this.zzpU) {
            return null;
        }
        if (this.zzqt != null) {
            return this.zzqt;
        }
        if (this.zzqu != null) {
            try {
                this.zzqu.get(2000, TimeUnit.MILLISECONDS);
                this.zzqu = null;
            } catch (InterruptedException e) {
            } catch (ExecutionException e2) {
            } catch (TimeoutException e3) {
                this.zzqu.cancel(true);
            }
        }
        return this.zzqt;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void zzaZ() {
        /*
        r2 = this;
        r1 = zzqC;	 Catch:{ Throwable -> 0x001e }
        monitor-enter(r1);	 Catch:{ Throwable -> 0x001e }
        r0 = r2.zzqF;	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
    L_0x0008:
        return;
    L_0x0009:
        r0 = r2.zzqD;	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0020;
    L_0x000d:
        r0 = r2.zzqA;	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0020;
    L_0x0011:
        r0 = r2.zzqA;	 Catch:{ all -> 0x001b }
        r0.connect();	 Catch:{ all -> 0x001b }
        r0 = 1;
        r2.zzqF = r0;	 Catch:{ all -> 0x001b }
    L_0x0019:
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        goto L_0x0008;
    L_0x001b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        throw r0;	 Catch:{ Throwable -> 0x001e }
    L_0x001e:
        r0 = move-exception;
        goto L_0x0008;
    L_0x0020:
        r0 = 0;
        r2.zzqF = r0;	 Catch:{ all -> 0x001b }
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzbd.zzaZ():void");
    }

    public void zzba() {
        synchronized (zzqC) {
            if (this.zzqF && this.zzqA != null) {
                this.zzqA.disconnect();
                this.zzqF = false;
            }
        }
    }

    public Method zzc(String str, String str2) {
        zzbz com_google_android_gms_internal_zzbz = (zzbz) this.zzqG.get(new Pair(str, str2));
        return com_google_android_gms_internal_zzbz == null ? null : com_google_android_gms_internal_zzbz.zzbm();
    }
}
