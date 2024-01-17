package AtividadesPráticas3

class Animal(val nome:String,val tipo:String,val fala:String,val idade:Int) {

    fun  printAnimal(){
        println("Nome: ${this.nome}\nTipo: ${this.tipo}\nFala: ${this.fala}\nIdade: ${this.idade}\n")
    }
    fun contaAnimal() {
        println("numeros de animais: $Nanimal")
    }
    fun animalfalar(){
        println("Animal: $nome falando: $fala")
    }

    companion object {
        var Nanimal: Int =0
    }
    init {
        Nanimal++
        toString()
    }


    override fun toString(): String {
        return contaAnimal().toString() + printAnimal()
    }
}

fun main() {
    var a1 = Animal("cahorro","terreste","auau",15)
    var a2 = Animal("gato","terreste","miau",10)
    a1.animalfalar()
    a2.animalfalar()
}