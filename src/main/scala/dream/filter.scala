package dream

object filter {
    def main(args: Array[String]): Unit = {
        val list = List((3, "yjy"), (1, "chj"), (2, "yjy"), (3, "lss"), (1, "ly"), (5, "yjy"), (1, "chj"))

        val girls = List(
            Beauty("yjy", 18, 86),
            Beauty("lxy", 19, 93),
            Beauty("ly", 16, 99),
            Beauty("ly", 15, 91),
            Beauty("chj", 18, 89),
            Beauty("lss", 20, 82),
        )

        list.filter(
            k => {
                k._1 > 2
            }
        ).foreach(println(_))
        println("************")
        girls.filter(
            k => {
                k.name == "ly"
            }
        ).foreach(println(_))
    }

    case class Beauty(var name: String, var age: Int, var score: Int) {
        override def toString: String = {
            s"${name} is ${age} years old. She scored ${score} this time."
        }
    }
}
