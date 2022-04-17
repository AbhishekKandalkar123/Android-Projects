package com.akan.androidtopics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.akan.androidtopics.CustomAdapter;
import com.akan.androidtopics.R;

public class MainActivity2 extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] brr= {"Abhishek", "Shreyash", "Darshan", "Lalit", "Devansh", "Bhargav", "Umesh", "Vaibhav", "Shivam", "Rohan", "Kartik" ,"Shubham" , "Yash" , "Vedant"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter c = new CustomAdapter(brr);
        recyclerView.setAdapter(c);
    }
}