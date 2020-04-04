package com.example.hpapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l);

        WebView webview = findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());

        webview.getSettings().setJavaScriptEnabled(true);

        webview.loadUrl("https://www.americanas.com.br");
    }
}
