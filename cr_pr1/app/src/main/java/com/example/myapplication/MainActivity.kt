package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.window.SplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        scheduleSplashScreen()
    }
    private fun scheduleSplashScreen() {
        val splashScreenDuration: Long = 5000
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@MainActivity,
                MainActivity2::class.java)
            startActivity(intent)
            finish()
        }, splashScreenDuration)
    }


}