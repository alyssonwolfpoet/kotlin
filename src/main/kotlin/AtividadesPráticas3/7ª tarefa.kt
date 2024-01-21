package AtividadesPráticas3

// 7ª tarefa: Meios de Transporte Polimórficos
// Classe base MeioDeTransporte com método mover()
open class MeioDeTransporte {
    open fun mover() {
        println("O meio de transporte está se movendo")
    }
}

// Classe Carro que herda de MeioDeTransporte e sobrescreve o método mover()
class Carro: MeioDeTransporte() {
    override fun mover() {
        println("O carro está andando na estrada")
    }
}

// Classe Aviao que herda de MeioDeTransporte e sobrescreve o método mover()
class Aviao: MeioDeTransporte() {
    override fun mover() {
        println("O avião está voando no céu")
    }
}

// Classe Moto que herda de MeioDeTransporte e sobrescreve o método mover()
class Moto: MeioDeTransporte() {
    override fun mover() {
        println("A moto está correndo na pista")
    }
}

// Classe Jato que herda de MeioDeTransporte e sobrescreve o método mover()
class Jato: MeioDeTransporte() {
    override fun mover() {
        println("O jato está quebrando a barreira do som")
    }
}

// Classe Quadriciclo que herda de MeioDeTransporte e sobrescreve o método mover()
class Quadriciclo: MeioDeTransporte() {
    override fun mover() {
        println("O quadriciclo está atravessando o terreno")
    }
}

// Classe Bicicleta que herda de MeioDeTransporte e sobrescreve o método mover()
class Bicicleta: MeioDeTransporte() {
    override fun mover() {
        println("A bicicleta está pedalando na ciclovia")
    }
}

// Função para realizar o método mover() para todos os meios de transporte
fun moverTodos(vararg meios: MeioDeTransporte) {
    for (meio in meios) {
        meio.mover()
    }
}

// Função principal para testar as classes
fun main() {
    // Cria objetos das classes derivadas
    val carro = Carro()
    val aviao = Aviao()
    val moto = Moto()
    val jato = Jato()
    val quadriciclo = Quadriciclo()
    val bicicleta = Bicicleta()

    // Chama a função moverTodos() com os objetos criados
    moverTodos(carro, aviao, moto, jato, quadriciclo, bicicleta)
}