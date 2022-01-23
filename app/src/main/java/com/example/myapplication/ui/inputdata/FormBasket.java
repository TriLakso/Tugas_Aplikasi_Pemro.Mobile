package com.example.myapplication.ui.inputdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.myapplication.R;

public class FormBasket extends AppCompatActivity{
    Button button12;
    WebView webViewku3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basket_form);

        webViewku3 = (WebView) findViewById(R.id.WebView3);
        webViewku3.getSettings().setLoadsImagesAutomatically(true);
        webViewku3.getSettings().setJavaScriptEnabled(true);
        webViewku3.getSettings().setDomStorageEnabled(true);

        // Tiga baris di bawah ini agar laman yang dimuat dapat
        // melakukan zoom.
        webViewku3.getSettings().setSupportZoom(true);
        webViewku3.getSettings().setBuiltInZoomControls(true);
        webViewku3.getSettings().setDisplayZoomControls(false);
        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        webViewku3.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);


        webViewku3.setWebViewClient(new WebViewClient());
        webViewku3.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSe3Z4YnTMMYLH8DOyxKTlgw8GM-aiD3h-bvB8klmhah-aMLUQ/viewform?usp=sf_link");

        button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(v -> {
            Intent intent = new Intent(FormBasket.this, basket.class);
            finish();
            startActivity(intent);

        });
    }
}
