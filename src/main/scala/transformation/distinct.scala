package transformation

import org.apache.spark.{SparkConf, SparkContext}

object distinct {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)
        val kiss = sc.makeRDD(List("chj", "lss", "chj", "yjy", "chj", "dxy", "lss"), 3)
        // KISS map(x => (x, null)).reduceByKey((x, _) => x, numPartitions).map(_._1)
        kiss.distinct().collect().foreach(println(_))
        sc.stop()
    }
}
