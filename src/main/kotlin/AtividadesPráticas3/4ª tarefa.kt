package AtividadesPráticas3

class Produto (){
    private lateinit var nome: String
    private var preco: Float = 0.0f
    private var qtd_estoque: Int = 0

    fun get_nome():String {
        return nome
    }

    fun get_preco():Float {
        return preco
    }

    fun get_estoque():Int {
        return qtd_estoque
    }

    fun atualizar_preco(novo_preco:Float) {
        preco = novo_preco
    }

    fun atualizar_estoque(quantidade:Int) {
        if (qtd_estoque - quantidade < 0)
            println("cuidado deixara o estoque negativo")
        else {
            qtd_estoque -= quantidade
        }

        if (qtd_estoque <= 5){
            println("Produto em quantidade baixa, fazer novo pedido com urgência")
        }

        if (qtd_estoque>100){
            preco = (preco * 0.4).toFloat()
            println("Quantidade alta do $nome, favor oferecer com 40% de desconto")
        }
    }

    init {
        println("Nome do produto:")
        nome = readln()
        println("Preço: ")
        preco = readlnOrNull()?.toFloat() ?: 0f
        println("quantidade: ")
        qtd_estoque = readln().toInt()

    }
}

fun main() {
    var p = Produto()
    p.atualizar_estoque(1010)
    p.atualizar_preco(120.0f)
}