package transformation

import org.apache.spark.{SparkConf, SparkContext}

object mapPartitions {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val list = sc.makeRDD(List(1, 13, 5, 37, 29, 13, 15, 6, 18, 10, 24, 46, 38, 59, 31), 3)
        list.mapPartitions(
            k => {
                k.map(
                    t => {
                        t + 2
                    }
                )
            }
        ).collect.foreach(println(_))
        println("**************")
        // KISS List(k.max).iterator
        list.mapPartitions(
            k => {
                List(k.max).iterator
            }
        ).collect.foreach(println(_))

        sc.stop()
    }
}
