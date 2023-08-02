package com.example.calculator.calc

import com.example.calculator.abs.AbstractOperation

class MultiplyOperation: AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double = (num1 * num2).toDouble()
}