package third

object NeverKiss {
    def main(args: Array[String]): Unit = {
        val list1 = List(
            List(1,2),
            List(3,4)
        )
        println("flatMap =>" + list1.flatMap(list=>list))
    }
}
