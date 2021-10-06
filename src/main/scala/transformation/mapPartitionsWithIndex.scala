package transformation

import org.apache.spark.{SparkConf, SparkContext}

object mapPartitionsWithIndex {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val kiss = sc.makeRDD(List("chj", "lss", "lxy", "yjy", "ly", "dxy", "lss"), 3)
        //
        kiss.mapPartitionsWithIndex(
            (index, list) => {
                list.map((_, index))
            }
        ).collect().foreach(println(_))
        println("************")
        //获取第二个分区的数据
        // KISS List().iterator
        kiss.mapPartitionsWithIndex(
            (index, list) => {
                index match {
                    case 2 => list
                    case _ => List().iterator
                }
            }
        ).collect().foreach(println(_))
        sc.stop()
    }
}
