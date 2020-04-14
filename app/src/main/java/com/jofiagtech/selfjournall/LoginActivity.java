package com.jofiagtech.selfjournall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText emailField;
    private EditText passwordField;
    private Button loginButton;
    private Button createAccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        referenceLayoutField();

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.login_button:
                break;
            case R.id.create_account_button:
                startCreteAccountActivity();
                break;
        }

    }

    private void referenceLayoutField(){
        emailField = findViewById(R.id.user_email_edt);
        passwordField = findViewById(R.id.user_password_edt);
        loginButton = findViewById(R.id.login_button);
        createAccountButton = findViewById(R.id.create_account_button);

        loginButton.setOnClickListener(this);
        createAccountButton.setOnClickListener(this);
    }

    private void startCreteAccountActivity(){
        Intent intent = new Intent(LoginActivity.this, CreateAccountActivity.class);
        startActivity(intent);
    }
}
