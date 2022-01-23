package com.example.myapplication.ui.inputdata;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.ui.main.MainActivity;

import androidx.appcompat.widget.Toolbar;

public class basket extends AppCompatActivity {
    Button button8;
    Button buttonformbasket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);
        button8 = (Button) findViewById(R.id.button8);
        buttonformbasket = (Button) findViewById(R.id.buttonformbasket);
        button8.setOnClickListener(v -> {
            Intent intent = new Intent(basket.this, MainActivity.class);
            finish();
            startActivity(intent);
        });
        buttonformbasket.setOnClickListener(v -> {
            Intent intent = new Intent(basket.this, FormBasket.class);
            finish();
            startActivity(intent);
        });
    }
}