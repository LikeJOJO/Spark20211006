package first

import org.apache.spark.{SparkConf, SparkContext}

object FirstKiss {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

//        val text = sc.textFile("apple/apache.log")
//        val result = text.map(_.split(" ")(6))
//        result.foreach(println(_))

        val lss = sc.makeRDD(List(1 ,2 ,3 ,4 ,5 ,6), 2)
        val result = lss.mapPartitions(
            list => {
                list.map(_ * 2)
            }
        )
        println(result)
        sc.stop()
    }
}
