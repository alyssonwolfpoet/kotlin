package KotlinControlesdeFluxo

fun main() {

    var cargo:String = "Presidente"
    when(cargo){
        "Presidente" -> println(6000f)
        "Gerente" -> println(4500f)
        "Coodenador" -> println(3000f)
        "Analista" -> println(2400f)
        "Estagiario" -> println(1600f)
        else -> println("Cargo não identificado")
    }

    var imc:Float = 30.0f
    when(imc){
        10f -> println("IMC está 10 ou abaixo")
        20f -> println("IMC está 20 ou maior que 11")
        30f -> println("IMC está 30 ou maior que 21")
        50f -> println("IMC está 50 ou maior que 31")
        else -> println("Imc esta acima do normal")
    }
}