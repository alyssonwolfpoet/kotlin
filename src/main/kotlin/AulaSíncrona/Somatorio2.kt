package Aula02
// 1 2 3 4 5
fun soma(ini:Int, fim:Int, razao:Int):Int{
    if(ini>fim){
        return 0
    }
    return ini+ soma(ini+razao,fim,razao)
}

fun main() {
    var ini:Int=1
    var fim:Int=5
    var razao:Int = 1
    println(soma(ini,fim,razao)) // O(n-1 ou n-2)
}