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

    private float Value1;

    boolean Addition, Subtract, Multiplication, Division;

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

        /*
        Number One Button
         */
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickChecker("1");
            }
        });

        /*
        Number Two Button
         */
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickChecker("2");
            }
        });

        /*
        Number Three Button
         */
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickChecker("3");
            }
        });

        /*
        Number Four Button
         */
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickChecker("4");
            }
        });

        /*
        Number Five Button
         */
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickChecker("5");
            }
        });

        /*
        Number Six Button
         */
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickChecker("6");
            }
        });

        /*
        Number Seven Button
         */
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickChecker("7");
            }
        });

        /*
        Number Eight Button
         */
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickChecker("8");;
            }
        });

        /*
        Number Nine Button
         */
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickChecker("9");;
            }
        });

        /*
        Zero Button
         */
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickChecker("0");
            }
        });

        /*
        Addition Button
         */
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateOperation("ADD");
            }
        });

        /*
        Subtraction Button
         */
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateOperation("SUB");
            }
        });

        /*
        Multiplication Button
         */
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateOperation("MUL");
            }
        });

        /*
        Division Button
         */
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateOperation("DIV");
            }
        });

        /*
        Equal button that delivers the final result
         */
        btnEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float Value2 = Float.parseFloat(edtOp1.getText().toString());
                if(Addition == true){
                    edtOp1.setText(String.valueOf(Value1 + Value2));
                    Addition = false;
                } else if (Subtract == true){
                    edtOp1.setText(String.valueOf(Value1 - Value2));
                    Subtract = false;
                } else if (Multiplication == true){
                    edtOp1.setText(String.valueOf(Value1 * Value2));
                    Multiplication = false;
                } else if (Division == true){
                    if(Value2 == 0){
                        edtOp1.setText("ERROR");
                    } else {
                        edtOp1.setText(String.valueOf(Value1 / Value2));
                    }
                    Multiplication = false;
                }
            }
        });

        /*
        button that adds a decimal at the end of the number if there is not one already
         */
        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!edtOp1.getText().toString().contains(".")){
                    edtOp1.setText(edtOp1.getText() + ".");
                }
            }
        });

        /*
        button that squares the current number
         */
        btnSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float value = Float.parseFloat(edtOp1.getText().toString());
                edtOp1.setText(String.valueOf(value * value));
            }
        });
    }

    /*
    Helper function to help the number buttons update the editText Box
     */
    public void clickChecker(String num){
        if (edtOp1.getText().toString().equals("0") || edtOp1.getText().toString().equals("ERROR")){
            edtOp1.setText(num);
        } else {
            edtOp1.setText(edtOp1.getText() + num);
        }
    }

    /*
    Helper to update the app when user clicks on one of the four operations
     */
    public void updateOperation(String operation){
        Value1 = Float.parseFloat(edtOp1.getText().toString());
        edtOp1.setText("0");
        if(operation == "ADD"){
            Addition = true;
            Subtract = false;
            Multiplication = false;
            Division = false;
        } else if (operation == "SUB"){
            Addition = false;
            Subtract = true;
            Multiplication = false;
            Division = false;
        } else if (operation == "MUL"){
            Addition = false;
            Subtract = false;
            Multiplication = true;
            Division = false;
        } else if (operation == "DIV"){
            Addition = false;
            Subtract = false;
            Multiplication = false;
            Division = true;
        }
    }
}