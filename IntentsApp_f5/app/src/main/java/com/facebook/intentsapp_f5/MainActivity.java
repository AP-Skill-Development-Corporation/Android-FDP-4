package com.facebook.intentsapp_f5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*Intent : is a  message that is passed b/w components such as activities,
    * contentproviders,broadcastreceivers,services*/
    /*Android Intents are mainly used to:
    * Launch Activity
    * Start the Service
    * Display Webpage
    * Dial a Phone Call
    *  Display alist of Contacts.
    * There are  two types of Intents in android
    * Implicit : is Does not  specify the  component Intents navigate from
    * system apps to systemapps.
    * Explicit: navigate from system app to UserApps*/
    EditText et1,et2,et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.edit1);
        et2 = findViewById(R.id.edit2);
        et3 = findViewById(R.id.edit3);
    }

    public void navigate(View view) {
        Intent  intent = new Intent(this,SecondAcitivity.class);
        startActivity(intent);
    }

    public void sendData(View view) {
        String data = et1.getText().toString();
        Intent intent = new Intent(this,SecondAcitivity.class);
        intent.putExtra("KEY",data);
        startActivity(intent);
    }

    public void sendUrl(View view) {
        String data1 = et2.getText().toString();
        Uri  webpage = Uri.parse("nttps://www."+data1);
        Intent intent = new Intent(Intent.ACTION_VIEW,webpage);
        startActivity(intent);
    }

    public void Dial(View view) {
        String data2 = et3.getText().toString();
        Uri  uri = Uri.parse("tel:"+data2);
        Intent i = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(i);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}