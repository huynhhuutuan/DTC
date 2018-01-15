package com.delhi.metro.dtc;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.InterstitialAd;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import it.sephiroth.android.library.imagezoom.ImageViewTouchBase.DisplayType;

public class MetroImageMap extends Activity {
    ImageViewTouch mImage;
    InterstitialAd mInterstitialAd;
    private SharedPreferences sharedPreferences;

    class C08801 extends AdListener {
        C08801() {
        }

        public void onAdClosed() {
            MetroImageMap.this.finish();
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0322R.layout.metromap);
        ActionBar actionBar = getActionBar();
        actionBar.setTitle("Metro Map");
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);
        this.mInterstitialAd = new InterstitialAd(this);
        this.mInterstitialAd.setAdUnitId("ca-app-pub-2063508739004093/6685507761");
        this.mInterstitialAd.setAdListener(new C08801());
        this.mInterstitialAd.loadAd(new Builder().build());
        this.mImage = (ImageViewTouch) findViewById(C0322R.id.image);
        this.mImage.setDisplayType(DisplayType.FIT_TO_SCREEN);
        this.mImage.setImageBitmap(BitmapFactory.decodeResource(getResources(), C0322R.drawable.cleanmetro_map), null, -1.0f, -1.0f);
        this.sharedPreferences = getSharedPreferences("version", 0);
        int counter = this.sharedPreferences.getInt("RatingCounter", 0);
        Editor sharedPreferencesEditor = this.sharedPreferences.edit();
        sharedPreferencesEditor.putInt("RatingCounter", counter + 1);
        sharedPreferencesEditor.commit();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 16908332:
                finish();
                break;
            case C0322R.id.homescr:
                Intent nextscreen = new Intent(getApplicationContext(), Mainactivity_new.class);
                nextscreen.setFlags(67108864);
                startActivity(nextscreen);
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0322R.menu.homescrn, menu);
        return true;
    }

    public void onBackPressed() {
        super.onBackPressed();
        Log.d("sandeep", "onBackPressed");
        if (this.mInterstitialAd.isLoaded()) {
            Log.d("sandeep", "onBackPressed isLoaded");
            this.mInterstitialAd.show();
        }
    }
}
