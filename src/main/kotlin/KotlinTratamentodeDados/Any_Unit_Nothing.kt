package KotlinTratamentodeDados

fun main() {
    //Any Unit Nothing
    a(10.88888)
    b()
    //c()
}

fun a(valor: Any) {
    println("Imprimindo o valor: $valor")
}

fun b(): Unit {
    println("Função sem retorno (void)")
}

fun c(): Nothing {
    // TODO: ("Função ainda a ser completada")
    // A -> B
    return TODO("Provide the return value")
}
//fun save():Nothing{}
//fun update():Nothing{}