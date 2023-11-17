fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    val myArray = arrayOf(1, 2, 3, 4, 5)
    //println(myArray)

    for (i in myArray.indices) {
        println(myArray[i])
    }

    fun isEven (number: Int): Boolean { return number % 2 == 0 }
    println(isEven(4))
}



