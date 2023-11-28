package KotlinTratamentodeDados

import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner

fun ler_arquivo(){
    val arquivo = File("C:\\Users\\Alysson\\IdeaProjects\\kotlin\\src\\main\\kotlin\\Kotlin - Tratamento de Dados\\Passo a passo.txt")
    try {
        Scanner(arquivo).use {l ->
            while (l.hasNext()){
                println(l.next())
            }
            l.close()
        }
    }catch (e:FileNotFoundException){
        println("Falha ao ler o arquivo")
        //e.printStackTrace();
    }
}
fun main() {
    ler_arquivo()
}