package transformation

import org.apache.spark.{SparkConf, SparkContext}

object aggregateByKey {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)
        val kiss = sc.makeRDD(List(("chj", 1), ("lss", 3), ("chj", 2), ("yjy", 5), ("chj", 9), ("dxy", 6), ("lss", 8)), 3)
        kiss.aggregateByKey(0)(
            (x: Int, y: Int) => {
                math.max(x, y)
            },
            (x: Int, y: Int) => {
                x + y
            }
        ).collect.foreach(println)
        sc.stop()
    }
}
