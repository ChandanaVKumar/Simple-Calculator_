package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Num1;
    private EditText Num2;
    private Button add;
    private Button sub;
    private Button pro;
    private Button div;
    private TextView res;
    int result = 0; /* can declare a variable for the whole prgram in public class*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Num1 = (EditText) findViewById(R.id.editText);
        Num2 = (EditText) findViewById(R.id.editText2);
        add = (Button) findViewById(R.id.button);
        sub = (Button) findViewById(R.id.button2);
        pro = (Button) findViewById(R.id.button3);
        div = (Button) findViewById(R.id.button4);
        res = (TextView) findViewById(R.id.textView2);



/* different onClick methods used for different bottons */
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 =  Integer.parseInt(Num1.getText().toString());
                int number2 =  Integer.parseInt(Num2.getText().toString());
                result = number1 + number2;
                res.setText("Answer =    " + String.valueOf(result));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 =  Integer.parseInt(Num1.getText().toString());
                int number2 =  Integer.parseInt(Num2.getText().toString());
                result = number1 - number2;
                res.setText("Answer =    " + String.valueOf(result));
            }
        });

        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 =  Integer.parseInt(Num1.getText().toString());
                int number2 =  Integer.parseInt(Num2.getText().toString());
                result = number1 * number2;
                res.setText("Answer =    " + String.valueOf(result));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 =  Integer.parseInt(Num1.getText().toString());
                int number2 =  Integer.parseInt(Num2.getText().toString());
                result = number1 / number2;
                res.setText("Answer =    " + String.valueOf(result));
            }
        });

    }
}
