package atividadesPraticas2

import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner

fun main() {

    var arquivo = File("C:\\Users\\Alysson\\IdeaProjects\\kotlin\\src\\main\\kotlin\\atividadesPraticas2\\strings.txt")
    try {
        Scanner(arquivo).use { l->
            while (l.hasNext()){
                println(l.next())
            }
            l.close()
        }
    }catch (e:FileNotFoundException){
        println("erro na leitura do arquivo")
    }
}