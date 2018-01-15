package com.google.firebase.database;

import com.google.android.gms.internal.zzbsc;

public class Transaction {

    public interface Handler {
        Result doTransaction(MutableData mutableData);

        void onComplete(DatabaseError databaseError, boolean z, DataSnapshot dataSnapshot);
    }

    public static class Result {
        private boolean zzcav;
        private zzbsc zzcaw;

        private Result(boolean z, zzbsc com_google_android_gms_internal_zzbsc) {
            this.zzcav = z;
            this.zzcaw = com_google_android_gms_internal_zzbsc;
        }

        public boolean isSuccess() {
            return this.zzcav;
        }

        public zzbsc zzWH() {
            return this.zzcaw;
        }
    }

    public static Result abort() {
        return new Result(false, null);
    }

    public static Result success(MutableData mutableData) {
        return new Result(true, mutableData.zzWH());
    }
}
