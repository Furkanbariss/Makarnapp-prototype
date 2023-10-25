package com.furkanbarissonmezisik.makarnapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_settings)

         val button = findViewById<ImageButton>(R.id.homeButton)
        button.setOnClickListener {
            val intent = Intent(this, Makarnapp::class.java)
            startActivity(intent)
        }
    }
}