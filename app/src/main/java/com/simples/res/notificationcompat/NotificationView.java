package com.simples.res.notificationcompat;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by use on 10.07.17.
 */
public class NotificationView extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);
    }
}
