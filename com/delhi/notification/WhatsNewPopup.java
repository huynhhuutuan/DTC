package com.delhi.notification;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.delhi.metro.dtc.C0322R;

public class WhatsNewPopup extends Dialog {
    private Context context;
    private TextView got_it_btn;
    SharedPreferences sharedPreferences;
    private TextView whats_new_text;

    class C03331 implements OnClickListener {
        C03331() {
        }

        public void onClick(View v) {
            Editor sharedPreferencesEditor = WhatsNewPopup.this.sharedPreferences.edit();
            sharedPreferencesEditor.putBoolean("IsWhatsNewShown", true);
            sharedPreferencesEditor.commit();
            WhatsNewPopup.this.hide();
        }
    }

    public WhatsNewPopup(Context context) {
        super(context);
        this.context = context;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0322R.layout.whats_new_popup);
        setCancelable(false);
        this.whats_new_text = (TextView) findViewById(C0322R.id.whats_new_text);
        this.got_it_btn = (TextView) findViewById(C0322R.id.got_it_btn);
        this.whats_new_text.setText(C0322R.string.whats_new_text);
        this.sharedPreferences = this.context.getSharedPreferences("version", 0);
        this.got_it_btn.setOnClickListener(new C03331());
    }
}
