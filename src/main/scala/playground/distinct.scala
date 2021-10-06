package playground

object distinct {
    def main(args: Array[String]): Unit = {
        val list = List("lss", "chj", "lss", "chj", "chj")
        println(list.distinct)
        //List(lss, chj)
        //底层new mutable.HashSet[A]()，嘿嘿
        println(list.toSet.toList)
        //List(lss, chj)
    }
}
