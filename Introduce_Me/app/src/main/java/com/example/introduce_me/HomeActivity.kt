package com.example.introduce_me

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Button

// 3. 자기소개 페이지
class HomeActivity : AppCompatActivity() {

    var images = listOf<Int>(  // 이미지 리스트
        R.drawable.prankie1,
        R.drawable.prankie2,
        R.drawable.prankie3,
        R.drawable.prankie4,
        R.drawable.prankie5
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val image = findViewById<ImageView>(R.id.img_home)
        val randomNum = (0..4).random()  // 0~5까지 숫자 중 랜덤
        val strData = intent.getStringExtra("inputId")  // SignInActivity에서 전달받은 아이디
        val extraId = findViewById<TextView>(R.id.extra_id)
        val idDisplayFormat = getString(R.string.id_display_format, strData)
        val btnClose = findViewById<Button>(R.id.btn_close)

        image.setImageResource(images[randomNum])  // 랜덤 이미지 보여주기

        extraId.setText(idDisplayFormat)  // '아이디: 입력받은 데이터' 형식

        btnClose.setOnClickListener {
            finish()  // 가입하기 페이지(SignInActivity)로 이동
        }
    }
}