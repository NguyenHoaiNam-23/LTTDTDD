package com.example.btvn3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    EditText txtgmail, txtnumber, txtmsv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtgmail = findViewById(R.id.txtgmail);
        txtnumber = findViewById(R.id.txtnumber);
        txtmsv = findViewById(R.id.txtmsv);

        txtgmail.setText("nguyennam.pvang@gmailcom");
        txtnumber.setText("0932973355");
        txtmsv.setText("23115053122123");


        ImageView imgSetting = findViewById(R.id.imgsetting);
        imgSetting.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
