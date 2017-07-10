package com.simples.res.notificationcompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private NotificationManager manager;
    private int notificationID = 100;
    private int numMessages = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startBtn = (Button)findViewById(R.id.bStart);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNotification();
            }
        });

        Button cancelBtn = (Button)findViewById(R.id.bCancel);
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cancelNotification();
            }
        });

        Button updateBtn = (Button)findViewById(R.id.update);
        updateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateNotification();
            }
        });
    }

    protected void displayNotification(){

        /* Invoking the default notification service */
        Notification.Builder builder = new Notification.Builder(getApplicationContext());
        builder.setContentTitle("New Message");
        builder.setContentText("You've received new message.");
        builder.setTicker("New Message Alert!");
        builder.setSmallIcon(R.drawable.woman);

        /* Increase notification number every time a new notification arrives */
        builder.setNumber(++numMessages);

        /* Creates an explicit intent for an Activity in your app */
        Intent resultIntent = new Intent(this, NotificationView.class);
    }

    protected void cancelNotification(){
        manager.cancel(notificationID);
    }

    protected void updateNotification(){

    }
}
