package com.example.myapplication.ui.inputdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication.ui.inputdata.robotika;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.myapplication.R;

public class FormRobotika extends AppCompatActivity {
    Button button10;
    WebView webViewku;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.robotika_form);

        webViewku = (WebView)findViewById(R.id.WebView1);
        webViewku.getSettings().setLoadsImagesAutomatically(true);
        webViewku.getSettings().setJavaScriptEnabled(true);
        webViewku.getSettings().setDomStorageEnabled(true);

        // Tiga baris di bawah ini agar laman yang dimuat dapat
        // melakukan zoom.
        webViewku.getSettings().setSupportZoom(true);
        webViewku.getSettings().setBuiltInZoomControls(true);
        webViewku.getSettings().setDisplayZoomControls(false);
        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        webViewku.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);


        webViewku.setWebViewClient(new WebViewClient());
        webViewku.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSdeBCr7dYnG9vIpFr6Bby2w2e4eGzpdL5PTP_VGeplmOZB1qQ/viewform?usp=sf_link");

        button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(v -> {
            Intent intent = new Intent(FormRobotika.this, robotika.class);
            finish();
            startActivity(intent);

        });

    }
}
