package com.example.a6_2_simplegridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a6_2_simplegridview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}