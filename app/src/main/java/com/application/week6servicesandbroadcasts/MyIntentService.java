package com.application.week6servicesandbroadcasts;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyIntentService extends IntentService {




    public MyIntentService() {
        super("Intent Service");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        String value = intent.getStringExtra("value");
        String newValue = value + "Processed";
        Log.e("Send data", "SEND DATA");
        Intent intentTo = new Intent("com.application.week6servicesandbroadcasts.MyIntentService");
        intentTo.putExtra("return_value", "Processed Value Back");
        sendBroadcast(intentTo);
    }
}
