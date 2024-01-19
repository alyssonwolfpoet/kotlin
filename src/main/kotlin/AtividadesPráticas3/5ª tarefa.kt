// Declaração da classe Aluno com o construtor primário que recebe os parâmetros nome e matricula
class Aluno(private val nome: String, private val matricula: Int) {
    // Declaração do atributo notas como uma lista mutável de números reais
    private val notas = mutableListOf<Double>()

    // Método para adicionar uma nota à lista de notas, verificando se ela está entre 0 e 10
    fun adicionar_nota(nota: Double) {
        if (nota in 0.0..10.0) {
            notas.add(nota)
        } else {
            // Lança uma exceção se a nota for inválida
            throw IllegalArgumentException("Erro ao digitar as notas")
        }
    }

    // Método para obter o nome do aluno
    fun get_nome(): String {
        return nome
    }

    // Método para obter a matrícula do aluno
    fun get_matricula(): Int {
        return matricula
    }

    // Método para calcular a média das notas do aluno
    fun get_media(): Double {
        // Verifica se a lista de notas não está vazia
        if (notas.isNotEmpty()) {
            // Soma todas as notas e divide pelo tamanho da lista
            return notas.sum() / notas.size
        } else {
            // Retorna zero se a lista estiver vazia
            return 0.0
        }
    }
}

// Função principal para testar a classe Aluno
fun main() {
    // Cria um objeto da classe Aluno com o nome "João" e a matrícula 123
    val aluno = Aluno("João", 123)

    // Adiciona quatro notas ao aluno
    aluno.adicionar_nota(8.0)
    aluno.adicionar_nota(7.5)
    aluno.adicionar_nota(6.0)
    aluno.adicionar_nota(9.0)

    // Obtém o nome, a matrícula e a média do aluno
    val nome = aluno.get_nome()
    val matricula = aluno.get_matricula()
    val media = aluno.get_media()

    // Imprime as informações do aluno
    println("Nome: $nome")
    println("Matrícula: $matricula")
    println("Média: $media")

    // Verifica se o aluno está aprovado, em recuperação ou reprovado
    when {
        media >= 7.0 -> println("$nome aprovado, parabéns!")
        media >= 4.0 -> println("$nome está em processo de recuperação")
        else -> println("O $nome está reprovado")
    }
}
