package com.example.introduce_me

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

// 스플래시 화면 구현
@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Actionbar 제거
        supportActionBar?.hide()

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            Intent(this, SignInActivity::class.java).apply {
                startActivity(this)
                finish()
            }
        }, 3000)  // 스플래시 화면 3초 실행하고 닫음
    }
}