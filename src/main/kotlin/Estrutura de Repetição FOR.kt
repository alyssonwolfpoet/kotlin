fun main() {
    for (i in 1..20){// Estrutua de repetição FOR crescente de 1 em 1
        print("${i} ")
    }
    print("\n")
    for (i in 20 downTo 1){// estrutura de repetição For Decrescente de 1 em 1
        print("$i ")
    }

    print("\n")
    var str = "Criação de aplicativos Android"
    for (i in str){
        print("${i} ")
    }

    print("\n")
    for (i in 1..20 step 2){// Estrutua de repetição FOR crescente de 1 em 1
        print("${i} ")
    }

    print("\n")
    for (i in 20 downTo 1 step 3){// estrutura de repetição For Decrescente de 1 em 1
        print("$i ")
    }

}