package com.example.introduce_me

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

// 2. 회원가입 페이지
class SignUpActivity : AppCompatActivity() {
    // ActivityResultLauncher를 선언하여 startActivityForResult를 대체할 준비
    private lateinit var signUpLauncher: ActivityResultLauncher<Intent>

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

        // registerForActivityResult 호출하여 signUpLauncher 초기화
        signUpLauncher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
                // startActivityForResult 결과를 처리하는 람다식
                if (result.resultCode == RESULT_OK) {
                    val data = result.data
                    if (data != null) {
                        // 결과로 전달된 데이터에서 ID/PW를 가져옴
                        val id = data.getStringExtra("inputId")
                        val pw = data.getStringExtra("inputPw")

                        // ID/PW가 모두 비어있지 않은 경우
                        if (!id.isNullOrEmpty() && !pw.isNullOrEmpty()) {
                            // Intent ID/PW를 담음
                            val intent = Intent()
                            intent.putExtra("inputId", id)
                            intent.putExtra("inputPw", pw)

                            // 결과 설정, 현재 액티비티 종료
                            setResult(RESULT_OK, intent)
                            finish()
                        }
                    }
                }
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
}