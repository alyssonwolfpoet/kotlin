package `Kotlin - Controles de Fluxo`

fun main() {
    val linhas =3
    val colunas =3
        val matiz: Array<Array<Int>> = Array(linhas) { Array(colunas) {0} }
    var digito = -1
    for (i in 0 until  linhas){
        for (j in 0 until colunas){
            print("${matiz[i][j]} ")
        }
       println()
    }
    for (i in 0 until linhas){
        for (j in 0 until colunas){
            matiz[i][j]= ++digito//digito++
        }
    }
    println("Impresão da matriz: ")
    for (i in 0 until linhas){
        for (j in 0 until colunas){
            print("${matiz[i][j]} ")
        }
        println()
    }
    println("Impresão da matriz: ")
    for (linha in matiz){
        for (valor in linha){
            print("${valor} ")
        }
        println()
    }
    println("Quantidade de linhas da matriz: ${matiz.size}")
    println("Quantidade de colunas da matriz: ${matiz[0].size}")
}