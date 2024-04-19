package com.porto.estudandokotlin

data class Pessoa(val nome: String, val idade: Int)

// Praticando coleções e listas
fun main() {
    val pessoas: List<Pessoa> = listOf<Pessoa>(
        Pessoa("Alice", 25),
        Pessoa("Bob", 33),
        Pessoa("Carol", 55),
        Pessoa("João", 18),
        Pessoa("Eva", 21)
    )

    // Filtrar pessoas com idade maior que 25
    val pessoasMaioresDe25 = pessoas.filter { it.idade > 25 }
    println("Pessoas maiores de 25: $pessoasMaioresDe25")

    // Mapear apenas os nomes das pessoas
    val nomes = pessoas.map { it.nome }
    println("Apenas os nomes: $nomes")

    // Verificar se todas as pessoas tem idade maior que 20
    val todasSaoMaioresDe20 = pessoas.all { it.idade > 20 }
    println("Todos sao maiores que 20? $todasSaoMaioresDe20")

    // Encontrar a primeira pessoa com idade menor que 30
    val primeiroMenorDe30 = pessoas.find { it.idade < 30 }
    println("Primeiro menor de 30: $primeiroMenorDe30")

    // Ordenar as pessoas por idade
    val pessoasOrdenadasPorIdade = pessoas.sortedBy { it.idade }
    println("Pessoas ordenadas por idade: $pessoasOrdenadasPorIdade")

    // Verificar se existe alguem chamada Eva
    val existeEva = pessoas.any { it.nome == "Eva" }
    println("Existe alguma Eva? $existeEva")

    // Contar quantas pessoas tem idade maior que 30
    val quantidadeMaioresDe30 = pessoas.count { it.idade > 30 }
    println("Quantidade maiores de 30: $quantidadeMaioresDe30")

    // Imprimir essa lista com uma string separada por virgula
    val nomesConcatenados = pessoas.joinToString(separator = ", ") { it.nome }
    println("Nomes concatenados: $nomesConcatenados")
}