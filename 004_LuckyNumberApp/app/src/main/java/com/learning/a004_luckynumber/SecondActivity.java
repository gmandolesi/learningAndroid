package com.learning.a004_luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    TextView randomNumber;
    Button shareBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        randomNumber = findViewById(R.id.luckyNumber);
        shareBtn = findViewById(R.id.shareButton);

        Intent i1 = getIntent();
        String userName = i1.getStringExtra("name");
        int luckyNumber = generateRandomNumber();
        randomNumber.setText(""+ luckyNumber);

        shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareData(userName, luckyNumber);
            }
        });
    }

    public int generateRandomNumber(){
        Random random = new Random();
        return random.nextInt(999); // upper limit: 999
    }

    public void shareData(String username, int randomNum){
        // implicit intent
        Intent i2 = new Intent(Intent.ACTION_SEND);
        i2.setType("text/plain");
        i2.putExtra(Intent.EXTRA_SUBJECT, username+" got lucky!");
        i2.putExtra(Intent.EXTRA_TEXT, "The lucky number is "+randomNum);

        startActivity(Intent.createChooser(i2, "Choose Platform"));
    }
}