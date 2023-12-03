package KotlinOrientaçãoaoObjeto

abstract class mamifero(var nome:String){ // classe abstrata serve somente para herdar a outras classes.
    abstract fun habitat()
    abstract fun acorda()
    abstract fun fale()
    abstract fun alimentacao()
     fun tempo() {
        println("tempo de vido do mamifero")
    }
}
class dog(nome:String):mamifero(nome){
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
}
fun main() {
    //var m : mamifero = mamifero("gato")
    var d:dog = dog("cachorro")
    d.tempo()
    d.acorda()
    d.fale()
    d.habitat()
    d.alimentacao()
}