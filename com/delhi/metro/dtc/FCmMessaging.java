package com.delhi.metro.dtc;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat.BigPictureStyle;
import android.support.v4.app.NotificationCompat.Builder;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.net.HttpURLConnection;
import java.net.URL;

public class FCmMessaging extends FirebaseMessagingService {
    private static final String TAG = "MyFirebaseMsgService";
    Bitmap bitmap;

    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d(TAG, "From: " + remoteMessage.getFrom());
        if (remoteMessage.getData().size() > 0) {
            Log.d(TAG, "Message data payload: " + remoteMessage.getData());
        }
        if (remoteMessage.getNotification() != null) {
            Log.d(TAG, "Message Notification Body: " + remoteMessage.getNotification().getBody());
        }
        String message = (String) remoteMessage.getData().get(SettingsJsonConstants.PROMPT_TITLE_KEY);
        String subtitle = (String) remoteMessage.getData().get("subtitle");
        String isSoundPlay = (String) remoteMessage.getData().get("playsound");
        this.bitmap = getBitmapfromUrl((String) remoteMessage.getData().get("image"));
        sendNotification(message, this.bitmap, subtitle, isSoundPlay);
    }

    private void sendNotification(String title, Bitmap image, String subtitle, String isSoundPlay) {
        Builder notificationBuilder;
        Intent intent = new Intent(this, Mainactivity_new.class);
        intent.addFlags(67108864);
        intent.putExtra(SettingsJsonConstants.PROMPT_MESSAGE_KEY, title);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 1073741824);
        Log.d(TAG, "sendNotification is called ");
        Uri defaultSoundUri = RingtoneManager.getDefaultUri(2);
        if ("yes".equalsIgnoreCase(isSoundPlay)) {
            notificationBuilder = new Builder(this).setLargeIcon(image).setSmallIcon(C0322R.drawable.ic_launcher).setContentTitle(title).setStyle(new BigPictureStyle().bigPicture(image)).setAutoCancel(true).setSound(defaultSoundUri).setContentIntent(pendingIntent).setSubText(subtitle);
        } else {
            notificationBuilder = new Builder(this).setLargeIcon(image).setSmallIcon(C0322R.drawable.ic_launcher).setContentTitle(title).setStyle(new BigPictureStyle().bigPicture(image)).setAutoCancel(true).setContentIntent(pendingIntent).setSubText(subtitle);
        }
        ((NotificationManager) getSystemService("notification")).notify(0, notificationBuilder.build());
    }

    public Bitmap getBitmapfromUrl(String imageUrl) {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(imageUrl).openConnection();
            connection.setDoInput(true);
            connection.connect();
            return BitmapFactory.decodeStream(connection.getInputStream());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
