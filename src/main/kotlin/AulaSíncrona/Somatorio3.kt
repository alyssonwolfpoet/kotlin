package Aula02
// TRATAMENTO DE DADOS
fun verify_(ini:Int, fim:Int, razao:Int):Int{
    val x = (fim-ini)%razao // == 0 existe PA, senao == Não existe PA
        if(x != 0){
            throw Exception("Não podemos realizar o cálculo com exatidão!")
        }
    return ((ini+fim)*((fim - ini +razao)/razao))/2 // O(1)
}

fun main() {
    var ini=1
    var fim=100
    var razao =3
        try {
            val res = verify_(ini,fim,razao)
            println(res)
        }catch (e: Exception){
            println(e.message)
        }
}

// soma dos termos de uma PA: ((ini+fim)*n)/2
// Enésimo termo de uma PA: fim = ini + (n-1)* razao
// fim -ini = n *razao - razao
// fim - ini + razao = n * razao
// (fim - ini +razao)/razao = n
