package KotlinTratamentodeDados

fun main() {
    //val s = readLine()
    val n = readLine()
    var num = readLine()?.toInt() ?: 0
    var num2 = readlnOrNull()?.toInt() ?: 0
    var num3 = readlnOrNull()?.toDouble() ?: 0.0
    var num4 = readlnOrNull()?.toFloat() ?: 0.0f
    var num5 = readlnOrNull()?.toBoolean() ?: false
    println("Tipo String ${n}")
    println("Tipo Int ${num}")
    println("Tipo Int ${num2}")
    println("Tipo Double ${num3}")
    println("Tipo Float ${num4}")
    println("Tipo Boolean ${num5}")

}