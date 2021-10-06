package wordcount

import org.apache.spark.{SparkConf, SparkContext}

object accumulator3 {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val sum1 = sc.longAccumulator("sum1")
        //sc.register(sum1, "sum1")
        val like = sc.makeRDD(List(1, 2, 3, 4, 5, 6), 2)

        like.foreach(
            k => {
                sum1.add(k)
            }
        )
        println(sum1.value)

        val kiss = sc.makeRDD(List(("a", 2), ("b", 5), ("c", 3), ("b", 1), ("a", 9)))
        val sum2 = sc.longAccumulator("sum2")
        kiss.foreach {
            case (word, count) => {
                sum2.add(count)
            }
        }
        println(sum2.value)
        sc.stop()
    }

}
