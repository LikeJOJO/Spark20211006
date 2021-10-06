package fourth

object BestKiss {
    def main(args: Array[String]): Unit = {
        val datas = List(
            ("hello", 4),
            ("hello spark", 3),
            ("hello spark scala", 2),
            ("hello spark scala hive", 1)
        ).map(x => {
            (x._1.split(" "), x._2)
        }).map(y => {
            y._1.map(z => {
                (z, y._2)
            })
        })
        println(datas)
    }
}
