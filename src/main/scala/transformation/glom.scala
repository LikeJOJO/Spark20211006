package transformation

import org.apache.spark.{SparkConf, SparkContext}

object glom {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val list = sc.makeRDD(List(1, 13, 5, 37, 29, 13, 15, 6, 18, 10, 24, 46, 38, 59, 31), 3)

        val result = list.mapPartitions(
            k => {
                List(k.max).iterator
            }
        ).sum()

        val result2 = list.glom().map(_.max).sum()

        println(result)
        println(result2)

        sc.stop()
    }
}
