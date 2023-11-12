fun vetor_inteiros(){
    var numeros = intArrayOf(0,1,2,3,4,5,6,7,8,9)
    for (i in 0..numeros.size-1){
        print("${numeros[i]} ")
    }
    print("\n")
    println("Acessando a sexta posição: ${numeros[6]} ")
}
fun vetor_inteiros2(){
    var n = Array(10,{i->i})
    for (i in 0..n.size-1){
        print("${n[i]} ")
    }
    print("\n")
}
fun vetor_bool(){
    var a = booleanArrayOf(true,false,true,true,true,false)
    for (i in 0..a.size-1){
        print("${a[i]} ")
    }
    print("\n")
}
fun vetor_str(){
    var a = arrayOf("Fortaleza","São paulo","bonito")
    for (i in 0..a.size-1){
        print("${a[i]} ")
    }
    print("\n")
    println("Acessando o primeiro elemento: ${a[0]}")
}
fun vetor_char(){
    var a = arrayOf("a","b","c")
    for (i in 0..a.size-1){
        print("${a[i]} ")
    }
    print("\n")
    println("Acessando o primeiro elemento: ${a[0]}")
}
fun vetor_float(){
    var a = floatArrayOf(0.0f,1.1f,2.2f)
    for (i in 0..a.size-1){
        print("${a[i]} ")
    }
    print("\n")
    println("Acessando o primeiro elemento: ${a[0]}")
}
fun main() {
    vetor_inteiros()
    vetor_inteiros2()
    vetor_bool()
    vetor_str()
    vetor_char()
    vetor_float()
}