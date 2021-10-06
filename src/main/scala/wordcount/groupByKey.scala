package wordcount

import org.apache.spark.{SparkConf, SparkContext}

object groupByKey {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val kiss = sc.makeRDD(List("lss", "lxy", "dxy", "yjy", "ly", "sym", "chj", "ry", "sym", "ly", "ly"), 3)

        kiss.map((_, 1)).groupByKey().map(
            k => {
                (k._1, k._2.size)
            }
        ).collect().foreach(println(_))

//        val kiss = sc.makeRDD(List(("chj", 1), ("lss", 3), ("chj", 2), ("yjy", 5), ("chj", 9), ("dxy", 6), ("lss", 8)), 3)
//
//        kiss.groupByKey().map(
//            k => {
//                (k._1, k._2.size)
//            }
//        ).collect().foreach(println(_))
//        println("*********")
//        kiss.groupByKey().mapValues(
//            v => {
//                v.size
//            }
//        ).sortBy(_._2, true).collect().foreach(println(_))

        sc.stop()
    }
}
