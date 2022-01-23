package com.example.myapplication.ui.inputdata;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.ui.main.MainActivity;

import androidx.appcompat.widget.Toolbar;


public class voly extends AppCompatActivity {
    Button button9;
    Button buttonformvoly;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voly);
        button9 = (Button) findViewById(R.id.button9);
        buttonformvoly = (Button) findViewById(R.id.buttonformvoly);
        button9.setOnClickListener(v -> {
            Intent intent = new Intent(voly.this, MainActivity.class);
            finish();
            startActivity(intent);

        });
        buttonformvoly.setOnClickListener(v -> {
            Intent intent = new Intent(voly.this, FormVoly.class);
            finish();
            startActivity(intent);
        });
    }
}