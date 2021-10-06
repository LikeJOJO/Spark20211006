package second

import org.apache.spark.{SparkConf, SparkContext}

object apacheTest {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val file = sc.textFile("apple/apache.log")
        file.map(
            lines => {
                val line = lines.split(" ")
                (line(3).substring(11, 13), 1)
            }
        ).reduceByKey(_ + _).collect().foreach(println(_))
        println("***********")
        file.map(
            lines => {
                val line = lines.split(" ")
                (line(3).substring(11, 13), 1)
            }
        ).groupByKey().map(
            k => {
                (k._1, k._2.size)
            }
        ).collect().foreach(println(_))
        println("***********")
        file.map(
            lines => {
                val line = lines.split(" ")
                (line(3).substring(11, 13), 1)
            }
        ).groupByKey().mapValues(
            k => {
                k.size
            }
        ).collect().foreach(println(_))

        sc.stop()
    }
}
