package com.akan.database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DbHandler dbHandler = new DbHandler(this, "empdb", null, 1);
//        dbHandler.addEmployee(new Employee(1, "Abhi", 33.35));
        dbHandler.getEmployee(1);
        dbHandler.close();
    }
}