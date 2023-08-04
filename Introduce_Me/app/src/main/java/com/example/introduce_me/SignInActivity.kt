package com.example.introduce_me

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

// 1. 로그인 페이지
class SignInActivity : AppCompatActivity() {
    private lateinit var signInLauncher: ActivityResultLauncher<Intent>  // SignUpActivity를 위한 ActivityResultLauncher
    private lateinit var editId: EditText
    private lateinit var editPw: EditText
    private lateinit var btnSignIn: Button
    private lateinit var btnSignUp: Button

    // Activity가 생성되면 호출되는 메서드
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        // UI 요소 연결
        editId = findViewById(R.id.edit_id)
        editPw = findViewById(R.id.edit_pw)
        btnSignIn = findViewById(R.id.btn_sign_in)
        btnSignUp = findViewById(R.id.btn_sign_up)

        // SignUpActivity 실행하고 그 결과를 처리하기 위해 ActivityResultLauncher 초기화
        signInLauncher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
                // SignUpActivity가 성공적으로 완료되었을 때
                if (result.resultCode == RESULT_OK) {
                    val data: Intent? = result.data

                    // SignUpActivity에서 입력한 ID/PW를 가져옴
                    if (data != null) {
                        val id = data.getStringExtra("inputId")
                        val pw = data.getStringExtra("inputPw")

                        // SignInActivity ID 입력 필드에 SignUPActivity에서 가져온 ID/PW를 자동으로 채워넣음
                        if (!id.isNullOrEmpty() && !pw.isNullOrEmpty()) {
                            editId.setText(id)
                            editPw.setText(pw)
                        }
                    }
                }
            }

        // 로그인 버튼
        btnSignIn.setOnClickListener {
            val id = editId.text.toString() // 입력한 ID를 가져옴
            val pw = editPw.text.toString() // 입력한 PW를 가져옴

            // ID/PW가 둘 다 입력되었다면 HomeActivity로 입력한 ID 전달, HomeActivity 실행
            if (id.isNotEmpty() && pw.isNotEmpty()) {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("inputId", id)
                startActivity(intent)

                Toast.makeText(this, "로그인 성공", Toast.LENGTH_SHORT).show()
            } else {  // ID/PW가 둘 중 하나라도 입력을 안했으면
                Toast.makeText(this, "아이디/비밀번호를 확인해주세요.", Toast.LENGTH_SHORT).show()
            }
        }

        // 가입하기 버튼
        btnSignUp.setOnClickListener {
            // SignUpActivity를 호출하고 결과를 처리할 때 signInLauncher를 사용
            val intent = Intent(this, SignUpActivity::class.java)
            signInLauncher.launch(intent) // SignUpActivity를 실행하고 결과를 처리하는데 사용할 signInLauncher를 사용하여 호출
        }
    }
}