package com.google.firebase.database;

import com.google.android.gms.internal.zzbox;
import com.google.android.gms.internal.zzbpc;
import com.google.android.gms.internal.zzbph;
import com.google.android.gms.internal.zzbpj;
import com.google.android.gms.internal.zzbpx;
import com.google.android.gms.internal.zzbqa;
import com.google.android.gms.internal.zzbrb;
import com.google.android.gms.internal.zzbrc;
import com.google.android.gms.internal.zzbrp;
import com.google.android.gms.internal.zzbrq;
import com.google.android.gms.internal.zzbru;
import com.google.android.gms.internal.zzbrv;
import com.google.android.gms.internal.zzbry;
import com.google.android.gms.internal.zzbsc;
import com.google.android.gms.internal.zzbse;
import com.google.android.gms.internal.zzbsf;
import com.google.android.gms.internal.zzbsg;
import com.google.android.gms.internal.zzbsi;
import com.google.android.gms.internal.zzbsj;
import com.google.android.gms.internal.zzbte;
import com.google.android.gms.internal.zzbtf;

public class Query {
    static final /* synthetic */ boolean $assertionsDisabled = (!Query.class.desiredAssertionStatus());
    protected final zzbpj zzcad;
    protected final zzbph zzcak;
    protected final zzbrb zzcao;
    private final boolean zzcap;

    Query(zzbpj com_google_android_gms_internal_zzbpj, zzbph com_google_android_gms_internal_zzbph) {
        this.zzcad = com_google_android_gms_internal_zzbpj;
        this.zzcak = com_google_android_gms_internal_zzbph;
        this.zzcao = zzbrb.zzcii;
        this.zzcap = false;
    }

    Query(zzbpj com_google_android_gms_internal_zzbpj, zzbph com_google_android_gms_internal_zzbph, zzbrb com_google_android_gms_internal_zzbrb, boolean z) throws DatabaseException {
        this.zzcad = com_google_android_gms_internal_zzbpj;
        this.zzcak = com_google_android_gms_internal_zzbph;
        this.zzcao = com_google_android_gms_internal_zzbrb;
        this.zzcap = z;
        zzbte.zzb(com_google_android_gms_internal_zzbrb.isValid(), "Validation of queries failed.");
    }

    private void zzWJ() {
        if (this.zzcao.zzaaa()) {
            throw new IllegalArgumentException("Can't call equalTo() and startAt() combined");
        } else if (this.zzcao.zzaad()) {
            throw new IllegalArgumentException("Can't call equalTo() and endAt() combined");
        }
    }

    private void zzWK() {
        if (this.zzcap) {
            throw new IllegalArgumentException("You can't combine multiple orderBy calls!");
        }
    }

    private Query zza(zzbsc com_google_android_gms_internal_zzbsc, String str) {
        zzbtf.zzjp(str);
        if (!com_google_android_gms_internal_zzbsc.zzaaM() && !com_google_android_gms_internal_zzbsc.isEmpty()) {
            throw new IllegalArgumentException("Can only use simple values for startAt()");
        } else if (this.zzcao.zzaaa()) {
            throw new IllegalArgumentException("Can't call startAt() or equalTo() multiple times");
        } else {
            zzbrb zza = this.zzcao.zza(com_google_android_gms_internal_zzbsc, str != null ? zzbrq.zzja(str) : null);
            zzb(zza);
            zza(zza);
            if ($assertionsDisabled || zza.isValid()) {
                return new Query(this.zzcad, this.zzcak, zza, this.zzcap);
            }
            throw new AssertionError();
        }
    }

    private void zza(final zzbpc com_google_android_gms_internal_zzbpc) {
        zzbqa.zzZt().zzk(com_google_android_gms_internal_zzbpc);
        this.zzcad.zzs(new Runnable(this) {
            final /* synthetic */ Query zzcar;

            public void run() {
                this.zzcar.zzcad.zze(com_google_android_gms_internal_zzbpc);
            }
        });
    }

