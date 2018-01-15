package com.google.firebase.database;

import android.text.TextUtils;
import com.google.android.gms.internal.zzbpb;
import com.google.android.gms.internal.zzbph;
import com.google.android.gms.internal.zzbpj;
import com.google.android.gms.internal.zzbpk;
import com.google.android.gms.internal.zzbpl;
import com.google.android.gms.internal.zzbtc;
import com.google.android.gms.internal.zzbte;
import com.google.android.gms.internal.zzbtf;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.Logger.Level;
import java.util.HashMap;
import java.util.Map;

public class FirebaseDatabase {
    private static final Map<String, Map<zzbpk, FirebaseDatabase>> zzbZZ = new HashMap();
    private final FirebaseApp zzcaa;
    private final zzbpk zzcab;
    private final zzbpb zzcac;
    private zzbpj zzcad;

    class C07211 implements Runnable {
        final /* synthetic */ FirebaseDatabase zzcae;

        C07211(FirebaseDatabase firebaseDatabase) {
            this.zzcae = firebaseDatabase;
        }

        public void run() {
            this.zzcae.zzcad.purgeOutstandingWrites();
        }
    }

    private FirebaseDatabase(FirebaseApp firebaseApp, zzbpk com_google_android_gms_internal_zzbpk, zzbpb com_google_android_gms_internal_zzbpb) {
        this.zzcaa = firebaseApp;
        this.zzcab = com_google_android_gms_internal_zzbpk;
        this.zzcac = com_google_android_gms_internal_zzbpb;
    }

    public static FirebaseDatabase getInstance() {
        FirebaseApp instance = FirebaseApp.getInstance();
        if (instance != null) {
            return getInstance(instance, instance.getOptions().getDatabaseUrl());
        }
        throw new DatabaseException("You must call FirebaseApp.initialize() first.");
    }

    public static FirebaseDatabase getInstance(FirebaseApp firebaseApp) {
        return getInstance(firebaseApp, firebaseApp.getOptions().getDatabaseUrl());
    }

    public static synchronized FirebaseDatabase getInstance(FirebaseApp firebaseApp, String str) {
        FirebaseDatabase firebaseDatabase;
        synchronized (FirebaseDatabase.class) {
            if (TextUtils.isEmpty(str)) {
                throw new DatabaseException("Failed to get FirebaseDatabase instance: Specify DatabaseURL within FirebaseApp or from your getInstance() call.");
            }
            Map map;
            Map map2 = (Map) zzbZZ.get(firebaseApp.getName());
            if (map2 == null) {
                HashMap hashMap = new HashMap();
                zzbZZ.put(firebaseApp.getName(), hashMap);
                map = hashMap;
            } else {
                map = map2;
            }
            zzbtc zzjg = zzbte.zzjg(str);
            if (zzjg.zzcak.isEmpty()) {
                firebaseDatabase = (FirebaseDatabase) map.get(zzjg.zzcab);
                if (firebaseDatabase == null) {
                    zzbpb com_google_android_gms_internal_zzbpb = new zzbpb();
                    if (!firebaseApp.zzUU()) {
                        com_google_android_gms_internal_zzbpb.zziY(firebaseApp.getName());
                    }
                    com_google_android_gms_internal_zzbpb.zzf(firebaseApp);
                    firebaseDatabase = new FirebaseDatabase(firebaseApp, zzjg.zzcab, com_google_android_gms_internal_zzbpb);
                    map.put(zzjg.zzcab, firebaseDatabase);
                }
            } else {
                String valueOf = String.valueOf(zzjg.zzcak.toString());
                throw new DatabaseException(new StringBuilder((String.valueOf(str).length() + 113) + String.valueOf(valueOf).length()).append("Specified Database URL '").append(str).append("' is invalid. It should point to the root of a Firebase Database but it includes a path: ").append(valueOf).toString());
            }
        }
        return firebaseDatabase;
    }

    public static FirebaseDatabase getInstance(String str) {
        FirebaseApp instance = FirebaseApp.getInstance();
        if (instance != null) {
            return getInstance(instance, str);
        }
        throw new DatabaseException("You must call FirebaseApp.initialize() first.");
    }

    public static String getSdkVersion() {
        return "3.0.0";
    }

    private synchronized void zzWG() {
        if (this.zzcad == null) {
            this.zzcad = zzbpl.zza(this.zzcac, this.zzcab, this);
        }
    }

    private void zziE(String str) {
        if (this.zzcad != null) {
            throw new DatabaseException(new StringBuilder(String.valueOf(str).length() + 77).append("Calls to ").append(str).append("() must be made before any other usage of FirebaseDatabase instance.").toString());
        }
    }

    public FirebaseApp getApp() {
        return this.zzcaa;
    }

    public DatabaseReference getReference() {
        zzWG();
        return new DatabaseReference(this.zzcad, zzbph.zzYO());
    }

    public DatabaseReference getReference(String str) {
        zzWG();
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'pathString' in FirebaseDatabase.getReference()");
        }
        zzbtf.zzjm(str);
        return new DatabaseReference(this.zzcad, new zzbph(str));
    }

    public DatabaseReference getReferenceFromUrl(String str) {
        zzWG();
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'url' in FirebaseDatabase.getReferenceFromUrl()");
        }
        zzbtc zzjg = zzbte.zzjg(str);
        if (zzjg.zzcab.zzcbM.equals(this.zzcad.zzYX().zzcbM)) {
            return new DatabaseReference(this.zzcad, zzjg.zzcak);
        }
        String valueOf = String.valueOf(getReference().toString());
        throw new DatabaseException(new StringBuilder((String.valueOf(str).length() + 93) + String.valueOf(valueOf).length()).append("Invalid URL (").append(str).append(") passed to getReference().  URL was expected to match configured Database URL: ").append(valueOf).toString());
    }

    public void goOffline() {
        zzWG();
        zzbpl.zzk(this.zzcad);
    }

    public void goOnline() {
        zzWG();
        zzbpl.zzl(this.zzcad);
    }

    public void purgeOutstandingWrites() {
        zzWG();
        this.zzcad.zzs(new C07211(this));
    }

    public synchronized void setLogLevel(Level level) {
        zziE("setLogLevel");
        this.zzcac.setLogLevel(level);
    }

    public synchronized void setPersistenceCacheSizeBytes(long j) {
        zziE("setPersistenceCacheSizeBytes");
        this.zzcac.setPersistenceCacheSizeBytes(j);
    }

    public synchronized void setPersistenceEnabled(boolean z) {
        zziE("setPersistenceEnabled");
        this.zzcac.setPersistenceEnabled(z);
    }
}
