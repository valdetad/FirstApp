package com.example.firstapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    EditText emailEditText;
    ImageView imageView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText EmailAddress = (EditText) findViewById(R.id.emailEditText);
        EditText Password = (EditText) findViewById(R.id.passwordEditText);

        Button button = (Button)findViewById(R.id.loginButton) ;
        button.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(EmailAddress.getText().toString().equals("valdeta")&& Password.getText().toString().equals("valdeta")) {
                  Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();

                }
                else
                    Toast.makeText(MainActivity.this, "Sorry, your email or password was incorrect. Try Again!", Toast.LENGTH_SHORT).show();
                }

        });
    }}