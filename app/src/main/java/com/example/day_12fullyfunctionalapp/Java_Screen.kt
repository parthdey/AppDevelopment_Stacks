package com.example.day_12fullyfunctionalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Java_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java_screen)

        val webViewer2 = findViewById<WebView>(R.id.WebViewer2)
        webViewSetUp2(webViewer2)
    }
    private fun webViewSetUp2(webViewer2: WebView){

        webViewer2.webViewClient = WebViewClient()

        webViewer2.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://docs.oracle.com/javase/tutorial/")
        }
    }
}
