package com.delhi.metro.dtc;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Recharge extends Activity {
    Button bt1;
    TextView tv1;

    class C03231 implements OnClickListener {
        C03231() {
        }

        public void onClick(View v) {
            Recharge.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.dmrcsmartcard.com")));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0322R.layout.recharge);
        ActionBar actionBar = getActionBar();
        actionBar.setTitle("Card Recharge");
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);
        this.tv1 = (TextView) findViewById(C0322R.id.textViewRchg);
        this.bt1 = (Button) findViewById(C0322R.id.button1);
        this.tv1.setTypeface(Typeface.createFromAsset(getAssets(), "font/Rupee_Foradian.ttf"));
        String rchg = (("Use Smart card for comfortable journey and<b> 10% cheaper</b> in cost. The Smart card can be recharged at any Metro Station and <b>  ONLINE </b> Also." + "<br>New Card:` 150 (Balance: 100, Security:50)") + "<br>Minimum Recharge:` 200") + "<br>Maximum Recharge:` 1000";
        this.bt1.setOnClickListener(new C03231());
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
