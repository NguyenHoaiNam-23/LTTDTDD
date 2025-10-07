package com.example.btvn3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText txtuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtuser = findViewById(R.id.txtuser);

        txtuser.setText("Nam23");

        Button btnLogin = findViewById(R.id.btndangnhap);
        btnLogin.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });
    }
}
