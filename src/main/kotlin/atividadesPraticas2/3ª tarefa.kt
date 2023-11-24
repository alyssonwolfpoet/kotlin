package atividadesPraticas2


fun main() {
    val notas = DoubleArray(6)

    try {
        for (i in notas.indices) {
            println("Digite a ${i + 1} ª nota: ")
            notas[i] = readlnOrNull()?.toDouble()!!
            if (notas[i] < 0 || notas[i] > 10) {
                throw IllegalArgumentException()
            }
//            val aux = notas[i]
//            else if (notas[i] != "%.1f".format(notas[i]).toDouble()) {
//                println("test ${notas[i]}")
//                println("%.1f".format(notas[i]))
//                throw IllegalArgumentException("Valor com mais de uma casa deciamal")
//            }
        }

        //notas.forEach { println(it) }
        println("Media das notas: ${notas.average()}")
    } catch (e: NumberFormatException) {
        println("Formato invalido")
    } catch (e: IllegalArgumentException) {
        println("Deve digitar uma nota maior que 10 ou menor que 0")
    }


}
