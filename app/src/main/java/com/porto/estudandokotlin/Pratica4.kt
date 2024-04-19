package com.porto.estudandokotlin

// Controle de fluxo
fun main() {
    val diaDaSemana = 3

    val nomeDiaDaSemana = when (diaDaSemana) {
        1 -> "Segunda-feira"
        2 -> "Terça-feira"
        3 -> "Quarta-feira"
        4 -> "Quinta-feira"
        5 -> "Sexta-feira"
        else -> "Fim de semana"
    }
    println("Hoje é $nomeDiaDaSemana")

    var contador = 0
    while (contador < 5) {
        println(contador)
        contador++
    }

    val lista = listOf("maça", "uva", "pera", "melancia")
    for (fruta in lista) {
        println(fruta)
    }

    fazerLogin("admin1", "senha123")
    fazerLogin("admin", "senha123")
    fazerLogin("asd", "asd")
}

fun fazerLogin(usuario: String, senha: String) {
    if (usuario == "admin" && senha == "senha123") {
        println("usuario logado")
    } else if (usuario == "admin") {
        println("senha incorreta")
    } else if (senha == "senha123") {
        println("usuario incorreto")
    } else {
        println("usuario e senha incorretos")
    }
}