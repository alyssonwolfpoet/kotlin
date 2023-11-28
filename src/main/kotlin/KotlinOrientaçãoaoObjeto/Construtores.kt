package KotlinOrientaçãoaoObjeto

class Silvestre(var nome:String){
    //var atk: Int? = null
    var atk: Int = 0
    constructor(nome:String,atk:Int): this(nome){
        this.atk = atk
    }
    fun ap(){
        println("Meu animal silvestre é: $nome e seu ataque é: $atk")
    }
}
fun main() {
    val s1 = Silvestre("Águia")
    val s2 = Silvestre("Serpete",1000)
    s1.ap()
    s2.ap()

}