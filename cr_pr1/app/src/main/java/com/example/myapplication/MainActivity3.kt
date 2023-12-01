package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }
    fun btn4 (View: View) {
        scheduleSplashScreen()
    }

    private fun scheduleSplashScreen() {
        val splashScreenDuration: Long = 0
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@MainActivity3,
                MainActivity2::class.java)
            startActivity(intent)
            finish()
        }, splashScreenDuration)
    }
}