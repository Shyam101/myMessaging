package com.example.samplefcmapp;

import android.os.Build;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import com.example.waterbase.messaging.FirebaseMessagingService;
import com.example.waterbase.messaging.RemoteMessage;
//import com.google.firebase.messaging.FirebaseMessagingService;
//import com.google.firebase.messaging.RemoteMessage;

public class PushNotificationService extends FirebaseMessagingService {

    private static String TAG = "PushNotificationService";

    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
        Log.i(TAG,"new token received " + token);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onMessageReceived(@NonNull RemoteMessage message) {
//        String title = message.getNotification().getTitle();
//        String text = message.getNotification().getBody();
//
//        final String CHANNEL_ID = "NOTIFICATION_CHANNEL";
//
//        NotificationChannel channel = new NotificationChannel(
//                CHANNEL_ID,
//                "CUSTOM CHANNEL",
//                NotificationManager.IMPORTANCE_HIGH
//        );
//
//        getSystemService(NotificationManager.class).createNotificationChannel(channel);
//        Notification.Builder notification = new Notification.Builder(this, CHANNEL_ID)
//                .setContentTitle(title)
//                .setContentText(text)
//                .setSmallIcon(R.drawable.ic_launcher_background)
//                .setAutoCancel(true);
//
//        NotificationManagerCompat.from(this).notify(1, notification.build());
        super.onMessageReceived(message);
    }
}
