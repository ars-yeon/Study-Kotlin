package com.example.introduce_me

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
//import androidx.core.widget.addTextChangedListener

// 1. 로그인 페이지
class SignInActivity : AppCompatActivity() {
    // SignUpActivity를 위한 ActivityResultLauncher를 선언
    private lateinit var signInLauncher: ActivityResultLauncher<Intent>  // SignUpActivity를 위한 ActivityResultLauncher

    // UI 요소 연결할 변수 선언
    private lateinit var editId: EditText
    private lateinit var editPw: EditText
    private lateinit var btnSignIn: Button
    private lateinit var btnSignUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        // UI 요소 연결
        editId = findViewById(R.id.edit_id)
        editPw = findViewById(R.id.edit_pw)
        btnSignIn = findViewById(R.id.btn_sign_in)
        btnSignUp = findViewById(R.id.btn_sign_up)

        // registerForActivityResult를 사용하여 signUpLauncher를 초기화
        // signUpLauncher는 SignUpActivity를 호출하고 그 결과를 처리할 때 사용
        signInLauncher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
                // SignUpActivity가 성공적으로 완료되었을 때 처리하는 람다식
                if (result.resultCode == RESULT_OK) {  // 결과가 OK인 경우에만 처리
                    val data: Intent? = result.data

                    // SignUpActivity에서 입력한 ID/PW를 가져옴
                    if (data != null) {
                        val id = data.getStringExtra("inputId")
                        val pw = data.getStringExtra("inputPw")

                        // SignInActivity ID/PW 입력 필드에 SignUPActivity에서 가져온 ID/PW를 자동으로 채워넣음
                        if (!id.isNullOrEmpty() && !pw.isNullOrEmpty()) {
                            editId.setText(id)
                            editPw.setText(pw)
                        }
                    }
                }
            }

/*      필수 구현 항목인 Toast 메시지가 노출이 안되서 주석 처리
        // 초기 버튼 상태 업데이트
        updateButtonState()

        // 입력 필드의 텍스트 변경 시 버튼 상태 업데이트
        editId.addTextChangedListener {
            updateButtonState()
        }

        editPw.addTextChangedListener {
            updateButtonState()
        }*/

        // 로그인 버튼이 눌렸을 때의 동작 정의
        btnSignIn.setOnClickListener {
            val id = editId.text.toString() // 입력한 ID를 가져옴
            val pw = editPw.text.toString() // 입력한 PW를 가져옴

            // ID/PW가 모두 채워져 있다면 HomeActivity로 입력한 ID 전달, HomeActivity 실행
            if (id.isNotEmpty() && pw.isNotEmpty()) {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("inputId", id)
                startActivity(intent)

                Toast.makeText(this, "로그인 성공", Toast.LENGTH_SHORT).show()
            } else {  // ID나 PW 중 하나라도 입력되지 않았을 경우
                // 토스트 메시지를 통해 아이디/비밀번호를 확인하라는 안내를 띄움
                Toast.makeText(this, "아이디/비밀번호를 확인해주세요.", Toast.LENGTH_SHORT).show()
            }
        }

        // 가입하기 버튼이 눌렸을 때의 동작 정의
        btnSignUp.setOnClickListener {
            // SignUpActivity를 호출하고 결과를 처리할 때 signInLauncher를 사용
            val intent = Intent(this, SignUpActivity::class.java)
            signInLauncher.launch(intent) // SignUpActivity를 실행하고 결과를 처리하는데 사용할 signInLauncher를 사용하여 호출
        }
    }

    // EditText를 제외한 부분을 터치하면 키보드가 사라지도록 함
    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        Utils.handleTouchEvent(this, ev, currentFocus)
        return super.dispatchTouchEvent(ev)
    }

/*  필수 구현 항목인 Toast 메시지가 노출이 안되서 주석 처리
    // 아이디와 비밀번호 입력 상태를 확인하여 버튼 상태 변경하는 함수
    private fun updateButtonState() {
        val id = editId.text.toString()
        val pw = editPw.text.toString()
        btnSignIn.isEnabled = id.isNotEmpty() && pw.isNotEmpty()
    }*/
}
