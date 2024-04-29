package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Kudla : AppCompatActivity() {

    lateinit var Play_Btn: Button
    lateinit var Wash_Btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kudla)

        Play_Btn = findViewById(R.id.Play_Btn)
        Play_Btn.setOnClickListener {
            val intent7 = Intent(this, Dlala::class.java)
            startActivity(intent7)
        }


        Wash_Btn = findViewById<Button>(R.id.Wash_Btn)
        Wash_Btn.setOnClickListener {
            val intent8 = Intent(this, Geza::class.java)
            startActivity(intent8)
        }

    }
}