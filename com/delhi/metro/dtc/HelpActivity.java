package com.delhi.metro.dtc;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;

public class HelpActivity extends Activity {
    ListView listView;
    ArrayList<String> str_help;

    class C02951 implements OnItemClickListener {
        C02951() {
        }

        public void onItemClick(AdapterView<?> adapterView, View arg1, int position, long arg3) {
            if (position == 0) {
                HelpActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.delhimetrorail.com/")));
            } else if (position == 1) {
                HelpActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.delhimetrorail.com/Airport-Express-Line.aspx")));
            } else if (position == 2) {
                HelpActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.delhi.gov.in/wps/wcm/connect/doit_dtc/DTC/Home")));
            } else if (position == 3) {
                HelpActivity.this.startActivity(new Intent(HelpActivity.this.getApplicationContext(), Railway.class));
            } else if (position == 4) {
                HelpActivity.this.startActivity(new Intent(HelpActivity.this.getApplicationContext(), Isbt.class));
            } else if (position == 5) {
                HelpActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://greenolution.in/registration.php")));
            } else if (position == 6) {
                HelpActivity.this.startActivity(new Intent(HelpActivity.this.getApplicationContext(), Recharge.class));
            }
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0322R.layout.help_section);
        ActionBar actionBar = getActionBar();
        actionBar.setTitle("Help");
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);
        ((AdView) findViewById(C0322R.id.adView)).loadAd(new Builder().build());
        this.listView = (ListView) findViewById(C0322R.id.listViewHelp);
        init_data();
        this.listView.setAdapter(new ArrayAdapter(this, 17367043, this.str_help));
        this.listView.setOnItemClickListener(new C02951());
    }

    public void init_data() {
        this.str_help = new ArrayList();
        this.str_help.add(getResources().getString(C0322R.string.dmrc_site));
        this.str_help.add(getResources().getString(C0322R.string.dmrc_aiport_line));
        this.str_help.add(getResources().getString(C0322R.string.dtc_site));
        this.str_help.add(getResources().getString(C0322R.string.railway_station));
        this.str_help.add(getResources().getString(C0322R.string.isbt));
        this.str_help.add(getResources().getString(C0322R.string.cycle));
        this.str_help.add(getResources().getString(C0322R.string.smart_card));
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
