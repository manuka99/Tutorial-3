package com.tute3.a3august_9august;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    EditText input1, input2;
    TextView displaySum;
    int number1, number2;
    Button add, sub, divide, multi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        add = findViewById(R.id.plus);
        sub = findViewById(R.id.minus);
        multi = findViewById(R.id.multi);
        divide = findViewById(R.id.divide);

        displaySum = findViewById(R.id.displayValue);

        input1 = findViewById(R.id.number1display);
        input2 = findViewById(R.id.number2display);
        number1 = getIntent().getIntExtra("num1", 0);
        number2 = getIntent().getIntExtra("num2", 0);
        displaySum.setText(number1 + " + " + number2 + " = " + (number1+number2));
        input1.setText(number1 + "");
        input1.setEnabled(false);
        input2.setText(number2 + "");
        input2.setEnabled(false);
    }

    @Override
    public void onClick(View view) {
        if(view == add)
            displaySum.setText(number1 + " + " + number2 + " = " + (number1+number2));

        else if(view == sub)
            displaySum.setText(number1 + " - " + number2 + " = " + (number1-number2));

        else if(view == multi)
            displaySum.setText(number1 + " * " + number2 + " = " + (number1*number2));

        else if(view == divide)
            displaySum.setText(number1 + " / " + number2 + " = " + (number1/number2));
    }
}