package playground

object sortBy {
    def main(args: Array[String]): Unit = {
        val list = List(11, 3, 5, 25, 23, 6)
        //按照数字大小排序
        println(list.sortBy(k => k)(Ordering.Int.reverse))
        //List(25, 23, 11, 6, 5, 3)
        //按照数字表示的字符串排序
        val result2 = list.sortBy(
            v => {
                //v + ""
                v.toString
            }
        )(Ordering.String.reverse)
        println(result2)
        //List(6, 5, 3, 25, 23, 11)
        val list3 = List(("lss", 18), ("dxy", 17), ("chj", 16), ("ly", 17), ("yjy", 19), ("sym", 20))
        println(list3.sortBy(t => t)(Ordering.Tuple2(Ordering.String.reverse, Ordering.Int)))
        //List((yjy,19), (sym,20), (ly,17), (lss,18), (dxy,17), (chj,16))
        println(list3.sortBy(_._1))
        //List((chj,16), (dxy,17), (lss,18), (ly,17), (sym,20), (yjy,19))
        println(list3.sortBy(_._2))
        //List((chj,16), (dxy,17), (ly,17), (lss,18), (yjy,19), (sym,20))

        val list4 = List(
            Beauty("lss", 18),
            Beauty("lxy", 16),
            Beauty("yjy", 17),
            Beauty("chj", 17),
            Beauty("dxy", 19),
        )

        val result = list4.sortBy(
            k => {
                k.age
            }
        )

        println(result)
    }
}
