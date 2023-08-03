package com.example.introduce_me

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        // 가입하기 버튼이 눌리면 SignInActivity로 이동
        val btn_log_in = findViewById<Button>(R.id.btn_sign_up)
        btn_log_in.setOnClickListener {
            finish()
        }
    }
}