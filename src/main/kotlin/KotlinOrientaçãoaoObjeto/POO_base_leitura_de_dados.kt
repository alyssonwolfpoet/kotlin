package KotlinOrientaçãoaoObjeto

class Pessoa_(val ano_nas: Int, var nome: String) {
    var idade = 2023 - ano_nas
    fun saudacao() {
        println("Seja bem vindo ${this.nome}")
    }

    fun acordar(x: Boolean = true) {
        if (x == true) {
            println("O ${this.nome} está acordado")
        } else {
            println("O ${this.nome} está dormindo")
        }
    }
}

fun main() {
    println("Digite o ano que você nasceu:")
    var x = readlnOrNull()?.toInt() ?: 0
    println("Digite o seu nome completo:")
    var y = readln()
    println("Você está acordado:")
    //var d = readlnOrNull()?.toBoolean() ?: false
    var d = readln()
    var pessoa: Pessoa_ = Pessoa_(x, y)
    println(pessoa.ano_nas)
    println(pessoa.nome)
    println(pessoa)
    println("Você tem ${pessoa.idade} anos")
    pessoa.saudacao()
    if (d == "sim" || d == "SIM" || d == "Sim") {
        pessoa.acordar(true)
    } else if (d == "não" || d == "NÃO" || d == "Não") {
        pessoa.acordar(false)
    }
}