package playground

object zipWithIndex {
    def main(args: Array[String]): Unit = {
        val list = List("lss", "chj", "lxy", "yjy", "dxy")
        println(list.zipWithIndex)
        //List((lss,0), (chj,1), (lxy,2), (yjy,3), (dxy,4))
    }
}
