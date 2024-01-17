
// Função recursiva
/*
* 1ª regra: Não poderá ser void (procedimento).
* 2ª regra: Deverá ter pelo menos uma condição de parada.
* Fatorial - 5!-> 5*4*3*2*1
* */

fun main( ) {
    val x:Int
    x = readlnOrNull()?.toInt() ?: 0
    println(fatorial(x))
}
fun fatorial(a:Int):Int{ // Big O
    if(a==0){
        return 1
    }
   return a * fatorial(a-1)
}