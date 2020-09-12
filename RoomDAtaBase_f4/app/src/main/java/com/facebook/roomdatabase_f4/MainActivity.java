package com.facebook.roomdatabase_f4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    /*Room is one of the most important tools int android Architecture
    * Component. Released in the Google IO 2016.
    * Ti is a powerful tool to store and manipulate information on Android
    * App It provides a very easy  way to work with data and always ensures
    * it security and integrety.
    * The The Three Major Components in Room
    * -Entity: Represents a table  with in the room Database.it should be
    * annotated with @Entity.
    * - DAO: An Interface that contains the methods to access the database.
    * It is annotated with @Dao
    * -Database: Represents the  Database.Its an object that holds a connection to
    * the SQL Database. and all the operations are excuted through it.
    * It is annotated with @Database.
    *  */
    EditText e1,e2;
    TextView t1;
    HumanDatabase hd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.edit1);
        e2 = findViewById(R.id.edit2);
        t1 = findViewById(R.id.text1);
        hd= Room.databaseBuilder(this,HumanDatabase.class,"mydb").allowMainThreadQueries()
        .build();
    }

    public void save(View view) {
        String name = e1.getText().toString();
        int age = Integer.parseInt(e2.getText().toString()) ;

        Human h = new Human(name,age);
        hd.humanDao().insert(h);
        Toast.makeText(this, "Insertion is Successfully", Toast.LENGTH_SHORT).show();
    }

    public void retrive(View view) {
        List<Human> list = hd.humanDao().getALL();
        t1.setText("");
        for (int i=0;i<list.size();i++){
            t1.append("Id: "+list.get(i).getPerson_id()+"\n");
            t1.append("Name: " +list.get(i).getName()+"\n");
            t1.append("Age: " +list.get(i).getAge()+"\n");
            //t1.append("______________\n");
        }







    }
}