package com.example.day_12fullyfunctionalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class ReactNative_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_react_native_screen)

        val webViewer3 = findViewById<WebView>(R.id.WebViewer3)
        webViewSetUp3(webViewer3)
    }
    private fun webViewSetUp3(webViewer3: WebView){

        webViewer3.webViewClient = WebViewClient()

        webViewer3.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://reactnative.dev/docs/getting-started")
        }
    }

}