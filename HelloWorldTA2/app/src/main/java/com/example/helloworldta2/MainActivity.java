package com.example.helloworldta2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnSayHello;
    private TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = (TextView) findViewById(R.id.tvMessage);
        tvMessage.setText("Hello World.");

        btnSayHello = (Button)findViewById(R.id.btnSayHello);
        btnSayHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMessage.setText("FINALLY - HELLO.");
            }
        });
    }
}