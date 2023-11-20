fun main() {
    var str:String? = null
    // str = "Felipe"
    if (str == null){
        println("Variável nula")
    }else{
        println(str)
    }
    // Operador Elvis
    println(str ?: "nula") // O Operador Elves lembra o operador ternário
}