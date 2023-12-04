package KotlinOrientaçãoaoObjeto

interface Evento {
    fun ok() {

    }
}

class Programa() {
    fun salvar(e: Evento) {
        println("Abrindo arquivos")
        println("Salvando valores")
        println("Salvando arquivos")
        println("Conexõe realizadas")
        e.ok()
    }

}
/*
class Event() : Evento {
    override fun ok() {
        println("Programa está ok")
    }

}*/
fun main() {
    val p: Programa = Programa()
    //val e: Event = Event()
    p.salvar(object :Evento{
        override fun ok() {
            println("Programa está ok")
        }
    })
}