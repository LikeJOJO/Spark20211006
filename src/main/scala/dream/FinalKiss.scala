package dream

import org.apache.spark.storage.StorageLevel
import org.apache.spark.{SparkConf, SparkContext}

object FinalKiss {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val list1 = sc.makeRDD(List(1, 10, 5, 8, 9, 2, 4, 6, 8, 10, 13, 8, 16, 18, 19), 3)
        val list2 = sc.makeRDD(List("lss", "lxy", "dxy", "yjy", "ly", "sym", "chj", "ry", "sym", "ly", "ly"), 3)
        val list3 = sc.makeRDD(List(("lss", 3), ("sym", 1), ("yjy", 5), ("dxy", 7), ("lxy", 8), ("lss", 2), ("ly", 5), ("lxy", 2), ("yjy", 13)), 3)

        val kiss = list3.map(
            k => {
                println("#########")
                k
            }
        )

        kiss.collect().foreach(println(_))
        println("***********")
        kiss.collect().foreach(println(_))


        sc.stop()
    }
}
