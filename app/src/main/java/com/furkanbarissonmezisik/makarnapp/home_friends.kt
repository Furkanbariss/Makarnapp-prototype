package com.furkanbarissonmezisik.makarnapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class home_friends : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_friends)
    }
    fun goBack(view: View) {
        onBackPressed()
    }
}