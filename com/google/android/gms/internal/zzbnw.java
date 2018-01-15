package com.google.android.gms.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import com.google.firebase.database.DatabaseException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzbnw implements zzbqm {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbnw.class.desiredAssertionStatus());
    private static final Charset zzawC = Charset.forName("UTF-8");
    private final SQLiteDatabase zzcaI;
    private final zzbrn zzcaJ;
    private boolean zzcaK;
    private long zzcaL = 0;

    private static class zza extends SQLiteOpenHelper {
        static final /* synthetic */ boolean $assertionsDisabled = (!zzbnw.class.desiredAssertionStatus());

        public zza(Context context, String str) {
            super(context, str, null, 2);
        }

        private void zzc(SQLiteDatabase sQLiteDatabase, String str) {
            String str2 = "DROP TABLE IF EXISTS ";
            String valueOf = String.valueOf(str);
            sQLiteDatabase.execSQL(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
            sQLiteDatabase.execSQL("CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));");
            sQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
            sQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (!$assertionsDisabled && i2 != 2) {
                throw new AssertionError("Why is onUpgrade() called with a different version?");
            } else if (i <= 1) {
                zzc(sQLiteDatabase, "serverCache");
                sQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
                zzc(sQLiteDatabase, "complete");
                sQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
                sQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
            } else {
                throw new AssertionError("We don't handle upgrading to " + i2);
            }
        }
    }

    public zzbnw(Context context, zzbpa com_google_android_gms_internal_zzbpa, String str) {
        try {
            String encode = URLEncoder.encode(str, "utf-8");
            this.zzcaJ = com_google_android_gms_internal_zzbpa.zziV("Persistence");
            this.zzcaI = zzP(context, encode);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private SQLiteDatabase zzP(Context context, String str) {
        try {
            SQLiteDatabase writableDatabase = new zza(context, str).getWritableDatabase();
            writableDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", null).close();
            writableDatabase.beginTransaction();
            writableDatabase.endTransaction();
            return writableDatabase;
        } catch (Throwable e) {
            if (e instanceof SQLiteDatabaseLockedException) {
                throw new DatabaseException("Failed to gain exclusive lock to Firebase Database's offline persistence. This generally means you are using Firebase Database from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing FirebaseDatabase in your Application class. If you are intentionally using Firebase Database from multiple processes, you can only enable offline persistence (i.e. call setPersistenceEnabled(true)) in one of them.", e);
            }
            throw e;
        }
    }

    private zzbsc zzV(byte[] bArr) {
        try {
            return zzbsd.zzat(zzbsv.zzjf(new String(bArr, zzawC)));
        } catch (Throwable e) {
            Throwable th = e;
            String str = "Could not deserialize node: ";
            String valueOf = String.valueOf(new String(bArr, zzawC));
            throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
        }
    }

    private byte[] zzV(List<byte[]> list) {
        int i = 0;
        for (byte[] length : list) {
            i = length.length + i;
        }
        Object obj = new byte[i];
        i = 0;
        for (byte[] length2 : list) {
            System.arraycopy(length2, 0, obj, i, length2.length);
            i = length2.length + i;
        }
        return obj;
    }

    private void zzWR() {
        zzbte.zzb(this.zzcaK, "Transaction expected to already be in progress.");
    }

    private int zza(zzbph com_google_android_gms_internal_zzbph, List<String> list, int i) {
        int i2 = i + 1;
        String zzc = zzc(com_google_android_gms_internal_zzbph);
        if (((String) list.get(i)).startsWith(zzc)) {
            while (i2 < list.size() && ((String) list.get(i2)).equals(zza(com_google_android_gms_internal_zzbph, i2 - i))) {
                i2++;
            }
            if (i2 < list.size()) {
                String str = (String) list.get(i2);
                String valueOf = String.valueOf(zzc);
                zzc = String.valueOf(".part-");
                if (str.startsWith(zzc.length() != 0 ? valueOf.concat(zzc) : new String(valueOf))) {
                    throw new IllegalStateException("Run did not finish with all parts");
                }
            }
            return i2 - i;
        }
        throw new IllegalStateException("Extracting split nodes needs to start with path prefix");
    }

    private int zza(String str, zzbph com_google_android_gms_internal_zzbph) {
        String zziG = zziG(zzc(com_google_android_gms_internal_zzbph));
        return this.zzcaI.delete(str, "path >= ? AND path < ?", new String[]{r1, zziG});
    }

    private Cursor zza(zzbph com_google_android_gms_internal_zzbph, String[] strArr) {
        String zzc = zzc(com_google_android_gms_internal_zzbph);
        String zziG = zziG(zzc);
        String[] strArr2 = new String[(com_google_android_gms_internal_zzbph.size() + 3)];
        String valueOf = String.valueOf(zzb(com_google_android_gms_internal_zzbph, strArr2));
        String valueOf2 = String.valueOf(" OR (path > ? AND path < ?)");
        valueOf2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        strArr2[com_google_android_gms_internal_zzbph.size() + 1] = zzc;
        strArr2[com_google_android_gms_internal_zzbph.size() + 2] = zziG;
        return this.zzcaI.query("serverCache", strArr, valueOf2, strArr2, null, null, "path");
    }

    private String zza(zzbph com_google_android_gms_internal_zzbph, int i) {
        String valueOf = String.valueOf(zzc(com_google_android_gms_internal_zzbph));
        String valueOf2 = String.valueOf(String.format(".part-%04d", new Object[]{Integer.valueOf(i)}));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private void zza(zzbph com_google_android_gms_internal_zzbph, long j, String str, byte[] bArr) {
        zzWR();
        this.zzcaI.delete("writes", "id = ?", new String[]{String.valueOf(j)});
        if (bArr.length >= 262144) {
            List zzd = zzd(bArr, 262144);
            for (int i = 0; i < zzd.size(); i++) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", Long.valueOf(j));
                contentValues.put("path", zzc(com_google_android_gms_internal_zzbph));
                contentValues.put("type", str);
                contentValues.put("part", Integer.valueOf(i));
                contentValues.put("node", (byte[]) zzd.get(i));
                this.zzcaI.insertWithOnConflict("writes", null, contentValues, 5);
            }
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("id", Long.valueOf(j));
        contentValues2.put("path", zzc(com_google_android_gms_internal_zzbph));
        contentValues2.put("type", str);
        contentValues2.put("part", null);
        contentValues2.put("node", bArr);
        this.zzcaI.insertWithOnConflict("writes", null, contentValues2, 5);
    }

    private void zza(zzbph com_google_android_gms_internal_zzbph, zzbph com_google_android_gms_internal_zzbph2, zzbqq<Long> com_google_android_gms_internal_zzbqq_java_lang_Long, final zzbqq<Long> com_google_android_gms_internal_zzbqq_java_lang_Long2, zzbqn com_google_android_gms_internal_zzbqn, List<zzbtb<zzbph, zzbsc>> list) {
        if (com_google_android_gms_internal_zzbqq_java_lang_Long.getValue() != null) {
            if (((Integer) com_google_android_gms_internal_zzbqn.zza(Integer.valueOf(0), new com.google.android.gms.internal.zzbqq.zza<Void, Integer>(this) {
                public Integer zza(zzbph com_google_android_gms_internal_zzbph, Void voidR, Integer num) {
                    return Integer.valueOf(com_google_android_gms_internal_zzbqq_java_lang_Long2.zzK(com_google_android_gms_internal_zzbph) == null ? num.intValue() + 1 : num.intValue());
                }
            })).intValue() > 0) {
                zzbph zzh = com_google_android_gms_internal_zzbph.zzh(com_google_android_gms_internal_zzbph2);
                if (this.zzcaJ.zzaaC()) {
                    this.zzcaJ.zzi(String.format("Need to rewrite %d nodes below path %s", new Object[]{Integer.valueOf(r0), zzh}), new Object[0]);
                }
                final zzbsc zzb = zzb(zzh);
                final zzbqq<Long> com_google_android_gms_internal_zzbqq_java_lang_Long3 = com_google_android_gms_internal_zzbqq_java_lang_Long2;
                final List<zzbtb<zzbph, zzbsc>> list2 = list;
                final zzbph com_google_android_gms_internal_zzbph3 = com_google_android_gms_internal_zzbph2;
                com_google_android_gms_internal_zzbqn.zza(null, new com.google.android.gms.internal.zzbqq.zza<Void, Void>(this) {
                    public Void zza(zzbph com_google_android_gms_internal_zzbph, Void voidR, Void voidR2) {
                        if (com_google_android_gms_internal_zzbqq_java_lang_Long3.zzK(com_google_android_gms_internal_zzbph) == null) {
                            list2.add(new zzbtb(com_google_android_gms_internal_zzbph3.zzh(com_google_android_gms_internal_zzbph), zzb.zzO(com_google_android_gms_internal_zzbph)));
                        }
                        return null;
                    }
                });
                return;
            }
            return;
        }
        Iterator it = com_google_android_gms_internal_zzbqq_java_lang_Long.zzZN().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            zzbrq com_google_android_gms_internal_zzbrq = (zzbrq) entry.getKey();
            zzbqn zzd = com_google_android_gms_internal_zzbqn.zzd((zzbrq) entry.getKey());
            zza(com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzbph2.zza(com_google_android_gms_internal_zzbrq), (zzbqq) entry.getValue(), com_google_android_gms_internal_zzbqq_java_lang_Long2.zze(com_google_android_gms_internal_zzbrq), zzd, list);
        }
    }

    private void zza(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc, boolean z) {
        int i;
        int i2;
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            i = 0;
            i2 = 0;
            for (zzbsb com_google_android_gms_internal_zzbsb : com_google_android_gms_internal_zzbsc) {
                i2 += zza("serverCache", com_google_android_gms_internal_zzbph.zza(com_google_android_gms_internal_zzbsb.zzabi()));
                i = zzc(com_google_android_gms_internal_zzbph.zza(com_google_android_gms_internal_zzbsb.zzabi()), com_google_android_gms_internal_zzbsb.zzWH()) + i;
            }
        } else {
            i2 = zza("serverCache", com_google_android_gms_internal_zzbph);
            i = zzc(com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzbsc);
        }
        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi(String.format("Persisted a total of %d rows and deleted %d rows for a set at %s in %dms", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), com_google_android_gms_internal_zzbph.toString(), Long.valueOf(currentTimeMillis)}), new Object[0]);
        }
    }

    private byte[] zzaf(Object obj) {
        try {
            return zzbsv.zzav(obj).getBytes(zzawC);
        } catch (Throwable e) {
            throw new RuntimeException("Could not serialize leaf node", e);
        }
    }

    private zzbsc zzb(zzbph com_google_android_gms_internal_zzbph) {
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        Cursor zza = zza(com_google_android_gms_internal_zzbph, new String[]{"path", Param.VALUE});
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        long currentTimeMillis3 = System.currentTimeMillis();
        while (zza.moveToNext()) {
            try {
                arrayList.add(zza.getString(0));
                arrayList2.add(zza.getBlob(1));
            } finally {
                zza.close();
            }
        }
        long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
        long currentTimeMillis5 = System.currentTimeMillis();
        zzbsc zzaaY = zzbrv.zzaaY();
        Object obj = null;
        Map hashMap = new HashMap();
        int i = 0;
        while (i < arrayList2.size()) {
            int zza2;
            zzbph com_google_android_gms_internal_zzbph2;
            zzbsc zzV;
            Object obj2;
            zzbsc com_google_android_gms_internal_zzbsc;
            if (((String) arrayList.get(i)).endsWith(".part-0000")) {
                String str = (String) arrayList.get(i);
                zzbph com_google_android_gms_internal_zzbph3 = new zzbph(str.substring(0, str.length() - ".part-0000".length()));
                zza2 = zza(com_google_android_gms_internal_zzbph3, arrayList, i);
                if (this.zzcaJ.zzaaC()) {
                    this.zzcaJ.zzi("Loading split node with " + zza2 + " parts.", new Object[0]);
                }
                byte[] zzV2 = zzV(arrayList2.subList(i, i + zza2));
                zza2 = (i + zza2) - 1;
                com_google_android_gms_internal_zzbph2 = com_google_android_gms_internal_zzbph3;
                zzV = zzV(zzV2);
            } else {
                zzbsc zzV3 = zzV((byte[]) arrayList2.get(i));
                zzbph com_google_android_gms_internal_zzbph4 = new zzbph((String) arrayList.get(i));
                zzV = zzV3;
                zza2 = i;
                com_google_android_gms_internal_zzbph2 = com_google_android_gms_internal_zzbph4;
            }
            if (com_google_android_gms_internal_zzbph2.zzYU() != null && com_google_android_gms_internal_zzbph2.zzYU().zzaaJ()) {
                hashMap.put(com_google_android_gms_internal_zzbph2, zzV);
                obj2 = obj;
                com_google_android_gms_internal_zzbsc = zzaaY;
            } else if (com_google_android_gms_internal_zzbph2.zzi(com_google_android_gms_internal_zzbph)) {
                zzbte.zzb(obj == null, "Descendants of path must come after ancestors.");
                Object obj3 = obj;
                com_google_android_gms_internal_zzbsc = zzV.zzO(zzbph.zza(com_google_android_gms_internal_zzbph2, com_google_android_gms_internal_zzbph));
                obj2 = obj3;
            } else if (com_google_android_gms_internal_zzbph.zzi(com_google_android_gms_internal_zzbph2)) {
                obj2 = 1;
                com_google_android_gms_internal_zzbsc = zzaaY.zzl(zzbph.zza(com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzbph2), zzV);
            } else {
                throw new IllegalStateException(String.format("Loading an unrelated row with path %s for %s", new Object[]{com_google_android_gms_internal_zzbph2, com_google_android_gms_internal_zzbph}));
            }
            i = zza2 + 1;
            zzaaY = com_google_android_gms_internal_zzbsc;
            obj = obj2;
        }
        for (Entry entry : hashMap.entrySet()) {
            zzaaY = zzaaY.zzl(zzbph.zza(com_google_android_gms_internal_zzbph, (zzbph) entry.getKey()), (zzbsc) entry.getValue());
        }
        long currentTimeMillis6 = System.currentTimeMillis() - currentTimeMillis5;
        long currentTimeMillis7 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi(String.format("Loaded a total of %d rows for a total of %d nodes at %s in %dms (Query: %dms, Loading: %dms, Serializing: %dms)", new Object[]{Integer.valueOf(arrayList2.size()), Integer.valueOf(zzbsz.zzu(zzaaY)), com_google_android_gms_internal_zzbph, Long.valueOf(currentTimeMillis7), Long.valueOf(currentTimeMillis2), Long.valueOf(currentTimeMillis4), Long.valueOf(currentTimeMillis6)}), new Object[0]);
        }
        return zzaaY;
    }

    private static String zzb(zzbph com_google_android_gms_internal_zzbph, String[] strArr) {
        if ($assertionsDisabled || strArr.length >= com_google_android_gms_internal_zzbph.size() + 1) {
            int i = 0;
            StringBuilder stringBuilder = new StringBuilder("(");
            while (!com_google_android_gms_internal_zzbph.isEmpty()) {
                stringBuilder.append("path");
                stringBuilder.append(" = ? OR ");
                strArr[i] = zzc(com_google_android_gms_internal_zzbph);
                com_google_android_gms_internal_zzbph = com_google_android_gms_internal_zzbph.zzYT();
                i++;
            }
            stringBuilder.append("path");
            stringBuilder.append(" = ?)");
            strArr[i] = zzc(zzbph.zzYO());
            return stringBuilder.toString();
        }
        throw new AssertionError();
    }

    private int zzc(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc) {
        long zzt = zzbsz.zzt(com_google_android_gms_internal_zzbsc);
        if (!(com_google_android_gms_internal_zzbsc instanceof zzbrr) || zzt <= PlaybackStateCompat.ACTION_PREPARE) {
            zzd(com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzbsc);
            return 1;
        }
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi(String.format("Node estimated serialized size at path %s of %d bytes exceeds limit of %d bytes. Splitting up.", new Object[]{com_google_android_gms_internal_zzbph, Long.valueOf(zzt), Integer.valueOf(16384)}), new Object[0]);
        }
        int i = 0;
        for (zzbsb com_google_android_gms_internal_zzbsb : com_google_android_gms_internal_zzbsc) {
            i = zzc(com_google_android_gms_internal_zzbph.zza(com_google_android_gms_internal_zzbsb.zzabi()), com_google_android_gms_internal_zzbsb.zzWH()) + i;
        }
        if (!com_google_android_gms_internal_zzbsc.zzaaN().isEmpty()) {
            zzd(com_google_android_gms_internal_zzbph.zza(zzbrq.zzaaH()), com_google_android_gms_internal_zzbsc.zzaaN());
            i++;
        }
        zzd(com_google_android_gms_internal_zzbph, zzbrv.zzaaY());
        return i + 1;
    }

    private static String zzc(zzbph com_google_android_gms_internal_zzbph) {
        return com_google_android_gms_internal_zzbph.isEmpty() ? "/" : String.valueOf(com_google_android_gms_internal_zzbph.toString()).concat("/");
    }

    private static List<byte[]> zzd(byte[] bArr, int i) {
        int length = ((bArr.length - 1) / i) + 1;
        List<byte[]> arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            int min = Math.min(i, bArr.length - (i2 * i));
            Object obj = new byte[min];
            System.arraycopy(bArr, i2 * i, obj, 0, min);
            arrayList.add(obj);
        }
        return arrayList;
    }

    private void zzd(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc) {
        byte[] zzaf = zzaf(com_google_android_gms_internal_zzbsc.getValue(true));
        if (zzaf.length >= 262144) {
            List zzd = zzd(zzaf, 262144);
            if (this.zzcaJ.zzaaC()) {
                this.zzcaJ.zzi("Saving huge leaf node with " + zzd.size() + " parts.", new Object[0]);
            }
            for (int i = 0; i < zzd.size(); i++) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("path", zza(com_google_android_gms_internal_zzbph, i));
                contentValues.put(Param.VALUE, (byte[]) zzd.get(i));
                this.zzcaI.insertWithOnConflict("serverCache", null, contentValues, 5);
            }
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("path", zzc(com_google_android_gms_internal_zzbph));
        contentValues2.put(Param.VALUE, zzaf);
        this.zzcaI.insertWithOnConflict("serverCache", null, contentValues2, 5);
    }

    private static String zziG(String str) {
        if ($assertionsDisabled || str.endsWith("/")) {
            String valueOf = String.valueOf(str.substring(0, str.length() - 1));
            return new StringBuilder(String.valueOf(valueOf).length() + 1).append(valueOf).append('0').toString();
        }
        throw new AssertionError("Path keys must end with a '/'");
    }

    private String zzp(Collection<Long> collection) {
        StringBuilder stringBuilder = new StringBuilder();
        Object obj = 1;
        for (Long longValue : collection) {
            long longValue2 = longValue.longValue();
            if (obj == null) {
                stringBuilder.append(",");
            }
            stringBuilder.append(longValue2);
            obj = null;
        }
        return stringBuilder.toString();
    }

    public void beginTransaction() {
        zzbte.zzb(!this.zzcaK, "runInTransaction called when an existing transaction is already in progress.");
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi("Starting transaction.", new Object[0]);
        }
        this.zzcaI.beginTransaction();
        this.zzcaK = true;
        this.zzcaL = System.currentTimeMillis();
    }

    public void endTransaction() {
        this.zzcaI.endTransaction();
        this.zzcaK = false;
        long currentTimeMillis = System.currentTimeMillis() - this.zzcaL;
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi(String.format("Transaction completed. Elapsed: %dms", new Object[]{Long.valueOf(currentTimeMillis)}), new Object[0]);
        }
    }

    public void setTransactionSuccessful() {
        this.zzcaI.setTransactionSuccessful();
    }

    public List<zzbpv> zzWN() {
        String[] strArr = new String[]{"id", "path", "type", "part", "node"};
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.zzcaI.query("writes", strArr, null, null, null, null, "id, part");
        List<zzbpv> arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                byte[] blob;
                Object com_google_android_gms_internal_zzbpv;
                long j = query.getLong(0);
                zzbph com_google_android_gms_internal_zzbph = new zzbph(query.getString(1));
                String string = query.getString(2);
                if (query.isNull(3)) {
                    blob = query.getBlob(4);
                } else {
                    List arrayList2 = new ArrayList();
                    do {
                        arrayList2.add(query.getBlob(4));
                        if (!query.moveToNext()) {
                            break;
                        }
                    } while (query.getLong(0) == j);
                    query.moveToPrevious();
                    blob = zzV(arrayList2);
                }
                Object zzjf = zzbsv.zzjf(new String(blob, zzawC));
                if ("o".equals(string)) {
                    com_google_android_gms_internal_zzbpv = new zzbpv(j, com_google_android_gms_internal_zzbph, zzbsd.zzat(zzjf), true);
                } else if ("m".equals(string)) {
                    com_google_android_gms_internal_zzbpv = new zzbpv(j, com_google_android_gms_internal_zzbph, zzboy.zzaB((Map) zzjf));
                } else {
                    String str = "Got invalid write type: ";
                    String valueOf = String.valueOf(string);
                    throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                }
                arrayList.add(com_google_android_gms_internal_zzbpv);
            } catch (Throwable e) {
                throw new RuntimeException("Failed to load writes", e);
            } catch (Throwable th) {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi(String.format("Loaded %d writes in %dms", new Object[]{Integer.valueOf(arrayList.size()), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
        query.close();
        return arrayList;
    }

    public long zzWO() {
        long j = null;
        Cursor rawQuery = this.zzcaI.rawQuery(String.format("SELECT sum(length(%s) + length(%s)) FROM %s", new Object[]{Param.VALUE, "path", "serverCache"}), null);
        try {
            if (rawQuery.moveToFirst()) {
                j = rawQuery.getLong(0);
                return j;
            }
            throw new IllegalStateException("Couldn't read database result!");
        } finally {
            rawQuery.close();
        }
    }

    public List<zzbqo> zzWP() {
        String[] strArr = new String[]{"id", "path", "queryParams", "lastUse", "complete", "active"};
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.zzcaI.query("trackedQueries", strArr, null, null, null, null, "id");
        List<zzbqo> arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                arrayList.add(new zzbqo(query.getLong(0), zzbrc.zzb(new zzbph(query.getString(1)), zzbsv.zzje(query.getString(2))), query.getLong(3), query.getInt(4) != 0, query.getInt(5) != 0));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi(String.format("Loaded %d tracked queries in %dms", new Object[]{Integer.valueOf(arrayList.size()), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
        query.close();
        return arrayList;
    }

    public void zzWQ() {
        zzWR();
        long currentTimeMillis = System.currentTimeMillis();
        int delete = this.zzcaI.delete("writes", null, null);
        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi(String.format("Deleted %d (all) write(s) in %dms", new Object[]{Integer.valueOf(delete), Long.valueOf(currentTimeMillis)}), new Object[0]);
        }
    }

    public zzbsc zza(zzbph com_google_android_gms_internal_zzbph) {
        return zzb(com_google_android_gms_internal_zzbph);
    }

    public void zza(long j, Set<zzbrq> set) {
        zzWR();
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = String.valueOf(j);
        this.zzcaI.delete("trackedKeys", "id = ?", new String[]{valueOf});
        for (zzbrq com_google_android_gms_internal_zzbrq : set) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("key", com_google_android_gms_internal_zzbrq.asString());
            this.zzcaI.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi(String.format("Set %d tracked query keys for tracked query %d in %dms", new Object[]{Integer.valueOf(set.size()), Long.valueOf(j), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void zza(long j, Set<zzbrq> set, Set<zzbrq> set2) {
        zzWR();
        long currentTimeMillis = System.currentTimeMillis();
        String str = "id = ? AND key = ?";
        String valueOf = String.valueOf(j);
        for (zzbrq com_google_android_gms_internal_zzbrq : set2) {
            this.zzcaI.delete("trackedKeys", str, new String[]{valueOf, com_google_android_gms_internal_zzbrq.asString()});
        }
        for (zzbrq com_google_android_gms_internal_zzbrq2 : set) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("key", com_google_android_gms_internal_zzbrq2.asString());
            this.zzcaI.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi(String.format("Updated tracked query keys (%d added, %d removed) for tracked query id %d in %dms", new Object[]{Integer.valueOf(set.size()), Integer.valueOf(set2.size()), Long.valueOf(j), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void zza(zzbph com_google_android_gms_internal_zzbph, zzboy com_google_android_gms_internal_zzboy) {
        zzWR();
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = com_google_android_gms_internal_zzboy.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            i += zza("serverCache", com_google_android_gms_internal_zzbph.zzh((zzbph) entry.getKey()));
            i2 = zzc(com_google_android_gms_internal_zzbph.zzh((zzbph) entry.getKey()), (zzbsc) entry.getValue()) + i2;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi(String.format("Persisted a total of %d rows and deleted %d rows for a merge at %s in %dms", new Object[]{Integer.valueOf(i2), Integer.valueOf(i), com_google_android_gms_internal_zzbph.toString(), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void zza(zzbph com_google_android_gms_internal_zzbph, zzboy com_google_android_gms_internal_zzboy, long j) {
        zzWR();
        long currentTimeMillis = System.currentTimeMillis();
        zzbph com_google_android_gms_internal_zzbph2 = com_google_android_gms_internal_zzbph;
        long j2 = j;
        zza(com_google_android_gms_internal_zzbph2, j2, "m", zzaf(com_google_android_gms_internal_zzboy.zzbe(true)));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi(String.format("Persisted user merge in %dms", new Object[]{Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void zza(zzbph com_google_android_gms_internal_zzbph, zzbqn com_google_android_gms_internal_zzbqn) {
        if (com_google_android_gms_internal_zzbqn.zzZH()) {
            zzWR();
            long currentTimeMillis = System.currentTimeMillis();
            Cursor zza = zza(com_google_android_gms_internal_zzbph, new String[]{"rowid", "path"});
            zzbqq com_google_android_gms_internal_zzbqq = new zzbqq(null);
            zzbqq com_google_android_gms_internal_zzbqq2 = new zzbqq(null);
            while (zza.moveToNext()) {
                long j = zza.getLong(0);
                zzbph com_google_android_gms_internal_zzbph2 = new zzbph(zza.getString(1));
                zzbrn com_google_android_gms_internal_zzbrn;
                String valueOf;
                String valueOf2;
                if (com_google_android_gms_internal_zzbph.zzi(com_google_android_gms_internal_zzbph2)) {
                    zzbph zza2 = zzbph.zza(com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzbph2);
                    if (com_google_android_gms_internal_zzbqn.zzw(zza2)) {
                        com_google_android_gms_internal_zzbqq = com_google_android_gms_internal_zzbqq.zzb(zza2, Long.valueOf(j));
                    } else if (com_google_android_gms_internal_zzbqn.zzx(zza2)) {
                        com_google_android_gms_internal_zzbqq2 = com_google_android_gms_internal_zzbqq2.zzb(zza2, Long.valueOf(j));
                    } else {
                        com_google_android_gms_internal_zzbrn = this.zzcaJ;
                        valueOf = String.valueOf(com_google_android_gms_internal_zzbph);
                        valueOf2 = String.valueOf(com_google_android_gms_internal_zzbph2);
                        com_google_android_gms_internal_zzbrn.warn(new StringBuilder((String.valueOf(valueOf).length() + 88) + String.valueOf(valueOf2).length()).append("We are pruning at ").append(valueOf).append(" and have data at ").append(valueOf2).append(" that isn't marked for pruning or keeping. Ignoring.").toString());
                    }
                } else {
                    com_google_android_gms_internal_zzbrn = this.zzcaJ;
                    valueOf = String.valueOf(com_google_android_gms_internal_zzbph);
                    valueOf2 = String.valueOf(com_google_android_gms_internal_zzbph2);
                    com_google_android_gms_internal_zzbrn.warn(new StringBuilder((String.valueOf(valueOf).length() + 67) + String.valueOf(valueOf2).length()).append("We are pruning at ").append(valueOf).append(" but we have data stored higher up at ").append(valueOf2).append(". Ignoring.").toString());
                }
            }
            int i = 0;
            int i2 = 0;
            if (!com_google_android_gms_internal_zzbqq.isEmpty()) {
                List<zzbtb> arrayList = new ArrayList();
                zza(com_google_android_gms_internal_zzbph, zzbph.zzYO(), com_google_android_gms_internal_zzbqq, com_google_android_gms_internal_zzbqq2, com_google_android_gms_internal_zzbqn, arrayList);
                Collection values = com_google_android_gms_internal_zzbqq.values();
                String valueOf3 = String.valueOf(zzp(values));
                this.zzcaI.delete("serverCache", new StringBuilder(String.valueOf(valueOf3).length() + 11).append("rowid IN (").append(valueOf3).append(")").toString(), null);
                for (zzbtb com_google_android_gms_internal_zzbtb : arrayList) {
                    zzc(com_google_android_gms_internal_zzbph.zzh((zzbph) com_google_android_gms_internal_zzbtb.getFirst()), (zzbsc) com_google_android_gms_internal_zzbtb.zzabI());
                }
                i = values.size();
                i2 = arrayList.size();
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (this.zzcaJ.zzaaC()) {
                this.zzcaJ.zzi(String.format("Pruned %d rows with %d nodes resaved in %dms", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(currentTimeMillis2)}), new Object[0]);
            }
        }
    }

    public void zza(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc) {
        zzWR();
        zza(com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzbsc, false);
    }

    public void zza(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc, long j) {
        zzWR();
        long currentTimeMillis = System.currentTimeMillis();
        zzbph com_google_android_gms_internal_zzbph2 = com_google_android_gms_internal_zzbph;
        long j2 = j;
        zza(com_google_android_gms_internal_zzbph2, j2, "o", zzaf(com_google_android_gms_internal_zzbsc.getValue(true)));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi(String.format("Persisted user overwrite in %dms", new Object[]{Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void zza(zzbqo com_google_android_gms_internal_zzbqo) {
        zzWR();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(com_google_android_gms_internal_zzbqo.id));
        contentValues.put("path", zzc(com_google_android_gms_internal_zzbqo.zzchq.zzWL()));
        contentValues.put("queryParams", com_google_android_gms_internal_zzbqo.zzchq.zzaap().zzaan());
        contentValues.put("lastUse", Long.valueOf(com_google_android_gms_internal_zzbqo.zzchr));
        contentValues.put("complete", Boolean.valueOf(com_google_android_gms_internal_zzbqo.zzchs));
        contentValues.put("active", Boolean.valueOf(com_google_android_gms_internal_zzbqo.zzbrc));
        this.zzcaI.insertWithOnConflict("trackedQueries", null, contentValues, 5);
        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi(String.format("Saved new tracked query in %dms", new Object[]{Long.valueOf(currentTimeMillis)}), new Object[0]);
        }
    }

    public void zzaD(long j) {
        zzWR();
        long currentTimeMillis = System.currentTimeMillis();
        int delete = this.zzcaI.delete("writes", "id = ?", new String[]{String.valueOf(j)});
        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi(String.format("Deleted %d write(s) with writeId %d in %dms", new Object[]{Integer.valueOf(delete), Long.valueOf(j), Long.valueOf(currentTimeMillis)}), new Object[0]);
        }
    }

    public void zzaE(long j) {
        zzWR();
        String valueOf = String.valueOf(j);
        this.zzcaI.delete("trackedQueries", "id = ?", new String[]{valueOf});
        this.zzcaI.delete("trackedKeys", "id = ?", new String[]{valueOf});
    }

    public void zzaF(long j) {
        zzWR();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("active", Boolean.valueOf(false));
        contentValues.put("lastUse", Long.valueOf(j));
        this.zzcaI.updateWithOnConflict("trackedQueries", contentValues, "active = 1", new String[0], 5);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi(String.format("Reset active tracked queries in %dms", new Object[]{Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public Set<zzbrq> zzaG(long j) {
        return zzg(Collections.singleton(Long.valueOf(j)));
    }

    public void zzb(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc) {
        zzWR();
        zza(com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzbsc, true);
    }

    public Set<zzbrq> zzg(Set<Long> set) {
        String[] strArr = new String[]{"key"};
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = String.valueOf("id IN (");
        String valueOf2 = String.valueOf(zzp(set));
        Cursor query = this.zzcaI.query(true, "trackedKeys", strArr, new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).append(")").toString(), null, null, null, null, null);
        Set<zzbrq> hashSet = new HashSet();
        while (query.moveToNext()) {
            try {
                hashSet.add(zzbrq.zzja(query.getString(0)));
            } catch (Throwable th) {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi(String.format("Loaded %d tracked queries keys for tracked queries %s in %dms", new Object[]{Integer.valueOf(hashSet.size()), set.toString(), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
        query.close();
        return hashSet;
    }
}
