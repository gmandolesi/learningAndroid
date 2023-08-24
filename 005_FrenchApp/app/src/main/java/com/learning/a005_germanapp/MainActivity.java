// TO RUN THIS APP ON MAC, THE BLUETOOTH HAS TO BE DISABLED BEFORE OPENING ANDROID STUDIO!


package com.learning.a005_germanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button blackBtn, greenBtn, purpleBtn, redBtn, yellowBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackBtn = findViewById(R.id.blackButton);
        blackBtn.setOnClickListener(this);

        greenBtn = findViewById(R.id.greenButton);
        greenBtn.setOnClickListener(this);

        purpleBtn = findViewById(R.id.purpleButton);
        purpleBtn.setOnClickListener(this);

        redBtn = findViewById(R.id.redButton);
        redBtn.setOnClickListener(this);

        yellowBtn = findViewById(R.id.yellowButton);
        yellowBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int clickedBtnId = view.getId();
        if (clickedBtnId == R.id.blackButton)
            playSound(R.raw.black);
        if (clickedBtnId == R.id.greenButton)
            playSound(R.raw.green);
        if (clickedBtnId == R.id.purpleButton)
                playSound(R.raw.purple);
        if (clickedBtnId == R.id.redButton)
                playSound(R.raw.red);
        if (clickedBtnId == R.id.yellowButton)
                playSound(R.raw.yellow);
        }

    public void playSound (int color){
        Toast.makeText(this, "play "+ new Integer(color).toString(), Toast.LENGTH_SHORT).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(
                this, color);
        mediaPlayer.start();
    }
}