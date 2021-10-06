package collection

object map {
    def main(args: Array[String]): Unit = {
        val map = Map(("lss", 1), ("yjy", 2), ("lxy", 3))

        for (kv <- map) {
            println(kv._1 + " " + kv._2)
        }
    }
}
