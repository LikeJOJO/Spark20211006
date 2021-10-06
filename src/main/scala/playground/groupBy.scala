package playground

object groupBy {
    def main(args: Array[String]): Unit = {
        val list1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val list2 = List("sym", "chj", "yjy", "sym", "ly", "ly", "chj", "chj", "chj")

        val result1 = list1.groupBy(
            k => {
                if (k % 2 ==0) {
                    "1"
                } else {
                    "0"
                }
            }
        )

//        val result2 = list2.groupBy(
//            k => {
//                k
//            }
//        )
        val result2 = list2.groupBy(k => k)

        println(result1)
        println(result2)
    }
}
