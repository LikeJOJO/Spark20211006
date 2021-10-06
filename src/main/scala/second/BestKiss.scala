package second

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object BestKiss {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val list: RDD[(String, Int)] = sc.makeRDD(List(("a", 88), ("b", 95), ("a", 91), ("b", 93), ("a", 95), ("b", 98)), 2)

        val list1 = sc.makeRDD(List("sym yjy lxy", "lxy dxy ly sym sym", "ly gr chj chj chj chj", "dh yjy", "yjy chj yjy chj"))
        val list2 = sc.makeRDD(List(("sym yjy lxy", 3), ("lxy dxy ly sym sym", 2), ("ly gr chj chj chj chj", 3), ("dh yjy", 5), ("yjy chj yjy chj", 1)))

        // KISS 文本
        // KISS 对象

        list1.flatMap(
            k => {
                k.split(" ").map(
                    t => t
                )
            }
        )

        println("reduceByKey")
        list.reduceByKey(_+_).collect.foreach(println(_))
        //list.reduceByKey(_+_, 2).saveAsTextFile("output")
        println("groupByKey")
        list.groupByKey().map(
            k => {
                (k._1, k._2.sum)
            }
        ).collect.foreach(println(_))
//        list.aggregateByKey(Int.MaxValue)(
//            (x, y) => math.min(x, y),
//            (x, y) => x - y
//        ).collect.foreach(println(_))

//        list.aggregateByKey(0)(
//            (x, y) => x + y,
//            (x, y) => x + y
//        ).collect.foreach(println(_))
        println("foldByKey")
        list.foldByKey(0)(_ + _).collect.foreach(println(_))

//        list.combineByKey(
//            v => (v, 1),
//            (x, y) => {
//
//            }
//        )

        //        list.combineByKey(
//            (_, 1), //第一个v出现时，变成("a", (88, 1))
//            (acc: (Int, Int), v) => (acc._1 + v, acc._2 + 1),
//            (acc1: (Int, Int), acc2: (Int, Int)) => (acc1._1 + acc2._1, acc1._2 + acc2._2)
//        ).map{
//            case (key, (total, cnt)) => {
//                (key, total / cnt)
//            }
//        }.collect.foreach(println(_))

//        list.combineByKey(
//            (_, 1), //第一个v出现时，变成("a", (88, 1))
//            (acc: (Int, Int), v) => (acc._1 + v, acc._2 + 1),
//            (acc1: (Int, Int), acc2: (Int, Int)) => (acc1._1 + acc2._1, acc1._2 + acc2._2)
//        ).map(
//            k => {
//                (k._1, k._2._1/k._2._2)
//            }
//        )



        sc.stop()
    }
}
