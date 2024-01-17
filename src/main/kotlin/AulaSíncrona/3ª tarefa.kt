package AulaSíncrona

class ContaBancaria(private var titular: String, private var saldo: Float) {
    var lim = 0.0f
    fun getSaldo() {
        println("\nOlá, ${titular}, seu saldo é: ")
        print("%.2f".format(saldo))
        println()
    }

    fun depositar(deposito: Float) {
        lim = 10000f
        if (deposito > lim) {
            println(
                "O limite de depósito foi atingido, realize-o com um valor menor ou igual a R$10000, 00"
            )
            println()
        } else {
            println("\nRealizando depósito")
            ajustarSaldo(deposito)
        }
    }

    fun sacar(saque: Float) {
        lim = 50000f
        if (saque > lim) {
            println("O limite de saque foi atingido, realize-o com um valor menor ou igual a R$50000, 00")
            println ()
        } else {
            if (saque > saldo) {
                println("O valor do saque é maior que o saldo na conta.")
            } else if (saque == saldo) {
                println("A sua conta está zerada.")
                ajustarSaldo(-saque)
            } else {
                println("\nRealizando saque")
                ajustarSaldo(-saque)
            }
        }
    }

    private fun ajustarSaldo(valor: Float) {
        saldo += valor
    }
}

fun main() {
    println("Qual é o seu nome?")
    val name: String = readln()
    println("Com qual valor iremos iniciar")
    val value: Float = readlnOrNull()?.toFloat() ?: 0.0f
    val p = ContaBancaria(name, value)
    while (true) {
        println("Digite uma das opções abaixo para sua conta")
        println("1 - Depositar")
        println("2 - Sacar")
        println("3 - Saldo")
        println("4 - Sair")
        val x: Int = readlnOrNull()?.toInt() ?: 0
        if (x == 1) {
            println("Digite o valor do depósito")
            val y: Float = readlnOrNull()?.toFloat() ?: 0.0f
            p.depositar(y)
        } else if (x == 2) {
            println("Digite o valor do saque")
            val y: Float = readlnOrNull()?.toFloat() ?: 0.0f
            p.sacar(y)
        } else if (x == 3) {
            p.getSaldo()
        } else {
            break
        }
    }
}