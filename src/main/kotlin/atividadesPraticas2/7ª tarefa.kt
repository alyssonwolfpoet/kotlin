package atividadesPraticas2

fun main() {
    try {
        print("Digite um valor inteira entre 0 a 9: ")
        var numero = readlnOrNull()?.toInt()!!
        if (numero<0 || numero>9){
            throw IllegalArgumentException()
        }
        var fatorial = 1
        print("Fatorial de $numero = ")
        for (i in 0 until numero) {
            fatorial *= numero
            print("${numero--} * ")

        }
        print("= $fatorial")

    } catch (e: NumberFormatException) {
        println("Formato digitado invalido!")
    } catch (e: IllegalArgumentException) {
        println("Deve ser inserido um numero entre 0 a 9")
    }
}