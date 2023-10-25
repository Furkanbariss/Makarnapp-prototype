package com.furkanbarissonmezisik.makarnapp

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class scholarship : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_scholarship)
        val button = findViewById<ImageButton>(R.id.imageButton8)
        button.setOnClickListener {
            val intent = Intent(this, settings::class.java)
            startActivity(intent)
        }
    }

    fun goBack(view: View) {
        onBackPressed()
    }

    fun openSabanciBurs(view: View) {
        val uri = Uri.parse("https://www.sabancivakfi.org/tr/burslar/burslar-hakkinda-genel-bilgi")
        val intent = Intent(Intent.ACTION_VIEW, uri)

        intent.`package` = "com.mytmüzik.android" // Instagram uygulamasını hedefle

        try {
            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            // Instagram uygulaması yüklü değilse, tarayıcıyı hedefle
            intent.`package` = null
            startActivity(intent)
        }
    }
    fun openUGDDBurs(view: View) {
        val uri = Uri.parse("https://kygm.gsb.gov.tr/HaberDetaylari/1/254279/burs-kredi-basvurulari-basladi.aspx")
        val intent = Intent(Intent.ACTION_VIEW, uri)

        intent.`package` = "com.mytmüzik.android" // Instagram uygulamasını hedefle

        try {
            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            // Instagram uygulaması yüklü değilse, tarayıcıyı hedefle
            intent.`package` = null
            startActivity(intent)
        }
    }
    fun openUnicefBurs(view: View) {
        val uri = Uri.parse("https://www.unicef.org/")
        val intent = Intent(Intent.ACTION_VIEW, uri)

        intent.`package` = "com.mytmüzik.android" // Instagram uygulamasını hedefle

        try {
            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            // Instagram uygulaması yüklü değilse, tarayıcıyı hedefle
            intent.`package` = null
            startActivity(intent)
        }
    }
}

