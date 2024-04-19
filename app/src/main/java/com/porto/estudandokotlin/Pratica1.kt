package com.porto.estudandokotlin

// Pratica de variaveis mutaveis e imutaveis e null safety
fun main() {
    var age: Int = 90
    age = 78

    val name: String = "Rodrigo"

    val score = 90
    val price: Double = 9.99
    val rate: Float = 8f
    val isValid: Boolean = false

    val numbers: Array<Int> = arrayOf(0,1,2,3,4,5)

    numbers[0] = 6

    var nullableString: String? = "Teste"

    println(nullableString?.length ?: 0)
}