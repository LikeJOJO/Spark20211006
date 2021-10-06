object MeltyScala {
  def main(args: Array[String]): Unit = {
    def makeName(first: String, last: String): String = {
      first + last
    }

    def copy() = {
      makeName _
    }

    println(copy()("l", "rn"))

    def calc(a: Int, b: Int, f:(Int, Int) => Int): Int = {
      f(a,b)
    }

//    def sum(a: Int, b: Int): Int = {
//      a + b
//    }
//
//    def minus(a: Int, b: Int): Int = {
//      a - b
//    }
//
//    calc(6, 5, sum)
//    calc(6, 5, minus)
//    calc(6, 5, (a: Int, b: Int) => { a * b})
//    calc(6, 5, (a, b) => { a * b})
    calc(6, 5, _ * _)
  }
}
