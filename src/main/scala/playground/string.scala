package playground

object string {
    def main(args: Array[String]): Unit = {
        val str = "I give miss kiss. For the miss kiss you give me."
        println(str.split("[;,?| .]").toList.groupBy(k => k).map(x => (x._1, x._2.size)).toList.sortBy(_._2)(Ordering.Int.reverse))
    }
}
