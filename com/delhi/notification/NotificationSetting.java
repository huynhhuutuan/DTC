package com.delhi.notification;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.delhi.metro.dtc.C0322R;
import com.google.firebase.messaging.FirebaseMessaging;

public class NotificationSetting extends AppCompatActivity {
    SwitchCompat notification_setting;
    SharedPreferences sharedPreferences;
    private Toolbar toolbar;

    class C03311 implements OnCheckedChangeListener {
        C03311() {
        }

        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            Editor sharedPreferencesEditor = NotificationSetting.this.sharedPreferences.edit();
            if (isChecked) {
                FirebaseMessaging.getInstance().subscribeToTopic("news");
                sharedPreferencesEditor.putBoolean("isNotifDisabled", false);
            } else {
                FirebaseMessaging.getInstance().unsubscribeFromTopic("news");
                sharedPreferencesEditor.putBoolean("isNotifDisabled", true);
            }
            sharedPreferencesEditor.commit();
        }
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0322R.layout.notification_setting);
        this.toolbar = (Toolbar) findViewById(C0322R.id.toolbar);
        setSupportActionBar(this.toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(false);
        getSupportActionBar().setDisplayUseLogoEnabled(false);
        getSupportActionBar().setTitle((CharSequence) "Notification Settings");
        this.toolbar.setNavigationIcon((int) C0322R.drawable.backarrow);
        this.sharedPreferences = getBaseContext().getSharedPreferences("version", 0);
        this.notification_setting = (SwitchCompat) findViewById(C0322R.id.notification_setting);
        if (this.sharedPreferences.getBoolean("isNotifDisabled", false)) {
            this.notification_setting.setChecked(false);
        } else {
            this.notification_setting.setChecked(true);
        }
        this.notification_setting.setOnCheckedChangeListener(new C03311());
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 16908332:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
