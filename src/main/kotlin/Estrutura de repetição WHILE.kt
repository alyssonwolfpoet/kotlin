fun main() {
    var i = 0
    while (i<=10){
        print("${i} ")
        //i++ // i = i+1
        i+=1
    }
    print("\n")
    print(i)
    print("\n")
    while (i>=0){
        print("${i} ")
        i-=1
    }
    print("\n")
    print(i)
    print("\n")

    var str = "Curso show"
    var j=0
    while (j<str.length){
        print("${j} ")
        j++
    }
    print("\n ${str[0]}")
    print("\n ${str.length}")
}