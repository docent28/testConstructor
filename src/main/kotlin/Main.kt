open class Base(name: String, age: Int) {
    constructor(name: String, age: Int, weight: Int) : this(name, age)
}
//open class Base {
//    constructor(name: String, age: Int)
//    constructor(name: String, age: Int, weight: Int) : this(name, age)
//}

//  Пример 1
class CurrentOne(name: String, age: Int) : Base(name, age) {
    // constructor(name: String, age: Int, weight: Int): super(name, age, weight) // ошибка
}

//  Пример 2
class CurrentTwo(name: String, age: Int, weight: Int) : Base(name, age, weight) {
    // constructor(name: String, age: Int): super(name, age) // ошибка
}

//  Пример 3
class CurrentThree : Base {
    constructor(name: String, age: Int) : super(name, age)
    constructor(name: String, age: Int, weight: Int) : super(name, age, weight)
    constructor(name: String, age: Int, weight: Int, salary: Double) : super(name, age, weight)
    constructor(name: String, age: Int, weight: Int, auto: String) : this(name, age, weight)
}

fun main() {}