    private void zza(zzbrb com_google_android_gms_internal_zzbrb) {
        if (com_google_android_gms_internal_zzbrb.zzaai().equals(zzbry.zzabf())) {
            zzbsc zzaab;
            String str = "You must use startAt(String value), endAt(String value) or equalTo(String value) in combination with orderByKey(). Other type of values or using the version with 2 parameters is not supported";
            if (com_google_android_gms_internal_zzbrb.zzaaa()) {
                zzaab = com_google_android_gms_internal_zzbrb.zzaab();
                if (!(com_google_android_gms_internal_zzbrb.zzaac() == zzbrq.zzaaF() && (zzaab instanceof zzbsi))) {
                    throw new IllegalArgumentException(str);
                }
            }
            if (com_google_android_gms_internal_zzbrb.zzaad()) {
                zzaab = com_google_android_gms_internal_zzbrb.zzaae();
                if (com_google_android_gms_internal_zzbrb.zzaaf() != zzbrq.zzaaG() || !(zzaab instanceof zzbsi)) {
                    throw new IllegalArgumentException(str);
                }
            }
        } else if (!com_google_android_gms_internal_zzbrb.zzaai().equals(zzbsf.zzabj())) {
        } else {
            if ((com_google_android_gms_internal_zzbrb.zzaaa() && !zzbsg.zzq(com_google_android_gms_internal_zzbrb.zzaab())) || (com_google_android_gms_internal_zzbrb.zzaad() && !zzbsg.zzq(com_google_android_gms_internal_zzbrb.zzaae()))) {
                throw new IllegalArgumentException("When using orderByPriority(), values provided to startAt(), endAt(), or equalTo() must be valid priorities.");
            }
        }
    }

    private Query zzb(zzbsc com_google_android_gms_internal_zzbsc, String str) {
        zzbtf.zzjp(str);
        if (com_google_android_gms_internal_zzbsc.zzaaM() || com_google_android_gms_internal_zzbsc.isEmpty()) {
            zzbrq zzja = str != null ? zzbrq.zzja(str) : null;
            if (this.zzcao.zzaad()) {
                throw new IllegalArgumentException("Can't call endAt() or equalTo() multiple times");
            }
            zzbrb zzb = this.zzcao.zzb(com_google_android_gms_internal_zzbsc, zzja);
            zzb(zzb);
            zza(zzb);
            if ($assertionsDisabled || zzb.isValid()) {
                return new Query(this.zzcad, this.zzcak, zzb, this.zzcap);
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException("Can only use simple values for endAt()");
    }

    private void zzb(final zzbpc com_google_android_gms_internal_zzbpc) {
        zzbqa.zzZt().zzi(com_google_android_gms_internal_zzbpc);
        this.zzcad.zzs(new Runnable(this) {
            final /* synthetic */ Query zzcar;

            public void run() {
                this.zzcar.zzcad.zzf(com_google_android_gms_internal_zzbpc);
            }
        });
    }

    private void zzb(zzbrb com_google_android_gms_internal_zzbrb) {
        if (com_google_android_gms_internal_zzbrb.zzaaa() && com_google_android_gms_internal_zzbrb.zzaad() && com_google_android_gms_internal_zzbrb.zzaag() && !com_google_android_gms_internal_zzbrb.zzaah()) {
            throw new IllegalArgumentException("Can't combine startAt(), endAt() and limit(). Use limitToFirst() or limitToLast() instead");
        }
    }

    public ChildEventListener addChildEventListener(ChildEventListener childEventListener) {
        zzb(new zzbox(this.zzcad, childEventListener, zzWM()));
        return childEventListener;
    }

    public void addListenerForSingleValueEvent(final ValueEventListener valueEventListener) {
        zzb(new zzbpx(this.zzcad, new ValueEventListener(this) {
            final /* synthetic */ Query zzcar;

            public void onCancelled(DatabaseError databaseError) {
                valueEventListener.onCancelled(databaseError);
            }

            public void onDataChange(DataSnapshot dataSnapshot) {
                this.zzcar.removeEventListener((ValueEventListener) this);
                valueEventListener.onDataChange(dataSnapshot);
            }
        }, zzWM()));
    }

    public ValueEventListener addValueEventListener(ValueEventListener valueEventListener) {
        zzb(new zzbpx(this.zzcad, valueEventListener, zzWM()));
        return valueEventListener;
    }

    public Query endAt(double d) {
        return endAt(d, null);
    }

    public Query endAt(double d, String str) {
        return zzb(new zzbru(Double.valueOf(d), zzbsg.zzabk()), str);
    }

    public Query endAt(String str) {
        return endAt(str, null);
    }

    public Query endAt(String str, String str2) {
        return zzb(str != null ? new zzbsi(str, zzbsg.zzabk()) : zzbrv.zzaaY(), str2);
    }

    public Query endAt(boolean z) {
        return endAt(z, null);
    }

    public Query endAt(boolean z, String str) {
        return zzb(new zzbrp(Boolean.valueOf(z), zzbsg.zzabk()), str);
    }

    public Query equalTo(double d) {
        zzWJ();
        return startAt(d).endAt(d);
    }

    public Query equalTo(double d, String str) {
        zzWJ();
        return startAt(d, str).endAt(d, str);
    }

    public Query equalTo(String str) {
        zzWJ();
        return startAt(str).endAt(str);
    }

    public Query equalTo(String str, String str2) {
        zzWJ();
        return startAt(str, str2).endAt(str, str2);
    }

    public Query equalTo(boolean z) {
        zzWJ();
        return startAt(z).endAt(z);
    }

    public Query equalTo(boolean z, String str) {
        zzWJ();
        return startAt(z, str).endAt(z, str);
    }

    public DatabaseReference getRef() {
        return new DatabaseReference(this.zzcad, zzWL());
    }

    public void keepSynced(final boolean z) {
        if (this.zzcak.isEmpty() || !this.zzcak.zzYR().equals(zzbrq.zzaaI())) {
            this.zzcad.zzs(new Runnable(this) {
                final /* synthetic */ Query zzcar;

                public void run() {
                    this.zzcar.zzcad.zza(this.zzcar.zzWM(), z);
                }
            });
            return;
        }
        throw new DatabaseException("Can't call keepSynced() on .info paths.");
    }

    public Query limitToFirst(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Limit must be a positive integer!");
        } else if (!this.zzcao.zzaag()) {
            return new Query(this.zzcad, this.zzcak, this.zzcao.zzqB(i), this.zzcap);
        } else {
            throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
        }
    }

    public Query limitToLast(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Limit must be a positive integer!");
        } else if (!this.zzcao.zzaag()) {
            return new Query(this.zzcad, this.zzcak, this.zzcao.zzqC(i), this.zzcap);
        } else {
            throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
        }
    }

