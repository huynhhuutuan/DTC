package com.google.android.gms.internal;

import android.app.AlertDialog.Builder;
import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.C0334R;
import com.google.android.gms.ads.internal.zzw;
import java.util.Map;

@zzme
public class zzkt extends zzkw {
    private final Context mContext;
    private final Map<String, String> zzFP;

    class C05882 implements OnClickListener {
        final /* synthetic */ zzkt zzMq;

        C05882(zzkt com_google_android_gms_internal_zzkt) {
            this.zzMq = com_google_android_gms_internal_zzkt;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.zzMq.zzaz("User canceled the download.");
        }
    }

    public zzkt(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
        super(com_google_android_gms_internal_zzqw, "storePicture");
        this.zzFP = map;
        this.mContext = com_google_android_gms_internal_zzqw.zzlr();
    }

    public void execute() {
        if (this.mContext == null) {
            zzaz("Activity context is not available");
        } else if (zzw.zzcM().zzN(this.mContext).zzfn()) {
            final String str = (String) this.zzFP.get("iurl");
            if (TextUtils.isEmpty(str)) {
                zzaz("Image url cannot be empty.");
            } else if (URLUtil.isValidUrl(str)) {
                final String zzay = zzay(str);
                if (zzw.zzcM().zzaZ(zzay)) {
                    Resources resources = zzw.zzcQ().getResources();
                    Builder zzM = zzw.zzcM().zzM(this.mContext);
                    zzM.setTitle(resources != null ? resources.getString(C0334R.string.store_picture_title) : "Save image");
                    zzM.setMessage(resources != null ? resources.getString(C0334R.string.store_picture_message) : "Allow Ad to store image in Picture gallery?");
                    zzM.setPositiveButton(resources != null ? resources.getString(C0334R.string.accept) : "Accept", new OnClickListener(this) {
                        final /* synthetic */ zzkt zzMq;

                        public void onClick(DialogInterface dialogInterface, int i) {
                            try {
                                ((DownloadManager) this.zzMq.mContext.getSystemService("download")).enqueue(this.zzMq.zzk(str, zzay));
                            } catch (IllegalStateException e) {
                                this.zzMq.zzaz("Could not store picture.");
                            }
                        }
                    });
                    zzM.setNegativeButton(resources != null ? resources.getString(C0334R.string.decline) : "Decline", new C05882(this));
                    zzM.create().show();
                    return;
                }
                r1 = "Image type not recognized: ";
                str = String.valueOf(zzay);
                zzaz(str.length() != 0 ? r1.concat(str) : new String(r1));
            } else {
                r1 = "Invalid image url: ";
                str = String.valueOf(str);
                zzaz(str.length() != 0 ? r1.concat(str) : new String(r1));
            }
        } else {
            zzaz("Feature is not supported by the device.");
        }
    }

    String zzay(String str) {
        return Uri.parse(str).getLastPathSegment();
    }

    Request zzk(String str, String str2) {
        Request request = new Request(Uri.parse(str));
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
        zzw.zzcO().zza(request);
        return request;
    }
}
