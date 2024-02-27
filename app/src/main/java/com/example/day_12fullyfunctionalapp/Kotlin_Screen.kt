package com.example.day_12fullyfunctionalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Kotlin_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_screen)

        val webViewer = findViewById<WebView>(R.id.WebViewer)
        webViewSetUp(webViewer)
    }
    private fun webViewSetUp(webViewer: WebView){

        webViewer.webViewClient = WebViewClient()

        webViewer.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://kotlinlang.org/docs/home.html")
        }
    }
}