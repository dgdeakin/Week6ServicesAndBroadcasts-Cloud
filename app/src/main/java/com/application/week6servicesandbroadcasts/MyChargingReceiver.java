package com.application.week6servicesandbroadcasts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyChargingReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
//        throw new UnsupportedOperationException("Not yet implemented");


        if(intent.getAction() == Intent.ACTION_POWER_DISCONNECTED){
            Log.e("Charging Status", "Power Disconnected");
        }
        else if(intent.getAction() == Intent.ACTION_POWER_CONNECTED){
            Log.e("Charging Status", "Power Connected");
        }


    }
}