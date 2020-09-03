package com.facebook.inputcontrollers_f5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RadioGroup radiog1;
    RadioButton radiob1,radiob2;
    CheckBox ch1,ch2,ch3;
    Switch aSwitch;
    LinearLayout linearLayout;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.sp1);
        aSwitch = findViewById(R.id.switch1);
        linearLayout = findViewById(R.id.linear1);
        ch1 = findViewById(R.id.check1);
        ch2 = findViewById(R.id.check2);
        ch3 = findViewById(R.id.check3);
        radiog1 = findViewById(R.id.rg1);
        radiob1 = findViewById(R.id.rb1);
        radiob2 = findViewById(R.id.rb2);
        ArrayList<String> weeks = new ArrayList<>();
        weeks.add("Sunday");
        weeks.add("MonDay");
        weeks.add("TuesDay");
        weeks.add("WednesDay");
        weeks.add("ThursDay");
        weeks.add("Friday");
        weeks.add("Saturday");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item,weeks);
        spinner.setAdapter(adapter);











        radiog1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb1:
                        Toast.makeText(MainActivity.this, "You Selected Male", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb2:
                        Toast.makeText(MainActivity.this, "You Selected FeMale", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

    public void saveImg(View view) {
        Toast.makeText(this, "You Selected Image", Toast.LENGTH_SHORT).show();
    }

    public void submit(View view) {
        if(ch1.isChecked()&&ch2.isChecked()&&ch3.isChecked()){
            Toast.makeText(this, ""+ch1.getText()+","+ch2.getText()+","+ch3.getText(), Toast.LENGTH_SHORT).show();
        }
        else if (ch1.isChecked()&&ch2.isChecked()){
            Toast.makeText(this, ""+ch1.getText()+","+ch2.getText(), Toast.LENGTH_SHORT).show();
        }
        else if (ch2.isChecked()&&ch3.isChecked()){
            Toast.makeText(this, ""+ch2.getText()+","+ch3.getText(), Toast.LENGTH_SHORT).show();
        }
        else if (ch1.isChecked()&&ch3.isChecked()){
            Toast.makeText(this, ""+ch1.getText()+","+ch3.getText(), Toast.LENGTH_SHORT).show();
        }
        else if (ch1.isChecked()){
            Toast.makeText(this, ""+ch1.getText(), Toast.LENGTH_SHORT).show();
        }
        else if (ch2.isChecked()){
            Toast.makeText(this, ""+ch2.getText(), Toast.LENGTH_SHORT).show();
        }
        else if (ch3.isChecked()){
            Toast.makeText(this, ""+ch3.getText(), Toast.LENGTH_SHORT).show();
        }
    }

    public void changeColor(View view) {
        if(aSwitch.isChecked()){
            linearLayout.setBackgroundColor(Color.GREEN);

        }else{
            linearLayout.setBackgroundColor(Color.YELLOW);
        }
    }
}