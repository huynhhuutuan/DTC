package io.fabric.sdk.android;

import android.util.Log;

public class DefaultLogger implements Logger {
    private int logLevel;

    public DefaultLogger(int logLevel) {
        this.logLevel = logLevel;
    }

    public DefaultLogger() {
        this.logLevel = 4;
    }

    public boolean isLoggable(String tag, int level) {
        return this.logLevel <= level;
    }

    public int getLogLevel() {
        return this.logLevel;
    }

    public void setLogLevel(int logLevel) {
        this.logLevel = logLevel;
    }

    public void mo3507d(String tag, String text, Throwable throwable) {
        if (isLoggable(tag, 3)) {
            Log.d(tag, text, throwable);
        }
    }

    public void mo3518v(String tag, String text, Throwable throwable) {
        if (isLoggable(tag, 2)) {
            Log.v(tag, text, throwable);
        }
    }

    public void mo3512i(String tag, String text, Throwable throwable) {
        if (isLoggable(tag, 4)) {
            Log.i(tag, text, throwable);
        }
    }

    public void mo3520w(String tag, String text, Throwable throwable) {
        if (isLoggable(tag, 5)) {
            Log.w(tag, text, throwable);
        }
    }

    public void mo3509e(String tag, String text, Throwable throwable) {
        if (isLoggable(tag, 6)) {
            Log.e(tag, text, throwable);
        }
    }

    public void mo3506d(String tag, String text) {
        mo3507d(tag, text, null);
    }

    public void mo3517v(String tag, String text) {
        mo3518v(tag, text, null);
    }

    public void mo3511i(String tag, String text) {
        mo3512i(tag, text, null);
    }

    public void mo3519w(String tag, String text) {
        mo3520w(tag, text, null);
    }

    public void mo3508e(String tag, String text) {
        mo3509e(tag, text, null);
    }

    public void log(int priority, String tag, String msg) {
        log(priority, tag, msg, false);
    }

    public void log(int priority, String tag, String msg, boolean forceLog) {
        if (forceLog || isLoggable(tag, priority)) {
            Log.println(priority, tag, msg);
        }
    }
}
