package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbpr.zzd;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.DatabaseReference.CompletionListener;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Transaction;
import com.google.firebase.database.Transaction.Handler;
import com.google.firebase.database.Transaction.Result;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class zzbpj implements com.google.android.gms.internal.zzbop.zza {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbpj.class.desiredAssertionStatus());
    private final zzbpk zzcab;
    private final zzbop zzcdk;
    private final zzbrn zzceA;
    public long zzceB = 0;
    private long zzceC = 1;
    private zzbpr zzceD;
    private zzbpr zzceE;
    private FirebaseDatabase zzceF;
    private boolean zzceG = false;
    private long zzceH = 0;
    private final zzbta zzcer = new zzbta(new zzbsx(), 0);
    private zzbpo zzces;
    private zzbpp zzcet;
    private zzbqs<List<zza>> zzceu;
    private boolean zzcev = false;
    private final zzbra zzcew;
    private final zzbpa zzcex;
    private final zzbrn zzcey;
    private final zzbrn zzcez;

    class C04951 implements Runnable {
        final /* synthetic */ zzbpj zzceI;

        C04951(zzbpj com_google_android_gms_internal_zzbpj) {
            this.zzceI = com_google_android_gms_internal_zzbpj;
        }

        public void run() {
            this.zzceI.zzYW();
        }
    }

    private static class zza implements Comparable<zza> {
        private int retryCount;
        private zzbph zzcak;
        private Handler zzcfh;
        private ValueEventListener zzcfi;
        private zzb zzcfj;
        private long zzcfk;
        private boolean zzcfl;
        private DatabaseError zzcfm;
        private long zzcfn;
        private zzbsc zzcfo;
        private zzbsc zzcfp;
        private zzbsc zzcfq;

        private zza(zzbph com_google_android_gms_internal_zzbph, Handler handler, ValueEventListener valueEventListener, zzb com_google_android_gms_internal_zzbpj_zzb, boolean z, long j) {
            this.zzcak = com_google_android_gms_internal_zzbph;
            this.zzcfh = handler;
            this.zzcfi = valueEventListener;
            this.zzcfj = com_google_android_gms_internal_zzbpj_zzb;
            this.retryCount = 0;
            this.zzcfl = z;
            this.zzcfk = j;
            this.zzcfm = null;
            this.zzcfo = null;
            this.zzcfp = null;
            this.zzcfq = null;
        }

        public /* synthetic */ int compareTo(Object obj) {
            return zza((zza) obj);
        }

        public int zza(zza com_google_android_gms_internal_zzbpj_zza) {
            return this.zzcfk < com_google_android_gms_internal_zzbpj_zza.zzcfk ? -1 : this.zzcfk == com_google_android_gms_internal_zzbpj_zza.zzcfk ? 0 : 1;
        }
    }

    private enum zzb {
        INITIALIZING,
        RUN,
        SENT,
        COMPLETED,
        SENT_NEEDS_ABORT,
        NEEDS_ABORT
    }

    class C09785 implements ValueEventListener {
        C09785(zzbpj com_google_android_gms_internal_zzbpj) {
        }

        public void onCancelled(DatabaseError databaseError) {
        }

        public void onDataChange(DataSnapshot dataSnapshot) {
        }
    }

    class C09797 implements com.google.android.gms.internal.zzbqs.zzb<List<zza>> {
        final /* synthetic */ zzbpj zzceI;

        C09797(zzbpj com_google_android_gms_internal_zzbpj) {
            this.zzceI = com_google_android_gms_internal_zzbpj;
        }

        public void zzd(zzbqs<List<zza>> com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza) {
            this.zzceI.zza((zzbqs) com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza);
        }
    }

    class C09819 implements com.google.android.gms.internal.zzbqs.zzb<List<zza>> {
        final /* synthetic */ zzbpj zzceI;

        C09819(zzbpj com_google_android_gms_internal_zzbpj) {
            this.zzceI = com_google_android_gms_internal_zzbpj;
        }

        public void zzd(zzbqs<List<zza>> com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza) {
            this.zzceI.zzb((zzbqs) com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza);
        }
    }

    zzbpj(zzbpk com_google_android_gms_internal_zzbpk, zzbpa com_google_android_gms_internal_zzbpa, FirebaseDatabase firebaseDatabase) {
        this.zzcab = com_google_android_gms_internal_zzbpk;
        this.zzcex = com_google_android_gms_internal_zzbpa;
        this.zzceF = firebaseDatabase;
        this.zzcey = this.zzcex.zziV("RepoOperation");
        this.zzcez = this.zzcex.zziV("Transaction");
        this.zzceA = this.zzcex.zziV("DataOperation");
        this.zzcew = new zzbra(this.zzcex);
        this.zzcdk = com_google_android_gms_internal_zzbpa.zza(new zzbon(com_google_android_gms_internal_zzbpk.zzcbM, com_google_android_gms_internal_zzbpk.zzaGP, com_google_android_gms_internal_zzbpk.zzcbN), this);
        zzs(new C04951(this));
    }

    private void zzYW() {
        this.zzcex.zzYC().zza(new com.google.android.gms.internal.zzbow.zzb(this) {
            final /* synthetic */ zzbpj zzceI;

            {
                this.zzceI = r1;
            }

            public void zziU(String str) {
                this.zzceI.zzcey.zzi("Auth token changed, triggering auth token refresh", new Object[0]);
                this.zzceI.zzcdk.zziN(str);
            }
        });
        this.zzcdk.initialize();
        zzbql zziW = this.zzcex.zziW(this.zzcab.zzcbM);
        this.zzces = new zzbpo();
        this.zzcet = new zzbpp();
        this.zzceu = new zzbqs();
        this.zzceD = new zzbpr(this.zzcex, new zzbqk(), new zzd(this) {
            final /* synthetic */ zzbpj zzceI;

            {
                this.zzceI = r1;
            }

            public void zza(zzbrc com_google_android_gms_internal_zzbrc, zzbps com_google_android_gms_internal_zzbps) {
            }

            public void zza(final zzbrc com_google_android_gms_internal_zzbrc, zzbps com_google_android_gms_internal_zzbps, zzboo com_google_android_gms_internal_zzboo, final com.google.android.gms.internal.zzbpr.zza com_google_android_gms_internal_zzbpr_zza) {
                this.zzceI.zzs(new Runnable(this) {
                    final /* synthetic */ AnonymousClass17 zzceZ;

                    public void run() {
                        zzbsc zzq = this.zzceZ.zzceI.zzces.zzq(com_google_android_gms_internal_zzbrc.zzWL());
                        if (!zzq.isEmpty()) {
                            this.zzceZ.zzceI.zzZ(this.zzceZ.zzceI.zzceD.zzi(com_google_android_gms_internal_zzbrc.zzWL(), zzq));
                            com_google_android_gms_internal_zzbpr_zza.zzb(null);
                        }
                    }
                });
            }
        });
        this.zzceE = new zzbpr(this.zzcex, zziW, new zzd(this) {
            final /* synthetic */ zzbpj zzceI;

            {
                this.zzceI = r1;
            }

            public void zza(zzbrc com_google_android_gms_internal_zzbrc, zzbps com_google_android_gms_internal_zzbps) {
                this.zzceI.zzcdk.zza(com_google_android_gms_internal_zzbrc.zzWL().zzYQ(), com_google_android_gms_internal_zzbrc.zzaap().zzaal());
            }

            public void zza(zzbrc com_google_android_gms_internal_zzbrc, zzbps com_google_android_gms_internal_zzbps, zzboo com_google_android_gms_internal_zzboo, final com.google.android.gms.internal.zzbpr.zza com_google_android_gms_internal_zzbpr_zza) {
                this.zzceI.zzcdk.zza(com_google_android_gms_internal_zzbrc.zzWL().zzYQ(), com_google_android_gms_internal_zzbrc.zzaap().zzaal(), com_google_android_gms_internal_zzboo, com_google_android_gms_internal_zzbps != null ? Long.valueOf(com_google_android_gms_internal_zzbps.zzZk()) : null, new zzbos(this) {
                    final /* synthetic */ AnonymousClass18 zzcfb;

                    public void zzar(String str, String str2) {
                        this.zzcfb.zzceI.zzZ(com_google_android_gms_internal_zzbpr_zza.zzb(zzbpj.zzas(str, str2)));
                    }
                });
            }
        });
        zza(zziW);
        zzb(zzboz.zzcdU, Boolean.valueOf(false));
        zzb(zzboz.zzcdV, Boolean.valueOf(false));
    }

    private void zzZ(List<? extends zzbqy> list) {
        if (!list.isEmpty()) {
            this.zzcew.zzab(list);
        }
    }

    private long zzZa() {
        long j = this.zzceC;
        this.zzceC = 1 + j;
        return j;
    }

    private void zzZb() {
        zzbpp zza = zzbpn.zza(this.zzcet, zzbpn.zza(this.zzcer));
        final List arrayList = new ArrayList();
        zza.zza(zzbph.zzYO(), new com.google.android.gms.internal.zzbpp.zzb(this) {
            final /* synthetic */ zzbpj zzceI;

            public void zzf(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc) {
                arrayList.addAll(this.zzceI.zzceE.zzi(com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzbsc));
                this.zzceI.zzo(this.zzceI.zzb(com_google_android_gms_internal_zzbph, -9));
            }
        });
        this.zzcet = new zzbpp();
        zzZ(arrayList);
    }

    private void zzZc() {
        zzbqs com_google_android_gms_internal_zzbqs = this.zzceu;
        zzb(com_google_android_gms_internal_zzbqs);
        zza(com_google_android_gms_internal_zzbqs);
    }

    private long zzZd() {
        long j = this.zzceH;
        this.zzceH = 1 + j;
        return j;
    }

    private zzbsc zza(zzbph com_google_android_gms_internal_zzbph, List<Long> list) {
        zzbsc zzc = this.zzceE.zzc(com_google_android_gms_internal_zzbph, list);
        return zzc == null ? zzbrv.zzaaY() : zzc;
    }

    private void zza(long j, zzbph com_google_android_gms_internal_zzbph, DatabaseError databaseError) {
        if (databaseError == null || databaseError.getCode() != -25) {
            List zza = this.zzceE.zza(j, !(databaseError == null), true, this.zzcer);
            if (zza.size() > 0) {
                zzo(com_google_android_gms_internal_zzbph);
            }
            zzZ(zza);
        }
    }

    private void zza(zzbql com_google_android_gms_internal_zzbql) {
        List<zzbpv> zzWN = com_google_android_gms_internal_zzbql.zzWN();
        Map zza = zzbpn.zza(this.zzcer);
        long j = Long.MIN_VALUE;
        for (final zzbpv com_google_android_gms_internal_zzbpv : zzWN) {
            zzbos anonymousClass19 = new zzbos(this) {
                final /* synthetic */ zzbpj zzceI;

                public void zzar(String str, String str2) {
                    DatabaseError zzat = zzbpj.zzas(str, str2);
                    this.zzceI.zza("Persisted write", com_google_android_gms_internal_zzbpv.zzWL(), zzat);
                    this.zzceI.zza(com_google_android_gms_internal_zzbpv.zzZl(), com_google_android_gms_internal_zzbpv.zzWL(), zzat);
                }
            };
            if (j >= com_google_android_gms_internal_zzbpv.zzZl()) {
                throw new IllegalStateException("Write ids were not in order.");
            }
            long zzZl = com_google_android_gms_internal_zzbpv.zzZl();
            this.zzceC = com_google_android_gms_internal_zzbpv.zzZl() + 1;
            if (com_google_android_gms_internal_zzbpv.zzZo()) {
                if (this.zzcey.zzaaC()) {
                    this.zzcey.zzi("Restoring overwrite with id " + com_google_android_gms_internal_zzbpv.zzZl(), new Object[0]);
                }
                this.zzcdk.zza(com_google_android_gms_internal_zzbpv.zzWL().zzYQ(), com_google_android_gms_internal_zzbpv.zzZm().getValue(true), anonymousClass19);
                this.zzceE.zza(com_google_android_gms_internal_zzbpv.zzWL(), com_google_android_gms_internal_zzbpv.zzZm(), zzbpn.zza(com_google_android_gms_internal_zzbpv.zzZm(), zza), com_google_android_gms_internal_zzbpv.zzZl(), true, false);
            } else {
                if (this.zzcey.zzaaC()) {
                    this.zzcey.zzi("Restoring merge with id " + com_google_android_gms_internal_zzbpv.zzZl(), new Object[0]);
                }
                this.zzcdk.zza(com_google_android_gms_internal_zzbpv.zzWL().zzYQ(), com_google_android_gms_internal_zzbpv.zzZn().zzbe(true), anonymousClass19);
                this.zzceE.zza(com_google_android_gms_internal_zzbpv.zzWL(), com_google_android_gms_internal_zzbpv.zzZn(), zzbpn.zza(com_google_android_gms_internal_zzbpv.zzZn(), zza), com_google_android_gms_internal_zzbpv.zzZl(), false);
            }
            j = zzZl;
        }
    }

    private void zza(zzbqs<List<zza>> com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza) {
        if (((List) com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza.getValue()) != null) {
            List<zza> zzc = zzc((zzbqs) com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza);
            if ($assertionsDisabled || zzc.size() > 0) {
                Boolean valueOf;
                Boolean valueOf2 = Boolean.valueOf(true);
                for (zza zzd : zzc) {
                    if (zzd.zzcfj != zzb.RUN) {
                        valueOf = Boolean.valueOf(false);
                        break;
                    }
                }
                valueOf = valueOf2;
                if (valueOf.booleanValue()) {
                    zza((List) zzc, com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza.zzWL());
                    return;
                }
                return;
            }
            throw new AssertionError();
        } else if (com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza.hasChildren()) {
            com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza.zzb(new C09797(this));
        }
    }

    private void zza(zzbqs<List<zza>> com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza, int i) {
        List list = (List) com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza.getValue();
        List arrayList = new ArrayList();
        if (list != null) {
            DatabaseError zziD;
            List<Runnable> arrayList2 = new ArrayList();
            if (i == -9) {
                zziD = DatabaseError.zziD("overriddenBySet");
            } else {
                zzbte.zzb(i == -25, "Unknown transaction abort reason: " + i);
                zziD = DatabaseError.zzqv(-25);
            }
            int i2 = 0;
            int i3 = -1;
            while (i2 < list.size()) {
                int i4;
                final zza com_google_android_gms_internal_zzbpj_zza = (zza) list.get(i2);
                if (com_google_android_gms_internal_zzbpj_zza.zzcfj == zzb.SENT_NEEDS_ABORT) {
                    i4 = i3;
                } else if (com_google_android_gms_internal_zzbpj_zza.zzcfj == zzb.SENT) {
                    if ($assertionsDisabled || i3 == i2 - 1) {
                        com_google_android_gms_internal_zzbpj_zza.zzcfj = zzb.SENT_NEEDS_ABORT;
                        com_google_android_gms_internal_zzbpj_zza.zzcfm = zziD;
                        i4 = i2;
                    } else {
                        throw new AssertionError();
                    }
                } else if ($assertionsDisabled || com_google_android_gms_internal_zzbpj_zza.zzcfj == zzb.RUN) {
                    zze(new zzbpx(this, com_google_android_gms_internal_zzbpj_zza.zzcfi, zzbrc.zzN(com_google_android_gms_internal_zzbpj_zza.zzcak)));
                    if (i == -9) {
                        arrayList.addAll(this.zzceE.zza(com_google_android_gms_internal_zzbpj_zza.zzcfn, true, false, this.zzcer));
                    } else {
                        zzbte.zzb(i == -25, "Unknown transaction abort reason: " + i);
                    }
                    arrayList2.add(new Runnable(this) {
                        public void run() {
                            com_google_android_gms_internal_zzbpj_zza.zzcfh.onComplete(zziD, false, null);
                        }
                    });
                    i4 = i3;
                } else {
                    throw new AssertionError();
                }
                i2++;
                i3 = i4;
            }
            if (i3 == -1) {
                com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza.setValue(null);
            } else {
                com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza.setValue(list.subList(0, i3 + 1));
            }
            zzZ(arrayList);
            for (Runnable zzq : arrayList2) {
                zzq(zzq);
            }
        }
    }

    private void zza(String str, zzbph com_google_android_gms_internal_zzbph, DatabaseError databaseError) {
        if (databaseError != null && databaseError.getCode() != -1 && databaseError.getCode() != -25) {
            zzbrn com_google_android_gms_internal_zzbrn = this.zzcey;
            String valueOf = String.valueOf(com_google_android_gms_internal_zzbph.toString());
            String valueOf2 = String.valueOf(databaseError.toString());
            com_google_android_gms_internal_zzbrn.warn(new StringBuilder(((String.valueOf(str).length() + 13) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append(str).append(" at ").append(valueOf).append(" failed: ").append(valueOf2).toString());
        }
    }

    private void zza(final List<zza> list, final zzbph com_google_android_gms_internal_zzbph) {
        List arrayList = new ArrayList();
        for (zza zzc : list) {
            arrayList.add(Long.valueOf(zzc.zzcfn));
        }
        zzbsc zza = zza(com_google_android_gms_internal_zzbph, arrayList);
        String zzaaL = zza.zzaaL();
        zzbsc com_google_android_gms_internal_zzbsc = zza;
        for (zza zzc2 : list) {
            if ($assertionsDisabled || zzc2.zzcfj == zzb.RUN) {
                zzc2.zzcfj = zzb.SENT;
                zzc2.retryCount = zzc2.retryCount + 1;
                com_google_android_gms_internal_zzbsc = com_google_android_gms_internal_zzbsc.zzl(zzbph.zza(com_google_android_gms_internal_zzbph, zzc2.zzcak), zzc2.zzcfp);
            } else {
                throw new AssertionError();
            }
        }
        Object value = com_google_android_gms_internal_zzbsc.getValue(true);
        zzZa();
        this.zzcdk.zza(com_google_android_gms_internal_zzbph.zzYQ(), value, zzaaL, new zzbos(this) {
            final /* synthetic */ zzbpj zzceI;

            public void zzar(String str, String str2) {
                int i = 0;
                DatabaseError zzat = zzbpj.zzas(str, str2);
                this.zzceI.zza("Transaction", com_google_android_gms_internal_zzbph, zzat);
                List arrayList = new ArrayList();
                if (zzat == null) {
                    List arrayList2 = new ArrayList();
                    for (final zza com_google_android_gms_internal_zzbpj_zza : list) {
                        com_google_android_gms_internal_zzbpj_zza.zzcfj = zzb.COMPLETED;
                        arrayList.addAll(this.zzceI.zzceE.zza(com_google_android_gms_internal_zzbpj_zza.zzcfn, false, false, this.zzceI.zzcer));
                        final DataSnapshot zza = com.google.firebase.database.zza.zza(com.google.firebase.database.zza.zza(this, com_google_android_gms_internal_zzbpj_zza.zzcak), zzbrx.zzn(com_google_android_gms_internal_zzbpj_zza.zzcfq));
                        arrayList2.add(new Runnable(this) {
                            public void run() {
                                com_google_android_gms_internal_zzbpj_zza.zzcfh.onComplete(null, true, zza);
                            }
                        });
                        this.zzceI.zze(new zzbpx(this.zzceI, com_google_android_gms_internal_zzbpj_zza.zzcfi, zzbrc.zzN(com_google_android_gms_internal_zzbpj_zza.zzcak)));
                    }
                    this.zzceI.zzb(this.zzceI.zzceu.zzL(com_google_android_gms_internal_zzbph));
                    this.zzceI.zzZc();
                    this.zzZ(arrayList);
                    while (i < arrayList2.size()) {
                        this.zzceI.zzq((Runnable) arrayList2.get(i));
                        i++;
                    }
                    return;
                }
                if (zzat.getCode() == -1) {
                    for (zza com_google_android_gms_internal_zzbpj_zza2 : list) {
                        if (com_google_android_gms_internal_zzbpj_zza2.zzcfj == zzb.SENT_NEEDS_ABORT) {
                            com_google_android_gms_internal_zzbpj_zza2.zzcfj = zzb.NEEDS_ABORT;
                        } else {
                            com_google_android_gms_internal_zzbpj_zza2.zzcfj = zzb.RUN;
                        }
                    }
                } else {
                    for (zza com_google_android_gms_internal_zzbpj_zza22 : list) {
                        com_google_android_gms_internal_zzbpj_zza22.zzcfj = zzb.NEEDS_ABORT;
                        com_google_android_gms_internal_zzbpj_zza22.zzcfm = zzat;
                    }
                }
                this.zzceI.zzo(com_google_android_gms_internal_zzbph);
            }
        });
    }

    private void zza(final List<zza> list, zzbqs<List<zza>> com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza) {
        List list2 = (List) com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza.getValue();
        if (list2 != null) {
            list.addAll(list2);
        }
        com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza.zzb(new com.google.android.gms.internal.zzbqs.zzb<List<zza>>(this) {
            final /* synthetic */ zzbpj zzceI;

            public void zzd(zzbqs<List<zza>> com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza) {
                this.zzceI.zza(list, (zzbqs) com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza);
            }
        });
    }

    private static DatabaseError zzas(String str, String str2) {
        return str != null ? DatabaseError.zzap(str, str2) : null;
    }

    private zzbph zzb(zzbph com_google_android_gms_internal_zzbph, final int i) {
        zzbph zzWL = zzp(com_google_android_gms_internal_zzbph).zzWL();
        if (this.zzcez.zzaaC()) {
            zzbrn com_google_android_gms_internal_zzbrn = this.zzcey;
            String valueOf = String.valueOf(com_google_android_gms_internal_zzbph);
            String valueOf2 = String.valueOf(zzWL);
            com_google_android_gms_internal_zzbrn.zzi(new StringBuilder((String.valueOf(valueOf).length() + 44) + String.valueOf(valueOf2).length()).append("Aborting transactions for path: ").append(valueOf).append(". Affected: ").append(valueOf2).toString(), new Object[0]);
        }
        zzbqs zzL = this.zzceu.zzL(com_google_android_gms_internal_zzbph);
        zzL.zza(new com.google.android.gms.internal.zzbqs.zza<List<zza>>(this) {
            final /* synthetic */ zzbpj zzceI;

            public boolean zze(zzbqs<List<zza>> com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza) {
                this.zzceI.zza((zzbqs) com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza, i);
                return false;
            }
        });
        zza(zzL, i);
        zzL.zza(new com.google.android.gms.internal.zzbqs.zzb<List<zza>>(this) {
            final /* synthetic */ zzbpj zzceI;

            public void zzd(zzbqs<List<zza>> com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza) {
                this.zzceI.zza((zzbqs) com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza, i);
            }
        });
        return zzWL;
    }

    private void zzb(zzbqs<List<zza>> com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza) {
        List list = (List) com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza.getValue();
        if (list != null) {
            int i = 0;
            while (i < list.size()) {
                int i2;
                if (((zza) list.get(i)).zzcfj == zzb.COMPLETED) {
                    list.remove(i);
                    i2 = i;
                } else {
                    i2 = i + 1;
                }
                i = i2;
            }
            if (list.size() > 0) {
                com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza.setValue(list);
            } else {
                com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza.setValue(null);
            }
        }
        com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza.zzb(new C09819(this));
    }

    private void zzb(zzbrq com_google_android_gms_internal_zzbrq, Object obj) {
        if (com_google_android_gms_internal_zzbrq.equals(zzboz.zzcdT)) {
            this.zzcer.zzaS(((Long) obj).longValue());
        }
        zzbph com_google_android_gms_internal_zzbph = new zzbph(zzboz.zzcdS, com_google_android_gms_internal_zzbrq);
        try {
            zzbsc zzat = zzbsd.zzat(obj);
            this.zzces.zzg(com_google_android_gms_internal_zzbph, zzat);
            zzZ(this.zzceD.zzi(com_google_android_gms_internal_zzbph, zzat));
        } catch (Throwable e) {
            this.zzcey.zzd("Failed to parse info update", e);
        }
    }

    private void zzb(List<zza> list, zzbph com_google_android_gms_internal_zzbph) {
        if (!list.isEmpty()) {
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            for (zza zzc : list) {
                arrayList2.add(Long.valueOf(zzc.zzcfn));
            }
            for (final zza com_google_android_gms_internal_zzbpj_zza : list) {
                zzbph zza = zzbph.zza(com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzbpj_zza.zzcak);
                ArrayList arrayList3 = new ArrayList();
                if ($assertionsDisabled || zza != null) {
                    Object obj;
                    DatabaseError zzk;
                    if (com_google_android_gms_internal_zzbpj_zza.zzcfj == zzb.NEEDS_ABORT) {
                        obj = 1;
                        zzk = com_google_android_gms_internal_zzbpj_zza.zzcfm;
                        if (zzk.getCode() != -25) {
                            arrayList3.addAll(this.zzceE.zza(com_google_android_gms_internal_zzbpj_zza.zzcfn, true, false, this.zzcer));
                        }
                    } else if (com_google_android_gms_internal_zzbpj_zza.zzcfj != zzb.RUN) {
                        zzk = null;
                        obj = null;
                    } else if (com_google_android_gms_internal_zzbpj_zza.retryCount >= 25) {
                        obj = 1;
                        zzk = DatabaseError.zziD("maxretries");
                        arrayList3.addAll(this.zzceE.zza(com_google_android_gms_internal_zzbpj_zza.zzcfn, true, false, this.zzcer));
                    } else {
                        Result doTransaction;
                        zzbsc zza2 = zza(com_google_android_gms_internal_zzbpj_zza.zzcak, arrayList2);
                        com_google_android_gms_internal_zzbpj_zza.zzcfo = zza2;
                        try {
                            doTransaction = com_google_android_gms_internal_zzbpj_zza.zzcfh.doTransaction(com.google.firebase.database.zza.zza(zza2));
                            zzk = null;
                        } catch (Throwable th) {
                            DatabaseError fromException = DatabaseError.fromException(th);
                            doTransaction = Transaction.abort();
                            zzk = fromException;
                        }
                        if (doTransaction.isSuccess()) {
                            Long valueOf = Long.valueOf(com_google_android_gms_internal_zzbpj_zza.zzcfn);
                            Map zza3 = zzbpn.zza(this.zzcer);
                            zzbsc zzWH = doTransaction.zzWH();
                            zzbsc zza4 = zzbpn.zza(zzWH, zza3);
                            com_google_android_gms_internal_zzbpj_zza.zzcfp = zzWH;
                            com_google_android_gms_internal_zzbpj_zza.zzcfq = zza4;
                            com_google_android_gms_internal_zzbpj_zza.zzcfn = zzZa();
                            arrayList2.remove(valueOf);
                            arrayList3.addAll(this.zzceE.zza(com_google_android_gms_internal_zzbpj_zza.zzcak, zzWH, zza4, com_google_android_gms_internal_zzbpj_zza.zzcfn, com_google_android_gms_internal_zzbpj_zza.zzcfl, false));
                            arrayList3.addAll(this.zzceE.zza(valueOf.longValue(), true, false, this.zzcer));
                            zzk = null;
                            obj = null;
                        } else {
                            obj = 1;
                            arrayList3.addAll(this.zzceE.zza(com_google_android_gms_internal_zzbpj_zza.zzcfn, true, false, this.zzcer));
                        }
                    }
                    zzZ(arrayList3);
                    if (obj != null) {
                        com_google_android_gms_internal_zzbpj_zza.zzcfj = zzb.COMPLETED;
                        final DataSnapshot zza5 = com.google.firebase.database.zza.zza(com.google.firebase.database.zza.zza(this, com_google_android_gms_internal_zzbpj_zza.zzcak), zzbrx.zzn(com_google_android_gms_internal_zzbpj_zza.zzcfo));
                        zzs(new Runnable(this) {
                            final /* synthetic */ zzbpj zzceI;

                            public void run() {
                                this.zzceI.zze(new zzbpx(this.zzceI, com_google_android_gms_internal_zzbpj_zza.zzcfi, zzbrc.zzN(com_google_android_gms_internal_zzbpj_zza.zzcak)));
                            }
                        });
                        arrayList.add(new Runnable(this) {
                            public void run() {
                                com_google_android_gms_internal_zzbpj_zza.zzcfh.onComplete(zzk, false, zza5);
                            }
                        });
                    }
                } else {
                    throw new AssertionError();
                }
            }
            zzb(this.zzceu);
            for (int i = 0; i < arrayList.size(); i++) {
                zzq((Runnable) arrayList.get(i));
            }
            zzZc();
        }
    }

    private List<zza> zzc(zzbqs<List<zza>> com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza) {
        List arrayList = new ArrayList();
        zza(arrayList, (zzbqs) com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza);
        Collections.sort(arrayList);
        return arrayList;
    }

    private zzbsc zzn(zzbph com_google_android_gms_internal_zzbph) {
        return zza(com_google_android_gms_internal_zzbph, new ArrayList());
    }

    private zzbph zzo(zzbph com_google_android_gms_internal_zzbph) {
        zzbqs zzp = zzp(com_google_android_gms_internal_zzbph);
        zzbph zzWL = zzp.zzWL();
        zzb(zzc(zzp), zzWL);
        return zzWL;
    }

    private zzbqs<List<zza>> zzp(zzbph com_google_android_gms_internal_zzbph) {
        zzbqs<List<zza>> com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza = this.zzceu;
        while (!com_google_android_gms_internal_zzbph.isEmpty() && com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza.getValue() == null) {
            com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza = com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza.zzL(new zzbph(com_google_android_gms_internal_zzbph.zzYR()));
            com_google_android_gms_internal_zzbph = com_google_android_gms_internal_zzbph.zzYS();
        }
        return com_google_android_gms_internal_zzbqs_java_util_List_com_google_android_gms_internal_zzbpj_zza;
    }

    public FirebaseDatabase getDatabase() {
        return this.zzceF;
    }

    void interrupt() {
        this.zzcdk.interrupt("repo_interrupt");
    }

    public void onDisconnect() {
        zza(zzboz.zzcdV, Boolean.valueOf(false));
        zzZb();
    }

    public void purgeOutstandingWrites() {
        if (this.zzcey.zzaaC()) {
            this.zzcey.zzi("Purging writes", new Object[0]);
        }
        zzZ(this.zzceE.zzZi());
        zzb(zzbph.zzYO(), -25);
        this.zzcdk.purgeOutstandingWrites();
    }

    void resume() {
        this.zzcdk.resume("repo_interrupt");
    }

    public String toString() {
        return this.zzcab.toString();
    }

    public void zzXy() {
        zza(zzboz.zzcdV, Boolean.valueOf(true));
    }

    public zzbpk zzYX() {
        return this.zzcab;
    }

    public long zzYY() {
        return this.zzcer.zzabH();
    }

    boolean zzYZ() {
        return (this.zzceD.isEmpty() && this.zzceE.isEmpty()) ? false : true;
    }

    public void zza(zzbph com_google_android_gms_internal_zzbph, zzboy com_google_android_gms_internal_zzboy, CompletionListener completionListener, Map<String, Object> map) {
        if (this.zzcey.zzaaC()) {
            zzbrn com_google_android_gms_internal_zzbrn = this.zzcey;
            String valueOf = String.valueOf(com_google_android_gms_internal_zzbph);
            com_google_android_gms_internal_zzbrn.zzi(new StringBuilder(String.valueOf(valueOf).length() + 8).append("update: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.zzceA.zzaaC()) {
            com_google_android_gms_internal_zzbrn = this.zzceA;
            valueOf = String.valueOf(com_google_android_gms_internal_zzbph);
            String valueOf2 = String.valueOf(map);
            com_google_android_gms_internal_zzbrn.zzi(new StringBuilder((String.valueOf(valueOf).length() + 9) + String.valueOf(valueOf2).length()).append("update: ").append(valueOf).append(" ").append(valueOf2).toString(), new Object[0]);
        }
        if (com_google_android_gms_internal_zzboy.isEmpty()) {
            if (this.zzcey.zzaaC()) {
                this.zzcey.zzi("update called with no changes. No-op", new Object[0]);
            }
            zza(completionListener, null, com_google_android_gms_internal_zzbph);
            return;
        }
        zzboy zza = zzbpn.zza(com_google_android_gms_internal_zzboy, zzbpn.zza(this.zzcer));
        final long zzZa = zzZa();
        zzZ(this.zzceE.zza(com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzboy, zza, zzZa, true));
        final zzbph com_google_android_gms_internal_zzbph2 = com_google_android_gms_internal_zzbph;
        final CompletionListener completionListener2 = completionListener;
        this.zzcdk.zza(com_google_android_gms_internal_zzbph.zzYQ(), (Map) map, new zzbos(this) {
            final /* synthetic */ zzbpj zzceI;

            public void zzar(String str, String str2) {
                DatabaseError zzat = zzbpj.zzas(str, str2);
                this.zzceI.zza("updateChildren", com_google_android_gms_internal_zzbph2, zzat);
                this.zzceI.zza(zzZa, com_google_android_gms_internal_zzbph2, zzat);
                this.zzceI.zza(completionListener2, zzat, com_google_android_gms_internal_zzbph2);
            }
        });
        Iterator it = com_google_android_gms_internal_zzboy.iterator();
        while (it.hasNext()) {
            zzo(zzb(com_google_android_gms_internal_zzbph.zzh((zzbph) ((Entry) it.next()).getKey()), -9));
        }
    }

    public void zza(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc, CompletionListener completionListener) {
        if (this.zzcey.zzaaC()) {
            zzbrn com_google_android_gms_internal_zzbrn = this.zzcey;
            String valueOf = String.valueOf(com_google_android_gms_internal_zzbph);
            com_google_android_gms_internal_zzbrn.zzi(new StringBuilder(String.valueOf(valueOf).length() + 5).append("set: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.zzceA.zzaaC()) {
            com_google_android_gms_internal_zzbrn = this.zzceA;
            valueOf = String.valueOf(com_google_android_gms_internal_zzbph);
            String valueOf2 = String.valueOf(com_google_android_gms_internal_zzbsc);
            com_google_android_gms_internal_zzbrn.zzi(new StringBuilder((String.valueOf(valueOf).length() + 6) + String.valueOf(valueOf2).length()).append("set: ").append(valueOf).append(" ").append(valueOf2).toString(), new Object[0]);
        }
        zzbsc zza = zzbpn.zza(com_google_android_gms_internal_zzbsc, zzbpn.zza(this.zzcer));
        final long zzZa = zzZa();
        zzZ(this.zzceE.zza(com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzbsc, zza, zzZa, true, true));
        final zzbph com_google_android_gms_internal_zzbph2 = com_google_android_gms_internal_zzbph;
        final CompletionListener completionListener2 = completionListener;
        this.zzcdk.zza(com_google_android_gms_internal_zzbph.zzYQ(), com_google_android_gms_internal_zzbsc.getValue(true), new zzbos(this) {
            final /* synthetic */ zzbpj zzceI;

            public void zzar(String str, String str2) {
                DatabaseError zzat = zzbpj.zzas(str, str2);
                this.zzceI.zza("setValue", com_google_android_gms_internal_zzbph2, zzat);
                this.zzceI.zza(zzZa, com_google_android_gms_internal_zzbph2, zzat);
                this.zzceI.zza(completionListener2, zzat, com_google_android_gms_internal_zzbph2);
            }
        });
        zzo(zzb(com_google_android_gms_internal_zzbph, -9));
    }

    public void zza(final zzbph com_google_android_gms_internal_zzbph, final CompletionListener completionListener) {
        this.zzcdk.zza(com_google_android_gms_internal_zzbph.zzYQ(), new zzbos(this) {
            final /* synthetic */ zzbpj zzceI;

            public void zzar(String str, String str2) {
                DatabaseError zzat = zzbpj.zzas(str, str2);
                if (zzat == null) {
                    this.zzceI.zzcet.zzr(com_google_android_gms_internal_zzbph);
                }
                this.zzceI.zza(completionListener, zzat, com_google_android_gms_internal_zzbph);
            }
        });
    }

    public void zza(zzbph com_google_android_gms_internal_zzbph, final Handler handler, boolean z) {
        if (this.zzcey.zzaaC()) {
            zzbrn com_google_android_gms_internal_zzbrn = this.zzcey;
            String valueOf = String.valueOf(com_google_android_gms_internal_zzbph);
            com_google_android_gms_internal_zzbrn.zzi(new StringBuilder(String.valueOf(valueOf).length() + 13).append("transaction: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.zzceA.zzaaC()) {
            com_google_android_gms_internal_zzbrn = this.zzcey;
            valueOf = String.valueOf(com_google_android_gms_internal_zzbph);
            com_google_android_gms_internal_zzbrn.zzi(new StringBuilder(String.valueOf(valueOf).length() + 13).append("transaction: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.zzcex.zzXt() && !this.zzceG) {
            this.zzceG = true;
            this.zzcez.info("runTransaction() usage detected while persistence is enabled. Please be aware that transactions *will not* be persisted across database restarts.  See https://www.firebase.com/docs/android/guide/offline-capabilities.html#section-handling-transactions-offline for more details.");
        }
        DatabaseReference zza = com.google.firebase.database.zza.zza(this, com_google_android_gms_internal_zzbph);
        ValueEventListener c09785 = new C09785(this);
        zzf(new zzbpx(this, c09785, zza.zzWM()));
        zza com_google_android_gms_internal_zzbpj_zza = new zza(com_google_android_gms_internal_zzbph, handler, c09785, zzb.INITIALIZING, z, zzZd());
        zzbsc zzn = zzn(com_google_android_gms_internal_zzbph);
        com_google_android_gms_internal_zzbpj_zza.zzcfo = zzn;
        Result result;
        DatabaseError databaseError;
        try {
            Result doTransaction = handler.doTransaction(com.google.firebase.database.zza.zza(zzn));
            if (doTransaction == null) {
                throw new NullPointerException("Transaction returned null as result");
            }
            result = doTransaction;
            databaseError = null;
            if (result.isSuccess()) {
                com_google_android_gms_internal_zzbpj_zza.zzcfj = zzb.RUN;
                zzbqs zzL = this.zzceu.zzL(com_google_android_gms_internal_zzbph);
                List list = (List) zzL.getValue();
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(com_google_android_gms_internal_zzbpj_zza);
                zzL.setValue(list);
                Map zza2 = zzbpn.zza(this.zzcer);
                zzbsc zzWH = result.zzWH();
                zzbsc zza3 = zzbpn.zza(zzWH, zza2);
                com_google_android_gms_internal_zzbpj_zza.zzcfp = zzWH;
                com_google_android_gms_internal_zzbpj_zza.zzcfq = zza3;
                com_google_android_gms_internal_zzbpj_zza.zzcfn = zzZa();
                zzZ(this.zzceE.zza(com_google_android_gms_internal_zzbph, zzWH, zza3, com_google_android_gms_internal_zzbpj_zza.zzcfn, z, false));
                zzZc();
                return;
            }
            com_google_android_gms_internal_zzbpj_zza.zzcfp = null;
            com_google_android_gms_internal_zzbpj_zza.zzcfq = null;
            final DataSnapshot zza4 = com.google.firebase.database.zza.zza(zza, zzbrx.zzn(com_google_android_gms_internal_zzbpj_zza.zzcfo));
            zzq(new Runnable(this) {
                public void run() {
                    handler.onComplete(databaseError, false, zza4);
                }
            });
        } catch (Throwable th) {
            DatabaseError fromException = DatabaseError.fromException(th);
            databaseError = fromException;
            result = Transaction.abort();
        }
    }

    public void zza(final zzbph com_google_android_gms_internal_zzbph, final Map<zzbph, zzbsc> map, final CompletionListener completionListener, Map<String, Object> map2) {
        this.zzcdk.zzb(com_google_android_gms_internal_zzbph.zzYQ(), (Map) map2, new zzbos(this) {
            final /* synthetic */ zzbpj zzceI;

            public void zzar(String str, String str2) {
                DatabaseError zzat = zzbpj.zzas(str, str2);
                this.zzceI.zza("onDisconnect().updateChildren", com_google_android_gms_internal_zzbph, zzat);
                if (zzat == null) {
                    for (Entry entry : map.entrySet()) {
                        this.zzceI.zzcet.zzh(com_google_android_gms_internal_zzbph.zzh((zzbph) entry.getKey()), (zzbsc) entry.getValue());
                    }
                }
                this.zzceI.zza(completionListener, zzat, com_google_android_gms_internal_zzbph);
            }
        });
    }

    public void zza(zzbrc com_google_android_gms_internal_zzbrc, boolean z) {
        if ($assertionsDisabled || com_google_android_gms_internal_zzbrc.zzWL().isEmpty() || !com_google_android_gms_internal_zzbrc.zzWL().zzYR().equals(zzboz.zzcdS)) {
            this.zzceE.zza(com_google_android_gms_internal_zzbrc, z);
            return;
        }
        throw new AssertionError();
    }

    public void zza(zzbrq com_google_android_gms_internal_zzbrq, Object obj) {
        zzb(com_google_android_gms_internal_zzbrq, obj);
    }

    void zza(final CompletionListener completionListener, final DatabaseError databaseError, zzbph com_google_android_gms_internal_zzbph) {
        if (completionListener != null) {
            zzbrq zzYU = com_google_android_gms_internal_zzbph.zzYU();
            final DatabaseReference zza = (zzYU == null || !zzYU.zzaaJ()) ? com.google.firebase.database.zza.zza(this, com_google_android_gms_internal_zzbph) : com.google.firebase.database.zza.zza(this, com_google_android_gms_internal_zzbph.zzYT());
            zzq(new Runnable(this) {
                public void run() {
                    completionListener.onComplete(databaseError, zza);
                }
            });
        }
    }

    public void zza(List<String> list, Object obj, boolean z, Long l) {
        List zza;
        zzbph com_google_android_gms_internal_zzbph = new zzbph((List) list);
        if (this.zzcey.zzaaC()) {
            zzbrn com_google_android_gms_internal_zzbrn = this.zzcey;
            String valueOf = String.valueOf(com_google_android_gms_internal_zzbph);
            com_google_android_gms_internal_zzbrn.zzi(new StringBuilder(String.valueOf(valueOf).length() + 14).append("onDataUpdate: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.zzceA.zzaaC()) {
            com_google_android_gms_internal_zzbrn = this.zzcey;
            valueOf = String.valueOf(com_google_android_gms_internal_zzbph);
            String valueOf2 = String.valueOf(obj);
            com_google_android_gms_internal_zzbrn.zzi(new StringBuilder((String.valueOf(valueOf).length() + 15) + String.valueOf(valueOf2).length()).append("onDataUpdate: ").append(valueOf).append(" ").append(valueOf2).toString(), new Object[0]);
        }
        this.zzceB++;
        if (l != null) {
            try {
                zzbps com_google_android_gms_internal_zzbps = new zzbps(l.longValue());
                if (z) {
                    Map hashMap = new HashMap();
                    for (Entry entry : ((Map) obj).entrySet()) {
                        hashMap.put(new zzbph((String) entry.getKey()), zzbsd.zzat(entry.getValue()));
                    }
                    zza = this.zzceE.zza(com_google_android_gms_internal_zzbph, hashMap, com_google_android_gms_internal_zzbps);
                } else {
                    zza = this.zzceE.zza(com_google_android_gms_internal_zzbph, zzbsd.zzat(obj), com_google_android_gms_internal_zzbps);
                }
            } catch (Throwable e) {
                this.zzcey.zzd("FIREBASE INTERNAL ERROR", e);
                return;
            }
        } else if (z) {
            Map hashMap2 = new HashMap();
            for (Entry entry2 : ((Map) obj).entrySet()) {
                hashMap2.put(new zzbph((String) entry2.getKey()), zzbsd.zzat(entry2.getValue()));
            }
            zza = this.zzceE.zza(com_google_android_gms_internal_zzbph, hashMap2);
        } else {
            zza = this.zzceE.zzi(com_google_android_gms_internal_zzbph, zzbsd.zzat(obj));
        }
        if (zza.size() > 0) {
            zzo(com_google_android_gms_internal_zzbph);
        }
        zzZ(zza);
    }

    public void zza(List<String> list, List<zzbor> list2, Long l) {
        zzbph com_google_android_gms_internal_zzbph = new zzbph((List) list);
        if (this.zzcey.zzaaC()) {
            zzbrn com_google_android_gms_internal_zzbrn = this.zzcey;
            String valueOf = String.valueOf(com_google_android_gms_internal_zzbph);
            com_google_android_gms_internal_zzbrn.zzi(new StringBuilder(String.valueOf(valueOf).length() + 20).append("onRangeMergeUpdate: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.zzceA.zzaaC()) {
            com_google_android_gms_internal_zzbrn = this.zzcey;
            valueOf = String.valueOf(com_google_android_gms_internal_zzbph);
            String valueOf2 = String.valueOf(list2);
            com_google_android_gms_internal_zzbrn.zzi(new StringBuilder((String.valueOf(valueOf).length() + 21) + String.valueOf(valueOf2).length()).append("onRangeMergeUpdate: ").append(valueOf).append(" ").append(valueOf2).toString(), new Object[0]);
        }
        this.zzceB++;
        List arrayList = new ArrayList(list2.size());
        for (zzbor com_google_android_gms_internal_zzbsh : list2) {
            arrayList.add(new zzbsh(com_google_android_gms_internal_zzbsh));
        }
        List zza = l != null ? this.zzceE.zza(com_google_android_gms_internal_zzbph, arrayList, new zzbps(l.longValue())) : this.zzceE.zzb(com_google_android_gms_internal_zzbph, arrayList);
        if (zza.size() > 0) {
            zzo(com_google_android_gms_internal_zzbph);
        }
        zzZ(zza);
    }

    public void zzax(Map<String, Object> map) {
        for (Entry entry : map.entrySet()) {
            zzb(zzbrq.zzja((String) entry.getKey()), entry.getValue());
        }
    }

    public void zzb(final zzbph com_google_android_gms_internal_zzbph, final zzbsc com_google_android_gms_internal_zzbsc, final CompletionListener completionListener) {
        this.zzcdk.zzb(com_google_android_gms_internal_zzbph.zzYQ(), com_google_android_gms_internal_zzbsc.getValue(true), new zzbos(this) {
            final /* synthetic */ zzbpj zzceI;

            public void zzar(String str, String str2) {
                DatabaseError zzat = zzbpj.zzas(str, str2);
                this.zzceI.zza("onDisconnect().setValue", com_google_android_gms_internal_zzbph, zzat);
                if (zzat == null) {
                    this.zzceI.zzcet.zzh(com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzbsc);
                }
                this.zzceI.zza(completionListener, zzat, com_google_android_gms_internal_zzbph);
            }
        });
    }

    public void zzbc(boolean z) {
        zza(zzboz.zzcdU, Boolean.valueOf(z));
    }

    public void zze(zzbpc com_google_android_gms_internal_zzbpc) {
        zzZ(zzboz.zzcdS.equals(com_google_android_gms_internal_zzbpc.zzYm().zzWL().zzYR()) ? this.zzceD.zzh(com_google_android_gms_internal_zzbpc) : this.zzceE.zzh(com_google_android_gms_internal_zzbpc));
    }

    public void zzf(zzbpc com_google_android_gms_internal_zzbpc) {
        zzbrq zzYR = com_google_android_gms_internal_zzbpc.zzYm().zzWL().zzYR();
        List zzg = (zzYR == null || !zzYR.equals(zzboz.zzcdS)) ? this.zzceE.zzg(com_google_android_gms_internal_zzbpc) : this.zzceD.zzg(com_google_android_gms_internal_zzbpc);
        zzZ(zzg);
    }

    public void zzq(Runnable runnable) {
        this.zzcex.zzYt();
        this.zzcex.zzYz().zzq(runnable);
    }

    public void zzs(Runnable runnable) {
        this.zzcex.zzYt();
        this.zzcex.zzYA().zzs(runnable);
    }
}
