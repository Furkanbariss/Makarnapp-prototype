package com.furkanbarissonmezisik.makarnapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Chat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
    }
    fun goBack(view: View) {
        onBackPressed()
    }
}