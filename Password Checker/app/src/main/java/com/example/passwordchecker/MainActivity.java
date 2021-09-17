package com.example.passwordchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnCompare;
    private EditText edtOp1;
    private EditText edtOp2;
    private TextView txtResult;
    private TextView txtPW1;
    private TextView txtPW2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtOp1 = (EditText) findViewById(R.id.edtOp1);
        edtOp2 = (EditText) findViewById(R.id.edtOp2);
        btnCompare = (Button) findViewById(R.id.btnCompare);
        txtResult = (TextView) findViewById(R.id.txtResult);
        txtPW1 = (TextView) findViewById(R.id.txtPW1);
        txtPW2 = (TextView) findViewById(R.id.txtPW2);

        btnCompare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtOp1.getText().toString().equals(edtOp2.getText().toString())){
                    txtResult.setText("THANK YOU!!!");
                } else {
                    txtResult.setText("PASSWORDS MUST MATCH!!");
                }
            }
        });
    }
}