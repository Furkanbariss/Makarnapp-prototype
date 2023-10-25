package com.furkanbarissonmezisik.makarnapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class individual : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_individual)
        val imagebutton = findViewById<ImageButton>(R.id.imageButton9)
        imagebutton.setOnClickListener {
            val intent = Intent(this, My_DigitalCardActivity::class.java)
            startActivity(intent)
        }
        val imagebutton1 = findViewById<ImageButton>(R.id.imageButton11)
        imagebutton1.setOnClickListener {
            val intent = Intent(this, my_profile::class.java)
            startActivity(intent)
        }
        val imagebutton2 = findViewById<ImageButton>(R.id.imageButton12)
        imagebutton2.setOnClickListener {
            val intent = Intent(this, scholarship::class.java)
            startActivity(intent)
        }
        val button = findViewById<ImageButton>(R.id.imageButton8)
        button.setOnClickListener {
            val intent = Intent(this, settings::class.java)
            startActivity(intent)
        }
        val imageButton = findViewById<ImageButton>(R.id.imageButton13)
        imageButton.setOnClickListener {
            val intent = Intent(this, my_profile::class.java)
            startActivity(intent)
        }

        val imageButton3 = findViewById<ImageButton>(R.id.imageButton5)
        imageButton3.setOnClickListener {
            val intent = Intent(this, deniz_profile::class.java)
            startActivity(intent)
        }

        val imageButton4 = findViewById<ImageButton>(R.id.imageButton6)
        imageButton4.setOnClickListener {
            val intent = Intent(this, Helin_profile::class.java)
            startActivity(intent)
        }
        val imageButton5 = findViewById<ImageButton>(R.id.imageButton19)
        imageButton5.setOnClickListener {
            val intent = Intent(this, find_home_friends::class.java)
            startActivity(intent)
        }


        val button2 = findViewById<Button>(R.id.button4)
        button2.setOnClickListener {
            val intent = Intent(this, home_friends::class.java)
            startActivity(intent)
        }
        fun goBack(view: View) {
            onBackPressed()
        }
    }

}
/*
 <ScrollView
        android:layout_width="407dp"
        android:layout_height="572dp"
        app:layout_constraintBottom_toTopOf="@+id/imageView2"
        app:layout_constraintTop_toBottomOf="@+id/textView6"
        tools:layout_editor_absoluteX="0dp">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical">

            <ImageButton
                android:id="@+id/imageButton9"
                android:layout_width="match_parent"
                android:layout_height="159dp"
                android:background="#00FBFBFB"
                app:srcCompat="@drawable/atm_card" />

            <TextView
                android:id="@+id/textView2"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="Dijital Kartım"
                android:textAlignment="center"
                android:textColor="#2196F3"
                android:textSize="24sp"
                app:autoSizeTextType="none" />

            <ImageButton
                android:id="@+id/imageButton11"
                android:layout_width="match_parent"
                android:layout_height="148dp"
                android:background="#00FFFFFF"
                app:srcCompat="@drawable/pp" />

            <TextView
                android:id="@+id/textView3"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="Burslarım"
                android:textColor="#2196F3"
                android:textSize="24sp"
                android:textAlignment="center"/>

            <ImageButton
                android:id="@+id/imageButton12"
                android:layout_width="match_parent"
                android:layout_height="149dp"
                android:background="#00FFFFFF"
                app:srcCompat="@drawable/scholarship" />

            <TextView
                android:id="@+id/textView4"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="Profilim"
                android:textAlignment="center"
                android:textColor="#2196F3"
                android:textSize="24sp" />

            <ImageButton
                android:id="@+id/imageButton10"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:background="#00FFFFFF"
                app:srcCompat="@drawable/coming_soon" />
        </LinearLayout>
    </ScrollView>
 */