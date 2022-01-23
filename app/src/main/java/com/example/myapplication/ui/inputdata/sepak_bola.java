package com.example.myapplication.ui.inputdata;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.ui.main.MainActivity;

import androidx.appcompat.widget.Toolbar;

public class sepak_bola extends AppCompatActivity {
    Button button6;
    Button buttonformsepakbola;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sepak_bola);
        button6 = (Button) findViewById(R.id.button6);
        buttonformsepakbola = (Button) findViewById(R.id.buttonformsepakbola);
        button6.setOnClickListener(v -> {
            Intent intent = new Intent(sepak_bola.this, MainActivity.class);
            finish();
            startActivity(intent);

        });
        buttonformsepakbola.setOnClickListener(v -> {
            Intent intent = new Intent(sepak_bola.this, FormSepakBola.class);
            finish();
            startActivity(intent);
        });
    }
}