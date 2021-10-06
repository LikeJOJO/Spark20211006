package practise

import org.apache.spark.{SparkConf, SparkContext}

object first {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val actionRDD = sc.textFile("apple/user_visit_action.txt")

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

        // KISS 懵了
        tuple.mapValues {
            case (x, y, z) => {
                var xSum = 0
                while(x.iterator.hasNext) {
                    xSum = x.iterator.next()
                }
                var ySum = 0
                while(y.iterator.hasNext) {
                    ySum = y.iterator.next()
                }
                var zSum = 0
                while(z.iterator.hasNext) {
                    zSum = z.iterator.next()
                }
                (xSum, ySum, zSum)
            }
        }.sortBy(k => k, false).take(10).foreach(println(_))

        sc.stop()
    }
}