package fuckyourself

import org.apache.spark.{SparkConf, SparkContext}

object FinalKiss {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val kiss = sc.makeRDD(List(1, 3, 5, 7, 9), 2)
        var sum = 0
        kiss.foreach(
            k => {
                sum += k
            }
        )
        println(sum)
        sc.stop()
    }
}
