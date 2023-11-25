package atividadesPraticas2

import kotlin.math.sqrt

fun main() {
    try {
        println("Digite uma valor para verficar se ha raiz:")
        var valor = readln().toDouble()
        if (valor==0.0 || valor <0 ){
            throw IllegalArgumentException()
        }
        println(sqrt(valor))
    }catch (e:NumberFormatException){
        println("oi")
    }catch (e: IllegalArgumentException){
        println("Deve ser inserido um valor maior que 0")
    }
}