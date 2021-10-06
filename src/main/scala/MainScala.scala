import scala.io.{Source, StdIn}
import scala.util.control.Breaks

object MainScala {
  def main(args: Array[String]): Unit = {
    def fun01(first: String, last: String, age: Int): String = {
      first + " " + last + " is " + age + " years old"
    }
    val lrn01 = fun01("y", "jy", 16)
    val lrn02 = fun01 _
    //println(lrn02("l", "rn", 18))

    def fun02(): String = {
      "Apple"
    }

    def fun03(): Unit = {

    }

    def fun04(f: () => String, g: () => Unit, h:(String, String, Int) => String): Unit = {

    }

    def fun05(f: () => String): Unit = {
println("Kiss her")
    }

    fun04(() => {"Facebook"}, () => {}, (i: String, j: String, k: Int) => {"Hello"})

    fun05(() => {"Google"})

    fun04(fun02 _, fun03 _, fun01 _)
    //fun04(() => {"Google"}, () => {}, (i: String, j: String, k: Int) => {})

    val lss01 = fun02
    val lss02 = fun02()
    val lss03 = fun02 _
    println(lss01)
    println(lss02)
    println(lss03)
//    val a1 = (a: Int, b: Int) => {
//      a + b
//    }
//    println(a1(3, 5))
//    val n = 13
//    var i = 0
//    Breaks.breakable(
//      while (i < n) {
//        i += 1
//        println(i)
//        if (i % 7 == 0) {
//          Breaks.break()
//        }
//      }
//    )

//    val a = new String("Apple")
//    val b = new String("Apple")
//    println(a == b)
//    val af: Unit = "love"
//    println(af)
//
//    var str1 = "MeltyKiss"
//    var i1 = 13
//    val str =
//      s"""
//        |I
//        |Do
//        |${str1.substring(0, 3)}
//        |${i1+3}
//        |""".stripMargin
//    println(str)
//
//    val str2 = StdIn.readLine()
//    val value = Source.fromFile("loveDatas/girl.txt").getLines()
//    val iterator = value.iterator
//    while (iterator.hasNext) {
//      println(iterator.next())
//    }
  }

}
