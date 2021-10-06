package first

import scala.collection.{immutable, mutable}
import scala.collection.mutable.ArrayBuffer

object LastKiss {
  def main(args: Array[String]): Unit = {
    val set = mutable.Set(1, 3, 5, 7, 9)
    set.update(1, true)
    println(set)
  }
}


