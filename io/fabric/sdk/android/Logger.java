package io.fabric.sdk.android;

public interface Logger {
    void mo3506d(String str, String str2);

    void mo3507d(String str, String str2, Throwable th);

    void mo3508e(String str, String str2);

    void mo3509e(String str, String str2, Throwable th);

    int getLogLevel();

    void mo3511i(String str, String str2);

    void mo3512i(String str, String str2, Throwable th);

    boolean isLoggable(String str, int i);

    void log(int i, String str, String str2);

    void log(int i, String str, String str2, boolean z);

    void setLogLevel(int i);

    void mo3517v(String str, String str2);

    void mo3518v(String str, String str2, Throwable th);

    void mo3519w(String str, String str2);

    void mo3520w(String str, String str2, Throwable th);
}
