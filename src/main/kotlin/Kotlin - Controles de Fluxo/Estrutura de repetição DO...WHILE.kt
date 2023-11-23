package `Kotlin - Controles de Fluxo`

fun main() {
    var i = 0
    do {
        print("${i} ")
        i++
    }while (i != 10)

    print("\n")
    while (i==10){
        print("Loop while")
        i++
    }

    print("\n")
    do {
        print("Qual seu nome: ")
        val value = readLine()
    }while (value == "")
}