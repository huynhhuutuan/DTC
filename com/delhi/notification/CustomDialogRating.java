package com.delhi.notification;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.delhi.metro.dtc.C0322R;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders.EventBuilder;
import com.google.android.gms.analytics.Tracker;

public class CustomDialogRating extends Dialog implements OnClickListener {
    private Context context;
    private ImageView img_star1;
    private ImageView img_star2;
    private ImageView img_star3;
    private ImageView img_star4;
    private ImageView img_star5;
    private Tracker mTracker = null;
    private Button rate_now;
    SharedPreferences sharedPreferences;
    private TextView textView;

    class C03281 implements OnClickListener {
        C03281() {
        }

        public void onClick(View v) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("market://details?id=com.delhi.metro.dtc"));
            CustomDialogRating.this.context.startActivity(intent);
            CustomDialogRating.this.mTracker.send(new EventBuilder().setCategory("Pop Up Shown").setAction("Rating Pop up").setLabel("OK").build());
            Toast.makeText(CustomDialogRating.this.context, "Please Rate us 5 Star on Play Store!", 1).show();
            CustomDialogRating.this.dismiss();
            Editor sharedPreferencesEditor = CustomDialogRating.this.sharedPreferences.edit();
            sharedPreferencesEditor.putBoolean("IsRatingShown", true);
            sharedPreferencesEditor.commit();
        }
    }

    class C03292 implements OnClickListener {
        C03292() {
        }

        public void onClick(View v) {
            CustomDialogRating.this.dismiss();
            Editor sharedPreferencesEditor = CustomDialogRating.this.sharedPreferences.edit();
            sharedPreferencesEditor.putLong("LastTime", Long.valueOf(System.currentTimeMillis()).longValue());
            sharedPreferencesEditor.commit();
            CustomDialogRating.this.mTracker.send(new EventBuilder().setCategory("Pop Up Shown").setAction("Rating Pop up").setLabel("Not Now").build());
        }
    }

    public CustomDialogRating(@NonNull Context context) {
        super(context);
        this.context = context;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        setContentView(C0322R.layout.custom_rating_dialog);
        initialize();
        setCancelable(false);
        if (this.mTracker == null) {
            this.mTracker = GoogleAnalytics.getInstance(this.context).newTracker((int) C0322R.xml.global_tracker);
        }
        this.sharedPreferences = this.context.getSharedPreferences("version", 0);
        this.rate_now.setOnClickListener(new C03281());
        this.textView.setOnClickListener(new C03292());
    }

    private void initialize() {
        this.img_star1 = (ImageView) findViewById(C0322R.id.img_star1);
        this.img_star2 = (ImageView) findViewById(C0322R.id.img_star2);
        this.img_star3 = (ImageView) findViewById(C0322R.id.img_star3);
        this.img_star4 = (ImageView) findViewById(C0322R.id.img_star4);
        this.img_star5 = (ImageView) findViewById(C0322R.id.img_star5);
        this.rate_now = (Button) findViewById(C0322R.id.btn_rate_now);
        this.textView = (TextView) findViewById(C0322R.id.text_rate_not_now);
        this.img_star1.setOnClickListener(this);
        this.img_star2.setOnClickListener(this);
        this.img_star3.setOnClickListener(this);
        this.img_star4.setOnClickListener(this);
        this.img_star5.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
        }
    }
}
