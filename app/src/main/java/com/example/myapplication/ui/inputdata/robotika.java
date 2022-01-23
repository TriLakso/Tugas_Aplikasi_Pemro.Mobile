package com.example.myapplication.ui.inputdata;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.R;
import com.example.myapplication.ui.main.MainActivity;
import com.example.myapplication.viewmodel.InputViewModel;


public class robotika extends AppCompatActivity {
    Button button7;
    Button buttonformrobo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robotika);
        button7 = (Button) findViewById(R.id.button7);
        buttonformrobo = (Button) findViewById(R.id.buttonformrobo);
        button7.setOnClickListener(v -> {
            Intent intent = new Intent(robotika.this, MainActivity.class);
            finish();
            startActivity(intent);
        });

        buttonformrobo.setOnClickListener(v -> {
            Intent intent = new Intent(robotika.this, FormRobotika.class);
            finish();
            startActivity(intent);
        });
    }
}