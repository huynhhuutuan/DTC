package com.google.firebase.database;

import com.google.android.gms.internal.zzboy;
import com.google.android.gms.internal.zzbpb;
import com.google.android.gms.internal.zzbph;
import com.google.android.gms.internal.zzbpj;
import com.google.android.gms.internal.zzbpl;
import com.google.android.gms.internal.zzbpw;
import com.google.android.gms.internal.zzbrq;
import com.google.android.gms.internal.zzbsc;
import com.google.android.gms.internal.zzbsd;
import com.google.android.gms.internal.zzbsg;
import com.google.android.gms.internal.zzbtb;
import com.google.android.gms.internal.zzbtd;
import com.google.android.gms.internal.zzbte;
import com.google.android.gms.internal.zzbtf;
import com.google.android.gms.internal.zzbtg;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.Transaction.Handler;
import java.net.URLEncoder;
import java.util.Map;

public class DatabaseReference extends Query {
    private static zzbpb zzbZQ;

    public interface CompletionListener {
        void onComplete(DatabaseError databaseError, DatabaseReference databaseReference);
    }

    DatabaseReference(zzbpj com_google_android_gms_internal_zzbpj, zzbph com_google_android_gms_internal_zzbph) {
        super(com_google_android_gms_internal_zzbpj, com_google_android_gms_internal_zzbph);
    }

    public static void goOffline() {
        zza(zzWF());
    }

    public static void goOnline() {
        zzb(zzWF());
    }

    private static synchronized zzbpb zzWF() {
        zzbpb com_google_android_gms_internal_zzbpb;
        synchronized (DatabaseReference.class) {
            if (zzbZQ == null) {
                zzbZQ = new zzbpb();
            }
            com_google_android_gms_internal_zzbpb = zzbZQ;
        }
        return com_google_android_gms_internal_zzbpb;
    }

    private Task<Void> zza(final zzbsc com_google_android_gms_internal_zzbsc, CompletionListener completionListener) {
        zzbtf.zzQ(zzWL());
        final zzbtb zzb = zzbte.zzb(completionListener);
        this.zzcad.zzs(new Runnable(this) {
            final /* synthetic */ DatabaseReference zzbZT;

            public void run() {
                this.zzbZT.zzcad.zza(this.zzbZT.zzWL().zza(zzbrq.zzaaH()), com_google_android_gms_internal_zzbsc, (CompletionListener) zzb.zzabI());
            }
        });
        return (Task) zzb.getFirst();
    }

    private Task<Void> zza(Object obj, zzbsc com_google_android_gms_internal_zzbsc, CompletionListener completionListener) {
        zzbtf.zzQ(zzWL());
        zzbpw.zza(zzWL(), obj);
        Object zzay = zzbtg.zzay(obj);
        zzbtf.zzax(zzay);
        final zzbsc zza = zzbsd.zza(zzay, com_google_android_gms_internal_zzbsc);
        final zzbtb zzb = zzbte.zzb(completionListener);
        this.zzcad.zzs(new Runnable(this) {
            final /* synthetic */ DatabaseReference zzbZT;

            public void run() {
                this.zzbZT.zzcad.zza(this.zzbZT.zzWL(), zza, (CompletionListener) zzb.zzabI());
            }
        });
        return (Task) zzb.getFirst();
    }

    private Task<Void> zza(Map<String, Object> map, CompletionListener completionListener) {
        if (map == null) {
            throw new NullPointerException("Can't pass null for argument 'update' in updateChildren()");
        }
        final Map zzaG = zzbtg.zzaG((Map) map);
        final zzboy zzaC = zzboy.zzaC(zzbtf.zzc(zzWL(), zzaG));
        final zzbtb zzb = zzbte.zzb(completionListener);
        this.zzcad.zzs(new Runnable(this) {
            final /* synthetic */ DatabaseReference zzbZT;

            public void run() {
                this.zzbZT.zzcad.zza(this.zzbZT.zzWL(), zzaC, (CompletionListener) zzb.zzabI(), zzaG);
            }
        });
        return (Task) zzb.getFirst();
    }

