package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbro.zza;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.Logger.Level;

public class zzbpb extends zzbpa {
    public synchronized void setLogLevel(Level level) {
        zzYw();
        switch (level) {
            case DEBUG:
                this.zzcea = zza.DEBUG;
                break;
            case INFO:
                this.zzcea = zza.INFO;
                break;
            case WARN:
                this.zzcea = zza.WARN;
                break;
            case ERROR:
                this.zzcea = zza.ERROR;
                break;
            case NONE:
                this.zzcea = zza.NONE;
                break;
            default:
                String valueOf = String.valueOf(level);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 19).append("Unknown log level: ").append(valueOf).toString());
        }
    }

    public synchronized void setPersistenceCacheSizeBytes(long j) {
        zzYw();
        if (j < 1048576) {
            throw new DatabaseException("The minimum cache size must be at least 1MB");
        } else if (j > 104857600) {
            throw new DatabaseException("Firebase Database currently doesn't support a cache size larger than 100MB");
        } else {
            this.cacheSize = j;
        }
    }

    public synchronized void setPersistenceEnabled(boolean z) {
        zzYw();
        this.zzcbJ = z;
    }

    public synchronized void zzf(FirebaseApp firebaseApp) {
        this.zzcay = firebaseApp;
    }

    public synchronized void zziY(String str) {
        zzYw();
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Session identifier is not allowed to be empty or null!");
        }
        this.zzcdZ = str;
    }
}
