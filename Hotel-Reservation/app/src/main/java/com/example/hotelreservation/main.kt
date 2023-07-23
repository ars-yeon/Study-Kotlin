package com.example.hotelreservation

fun main() {
    val rez = Reservation()
    val check = Check()
    val sort = CheckSort()

    println("호텔 예약 프로그램 입니다.")

    while (true) {
        try {
            println("[메뉴]\n1.방예약  2.예약 목록 출력  3.예약 목록 출력(정렬)  4.시스템 종료  5.입출금 내역 출력  6.예약 변경/취소 7. 프로그램 종료")
            print("입력: ")

            when (readLine()!!.toInt()) {
                1 -> {
                    rez.reserve()
                    println("호텔 예약이 완료되었습니다.")
                }

                2 -> {
                    check.check(rez.reservations)
                }

                3 -> {
                    sort.checkSort(rez.reservations)
                }

                4 -> {
                    println("시스템 종료")
                    break
                }

                5 -> {
                    println("입출금 내역 출력")
                }

                6 -> {
                    println("예약 변경/취소")
                }

                else -> {
                    println("※ 올바른 숫자를 입력해주세요. ")  //println("Invalid number. Please try again.")
                }
            }
        } catch (e: NumberFormatException) {
            println("※ 메뉴를 확인해 주세요.")
        }
        println("==============================================================================================================")
    }
}