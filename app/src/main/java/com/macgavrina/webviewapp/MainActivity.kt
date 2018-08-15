package com.macgavrina.webviewapp

import android.opengl.Visibility
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        progressBar.visibility = View.INVISIBLE
        webView.webViewClient = WebViewClient()

        if (savedInstanceState != null) {
            Log.d("WebViewApp", "Restore instance state in onCreate")
            webView.restoreState(savedInstanceState)
        } else {
            progressBar.visibility = View.VISIBLE
            Log.d("WebViewApp", "Load https://www.google.com/")
            webView.loadUrl("https://www.google.com/")
            progressBar.visibility = View.INVISIBLE
        }


    }

    override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }

    }

    override fun onSaveInstanceState(outState: Bundle?) {
        Log.d("WebViewApp", "Save instance state")
        webView.saveState(outState)
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        Log.d("WebViewApp", "Restore instance state in onRestoreInstanceState")
        webView.restoreState(savedInstanceState)
        super.onRestoreInstanceState(savedInstanceState)
    }
}
