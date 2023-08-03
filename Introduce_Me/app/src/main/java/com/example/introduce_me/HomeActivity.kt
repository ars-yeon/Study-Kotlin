package com.example.introduce_me

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

// 3. 자기소개 페이지
class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // SignInActivity에서 extra data로 전달받은 아이디를 화면에 표시
        val strData = intent.getStringExtra("datafromSignInActivity")
        val extra_id = findViewById<TextView>(R.id.extra_id)
        val idDisplayFormat = getString(R.string.id_display_format, strData)
        extra_id.setText(idDisplayFormat)

        // 가입하기 페이지(SignInActivity)로 이동
        val btn_close = findViewById<Button>(R.id.btn_close)
        btn_close.setOnClickListener {
            finish()
        }
    }
}