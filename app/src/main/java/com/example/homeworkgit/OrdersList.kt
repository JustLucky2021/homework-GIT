package com.example.homeworkgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class OrdersList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orders_list)
        val phoneNum = intent.getStringExtra("phoneNumber")
        Log.d("TAG", "Order: $phoneNum")
        val recycle = findViewById<TextView>(R.id.tvRecycle)
        recycle.append(" $phoneNum")
    }
}