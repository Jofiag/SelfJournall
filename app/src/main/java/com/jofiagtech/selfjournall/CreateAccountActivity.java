package com.jofiagtech.selfjournall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

public class CreateAccountActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private AutoCompleteTextView nameField;
    private AutoCompleteTextView emailField;
    private TextView password;
    private Button createAccountButton;

    private FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;
    private FirebaseUser mCurrentUser;

    private FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        referenceLayoutField();

        mFirebaseAuth = FirebaseAuth.getInstance();
    }

    @Override
    protected void onStart() {
        super.onStart();

        mCurrentUser = mFirebaseAuth.getCurrentUser();
        mFirebaseAuth.addAuthStateListener(mAuthStateListener);
    }

    private void referenceLayoutField(){
        nameField = findViewById(R.id.user_name);
        emailField = findViewById(R.id.user_email_for_creation);
        password = findViewById(R.id.password_for_creation);
        createAccountButton = findViewById(R.id.create_account_button_for_creation);
        progressBar = findViewById(R.id.create_account_progress_bar);
    }

    private void createTheNewAccount(){
        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create new user account
            }
        });
    }
}
