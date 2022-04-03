package com.example.mayanmoon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.mayanmoon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val slideIn: Animation = AnimationUtils.loadAnimation(this, R.anim.slide_in)
        val fadeOut: Animation = AnimationUtils.loadAnimation(this, R.anim.fade_out)
        var currentFragment: Fragment = Home()

        replaceFragment(Home())

        binding.homebtn.setOnClickListener {
            if (currentFragment != Home()) {
                binding.fragmentContainer.animate().apply {
                    binding.fragmentContainer.startAnimation(fadeOut)
                }
                replaceFragment(Home())
                binding.fragmentContainer.animate().apply {
                    binding.fragmentContainer.startAnimation(slideIn)
                }
                currentFragment = Home()
            }
        }

        binding.about.setOnClickListener {
            if (currentFragment != About_irit()) {
                binding.fragmentContainer.animate().apply {
                    binding.fragmentContainer.startAnimation(fadeOut)
                }
                replaceFragment(About_irit())
                binding.fragmentContainer.animate().apply {
                    binding.fragmentContainer.startAnimation(slideIn)
                }
                currentFragment = About_irit()
            }
        }

        binding.services.setOnClickListener {
            if (currentFragment != Contact()) {
                binding.fragmentContainer.animate().apply {
                    binding.fragmentContainer.startAnimation(fadeOut)
                }
                replaceFragment(Contact())
                binding.fragmentContainer.animate().apply {
                    binding.fragmentContainer.startAnimation(slideIn)
                }
                currentFragment = Contact()
            }
        }

        binding.newPatient.setOnClickListener {
            if (currentFragment != IntakeForm()) {
                binding.fragmentContainer.animate().apply {
                    binding.fragmentContainer.startAnimation(fadeOut)
                }
                replaceFragment(IntakeForm())
                binding.fragmentContainer.animate().apply {
                    binding.fragmentContainer.startAnimation(slideIn)
                }
                currentFragment = IntakeForm()
            }
        }




    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }
}