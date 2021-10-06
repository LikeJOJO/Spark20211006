package third

import scala.io.Source

object BestKiss {
    def main(args: Array[String]): Unit = {
        val source = Source.fromFile("/Users/apple/Downloads/test.txt")
        val list = source.getLines().toList
        source.close()

        val words = list.flatMap(_.split(" "))
        val wordGroupMap = words.groupBy(word => word)

        val wordCount = wordGroupMap.map(kv => {
            (kv._1, kv._2.size)
        })

        val sortList = wordCount.toList.sortBy(_._2)(Ordering.Int.reverse)
        val top3 = sortList.take(3)

        println(top3)

    }
}
