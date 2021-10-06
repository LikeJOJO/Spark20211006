package five

object YourKiss {
    def main(args: Array[String]): Unit = {
        val list = List(
            (("a", "+"), 10),
            (("b", "-"), 20),
            (("c", "*"), 30)
        )

        val list2 = List(
            List(("a", "+"), 10),
            List(("b", "-"), 20),
            List(("c", "*"), 30)
        )

        list.map(
            t => {
                (t._1._1, (t._1._2, t._2 * 2))
            }
        )

        val newList = list.map{
            case ((pre, item), cnt) => {
                (pre, (item, cnt * 2))
            }
        }

        val newList2 = list2.map{
            case List((pre, item), cnt) => {
                List(pre, (item, cnt))
            }
        }

        println(newList2)
    }
}
