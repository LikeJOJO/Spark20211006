package playground

import scala.io.Source

object wordcount01 {
    def main(args: Array[String]): Unit = {
        val file = Source.fromFile("apple/girl.txt")
        val lines = file.getLines().toList
        file.close()

        val flattenWords = lines.flatMap(
            k => {
                k.split(" ")
            }
        )

        val groupWords = flattenWords.groupBy(word => word)

        val result = groupWords.map(
            x => {
                (x._1, x._2.size)
            }
        ).toList.sortBy(_._2)(Ordering.Int.reverse).take(3)

        println(result)
    }
}
