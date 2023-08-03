package com.example.introduce_me

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

// 1. 로그인 페이지
class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val edit_id = findViewById<EditText>(R.id.edit_id)
        val edit_pw = findViewById<EditText>(R.id.edit_pw)
        val btn_sign_in = findViewById<Button>(R.id.btn_sign_in)

        // 로그인하기 버튼 눌렀을때
        btn_sign_in.setOnClickListener {
            val id = edit_id.text.toString()
            val pw = edit_pw.text.toString()

            if (id.isNotEmpty() && pw.isNotEmpty()) {  // 아이디/비번 둘 다 채워져 있다면
                Toast.makeText(this, "로그인 성공",  Toast.LENGTH_SHORT).show()  // 토스트 메시지 띄우기
                val intent = Intent(this, HomeActivity::class.java)  // 자기소개 페이지로 이동
                startActivity(intent)
            } else { // 아이디/비번 중 하나라도 비어있다면
                Toast.makeText(this, "아이디/비밀번호를 확인해주세요.",  Toast.LENGTH_SHORT).show()
            }
        }

        // 가입하기 페이지로 이동
        val btn_sign_up = findViewById<Button>(R.id.btn_sign_up)
        btn_sign_up.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}