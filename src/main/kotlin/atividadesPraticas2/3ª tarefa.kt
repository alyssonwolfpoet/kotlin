package atividadesPraticas2

fun validarNotaComUmaCasaDecimal(notaString: String): Boolean {
    val partes = notaString.split(".")
    return partes.size == 2 && partes[1].length == 1 && partes[1][0].isDigit()
}

fun main() {
    val notas = DoubleArray(6)

    try {
        for (i in notas.indices) {
            println("Digite a ${i + 1} ª nota: ")
            notas[i] = readlnOrNull()?.toDouble()!!
            if (notas[i] < 0 || notas[i] > 10) {
                throw IllegalArgumentException()
            }

            var notaString = notas[i].toString()

//            while (!notaString.matches(Regex("""\d+.\d"""))) {
//                println("A nota deve ter apenas uma casa decimal. Digite novamente:")
//                notaString = readlnOrNull() ?: throw NumberFormatException("Formato inválido")
//            }
            while (!validarNotaComUmaCasaDecimal(notaString)) {
                println("A nota deve ter apenas uma casa decimal. Digite novamente:")
                notaString = readlnOrNull() ?: throw NumberFormatException("Formato inválido")
            }
        }

        println("Media das notas: ${notas.average()}")
    } catch (e: NumberFormatException) {
        println("Formato invalido")
    } catch (e: IllegalArgumentException) {
        println("Deve digitar uma nota maior que 10 ou menor que 0")
    }


}
