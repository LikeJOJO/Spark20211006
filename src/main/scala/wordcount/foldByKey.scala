package wordcount

import org.apache.spark.{SparkConf, SparkContext}

object foldByKey {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val kiss = sc.makeRDD(List("lss", "lxy", "dxy", "yjy", "ly", "sym", "chj", "ry", "sym", "ly", "ly"), 3)

        kiss.map((_, 1)).foldByKey(0)(_ + _).collect().foreach(println(_))

        sc.stop()
    }
}
