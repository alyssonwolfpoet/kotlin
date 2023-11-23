package `Atividades práticas`

fun vetor(double: Double): String {
    var vetor = doubleArrayOf(1.0, 2.1, 3.2, 4.0, 5.0, 6.7, 7.9, 8.8, 9.0, 10.0)
    for (i in 0 until vetor.size) {
        if (vetor[i] == double) {
            return "Elemento ${double} achado"
        }
    }
    return "Elemento ${double} não achado"
}

fun main() {
    println(vetor(10.0))
}