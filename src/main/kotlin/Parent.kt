open class Parent(_name: String, _id: Int) {
    private val name: String
    private val id: Int
    private var password: String

    init {
        this.name = _name
        this.id = _id
        this.password = "0000"
    }

    constructor(_name: String, _id: Int, _password: String = "0000") : this(_name, _id) {
        this.password = _password
    }
}