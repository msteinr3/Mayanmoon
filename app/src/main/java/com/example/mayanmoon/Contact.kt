package com.example.mayanmoon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mayanmoon.databinding.ContactBinding
import com.example.mayanmoon.databinding.HomeBinding

class Contact : Fragment() {

    private var _binding : ContactBinding? = null
    private var binding = _binding!! // I'm going to use this reference only between onCreateView and onDestroyView events

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ContactBinding.inflate(inflater, container,false)
        return binding.root

        binding.send.setOnClickListener {
            binding.send.text = "woohoo"
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // clear the reference so it can be garbage collected
    }
}