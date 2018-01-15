package com.google.firebase.remoteconfig;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.XmlResourceParser;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.internal.zzadi;
import com.google.android.gms.internal.zzado;
import com.google.android.gms.internal.zzblq;
import com.google.android.gms.internal.zzbtl;
import com.google.android.gms.internal.zzbtm;
import com.google.android.gms.internal.zzbtn;
import com.google.android.gms.internal.zzbto;
import com.google.android.gms.internal.zzbtp;
import com.google.android.gms.internal.zzbtq;
import com.google.android.gms.internal.zzbtr;
import com.google.android.gms.internal.zzbts.zza;
import com.google.android.gms.internal.zzbts.zzb;
import com.google.android.gms.internal.zzbts.zzc;
import com.google.android.gms.internal.zzbts.zzd;
import com.google.android.gms.internal.zzbts.zze;
import com.google.android.gms.internal.zzbts.zzf;
import com.google.android.gms.internal.zzbxl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings.Builder;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class FirebaseRemoteConfig {
    public static final boolean DEFAULT_VALUE_FOR_BOOLEAN = false;
    public static final byte[] DEFAULT_VALUE_FOR_BYTE_ARRAY = new byte[0];
    public static final double DEFAULT_VALUE_FOR_DOUBLE = 0.0d;
    public static final long DEFAULT_VALUE_FOR_LONG = 0;
    public static final String DEFAULT_VALUE_FOR_STRING = "";
    public static final int LAST_FETCH_STATUS_FAILURE = 1;
    public static final int LAST_FETCH_STATUS_NO_FETCH_YET = 0;
    public static final int LAST_FETCH_STATUS_SUCCESS = -1;
    public static final int LAST_FETCH_STATUS_THROTTLED = 2;
    public static final int VALUE_SOURCE_DEFAULT = 1;
    public static final int VALUE_SOURCE_REMOTE = 2;
    public static final int VALUE_SOURCE_STATIC = 0;
    private static FirebaseRemoteConfig zzclM;
    private final Context mContext;
    private zzbto zzclN;
    private zzbto zzclO;
    private zzbto zzclP;
    private zzbtr zzclQ;
    private final ReadWriteLock zzclR;

    FirebaseRemoteConfig(Context context) {
        this(context, null, null, null, null);
    }

    private FirebaseRemoteConfig(Context context, zzbto com_google_android_gms_internal_zzbto, zzbto com_google_android_gms_internal_zzbto2, zzbto com_google_android_gms_internal_zzbto3, zzbtr com_google_android_gms_internal_zzbtr) {
        this.zzclR = new ReentrantReadWriteLock(true);
        this.mContext = context;
        if (com_google_android_gms_internal_zzbtr != null) {
            this.zzclQ = com_google_android_gms_internal_zzbtr;
        } else {
            this.zzclQ = new zzbtr();
        }
        this.zzclQ.zzaV(zzcA(this.mContext));
        if (com_google_android_gms_internal_zzbto != null) {
            this.zzclN = com_google_android_gms_internal_zzbto;
        }
        if (com_google_android_gms_internal_zzbto2 != null) {
            this.zzclO = com_google_android_gms_internal_zzbto2;
        }
        if (com_google_android_gms_internal_zzbto3 != null) {
            this.zzclP = com_google_android_gms_internal_zzbto3;
        }
    }

    public static FirebaseRemoteConfig getInstance() {
        if (zzclM != null) {
            return zzclM;
        }
        FirebaseApp instance = FirebaseApp.getInstance();
        if (instance != null) {
            return zzcz(instance.getApplicationContext());
        }
        throw new IllegalStateException("FirebaseApp has not been initialized.");
    }

    private static zzbto zza(zza com_google_android_gms_internal_zzbts_zza) {
        int i = 0;
        if (com_google_android_gms_internal_zzbts_zza == null) {
            return null;
        }
        Map hashMap = new HashMap();
        for (zzd com_google_android_gms_internal_zzbts_zzd : com_google_android_gms_internal_zzbts_zza.zzcmi) {
            String str = com_google_android_gms_internal_zzbts_zzd.zzaGP;
            Map hashMap2 = new HashMap();
            for (zzb com_google_android_gms_internal_zzbts_zzb : com_google_android_gms_internal_zzbts_zzd.zzcmq) {
                hashMap2.put(com_google_android_gms_internal_zzbts_zzb.zzaB, com_google_android_gms_internal_zzbts_zzb.zzcml);
            }
            hashMap.put(str, hashMap2);
        }
        byte[][] bArr = com_google_android_gms_internal_zzbts_zza.zzcmj;
        List arrayList = new ArrayList();
        int length = bArr.length;
        while (i < length) {
            arrayList.add(bArr[i]);
            i++;
        }
        return new zzbto(hashMap, com_google_android_gms_internal_zzbts_zza.timestamp, arrayList);
    }

    private static zzbtr zza(zzc com_google_android_gms_internal_zzbts_zzc) {
        if (com_google_android_gms_internal_zzbts_zzc == null) {
            return null;
        }
        zzbtr com_google_android_gms_internal_zzbtr = new zzbtr();
        com_google_android_gms_internal_zzbtr.zzqI(com_google_android_gms_internal_zzbts_zzc.zzcmm);
        com_google_android_gms_internal_zzbtr.zzbh(com_google_android_gms_internal_zzbts_zzc.zzcmn);
        com_google_android_gms_internal_zzbtr.zzaW(com_google_android_gms_internal_zzbts_zzc.zzcmo);
        return com_google_android_gms_internal_zzbtr;
    }

    private static Map<String, zzbtl> zza(zzf[] com_google_android_gms_internal_zzbts_zzfArr) {
        Map hashMap = new HashMap();
        if (com_google_android_gms_internal_zzbts_zzfArr != null) {
            for (zzf com_google_android_gms_internal_zzbts_zzf : com_google_android_gms_internal_zzbts_zzfArr) {
                hashMap.put(com_google_android_gms_internal_zzbts_zzf.zzaGP, new zzbtl(com_google_android_gms_internal_zzbts_zzf.resourceId, com_google_android_gms_internal_zzbts_zzf.zzcmx));
            }
        }
        return hashMap;
    }

    private void zza(Context context, List<byte[]> list, long j) {
        zzt(new zzbtm(context, list, j));
    }

    private void zzacb() {
        this.zzclR.readLock().lock();
        try {
            zzt(new zzbtn(this.mContext, this.zzclN, this.zzclO, this.zzclP, this.zzclQ));
        } finally {
            this.zzclR.readLock().unlock();
        }
    }

    private static long zzb(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    private void zzc(Map<String, Object> map, String str, boolean z) {
        if (str != null) {
            Object obj = (map == null || map.isEmpty()) ? 1 : null;
            Map hashMap = new HashMap();
            if (obj == null) {
                for (String str2 : map.keySet()) {
                    Object obj2 = map.get(str2);
                    if (obj2 instanceof String) {
                        hashMap.put(str2, ((String) obj2).getBytes(zzbtq.UTF_8));
                    } else if (obj2 instanceof Long) {
                        hashMap.put(str2, ((Long) obj2).toString().getBytes(zzbtq.UTF_8));
                    } else if (obj2 instanceof Integer) {
                        hashMap.put(str2, ((Integer) obj2).toString().getBytes(zzbtq.UTF_8));
                    } else if (obj2 instanceof Double) {
                        hashMap.put(str2, ((Double) obj2).toString().getBytes(zzbtq.UTF_8));
                    } else if (obj2 instanceof Float) {
                        hashMap.put(str2, ((Float) obj2).toString().getBytes(zzbtq.UTF_8));
                    } else if (obj2 instanceof byte[]) {
                        hashMap.put(str2, (byte[]) obj2);
                    } else if (obj2 instanceof Boolean) {
                        hashMap.put(str2, ((Boolean) obj2).toString().getBytes(zzbtq.UTF_8));
                    } else {
                        throw new IllegalArgumentException("The type of a default value needs to beone of String, Long, Double, Boolean, or byte[].");
                    }
                }
            }
            this.zzclR.writeLock().lock();
            if (obj != null) {
                try {
                    if (this.zzclP == null || !this.zzclP.zzjF(str)) {
                        this.zzclR.writeLock().unlock();
                        return;
                    } else {
                        this.zzclP.zzj(null, str);
                        this.zzclP.setTimestamp(System.currentTimeMillis());
                    }
                } catch (Throwable th) {
                    this.zzclR.writeLock().unlock();
                }
            } else {
                if (this.zzclP == null) {
                    this.zzclP = new zzbto(new HashMap(), System.currentTimeMillis(), null);
                }
                this.zzclP.zzj(hashMap, str);
                this.zzclP.setTimestamp(System.currentTimeMillis());
            }
            if (z) {
                this.zzclQ.zzjG(str);
            }
            zzacb();
            this.zzclR.writeLock().unlock();
        }
    }

    private long zzcA(Context context) {
        long j = 0;
        try {
            return this.mContext.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(context.getPackageName());
            Log.e("FirebaseRemoteConfig", new StringBuilder(String.valueOf(valueOf).length() + 25).append("Package [").append(valueOf).append("] was not found!").toString());
            return j;
        }
    }

    private static zze zzcB(Context context) {
        FileInputStream openFileInput;
        Throwable e;
        Throwable e2;
        if (context == null) {
            return null;
        }
        try {
            openFileInput = context.openFileInput("persisted_config");
            try {
                zzbxl zzaf = zzbxl.zzaf(zzk(openFileInput));
                zze com_google_android_gms_internal_zzbts_zze = new zze();
                com_google_android_gms_internal_zzbts_zze.zzb(zzaf);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (Throwable e3) {
                        Log.e("FirebaseRemoteConfig", "Failed to close persisted config file.", e3);
                    }
                }
                return com_google_android_gms_internal_zzbts_zze;
            } catch (FileNotFoundException e4) {
                e2 = e4;
                try {
                    if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                        Log.d("FirebaseRemoteConfig", "Persisted config file was not found.", e2);
                    }
                    if (openFileInput != null) {
                        return null;
                    }
                    try {
                        openFileInput.close();
                        return null;
                    } catch (Throwable e22) {
                        Log.e("FirebaseRemoteConfig", "Failed to close persisted config file.", e22);
                        return null;
                    }
                } catch (Throwable th) {
                    e3 = th;
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (Throwable e222) {
                            Log.e("FirebaseRemoteConfig", "Failed to close persisted config file.", e222);
                        }
                    }
                    throw e3;
                }
            } catch (IOException e5) {
                e222 = e5;
                Log.e("FirebaseRemoteConfig", "Cannot initialize from persisted config.", e222);
                if (openFileInput != null) {
                    return null;
                }
                try {
                    openFileInput.close();
                    return null;
                } catch (Throwable e2222) {
                    Log.e("FirebaseRemoteConfig", "Failed to close persisted config file.", e2222);
                    return null;
                }
            }
        } catch (FileNotFoundException e6) {
            e2222 = e6;
            openFileInput = null;
            if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                Log.d("FirebaseRemoteConfig", "Persisted config file was not found.", e2222);
            }
            if (openFileInput != null) {
                return null;
            }
            openFileInput.close();
            return null;
        } catch (IOException e7) {
            e2222 = e7;
            openFileInput = null;
            Log.e("FirebaseRemoteConfig", "Cannot initialize from persisted config.", e2222);
            if (openFileInput != null) {
                return null;
            }
            openFileInput.close();
            return null;
        } catch (Throwable e22222) {
            openFileInput = null;
            e3 = e22222;
            if (openFileInput != null) {
                openFileInput.close();
            }
            throw e3;
        }
    }

    public static FirebaseRemoteConfig zzcz(Context context) {
        if (zzclM == null) {
            zze zzcB = zzcB(context);
            if (zzcB == null) {
                if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                    Log.d("FirebaseRemoteConfig", "No persisted config was found. Initializing from scratch.");
                }
                zzclM = new FirebaseRemoteConfig(context);
            } else {
                if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                    Log.d("FirebaseRemoteConfig", "Initializing from persisted config.");
                }
                zzbto zza = zza(zzcB.zzcmr);
                zzbto zza2 = zza(zzcB.zzcms);
                zzbto zza3 = zza(zzcB.zzcmt);
                zzbtr zza4 = zza(zzcB.zzcmu);
                if (zza4 != null) {
                    zza4.zzaI(zza(zzcB.zzcmv));
                }
                zzclM = new FirebaseRemoteConfig(context, zza, zza2, zza3, zza4);
            }
        }
        return zzclM;
    }

    private static byte[] zzk(InputStream inputStream) throws IOException {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzb(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private void zzt(Runnable runnable) {
        int i = VERSION.SDK_INT;
        AsyncTask.SERIAL_EXECUTOR.execute(runnable);
    }

    public boolean activateFetched() {
        this.zzclR.writeLock().lock();
        try {
            if (this.zzclN == null) {
                return false;
            }
            if (this.zzclO == null || this.zzclO.getTimestamp() < this.zzclN.getTimestamp()) {
                long timestamp = this.zzclN.getTimestamp();
                this.zzclO = this.zzclN;
                this.zzclO.setTimestamp(System.currentTimeMillis());
                this.zzclN = new zzbto(null, timestamp, null);
                timestamp = this.zzclQ.zzacj();
                this.zzclQ.zzaW(zzblq.zza(timestamp, this.zzclO.zzzD()));
                zza(this.mContext, this.zzclO.zzzD(), timestamp);
                zzacb();
                this.zzclR.writeLock().unlock();
                return true;
            }
            this.zzclR.writeLock().unlock();
            return false;
        } finally {
            this.zzclR.writeLock().unlock();
        }
    }

    public Task<Void> fetch() {
        return fetch(43200);
    }

    public Task<Void> fetch(long j) {
        int i = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zzclR.readLock().lock();
        try {
            long convert;
            zzadi.zza.zza com_google_android_gms_internal_zzadi_zza_zza = new zzadi.zza.zza();
            com_google_android_gms_internal_zzadi_zza_zza.zzK(j);
            if (this.zzclQ.isDeveloperModeEnabled()) {
                com_google_android_gms_internal_zzadi_zza_zza.zzH("_rcn_developer", "true");
            }
            com_google_android_gms_internal_zzadi_zza_zza.zzdr(10300);
            if (!(this.zzclO == null || this.zzclO.getTimestamp() == -1)) {
                convert = TimeUnit.SECONDS.convert(System.currentTimeMillis() - this.zzclO.getTimestamp(), TimeUnit.MILLISECONDS);
                com_google_android_gms_internal_zzadi_zza_zza.zzdt(convert < 2147483647L ? (int) convert : ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            }
            if (!(this.zzclN == null || this.zzclN.getTimestamp() == -1)) {
                convert = TimeUnit.SECONDS.convert(System.currentTimeMillis() - this.zzclN.getTimestamp(), TimeUnit.MILLISECONDS);
                if (convert < 2147483647L) {
                    i = (int) convert;
                }
                com_google_android_gms_internal_zzadi_zza_zza.zzds(i);
            }
            new zzado(this.mContext).zza(com_google_android_gms_internal_zzadi_zza_zza.zzzC()).setResultCallback(new ResultCallback<zzadi.zzb>(this) {
                final /* synthetic */ FirebaseRemoteConfig zzclT;

                public /* synthetic */ void onResult(@NonNull Result result) {
                    zza((zzadi.zzb) result);
                }

                public void zza(@NonNull zzadi.zzb com_google_android_gms_internal_zzadi_zzb) {
                    this.zzclT.zza(taskCompletionSource, com_google_android_gms_internal_zzadi_zzb);
                }
            });
            return taskCompletionSource.getTask();
        } finally {
            this.zzclR.readLock().unlock();
        }
    }

    public boolean getBoolean(String str) {
        return getBoolean(str, "configns:firebase");
    }

    public boolean getBoolean(String str, String str2) {
        Lock lock = true;
        if (str2 == null) {
            return false;
        }
        this.zzclR.readLock().lock();
        try {
            CharSequence str3;
            if (this.zzclO != null && this.zzclO.zzaA(str, str2)) {
                str3 = new String(this.zzclO.zzaB(str, str2), zzbtq.UTF_8);
                if (zzbtq.zzaII.matcher(str3).matches()) {
                    return lock;
                }
                if (zzbtq.zzaIJ.matcher(str3).matches()) {
                    this.zzclR.readLock().unlock();
                    return false;
                }
            }
            if (this.zzclP != null && this.zzclP.zzaA(str, str2)) {
                str3 = new String(this.zzclP.zzaB(str, str2), zzbtq.UTF_8);
                if (zzbtq.zzaII.matcher(str3).matches()) {
                    this.zzclR.readLock().unlock();
                    return true;
                } else if (zzbtq.zzaIJ.matcher(str3).matches()) {
                    this.zzclR.readLock().unlock();
                    return false;
                }
            }
            this.zzclR.readLock().unlock();
            return false;
        } finally {
            lock = this.zzclR.readLock();
            lock.unlock();
        }
    }

    public byte[] getByteArray(String str) {
        return getByteArray(str, "configns:firebase");
    }

    public byte[] getByteArray(String str, String str2) {
        if (str2 == null) {
            return DEFAULT_VALUE_FOR_BYTE_ARRAY;
        }
        this.zzclR.readLock().lock();
        byte[] bArr;
        if (this.zzclO == null || !this.zzclO.zzaA(str, str2)) {
            try {
                if (this.zzclP == null || !this.zzclP.zzaA(str, str2)) {
                    bArr = DEFAULT_VALUE_FOR_BYTE_ARRAY;
                    this.zzclR.readLock().unlock();
                    return bArr;
                }
                bArr = this.zzclP.zzaB(str, str2);
                this.zzclR.readLock().unlock();
                return bArr;
            } finally {
                this.zzclR.readLock().unlock();
            }
        } else {
            bArr = this.zzclO.zzaB(str, str2);
            return bArr;
        }
    }

    public double getDouble(String str) {
        return getDouble(str, "configns:firebase");
    }

    public double getDouble(String str, String str2) {
        double d = 0.0d;
        if (str2 != null) {
            this.zzclR.readLock().lock();
            try {
                if (this.zzclO != null && this.zzclO.zzaA(str, str2)) {
                    try {
                        d = Double.valueOf(new String(this.zzclO.zzaB(str, str2), zzbtq.UTF_8)).doubleValue();
                    } catch (NumberFormatException e) {
                    }
                }
                if (this.zzclP != null && this.zzclP.zzaA(str, str2)) {
                    try {
                        d = Double.valueOf(new String(this.zzclP.zzaB(str, str2), zzbtq.UTF_8)).doubleValue();
                        this.zzclR.readLock().unlock();
                    } catch (NumberFormatException e2) {
                    }
                }
                this.zzclR.readLock().unlock();
            } finally {
                this.zzclR.readLock().unlock();
            }
        }
        return d;
    }

    public FirebaseRemoteConfigInfo getInfo() {
        FirebaseRemoteConfigInfo com_google_android_gms_internal_zzbtp = new zzbtp();
        this.zzclR.readLock().lock();
        try {
            com_google_android_gms_internal_zzbtp.zzaU(this.zzclN == null ? -1 : this.zzclN.getTimestamp());
            com_google_android_gms_internal_zzbtp.zzqI(this.zzclQ.getLastFetchStatus());
            com_google_android_gms_internal_zzbtp.setConfigSettings(new Builder().setDeveloperModeEnabled(this.zzclQ.isDeveloperModeEnabled()).build());
            return com_google_android_gms_internal_zzbtp;
        } finally {
            this.zzclR.readLock().unlock();
        }
    }

    public Set<String> getKeysByPrefix(String str) {
        return getKeysByPrefix(str, "configns:firebase");
    }

    public Set<String> getKeysByPrefix(String str, String str2) {
        this.zzclR.readLock().lock();
        try {
            Set<String> treeSet;
            if (this.zzclO == null) {
                treeSet = new TreeSet();
            } else {
                treeSet = this.zzclO.zzaC(str, str2);
                this.zzclR.readLock().unlock();
            }
            return treeSet;
        } finally {
            this.zzclR.readLock().unlock();
        }
    }

    public long getLong(String str) {
        return getLong(str, "configns:firebase");
    }

    public long getLong(String str, String str2) {
        long j = 0;
        if (str2 != null) {
            this.zzclR.readLock().lock();
            try {
                if (this.zzclO != null && this.zzclO.zzaA(str, str2)) {
                    try {
                        j = Long.valueOf(new String(this.zzclO.zzaB(str, str2), zzbtq.UTF_8)).longValue();
                    } catch (NumberFormatException e) {
                    }
                }
                if (this.zzclP != null && this.zzclP.zzaA(str, str2)) {
                    try {
                        j = Long.valueOf(new String(this.zzclP.zzaB(str, str2), zzbtq.UTF_8)).longValue();
                        this.zzclR.readLock().unlock();
                    } catch (NumberFormatException e2) {
                    }
                }
                this.zzclR.readLock().unlock();
            } finally {
                this.zzclR.readLock().unlock();
            }
        }
        return j;
    }

    public String getString(String str) {
        return getString(str, "configns:firebase");
    }

    public String getString(String str, String str2) {
        if (str2 == null) {
            return "";
        }
        this.zzclR.readLock().lock();
        String str3;
        if (this.zzclO == null || !this.zzclO.zzaA(str, str2)) {
            try {
                if (this.zzclP == null || !this.zzclP.zzaA(str, str2)) {
                    str3 = "";
                    this.zzclR.readLock().unlock();
                    return str3;
                }
                str3 = new String(this.zzclP.zzaB(str, str2), zzbtq.UTF_8);
                this.zzclR.readLock().unlock();
                return str3;
            } finally {
                this.zzclR.readLock().unlock();
            }
        } else {
            str3 = new String(this.zzclO.zzaB(str, str2), zzbtq.UTF_8);
            return str3;
        }
    }

    public FirebaseRemoteConfigValue getValue(String str) {
        return getValue(str, "configns:firebase");
    }

    public FirebaseRemoteConfigValue getValue(String str, String str2) {
        if (str2 == null) {
            return new zzbtq(DEFAULT_VALUE_FOR_BYTE_ARRAY, 0);
        }
        this.zzclR.readLock().lock();
        FirebaseRemoteConfigValue com_google_android_gms_internal_zzbtq;
        if (this.zzclO == null || !this.zzclO.zzaA(str, str2)) {
            try {
                if (this.zzclP == null || !this.zzclP.zzaA(str, str2)) {
                    com_google_android_gms_internal_zzbtq = new zzbtq(DEFAULT_VALUE_FOR_BYTE_ARRAY, 0);
                    this.zzclR.readLock().unlock();
                    return com_google_android_gms_internal_zzbtq;
                }
                com_google_android_gms_internal_zzbtq = new zzbtq(this.zzclP.zzaB(str, str2), 1);
                this.zzclR.readLock().unlock();
                return com_google_android_gms_internal_zzbtq;
            } finally {
                this.zzclR.readLock().unlock();
            }
        } else {
            com_google_android_gms_internal_zzbtq = new zzbtq(this.zzclO.zzaB(str, str2), 2);
            return com_google_android_gms_internal_zzbtq;
        }
    }

    public void setConfigSettings(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.zzclR.writeLock().lock();
        try {
            boolean isDeveloperModeEnabled = this.zzclQ.isDeveloperModeEnabled();
            boolean isDeveloperModeEnabled2 = firebaseRemoteConfigSettings == null ? false : firebaseRemoteConfigSettings.isDeveloperModeEnabled();
            this.zzclQ.zzbh(isDeveloperModeEnabled2);
            if (isDeveloperModeEnabled != isDeveloperModeEnabled2) {
                zzacb();
            }
            this.zzclR.writeLock().unlock();
        } catch (Throwable th) {
            this.zzclR.writeLock().unlock();
        }
    }

    public void setDefaults(int i) {
        setDefaults(i, "configns:firebase");
    }

    public void setDefaults(int i, String str) {
        if (str != null) {
            this.zzclR.readLock().lock();
            try {
                if (!(this.zzclQ == null || this.zzclQ.zzach() == null || this.zzclQ.zzach().get(str) == null)) {
                    zzbtl com_google_android_gms_internal_zzbtl = (zzbtl) this.zzclQ.zzach().get(str);
                    if (i == com_google_android_gms_internal_zzbtl.zzacc() && this.zzclQ.zzaci() == com_google_android_gms_internal_zzbtl.zzacd()) {
                        if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                            Log.d("FirebaseRemoteConfig", "Skipped setting defaults from resource file as this resource file was already applied.");
                        }
                        this.zzclR.readLock().unlock();
                        return;
                    }
                }
                this.zzclR.readLock().unlock();
                Map hashMap = new HashMap();
                try {
                    XmlResourceParser xml = this.mContext.getResources().getXml(i);
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                        if (eventType == 2) {
                            obj2 = xml.getName();
                        } else if (eventType == 3) {
                            if (!(!"entry".equals(xml.getName()) || obj == null || obj3 == null)) {
                                hashMap.put(obj, obj3);
                                obj3 = null;
                                obj = null;
                            }
                            obj2 = null;
                        } else if (eventType == 4) {
                            if ("key".equals(obj2)) {
                                obj = xml.getText();
                            } else if (Param.VALUE.equals(obj2)) {
                                obj3 = xml.getText();
                            }
                        }
                    }
                    this.zzclQ.zza(str, new zzbtl(i, this.zzclQ.zzaci()));
                    zzc(hashMap, str, false);
                } catch (Throwable e) {
                    Log.e("FirebaseRemoteConfig", "Caught exception while parsing XML resource. Skipping setDefaults.", e);
                }
            } catch (Throwable th) {
                this.zzclR.readLock().unlock();
            }
        } else if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
            Log.d("FirebaseRemoteConfig", "namespace cannot be null for setDefaults.");
        }
    }

    public void setDefaults(Map<String, Object> map) {
        setDefaults((Map) map, "configns:firebase");
    }

    public void setDefaults(Map<String, Object> map, String str) {
        zzc(map, str, true);
    }

    @VisibleForTesting
    void zza(TaskCompletionSource<Void> taskCompletionSource, zzadi.zzb com_google_android_gms_internal_zzadi_zzb) {
        if (com_google_android_gms_internal_zzadi_zzb == null || com_google_android_gms_internal_zzadi_zzb.getStatus() == null) {
            this.zzclQ.zzqI(1);
            taskCompletionSource.setException(new FirebaseRemoteConfigFetchException());
            zzacb();
            return;
        }
        int statusCode = com_google_android_gms_internal_zzadi_zzb.getStatus().getStatusCode();
        this.zzclR.writeLock().lock();
        Map zzzE;
        Map hashMap;
        Map hashMap2;
        switch (statusCode) {
            case -6508:
            case -6506:
                this.zzclQ.zzqI(-1);
                if (!(this.zzclN == null || this.zzclN.zzacf())) {
                    zzzE = com_google_android_gms_internal_zzadi_zzb.zzzE();
                    hashMap = new HashMap();
                    for (String str : zzzE.keySet()) {
                        hashMap2 = new HashMap();
                        for (String str2 : (Set) zzzE.get(str)) {
                            hashMap2.put(str2, com_google_android_gms_internal_zzadi_zzb.zza(str2, null, str));
                        }
                        hashMap.put(str, hashMap2);
                    }
                    this.zzclN = new zzbto(hashMap, this.zzclN.getTimestamp(), com_google_android_gms_internal_zzadi_zzb.zzzD());
                }
                taskCompletionSource.setResult(null);
                zzacb();
                break;
            case -6505:
                zzzE = com_google_android_gms_internal_zzadi_zzb.zzzE();
                hashMap = new HashMap();
                for (String str3 : zzzE.keySet()) {
                    hashMap2 = new HashMap();
                    for (String str22 : (Set) zzzE.get(str3)) {
                        hashMap2.put(str22, com_google_android_gms_internal_zzadi_zzb.zza(str22, null, str3));
                    }
                    hashMap.put(str3, hashMap2);
                }
                this.zzclN = new zzbto(hashMap, System.currentTimeMillis(), com_google_android_gms_internal_zzadi_zzb.zzzD());
                this.zzclQ.zzqI(-1);
                taskCompletionSource.setResult(null);
                zzacb();
                break;
            case 6500:
            case 6501:
            case 6503:
            case 6504:
                this.zzclQ.zzqI(1);
                taskCompletionSource.setException(new FirebaseRemoteConfigFetchException());
                zzacb();
                break;
            case 6502:
            case 6507:
                this.zzclQ.zzqI(2);
                taskCompletionSource.setException(new FirebaseRemoteConfigFetchThrottledException(com_google_android_gms_internal_zzadi_zzb.getThrottleEndTimeMillis()));
                zzacb();
                break;
            default:
                try {
                    if (com_google_android_gms_internal_zzadi_zzb.getStatus().isSuccess()) {
                        Log.w("FirebaseRemoteConfig", "Unknown (successful) status code: " + statusCode);
                    }
                    this.zzclQ.zzqI(1);
                    taskCompletionSource.setException(new FirebaseRemoteConfigFetchException());
                    zzacb();
                    break;
                } catch (Throwable th) {
                    this.zzclR.writeLock().unlock();
                }
        }
        this.zzclR.writeLock().unlock();
    }
}
