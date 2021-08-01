package com.example.homeworkgit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText



class AuthFragment : Fragment() {
    companion object {
        private lateinit var btnStart : Button
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_auth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnStart = view.findViewById<Button>(R.id.btnStart)
        configureBtnStart()
    }

    private fun configureBtnStart() {
        btnStart.setOnClickListener {
            val phoneNumber = view?.findViewById<EditText>(R.id.etPhoneNumber)
            (activity as? Navigation)?.openOrdersListFragment(phoneNumber = phoneNumber?.text.toString())
        }
    }
}