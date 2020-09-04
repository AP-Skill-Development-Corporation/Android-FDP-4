package com.facebook.optionsmenu_f5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*The OptionsMenu in the Appbar provides navigation to otherActivities.
    * OptionsMenu  such  as  placing an order in Zomato App
    * Changing Settings
    * Profile Information*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //override onCreate OptionsMenu
    //where you inflate your menu resources into menu provide the callback

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:

                Toast.makeText(this, "You Selected item1", Toast.LENGTH_SHORT).show();
                 break;
            case R.id.item2:
                Toast.makeText(this, "You Selected item2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
              //  Toast.makeText(this, "You Selected item3", Toast.LENGTH_SHORT).show();
                /*A Dialog is a small window  that prompts the  user to make  a decision or enter
                * additional information*/
                 //Instantiate an AlertDialog.Builder with its constructer
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("AlertDialogBox");
                builder.setMessage("Do you close the App?");
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
                break;
            case R.id.item4:
            Toast.makeText(this, "You Selected item4", Toast.LENGTH_SHORT).show();
            finish();
            break;

        }
        return super.onOptionsItemSelected(item);

    }

}