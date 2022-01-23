package com.example.myapplication.ui.inputdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.myapplication.R;
public class FormVoly extends AppCompatActivity{
    Button button13;
    WebView webViewku4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.voly_form);

        webViewku4 = (WebView) findViewById(R.id.WebView4);
        webViewku4.getSettings().setLoadsImagesAutomatically(true);
        webViewku4.getSettings().setJavaScriptEnabled(true);
        webViewku4.getSettings().setDomStorageEnabled(true);

        // Tiga baris di bawah ini agar laman yang dimuat dapat
        // melakukan zoom.
        webViewku4.getSettings().setSupportZoom(true);
        webViewku4.getSettings().setBuiltInZoomControls(true);
        webViewku4.getSettings().setDisplayZoomControls(false);
        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        webViewku4.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);


        webViewku4.setWebViewClient(new WebViewClient());
        webViewku4.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSdZVGDseLbzmUn5JAbcwB6fOPnQJaEj-SBfnjd6bB0-f_-rLA/viewform?usp=sf_link");

        button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(v -> {
            Intent intent = new Intent(FormVoly.this, voly.class);
            finish();
            startActivity(intent);
        });

    }
}
