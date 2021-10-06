package transformation

import org.apache.spark.{SparkConf, SparkContext}

class map {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)
        val files = sc.textFile("apple/apache.log")
        files.map(
            k => {
                val datas = k.split(" ")
                datas(6)
            }
        ).foreach(println(_))

        sc.stop()
    }
}
