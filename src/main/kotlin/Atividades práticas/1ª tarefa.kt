package `Atividades práticas`

fun Verificar_idade(idade: Int):String{
    if (idade>=18){
        return "maior ou igual a 18"
    }else(return "menor que 18")
}
fun ImpresaoIdade(idade: Int){
    println(Verificar_idade(idade))
}
fun Leridade() {
    print("digite sua idade: ")
    //var idade:Int = readLine()!!.toInt()
    var idade:Int = readln().toInt()
    ImpresaoIdade(idade)
}

fun main() {
    Leridade()
}