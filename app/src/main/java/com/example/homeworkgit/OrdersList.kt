package com.example.homeworkgit

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OrdersList : AppCompatActivity() {

    companion object {
        private const val PHONE_NUMBER = "phoneNumber"
        fun newInstance(activity: Activity, phoneNumber: String) {
            val intent = Intent(activity, OrdersList::class.java).apply {
                putExtra(PHONE_NUMBER, phoneNumber)
            }
            activity.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orders_list)
        val phoneNum = intent.getStringExtra("$PHONE_NUMBER")
        val recycle = findViewById<TextView>(R.id.tvRecycle)
        recycle.append(" $phoneNum")
    }
}