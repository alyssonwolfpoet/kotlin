package KotlinOrientaçãoaoObjeto


interface Selvagem{
     fun atacar(){
         println("O animal está preste a atacar")
     }
}

interface quarto_patas{
    fun locomocao(){
        println("O animal se locomove me quarto patas")
    }
}
abstract class mamifero2(var nome:String){ // classe abstrata serve somente para herdar a outras classes.
    abstract fun habitat()
    abstract fun acorda()
    abstract fun fale()
    abstract fun alimentacao()
     fun tempo() {
        println("tempo de vido do mamifero")
    }
}
class dog2(nome:String):mamifero2(nome),Selvagem ,quarto_patas{
    override fun acorda() {
        println("Cachorro está acordando")
    }

    override fun alimentacao() {
        println("Cachorro come ração")
    }

    override fun fale() {
        println("au au")
    }

    override fun habitat() {
        println("casinha do cachorro")
    }

    override fun atacar() {
        println("O cachorro está atacando")
    }

    override fun locomocao() {
        println("O cachorro locamove me quarto patas")
    }
}
fun main() {
    //var m : mamifero = mamifero("gato")
    var d:dog2 = dog2("cachorro")
    d.tempo()
    d.acorda()
    d.fale()
    d.habitat()
    d.alimentacao()
    d.atacar()
    d.locomocao()
}