package com.delhi.metro.dtc;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import com.delhi.adapters.MyFareAdapter;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;

public class AutoFare extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0322R.layout.autofare);
        ActionBar actionBar = getActionBar();
        actionBar.setTitle("Auto Fare");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        ((AdView) findViewById(C0322R.id.adView)).loadAd(new Builder().build());
        MyFareAdapter listAdapter1 = new MyFareAdapter(this, C0322R.layout.autofaredisp);
        ListView mainlist = (ListView) findViewById(C0322R.id.listViewap);
        mainlist.setVisibility(0);
        mainlist.setAdapter(listAdapter1);
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
}
