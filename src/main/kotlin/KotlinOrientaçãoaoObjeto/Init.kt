package KotlinOrientaçãoaoObjeto

class animal_(var especie: String) {
    var fala: String = ""

    init {
        fala = if (especie.lowercase() == "cachorro") {
            "auau"
        }else if (especie.lowercase()== "gato"){
            "miaumaiu"
        }else{
            ""
        }
    }
    init {
        println(fala)
    }

    fun falar(){
        println(fala)
    }
}

fun main() {

}