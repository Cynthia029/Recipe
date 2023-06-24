package com.example.recipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Handler().postDelayed(Runnable{
            val i = Intent(this@SplashActivity, MainActivity::class.java )
            startActivity(i)
            finish()
        },3000)
    }
}