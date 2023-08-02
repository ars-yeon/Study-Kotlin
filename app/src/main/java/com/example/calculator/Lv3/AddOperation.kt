package com.example.calculator.Lv3
import java.math.BigDecimal

class AddOperation: Operation {
    override fun operate(num1: BigDecimal, num2: BigDecimal): BigDecimal {
        return num1 + num2
    }
}