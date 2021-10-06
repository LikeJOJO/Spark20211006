package third

object Exam2 {
    def main(args: Array[String]): Unit = {
        val datas = List(
            ("hello", 4),
            ("hello spark", 3),
            ("hello spark scala", 2),
            ("hello spark scala hive", 1)
        )
        val wordsArrayMap = datas.map(s => {
            List(s._1).flatMap(_.split(" ")).groupBy(word => word).map(kv => (kv._1, kv._2.size * s._2))
        }).flatten.groupBy(_._1).map(s => (s._1, s._2.map(_._2))).map(n => (n._1, n._2.sum)).toList.sortBy(_._2)(Ordering.Int.reverse).take(3)
        println(wordsArrayMap)
    }
}
