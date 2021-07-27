package com.example.homeworkgit

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart = findViewById<Button>(R.id.btnStart)
            btnStart.setOnClickListener {
                val phoneNumber = findViewById<EditText>(R.id.etPhoneNumber)
                OrdersList.newInstance(activity = this, (phoneNumber.text).toString())
            }
        }
    }
