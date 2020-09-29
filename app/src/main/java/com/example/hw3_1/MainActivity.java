package com.example.hw3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView errorText;
    private EditText login;
    private EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        errorText = findViewById(R.id.errorText);
        password = findViewById(R.id.editTextPas);
        login = findViewById(R.id.editTextLog);


    }

    public void onClick(View view) {
        String lgn = login.getText().toString();
        String pass = password.getText().toString();

        if (TextUtils.isEmpty(lgn) || TextUtils.isEmpty(pass)) {
            errorText.setText("Вы ввели не правильные данные");
            errorText.setTextColor(Color.RED);
        }else {
        errorText.setText("Все отлично!");
        errorText.setTextColor(Color.GREEN);
        }
    }
}