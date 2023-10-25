package com.furkanbarissonmezisik.makarnapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class Student_home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_student_home)

        val imagebutton = findViewById<ImageButton>(R.id.imageButton9)
        imagebutton.setOnClickListener {
            val intent = Intent(this, Missions::class.java)
            startActivity(intent) }
        val imagebutton1 = findViewById<ImageButton>(R.id.imageButton12)
        imagebutton1.setOnClickListener {
            val intent = Intent(this, Money_pool::class.java)
            startActivity(intent)}
        val button = findViewById<ImageButton>(R.id.imageButton8)
        button.setOnClickListener {
            val intent = Intent(this, settings::class.java)
            startActivity(intent)
        }
        val imagebutton2 = findViewById<ImageButton>(R.id.imageButton11)
        imagebutton2.setOnClickListener {
            val intent = Intent(this, Chat::class.java)
            startActivity(intent)
        }
        val imageButton3 = findViewById<ImageButton>(R.id.imageButton5)
        imageButton3.setOnClickListener {
            val intent = Intent(this, deniz_profile::class.java)
            startActivity(intent) }
        val imageButton4 = findViewById<ImageButton>(R.id.imageButton6)
        imageButton4.setOnClickListener {
            val intent = Intent(this, Helin_profile::class.java)
            startActivity(intent) }
        val imageButton5 = findViewById<ImageButton>(R.id.imageButton13)
        imageButton5.setOnClickListener {
            val intent = Intent(this, my_profile::class.java)
            startActivity(intent) }
        val imageButton6 = findViewById<ImageButton>(R.id.imageButton19)
        imageButton6.setOnClickListener {
            val intent = Intent(this, Missions_find::class.java)
            startActivity(intent) }
    }
    fun goBack(view: View) {
        onBackPressed()
    }

}