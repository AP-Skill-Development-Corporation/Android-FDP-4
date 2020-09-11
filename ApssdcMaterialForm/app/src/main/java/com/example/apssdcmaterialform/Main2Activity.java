package com.example.apssdcmaterialform;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.sdsmdg.harjot.rotatingtext.RotatingTextWrapper;
import com.sdsmdg.harjot.rotatingtext.models.Rotatable;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        RotatingTextWrapper rotatingTextWrapper = (RotatingTextWrapper) findViewById(R.id.custom_switcher);
        rotatingTextWrapper.setSize(35);

        Rotatable rotatable = new Rotatable(Color.parseColor("#FFA036"), 1000, "APSSDC REGISTRATION","apssdc2");
        rotatable.setSize(35);
        rotatable.setAnimationDuration(500);

        rotatingTextWrapper.setContent("This is ?", rotatable);

    }
}
