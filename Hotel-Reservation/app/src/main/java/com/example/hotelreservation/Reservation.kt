package com.example.hotelreservation

import java.util.Random
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Reservation {
    var room: String = ""
    var checkIn: String = ""
    var checkOut: String = ""
    var reservations: MutableList<ReservationInfo> = mutableListOf()

    val formatter = DateTimeFormatter.ofPattern("yyyyMMdd, Locale.Korean")
    val today = LocalDate.now()  // 오늘 날짜 가져오기
    val todayString = today.format(formatter)  // 오늘 날짜를 한국 형식으로 변환

    private val random = Random()
    private fun rand(from: Int, to: Int): Int {
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
            println("체크인 날짜를 입력해주세요.[YYYYMMDD] [오늘 날짜: $todayString]")
            checkIn = readLine()!!

            // 선택한 날짜가 지났으면 예외 처리
            if (checkIn.toInt() < todayString.toInt()) println("지난 날짜는 예약이 불가능합니다.")
            else break
        }
        val checkInDate = LocalDate.parse(checkIn, formatter)  // 오늘 날짜와 같은 형식으로 전환 (ex. 20230723)

        while (true) {
            println("체크아웃 날짜를 입력해주세요.[YYYYMMDD] [체크인: $checkInDate]")
            checkOut = readLine()!!

            // 선택한 날짜가 체크인 날짜와 같거나 전이라면 예외 처리
            if (checkOut.toInt() <= checkIn.toInt()) println("체크인 날 당일 또는 지난 날짜는 예약이 불가능합니다.")
            else break
        }
        val checkOutDate = LocalDate.parse(checkOut, formatter)  // 오늘 날짜와 같은 형식으로 전환 (ex. 20230723)

        val pay = Money(rand(50000, 600000))  // 호텔 숙소비 500000~600000 랜덤으로 임의의 금액
        val deposit = Money((pay.amount * 0.1).toInt())  // 예약금: 호텔 숙박비의 10%

        val reservationInfo = ReservationInfo(name, room, checkInDate, checkOutDate, pay, deposit)  // 입력 받은 정보를 ReservationInfo 객체로 만들어서 리스트에 추가
        reservations.add(reservationInfo)  // 리스트에 예약 정보 추가

        println("호텔 숙박비 ${pay.money()}원의 10%인 예약금 ${deposit.money()}원을 입금해주세요!")  // money() 함수를 호출하여 돈 형식으로 출력
    }
}
