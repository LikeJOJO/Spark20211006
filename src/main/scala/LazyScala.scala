object LazyScala {
  def main(args: Array[String]): Unit = {
//    def concat(first: String, last: String): String = {
//      println("Look at me")
//      first + " " + last
//    }
//
//    lazy val fullname = concat("l", "rn")
//    println(fullname)

    println(new Girl().age)
    println(new Girl().name)
  }
}

class Girl {
  var name: String = _
  var age: Int = _
}

