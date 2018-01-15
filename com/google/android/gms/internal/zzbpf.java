package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbop.zza;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

enum zzbpf implements zzbpi {
    INSTANCE;
    
    static ThreadFactory zzcej;
    static final zzbpt zzcek = null;

    class C09721 implements zzbpt {
        C09721() {
        }

        public void zza(Thread thread, String str) {
        }

        public void zza(Thread thread, UncaughtExceptionHandler uncaughtExceptionHandler) {
            thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }

        public void zza(Thread thread, boolean z) {
        }
    }

    class C09732 implements zzbsl {
        C09732(zzbpf com_google_android_gms_internal_zzbpf) {
        }

        public void zza(Thread thread, String str) {
            zzbpf.zzcek.zza(thread, str);
        }
    }

    static {
        zzcek = new C09721();
    }

    public static boolean isActive() {
        return zzYM() != null;
    }

    private static ThreadFactory zzYM() {
        if (zzcej == null) {
            try {
                Class cls = Class.forName("com.google.appengine.api.ThreadManager");
                if (cls != null) {
                    zzcej = (ThreadFactory) cls.getMethod("backgroundThreadFactory", new Class[0]).invoke(null, new Object[0]);
                }
            } catch (ClassNotFoundException e) {
                return null;
            } catch (Throwable e2) {
                throw new RuntimeException(e2);
            } catch (Throwable e22) {
                throw new RuntimeException(e22);
            } catch (Throwable e222) {
                throw new RuntimeException(e222);
            }
        }
        return zzcej;
    }

    public void initialize() {
        zzbsm.zza(zzcej, new C09732(this));
    }

    public zzbop zza(zzbpa com_google_android_gms_internal_zzbpa, zzbol com_google_android_gms_internal_zzbol, zzbon com_google_android_gms_internal_zzbon, zza com_google_android_gms_internal_zzbop_zza) {
        return new zzboq(com_google_android_gms_internal_zzbpa.zzYx(), com_google_android_gms_internal_zzbon, com_google_android_gms_internal_zzbop_zza);
    }

    public zzbow zza(ScheduledExecutorService scheduledExecutorService) {
        throw new RuntimeException("Authentication is not implemented yet");
    }

    public zzbpe zza(zzbpa com_google_android_gms_internal_zzbpa) {
        return new zzbpu(zzYM(), zzcek);
    }

    public zzbql zza(zzbpa com_google_android_gms_internal_zzbpa, String str) {
        return null;
    }

    public zzbro zza(zzbpa com_google_android_gms_internal_zzbpa, zzbro.zza com_google_android_gms_internal_zzbro_zza, List<String> list) {
        return new zzbrm(com_google_android_gms_internal_zzbro_zza, list);
    }

    public zzbpm zzb(zzbpa com_google_android_gms_internal_zzbpa) {
        final zzbrn zziV = com_google_android_gms_internal_zzbpa.zziV("RunLoop");
        return new zzbsy(this) {
            protected ThreadFactory getThreadFactory() {
                return zzbpf.zzcej;
            }

            protected zzbpt zzYN() {
                return zzbpf.zzcek;
            }

            public void zzj(Throwable th) {
                zziV.zzd(zzbsy.zzl(th), th);
            }
        };
    }

    public String zzc(zzbpa com_google_android_gms_internal_zzbpa) {
        String str = "AppEngine";
        String property = System.getProperty("java.specification.version", "Unknown");
        return new StringBuilder((String.valueOf(property).length() + 1) + String.valueOf(str).length()).append(property).append("/").append(str).toString();
    }
}
