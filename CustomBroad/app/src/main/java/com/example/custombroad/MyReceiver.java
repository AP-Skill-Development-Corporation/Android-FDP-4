package com.example.custombroad;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        switch (intent.getAction())
        {
            case Intent.ACTION_POWER_CONNECTED:

                Toast.makeText(context, "power connected", Toast.LENGTH_SHORT).show();
               // imageView.setImageResource(R.drawable.ic_battery_charging_90_black_24dp);
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                Toast.makeText(context, "POWER DIS", Toast.LENGTH_SHORT).show();
              //  imageView.setImageResource(R.drawable.ic_battery_30_black_24dp);
                break;
            case Intent.ACTION_AIRPLANE_MODE_CHANGED:
                Toast.makeText(context, "AIRPLANE", Toast.LENGTH_SHORT).show();
               // imageView.setImageResource(R.drawable.ic_airplanemode_active_black_24dp);
                break;


        }
    }
}
