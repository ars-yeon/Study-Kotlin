package com.example.calculator.calc

import com.example.calculator.abs.AbstractOperation

class Calulator(private val operator: AbstractOperation) {
    fun operate(num1: Int, num2: Int): Double {
        return operator.operate(num1, num2)
    }
}