package com.example.introduce_me

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        /*val btn_sign_in = findViewById<Button>(R.id.btn_sign_in)
        btn_sign_in.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }*/

        // 가입하기 페이지로 이동
        val btn_sign_up = findViewById<Button>(R.id.btn_sign_up)
        btn_sign_up.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}