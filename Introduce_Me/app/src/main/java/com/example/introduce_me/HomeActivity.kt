package com.example.introduce_me

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Button

// 3. 자기소개 페이지
class HomeActivity : AppCompatActivity() {

    // 이미지 리소스 리스트
    private var images = listOf<Int>(
        R.drawable.cb1,
        R.drawable.cb2,
        R.drawable.cb3,
        R.drawable.cb4,
        R.drawable.cb5
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val image = findViewById<ImageView>(R.id.img_home)  // ImageView 위젯 초기화
        val randomNum = (0..4).random()  // 0~5까지 숫자 랜덤으로 선택
        val strData = intent.getStringExtra("inputId")  // SignInActivity에서 전달된 데이터 가져오기
        val extraId = findViewById<TextView>(R.id.extra_id)  // TextView 위젯 초기화
        val idDisplayFormat = getString(R.string.id_display_format, strData) // 텍스트 포맷 설정
        val btnClose = findViewById<Button>(R.id.btn_close)  // 닫기 버튼 초기화

        image.setImageResource(images[randomNum])  // 랜덤하게 선택된 이미지를 ImageView에 설정

        extraId.text = idDisplayFormat  // 전달받은 아이디 데이터 TextView에 표시

        // 닫기 버튼 클릭 시 Activity 종료
        btnClose.setOnClickListener {
            finish()  // 가입하기 페이지(SignInActivity)로 이동
        }
    }
}