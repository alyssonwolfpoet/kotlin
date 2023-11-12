fun vetor_inteiros(){
    var numeros = intArrayOf(0,1,2,3,4,5,6,7,8,9)
    for (i in 0..numeros.size-1){
        print("${numeros[i]} ")
    }
    print("\n")
}
fun vetor_inteiros2(){
    var n = Array(10,{i->i})
    for (i in 0..n.size-1){
        print("${n[i]} ")
    }
    print("\n")
}
fun main() {
    vetor_inteiros()
    vetor_inteiros2()
}