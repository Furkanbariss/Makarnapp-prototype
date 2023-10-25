package com.furkanbarissonmezisik.makarnapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class My_DigitalCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_my_digital_card)

        val button = findViewById<ImageButton>(R.id.imageButton8)
        button.setOnClickListener {
            val intent = Intent(this, settings::class.java)
            startActivity(intent)
        }
    }
    fun goBack(view: View) {
        onBackPressed()
    }
}