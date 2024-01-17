package AtividadesPráticas3

import AtividadesPráticas3.Carros.Companion.melhorcarror

class Carros(var consumodegasolina:Int,var cor:Int,var tipodomotor:Int,var marca:Int, var odômetro:Float ,var modelo:Int)  {
    private val modelos = arrayOf("Chevrolet Onix","Volkswagen Gol","Hyundai HB20")
    private val cores = arrayOf("azul","prata","preto")
    private val marcas = arrayOf("chevrolet","fiat","hyundai")
    private val tiposMotores = arrayOf("1.0 MT","TotalFlex com 3 cilindros em linha e 4 válvulas por cilindro","1.0 aspirado de três cilindros com 80 cv de potência ")
    private var estecarro:Int? = null
    private fun consumo(consumodegasolina: Int): String {
        if (this.consumodegasolina ==15){
            return "o modelo do carro (escolhido por você): ${dadosCarro()} \nStatus:é econômico."
        }
        else if (this.consumodegasolina < 15){
            return "o modelo do carro  (escolhido por você): ${dadosCarro()}  \nStatus: é de um consumo padrão alto"
        }
        else{
            return "invalido"
        }
    }

    private fun dadosCarro():String{
        return "\nmarca: ${marcas.get(marca)} \nmordelo: ${modelos.get(modelo)} \ncor: ${cores.get(cor)} \ntipo do motor: ${tiposMotores.get(tipodomotor)} \nodometro:  ${odômetro}"
    }

    companion object{
        var quant:Int = 0
        var melhorcarror:Int = 0
        var melhorConsumo:Int = 0

    }

    private fun MelhorCarro(var estecarroaux:Int,var consumodegasolinaaux:Int){
        if (consumodegasolinaaux < melhorConsumo){
            melhorConsumo = consumodegasolinaaux
            melhorcarror = estecarroaux
        }
    }
    init {
        estecarro = ++quant
        println(consumo(consumodegasolina))
        println()
        MelhorCarro(estecarro!!,consumodegasolina)

    }
}

fun main() {
    var car1:Carros = Carros(15,1,1,1,10f,1)
    var car2:Carros = Carros(7,2,2,2,0f,2)
    var car3:Carros = Carros(50,3,3,3,0f,3)
}