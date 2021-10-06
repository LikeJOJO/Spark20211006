package dream

object sortByandsortWith {
    def main(args: Array[String]): Unit = {
        // KISS 元组的排序：默认按照元组的第一个元素排序，相同时按照第二个排序，以此类推
        val list = List((3, "yjy"), (1, "chj"), (2, "yjy"), (3, "lss"), (1, "ly"), (5, "yjy"), (1, "chj"))
        // KISS 升序
        list.sortBy(k => k).foreach(println(_))
        // KISS 降序
        list.sortBy(k => k)(Ordering.Tuple2(Ordering.Int.reverse, Ordering.String.reverse)).foreach(println(_))

        val girls = List(
            Beauty("yjy", 18, 86),
            Beauty("lxy", 19, 93),
            Beauty("ly", 16, 99),
            Beauty("ly", 15, 91),
            Beauty("chj", 18, 89),
            Beauty("lss", 20, 82),
        )
        // KISS 对于对象来说，可以用元组的方式来排序
        girls.sortBy(
            k => {
                (k.name, k.age, k.score)
            }
        )(Ordering.Tuple3(Ordering.String.reverse, Ordering.Int.reverse, Ordering.Int.reverse)).foreach(println(_))
        // KISS 自定义排序
        girls.sortWith(
            (left, right) => {
                if (left.name > right.name) {
                    true
                } else if (left.name < right.name) {
                    false
                } else {
                    if (left.age > right.age) {
                        true
                    } else if (left.age < right.age) {
                        false
                    } else {
                        left.score > right.score
                    }
                }
            }
        ).foreach(println(_))
    }

    case class Beauty(var name: String, var age: Int, var score: Int) {
        override def toString: String = {
            s"${name} is ${age} years old. She scored ${score} this time."
        }
    }
}
