package second

import org.apache.spark.{SparkConf, SparkContext}

object parctise {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

//        val rdd1 = sc.makeRDD(List(1, 3, 5, 7, 9))
//        val rdd2 = sc.makeRDD(List("yjy", "lxy", "lss", "dxy", "ly"))
//
//        rdd1.map(_ * 2).foreach(println(_))
//
//        println("*******************")
//
//        rdd2.map(_ + " ly").foreach(println(_))

        val files = sc.textFile("apple/apache.log")
        files.map(
            k => {
                val datas = k.split(" ")
                datas(6)
            }
        ).foreach(println(_))

        sc.stop()
    }
}
