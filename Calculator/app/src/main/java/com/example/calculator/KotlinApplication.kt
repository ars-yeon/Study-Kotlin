package com.example.calculator

import com.example.calculator.calc.AddOperation
import com.example.calculator.calc.Calulator
import com.example.calculator.calc.SubstractOperation
import com.example.calculator.calc.MultiplyOperation
import com.example.calculator.calc.DivideOperation


fun main() {
    // 더하기
    val addCalc = Calulator(AddOperation())
    println("A + B = ${addCalc.operate(10, 20)}")
    // 빼기
    val subCalc = Calulator(SubstractOperation())
    println("A - B = ${subCalc.operate(10, 20)}")
    // 곱하기
    val mulCalc = Calulator(MultiplyOperation())
    println("A * B = ${mulCalc.operate(10, 20)}")
    // 나누기
    val divCalc = Calulator(DivideOperation())
    println("A / B = ${divCalc.operate(10, 20)}")
}