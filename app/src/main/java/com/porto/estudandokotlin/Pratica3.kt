package com.porto.estudandokotlin

// Pratica de funções e lambda
fun main() {
    val number1 = 10
    val number2 = 20

    println(sum(number1, number2))
    println(multiply(number1, number2))

    val sum2 = { a: Int, b: Int -> a + b }
    println(sum2(number1, number2))
}

fun sum(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun multiply(number1: Int, number2: Int) = number1 * number2