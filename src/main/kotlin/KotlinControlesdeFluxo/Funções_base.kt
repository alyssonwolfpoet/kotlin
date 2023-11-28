package KotlinControlesdeFluxo

fun Impressao(){ // Função sem parãmetro e sem retorno - VOID
    println("Função sem parãmetro e sem retorno")
}
fun Soma(a: Int,b: Int):Int{ // Função com parãmetro e com retorno do tipo inteiro
    return a+b
}

fun main() {
    Impressao()
    var x=10
    var y=20
    println(Soma(x,y))
    Soma_2(x,y)
}

fun Soma_2(a:Int,b:Int) { //Função com parãmetro e sem retorno
    println("A soma das variaveis são: ${a+b}")
}