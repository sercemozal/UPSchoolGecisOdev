package com.sercem.gecisodev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sayfa_b_.*
import kotlinx.android.synthetic.main.activity_sayfa_b_.buttonSayfaYx
import kotlinx.android.synthetic.main.activity_sayfa_x_.*

class SayfaX_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa_x_)

        buttonSayfaYx.setOnClickListener {
            val intent = Intent(this@SayfaX_Activity,SayfaY_Activity::class.java )
            finish()
            startActivity(intent)
        }
    }
}