    public Query orderByChild(String str) {
        if (str == null) {
            throw new NullPointerException("Key can't be null");
        } else if (str.equals("$key") || str.equals(".key")) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 54).append("Can't use '").append(str).append("' as path, please use orderByKey() instead!").toString());
        } else if (str.equals("$priority") || str.equals(".priority")) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 59).append("Can't use '").append(str).append("' as path, please use orderByPriority() instead!").toString());
        } else if (str.equals("$value") || str.equals(".value")) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 56).append("Can't use '").append(str).append("' as path, please use orderByValue() instead!").toString());
        } else {
            zzbtf.zzjl(str);
            zzWK();
            zzbph com_google_android_gms_internal_zzbph = new zzbph(str);
            if (com_google_android_gms_internal_zzbph.size() == 0) {
                throw new IllegalArgumentException("Can't use empty path, use orderByValue() instead!");
            }
            return new Query(this.zzcad, this.zzcak, this.zzcao.zza(new zzbse(com_google_android_gms_internal_zzbph)), true);
        }
    }

    public Query orderByKey() {
        zzWK();
        zzbrb zza = this.zzcao.zza(zzbry.zzabf());
        zza(zza);
        return new Query(this.zzcad, this.zzcak, zza, true);
    }

    public Query orderByPriority() {
        zzWK();
        zzbrb zza = this.zzcao.zza(zzbsf.zzabj());
        zza(zza);
        return new Query(this.zzcad, this.zzcak, zza, true);
    }

    public Query orderByValue() {
        zzWK();
        return new Query(this.zzcad, this.zzcak, this.zzcao.zza(zzbsj.zzabl()), true);
    }

    public void removeEventListener(ChildEventListener childEventListener) {
        if (childEventListener == null) {
            throw new NullPointerException("listener must not be null");
        }
        zza(new zzbox(this.zzcad, childEventListener, zzWM()));
    }

    public void removeEventListener(ValueEventListener valueEventListener) {
        if (valueEventListener == null) {
            throw new NullPointerException("listener must not be null");
        }
        zza(new zzbpx(this.zzcad, valueEventListener, zzWM()));
    }

    public Query startAt(double d) {
        return startAt(d, null);
    }

    public Query startAt(double d, String str) {
        return zza(new zzbru(Double.valueOf(d), zzbsg.zzabk()), str);
    }

    public Query startAt(String str) {
        return startAt(str, null);
    }

    public Query startAt(String str, String str2) {
        return zza(str != null ? new zzbsi(str, zzbsg.zzabk()) : zzbrv.zzaaY(), str2);
    }

    public Query startAt(boolean z) {
        return startAt(z, null);
    }

    public Query startAt(boolean z, String str) {
        return zza(new zzbrp(Boolean.valueOf(z), zzbsg.zzabk()), str);
    }

    public zzbph zzWL() {
        return this.zzcak;
    }

    public zzbrc zzWM() {
        return new zzbrc(this.zzcak, this.zzcao);
    }
}
