object KissScala {
  def main(args: Array[String]): Unit = {
    def love(name: String, age: Int, address: String = "beijing"): String = {
      name + age +address
    }

    val tempLove = love _
    tempLove
    tempLove("ss", 16, "china")

    def miss(): Unit = {
      print("miss")
    }

    val kiss: (String, Int, String) => String = love
    //val hate: Function0[Unit] = love _
    println(kiss("yjy", 18, ""))

    def calc(f: (Int, Int) => Int, a: Int, b: Int): Unit = {
      println(f(a, b))
    }

    def calculate(f: (String, String) => String, first: String, last: String): Unit = {
      println(f(first, last))
    }

    calculate((a: String, b: String) => {a + b}, "l", "rn")
    calculate((a, b) => {a + b}, "l", "rn")
    calculate((a, b) => a + b, "l", "rn")
    calculate(_ + _, "Apple", "hates me")

    def sum(a: Int, b: Int): Int = {
      a + b
    }

    def minus(a: Int, b: Int): Int = {
      a - b
    }

    calc((i: Int, j: Int) => {i + j}, 3, 6)
    calc((i, j) => i + j, 5, 6)
    calc(_ + _, 6, 6)
    calc(_ - _, 6, 6)

    println(List(1, 2, 3, 4).reduce(_ + _))


//    calc(sum, 12, 23)
//    calc(minus, 12, 23)
  }
}
