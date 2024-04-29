package com.example.assignment2

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar

class Dlala : AppCompatActivity() {

    lateinit var Wash_Btn: Button
    lateinit var Feed_Btn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dlala)


        Wash_Btn = findViewById<Button>(R.id.Wash_Btn)
        Wash_Btn.setOnClickListener {
            val intent9 = Intent(this, Geza::class.java)
            startActivity(intent9)
        }

        Feed_Btn = findViewById<Button>(R.id.Feed_Btn)
        Feed_Btn.setOnClickListener {
            val intent10 = Intent(this, Kudla::class.java)
            startActivity(intent10)
        }



    }
}