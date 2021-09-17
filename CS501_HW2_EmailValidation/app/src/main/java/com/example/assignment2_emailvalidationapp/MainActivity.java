package com.example.assignment2_emailvalidationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTxtEmail;
    private Button btnEmailSubmit;
    private TextView txtEmailValid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEmailValid = (TextView) findViewById(R.id.txtViewEmail);
        txtEmailValid.setText("Enter Email.");

        editTxtEmail = (EditText) findViewById(R.id.edtTextEmail);

        btnEmailSubmit = (Button) findViewById(R.id.btnCheckValid);
        btnEmailSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String EMAIL = editTxtEmail.getText().toString();
                boolean isValid = emailValidationChecker(EMAIL);
                if (isValid) {
                    txtEmailValid.setText("VALID.");
                } else {
                    txtEmailValid.setText("INVALID.");
                }
            }
        });
    }

    /**
     * Email Validation
     * Input: String email
     */
    private boolean emailValidationChecker (String email) {
        // from geeks2geeks email pattern matching
        if (!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return true;
        } else {
            return false;
        }
    }
}