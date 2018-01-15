package com.delhi.notification;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;

public class ShowPopUp {
    Context context;
    private Double no_of_days_popup = Double.valueOf(2.0d);
    private SharedPreferences sharedPreferences;

    public ShowPopUp(Context context, Double days) {
        this.context = context;
        this.no_of_days_popup = days;
    }

    public void showNow() {
        this.sharedPreferences = this.context.getSharedPreferences("version", 0);
        int counter = this.sharedPreferences.getInt("RatingCounter", 0);
        Log.d("sandeepPref", "rating count" + counter);
        if (!this.sharedPreferences.getBoolean("IsWhatsNewShown", false)) {
            new WhatsNewPopup(this.context).show();
        } else if (counter > 0 && counter % 2 == 0) {
            Editor sharedPreferencesEditor;
            if (!this.sharedPreferences.getBoolean("IsRatingShown", false) && this.sharedPreferences.getInt("LastRatingShown", 0) != 1 && isTimetoShowPopup()) {
                new CustomDialogRating(this.context).show();
                sharedPreferencesEditor = this.sharedPreferences.edit();
                sharedPreferencesEditor.putInt("LastRatingShown", 1);
                sharedPreferencesEditor.putInt("RatingCounter", 0);
                sharedPreferencesEditor.commit();
            } else if (!this.sharedPreferences.getBoolean("IsShareShown", false) && this.sharedPreferences.getInt("LastRatingShown", 0) != 2 && isTimetoShowPopup()) {
                new CustomDialogShare(this.context).show();
                sharedPreferencesEditor = this.sharedPreferences.edit();
                sharedPreferencesEditor.putInt("LastRatingShown", 2);
                sharedPreferencesEditor.putInt("RatingCounter", 0);
                sharedPreferencesEditor.commit();
            }
        }
    }

    private boolean isTimetoShowPopup() {
        this.sharedPreferences = this.context.getSharedPreferences("version", 0);
        Long last_time_shown = Long.valueOf(this.sharedPreferences.getLong("LastTime", 0));
        Log.d("sandeepPref", "last time:" + last_time_shown);
        if (last_time_shown.longValue() == 0) {
            return true;
        }
        long days = Long.valueOf(Long.valueOf(System.currentTimeMillis()).longValue() - last_time_shown.longValue()).longValue() / 86400000;
        Log.d("sandeepPref", "no of days:" + this.no_of_days_popup);
        if (((double) days) <= this.no_of_days_popup.doubleValue()) {
            return false;
        }
        return true;
    }
}
