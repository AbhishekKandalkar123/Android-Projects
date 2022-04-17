package com.akan.recyclerpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Contact c1 = new Contact(1,"9876543690", "Hari");
    Contact c2 = new Contact(1,"9232943690", "Harish");
    Contact c3 = new Contact(1,"9576453690", "Harsh");
    Contact c4 = new Contact(1,"9876543340", "Rishi");
    Contact c5 = new Contact(1,"9236534670", "Saurav");
    Contact c6 = new Contact(1,"9239874830", "Rohit");
    Contact c7 = new Contact(1,"8834893299", "Komal");
    Contact c8 = new Contact(1,"7934390099", "Jetha");
    Contact c9 = new Contact(1,"8321233988", "Goli");
    Contact []contacts = {c1,c2,c3,c4,c5,c6,c7,c8,c9};

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad = new CustomAdapter(contacts);
        recyclerView.setAdapter(ad);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}