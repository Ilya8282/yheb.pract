package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    }
    fun btn1 (View: View) {
        val intent = Intent(this@MainActivity2,
            MainActivity3::class.java)
        startActivity(intent)
    }
    fun btn2 (View: View) {
        val intent = Intent(this@MainActivity2,
            MainActivity4::class.java)
        startActivity(intent)
    }
    fun btn3 (View: View) {
        val intent = Intent(this@MainActivity2,
            MainActivity5::class.java)
        startActivity(intent)
    }
    fun btn4 (View: View) {
        val intent = Intent(this@MainActivity2,
            MainActivity6::class.java)
        startActivity(intent)
    }

    private fun scheduleSplashScreen() {
        val splashScreenDuration: Long = 0
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@MainActivity2,
                MainActivity3::class.java)
            startActivity(intent)
            finish()
        }, splashScreenDuration)
    }
}