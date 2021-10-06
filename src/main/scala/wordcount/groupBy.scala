package wordcount

import org.apache.spark.{SparkConf, SparkContext}

object groupBy {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val kiss = sc.makeRDD(List("chj", "sym", "yjy", "chj", "lxy", "sym", "chj"), 2)
        kiss.groupBy(
            k => {
                k
            }
        ).map(
            t => {
                (t._1, t._2.size)
            }
        ).collect().foreach(println(_))

        sc.stop()
    }
}
