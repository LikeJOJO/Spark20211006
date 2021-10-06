package transformation

import org.apache.spark.{SparkConf, SparkContext}

object filter {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val file = sc.textFile("apple/apache.log")
        file.filter(
            line => {
                line.split(" ")(3).startsWith("17/05/2015")
            }
        ).collect().foreach(println(_))

        sc.stop()
    }
}
