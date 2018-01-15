package com.delhi.metro.dtc;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.Toast;
import com.delhi.bus.BusAdapter;
import com.delhi.bus.BusRoot;
import com.delhi.notification.ShowNotification;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders.EventBuilder;
import com.google.android.gms.analytics.Tracker;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.lang.reflect.Field;

public class MainActivity extends Activity {
    int appVersionCode = 0;
    ImageView iv1;
    ImageView iv2;
    ImageView iv3;
    ImageView iv4;
    ImageView iv5;
    ImageView iv6;
    ImageView iv7;
    ImageView iv8;
    public Tracker mTracker = null;
    DataBaseHelper myDbHelper;
    SharedPreferences sharedPreferences;

    class C02961 implements OnClickListener {
        C02961() {
        }

        public void onClick(View arg0) {
            MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), MetroImageMap.class));
        }
    }

    class C02972 implements OnClickListener {
        C02972() {
        }

        public void onClick(View arg0) {
            MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), FareDoor.class));
        }
    }

    class C02983 implements OnClickListener {
        C02983() {
        }

        public void onClick(View arg0) {
            MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), MetroInfo.class));
        }
    }

    class C02994 implements OnClickListener {
        C02994() {
        }

        public void onClick(View arg0) {
            MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), Nearest.class));
        }
    }

    class C03005 implements OnClickListener {
        C03005() {
        }

        public void onClick(View arg0) {
            MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), BusRoot.class));
        }
    }

    class C03016 implements OnClickListener {
        C03016() {
        }

        public void onClick(View arg0) {
            MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), BusAdapter.class));
        }
    }

    class C03027 implements OnClickListener {
        C03027() {
        }

        public void onClick(View arg0) {
            MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), Mainactivity_new.class));
        }
    }

    class C03038 implements OnClickListener {
        C03038() {
        }

        public void onClick(View arg0) {
            MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), ShowNotification.class));
        }
    }

    class updateDB extends AsyncTask<Void, Void, Void> {
        updateDB() {
        }

        protected Void doInBackground(Void... params) {
            try {
                MainActivity.this.myDbHelper.deleteDB();
                MainActivity.this.myDbHelper.createDataBase();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Editor sharedPreferencesEditor = MainActivity.this.sharedPreferences.edit();
            sharedPreferencesEditor.putInt("VersCode", MainActivity.this.appVersionCode);
            sharedPreferencesEditor.commit();
            return null;
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0322R.layout.main_layout);
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-2063508739004093~2109491364");
        ((AdView) findViewById(C0322R.id.adView)).loadAd(new Builder().build());
        makeActionOverflowMenuShown();
        this.iv1 = (ImageView) findViewById(C0322R.id.imageView1);
        this.iv2 = (ImageView) findViewById(C0322R.id.imageView2);
        this.iv3 = (ImageView) findViewById(C0322R.id.imageView3);
        this.iv4 = (ImageView) findViewById(C0322R.id.imageView4);
        this.iv5 = (ImageView) findViewById(C0322R.id.imageView5);
        this.iv6 = (ImageView) findViewById(C0322R.id.imageView6);
        this.iv7 = (ImageView) findViewById(C0322R.id.imageView7);
        this.iv8 = (ImageView) findViewById(C0322R.id.imageView8);
        this.sharedPreferences = getBaseContext().getSharedPreferences("version", 0);
        int savedVersionCode = this.sharedPreferences.getInt("VersCode", 0);
        if (this.mTracker == null) {
            this.mTracker = GoogleAnalytics.getInstance(this).newTracker((int) C0322R.xml.global_tracker);
        }
        this.myDbHelper = new DataBaseHelper(this);
        try {
            this.appVersionCode = getBaseContext().getPackageManager().getPackageInfo(getBaseContext().getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
        }
        Log.d("sandeep", "Saved Ver code:" + savedVersionCode);
        Log.d("sandeep", "Curr Ver code:" + this.appVersionCode);
        if (savedVersionCode != this.appVersionCode) {
            Log.d("sandeep", "ver does not match:");
            new updateDB().execute(new Void[0]);
        }
        this.iv1.setOnClickListener(new C02961());
        this.iv2.setOnClickListener(new C02972());
        this.iv3.setOnClickListener(new C02983());
        this.iv5.setOnClickListener(new C02994());
        this.iv4.setOnClickListener(new C03005());
        this.iv6.setOnClickListener(new C03016());
        this.iv8.setOnClickListener(new C03027());
        this.iv7.setOnClickListener(new C03038());
        this.myDbHelper.close();
        String msg = getString(C0322R.string.msg_token_fmt, new Object[]{FirebaseInstanceId.getInstance().getToken()});
        Log.d("sandeep", msg);
        Toast.makeText(this, msg, 0).show();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case C0322R.id.likebutton:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("market://details?id=com.delhi.metro.dtc"));
                startActivity(intent);
                break;
            case C0322R.id.shareButton:
                Intent intentShare = new Intent();
                intentShare.setAction("android.intent.action.SEND");
                this.mTracker.send(new EventBuilder().setCategory("ShareApp").setAction("Button Clicked").setLabel("App Shared").build());
                intentShare.putExtra("android.intent.extra.TEXT", "Hello friends,I found this great app for Delhi BUS,METRO travel \nhttps://play.google.com/store/apps/details?id=com.delhi.metro.dtc");
                intentShare.setType("text/plain");
                startActivity(intentShare);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0322R.menu.like_button, menu);
        return true;
    }

    private void makeActionOverflowMenuShown() {
        try {
            ViewConfiguration config = ViewConfiguration.get(this);
            Field menuKeyField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
            if (menuKeyField != null) {
                menuKeyField.setAccessible(true);
                menuKeyField.setBoolean(config, false);
            }
        } catch (Exception e) {
            Log.d("MainActivity", e.getLocalizedMessage());
        }
    }
}
