package playground

object flattern {
    def main(args: Array[String]): Unit = {
        val list = List(List(1, 2), List(3, 4))
        val result1 = list.flatten
        val result2 = list.flatMap(
            k => {
                k.map(
                    v => {
                        v
                    }
                )
            }
        )
    }
}
