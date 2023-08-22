package com.example.a5_viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a5_viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        binding.myButton.setOnClickListener {
            binding.myTextView.text = "The binding is working well!"
        }


    }
}