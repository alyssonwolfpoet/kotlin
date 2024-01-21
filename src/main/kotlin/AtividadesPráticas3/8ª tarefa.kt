package AtividadesPráticas3


class Funcionario(private val nome: String, private var salario: Double, private var matrícula: Int, private var cargo: String) {
    fun get_nome(): String {
        return nome
    }

    fun get_salario(): Double {
        return salario
    }

    fun get_cargo(): String {
        return cargo
    }

    fun get_matricula():Int{
        return matrícula
    }

    fun set_matricula(value:Int){
        matrícula = value
    }

    private fun aumentar_salario(percentual: Double) {
        salario = (get_salario() * (percentual/100)) + get_salario()
    }

    private fun promover(novo_cargo:String) {
        cargo = novo_cargo
    }

    init {
        println(toString())
        println("usuario foi promovido?:")
        var aux:String = readln()
        if (aux == "s" || aux == "sim"){
            println("Nova cargo:")
            var auxcargo = readLine().toString()
            promover(auxcargo)
            println("porcenagem do aumento:")
            var auxAumento = readln().toDouble()
            aumentar_salario(auxAumento)
            println("Nova matricula:")
            var auxM:Int = readLine()?.toInt() ?: 0
            set_matricula(auxM)
            println("===============novos dados============")
            println(toString())
        }

    }

    override fun toString(): String {
        return "Nome: ${get_nome()}\nSalario: ${get_salario()}\nMatricula: ${get_matricula()}\nCargo: ${get_cargo()}"
    }

}

fun main() {
    val a:Funcionario = Funcionario("Alsson",4500.0,1,"dev mobile",)
}