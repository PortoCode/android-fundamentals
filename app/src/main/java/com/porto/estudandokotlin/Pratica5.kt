package com.porto.estudandokotlin

// Pratica de POO

interface Alimentavel {
    fun comer()
}

abstract class Animal(
    val nome: String
) : Alimentavel {
    abstract fun emitirSom()
}

class Cachorro(nome: String) : Animal(nome) {
    override fun emitirSom() {
        println("$nome latiu")
    }

    override fun comer() {
        println("$nome comeu")
    }

    fun passear() {
        println("$nome passeou")
    }
}

class Gato(nome: String) : Animal(nome) {
    override fun emitirSom() {
        println("$nome miou")
    }

    override fun comer() {
        println("$nome comeu")
    }
}

fun main() {
    val cachorro = Cachorro("Buddy")
    cachorro.passear()
    cachorro.emitirSom()
    cachorro.comer()

    val gato = Gato("Bichento")
    gato.emitirSom()
    gato.comer()
}
