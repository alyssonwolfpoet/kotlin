package `Atividades práticas`

import kotlin.random.Random

fun main() {
    val linhas =4
    val colunas =4
    var matriz: Array<Array<Float>> = Array(linhas) { Array(colunas) {0f} }

    println("Gerando valores aleatorios de float")

    for (i in 0 until linhas){
        for (j in 0 until colunas){
            matriz[i][j] = Random.nextFloat()*100
        }
    }

    println("quantidade de linhas: ${matriz.size}")
    println("quantidade de coluna: ${matriz[0].size}")
    println("Imprimindo a matriz")

    for (i in 0 until linhas){
        for (j in 0 until colunas){
            print("(${matriz[i][j]}) ")
        }
        println()
    }
}