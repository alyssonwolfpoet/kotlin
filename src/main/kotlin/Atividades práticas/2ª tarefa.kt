package `Atividades práticas`

fun Media(notas: FloatArray) {
    var media = (notas.sum()/4)
    println("Media : ${media}")
    if (media >=7){
        println("Aprovado")
    }
    else if (media>=4 && media<7){
        println("Recuperação")
    }
    else if (media<4){
        println("Reprovado")
    }else(println("erro"))
}
fun LerNotas(){
    var notas = floatArrayOf(0f,0f,0f,0f)
    var cont:Int = 0
    for (i in 0 until notas.size){
        println("digite a nota ${i}º : ")
        notas[i] = readln().toFloat()
        if (notas[i]< 0 || notas[i]>10){
            println("Nota inexistente")
            break
        }
        cont++
    }
    if (cont == 4){
        Media(notas)
    }

}
fun main() {
    LerNotas()
}