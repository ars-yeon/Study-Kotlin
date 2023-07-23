package com.example.hotelreservation

class Check {
    // 예약 정보 목록을 출력하는 함수
    fun check(reservations: List<ReservationInfo>) {
        if (reservations.isEmpty()) {
            println("저장된 예약 정보가 없습니다.")
            return
        }

        println("호텔 예약자 목록입니다.")
        for ((index, reservationInfo) in reservations.withIndex()) {
            val formattedCheckIn = formatDate((reservationInfo.checkIn))
            val formattedCheckOut = formatDate((reservationInfo.checkOut))
            val list = "${index + 1}. 예약자: ${reservationInfo.name}, 방 번호: ${reservationInfo.room}호, 체크인: ${formattedCheckIn}, 체크아웃: ${formattedCheckOut}"
            println(list)
        }
    }
    // 날짜를 YYYY-MM-DD 형식으로 변환하는 함수
    private fun formatDate(date: String): String {
        return "${date.substring(0,4)}-${date.substring(4, 6)}-${date.substring(6, 8)}"
    }
}
