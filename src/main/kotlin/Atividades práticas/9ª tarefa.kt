package `Atividades práticas`

fun MinuToHoraminuto(minutos:Int){
    var hora:Int = minutos/60
    var minuto = minutos%60
    println("${hora}:${minuto}")
}
fun HoraToHoraminuto(horas: Int){
    var hora:Int = horas
    var minuto = horas/60
    println("${hora}:${minuto}")
}
fun main() {
    MinuToHoraminuto(90)
    HoraToHoraminuto(3)
}