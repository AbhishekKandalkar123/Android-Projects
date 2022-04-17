package com.Akan.tables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Table_view;
        EditText Num;
        Button button;

        Table_view = findViewById(R.id.Table_view);
        Num = findViewById(R.id.Num);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer buffer = new StringBuffer();
                String s = Num.getText().toString();
                Num.setGravity(Gravity.CENTER_HORIZONTAL);
                int number = Integer.parseInt(s);
                int product = 0;
                for(int i=1; i<=10; i++){
                    product = number * i;
                    buffer.append(number+ "     " + "x" + "     "+ i +"     "+ "=" + "     "+ product + "\n\n");
                }
                Table_view.setText(buffer);
                Table_view.setGravity(Gravity.CENTER_HORIZONTAL);
            }
        });

    }
}