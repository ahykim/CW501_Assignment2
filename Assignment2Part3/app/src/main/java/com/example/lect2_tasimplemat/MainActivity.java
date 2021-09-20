package com.example.lect2_tasimplemat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String MyFlag = "lfa";  //this will be our trail of breadcrumbs for logging events.

//    private Button btnCalculate;
//    private EditText edtOp1;
//    private EditText edtOp2;
//    private TextView txtAnswer;
    private ImageView imgPerson;

    private Button btnSayHello;
    private EditText edtTextHello;
    private TextView textViewHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(MyFlag, "onCreate was just called.");


        //       imgPerson.setImageDrawable();
        imgPerson = (ImageView) findViewById(R.id.imgMonkey);

        //       edtOp1 = new EditText(this);  //incorrect, must find the reference that AS is holding.

//        edtOp1 = (EditText) findViewById(R.id.edtOp1);
//        edtOp2 = (EditText) findViewById(R.id.edtOp2);
//        btnCalculate = (Button) findViewById(R.id.btnCalculate);
//        txtAnswer = (TextView) findViewById(R.id.txtAnswer);

        //    edtOp1.setText("Hello World");


//        btnCalculate.setOnClickListener(new View.OnClickListener() {
//            Double Op1, Op2, Answer;
//            @Override
//            public void onClick(View view) {
//                try {
//                    Op1 = Double.parseDouble(edtOp1.getText().toString());
//                    Op2 = Double.parseDouble(edtOp2.getText().toString());
//                    Answer = Op1 + Op2;
//                    txtAnswer.setText(Answer.toString());
//                } catch (Exception e) {
//                    txtAnswer.setText("ERROR");
//                    Log.e(MyFlag, e.toString());
//                }
//            }
//        });

        // hw2 question 4f 4g
        btnSayHello = (Button) findViewById(R.id.btnSayHello);
        edtTextHello = (EditText) findViewById(R.id.edtTextHello);
        textViewHello = (TextView) findViewById(R.id.textViewHello);

        btnSayHello.setOnClickListener(new View.OnClickListener() {
            final String STRING_HELLO = "Hello.";
            @Override
            public void onClick(View view) {
                edtTextHello.setText(STRING_HELLO);
                textViewHello.setText(STRING_HELLO);
            }
        });
    }


//    public void onClick (View foo){
//        Double Op1, Op2, Answer;
//        try {
//            Op1 = Double.parseDouble(edtOp1.getText().toString());
//            Op2 = Double.parseDouble(edtOp2.getText().toString());
//            Answer = Op1 + Op2;
//            txtAnswer.setText(Answer.toString());
//        } catch (Exception e) {
//            txtAnswer.setText("ERROR");
//            Log.e(MyFlag, e.toString());
//
//        }
//    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e(MyFlag, "onStart was just called." );
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
    protected void onResume() {
        super.onResume();
        Log.e(MyFlag, "onResume was just called." );
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