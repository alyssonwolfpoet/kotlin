fun main() {
    val vetor = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i in vetor.indices) {
        if (vetor[i] % 2 == 1) {
            continue;
        }
        else
        print ("${vetor[i]}")
        }
    }
