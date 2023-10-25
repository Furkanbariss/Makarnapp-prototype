package com.furkanbarissonmezisik.makarnapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Missions_find : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_missions_find)
    }
    fun goBack(view: View) {
        onBackPressed()
    }
}