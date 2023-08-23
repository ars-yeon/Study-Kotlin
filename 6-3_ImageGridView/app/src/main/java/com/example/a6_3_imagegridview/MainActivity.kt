package com.example.a6_3_imagegridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a6_3_imagegridview.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        // ImageAdapter 객체를 생성하고 GridView 객체에 연결
        binding.gridview.adapter = ImageAdapter()

        // 항목 클릭 이벤트 처리
        binding.gridview.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this@MainActivity,"" + (position + 1) + "번째 선택", Toast.LENGTH_SHORT).show()
        }
    }
}
