package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzw;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.Callable;

@zzme
public class zzpv {
    private static zzm zzYm;
    private static final Object zzYn = new Object();
    public static final zza<Void> zzYo = new C11191();

    public interface zza<T> {
        T zzh(InputStream inputStream);

        T zzji();
    }

    class C11191 implements zza<Void> {
        C11191() {
        }

        public /* bridge */ /* synthetic */ Object zzh(InputStream inputStream) {
            return null;
        }

        public /* bridge */ /* synthetic */ Object zzji() {
            return null;
        }
    }

    private static class zzb<T> extends zzl<InputStream> {
        private final zza<T> zzYs;
        private final com.google.android.gms.internal.zzn.zzb<T> zzaG;

        class C11211 implements com.google.android.gms.internal.zzn.zza {
            final /* synthetic */ com.google.android.gms.internal.zzn.zzb zzYt;
            final /* synthetic */ zza zzYu;

            C11211(com.google.android.gms.internal.zzn.zzb com_google_android_gms_internal_zzn_zzb, zza com_google_android_gms_internal_zzpv_zza) {
                this.zzYt = com_google_android_gms_internal_zzn_zzb;
                this.zzYu = com_google_android_gms_internal_zzpv_zza;
            }

            public void zze(zzs com_google_android_gms_internal_zzs) {
                this.zzYt.zzb(this.zzYu.zzji());
            }
        }

        public zzb(String str, zza<T> com_google_android_gms_internal_zzpv_zza_T, com.google.android.gms.internal.zzn.zzb<T> com_google_android_gms_internal_zzn_zzb_T) {
            super(0, str, new C11211(com_google_android_gms_internal_zzn_zzb_T, com_google_android_gms_internal_zzpv_zza_T));
            this.zzYs = com_google_android_gms_internal_zzpv_zza_T;
            this.zzaG = com_google_android_gms_internal_zzn_zzb_T;
        }

        protected zzn<InputStream> zza(zzj com_google_android_gms_internal_zzj) {
            return zzn.zza(new ByteArrayInputStream(com_google_android_gms_internal_zzj.data), zzy.zzb(com_google_android_gms_internal_zzj));
        }

        protected /* synthetic */ void zza(Object obj) {
            zzi((InputStream) obj);
        }

        protected void zzi(final InputStream inputStream) {
            final zzqm zza = zzpn.zza(new Callable<T>(this) {
                final /* synthetic */ zzb zzYw;

                public T call() {
                    return this.zzYw.zzYs.zzh(inputStream);
                }
            });
            zza.zzd(new Runnable(this) {
                final /* synthetic */ zzb zzYw;

                public void run() {
                    try {
                        this.zzYw.zzaG.zzb(zza.get());
                    } catch (Throwable e) {
                        zzqf.zzb("Error occured while dispatching http response in getter.", e);
                        zzw.zzcQ().zza(e, "HttpGetter.deliverResponse.1");
                    }
                }
            });
        }
    }

    private class zzc<T> extends zzqj<T> implements com.google.android.gms.internal.zzn.zzb<T> {
        private zzc(zzpv com_google_android_gms_internal_zzpv) {
        }

        public void zzb(@Nullable T t) {
            super.zzh(t);
        }
    }

    public zzpv(Context context) {
        zzZ(context);
    }

    private static zzm zzZ(Context context) {
        zzm com_google_android_gms_internal_zzm;
        synchronized (zzYn) {
            if (zzYm == null) {
                zzYm = zzad.zza(context.getApplicationContext());
            }
            com_google_android_gms_internal_zzm = zzYm;
        }
        return com_google_android_gms_internal_zzm;
    }

    public zzqm<String> zza(int i, final String str, @Nullable Map<String, String> map, @Nullable byte[] bArr) {
        final Object com_google_android_gms_internal_zzpv_zzc = new zzc();
        final byte[] bArr2 = bArr;
        final Map<String, String> map2 = map;
        zzYm.zze(new zzac(this, i, str, com_google_android_gms_internal_zzpv_zzc, new com.google.android.gms.internal.zzn.zza(this) {
            public void zze(zzs com_google_android_gms_internal_zzs) {
                String str = str;
                String valueOf = String.valueOf(com_google_android_gms_internal_zzs.toString());
                zzqf.zzbh(new StringBuilder((String.valueOf(str).length() + 21) + String.valueOf(valueOf).length()).append("Failed to load URL: ").append(str).append("\n").append(valueOf).toString());
                com_google_android_gms_internal_zzpv_zzc.zzb(null);
            }
        }) {
            public Map<String, String> getHeaders() throws zza {
                return map2 == null ? super.getHeaders() : map2;
            }

            public byte[] zzm() throws zza {
                return bArr2 == null ? super.zzm() : bArr2;
            }
        });
        return com_google_android_gms_internal_zzpv_zzc;
    }

    public <T> zzqm<T> zza(String str, zza<T> com_google_android_gms_internal_zzpv_zza_T) {
        Object com_google_android_gms_internal_zzpv_zzc = new zzc();
        zzYm.zze(new zzb(str, com_google_android_gms_internal_zzpv_zza_T, com_google_android_gms_internal_zzpv_zzc));
        return com_google_android_gms_internal_zzpv_zzc;
    }

    public zzqm<String> zzc(String str, Map<String, String> map) {
        return zza(0, str, map, null);
    }
}
