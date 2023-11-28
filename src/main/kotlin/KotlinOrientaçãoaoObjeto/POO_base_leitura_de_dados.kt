package KotlinOrientaçãoaoObjeto

class Pessoa(val ano_nas:Int,var nome:String){
    var idade = 2023 - ano_nas
    fun saudacao(){
        println("Seja bem vindo ${this.nome}")
    }
    fun acordar(x:Boolean = true){
        if (x == true){
            println("O ${this.nome} está acordado")
        }else{
            println("O ${this.nome} está dormindo")
        }
    }
}

fun main() {
    var pessoa:Pessoa = Pessoa(1998,"Max")
    println(pessoa.ano_nas)
    println(pessoa.nome)
    println(pessoa)
    println("Você tem ${pessoa.idade} anos")
    pessoa.saudacao()
    pessoa.acordar()
    pessoa.acordar(true)
    pessoa.acordar(false)
}