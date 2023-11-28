package KotlinControlesdeFluxo

fun main() {
    // Classifique as pessoas através da faixa etária
    // idoso - 60 anos acima | Adulto entre 21 a 59 anos | Jovem Entre 12 a 20 anos | Criança 12 anosou abaixo
    var idade=1

    if (idade>=60){
        println("Essa Pessoa é idosa")
    }else if (idade<=59 && idade>=21){
        println("Essa pessoa é adulta")
    }else if (idade<=20 && idade>=13){
        println("Essa pessoa é jovem")
    }
    else{
        println("Essa pessoa é criança")
    }
    //desafio inverter a logica comecando pela criança
    if (idade<=12){
        println("Essa pessoa é criança")
    }else if (idade<=20 && idade>=13){
        println("Essa pessoa é Jovem")
    }else if (idade<=59 && idade>=21){
        println("Essa pessoa é adulto")
    }
    else{
        println("Essa pessoa é Idoso")
    }
}