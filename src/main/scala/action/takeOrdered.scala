package action

import org.apache.spark.{SparkConf, SparkContext}

object takeOrdered {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val list = sc.makeRDD(List("lss", "lxy", "dxy", "yjy", "ly", "sym", "chj", "ry", "sym", "ly", "ly"), 3)

        list.takeOrdered(3).foreach(println(_))
        println("************")
        list.takeOrdered(3)(Ordering.String.reverse).foreach(println(_))

        sc.stop()
    }
}
