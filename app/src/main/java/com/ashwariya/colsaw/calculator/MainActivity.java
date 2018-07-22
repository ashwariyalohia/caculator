package com.ashwariya.colsaw.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: Called");
        setContentView(R.layout.activity_main);
    }
    public void onStart() {
        Log.d(TAG, "onStart: called");
        super.onStart();
    }
    public void onResume() {
        Log.d(TAG, "onResume: called");
        super.onResume();
    }
    public void onRestart() {
        Log.d(TAG, "onRestart: acalled");
        super.onRestart();
    }
    public void onStop() {
        Log.d(TAG, "onStop: called");
        super.onStop();
    }
    public void onDestroy() {
        Log.d(TAG, "onDestroy: called");
        super.onDestroy();
    }
    public void onButtonClick(View v){
        EditText num1 = (EditText) findViewById(R.id.Number1);
        EditText num2 = (EditText) findViewById(R.id.Number2);
        TextView res = (TextView) findViewById(R.id.result);
        String temp = new String();
        String temp2 = new String();
        Double number1;
        Double number2;
        Double result;
        try{
            switch(v.getId()){
                case R.id.addition:
                    temp = num1.getText().toString();
                    temp2 = num2.getText().toString();
                    number1 = Double.parseDouble(temp);
                    number2 = Double.parseDouble(temp2);
                    result = number1+number2;
                    temp = Double.toString(result);
                    res.setText(temp);
                    break;

                case R.id.multiplication:
                    temp = num1.getText().toString();
                    temp2 = num2.getText().toString();
                    number1 = Double.parseDouble(temp);
                    number2 = Double.parseDouble(temp2);
                    result = number1*number2;
                    temp = Double.toString(result);
                    res.setText(temp);
                    break;

                case R.id.subtraction:
                    temp = num1.getText().toString();
                    temp2 = num2.getText().toString();
                    number1 = Double.parseDouble(temp);
                    number2 = Double.parseDouble(temp2);
                    result = number1-number2;
                    temp = Double.toString(result);
                    res.setText(temp);
                    break;

                case R.id.division:
                    temp = num1.getText().toString();
                    temp2 = num2.getText().toString();
                    number1 = Double.parseDouble(temp);
                    number2 = Double.parseDouble(temp2);
                    result = number1/number2;
                    temp = Double.toString(result);
                    res.setText(temp);
                    break;
            }
        }catch(Exception e){
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }
}
