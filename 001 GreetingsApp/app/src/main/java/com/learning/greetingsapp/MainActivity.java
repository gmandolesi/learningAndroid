package com.learning.greetingsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    Button clickMeBtn;
    TextView welcomeText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.UserName);
        clickMeBtn = findViewById(R.id.button);
        welcomeText = findViewById(R.id.title);

        clickMeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputName = name.getText().toString();
                Toast.makeText(
                        MainActivity.this,
                        "Welcome "+inputName+ " to our App! :)",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}