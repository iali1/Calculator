package com.example.MyFirstApp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MyActivity extends Activity implements View.OnClickListener {
    EditText num1, num2;
    Button Add, Subtract, Multiply, Divide, Clear;
    TextView Answer;
    Integer V1, V2, Total;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        Add = (Button) findViewById(R.id.Add);
        Subtract = (Button) findViewById(R.id.Subtract);
        Multiply = (Button) findViewById(R.id.Multiply);
        Divide = (Button) findViewById(R.id.Divide);
        Clear = (Button) findViewById(R.id.Clear);

        Add.setOnClickListener(this);
        Subtract.setOnClickListener(this);
        Multiply.setOnClickListener(this);
        Divide.setOnClickListener(this);
        Clear.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        String V1string =  num1.getText().toString();
        V1 = Integer.parseInt(V1string);
        String V2string = num2.getText().toString();
        V2 = Integer.parseInt(V2string);

        switch (v.getId()){
            case (R.id.Add):
                Total = V1 + V2;
                Answer = (TextView) findViewById(R.id.Answer);
                Answer.setText("Answer is: "+Answer);
                break;

            case (R.id.Subtract):
                Total = V1 - V2;
                Answer = (TextView) findViewById(R.id.Answer);
                Answer.setText("Answer is: "+Answer);
                break;

            case (R.id.Multiply):
                Total = V1 * V2;
                Answer = (TextView) findViewById(R.id.Answer);
                Answer.setText("Answer is: "+Answer);
                break;

            case (R.id.Divide):
                    Total = V1 / V2;
                Answer = (TextView) findViewById(R.id.Answer);
                Answer.setText("Answer is: "+Answer);
                break;

            case (R.id.Clear):
                 num1.setText("");
                 num2.setText("");
                break;
        }


    }


}
