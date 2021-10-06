package first

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

import scala.io.Source

object BestKiss {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[3]").setAppName("Apple")
        val sc : SparkContext = new SparkContext(sparkConf)

        sc.textFile("apple/brand.txt", 3).saveAsTextFile("output")
//        val rdd = sc.makeRDD(
//            List(1, 3, 5, 7, 9, 1, 3, 5, 7, 9)
//        )
//        val newRDD = rdd.map(_ * 2)
//        newRDD.collect().foreach(println(_))

//        val dataRDD = sc.makeRDD(List("Hello", "hive", "hbase", "Hadoop"))
//        val result = dataRDD.groupBy(
//            t => {
//                t.charAt(0)
//            }
//        )
//
//        println(result.collect())
        sc.stop()
    }
}
