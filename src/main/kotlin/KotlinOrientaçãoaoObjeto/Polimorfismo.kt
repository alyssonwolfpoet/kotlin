package KotlinOrientaçãoaoObjeto
/*interface dev{ // Interface ou abstract
    var salario:Float
    fun bonus():Float
}
class mobile(override var salario: Float):dev{
    override fun bonus(): Float {
        return salario*0.7f
    }
}
class Game(override var salario: Float):dev{
    override fun bonus(): Float {
        return salario*0.6f
    }
}
class back(override var salario: Float):dev{
    override fun bonus(): Float {
        return salario*0.5f
    }
}*/
/*
//SEM POLIMORFISMO
fun mostrar_bonus(m:mobile){
    println(m.bonus())
}
fun mostrar_bonus(g:Game){
    println(g.bonus())
}
fun mostrar_bonus(b:back){
    println(b.bonus())
}
*/

//COM POLIMORFISMO
fun mostrar_bonus(d:dev){
    println(d.bonus())
}
fun main() {
    var x:dev = Game(5000f)
    println(x.salario)

    mostrar_bonus(back(1000f))
    mostrar_bonus(Game(1000f))
    mostrar_bonus(mobile(1000f))
}
abstract class dev(var salario:Float){ // Interface ou abstract
    abstract fun bonus():Float
}
class mobile(salario: Float):dev(salario){
    override fun bonus(): Float {
        return salario*0.7f
    }
}
class Game(salario: Float):dev(salario){
    override fun bonus(): Float {
        return salario*0.6f
    }
}
class back(salario: Float):dev(salario){
    override fun bonus(): Float {
        return salario*0.5f
    }
}
