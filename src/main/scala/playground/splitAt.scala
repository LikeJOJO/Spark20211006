package playground

object splitAt {
    def main(args: Array[String]): Unit = {
        val list = List("lss", "chj", "lxy", "yjy", "dxy", "ly", "sym")
        println(list.splitAt(2))
        //(List(lss, chj),List(lxy, yjy, dxy, ly, sym))
        println(list.splitAt(3))
        //(List(lss, chj, lxy),List(yjy, dxy, ly, sym))
    }
}
