package com.example.a403.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText, editText2;
    Button button, button2, button3, button4, button5;
    TextView textView;
    int num1=0, num2=0;
    int Result=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        editText = (EditText) findViewById(R.id.editText3);
        editText2 = (EditText) findViewById(R.id.editText4);
        button = (Button) findViewById(R.id.button4);
        button2 = (Button) findViewById(R.id.button5);
        button3 = (Button) findViewById(R.id.button6);
        button4 = (Button) findViewById(R.id.button7);
        button5 = (Button) findViewById(R.id.button8);
        textView = (TextView) findViewById(R.id.textView3);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(editText.getText().toString());
                num2 = Integer.parseInt(editText2.getText().toString());
                Result = num1+num2;
                textView.setText("계산결과 :"+Result);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(editText.getText().toString());
                num2 = Integer.parseInt(editText2.getText().toString());
                Result = num1-num2;
                textView.setText("계산결과 :"+Result);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(editText.getText().toString());
                num2 = Integer.parseInt(editText2.getText().toString());
                Result = num1*num2;
                textView.setText("계산결과 :"+Result);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(editText.getText().toString());
                num2 = Integer.parseInt(editText2.getText().toString());
                Result = num1/num2;
                textView.setText("계산결과 :"+Result);
            }
        });


    }
}
