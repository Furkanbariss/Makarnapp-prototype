package com.furkanbarissonmezisik.makarnapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class find_home_friends : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_home_friends)

        val button = findViewById<ImageButton>(R.id.imageButton32)
        button.setOnClickListener {
            val intent = Intent(this, settings::class.java)
            startActivity(intent)
        }

    }
    fun goBack(view: View){
        onBackPressed()
    }
}