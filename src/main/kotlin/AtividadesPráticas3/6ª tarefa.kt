package AtividadesPráticas3

// 6ª tarefa: Formas Geométricas
// Classe abstrata Forma com método abstrato calcular_area()
abstract class Forma {
    abstract fun calcular_area(): Double
}

// Classe Quadrado que herda de Forma e implementa o método calcular_area()
class Quadrado(val lado: Double): Forma() {
    init {
        // Verifica se o lado é positivo, senão lança uma exceção
        if (lado <= 0) throw IllegalArgumentException("Entrada inválida")
    }
    override fun calcular_area(): Double {
        // A área do quadrado é o lado ao quadrado
        return lado * lado
    }
}

// Classe Círculo que herda de Forma e implementa o método calcular_area()
class Circulo(val raio: Double): Forma() {
    init {
        // Verifica se o raio é positivo, senão lança uma exceção
        if (raio <= 0) throw IllegalArgumentException("Entrada inválida")
    }
    override fun calcular_area(): Double {
        // A área do círculo é pi vezes o raio ao quadrado
        return Math.PI * raio * raio
    }
}

// Classe Triangulo que herda de Forma e implementa o método calcular_area()
class Triangulo(val a: Double, val b: Double, val c: Double): Forma() {
    init {
        // Verifica se os lados são positivos, senão lança uma exceção
        if (a <= 0 || b <= 0 || c <= 0) throw IllegalArgumentException("Entrada inválida")
        // Verifica se os lados obedecem à regra de existência do triângulo, senão lança uma exceção
        if (a >= b + c || b >= a + c || c >= a + b) throw IllegalArgumentException("Os lados informados não compõem um triângulo")
    }
    override fun calcular_area(): Double {
        // Se o triângulo for equilátero, usa a fórmula simplificada
        if (a == b && b == c) {
            return a * a * Math.sqrt(3.0) / 4
        }
        // Senão, usa a fórmula de Heron
        val p = (a + b + c) / 2 // Semiperímetro
        return Math.sqrt(p * (p - a) * (p - b) * (p - c)) // Área
    }
}

// Função principal para testar as classes
fun main() {
    // Cria objetos das classes derivadas
    val quadrado = Quadrado(5.0)
    val circulo = Circulo(3.0)
    val triangulo = Triangulo(3.0, 4.0, 5.0)

    // Calcula e imprime as áreas
    println("A área do quadrado é ${quadrado.calcular_area()}")
    println("A área do círculo é ${circulo.calcular_area()}")
    println("A área do triângulo é ${triangulo.calcular_area()}")
}


