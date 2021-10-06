package first

object ThirdKiss {
    var name: String = _

    def sayHi() = {
        println("Object.sayHi")
    }

    def sayHi(name: String) = {
        println("Object.sayHiWithName")
    }
}

class ThirdKiss {
    var age: Int = _

    def sayHi() = {
        println("Class.sayHi")
    }

    def sayHi(name: String) = {
        println("Class.sayHiWithName")
    }
}
