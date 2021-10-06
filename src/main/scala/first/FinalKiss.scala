package first

import org.apache.spark.{SparkConf, SparkContext}

object FinalKiss {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        sc.makeRDD(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 3).saveAsTextFile("output")
        //part-00000(1, 2, 3)
        //part-00001(4, 5, 6)
        //part-00002(7, 8, 9, 10)
        sc.makeRDD(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 4).saveAsTextFile("output1")
        //part-00000(1, 2)
        //part-00001(3, 4, 5)
        //part-00002(6, 7)
        //part-00003(8, 9, 10)
        sc.makeRDD(List("lss", "lxy", "yjy", "dxy", "ly", "gongrong", "sym", "chj"), 2).saveAsTextFile("output3")
        //part-00000(lss, lxy, yjy, dxy)
        //part-00001(ly, gongrong, sym, chj)
        sc.makeRDD(List("lss", "lxy", "yjy", "dxy", "ly", "gongrong", "sym", "chj"), 3).saveAsTextFile("output4")
        //part-00000(lss, lxy)
        //part-00001(yjy, dxy, ly)
        //part-00002(gongrong, sym, chj)
        sc.stop()
    }
}
