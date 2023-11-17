//https://www.programiz.com/kotlin-programming/examples/fibonacci-series
fun main(args: Array<String>) {
    val n = 8
    var t1 = 1
    var t2 = 1

    print("First $n terms: ")

    for (i in 1..n) {
        print("$t1 + ")

        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
}