package com.furkanbarissonmezisik.makarnapp

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class Helin_profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_helin_profile)

        val settingsButton = findViewById<ImageButton>(R.id.imageButton4)
        settingsButton.setOnClickListener{
            val intent= Intent(this,settings::class.java)
            startActivity(intent)
        }
    }
    fun goBack(view: View) {
        onBackPressed()
    }
    fun openInstagramProfile(view: View) {
        val uri = Uri.parse("https://www.instagram.com/helindemirok/?igshid=NzZlODBkYWE4Ng%3D%3D")
        val intent = Intent(Intent.ACTION_VIEW, uri)

        intent.`package` = "com.instagram.android" // Instagram uygulamasını hedefle

        try {
            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            // Instagram uygulaması yüklü değilse, tarayıcıyı hedefle
            intent.`package` = null
            startActivity(intent)
        }
    }
    fun openLinkedinProfile(view: View) {
        val uri = Uri.parse("https://www.linkedin.com/in/helin-demirok-196921227/?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app")
        val intent = Intent(Intent.ACTION_VIEW, uri)

        intent.`package` = "com.linkedin.android" // Instagram uygulamasını hedefle

        try {
            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            // Instagram uygulaması yüklü değilse, tarayıcıyı hedefle
            intent.`package` = null
            startActivity(intent)
        }
    }
}