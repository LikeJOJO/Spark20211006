package playground

object zip {
    def main(args: Array[String]): Unit = {
        val list1 = List("lss", "chj", "lxy", "yjy", "dxy")
        val list2 = List(1, 3, 5)
        //取最短的链条哦
        println(list1.zip(list2))
        //List((lss,1), (chj,3), (lxy,5))
        println(list2.zip(list1))
        //List((1,lss), (3,chj), (5,lxy))
    }
}
