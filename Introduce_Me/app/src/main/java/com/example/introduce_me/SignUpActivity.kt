package com.example.introduce_me

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.widget.addTextChangedListener

// 2. 회원가입 페이지
class SignUpActivity : AppCompatActivity() {
    // UI 요소 연결할 변수 선언
    private lateinit var editName: EditText
    private lateinit var editId: EditText
    private lateinit var editPw: EditText
    private lateinit var btnSignUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        // UI 요소 연결
        editName = findViewById(R.id.edit_name)
        editId = findViewById(R.id.edit_id)
        editPw = findViewById(R.id.edit_pw)
        btnSignUp = findViewById(R.id.btn_sign_up)

        // 초기 버튼 상태 업데이트
        updateButtonState()

        // 입력 필드의 텍스트 변경 시 버튼 상태 업데이트
        editName.addTextChangedListener {
            updateButtonState()
        }

        editId.addTextChangedListener {
            updateButtonState()
        }

        editPw.addTextChangedListener {
            updateButtonState()
        }

        // 가입하기 버튼이 눌렸을 때 동작 정의
        btnSignUp.setOnClickListener {
            val name = editName.text.toString()
            val id = editId.text.toString()
            val pw = editPw.text.toString()
            // Name/ID/PW가 모두 채워져 있을 경우
            if (name.isNotEmpty() && id.isNotEmpty() && pw.isNotEmpty()) {  // 이름/아이디/비번 셋 다 채워져 있다면
                // 결과로 전달할 데이터를 Intent에 담음
                val intent = Intent()
                intent.putExtra("inputId", id)
                intent.putExtra("inputPw", pw)
                // 결과를 설정, 현재 액티비티 종료
                setResult(RESULT_OK, intent)
                finish()  // SignInActivity 돌아가기
            } else {  // Name/ID/PW 중 하나라도 비어있을 경우
                // 토스트 메시지를 통해 입력되지 않은 정보가 있다는 메시지를 띄움
                Toast.makeText(this, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // 이름, 아이디, 비밀번호 입력 상태를 확인하여 버튼 상태 변경하는 함수
    private fun updateButtonState() {
        val name = editName.text.toString()
        val id = editId.text.toString()
        val pw = editPw.text.toString()
        btnSignUp.isEnabled = name.isNotEmpty() && id.isNotEmpty() && pw.isNotEmpty()
    }

    // EditText를 제외한 부분을 터치하면 키보드가 사라지도록 함
    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        Utils.handleTouchEvent(this, ev, currentFocus)
        return super.dispatchTouchEvent(ev)
    }
}