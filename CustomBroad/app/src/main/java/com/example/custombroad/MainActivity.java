package com.example.custombroad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  //  public static final String custom="com.example.custombroad";

   // ImageView imageView;
   IntentFilter filter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // imageView=findViewById(R.id.img);

        filter =new IntentFilter();

        filter.addAction(Intent.ACTION_POWER_CONNECTED);
        filter.addAction(Intent.ACTION_POWER_DISCONNECTED);
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);


        LocalBroadcastManager.getInstance(this).registerReceiver(new MyReceiver(),filter);

      //  LocalBroadcastManager.getInstance(this).registerReceiver(new MyReceiver(),new IntentFilter(custom));
    }


}
