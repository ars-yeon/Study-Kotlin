package com.example.hotelreservation

import java.util.Random

class Reservation {
    var today: String = "20230723"
    var room: String = ""
    var checkIn: String = ""
    var checkOut: String = ""
    var reservations: MutableList<ReservationInfo> = mutableListOf()

    val random = Random()
    fun rand(from: Int, to: Int): Int {
        return random.nextInt(to - from) + from
    }

    fun reserve() {
        println("예약자분의 성함을 입력해주세요.")
        val name = readLine()!!

        while (true) {
            println("예약할 방 번호를 입력해주세요. (100~999)")
            room = readLine()!!

            // 예약할 방 번호가 100~999에 속하지 않으면 예외 처리
            if (room.toInt() in 100..999) break
        }

        while (true) {
            println("체크인 날짜를 입력해주세요.(YYYYMMDD) [오늘 날짜: $today]")
            checkIn = readLine()!!

            // 선택한 날짜가 지났으면 예외 처리
            if (checkIn.toInt() < today.toInt()) println("지난 날짜는 예약이 불가능합니다.")
            else break
        }

        while (true) {
            println("체크아웃 날짜를 입력해주세요. (YYYYMMDD)")
            checkOut = readLine()!!

            // 선택한 날짜가 체크인 날짜와 같거나 전이라면 예외 처리
            if (checkOut.toInt() <= checkIn.toInt()) println("체크인 날 당일 또는 지난 날짜는 예약이 불가능합니다.")
            else break
        }

        val pay = rand(50000, 600000).toString()  // 호텔 숙소비 500000~600000 랜덤으로 임의의 금액
        val deposit = (pay.toInt() * 0.1).toString()  // 예약금: 호텔 숙박비의 10%

        // 입력 받은 정보를 ReservationInfo 객체로 만들어서 리스트에 추가
        val reservationInfo = ReservationInfo(name, room, checkIn, checkOut, pay, deposit)
        reservations.add(reservationInfo)

        println("호텔 숙박비 ${pay}원의 10%인 예약금 ${deposit}원을 입금해주세요!")
    }
}
