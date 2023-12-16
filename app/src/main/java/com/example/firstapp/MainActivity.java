package com.example.firstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editTextUsername;
    private EditText editTextPassword;

    private static final String USERNAME = "User";
    private static final String PASSWORD = "Password";
    private static final String ERROR_MSG = "Sorry, your email or password was incorrect. Try Again!";

    private static final String SUCCESS_MSG = "Login successful!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View loginBtn = findViewById(R.id.loginBtn);
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);

        loginBtn.setOnClickListener(v -> {
            String enteredUsername = editTextUsername.getText().toString();
            String enteredPassword = editTextPassword.getText().toString();

            handleLogin(enteredUsername, enteredPassword);
        });
    }

    private void handleLogin(String enteredUsername, String enteredPassword) {
        if (enteredUsername.equals(USERNAME) && enteredPassword.equals(PASSWORD))  {
            showToast(SUCCESS_MSG);
        } else {
            showToast(ERROR_MSG);
        }
    }

    private void showToast(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}