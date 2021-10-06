package transformation

import org.apache.spark.{SparkConf, SparkContext}

object sample {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val kiss = sc.makeRDD(1 to 20)
        kiss.sample(false, 0.3).collect.foreach(println(_))
        println("*********** 0.3")
        kiss.sample(false, 0.0).collect.foreach(println(_))
        println("*********** 0.0")
        kiss.sample(false, 0.9).collect.foreach(println(_))
        println("*********** 0.9")
        kiss.sample(false, 1.0).collect.foreach(println(_))
        println("*********** 1.0")
        sc.stop()
    }
}
