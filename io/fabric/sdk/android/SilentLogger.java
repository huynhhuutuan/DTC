package io.fabric.sdk.android;

public class SilentLogger implements Logger {
    private int logLevel = 7;

    public boolean isLoggable(String tag, int level) {
        return false;
    }

    public void mo3507d(String tag, String text, Throwable throwable) {
    }

    public void mo3518v(String tag, String text, Throwable throwable) {
    }

    public void mo3512i(String tag, String text, Throwable throwable) {
    }

    public void mo3520w(String tag, String text, Throwable throwable) {
    }

    public void mo3509e(String tag, String text, Throwable throwable) {
    }

    public void mo3506d(String tag, String text) {
    }

    public void mo3517v(String tag, String text) {
    }

    public void mo3511i(String tag, String text) {
    }

    public void mo3519w(String tag, String text) {
    }

    public void mo3508e(String tag, String text) {
    }

    public void log(int priority, String tag, String msg) {
    }

    public void log(int priority, String tag, String msg, boolean forceLog) {
    }

    public int getLogLevel() {
        return this.logLevel;
    }

    public void setLogLevel(int logLevel) {
    }
}
