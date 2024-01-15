package AtividadesPráticas3

class Animal(val nome:String,val tipo:String,val fala:String,val idade:Int) {
    fun  printAnimal(){
        println("Nome: ${this.nome}\nTipo: ${this.tipo}\nFala: ${this.fala}\nIdade: ${this.idade}")
    }

    companion object {
        var Nanimal:Int = 0
        fun contaAnimal(Nanimal:Int){
            println(" numeros de animais: ${++this.Nanimal}")
        }
        init {
            contaAnimal(Nanimal)
        }
    }

}

fun main() {
    var a1 = Animal("cahorro","terreste","auau",15)
    var a2 = Animal("gato","terreste","miau",10)
    a1.printAnimal()
    a2.printAnimal()
}