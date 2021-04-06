package com.sercem.gecisodev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SayfaY_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa_y_)

    }
    override fun onBackPressed() {
        val intent = Intent(this@SayfaY_Activity,MainActivity::class.java )
        startActivity(intent)
    }
}