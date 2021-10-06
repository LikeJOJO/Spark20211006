package practise

import org.apache.spark.util.AccumulatorV2
import org.apache.spark.{SparkConf, SparkContext}

object five {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val list = sc.makeRDD(List(1, 3, 5, 7, 9))
        val list2 = List(1, 3, 5, 7, 9)

        sc.stop()
    }

}
