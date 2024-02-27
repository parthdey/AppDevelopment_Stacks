package com.example.day_12fullyfunctionalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Flutter_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flutter_screen)

        val webViewer1 = findViewById<WebView>(R.id.WebViewer1)
        webViewSetUp1(webViewer1)
    }
    private fun webViewSetUp1(webViewer1: WebView) {

        webViewer1.webViewClient = WebViewClient()

        webViewer1.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://docs.flutter.dev/")
        }
    }
}