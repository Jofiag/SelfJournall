package com.jofiagtech.selfjournall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText emailField;
    private EditText passwordField;
    private Button signInButton;
    private Button signUpButton;

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
            case R.id.create_account_button:
                break;
        }

    }

    private void referenceLayoutField(){
        emailField = findViewById(R.id.user_email_edt);
        passwordField = findViewById(R.id.user_password_edt);
        signInButton = findViewById(R.id.login_button);
        signUpButton = findViewById(R.id.create_account_button);
    }
}
