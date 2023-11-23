package `Kotlin - Tratamento de Dados`

import kotlin.math.sqrt

fun main() {
    try {
        var s: String? = null
        //s = "Alysson"
        println("O tamanho da String é: ${s!!.length}")

        var a = 10 / 0
        println("O resultado da divisão será: $a")

        var b = -9.0
        var c = sqrt(b)
        if (b < 0) {
            throw IllegalArgumentException()
        }

        var x = 1
        if (x == 1) {
            throw Exception("O valor do x não pode ser 1")
        }
    } catch (e: NullPointerException) {
        println("A variável está vazia")
    } catch (e: ArithmeticException) {
        println("Não existe divisão por zero")
    } catch (e: IllegalArgumentException) {
        println("Não existe raiz de numero negativo, sendo exclusivo para o conjunto dos números complexos")
    } catch (e: Exception) {
        println("Exceção mais geral: ")
        println(e.message)
    } finally {
        println("Executando Finally, finalizando o bloco de tratamento de dados")
    }
    println("Final do  programa!")
}