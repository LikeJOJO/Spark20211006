package toBeDeleted

trait TKiss {
    def justForYou(name: String, age: Int)(op: => Unit) = {
        println(s"${name} is ${age} years old.")
        try {
            op
        } catch {
            case e : Exception => println(e.getMessage)
        }
    }
}
