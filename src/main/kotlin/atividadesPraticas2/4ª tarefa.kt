package atividadesPraticas2

fun main() {
    val salarioMinimoAtual = 1320
    try {
        println("Informe seu salário bruto:")
        var salarioBruto = readlnOrNull()?.toDouble()!!
        println("Salário Bruto informado: R$$salarioBruto")
        println("Desconto: ")
        if (salarioBruto > 6000) {
            println((salarioBruto / 100) * 11)
        } else if (salarioBruto > 3000) {
            println((salarioBruto / 100) * 7.5)
        } else if (salarioBruto <= 3000) {
            println((salarioBruto / 100) * 4.0)
        } else if (salarioBruto < salarioMinimoAtual) {
            throw IllegalArgumentException()
        }

    } catch (e: NumberFormatException) {
        println("formato não é um número")
    } catch (e: IllegalArgumentException) {
        println("O salário deve ser no mínimo igual a $salarioMinimoAtual")
    }
}