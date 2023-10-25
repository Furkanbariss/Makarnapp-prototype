package com.furkanbarissonmezisik.makarnapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Makarnapp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_makarnapp)

        val button = findViewById<Button>(R.id.Ogrenci_evi)
        button.setOnClickListener {
            val intent = Intent(this, Student_home::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.Bireysel)
        button2.setOnClickListener {
            val intent = Intent(this, individual::class.java)
            startActivity(intent)
        }

    }
}