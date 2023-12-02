package KotlinOrientaçãoaoObjeto

//private, publico, protected

private class F(){ // Estara disponivel somente no arquivo
    var teste= "Classe F"
}
open class Eletronico2(marca: String) {
    private fun ativarCorrente(){ // Está disponivel somente na classe a que pertence

    }
    protected fun relogio(){ // Está disponivel a classes que sao herdadas
        println("Função relogio")
    }
    fun ligar() {
            println("Está ligado")
    }

    fun desligar() {
        println("Está desligado")
    }
    var modelo: String = "Teste de herança"
    private var F:String = "testeando..." // Está disponivel somente na classe a que pertence
}

class Computador2(marca: String) : Eletronico2(marca) {
    fun InstalarSoftware() {
        println("Instalando softawere no computador")
        relogio()
    }

    fun Varredura() {
        println("Realizando varredura no computador")
    }
}

fun main() {
    var c: Computador2 = Computador2("Dell")
    c.ligar()
    c.desligar()
    c.Varredura()
    c.InstalarSoftware()
    println(c.modelo)
    //c.F
    //c.arivarCorrente()
    var t:F =F()
    println(t.teste)
    //c.relogio()


}