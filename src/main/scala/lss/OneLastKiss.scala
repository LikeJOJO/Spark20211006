package lss

object OneLastKiss {
  def main(args: Array[String]): Unit = {
    val lisusu = new User("lisusu")
    lisusu.name
  }
}

class User(var name: String) {
  println(name)
}

class Father(name: String) {

}

class Son(name: String) extends Father(name) {

}

abstract class Graphic {
  var name: String
}