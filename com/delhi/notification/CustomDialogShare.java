package com.delhi.notification;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.delhi.metro.dtc.C0322R;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders.EventBuilder;
import com.google.android.gms.analytics.Tracker;

public class CustomDialogShare extends Dialog implements OnClickListener {
    private Button btn_ok;
    private Context context;
    private Tracker mTracker = null;
    SharedPreferences sharedPreferences;
    private TextView textView_next_time;

    public CustomDialogShare(@NonNull Context context) {
        super(context);
        this.context = context;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        setContentView(C0322R.layout.custom_dialog_share);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setCancelable(false);
        this.btn_ok = (Button) findViewById(C0322R.id.btn_ok);
        this.textView_next_time = (TextView) findViewById(C0322R.id.text_nexttime);
        this.btn_ok.setOnClickListener(this);
        this.textView_next_time.setOnClickListener(this);
        if (this.mTracker == null) {
            this.mTracker = GoogleAnalytics.getInstance(this.context).newTracker((int) C0322R.xml.global_tracker);
        }
        this.sharedPreferences = this.context.getSharedPreferences("version", 0);
    }

    public void onClick(View v) {
        Editor sharedPreferencesEditor;
        switch (v.getId()) {
            case C0322R.id.text_nexttime:
                dismiss();
                sharedPreferencesEditor = this.sharedPreferences.edit();
                sharedPreferencesEditor.putLong("LastTime", Long.valueOf(System.currentTimeMillis()).longValue());
                sharedPreferencesEditor.commit();
                this.mTracker.send(new EventBuilder().setCategory("Pop Up Shown").setAction("Share pop up").setLabel("Not Now").build());
                return;
            case C0322R.id.btn_ok:
                Intent intentShare = new Intent();
                intentShare.setAction("android.intent.action.SEND");
                this.mTracker.send(new EventBuilder().setCategory("Pop Up Shown").setAction("Share pop up").setLabel("OK").build());
                intentShare.putExtra("android.intent.extra.TEXT", "Hello friends, I found this great app for Delhi Metro ,DTC BUS  \nhttps://play.google.com/store/apps/details?id=com.delhi.metro.dtc&referrer=utm_source%3DShareApp%26utm_medium%3DAll%26utm_campaign%3DInApp");
                intentShare.setType("text/plain");
                this.context.startActivity(intentShare);
                dismiss();
                sharedPreferencesEditor = this.sharedPreferences.edit();
                sharedPreferencesEditor.putBoolean("IsShareShown", true);
                sharedPreferencesEditor.commit();
                return;
            default:
                return;
        }
    }
}
