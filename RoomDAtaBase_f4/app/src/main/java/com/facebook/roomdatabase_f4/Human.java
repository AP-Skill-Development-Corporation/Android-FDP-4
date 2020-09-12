package com.facebook.roomdatabase_f4;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "human")
public class Human {
    @PrimaryKey(autoGenerate = true)
    int person_id;
    String name;
    int age;

    public Human( String name, int age) {

        this.name = name;
        this.age = age;
    }






    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
