package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GAME : AppCompatActivity() {

    lateinit var homeBtn: Button
    lateinit var continueBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        homeBtn = findViewById(R.id.home_btn)
        homeBtn.setOnClickListener {
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }


           continueBtn = findViewById<Button>(R.id.continue_Btn)
            continueBtn.setOnClickListener {
                val intent3 = Intent(this, Playing::class.java)
                startActivity(intent3)
            }

        }

    }
