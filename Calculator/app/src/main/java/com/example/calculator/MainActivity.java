package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnDec, btnAdd, btnMul,
     btnSub, btnDiv, btnSqrt, btnEq;

    private EditText edtOp1;

    private float Value1, Value2;

    boolean Addition, Subtract, Multiplication, Division, Square;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnZero = (Button) findViewById(R.id.btnZero);
        btnDec = (Button) findViewById(R.id.btnDec);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnSqrt = (Button) findViewById(R.id.btnSqrt);
        btnEq = (Button) findViewById(R.id.btnEq);
        edtOp1 = (EditText) findViewById(R.id.edtOp1);
        edtOp1.setText(edtOp1.getText() + "0");

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtOp1.getText().toString() == "0" ){
                    edtOp1.setText("1");
                }
                edtOp1.setText(edtOp1.getText() + "1");
            }
        });

        //comment to test commit

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtOp1.setText(edtOp1.getText() + "2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtOp1.setText(edtOp1.getText() + "3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtOp1.setText(edtOp1.getText() + "4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtOp1.setText(edtOp1.getText() + "5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtOp1.setText(edtOp1.getText() + "6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtOp1.setText(edtOp1.getText() + "7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtOp1.setText(edtOp1.getText() + "8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtOp1.setText(edtOp1.getText() + "9");
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtOp1.setText(edtOp1.getText() + "0");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Value1 = Float.parseFloat(edtOp1.getText() + "");
                Addition = true;
                ed
            }
        });


    }
}