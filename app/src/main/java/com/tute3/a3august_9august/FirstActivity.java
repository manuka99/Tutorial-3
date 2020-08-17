package com.tute3.a3august_9august;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    EditText input1, input2;
    Button btn_ok;
    Context context;
    int number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        btn_ok = findViewById(R.id.btn_ok);
        input1 = findViewById(R.id.number1Input);
        input2 = findViewById(R.id.number2Input);
        context = this;
    }

    @Override
    protected void onStart() {
        super.onStart();
        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    number1 = Integer.parseInt(input1.getText().toString());
                    number2 = Integer.parseInt(input2.getText().toString());
                    Toast toast = Toast.makeText(context, "Sending message", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
                    toast.show();
                    Intent intent = new Intent(context, SecondActivity.class);
                    intent.putExtra("num1", number1);
                    intent.putExtra("num2", number2);
                    startActivity(intent);
                }catch (NullPointerException|NumberFormatException e){
                    Toast.makeText(context, "Please enter valid numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}