package practise

import org.apache.spark.{SparkConf, SparkContext}

object third {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val file = sc.textFile("apple/user_visit_action.txt")
        file.cache()

        val clickCount = file.filter(
            line => {
                line.split("_")(6) != "-1"
            }
        ).map(
            line => {
                (line.split("_")(6), 1)
            }
        ).reduceByKey(_ + _)

        val orderCount = file.filter(
            line => {
                line.split("_")(8) != "null"
            }
        ).flatMap(
            line => {
                line.split("_")(8).split(",").map(
                    k => {
                        (k, 1)
                    }
                )
            }
        ).reduceByKey(_ + _)

        val payCount = file.filter(
            line => {
                line.split("_")(10) != "null"
            }
        ).flatMap(
            line => {
                line.split("_")(10).split(",").map(
                    k => {
                        (k, 1)
                    }
                )
            }
        ).reduceByKey(_ + _)

        val group = clickCount.cogroup(orderCount, payCount)

        group.mapValues(
            k => {
                (k._1.sum, k._2.sum, k._3.sum)
            }
        ).sortBy(t => {
            t._2
        }, false).take(10).foreach(println(_))

        sc.stop()
    }
}
