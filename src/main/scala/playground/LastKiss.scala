package playground

import scala.io.Source

object LastKiss {
    def main(args: Array[String]): Unit = {
        val source = Source.fromFile("love/word.txt")
        val list = source.getLines().toList
        source.close()

        val words = list.flatMap(
            k => {
                k.split(" ")
            }
        ).groupBy(word => word).map(
            n => {
                (n._1, n._2.size)
            }
        ).toList.sortBy(_._2)(Ordering.Int.reverse).take(3)

        println(words)
    }
}
