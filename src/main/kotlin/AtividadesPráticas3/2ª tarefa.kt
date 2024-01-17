package AtividadesPráticas3

class Carros(var consumodegasolina:Int,var cor:Int,var tipodomotor:Int,var marca:Int, var odômetro:Float ,var modelo:Int)  {
    private val modelos = arrayOf("Chevrolet Onix","Volkswagen Gol","Hyundai HB20")
    private val cores = arrayOf("azul","prata","preto")
    private val marcas = arrayOf("chevrolet","fiat","hyundai")
    private val tiposMotores = arrayOf("1.0 MT","TotalFlex com 3 cilindros em linha e 4 válvulas por cilindro","1.0 aspirado de três cilindros com 80 cv de potência ")

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
        return "\nmarca: ${marcas.get(marca)} \nmordelo: ${modelos.get(modelo)} \ncor: ${cores.get(cor)} \ntipo do motor: ${this.tiposMotores[tipodomotor]} \nodometro:  ${odômetro}"
    }

    companion object{
        var melhorcarror: String? = null
        var melhorConsumo:Int? = null

        fun printMelhor(){
            println(melhorcarror)
        }

    }

    private fun MelhorCarro(consumodegasolinaaux:Int){
        if (melhorcarror == null && melhorConsumo == null ){
            melhorConsumo = consumodegasolinaaux
            melhorcarror = dadosCarro()
        }
        else if (consumodegasolinaaux < melhorConsumo!!){
            melhorConsumo = consumodegasolinaaux
            melhorcarror = dadosCarro()
        }
    }
    init {
        println(consumo(consumodegasolina))
        println()
        MelhorCarro(consumodegasolina)

    }
}

fun main() {
    var car1:Carros = Carros(15,1,1,1,10f,1)
    var car2:Carros = Carros(7,2,2,2,0f,2)
    var car3:Carros = Carros(50,3,3,3,0f,3)

    Carros.printMelhor()
}