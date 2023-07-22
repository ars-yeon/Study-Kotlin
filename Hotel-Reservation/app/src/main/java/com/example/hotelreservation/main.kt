package com.example.hotelreservation

fun main() {
    println("호텔예약 프로그램 입니다.")  // println("Hotel Reservation Program")
    println("=============================================================================")
    println("[메뉴]\n1.방예약  2.예약목록출력  3.예약목록출력(정렬)  4.시스템 종료  5.입출금 내역 출력  6.예약 변경/취소")
    println("입력: ")
    val menu = readLine()!!.toInt()

    when (menu) {
        1 -> {
            println("방예약")
        }
        2 -> {
            println("예약목록 출력")
        }
        3 -> {
            println("예약목록출력(정렬)")
        }
        4 -> {
            println("시스템 종료")
        }
        5 -> {
            println("입출금 내역 출력")
        }
        6 -> {
            println("예약 변경/취소")
        }
    }
}