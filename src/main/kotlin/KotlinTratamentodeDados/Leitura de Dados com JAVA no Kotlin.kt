package KotlinTratamentodeDados

import java.util.Scanner

fun ler_int(){
    val scanner = Scanner(System.`in`)
    println("Digite um número inteiro: ")
    var num = scanner.nextInt()
    println("Você digitou ${num}")
}
fun ler_double(){ // Utilizar Vírgula
    val scanner = Scanner(System.`in`)
    println("Digite um número Double: ")
    var num = scanner.nextDouble()
    println("Você digitou ${num}")
}
fun ler_string(){
    val scanner = Scanner(System.`in`)
    println("Digite um número nome: ")
    var num = scanner.next()
    println("Você digitou ${num}")
}
fun ler_float(){ // Utilizar Vírgula
    val scanner = Scanner(System.`in`)
    println("Digite um número Float: ")
    var num = scanner.nextFloat()
    println("Você digitou ${num}")
}
fun main() {
    ler_int()
    ler_double()
    ler_string()
    ler_float()
    ler_boolean()
}
fun ler_boolean(){
    val scanner = Scanner(System.`in`)
    println("Digite um valor Boolean: ")
    var num = scanner.nextBoolean()
    println("Você digitou ${num}")
    scanner.close()
}