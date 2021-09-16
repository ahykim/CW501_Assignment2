package com.example.lect2_tasimplemat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private static final String MyFlag = "lfa";  //this will be our trail of breadcrumbs for logging events.

    private Button btnCalculate;
    private EditText edtOp1;
    private EditText edtOp2;
    private TextView txtAnswer;
    private ImageView imgPerson;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(MyFlag, "onCreate was just called.");

        //imgPerson.setImageDrawable();
        imgPerson = (ImageView) findViewById(R.id.imgMath);

        //edtOp1 = new EditText(this);  INCORRECT, must find the reference that AS is holding.

        edtOp1 = (EditText) findViewById(R.id.edtOp1);
        edtOp2 = (EditText) findViewById(R.id.edtOp2);
        btnCalculate = (Button) findViewById(R.id.btnCalculate);
        txtAnswer = (TextView) findViewById(R.id.txtAnswer);
        // Instantiate spinner and use choose_math string xml file created with the array items that will populate the spinner
        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.choose_math, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);


        btnCalculate.setOnClickListener(new View.OnClickListener() {
            Double Op1, Op2, Answer;

            @Override
            public void onClick(View view) {
                // Get selected item from spinner
                String value = spinner.getSelectedItem().toString();

                try {
                    Op1 = Double.parseDouble(edtOp1.getText().toString());
                    Op2 = Double.parseDouble(edtOp2.getText().toString());
                    switch (value){
                        case "Addition":
                            Answer = Op1 + Op2; break;
                        case "Subtraction":
                            Answer = Op1 - Op2; break;
                        case "Multiplication":
                            Answer = Op1 * Op2; break;
                        case "Division":
                            if (Op2 == 0) {
                                txtAnswer.setText("You cannot divide by zero!");
                                break;
                            }
                            else {
                                Answer = Op1 / Op2;
                                break;
                            }
                        case "Modulus":
                            if (Op2 == 0) {
                                txtAnswer.setText("You cannot divide by zero!");
                                break;
                            }
                            else {
                                Answer = Op1 % Op2;
                                break;
                            }
                    }
                    txtAnswer.setText(Answer.toString());
                } catch (Exception e) {
                    txtAnswer.setText("ERROR: You cannot use a non-double!");
                    Log.e(MyFlag, e.toString());
                }
            }
        });
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(MyFlag, "onDestroy was just called." );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(MyFlag, "onRestart was just called." );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(MyFlag, "onPause was just called." );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(MyFlag, "onStop was just called." );
    }


}