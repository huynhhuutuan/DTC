package com.delhi.notification;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import com.delhi.metro.dtc.C0322R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders.EventBuilder;
import com.google.android.gms.analytics.Tracker;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;

public class NewsDetailScreen extends AppCompatActivity implements OnClickListener {
    private String description = "";
    private ImageView imageView;
    private String imgUrl = "";
    private ImageView img_share;
    InterstitialAd mInterstitialAd;
    public Tracker mTracker = null;
    private SharedPreferences sharedPreferences;
    private String source = "NA";
    private TextView textDesc;
    private TextView textView_timeStamp;
    private TextView text_Source;
    private TextView text_title;
    private String timeStamp = "";
    private String title = "";
    private Toolbar toolbar;

    class C08851 extends AdListener {
        C08851() {
        }

        public void onAdClosed() {
            NewsDetailScreen.this.finish();
        }
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0322R.layout.shownoticationdetails);
        this.toolbar = (Toolbar) findViewById(C0322R.id.toolbar);
        setSupportActionBar(this.toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(false);
        getSupportActionBar().setDisplayUseLogoEnabled(false);
        getSupportActionBar().setTitle((CharSequence) "My Feed");
        this.toolbar.setNavigationIcon((int) C0322R.drawable.backarrow);
        intializeView();
        if (this.mTracker == null) {
            this.mTracker = GoogleAnalytics.getInstance(this).newTracker((int) C0322R.xml.global_tracker);
        }
        this.mInterstitialAd = new InterstitialAd(this);
        this.mInterstitialAd.setAdUnitId("ca-app-pub-2063508739004093/4240372165");
        this.mInterstitialAd.setAdListener(new C08851());
        this.mInterstitialAd.loadAd(new Builder().build());
        Intent intent = getIntent();
        if (intent != null) {
            this.description = intent.getStringExtra("description");
            this.imgUrl = intent.getStringExtra("imageurl");
            this.title = intent.getStringExtra(SettingsJsonConstants.PROMPT_TITLE_KEY);
            this.timeStamp = intent.getStringExtra("timestamp");
            this.source = intent.getStringExtra(Param.SOURCE);
        }
        this.textView_timeStamp.setText(this.timeStamp);
        Glide.with(getApplicationContext()).load(this.imgUrl).into(this.imageView);
        Typeface myTypeTitle = Typeface.createFromAsset(getAssets(), "font/HelveticaNeue.otf");
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "font/HelveticaNeue-Light.otf");
        this.textDesc.setTypeface(myTypeface);
        if (this.description.contains("<br>") || this.description.contains("<b>") || this.description.contains("</a>")) {
            this.textDesc.setText(Html.fromHtml(this.description));
            this.textDesc.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            this.textDesc.setText(this.description);
        }
        this.text_title.setTypeface(myTypeTitle);
        this.text_title.setText(this.title);
        this.text_Source.setTypeface(myTypeface);
        this.text_Source.setText("Source: " + this.source);
        this.sharedPreferences = getSharedPreferences("version", 0);
        int counter = this.sharedPreferences.getInt("RatingCounter", 0);
        Editor sharedPreferencesEditor = this.sharedPreferences.edit();
        sharedPreferencesEditor.putInt("RatingCounter", counter + 1);
        sharedPreferencesEditor.commit();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 16908332:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onBackPressed() {
        super.onBackPressed();
        Log.d("sandeep", "onBackPressed");
        if (this.mInterstitialAd.isLoaded()) {
            Log.d("sandeep", "onBackPressed isLoaded");
            this.mInterstitialAd.show();
        }
    }

    private void intializeView() {
        this.toolbar = (Toolbar) findViewById(C0322R.id.toolbar);
        this.imageView = (ImageView) findViewById(C0322R.id.imageView);
        this.textDesc = (TextView) findViewById(C0322R.id.textDesc);
        this.img_share = (ImageView) findViewById(C0322R.id.img_share);
        this.textView_timeStamp = (TextView) findViewById(C0322R.id.text_timestamp);
        this.text_title = (TextView) findViewById(C0322R.id.text_title);
        this.text_Source = (TextView) findViewById(C0322R.id.text_source);
        ((AdView) findViewById(C0322R.id.adView)).loadAd(new Builder().build());
        this.img_share.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case C0322R.id.img_share:
                this.mTracker.send(new EventBuilder().setCategory("ShareApp News Detail").setAction("Button Clicked").setLabel("App Shared").build());
                Intent whatsappIntent = new Intent("android.intent.action.SEND");
                whatsappIntent.setType("text/plain");
                whatsappIntent.setPackage("com.whatsapp");
                whatsappIntent.putExtra("android.intent.extra.TEXT", "Hello friends,I found this great app for Delhi BUS,METRO travel \nhttps://play.google.com/store/apps/details?id=com.delhi.metro.dtc");
                try {
                    startActivity(whatsappIntent);
                    return;
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(this, "Whatsapp have not been installed.", 0).show();
                    return;
                }
            default:
                return;
        }
    }
}
