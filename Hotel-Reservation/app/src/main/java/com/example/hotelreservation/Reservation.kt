package com.example.hotelreservation

class Reservation {
    var today: String = "20230723"
    var room: String = ""
    var checkIn: String = ""
    var checkOut: String = ""

    fun reserve() {
        println("예약자분의 성함을 입력해주세요.")
        var name = readLine()!!

        while (true) {
            println("예약할 방 번호를 입력해주세요. (100~999)")
            room = readLine()!!

            // 예약할 방 번호가 100~999에 속하지 않으면 예외 처리
            if (room.toInt() in 100..999) break
        }

        while (true) {
            println("체크인 날짜를 입력해주세요. (YYYYMMDD)")
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
    }
}
