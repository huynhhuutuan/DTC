package com.delhi.metro.dtc;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;

public class ShowContact extends Activity {
    OnClickListener dialogClickListener;
    String number = "";
    StationContactExpand stnexpnd;

    class C03241 implements OnClickListener {
        C03241() {
        }

        public void onClick(DialogInterface dialog, int which) {
            switch (which) {
                case -2:
                    dialog.dismiss();
                    return;
                case -1:
                    Intent callIntent = new Intent("android.intent.action.DIAL");
                    callIntent.setData(Uri.parse("tel:" + ShowContact.this.number));
                    ShowContact.this.startActivity(callIntent);
                    return;
                default:
                    return;
            }
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0322R.layout.stationcontact);
        Bundle recieve = getIntent().getExtras();
        ActionBar actionBar = getActionBar();
        actionBar.setTitle("Station Contacts");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        ((AdView) findViewById(C0322R.id.adView)).loadAd(new Builder().build());
        int posn = Integer.parseInt(recieve.getString("Sendst"));
        String[] metroStn = getResources().getStringArray(C0322R.array.Station_arrays);
        StationContact stnc = new StationContact();
        String st1 = stnc.Stcontact[posn][0];
        String st2 = stnc.Stcontact[posn][1];
        ArrayList<String> contactno = new ArrayList();
        contactno.add(0, st1);
        contactno.add(1, st2);
        this.stnexpnd = new StationContactExpand(this, contactno);
        final ListView mainlist = (ListView) findViewById(C0322R.id.contacno);
        mainlist.setVisibility(0);
        mainlist.setAdapter(this.stnexpnd);
        ((TextView) findViewById(C0322R.id.titlebox)).setText(metroStn[posn]);
        this.dialogClickListener = new C03241();
        mainlist.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View arg1, int position, long arg3) {
                ShowContact.this.number = (String) mainlist.getItemAtPosition(position);
                ShowContact.this.number = ShowContact.this.number.trim();
                new AlertDialog.Builder(ShowContact.this).setMessage("Are you sure to Call?").setPositiveButton("Yes", ShowContact.this.dialogClickListener).setNegativeButton("No", ShowContact.this.dialogClickListener).show();
            }
        });
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
