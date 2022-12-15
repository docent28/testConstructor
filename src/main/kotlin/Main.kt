fun main() {
    val myClassZero = MyClass()
    val myClassOne = MyClass("Волга", 3102)
    val myClassTwo = MyClass("audi", 78, "pass0101")

    println("myClassZero = ${myClassZero.name} ${myClassZero.id} ${myClassZero.password}")
    println("myClassOne = ${myClassOne.name} ${myClassOne.id} ${myClassOne.password}")
    println("myClassTwo = ${myClassTwo.name} ${myClassTwo.id} ${myClassTwo.password}")
}
