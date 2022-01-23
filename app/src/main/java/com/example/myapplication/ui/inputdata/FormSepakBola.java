package com.example.myapplication.ui.inputdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.myapplication.R;
public class FormSepakBola extends AppCompatActivity{
    Button button11;
    WebView webViewku2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sepak_bola_form);

        webViewku2 = (WebView) findViewById(R.id.WebView2);
        webViewku2.getSettings().setLoadsImagesAutomatically(true);
        webViewku2.getSettings().setJavaScriptEnabled(true);
        webViewku2.getSettings().setDomStorageEnabled(true);

        // Tiga baris di bawah ini agar laman yang dimuat dapat
        // melakukan zoom.
        webViewku2.getSettings().setSupportZoom(true);
        webViewku2.getSettings().setBuiltInZoomControls(true);
        webViewku2.getSettings().setDisplayZoomControls(false);
        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        webViewku2.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);


        webViewku2.setWebViewClient(new WebViewClient());
        webViewku2.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSda5JcPbeTBTE5BpVO8kRRw8mtEm4BCnb99RJldsraouUoRgA/viewform?usp=sf_link");

        button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(v -> {
            Intent intent = new Intent(FormSepakBola.this, sepak_bola.class);
            finish();
            startActivity(intent);

        });
    }

    }
