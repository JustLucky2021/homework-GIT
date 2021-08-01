package com.example.homeworkgit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.example.homeworkgit.databinding.FragmentAuthBinding

public class OrdersListFragment : Fragment() {

    companion object {
        private lateinit var binding : FragmentAuthBinding
        private const val PHONE_NUMBER = "phoneNumber"

        fun newInstance(phoneNumber: String): OrdersListFragment {
            return OrdersListFragment().apply {
                arguments = bundleOf(
                    PHONE_NUMBER to phoneNumber
                )
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAuthBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val phoneNum = arguments?.get(PHONE_NUMBER)
        val recycle = view.findViewById<TextView>(R.id.tvRecycle)
        recycle.append(" $phoneNum")
    }
}