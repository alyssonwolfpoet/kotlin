package Atividadespráticas

fun SePrimo(n :Int){
    if (n%2 == 0)
        println("Não é primo")
    else(println("É primo"))
}
fun Lerint() {
    print("digite Numero Inteiro: ")
    //var n:Int = readLine()!!.toInt()
    var n:Int = readln().toInt()
    SePrimo(n)
}
fun main() {
    Lerint()
}