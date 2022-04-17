package com.akan.javaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private final String[] questions = {"1. Java was introduced in 1995.", "2. Java was developed by Bjarne Stroustrup.",
            "3. In an instance method or a constructor, \"this\" is a reference to the current object.", "4. Constructor overloading is not possible in Java.",
            "5. Java programming is not statically-typed, means all variables should not first be declared before they can be used."};
    private final boolean[] ans = {true, false, true, false, false};
    private int score = 0;
    Button yes;
    Button no;
    TextView question;
    private int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        question = findViewById(R.id.question);
        question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index <= questions.length-1) {
                    if (ans[index]) {
                        score++;
                    }
                    index++;
                    if (index <= questions.length - 1) {
                        question.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity2.this, "Your Score is: " + score + "/"+questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity2.this, "Go back to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index <= questions.length-1){
                    if(!ans[index]){
                        score++;
                    }
                    index++;
                    if(index <= questions.length-1){
                        question.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity2.this, "Your Score is: " + score + "/"+questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity2.this, "Go back to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}