package com.example.myapp.convertpoundtogram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonConvPoundsToGrams = (Button) findViewById(R.id.buttonConvPoundsToGrams);
        buttonConvPoundsToGrams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxPounds = (EditText) findViewById(R.id.editTextPounds);
                EditText textBoxGrams  = (EditText) findViewById(R.id.editTextGrams);
                double vPounds = Double.valueOf(textBoxPounds.getText().toString());
                double vGrams = vPounds * 453.592;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxGrams.setText(formatVal.format(vGrams));
            }
        });

        Button buttonConvGramsToPounds = (Button) findViewById(R.id.buttonConvGramsToPounds);
        buttonConvGramsToPounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxGrams  = (EditText) findViewById(R.id.editTextGrams);
                EditText textBoxPounds = (EditText) findViewById(R.id.editTextPounds);
                double vGrams  = Double.valueOf(textBoxGrams.getText().toString());
                double vPounds = vGrams / 453.592;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxPounds.setText(formatVal.format(vPounds));
            }
        });
    }
}
