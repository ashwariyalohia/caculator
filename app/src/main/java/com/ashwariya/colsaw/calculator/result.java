package com.ashwariya.colsaw.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class result extends AppCompatActivity{
    private static final String TAG = "result";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate:Result Called");
        setContentView(R.layout.layout);
        TextView resultText = findViewById(R.id.layout_result);
        resultText.setText(getIntent().getExtras().getString("data"));
    }
}
