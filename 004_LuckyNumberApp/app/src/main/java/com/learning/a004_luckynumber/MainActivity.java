package com.learning.a004_luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name;
    Button luckyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.userName);
        luckyBtn = findViewById(R.id.luckyButton);

        luckyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = name.getText().toString();

                // Explicit Intent
                Intent i1 = new Intent(
                        getApplicationContext(),
                        SecondActivity.class
                );

                i1.putExtra("name", userName);
                startActivity(i1);
            }
        });
    }
}