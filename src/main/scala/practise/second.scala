package practise

import org.apache.spark.{SparkConf, SparkContext}

object second {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val actionRDD = sc.textFile("apple/user_visit_action.txt")
        actionRDD.cache()

        // KISS Click Data
        val clickData = actionRDD.filter(
            line => line.split("_")(6) != "-1"
        )

        val clickCount = clickData.map(
            line => {
                (line.split("_")(6), 1)
            }
        ).reduceByKey(_ + _)

        // LIKE Order Data
        val orderData = actionRDD.filter(
            line => line.split("_")(8) != "null"
        )

        val orderCount = orderData.flatMap(
            line => {
                line.split("_")(8).split(",").map(
                    k => (k, 1)
                )
            }
        ).reduceByKey(_ + _)

        // KISS Payment
        val payData = actionRDD.filter(
            line => line.split("_")(10) != "null"
        )

        val payCount = payData.flatMap(
            line => {
                line.split("_")(10).split(",").map(
                    k => (k, 1)
                )
            }
        ).reduceByKey(_ + _)

        // LIKE 这个操作有些意想不到
        val tuple = clickCount.cogroup(orderCount, payCount)

        tuple.mapValues {
            case (x, y, z) => {
                (x.sum, y.sum, z.sum)
            }
        }.sortBy(k => k._2, false).take(10).foreach(println(_))

        sc.stop()
    }
}