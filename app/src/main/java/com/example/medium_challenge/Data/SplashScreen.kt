package com.example.medium_challenge.Data

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.LinearLayout
import com.example.medium_challenge.MainActivity
import com.example.medium_challenge.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        val start=findViewById<LinearLayout>(R.id.start_btn)
        start.setOnClickListener {
            startActivity(Intent(baseContext,MainActivity::class.java))
            finish()
        }


    }
}