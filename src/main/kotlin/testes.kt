import java.math.BigDecimal
import kotlin.math.sqrt

fun main() {
    //var num = readLine()?.toInt() ?: 0
    //var num = readLine()?.toint() ?: ""
    //var num = readLine()?.getOrNull(0) ?: ' '

//    val numero = -4.0
//    try {
//        val resultado2 = sqrt(numero)
//        if (numero < 0) {
//            throw IllegalArgumentException()
//        }
//        println ("Resultado: $resultado2")
//    } catch (e: IllegalArgumentException) {
//        println("Erro: Valor negativo não possui raiz real")
//    }

//    var a:Int?
//    //println(a)

    //val char = readLine()?.getOrNull(0) ?: ' '
    //var texto = readLine()?.toIntOrNull() ?: 0
    //var texto = readLine()?.getToDouble() ?: 0.0
    //var texto = readLine()?.getString(0) ?: ' '
    //var texto = readlnOrNull()

    //Como você lê um valor decimal (número de ponto flutuante) digitado pelo usuário na linguagem Kotlin?
    //var valor = readDouble()?.toFloat() ?: 0.0f
    //var valor = readLine()?.toIntOrNull() ?: 0
    //var valor = readLine()?.toFloat()?: 0.0f
    //var valor = readLine()?.toBigDecimalOrNull() ?: BigDecimal.ZERO

    val numerador = 10
    val denominador = 0
    try {
        val resultado = numerador / denominador
        println("Resultado: $resultado")
    } catch (e: ArithmeticException) {
        println("Erro: Divisão por zero")
    }

    try {
        var s: String? = null
        s = "Felipe"
        println(s!!.length)
        var a = 10 / 0
        var
                b = -4.0
        var y = sqrt(b)
        if (b < 0) {
            throw IllegalArgumentException()
        }
    } catch (e: NullPointerException) {
        println("Variável nula")
    } catch (e: ArithmeticException) {
        println("Divisão por zero é inexistente")
    } catch (e: IllegalArgumentException) {
        println("Não existe raiz de número negativo")
    } catch (e: Exception) {
        println("Exception mais geral")
    } finally {
        println("Final do TRY CATCH")
    }
    println("Final do programa!")
}