package com.example.introduce_me

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

// 2. 회원가입 페이지
class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val edit_name = findViewById<EditText>(R.id.edit_name)
        val edit_id = findViewById<EditText>(R.id.edit_id)
        val edit_pw = findViewById<EditText>(R.id.edit_pw)
        val btn_log_in = findViewById<Button>(R.id.btn_sign_up)

        // 가입하기 버튼이 눌리면 SignInActivity로 이동
        btn_log_in.setOnClickListener {
            val name = edit_name.text.toString()
            val id = edit_id.text.toString()
            val pw = edit_pw.text.toString()

            if (name.isNotEmpty() && id.isNotEmpty() && pw.isNotEmpty()) {  // 이름/아이디/비번 셋 다 채워져 있다면
                finish()  // SignInActivity로 돌아가기
            } else {  // // 이름/아이디/비번 중 하나라도 비어있다면
                Toast.makeText(this, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}