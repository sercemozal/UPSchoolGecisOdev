package com.sercem.gecisodev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sayfa_a_.*

class SayfaA_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa_a_)

        buttonSayfaB.setOnClickListener {
            val intent = Intent(this@SayfaA_Activity,SayfaB_Activity::class.java )
          
            startActivity(intent)
        }

    }
}