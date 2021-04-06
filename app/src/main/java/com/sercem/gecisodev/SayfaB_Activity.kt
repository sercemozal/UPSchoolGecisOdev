package com.sercem.gecisodev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sayfa_a_.*
import kotlinx.android.synthetic.main.activity_sayfa_b_.*

class SayfaB_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa_b_)

        buttonSayfaYx.setOnClickListener {
            val intent = Intent(this@SayfaB_Activity,SayfaY_Activity::class.java )
            finish()
            startActivity(intent)
        }

    }
}