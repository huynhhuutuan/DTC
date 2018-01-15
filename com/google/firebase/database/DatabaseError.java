package com.google.firebase.database;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class DatabaseError {
    public static final int DATA_STALE = -1;
    public static final int DISCONNECTED = -4;
    public static final int EXPIRED_TOKEN = -6;
    public static final int INVALID_TOKEN = -7;
    public static final int MAX_RETRIES = -8;
    public static final int NETWORK_ERROR = -24;
    public static final int OPERATION_FAILED = -2;
    public static final int OVERRIDDEN_BY_SET = -9;
    public static final int PERMISSION_DENIED = -3;
    public static final int UNAVAILABLE = -10;
    public static final int UNKNOWN_ERROR = -999;
    public static final int USER_CODE_EXCEPTION = -11;
    public static final int WRITE_CANCELED = -25;
    private static final Map<Integer, String> zzbZM = new HashMap();
    private static final Map<String, Integer> zzbZN = new HashMap();
    private final String message;
    private final int zzbZO;
    private final String zzbZP;

    static {
        zzbZM.put(Integer.valueOf(-1), "The transaction needs to be run again with current data");
        zzbZM.put(Integer.valueOf(-2), "The server indicated that this operation failed");
        zzbZM.put(Integer.valueOf(-3), "This client does not have permission to perform this operation");
        zzbZM.put(Integer.valueOf(-4), "The operation had to be aborted due to a network disconnect");
        zzbZM.put(Integer.valueOf(-6), "The supplied auth token has expired");
        zzbZM.put(Integer.valueOf(-7), "The supplied auth token was invalid");
        zzbZM.put(Integer.valueOf(-8), "The transaction had too many retries");
        zzbZM.put(Integer.valueOf(-9), "The transaction was overridden by a subsequent set");
        zzbZM.put(Integer.valueOf(-10), "The service is unavailable");
        zzbZM.put(Integer.valueOf(-11), "User code called from the Firebase Database runloop threw an exception:\n");
        zzbZM.put(Integer.valueOf(-24), "The operation could not be performed due to a network error");
        zzbZM.put(Integer.valueOf(-25), "The write was canceled by the user.");
        zzbZM.put(Integer.valueOf(UNKNOWN_ERROR), "An unknown error occurred");
        zzbZN.put("datastale", Integer.valueOf(-1));
        zzbZN.put("failure", Integer.valueOf(-2));
        zzbZN.put("permission_denied", Integer.valueOf(-3));
        zzbZN.put("disconnected", Integer.valueOf(-4));
        zzbZN.put("expired_token", Integer.valueOf(-6));
        zzbZN.put("invalid_token", Integer.valueOf(-7));
        zzbZN.put("maxretries", Integer.valueOf(-8));
        zzbZN.put("overriddenbyset", Integer.valueOf(-9));
        zzbZN.put("unavailable", Integer.valueOf(-10));
        zzbZN.put("network_error", Integer.valueOf(-24));
        zzbZN.put("write_canceled", Integer.valueOf(-25));
    }

    private DatabaseError(int i, String str) {
        this(i, str, null);
    }

    private DatabaseError(int i, String str, String str2) {
        this.zzbZO = i;
        this.message = str;
        if (str2 == null) {
            str2 = "";
        }
        this.zzbZP = str2;
    }

    public static DatabaseError fromException(Throwable th) {
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String valueOf = String.valueOf((String) zzbZM.get(Integer.valueOf(-11)));
        String valueOf2 = String.valueOf(stringWriter.toString());
        return new DatabaseError(-11, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    public static DatabaseError zzap(String str, String str2) {
        return zzs(str, str2, null);
    }

    public static DatabaseError zziD(String str) {
        return zzap(str, null);
    }

    public static DatabaseError zzqv(int i) {
        if (zzbZM.containsKey(Integer.valueOf(i))) {
            return new DatabaseError(i, (String) zzbZM.get(Integer.valueOf(i)), null);
        }
        throw new IllegalArgumentException("Invalid Firebase Database error code: " + i);
    }

    public static DatabaseError zzs(String str, String str2, String str3) {
        Integer num = (Integer) zzbZN.get(str.toLowerCase());
        Integer valueOf = num == null ? Integer.valueOf(UNKNOWN_ERROR) : num;
        return new DatabaseError(valueOf.intValue(), str2 == null ? (String) zzbZM.get(valueOf) : str2, str3);
    }

    public int getCode() {
        return this.zzbZO;
    }

    public String getDetails() {
        return this.zzbZP;
    }

    public String getMessage() {
        return this.message;
    }

    public DatabaseException toException() {
        String str = "Firebase Database error: ";
        String valueOf = String.valueOf(this.message);
        return new DatabaseException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public String toString() {
        String str = "DatabaseError: ";
        String valueOf = String.valueOf(this.message);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }
}
