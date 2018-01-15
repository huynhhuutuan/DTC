package com.google.firebase.database;

import com.google.android.gms.internal.zzbph;
import com.google.android.gms.internal.zzbpj;
import com.google.android.gms.internal.zzbpw;
import com.google.android.gms.internal.zzbsc;
import com.google.android.gms.internal.zzbsd;
import com.google.android.gms.internal.zzbsg;
import com.google.android.gms.internal.zzbtb;
import com.google.android.gms.internal.zzbte;
import com.google.android.gms.internal.zzbtf;
import com.google.android.gms.internal.zzbtg;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference.CompletionListener;
import java.util.Map;

public class OnDisconnect {
    private zzbpj zzcad;
    private zzbph zzcak;

    OnDisconnect(zzbpj com_google_android_gms_internal_zzbpj, zzbph com_google_android_gms_internal_zzbph) {
        this.zzcad = com_google_android_gms_internal_zzbpj;
        this.zzcak = com_google_android_gms_internal_zzbph;
    }

    private Task<Void> zza(CompletionListener completionListener) {
        final zzbtb zzb = zzbte.zzb(completionListener);
        this.zzcad.zzs(new Runnable(this) {
            final /* synthetic */ OnDisconnect zzcal;

            public void run() {
                this.zzcal.zzcad.zza(this.zzcal.zzcak, (CompletionListener) zzb.zzabI());
            }
        });
        return (Task) zzb.getFirst();
    }

    private Task<Void> zza(final Map<String, Object> map, CompletionListener completionListener) {
        final Map zzc = zzbtf.zzc(this.zzcak, map);
        final zzbtb zzb = zzbte.zzb(completionListener);
        this.zzcad.zzs(new Runnable(this) {
            final /* synthetic */ OnDisconnect zzcal;

            public void run() {
                this.zzcal.zzcad.zza(this.zzcal.zzcak, zzc, (CompletionListener) zzb.zzabI(), map);
            }
        });
        return (Task) zzb.getFirst();
    }

    private Task<Void> zzb(Object obj, zzbsc com_google_android_gms_internal_zzbsc, CompletionListener completionListener) {
        zzbtf.zzQ(this.zzcak);
        zzbpw.zza(this.zzcak, obj);
        Object zzay = zzbtg.zzay(obj);
        zzbtf.zzax(zzay);
        final zzbsc zza = zzbsd.zza(zzay, com_google_android_gms_internal_zzbsc);
        final zzbtb zzb = zzbte.zzb(completionListener);
        this.zzcad.zzs(new Runnable(this) {
            final /* synthetic */ OnDisconnect zzcal;

            public void run() {
                this.zzcal.zzcad.zzb(this.zzcal.zzcak, zza, (CompletionListener) zzb.zzabI());
            }
        });
        return (Task) zzb.getFirst();
    }

    public Task<Void> cancel() {
        return zza(null);
    }

    public void cancel(CompletionListener completionListener) {
        zza(completionListener);
    }

    public Task<Void> removeValue() {
        return setValue(null);
    }

    public void removeValue(CompletionListener completionListener) {
        setValue(null, completionListener);
    }

    public Task<Void> setValue(Object obj) {
        return zzb(obj, zzbsg.zzabk(), null);
    }

    public Task<Void> setValue(Object obj, double d) {
        return zzb(obj, zzbsg.zzau(Double.valueOf(d)), null);
    }

    public Task<Void> setValue(Object obj, String str) {
        return zzb(obj, zzbsg.zzau(str), null);
    }

    public void setValue(Object obj, double d, CompletionListener completionListener) {
        zzb(obj, zzbsg.zzau(Double.valueOf(d)), completionListener);
    }

    public void setValue(Object obj, CompletionListener completionListener) {
        zzb(obj, zzbsg.zzabk(), completionListener);
    }

    public void setValue(Object obj, String str, CompletionListener completionListener) {
        zzb(obj, zzbsg.zzau(str), completionListener);
    }

    public void setValue(Object obj, Map map, CompletionListener completionListener) {
        zzb(obj, zzbsg.zzau(map), completionListener);
    }

    public Task<Void> updateChildren(Map<String, Object> map) {
        return zza(map, null);
    }

    public void updateChildren(Map<String, Object> map, CompletionListener completionListener) {
        zza(map, completionListener);
    }
}
