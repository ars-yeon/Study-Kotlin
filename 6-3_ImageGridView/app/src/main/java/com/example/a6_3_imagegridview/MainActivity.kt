package com.example.a6_3_imagegridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a6_3_imagegridview.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        
        // ImageAdapter 객체를 생성하고 GridView 객체에 연결
        binding.gridview.adapter = ImageAdapter()
    }
}
