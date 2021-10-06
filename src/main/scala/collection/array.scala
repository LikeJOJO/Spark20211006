package collection

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object array {
    def main(args: Array[String]): Unit = {
        var arr1 = new Array[String](5)
        arr1(0) = "lss"
        arr1(1) = "yjy"
        arr1(2) = "ly"

        var arr2 = new ArrayBuffer[String]()
        arr2.append("lss")
        arr2.append("yjy")
        arr2.append("ly")

        arr2.foreach(println(_))

    }
}
