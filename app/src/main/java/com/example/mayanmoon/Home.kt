package com.example.mayanmoon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mayanmoon.databinding.HomeBinding


class Home : Fragment(R.layout.home) {

    private lateinit var homeBinding: HomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = HomeBinding.bind(view)
        homeBinding = binding


    }
}

