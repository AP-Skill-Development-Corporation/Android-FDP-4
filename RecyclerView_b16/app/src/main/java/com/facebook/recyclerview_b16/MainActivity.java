package com.facebook.recyclerview_b16;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
    /*RecyclerView is an advanced and flexible version of ListView and
    * GridView. It is a Container used for displaying  large amout of data
    * sets.*/
RecyclerView recyclerView;
int images[];
String names[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler1);
        images = new int[]{R.drawable.ala,R.drawable.bahu,R.drawable.ca,
        R.drawable.d,R.drawable.e,R.drawable.f2,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j};
        names = new String[]{"AlaVaikuntapuramLo","BahuBali","KancharaPalem","Dammu","Eega",
        "F2","GangLeader","HappyDays","I","Julai"};

    }
    class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewInfo>{


        @NonNull
        @Override
        public MovieAdapter.ViewInfo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull MovieAdapter.ViewInfo holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }