package com.example.hotelreservation

class CheckSort {
    // 정렬된 예약 정보 목록을 출력하는 함수
    fun checkSort(reservations: List<ReservationInfo>) {
        if (reservations.isEmpty()) {
            println("저장된 예약 정보가 없습니다.")
            return
        }
        
        // 체크인 날짜 기준으로 정렬
        val sortedReservations = reservations.sortedBy { Date.formatDate(it.checkIn) }

        println("호텔 예약자 목록입니다.")
        for ((index, reservationInfo) in sortedReservations.withIndex()) {
            val formattedCheckIn = Date.formatDate((reservationInfo.checkIn))
            val formattedCheckOut = Date.formatDate((reservationInfo.checkOut))
            val list = "${index + 1}) 예약자: ${reservationInfo.name}, 방 번호: ${reservationInfo.room}호, 체크인: ${formattedCheckIn}, 체크아웃: ${formattedCheckOut}"
            println(list)
        }
    }
}