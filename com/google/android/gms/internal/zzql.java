package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@zzme
public class zzql {

    class C06441 implements Runnable {
        final /* synthetic */ zzqj zzZd;
        final /* synthetic */ zza zzZe;
        final /* synthetic */ zzqm zzZf;

        C06441(zzqj com_google_android_gms_internal_zzqj, zza com_google_android_gms_internal_zzql_zza, zzqm com_google_android_gms_internal_zzqm) {
            this.zzZd = com_google_android_gms_internal_zzqj;
            this.zzZe = com_google_android_gms_internal_zzql_zza;
            this.zzZf = com_google_android_gms_internal_zzqm;
        }

        public void run() {
            try {
                this.zzZd.zzh(this.zzZe.apply(this.zzZf.get()));
                return;
            } catch (CancellationException e) {
            } catch (InterruptedException e2) {
            } catch (ExecutionException e3) {
            }
            this.zzZd.cancel(true);
        }
    }

    class C06452 implements Runnable {
        final /* synthetic */ AtomicInteger zzZg;
        final /* synthetic */ int zzZh;
        final /* synthetic */ zzqj zzZi;
        final /* synthetic */ List zzZj;

        C06452(AtomicInteger atomicInteger, int i, zzqj com_google_android_gms_internal_zzqj, List list) {
            this.zzZg = atomicInteger;
            this.zzZh = i;
            this.zzZi = com_google_android_gms_internal_zzqj;
            this.zzZj = list;
        }

        public void run() {
            Throwable e;
            if (this.zzZg.incrementAndGet() >= this.zzZh) {
                try {
                    this.zzZi.zzh(zzql.zzp(this.zzZj));
                    return;
                } catch (ExecutionException e2) {
                    e = e2;
                } catch (InterruptedException e3) {
                    e = e3;
                }
            } else {
                return;
            }
            zzqf.zzc("Unable to convert list of futures to a future of list", e);
        }
    }

    public interface zza<D, R> {
        R apply(D d);
    }

    public static <A, B> zzqm<B> zza(zzqm<A> com_google_android_gms_internal_zzqm_A, zza<A, B> com_google_android_gms_internal_zzql_zza_A__B) {
        zzqm com_google_android_gms_internal_zzqj = new zzqj();
        com_google_android_gms_internal_zzqm_A.zzc(new C06441(com_google_android_gms_internal_zzqj, com_google_android_gms_internal_zzql_zza_A__B, com_google_android_gms_internal_zzqm_A));
        return com_google_android_gms_internal_zzqj;
    }

    public static <T> T zza(Future<T> future, T t, int i, TimeUnit timeUnit) {
        try {
            t = future.get((long) i, timeUnit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (Exception e2) {
        }
        return t;
    }

    public static <V> zzqm<List<V>> zzo(List<zzqm<V>> list) {
        zzqm com_google_android_gms_internal_zzqj = new zzqj();
        int size = list.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (zzqm zzc : list) {
            zzc.zzc(new C06452(atomicInteger, size, com_google_android_gms_internal_zzqj, list));
        }
        return com_google_android_gms_internal_zzqj;
    }

    private static <V> List<V> zzp(List<zzqm<V>> list) throws ExecutionException, InterruptedException {
        List<V> arrayList = new ArrayList();
        for (zzqm com_google_android_gms_internal_zzqm : list) {
            Object obj = com_google_android_gms_internal_zzqm.get();
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
