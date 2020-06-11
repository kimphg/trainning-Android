package com.example.myapplicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int sum(int a,int b)
    {
        int result =a+b;
        return result;
    }


    public void onBtClick(View view) {
        EditText mEdit   = (EditText)findViewById(R.id.editText);
        EditText mEdit1   = (EditText)findViewById(R.id.editText2);
        int number1 = Integer.parseInt(mEdit.getText().toString());
        int number2 = Integer.parseInt(mEdit1.getText().toString());
        int value = sum(number1,number2);
        String result = String.valueOf(value);
        ((EditText)findViewById(R.id.editText3)).setText(result);
    }
}
