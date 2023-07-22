package com.example.calculator

import com.example.calculator.calc.AddOperation
import com.example.calculator.calc.Calulator
import com.example.calculator.calc.SubstractOperation
import com.example.calculator.calc.MultiplyOperation
import com.example.calculator.calc.DivideOperation


fun main() {
    print("Enter num1: ")
    val num1 = readLine()!!.toInt()

    print("Enter num2: ")
    val num2 = readLine()!!.toInt()

    while (true) {
        print("Enter Operator: ")
        val oper = readLine()!! // '+', '-', '*', '/'

        val result = when (oper) {
            "+" -> { // 더하기
                val addCalc = Calulator(AddOperation())
                addCalc.operate(num1, num2)
            }
            "-" -> {// 빼기
                val subCalc = Calulator(SubstractOperation())
                subCalc.operate(num1, num2)
            }
            "*" -> { // 곱하기
                val mulCalc = Calulator(MultiplyOperation())
                mulCalc.operate(num1, num2)
            }
            "/" -> { // 나누기
                val divCalc = Calulator(DivideOperation())
                divCalc.operate(num1, num2)
            }
            else -> { // 다른 연산자를 입력했을 때
                println("※ Invalid operator. Please try again.")
                continue
            }
        }
        println("$num1 $oper $num2 = $result")
        break
    }
}