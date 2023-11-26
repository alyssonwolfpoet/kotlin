package atividadesPraticas2

import kotlin.system.exitProcess

fun main() {
    try {
        print("Digite posição de um número, na sequência de Fibonacci:")
        val n = readlnOrNull()?.toInt()!!
        if (n<=2)
            throw NumberFormatException()
        var t1 = 1
        var t2 = 1
        var posicao = 0


        for (i in 1..n) {
            //print("$t1 + ")
            if (i == n){
                posicao = t1
            }
            val sum = t1 + t2
            t1 = t2
            t2 = sum
        }
        print("valor na posicão $n = $posicao ")
    }catch (e:NumberFormatException){
       println( "Deve digitar um formato valido e maior que '2'")
    }

}