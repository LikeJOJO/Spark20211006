package transformation

import org.apache.spark.{SparkConf, SparkContext}

object flatMap {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val kiss = sc.makeRDD(List(List("chj", "ly"), List("sym"), List("lss", "lxy", "yjy")))
        kiss.flatMap(word => word).collect().foreach(println(_))
        println("***************")
        val like = sc.makeRDD(List(List("chj", "ly"), "sym", List("lss", "lxy", "yjy")))
        like.flatMap(
            k => {
                k match {
                    case list: List[_] => list
                    case _ => List(k)
                }
            }
        ).collect().foreach(println(_))
        sc.stop()
    }
}