    static void zza(zzbpb com_google_android_gms_internal_zzbpb) {
        zzbpl.zzd(com_google_android_gms_internal_zzbpb);
    }

    static void zzb(zzbpb com_google_android_gms_internal_zzbpb) {
        zzbpl.zze(com_google_android_gms_internal_zzbpb);
    }

    public DatabaseReference child(String str) {
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'pathString' in child()");
        }
        if (zzWL().isEmpty()) {
            zzbtf.zzjm(str);
        } else {
            zzbtf.zzjl(str);
        }
        return new DatabaseReference(this.zzcad, zzWL().zzh(new zzbph(str)));
    }

    public boolean equals(Object obj) {
        return (obj instanceof DatabaseReference) && toString().equals(obj.toString());
    }

    public FirebaseDatabase getDatabase() {
        return this.zzcad.getDatabase();
    }

    public String getKey() {
        return zzWL().isEmpty() ? null : zzWL().zzYU().asString();
    }

    public DatabaseReference getParent() {
        zzbph zzYT = zzWL().zzYT();
        return zzYT != null ? new DatabaseReference(this.zzcad, zzYT) : null;
    }

    public DatabaseReference getRoot() {
        return new DatabaseReference(this.zzcad, new zzbph(""));
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public OnDisconnect onDisconnect() {
        zzbtf.zzQ(zzWL());
        return new OnDisconnect(this.zzcad, zzWL());
    }

    public DatabaseReference push() {
        return new DatabaseReference(this.zzcad, zzWL().zza(zzbrq.zzja(zzbtd.zzaT(this.zzcad.zzYY()))));
    }

    public Task<Void> removeValue() {
        return setValue(null);
    }

    public void removeValue(CompletionListener completionListener) {
        setValue(null, completionListener);
    }

    public void runTransaction(Handler handler) {
        runTransaction(handler, true);
    }

    public void runTransaction(final Handler handler, final boolean z) {
        if (handler == null) {
            throw new NullPointerException("Can't pass null for argument 'handler' in runTransaction()");
        }
        zzbtf.zzQ(zzWL());
        this.zzcad.zzs(new Runnable(this) {
            final /* synthetic */ DatabaseReference zzbZT;

            public void run() {
                this.zzbZT.zzcad.zza(this.zzbZT.zzWL(), handler, z);
            }
        });
    }

    public Task<Void> setPriority(Object obj) {
        return zza(zzbsg.zzau(obj), null);
    }

    public void setPriority(Object obj, CompletionListener completionListener) {
        zza(zzbsg.zzau(obj), completionListener);
    }

    public Task<Void> setValue(Object obj) {
        return zza(obj, zzbsg.zzau(null), null);
    }

    public Task<Void> setValue(Object obj, Object obj2) {
        return zza(obj, zzbsg.zzau(obj2), null);
    }

    public void setValue(Object obj, CompletionListener completionListener) {
        zza(obj, zzbsg.zzau(null), completionListener);
    }

    public void setValue(Object obj, Object obj2, CompletionListener completionListener) {
        zza(obj, zzbsg.zzau(obj2), completionListener);
    }

    public String toString() {
        DatabaseReference parent = getParent();
        if (parent == null) {
            return this.zzcad.toString();
        }
        String valueOf;
        try {
            valueOf = String.valueOf(parent.toString());
            String valueOf2 = String.valueOf(URLEncoder.encode(getKey(), "UTF-8").replace("+", "%20"));
            return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("/").append(valueOf2).toString();
        } catch (Throwable e) {
            Throwable th = e;
            String str = "Failed to URLEncode key: ";
            valueOf = String.valueOf(getKey());
            throw new DatabaseException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
        }
    }

    public Task<Void> updateChildren(Map<String, Object> map) {
        return zza((Map) map, null);
    }

    public void updateChildren(Map<String, Object> map, CompletionListener completionListener) {
        zza((Map) map, completionListener);
    }
}
