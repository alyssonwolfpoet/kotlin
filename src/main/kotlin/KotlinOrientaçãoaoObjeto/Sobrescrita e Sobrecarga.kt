package KotlinOrientaçãoaoObjeto

open class eletronicos(var marca:String){
    private fun corrente(ativo:Boolean){

    }
    open fun ligar(){
        corrente(true)
    }
    open fun desligar(){
        corrente(false)
    }
}

class PC(marca: String):eletronicos(marca){
    fun salvar(){
    }

    override fun desligar() {
            salvar()
            super.desligar()
    }

    override fun ligar() {
        super.ligar()
    }

}
class SmartTv(marca: String):eletronicos(marca){
    override fun ligar() {
        super.ligar()
    }

    override fun desligar() {
        super.desligar()
    }
}

fun salvar(){}
fun salvar(a:Int){}
fun salvar(a:Int, b:Int){}
fun salvar(a:String, b:Int){}
fun main() {
    var pc =PC("Dell")
    pc.ligar()
    pc.salvar()
    pc.desligar()
}