package com.delhi.metro.dtc;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Color;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.crashlytics.android.Crashlytics;
import com.delhi.notification.NotificationSetting;
import com.delhi.notification.ShowPopUp;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders.EventBuilder;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings.Builder;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Mainactivity_new extends AppCompatActivity {
    int appVersionCode = 0;
    private FirebaseRemoteConfig mFirebaseRemoteConfig;
    public Tracker mTracker = null;
    DataBaseHelper myDbHelper;
    SharedPreferences sharedPreferences;
    private TabLayout tabLayout;
    private Toolbar toolbar;
    private ViewPager viewPager;

    class C03122 implements OnClickListener {
        C03122() {
        }

        public void onClick(DialogInterface dialog, int which) {
            try {
                Mainactivity_new.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.delhi.metro.dtc")));
            } catch (ActivityNotFoundException e) {
            }
        }
    }

    class C03133 implements OnClickListener {
        C03133() {
        }

        public void onClick(DialogInterface dialog, int which) {
        }
    }

    class updateDB extends AsyncTask<Void, Void, Void> {
        updateDB() {
        }

        protected Void doInBackground(Void... params) {
            try {
                Mainactivity_new.this.myDbHelper.deleteDB();
                Mainactivity_new.this.myDbHelper.createDataBase();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Editor sharedPreferencesEditor = Mainactivity_new.this.sharedPreferences.edit();
            sharedPreferencesEditor.putInt("VersCode", Mainactivity_new.this.appVersionCode);
            sharedPreferencesEditor.commit();
            return null;
        }
    }

    class C08791 implements OnCompleteListener<Void> {
        C08791() {
        }

        public void onComplete(@NonNull Task<Void> task) {
            if (task.isSuccessful()) {
                Mainactivity_new.this.mFirebaseRemoteConfig.activateFetched();
            }
        }
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList();
        private final List<String> mFragmentTitleList = new ArrayList();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        public Fragment getItem(int position) {
            return (Fragment) this.mFragmentList.get(position);
        }

        public int getCount() {
            return this.mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            this.mFragmentList.add(fragment);
            this.mFragmentTitleList.add(title);
        }

        public CharSequence getPageTitle(int position) {
            return (CharSequence) this.mFragmentTitleList.get(position);
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0322R.layout.activity_main_new);
        Log.d("sandeep", "Mainactivity_new onCreate() is called");
        if (this.mTracker == null) {
            this.mTracker = GoogleAnalytics.getInstance(this).newTracker((int) C0322R.xml.global_tracker);
        }
        this.toolbar = (Toolbar) findViewById(C0322R.id.app_bar);
        setSupportActionBar(this.toolbar);
        this.toolbar.showOverflowMenu();
        this.sharedPreferences = getBaseContext().getSharedPreferences("version", 0);
        getSupportActionBar().setIcon((int) C0322R.drawable.ic_launcher);
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-2063508739004093~2109491364");
        if (!this.sharedPreferences.getBoolean("isFCMSubscribed", false)) {
            FirebaseMessaging.getInstance().subscribeToTopic("news");
            Editor sharedPreferencesEditor = this.sharedPreferences.edit();
            sharedPreferencesEditor.putBoolean("isFCMSubscribed", true);
            sharedPreferencesEditor.apply();
        }
        this.viewPager = (ViewPager) findViewById(C0322R.id.viewpager);
        setupViewPager(this.viewPager);
        Bundle extras = getIntent().getExtras();
        String notifValue = null;
        if (extras != null) {
            notifValue = extras.getString(SettingsJsonConstants.PROMPT_MESSAGE_KEY);
            Log.d("sandeep", "From Notification : Messgae: :" + notifValue);
        }
        int savedVersionCode = this.sharedPreferences.getInt("VersCode", 0);
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
            sharedPreferencesEditor = this.sharedPreferences.edit();
            sharedPreferencesEditor.putBoolean("IsWhatsNewShown", false);
            sharedPreferencesEditor.commit();
        }
        this.tabLayout = (TabLayout) findViewById(C0322R.id.tabs);
        this.tabLayout.setupWithViewPager(this.viewPager);
        this.tabLayout.setSelectedTabIndicatorHeight(10);
        setupTabIcons();
        if (notifValue != null) {
            this.viewPager.setCurrentItem(1);
            if (this.mTracker != null) {
                this.mTracker.send(new EventBuilder().setCategory("Notification").setAction("News Listing").setLabel("displayed").build());
            }
        }
        this.myDbHelper.close();
        String str = "sandeep";
        Log.d(str, getString(C0322R.string.msg_token_fmt, new Object[]{FirebaseInstanceId.getInstance().getToken()}));
        this.mFirebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        this.mFirebaseRemoteConfig.setConfigSettings(new Builder().setDeveloperModeEnabled(false).build());
        this.mFirebaseRemoteConfig.setDefaults((int) C0322R.xml.remote_config_defaults);
        fetchRemoteValues();
        Fabric.with(this, new Crashlytics());
    }

    protected void onResume() {
        super.onResume();
        boolean defvalue = this.mFirebaseRemoteConfig.getBoolean("rating_pop_up_enabled");
        Log.d("sandeepFireBase", "defval:" + defvalue);
        Log.d("sandeepFireBase", "defval Str:" + this.mFirebaseRemoteConfig.getString("rating_pop_up_enabled"));
        Double no_days_popup = Double.valueOf(this.mFirebaseRemoteConfig.getDouble("no_of_day_rating_popup"));
        if (defvalue) {
            new ShowPopUp(this, no_days_popup).showNow();
        }
        Double app_version_latest = Double.valueOf(this.mFirebaseRemoteConfig.getDouble("app_version"));
        Log.d("sandeepFireBase", "app_version_latest:" + app_version_latest);
        if (app_version_latest.doubleValue() > ((double) this.appVersionCode)) {
            checkAppUpdate();
        }
    }

    public void fetchRemoteValues() {
        long cacheExpiration = 3600;
        if (this.mFirebaseRemoteConfig.getInfo().getConfigSettings().isDeveloperModeEnabled()) {
            cacheExpiration = 0;
        }
        this.mFirebaseRemoteConfig.fetch(cacheExpiration).addOnCompleteListener((Activity) this, new C08791());
    }

    public void checkAppUpdate() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setMessage("Please Update your app for more exciting features!");
        alertDialog.setCancelable(false);
        alertDialog.setPositiveButton("UPDATE", new C03122());
        alertDialog.setNegativeButton("REMIND ME LATER", new C03133());
        AlertDialog dialog = alertDialog.create();
        dialog.show();
        Button btn_positive = dialog.getButton(-2);
        if (btn_positive != null) {
            btn_positive.setTextColor(-7829368);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0322R.menu.like_button, menu);
        return true;
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
                intentShare.putExtra("android.intent.extra.TEXT", "Hello friends, I found this great app for Delhi Metro ,DTC BUS  \nhttps://play.google.com/store/apps/details?id=com.delhi.metro.dtc&referrer=utm_source%3DShareApp%26utm_medium%3DAll%26utm_campaign%3DInApp");
                intentShare.setType("text/plain");
                startActivity(intentShare);
                break;
            case C0322R.id.notification:
                startActivity(new Intent(this, NotificationSetting.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d("sandeep", " Mainactivity_new onNewIntent() is called");
    }

    private void setupTabIcons() {
        this.tabLayout = (TabLayout) findViewById(C0322R.id.tabs);
        this.tabLayout.setupWithViewPager(this.viewPager);
        View tabOne = (TextView) LayoutInflater.from(this).inflate(C0322R.layout.custom_tabs, null);
        tabOne.setText("Home");
        tabOne.setTextColor(Color.parseColor("#FF6600"));
        this.tabLayout.getTabAt(0).setCustomView(tabOne);
        View tabTwo = (TextView) LayoutInflater.from(this).inflate(C0322R.layout.custom_tabs, null);
        tabTwo.setText("News Feed");
        tabTwo.setTextColor(Color.parseColor("#FF6600"));
        this.tabLayout.getTabAt(1).setCustomView(tabTwo);
    }

    private void createTabIcons() {
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new MainFragment(), "Home");
        adapter.addFragment(new NewsFragment(), "News FEED");
        viewPager.setAdapter(adapter);
    }
}
