package wordcount

import org.apache.spark.{SparkConf, SparkContext}

object combinByKey {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val kiss = sc.makeRDD(List("lss", "lxy", "dxy", "yjy", "ly", "sym", "chj", "ry", "sym", "ly", "ly"), 3)
        kiss.map((_, 1)).combineByKey(
            v => v,
            (v1:Int, v2) => {
                v1 + v2
            },
            (t1:Int, t2:Int) => {
                t1 + t2
            }
        ).collect.foreach(println)

        sc.stop()
    }
}
