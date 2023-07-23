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
            val list = "${index + 1}. ${reservationInfo.name}, ${reservationInfo.room}, ${reservationInfo.checkIn}, ${reservationInfo.checkOut}"
            println(list)
        }
    }
}
