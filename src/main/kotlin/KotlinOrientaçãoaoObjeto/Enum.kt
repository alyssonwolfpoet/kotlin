package KotlinOrientaçãoaoObjeto

enum class Prioridade {
    Baixa, Media, Alta
}

enum class Animais {
    gato, cachorro, tucano, papagaio, leopardo
}

enum class Prioridade2(val v: Int) {
    B(0), M(7), A(10)
}

enum class Prioridade3(val value: Int) {
    A(10) {
        override fun toString(): String {
            return "Prioridade Alta com o valor $value"
        }
    },
    M(5) {
        override fun toString(): String {
            return "Prioridade Média com o valor $value"
        }
    },
    B(0) {
        override fun toString(): String {
            return "Prioridade Baixa com o valor $value"
        }
    }
}

fun x(p: Prioridade) {

}

fun main() {
    x(Prioridade.Alta) // forma de acessar um valor de uma clase do tipo enum
    for (p in Prioridade.entries) {
        print("$p ")
    }
//    for (p in Prioridade.values()){
//        print("$p ")
//    }
    println()
    for (p in Animais.values()) {
        print("$p ")
    }
    println()
    for (p in Prioridade2.entries) {
        print("${p.v} ")
    }
    println()
    for (p in Prioridade3.entries) {
        println("$p ")
    }
}