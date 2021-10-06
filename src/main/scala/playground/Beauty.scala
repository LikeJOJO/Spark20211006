package playground

object Beauty {
    def apply(name: String, age: Int): Beauty = {
        val lady = new Beauty()
        lady.name = name
        lady.age = age
        lady
    }
}

class Beauty() {
    var name: String = _
    var age: Int = _

    override def toString: String = s"${name} is ${age} years old."
}