package KotlinOrientaçãoaoObjeto

class Matematica(){
     // escopo classe e escorpo obejct
    companion object M{ // scorpo classe
        val PI = 3.1415
         fun adc(){

         }
         init {
             println("Iniciando companion")
         }
    }
    object objet01{
        val euler = 0.03
        val PI = 3.1415
        fun adc(){}
        init {
            println("Iniciando objeto 01")
        }
    }
    object objet02{
        val dourado= 1.61
        val PI = 3.1415
        fun adc(){}
        init {
            println("Iniciando objeto 02")
        }
    }
    object objet03{
        val t = 8
        val PI = 3.1415
        fun adc(){}
        init {
            println("Iniciando objeto 03")
        }
    }
}

fun main() {
    //println(Matematica.PI)
    var m : Matematica = Matematica();
    //m.adc()
    println("Acessando objeto 01 ${Matematica.objet01.euler}")
    println("Acessando objeto 02 ${Matematica.objet02.dourado}")
    println("Acessando objeto 03 ${Matematica.objet03.t}")
    Matematica.PI // Companion
    Matematica.PI // objeto 02
    Matematica.PI // objeto 03
    Matematica.PI // nao imprimi
    Matematica.PI // nao imprimi
    Matematica.PI //
}