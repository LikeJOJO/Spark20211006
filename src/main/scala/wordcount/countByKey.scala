package wordcount

import org.apache.spark.{SparkConf, SparkContext}

object countByKey {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val kiss = sc.makeRDD(List("lss", "lxy", "dxy", "yjy", "ly", "sym", "chj", "ry", "sym", "ly", "ly"), 3)
        kiss.map((_, 1)).countByKey().foreach(println(_))
        println("**************")
        kiss.countByValue().foreach(println(_))

        sc.stop()
    }
}
