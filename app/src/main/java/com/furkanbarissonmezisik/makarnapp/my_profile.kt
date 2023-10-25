package com.furkanbarissonmezisik.makarnapp

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class my_profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_my_rofile)


        val settingsButton = findViewById<ImageButton>(R.id.imageButton4)
        settingsButton.setOnClickListener{
            val intent=Intent(this,settings::class.java)
            startActivity(intent)
        }
    }
    fun goBack(view: View) {
        onBackPressed()
    }
    fun openInstagramProfile(view: View) {
        val username = "sonmezisik_furkann" // Ziyaret etmek istediğiniz kullanıcının Instagram kullanıcı adı
        val uri = Uri.parse("http://instagram.com/_u/sonmezisik_furkann")
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
        val username = "sonmezisik_furkann" // Ziyaret etmek istediğiniz kullanıcının Instagram kullanıcı adı
        val uri = Uri.parse("https://www.linkedin.com/in/furkan-bar%C4%B1%C5%9F-s%C3%B6nmez%C4%B1%C5%9F%C4%B1k-39a0a3250/")
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
    fun openFacebookProfile(view: View) {
        val username = "sonmezisik_furkann" // Ziyaret etmek istediğiniz kullanıcının Instagram kullanıcı adı
        val uri = Uri.parse("https://www.facebook.com/19071907fs/")
        val intent = Intent(Intent.ACTION_VIEW, uri)

        intent.`package` = "com.facebook.android" // Instagram uygulamasını hedefle

        try {
            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            //Instagram uygulaması yüklü değilse, tarayıcıyı hedefle
            intent.`package` = null
            startActivity(intent)
        }
    }
}