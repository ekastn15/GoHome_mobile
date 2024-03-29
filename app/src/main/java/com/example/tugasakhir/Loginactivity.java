package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class Loginactivity extends AppCompatActivity {
    Button btnLogin;
    TextView txtRegister;
    TextInputEditText emailEdit, passEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        emailEdit = findViewById(R.id.emailEdit);
        passEdit = findViewById(R.id.passEdit);
        txtRegister = findViewById(R.id.txtRegister);
        txtRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Loginactivity.this, RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Loginactivity.this, BottomnavActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}