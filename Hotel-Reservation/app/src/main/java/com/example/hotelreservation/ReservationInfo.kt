package com.example.hotelreservation

import java.time.LocalDate

data class ReservationInfo(val name: String, val room: String, val checkIn: LocalDate, val checkOut: LocalDate, var pay: Money, var deposit: Money)
