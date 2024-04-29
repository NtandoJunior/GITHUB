package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Playing : AppCompatActivity() {

    lateinit var Play_Btn: Button
    lateinit var Wash_Btn: Button
    lateinit var Feed_Btn: Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playing)

        Play_Btn = findViewById(R.id.Play_Btn)
        Play_Btn.setOnClickListener {
            val intent4 = Intent(this, Dlala::class.java)
            startActivity(intent4)
        }


        Wash_Btn = findViewById<Button>(R.id.Wash_Btn)
        Wash_Btn.setOnClickListener {
            val intent5 = Intent(this, Geza::class.java)
            startActivity(intent5)
        }

        Feed_Btn = findViewById<Button>(R.id.Feed_Btn)
        Feed_Btn.setOnClickListener {
            val intent6 = Intent(this, Kudla::class.java)
            startActivity(intent6)
        }


        }
    }
