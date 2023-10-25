package com.furkanbarissonmezisik.makarnapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class Money_pool : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_money_pool)

        val button = findViewById<ImageButton>(R.id.imageButton15)
        button.setOnClickListener {
            val intent = Intent(this, settings::class.java)
            startActivity(intent)
        }
    }
    fun goBack(view: View) {
        onBackPressed()
    }
}