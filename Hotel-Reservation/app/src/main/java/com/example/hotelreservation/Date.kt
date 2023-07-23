package com.example.hotelreservation

object Date {
    // 날짜를 YYYY-MM-DD 형식으로 변환하는 함수
    fun formatDate(date: String): String {
        return "${date.substring(0,4)}-${date.substring(4, 6)}-${date.substring(6, 8)}"
    }
}