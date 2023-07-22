package com.example.hotelreservation

class Reservation {
    fun rez() {
        println("예약자분의 성함을 입력해주세요.")
        var rezName = readLine()!!

        println("예약할 방 번호를 입력해주세요. (100~999)")
        var rezRoom = readLine()!!.toInt()

        // 예약할 방 번호가 100~999에 속하지 않으면 예외처리

        println("체크인 날짜를 입력해주세요. (YYYYMMDD)")
        var dateIn = readLine()!!.toInt()
        
        // 선택한 날짜가 지났으면 예외처리

        println("체크아웃 날짜를 입력해주세요. (YYYYMMDD)")
        var dateOut = readLine()!!.toInt()

        // 체크아웃 날짜가 체크인 날짜보다 전이거나 같으면 예외처리
    }
}