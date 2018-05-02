package com.example.ochieng_derrick.appone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView tvTitle;
    EditText numOne;
    EditText numTwo;
    Button add;
    Button sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitle = (TextView) findViewById(R.id.tvTitle);
        numOne = (EditText) findViewById(R.id.numOne);
        numTwo = (EditText) findViewById(R.id.numTwo);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);

    }
    @Override

    public void onClick(View view){


        switch (view.getId()){
            case R.id.add:
                int num1add = Integer.parseInt(numOne.getText().toString());
                int num2add = Integer.parseInt(numTwo.getText().toString());
                getSum(num1add, num2add);
                break;

            case R.id.sub:
                int num1sub = Integer.parseInt(numOne.getText().toString());
                int num2sub = Integer.parseInt(numTwo.getText().toString());
                getSub(num1sub, num2sub);
                break;
        }
    }

    public void getSum(int num1, int num2){
        int sum = num1 + num2;

        Toast.makeText(this, "The result is: " + sum, Toast.LENGTH_LONG).show();
    }

    public void getSub(int num1, int num2){
        int sub = num1 - num2;

        Toast.makeText(this, "The result is: " + sub, Toast.LENGTH_LONG).show();
    }

}
