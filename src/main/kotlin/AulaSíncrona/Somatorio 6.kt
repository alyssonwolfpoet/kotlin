package Aula02

fun main() { // Somatório - Gauss - PA - BIG O
    var ini=1
    var fim=10
    var razao = 1
    var soma=0
        for (i in ini .. fim step razao){
            soma+=i // O(n)
            print("${i} ")
        }
    println()
    println(soma)
    // Eficiência = Resolver o problema por inteiro.
    // Perfomance = Deixar o algoritmo em um menor tempo possível.

}

// - PENSAMENTO COMPUTACIONAL -
// 1) Abstração = Priorizar alguma informação do problema.
// 2) Reconhecimento de Padrões = Determinar elementos comuns (Repetição, Grandeza, lei de formação, ou similares).
// 3) Algoritmo = Cumprir as etapas de solução do problema.
// 4) Decomposição = Subdividir meu problema maior em problemas menores.

/*
* 1 2 3
* 4 5 6
* 7 8 9
* Como pegar os elementos da diagonal principal? = (i == j)
* Como pegar os elementos da diagonal secundária? = (i+j == n-1)
* */