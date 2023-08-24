package com.learning.weightconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText inputWeightInKg;
    Button convertBtn;
    TextView weightInPounds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputWeightInKg = findViewById(R.id.weightKg);
        convertBtn = findViewById(R.id.converterBtn);
        weightInPounds = findViewById(R.id.WeightLb);

        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weightInPounds.setText(""+convert(Double.parseDouble(inputWeightInKg.getText().toString())));
            }
        });
    }

    public double convert(double kg){
        return kg*2.2;
    }
}