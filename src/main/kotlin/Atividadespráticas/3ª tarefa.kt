package Atividadespráticas

fun main() {
    println(isPrime(2147483647))
    println(Int.MAX_VALUE)
}
fun isPrime(n: Int): Boolean {
    // Se o número for menor que 2, ele não é primo
    if (n < 2) return false
    // Se o número for 2, ele é primo
    if (n == 2) return true
    // Se o número for par, ele não é primo
    if (n % 2 == 0) return false
    // Cria uma variável para armazenar a raiz quadrada do número
    val sqrt = kotlin.math.sqrt(n.toDouble()).toInt()
    // Testa todos os divisores ímpares de 3 até a raiz quadrada do número
    for (i in 3..sqrt step 2) {
        // Se algum divisor for encontrado, o número não é primo
        if (n % i == 0) return false
    }
    // Se nenhum divisor for encontrado, o número é primo
    return true
}