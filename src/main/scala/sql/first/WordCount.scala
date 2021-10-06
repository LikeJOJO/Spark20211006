package first

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object WordCount {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("MeltyKiss")
        val sc = new SparkContext(sparkConf)

        val list = sc.makeRDD(List(("lss", "we"), ("lss", "98"), ("lss", "*&"), ("ly", "1"), ("ly", "love"), ("ly", "3"), ("ly", "%%")))
        list.reduceByKey(
            (x, y) => {
                x + y
            }
        ).collect().foreach(println(_))

        sc.stop()
    }

}
