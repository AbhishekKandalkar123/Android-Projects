package com.akan.androidtopics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.akan.androidtopics.AkAdapter;
import com.akan.androidtopics.MainActivity2;
import com.akan.androidtopics.R;

public class MainActivity extends AppCompatActivity {
    android.widget.ListView listView;
    String[] arr= {"Abhishek", "Shreyash", "Darshan", "Lalit", "Devansh", "Bhargav", "Umesh", "Vaibhav", "Shivam", "Rohan", "Kartik" ,"Shubham" , "Yash" , "Vedant"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        // Using inbuild Adapter
//        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arr);
//        listView.setAdapter(ad);

        // Using custom Adapter
        AkAdapter ad = new AkAdapter(this, R.layout.ak_layout, arr);
        listView.setAdapter(ad);
    }
    public void openActivity(View v){
        Toast.makeText(this, "Starting next Topic", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}