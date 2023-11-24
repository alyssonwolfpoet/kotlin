package atividadesPraticas2

fun main() {
    val a:Int
    val b:Int

    try {
        print("digite o 1ª numero inteiro: ")
        a = readlnOrNull()?.toInt()!!
        print("digite o 2ª numero inteiro: ")
        b = readlnOrNull()?.toInt()!!

        println(a/b)
    }catch (e:ArithmeticException){
        println("Erro: Divisão por 0 nao existe")
    }catch (e: IllegalArgumentException){
        println("Erro: argumento invalido")
    } catch (e: Exception){
        println("Erro")
    }

}