package atividadesPraticas2

import kotlin.math.pow
import kotlin.math.sqrt


fun main() {
    val a: Int
    val b: Int
    val c: Int
    try {
        print("Digite o valor do 'a': ")
        a = readlnOrNull()?.toInt()!!
        if (a == 0) {
            throw ArithmeticException()
        }
        print("Digite o valor do 'b': ")
        b = readlnOrNull()?.toInt()!!
        print("Digite o valor do 'c': ")
        c = readlnOrNull()?.toInt()!!

        var delta = (sqrt(b.toDouble().pow(2) - (4 * a * c)))
        println("valor do Delta: $delta")


//        if (delta < 0 || delta.isNaN()) {
//            throw Exception("Não existe raiz real")
//        } else if (delta > 0) {
//            val x1 = (-b + delta) / (2 * a)
//            val x2 = (-b - delta) / (2 * a)
//            println("x1 = $x1 & x2 = $x2")
//        } else if (delta == 0.0) {
//            val x1 = -b / (2 * a)
//            println("Solução unica x1 = $x1")
//        }

        ///////////////////////////////////////////////////

        // val delta = (sqrt(b.toDouble().pow(2) - 4 * a * c))

        if (delta.isNaN()) {
            println("O cálculo resultou em NaN. Não é possível calcular as raízes reais.")
        } else {
            if (delta < 0) {
                println("Não existe raiz real.")
            } else if (delta > 0) {
                val x1 = (-b + delta) / (2 * a)
                val x2 = (-b - delta) / (2 * a)
                println("x1 = $x1 & x2 = $x2")
            } else {
                val x1 = -b / (2 * a)
                println("Solução única x1 = $x1")
            }
        }

    } catch (e: NumberFormatException) {
        println("Formato numerico incorreto")
    } catch (e: ArithmeticException) {
        println("'a' nao pode ser 0")
    } catch (e: IllegalArgumentException) {
        println("Argumento invalido")
    } catch (e: Exception) {
        println(e)
    }


}