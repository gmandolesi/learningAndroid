package com.learning.thecounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView displayedCounter;
    Button counterBtn;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterBtn = findViewById(R.id.counterBtn);
        displayedCounter = findViewById(R.id.counterId);

        counterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayedCounter.setText("" + increaseCounter());
            }
        });
    }

    public int increaseCounter(){
        return ++counter;
    }
}