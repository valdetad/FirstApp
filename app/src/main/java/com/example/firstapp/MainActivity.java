package com.example.firstapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Put here you widgets: (Initialize Widgets)
    // To import any package or any widget package, you click "Alt + Enter
    TextView textView;
    Button button;
    EditText editText;
    ImageView imageView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText EmailAddress = (EditText) findViewById(R.id.EmailAddress);
        EditText Password = (EditText) findViewById(R.id.Password);

        Button button = (Button)findViewById(R.id.button) ;

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