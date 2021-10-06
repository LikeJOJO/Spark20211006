package lss

import scala.util.control.Breaks

object FlyScala {
  def main(args: Array[String]): Unit = {
    def fun01(i: Int)(j: Int): Unit = {
      for (m <- 1 to i; n <- 1 to j) {
        println(m + " ~ " + n)
      }
    }
    //fun01(3)(5)
    def fun02(girls: String*) = {
      for (girl <- girls) {
        println(girl)
      }
    }
    fun02("lss", "lxy", "ly")
//    def love01(f: => Unit): Unit = {
//      f
//    }
//
//    love01(20)
//    love01("Apple")
//    love01(println("Apple"))
//    love01{
//      println("Apple")
//      println(1+5)
//    }
//
//    love01 {
//      for (i <- 1 to 5) {
//        println(i)
//      }
//    }
//
//    Breaks.breakable(
//      for (i <- 1 to 17) {
//        println("Num " + i)
//        if (i % 7 == 0) {
//          Breaks.break
//        }
//      }
//    )
  }
}
