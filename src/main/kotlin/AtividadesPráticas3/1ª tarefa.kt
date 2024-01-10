package AtividadesPráticas3

class Animal(val nome:String,val tipo:String,val fala:String,val idade:Int) {
    fun  printAnimal(){
        println("Nome: ${this.nome}\nTipo: ${this.tipo}\nFala: ${this.fala}\nIdade: ${this.idade}")
    }
}

fun main() {
    var a1 = Animal("cahorro","terreste","auau",15)
    a1.printAnimal()
}