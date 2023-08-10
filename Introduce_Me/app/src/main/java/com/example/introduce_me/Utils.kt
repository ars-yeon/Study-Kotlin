package com.example.introduce_me

import android.content.Context
import android.graphics.Rect
import android.view.MotionEvent
import android.view.View
import android.view.inputmethod.InputMethodManager

// 여러 곳에서 사용될 유틸리티 기능
object Utils {

    // 터치 이벤트를 처리하는 함수
    fun handleTouchEvent(context: Context, ev: MotionEvent?, focusView: View?) {
        // InputMethodManager를 가져옴
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

        // 포커스가 있는 뷰와 터치 이벤트 확인
        if (focusView != null && ev != null) {
            // 포커스된 뷰의 전역 가시 영역을 가져옴
            val rect = Rect()
            focusView.getGlobalVisibleRect(rect)

            //터치한 좌표를 정수로 변환
            val x = ev.x.toInt()
            val y = ev.y.toInt()

            // 포커스된 뷰의 전역 영역 안에 터치 좌표가 포함되어 있는지 확인
            if (!rect.contains(x, y)) {
                // 키보드를 숨기고 포커스 해제
                imm.hideSoftInputFromWindow(focusView.windowToken, 0)
                focusView.clearFocus()
            }
        }
    }
}