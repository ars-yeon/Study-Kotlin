package com.example.hotelreservation

import java.text.NumberFormat
import java.util.Locale

class Money(val amount: Int) {
    override fun toString(): String {
        return amount.toString()
    }

    // 숫자를 돈 형식으로 변환하는 함수
    fun money(): String {
        val numberFormat = NumberFormat.getNumberInstance(Locale.KOREAN)
        return numberFormat.format(amount)
    }
}
