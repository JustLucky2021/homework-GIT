package com.example.homeworkgit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), Navigation {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openAuthFragment()
    }

    override fun openOrdersListFragment(phoneNumber: String) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.flRoot, OrdersListFragment.newInstance(phoneNumber = phoneNumber))
            .commit()
    }

    override fun openAuthFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.flRoot, AuthFragment())
            .commit()
    }
}
