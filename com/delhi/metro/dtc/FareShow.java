package com.delhi.metro.dtc;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FareShow extends Activity {
    private ArrayAdapter<String> listAdapter;
    InterstitialAd mInterstitialAd;

    class C08781 extends AdListener {
        C08781() {
        }

        public void onAdClosed() {
            FareShow.this.finish();
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0322R.layout.nextdisp);
        ActionBar actionBar = getActionBar();
        actionBar.setTitle("Bus Path");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        ((AdView) findViewById(C0322R.id.adView)).loadAd(new Builder().build());
        this.mInterstitialAd = new InterstitialAd(this);
        this.mInterstitialAd.setAdUnitId("ca-app-pub-2063508739004093/2045425765");
        this.mInterstitialAd.setAdListener(new C08781());
        this.mInterstitialAd.loadAd(new Builder().build());
        ArrayList<String> stopList1 = new ArrayList();
        Bundle bunble = getIntent().getExtras();
        Log.d("sandeep", "FareShow Oncreate is called");
        if (bunble != null) {
            String strsel = bunble.getString("SendSt");
            String stcnt = bunble.getString("counter");
            InputStream instream = null;
            try {
                instream = getAssets().open("routenamenew.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (instream != null) {
                String line;
                BufferedReader br = new BufferedReader(new InputStreamReader(instream));
                do {
                    try {
                        line = br.readLine();
                        if (line == null) {
                            break;
                        }
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                } while (!line.contains(strsel));
                stopList1.clear();
                String[] route_names = line.split(",");
                for (String add : route_names) {
                    stopList1.add(add);
                }
                ((TextView) findViewById(C0322R.id.textViewsl0)).setText((String) stopList1.get(0));
                stopList1.remove(0);
                this.listAdapter = new ArrayAdapter(this, C0322R.layout.guideplace, stopList1);
                ListView mainlist = (ListView) findViewById(C0322R.id.listViewp);
                mainlist.setVisibility(0);
                mainlist.setAdapter(this.listAdapter);
            }
        }
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
