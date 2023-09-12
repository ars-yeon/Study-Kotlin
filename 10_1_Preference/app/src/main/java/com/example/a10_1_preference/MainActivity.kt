package com.example.a10_1_preference

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a10_1_preference.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            saveData()
            showToast("Data Saved.")
        }
        loadData()
    }

    private fun saveData() {
        val pref = getSharedPreferences("pref", 0)
        val edit = pref.edit() // 수정모드
        edit.putString("name", binding.etHello.text.toString()) // 1번째 인자는 key, 2번째 인자는 value(실제로 담아둘 값)
        edit.apply() // 저장 완료
    }

    private fun loadData() {
        val pref = getSharedPreferences("pref", 0)
        binding.etHello.setText(pref.getString("name", "")) // 1번째 인자는 key, 2번째 인자는 value(데이터가 존재하지 않을 경우의 값)
    }

    // Toast 확장 함수
    private fun Context.showToast(message: String) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}
